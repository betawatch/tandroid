// default package

import android.app.KeyguardManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.security.keystore.KeyGenParameterSpec;
import android.security.keystore.UserNotAuthenticatedException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Base64;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.security.KeyStore;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONObject;
import org.telegram.messenger.voip.CallAudioDevice;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class k35 {
    public static final Object g = new Object();
    public static final HashMap h = new HashMap();
    public static final ExecutorService i = Executors.newSingleThreadExecutor(new y20((byte) 3));
    public static final CopyOnWriteArrayList j = new CopyOnWriteArrayList();
    public final Context a;
    public final int b;
    public final String c;
    public final File d;
    public final String e;
    public volatile Exception f;

    public k35(int i2, Context context, String str) {
        if (context == null || str == null || str.isEmpty()) {
            lq5.j("context/address");
            throw null;
        }
        Context applicationContext = context.getApplicationContext();
        context = applicationContext != null ? applicationContext : context;
        this.a = context;
        this.b = i2;
        this.c = str;
        try {
            String p = p(MessageDigest.getInstance("SHA-256").digest(str.getBytes(StandardCharsets.UTF_8)));
            this.d = new File(new File(context.getNoBackupFilesDir(), "gramwallets"), p.concat(".json"));
            this.e = qd4.y("gramwallet_v2_", p, "_");
        } catch (Exception e) {
            vr9.l(e);
            throw null;
        }
    }

    public static synchronized void A(a25 a25Var) {
        synchronized (k35.class) {
            Iterator it = j.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                Runnable runnable = (Runnable) weakReference.get();
                if (runnable == null || runnable == a25Var) {
                    j.remove(weakReference);
                }
            }
        }
    }

    public static byte[] B(String str) {
        if (str == null || str.length() % 2 != 0) {
            su3.e("hex length");
            return null;
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = i2 << 1;
            int digit = Character.digit(str.charAt(i3), 16);
            int digit2 = Character.digit(str.charAt(i3 + 1), 16);
            if (digit < 0 || digit2 < 0) {
                su3.e("hex digit");
                return null;
            }
            bArr[i2] = (byte) ((digit << 4) | digit2);
        }
        return bArr;
    }

    public static boolean i(Context context) {
        String str;
        if (context != null && (str = xea.r) != null && str.length() != 0) {
            try {
                KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService("keyguard");
                if (keyguardManager != null) {
                    if (keyguardManager.isDeviceSecure()) {
                        return true;
                    }
                }
            } catch (Exception e) {
                cc4.g(e, true);
            }
        }
        return false;
    }

    public static ArrayList o(Context context, long j2) {
        ArrayList arrayList;
        synchronized (g) {
            arrayList = new ArrayList();
            File[] listFiles = new File(context.getNoBackupFilesDir(), "gramwallets").listFiles();
            if (listFiles != null) {
                for (File file : listFiles) {
                    if (file.getName().endsWith(".json")) {
                        try {
                            JSONObject jSONObject = new JSONObject(new String(x(file), StandardCharsets.UTF_8));
                            String string = jSONObject.getString("address");
                            k35 k35Var = new k35(0, context, string);
                            if (k35Var.d.equals(file)) {
                                j35 v = k35Var.v(jSONObject);
                                if (v.d == j2 && !((LinkedHashMap) v.e).isEmpty()) {
                                    arrayList.add(string);
                                }
                            }
                        } catch (Exception e) {
                            cc4.g(e, true);
                        }
                    }
                }
            }
            File[] listFiles2 = new File(context.getApplicationInfo().dataDir, "shared_prefs").listFiles();
            if (listFiles2 != null) {
                for (File file2 : listFiles2) {
                    String name = file2.getName();
                    int i2 = name.endsWith(".xml.bak") ? 8 : name.endsWith(".xml") ? 4 : 0;
                    if (name.startsWith("gramwallet_") && i2 != 0) {
                        String substring = name.substring(11, name.length() - i2);
                        try {
                            k35 k35Var2 = new k35(0, context, substring);
                            if (!k35Var2.d.exists()) {
                                j35 s = k35Var2.s();
                                if (s.d == j2 && !((LinkedHashMap) s.e).isEmpty() && !arrayList.contains(substring)) {
                                    arrayList.add(substring);
                                }
                            }
                        } catch (Exception e2) {
                            cc4.g(e2, true);
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    public static String p(byte[] bArr) {
        char[] cArr = new char[bArr.length << 1];
        char[] cArr2 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        for (int i2 = 0; i2 < bArr.length; i2++) {
            int i3 = i2 << 1;
            byte b = bArr[i2];
            cArr[i3] = cArr2[(b & 255) >>> 4];
            cArr[i3 + 1] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    public static boolean u(Exception exc) {
        for (Exception exc2 = exc; exc2 != null; exc2 = exc2.getCause()) {
            if (exc2 instanceof UserNotAuthenticatedException) {
                return true;
            }
        }
        return false;
    }

    public static byte[] x(File file) {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byte[] bArr = new byte[TLObject.FLAG_12];
                while (true) {
                    int read = fileInputStream.read(bArr);
                    if (read == -1) {
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        byteArrayOutputStream.close();
                        fileInputStream.close();
                        return byteArray;
                    }
                    if (byteArrayOutputStream.size() + read > 4194304) {
                        throw new IOException("wallet too large");
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                }
            } finally {
            }
        } catch (Throwable th) {
            try {
                fileInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static boolean z(j35 j35Var, String str) {
        Iterator it = ((LinkedHashMap) j35Var.e).values().iterator();
        while (it.hasNext()) {
            if (str.equals(((JSONObject) it.next()).optString("alias"))) {
                return true;
            }
        }
        return false;
    }

    public final void C() {
        synchronized (g) {
            HashMap hashMap = h;
            File file = this.d;
            hashMap.put(file.getAbsolutePath(), Long.valueOf(l() + 1));
            hl.c3(new qu2(file.getAbsolutePath(), (byte) 6));
            try {
                this.f = null;
                j35 j35Var = new j35();
                j35Var.b = i(this.a);
                w(j35Var, new LinkedHashMap());
                d(j35Var);
            } catch (Exception e) {
                m(e);
            }
        }
    }

    public final byte[] a(j35 j35Var, String str) {
        return ("GramWallet:2\n" + this.c + "\n" + j35Var.d + "\n" + str + "\n" + j35Var.b).getBytes(StandardCharsets.UTF_8);
    }

    public final void b(long j2, boolean z) {
        String str;
        rj4 rj4Var;
        Object obj = g;
        synchronized (obj) {
            c(j2);
        }
        String absolutePath = this.d.getAbsolutePath();
        i02 i02Var = new i02((Object) this, j2, (byte) 7);
        p35 p35Var = new p35();
        p35Var.d = absolutePath;
        byte b = 23;
        hl.c3(new ds6(p35Var, i02Var, z, b));
        try {
            if (p35Var.a.await(90L, TimeUnit.SECONDS)) {
                str = p35Var.c;
                p35Var.b = true;
                rj4Var = new rj4(p35Var, b);
            } else {
                str = "AUTH_TIMEOUT";
                p35Var.b = true;
                rj4Var = new rj4(p35Var, b);
            }
            hl.c3(rj4Var);
            synchronized (obj) {
                c(j2);
            }
            if (str != null) {
                throw new i35(str);
            }
        } catch (Throwable th) {
            p35Var.b = true;
            hl.c3(new rj4(p35Var, b));
            throw th;
        }
    }

    public final void c(long j2) {
        if (j2 != l()) {
            throw new i35("STORAGE_CANCELED");
        }
    }

    public final void d(j35 j35Var) {
        String str = this.c;
        try {
            FileDescriptor open = Os.open(this.d.getParent(), OsConstants.O_RDONLY, 0);
            try {
                Os.fsync(open);
                Os.close(open);
                KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                keyStore.load(null);
                Enumeration<String> aliases = keyStore.aliases();
                while (aliases.hasMoreElements()) {
                    String nextElement = aliases.nextElement();
                    if (nextElement.startsWith(this.e) && !z(j35Var, nextElement)) {
                        keyStore.deleteEntry(nextElement);
                    }
                }
                if (j35Var.c) {
                    return;
                }
                if (!r().edit().clear().commit()) {
                    throw new IOException("legacy cleanup");
                }
                keyStore.deleteEntry("gramwallet_free_" + str);
                keyStore.deleteEntry("gramwallet_lock_" + str);
            } catch (Throwable th) {
                Os.close(open);
                throw th;
            }
        } catch (Exception e) {
            m(e);
        }
    }

    public final void e(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        synchronized (g) {
            try {
                j35 s = s();
                KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                keyStore.load(null);
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    String str = (String) obj;
                    if (!z(s, str)) {
                        keyStore.deleteEntry(str);
                    }
                }
            } catch (Exception e) {
                m(e);
            }
        }
    }

    public final boolean f(byte[] bArr) {
        boolean containsKey;
        if (bArr == null || bArr.length == 0) {
            return false;
        }
        synchronized (g) {
            try {
                containsKey = ((LinkedHashMap) s().e).containsKey(p(bArr));
            } catch (Exception e) {
                this.m(e);
                return false;
            }
        }
        return containsKey;
    }

    public final byte[] g(j35 j35Var, String str) {
        Key key;
        JSONObject jSONObject = (JSONObject) ((LinkedHashMap) j35Var.e).get(str);
        if (jSONObject == null) {
            su3.e("record missing");
            return null;
        }
        if (!jSONObject.optBoolean(CallAudioDevice.NAME_LEGACY, false)) {
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(2, y(jSONObject), new GCMParameterSpec(128, Base64.decode(jSONObject.getString("iv"), 2)));
            cipher.updateAAD(a(j35Var, str));
            return cipher.doFinal(Base64.decode(jSONObject.getString("ciphertext"), 2));
        }
        String string = r().getString("swkey", null);
        if (string != null) {
            key = new SecretKeySpec(Base64.decode(string, 2), "AES");
        } else {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            Key key2 = keyStore.getKey((j35Var.b ? "gramwallet_lock_" : "gramwallet_free_") + this.c, null);
            if (!(key2 instanceof SecretKey)) {
                su3.e("legacy key missing");
                return null;
            }
            key = (SecretKey) key2;
        }
        Cipher cipher2 = Cipher.getInstance("AES/CBC/PKCS7Padding");
        cipher2.init(2, key, new IvParameterSpec(B(jSONObject.getString("iv"))));
        return cipher2.doFinal(B(jSONObject.getString("ciphertext")));
    }

    public final c35 h(j35 j35Var, String str, long j2) {
        byte[] g2;
        try {
            g2 = g(j35Var, str);
        } catch (Exception e) {
            if (!j35Var.b || !u(e)) {
                throw e;
            }
            this.b(j2, false);
            try {
                g2 = this.g(j35Var, str);
            } catch (Exception e2) {
                if (!u(e2)) {
                    throw e2;
                }
                this.b(j2, true);
                g2 = this.g(j35Var, str);
            }
        }
        try {
            return new c35(g2);
        } finally {
            Arrays.fill(g2, (byte) 0);
        }
    }

    public final JSONObject j(j35 j35Var, String str, c35 c35Var, ArrayList arrayList, long j2) {
        Cipher k;
        String str2 = this.e + UUID.randomUUID();
        arrayList.add(str2);
        JSONObject put = new JSONObject().put("alias", str2);
        KeyGenParameterSpec.Builder userAuthenticationRequired = new KeyGenParameterSpec.Builder(str2, 3).setKeySize(256).setBlockModes("GCM").setEncryptionPaddings("NoPadding").setUserAuthenticationRequired(j35Var.b);
        if (j35Var.b) {
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 30) {
                userAuthenticationRequired.setUserAuthenticationParameters(30, 3);
            } else {
                userAuthenticationRequired.setUserAuthenticationValidityDurationSeconds(30);
            }
            if (i2 >= 24) {
                userAuthenticationRequired.setInvalidatedByBiometricEnrollment(false);
            }
        }
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
        keyGenerator.init(userAuthenticationRequired.build());
        keyGenerator.generateKey();
        try {
            k = k(j35Var, str, put);
        } catch (Exception e) {
            if (!j35Var.b || !u(e)) {
                throw e;
            }
            this.b(j2, false);
            try {
                k = this.k(j35Var, str, put);
            } catch (Exception e2) {
                if (!u(e2)) {
                    throw e2;
                }
                this.b(j2, true);
                k = this.k(j35Var, str, put);
            }
        }
        byte[] c = c35Var.c();
        try {
            put.put("ciphertext", Base64.encodeToString(k.doFinal(c), 2));
            put.put("iv", Base64.encodeToString(k.getIV(), 2));
            return put;
        } finally {
            Arrays.fill(c, (byte) 0);
        }
    }

    public final Cipher k(j35 j35Var, String str, JSONObject jSONObject) {
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        cipher.init(1, y(jSONObject));
        cipher.updateAAD(a(j35Var, str));
        return cipher;
    }

    public final long l() {
        long longValue;
        synchronized (g) {
            Long l = (Long) h.get(this.d.getAbsolutePath());
            longValue = l == null ? 0L : l.longValue();
        }
        return longValue;
    }

    public final void m(Exception exc) {
        this.f = exc;
        cc4.g(exc, true);
    }

    public final byte[][] n() {
        byte[][] bArr;
        synchronized (g) {
            try {
                ArrayList arrayList = new ArrayList();
                Iterator it = ((LinkedHashMap) s().e).keySet().iterator();
                while (it.hasNext()) {
                    arrayList.add(B((String) it.next()));
                }
                bArr = (byte[][]) arrayList.toArray(new byte[0][]);
            } catch (Exception e) {
                m(e);
                return new byte[0][];
            }
        }
        return bArr;
    }

    public final void q(long j2, byte[] bArr, c35 c35Var, pcc pccVar) {
        i.execute(new h35(this, bArr == null ? "" : p(bArr), c35Var == null ? null : c35Var.b(), l(), j2, pccVar));
    }

    public final SharedPreferences r() {
        return this.a.getSharedPreferences("gramwallet_" + this.c, 0);
    }

    public final j35 s() {
        File file = this.d;
        if (file.exists()) {
            return v(new JSONObject(new String(x(file), StandardCharsets.UTF_8)));
        }
        j35 j35Var = new j35();
        SharedPreferences r = r();
        j35Var.b = r.getBoolean("locked", i(this.a));
        j35Var.d = r.getLong("userId", 0L);
        j35Var.a = r.getInt("lastUsageDate", 0);
        if (!r.contains("phrase")) {
            return j35Var;
        }
        String p = p(B(r.getString("pubkey", "")));
        if (p.isEmpty()) {
            su3.e("legacy public key missing");
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(CallAudioDevice.NAME_LEGACY, true);
        jSONObject.put("ciphertext", r.getString("phrase", null));
        jSONObject.put("iv", r.getString("iv", null));
        ((LinkedHashMap) j35Var.e).put(p, jSONObject);
        j35Var.c = true;
        return j35Var;
    }

    public final void t(j35 j35Var, String str, LinkedHashMap linkedHashMap, ArrayList arrayList, long j2) {
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) j35Var.e;
        ArrayList arrayList2 = new ArrayList(linkedHashMap2.keySet());
        int size = arrayList2.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList2.get(i2);
            i2++;
            String str2 = (String) obj;
            if (!str2.equals(str) && ((JSONObject) linkedHashMap2.get(str2)).optBoolean(CallAudioDevice.NAME_LEGACY, false)) {
                c35 h2 = h(j35Var, str2, j2);
                linkedHashMap.put(str2, h2);
                linkedHashMap2.put(str2, j(j35Var, str2, h2, arrayList, j2));
            }
        }
        j35Var.c = false;
    }

    public final j35 v(JSONObject jSONObject) {
        if (jSONObject.getInt("version") == 2) {
            if (this.c.equals(jSONObject.getString("address"))) {
                j35 j35Var = new j35();
                j35Var.d = jSONObject.getLong("userId");
                j35Var.a = jSONObject.getInt("lastUsage");
                j35Var.b = jSONObject.getBoolean("locked");
                JSONObject jSONObject2 = jSONObject.getJSONObject("records");
                Iterator<String> keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    if (next.isEmpty() || !next.equals(p(B(next)))) {
                        su3.e("public key encoding");
                        return null;
                    }
                    JSONObject jSONObject3 = jSONObject2.getJSONObject(next);
                    ((LinkedHashMap) j35Var.e).put(next, jSONObject3);
                    j35Var.c |= jSONObject3.optBoolean(CallAudioDevice.NAME_LEGACY, false);
                }
                return j35Var;
            }
        }
        su3.e("wallet format/address");
        return null;
    }

    public final void w(j35 j35Var, LinkedHashMap linkedHashMap) {
        File file = this.d;
        File parentFile = file.getParentFile();
        if (!parentFile.isDirectory() && !parentFile.mkdirs()) {
            su3.e("wallet directory");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : ((LinkedHashMap) j35Var.e).entrySet()) {
            jSONObject.put((String) entry.getKey(), entry.getValue());
        }
        String jSONObject2 = new JSONObject().put("version", 2).put("address", this.c).put("userId", j35Var.d).put("lastUsage", j35Var.a).put("locked", j35Var.b).put("records", jSONObject).toString();
        Charset charset = StandardCharsets.UTF_8;
        byte[] bytes = jSONObject2.getBytes(charset);
        if (bytes.length > 4194304) {
            su3.e("wallet too large");
            return;
        }
        File file2 = new File(parentFile, file.getName() + ".pending");
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            try {
                fileOutputStream.write(bytes);
                fileOutputStream.flush();
                fileOutputStream.getFD().sync();
                fileOutputStream.close();
                byte[] x = x(file2);
                if (!Arrays.equals(bytes, x)) {
                    throw new IOException("wallet read-back mismatch");
                }
                j35 v = v(new JSONObject(new String(x, charset)));
                for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                    byte[] c = ((c35) entry2.getValue()).c();
                    byte[] bArr = null;
                    try {
                        bArr = g(v, (String) entry2.getKey());
                        if (!MessageDigest.isEqual(c, bArr)) {
                            throw new IOException("wallet decryption mismatch");
                        }
                        Arrays.fill(c, (byte) 0);
                        if (bArr != null) {
                            Arrays.fill(bArr, (byte) 0);
                        }
                    } catch (Throwable th) {
                        Arrays.fill(c, (byte) 0);
                        if (bArr != null) {
                            Arrays.fill(bArr, (byte) 0);
                        }
                        throw th;
                    }
                }
                Os.rename(file2.getAbsolutePath(), file.getAbsolutePath());
                hl.c3(new jm3((byte) 11));
            } finally {
            }
        } finally {
            if (file2.exists() && !file2.delete()) {
                cc4.g(new IOException("wallet staging cleanup"), true);
            }
        }
    }

    public final SecretKey y(JSONObject jSONObject) {
        String string = jSONObject.getString("alias");
        if (!string.startsWith(this.e)) {
            su3.e("key alias outside wallet");
            return null;
        }
        KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
        keyStore.load(null);
        Key key = keyStore.getKey(string, null);
        if (key == null) {
            su3.e("keystore key missing");
            return null;
        }
        if (!jSONObject.has("wrappedKey")) {
            if (key instanceof SecretKey) {
                return (SecretKey) key;
            }
            su3.e("keystore key type");
            return null;
        }
        Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
        cipher.init(2, key);
        byte[] doFinal = cipher.doFinal(Base64.decode(jSONObject.getString("wrappedKey"), 2));
        try {
            if (doFinal.length == 32) {
                return new SecretKeySpec(doFinal, "AES");
            }
            throw new IOException("wrapped key length");
        } finally {
            Arrays.fill(doFinal, (byte) 0);
        }
    }
}
