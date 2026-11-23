package org.telegram.ui.Wallet;

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
import org.telegram.messenger.cz;
import org.telegram.messenger.y10;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.qw0;
import org.telegram.ui.b80;
import org.telegram.ui.cd0;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public final class z0 {
    public static final Object g = new Object();
    public static final HashMap h = new HashMap();
    public static final ExecutorService i = Executors.newSingleThreadExecutor(new ai.z0(4));
    public static final CopyOnWriteArrayList j = new CopyOnWriteArrayList();
    public final Context a;
    public final int b;
    public final String c;
    public final File d;
    public final String e;
    public volatile Exception f;

    public z0(int i7, Context context, String str) {
        if (context == null || str == null || str.isEmpty()) {
            throw new IllegalArgumentException("context/address");
        }
        Context applicationContext = context.getApplicationContext();
        context = applicationContext != null ? applicationContext : context;
        this.a = context;
        this.b = i7;
        this.c = str;
        try {
            String p10 = p(MessageDigest.getInstance("SHA-256").digest(str.getBytes(StandardCharsets.UTF_8)));
            this.d = new File(new File(context.getNoBackupFilesDir(), "gramwallets"), p10.concat(".json"));
            this.e = a8.p0.p("gramwallet_v2_", p10, "_");
        } catch (Exception e10) {
            throw new IllegalStateException(e10);
        }
    }

    public static synchronized void A(Runnable runnable) {
        synchronized (z0.class) {
            Iterator it = j.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                Runnable runnable2 = (Runnable) weakReference.get();
                if (runnable2 == null || runnable2 == runnable) {
                    j.remove(weakReference);
                }
            }
        }
    }

    public static byte[] B(String str) {
        if (str == null || str.length() % 2 != 0) {
            throw new IOException("hex length");
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i7 = 0; i7 < length; i7++) {
            int i10 = i7 * 2;
            int digit = Character.digit(str.charAt(i10), 16);
            int digit2 = Character.digit(str.charAt(i10 + 1), 16);
            if (digit < 0 || digit2 < 0) {
                throw new IOException("hex digit");
            }
            bArr[i7] = (byte) (digit2 | (digit << 4));
        }
        return bArr;
    }

    public static boolean i(Context context) {
        String str;
        if (context != null && (str = cz.s) != null && str.length() != 0) {
            try {
                KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService("keyguard");
                if (keyguardManager != null) {
                    if (keyguardManager.isDeviceSecure()) {
                        return true;
                    }
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
        return false;
    }

    public static ArrayList o(Context context, long j3) {
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
                            z0 z0Var = new z0(0, context, string);
                            if (z0Var.d.equals(file)) {
                                qw0 v = z0Var.v(jSONObject);
                                if (v.a == j3 && !((LinkedHashMap) v.e).isEmpty()) {
                                    arrayList.add(string);
                                }
                            }
                        } catch (Exception e10) {
                            org.telegram.messenger.a8.g(e10, true);
                        }
                    }
                }
            }
            File[] listFiles2 = new File(context.getApplicationInfo().dataDir, "shared_prefs").listFiles();
            if (listFiles2 != null) {
                for (File file2 : listFiles2) {
                    String name = file2.getName();
                    int i7 = name.endsWith(".xml.bak") ? 8 : name.endsWith(".xml") ? 4 : 0;
                    if (name.startsWith("gramwallet_") && i7 != 0) {
                        String substring = name.substring(11, name.length() - i7);
                        try {
                            z0 z0Var2 = new z0(0, context, substring);
                            if (!z0Var2.d.exists()) {
                                qw0 s5 = z0Var2.s();
                                if (s5.a == j3 && !((LinkedHashMap) s5.e).isEmpty() && !arrayList.contains(substring)) {
                                    arrayList.add(substring);
                                }
                            }
                        } catch (Exception e11) {
                            org.telegram.messenger.a8.g(e11, true);
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    public static String p(byte[] bArr) {
        char[] cArr = new char[bArr.length * 2];
        char[] charArray = "0123456789abcdef".toCharArray();
        for (int i7 = 0; i7 < bArr.length; i7++) {
            int i10 = i7 * 2;
            byte b10 = bArr[i7];
            cArr[i10] = charArray[(b10 & 255) >>> 4];
            cArr[i10 + 1] = charArray[b10 & 15];
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
        } catch (Throwable th2) {
            try {
                fileInputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public static boolean z(qw0 qw0Var, String str) {
        Iterator it = ((LinkedHashMap) qw0Var.e).values().iterator();
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
            org.telegram.messenger.g0.g3(new a1(file.getAbsolutePath(), 0));
            try {
                this.f = null;
                qw0 qw0Var = new qw0();
                qw0Var.c = i(this.a);
                w(qw0Var, new LinkedHashMap());
                d(qw0Var);
            } catch (Exception e10) {
                m(e10);
            }
        }
    }

    public final byte[] a(qw0 qw0Var, String str) {
        return ("GramWallet:2\n" + this.c + "\n" + qw0Var.a + "\n" + str + "\n" + qw0Var.c).getBytes(StandardCharsets.UTF_8);
    }

    public final void b(long j3, boolean z10) {
        String str;
        m mVar;
        Object obj = g;
        synchronized (obj) {
            c(j3);
        }
        String absolutePath = this.d.getAbsolutePath();
        ai.d0 d0Var = new ai.d0(this, j3, 12);
        e1 e1Var = new e1();
        e1Var.d = absolutePath;
        org.telegram.messenger.g0.g3(new b80(e1Var, d0Var, z10, 11));
        try {
            if (e1Var.a.await(90L, TimeUnit.SECONDS)) {
                str = e1Var.c;
                e1Var.b = true;
                mVar = new m(e1Var, 3);
            } else {
                str = "AUTH_TIMEOUT";
                e1Var.b = true;
                mVar = new m(e1Var, 3);
            }
            org.telegram.messenger.g0.g3(mVar);
            synchronized (obj) {
                c(j3);
            }
            if (str != null) {
                throw new y0(str);
            }
        } catch (Throwable th2) {
            e1Var.b = true;
            org.telegram.messenger.g0.g3(new m(e1Var, 3));
            throw th2;
        }
    }

    public final void c(long j3) {
        if (j3 != l()) {
            throw new y0("STORAGE_CANCELED");
        }
    }

    public final void d(qw0 qw0Var) {
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
                    if (nextElement.startsWith(this.e) && !z(qw0Var, nextElement)) {
                        keyStore.deleteEntry(nextElement);
                    }
                }
                if (qw0Var.d) {
                    return;
                }
                if (!r().edit().clear().commit()) {
                    throw new IOException("legacy cleanup");
                }
                keyStore.deleteEntry("gramwallet_free_" + str);
                keyStore.deleteEntry("gramwallet_lock_" + str);
            } catch (Throwable th2) {
                Os.close(open);
                throw th2;
            }
        } catch (Exception e10) {
            m(e10);
        }
    }

    public final void e(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        synchronized (g) {
            try {
                qw0 s5 = s();
                KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                keyStore.load(null);
                int size = arrayList.size();
                int i7 = 0;
                while (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    String str = (String) obj;
                    if (!z(s5, str)) {
                        keyStore.deleteEntry(str);
                    }
                }
            } catch (Exception e10) {
                m(e10);
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
                try {
                    containsKey = ((LinkedHashMap) s().e).containsKey(p(bArr));
                } catch (Exception e10) {
                    m(e10);
                    return false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return containsKey;
    }

    public final byte[] g(qw0 qw0Var, String str) {
        Key key;
        JSONObject jSONObject = (JSONObject) ((LinkedHashMap) qw0Var.e).get(str);
        if (jSONObject == null) {
            throw new IOException("record missing");
        }
        if (!jSONObject.optBoolean("legacy", false)) {
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(2, y(jSONObject), new GCMParameterSpec(128, Base64.decode(jSONObject.getString("iv"), 2)));
            cipher.updateAAD(a(qw0Var, str));
            return cipher.doFinal(Base64.decode(jSONObject.getString("ciphertext"), 2));
        }
        String string = r().getString("swkey", null);
        if (string != null) {
            key = new SecretKeySpec(Base64.decode(string, 2), "AES");
        } else {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(qw0Var.c ? "gramwallet_lock_" : "gramwallet_free_");
            sb2.append(this.c);
            Key key2 = keyStore.getKey(sb2.toString(), null);
            if (!(key2 instanceof SecretKey)) {
                throw new IOException("legacy key missing");
            }
            key = (SecretKey) key2;
        }
        Cipher cipher2 = Cipher.getInstance("AES/CBC/PKCS7Padding");
        cipher2.init(2, key, new IvParameterSpec(B(jSONObject.getString("iv"))));
        return cipher2.doFinal(B(jSONObject.getString("ciphertext")));
    }

    public final r0 h(qw0 qw0Var, String str, long j3) {
        byte[] g10;
        try {
            g10 = g(qw0Var, str);
        } catch (Exception e10) {
            if (!qw0Var.c || !u(e10)) {
                throw e10;
            }
            b(j3, false);
            try {
                g10 = g(qw0Var, str);
            } catch (Exception e11) {
                if (!u(e11)) {
                    throw e11;
                }
                b(j3, true);
                g10 = g(qw0Var, str);
            }
        }
        try {
            return new r0(g10);
        } finally {
            Arrays.fill(g10, (byte) 0);
        }
    }

    public final JSONObject j(qw0 qw0Var, String str, r0 r0Var, ArrayList arrayList, long j3) {
        Cipher k10;
        String str2 = this.e + UUID.randomUUID();
        arrayList.add(str2);
        JSONObject put = new JSONObject().put("alias", str2);
        int i7 = Build.VERSION.SDK_INT;
        KeyGenParameterSpec.Builder userAuthenticationRequired = new KeyGenParameterSpec.Builder(str2, 3).setKeySize(256).setBlockModes("GCM").setEncryptionPaddings("NoPadding").setUserAuthenticationRequired(qw0Var.c);
        if (qw0Var.c) {
            if (i7 >= 30) {
                userAuthenticationRequired.setUserAuthenticationParameters(30, 3);
            } else {
                userAuthenticationRequired.setUserAuthenticationValidityDurationSeconds(30);
            }
            if (i7 >= 24) {
                userAuthenticationRequired.setInvalidatedByBiometricEnrollment(false);
            }
        }
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
        keyGenerator.init(userAuthenticationRequired.build());
        keyGenerator.generateKey();
        try {
            k10 = k(qw0Var, str, put);
        } catch (Exception e10) {
            if (!qw0Var.c || !u(e10)) {
                throw e10;
            }
            b(j3, false);
            try {
                k10 = k(qw0Var, str, put);
            } catch (Exception e11) {
                if (!u(e11)) {
                    throw e11;
                }
                b(j3, true);
                k10 = k(qw0Var, str, put);
            }
        }
        byte[] c10 = r0Var.c();
        try {
            put.put("ciphertext", Base64.encodeToString(k10.doFinal(c10), 2));
            put.put("iv", Base64.encodeToString(k10.getIV(), 2));
            return put;
        } finally {
            Arrays.fill(c10, (byte) 0);
        }
    }

    public final Cipher k(qw0 qw0Var, String str, JSONObject jSONObject) {
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        cipher.init(1, y(jSONObject));
        cipher.updateAAD(a(qw0Var, str));
        return cipher;
    }

    public final long l() {
        long longValue;
        synchronized (g) {
            Long l10 = (Long) h.get(this.d.getAbsolutePath());
            longValue = l10 == null ? 0L : l10.longValue();
        }
        return longValue;
    }

    public final void m(Exception exc) {
        this.f = exc;
        org.telegram.messenger.a8.g(exc, true);
    }

    public final byte[][] n() {
        byte[][] bArr;
        synchronized (g) {
            try {
                try {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = ((LinkedHashMap) s().e).keySet().iterator();
                    while (it.hasNext()) {
                        arrayList.add(B((String) it.next()));
                    }
                    bArr = (byte[][]) arrayList.toArray(new byte[0][]);
                } catch (Exception e10) {
                    m(e10);
                    return new byte[0][];
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bArr;
    }

    public final void q(long j3, byte[] bArr, r0 r0Var, y10 y10Var) {
        i.execute(new di.l2(this, bArr == null ? "" : p(bArr), r0Var == null ? null : r0Var.b(), l(), j3, y10Var));
    }

    public final SharedPreferences r() {
        return this.a.getSharedPreferences("gramwallet_" + this.c, 0);
    }

    public final qw0 s() {
        File file = this.d;
        if (file.exists()) {
            return v(new JSONObject(new String(x(file), StandardCharsets.UTF_8)));
        }
        qw0 qw0Var = new qw0();
        SharedPreferences r10 = r();
        qw0Var.c = r10.getBoolean("locked", i(this.a));
        qw0Var.a = r10.getLong("userId", 0L);
        qw0Var.b = r10.getInt("lastUsageDate", 0);
        if (!r10.contains("phrase")) {
            return qw0Var;
        }
        String p10 = p(B(r10.getString("pubkey", "")));
        if (p10.isEmpty()) {
            throw new IOException("legacy public key missing");
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("legacy", true);
        jSONObject.put("ciphertext", r10.getString("phrase", null));
        jSONObject.put("iv", r10.getString("iv", null));
        ((LinkedHashMap) qw0Var.e).put(p10, jSONObject);
        qw0Var.d = true;
        return qw0Var;
    }

    public final void t(qw0 qw0Var, String str, LinkedHashMap linkedHashMap, ArrayList arrayList, long j3) {
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) qw0Var.e;
        ArrayList arrayList2 = new ArrayList(linkedHashMap2.keySet());
        int size = arrayList2.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList2.get(i7);
            i7++;
            String str2 = (String) obj;
            if (!str2.equals(str) && ((JSONObject) linkedHashMap2.get(str2)).optBoolean("legacy", false)) {
                r0 h7 = h(qw0Var, str2, j3);
                linkedHashMap.put(str2, h7);
                linkedHashMap2.put(str2, j(qw0Var, str2, h7, arrayList, j3));
            }
        }
        qw0Var.d = false;
    }

    public final qw0 v(JSONObject jSONObject) {
        if (jSONObject.getInt("version") == 2) {
            if (this.c.equals(jSONObject.getString("address"))) {
                qw0 qw0Var = new qw0();
                qw0Var.a = jSONObject.getLong("userId");
                qw0Var.b = jSONObject.getInt("lastUsage");
                qw0Var.c = jSONObject.getBoolean("locked");
                JSONObject jSONObject2 = jSONObject.getJSONObject("records");
                Iterator<String> keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    if (next.isEmpty() || !next.equals(p(B(next)))) {
                        throw new IOException("public key encoding");
                    }
                    JSONObject jSONObject3 = jSONObject2.getJSONObject(next);
                    ((LinkedHashMap) qw0Var.e).put(next, jSONObject3);
                    qw0Var.d |= jSONObject3.optBoolean("legacy", false);
                }
                return qw0Var;
            }
        }
        throw new IOException("wallet format/address");
    }

    public final void w(qw0 qw0Var, LinkedHashMap linkedHashMap) {
        File file = this.d;
        File parentFile = file.getParentFile();
        if (!parentFile.isDirectory() && !parentFile.mkdirs()) {
            throw new IOException("wallet directory");
        }
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : ((LinkedHashMap) qw0Var.e).entrySet()) {
            jSONObject.put((String) entry.getKey(), entry.getValue());
        }
        String jSONObject2 = new JSONObject().put("version", 2).put("address", this.c).put("userId", qw0Var.a).put("lastUsage", qw0Var.b).put("locked", qw0Var.c).put("records", jSONObject).toString();
        Charset charset = StandardCharsets.UTF_8;
        byte[] bytes = jSONObject2.getBytes(charset);
        if (bytes.length > 4194304) {
            throw new IOException("wallet too large");
        }
        File file2 = new File(parentFile, file.getName() + ".pending");
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            try {
                fileOutputStream.write(bytes);
                fileOutputStream.flush();
                fileOutputStream.getFD().sync();
                fileOutputStream.close();
                byte[] x10 = x(file2);
                if (!Arrays.equals(bytes, x10)) {
                    throw new IOException("wallet read-back mismatch");
                }
                qw0 v = v(new JSONObject(new String(x10, charset)));
                for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                    byte[] c10 = ((r0) entry2.getValue()).c();
                    byte[] bArr = null;
                    try {
                        bArr = g(v, (String) entry2.getKey());
                        if (!MessageDigest.isEqual(c10, bArr)) {
                            throw new IOException("wallet decryption mismatch");
                        }
                        Arrays.fill(c10, (byte) 0);
                        if (bArr != null) {
                            Arrays.fill(bArr, (byte) 0);
                        }
                    } catch (Throwable th2) {
                        Arrays.fill(c10, (byte) 0);
                        if (bArr != null) {
                            Arrays.fill(bArr, (byte) 0);
                        }
                        throw th2;
                    }
                }
                Os.rename(file2.getAbsolutePath(), file.getAbsolutePath());
                org.telegram.messenger.g0.g3(new cd0(10));
            } finally {
            }
        } finally {
            if (file2.exists() && !file2.delete()) {
                org.telegram.messenger.a8.g(new IOException("wallet staging cleanup"), true);
            }
        }
    }

    public final SecretKey y(JSONObject jSONObject) {
        String string = jSONObject.getString("alias");
        if (!string.startsWith(this.e)) {
            throw new IOException("key alias outside wallet");
        }
        KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
        keyStore.load(null);
        Key key = keyStore.getKey(string, null);
        if (key == null) {
            throw new IOException("keystore key missing");
        }
        if (!jSONObject.has("wrappedKey")) {
            if (key instanceof SecretKey) {
                return (SecretKey) key;
            }
            throw new IOException("keystore key type");
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
