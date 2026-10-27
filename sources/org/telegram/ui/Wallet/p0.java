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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.jz0;
import org.telegram.ui.f80;
import org.telegram.ui.w90;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class p0 {
    public static final Object f = new Object();
    public static final HashMap g = new HashMap();
    public static final ExecutorService h = Executors.newSingleThreadExecutor(new e2.l0(5));
    public static final CopyOnWriteArrayList i = new CopyOnWriteArrayList();
    public final Context a;
    public final int b;
    public final String c;
    public final File d;
    public final String e;

    public p0(Context context, String str, int i10) {
        if (context == null || str == null || str.isEmpty()) {
            throw new IllegalArgumentException("context/address");
        }
        Context applicationContext = context.getApplicationContext();
        context = applicationContext != null ? applicationContext : context;
        this.a = context;
        this.b = i10;
        this.c = str;
        try {
            String o10 = o(MessageDigest.getInstance("SHA-256").digest(str.getBytes(StandardCharsets.UTF_8)));
            this.d = new File(new File(context.getNoBackupFilesDir(), "gramwallets"), o10.concat(".json"));
            this.e = a1.g.p("gramwallet_v2_", o10, "_");
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }

    public static byte[] A(String str) {
        if (str == null || str.length() % 2 != 0) {
            throw new IOException("hex length");
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = i10 * 2;
            int digit = Character.digit(str.charAt(i11), 16);
            int digit2 = Character.digit(str.charAt(i11 + 1), 16);
            if (digit < 0 || digit2 < 0) {
                throw new IOException("hex digit");
            }
            bArr[i10] = (byte) (digit2 | (digit << 4));
        }
        return bArr;
    }

    public static boolean i(Context context) {
        String str;
        if (context != null && (str = SharedConfig.passcodeHash) != null && str.length() != 0) {
            try {
                KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService("keyguard");
                if (keyguardManager != null) {
                    if (keyguardManager.isDeviceSecure()) {
                        return true;
                    }
                }
                return false;
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        return false;
    }

    public static ArrayList n(Context context, long j10) {
        ArrayList arrayList;
        synchronized (f) {
            arrayList = new ArrayList();
            File[] listFiles = new File(context.getNoBackupFilesDir(), "gramwallets").listFiles();
            if (listFiles != null) {
                for (File file : listFiles) {
                    if (file.getName().endsWith(".json")) {
                        try {
                            JSONObject jSONObject = new JSONObject(new String(w(file), StandardCharsets.UTF_8));
                            String string = jSONObject.getString("address");
                            p0 p0Var = new p0(context, string, 0);
                            if (p0Var.d.equals(file)) {
                                jz0 u10 = p0Var.u(jSONObject);
                                if (u10.a == j10 && !((LinkedHashMap) u10.e).isEmpty()) {
                                    arrayList.add(string);
                                }
                            }
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                    }
                }
            }
            File[] listFiles2 = new File(context.getApplicationInfo().dataDir, "shared_prefs").listFiles();
            if (listFiles2 != null) {
                for (File file2 : listFiles2) {
                    String name = file2.getName();
                    int i10 = name.endsWith(".xml.bak") ? 8 : name.endsWith(".xml") ? 4 : 0;
                    if (name.startsWith("gramwallet_") && i10 != 0) {
                        String substring = name.substring(11, name.length() - i10);
                        try {
                            p0 p0Var2 = new p0(context, substring, 0);
                            if (!p0Var2.d.exists()) {
                                jz0 r6 = p0Var2.r();
                                if (r6.a == j10 && !((LinkedHashMap) r6.e).isEmpty() && !arrayList.contains(substring)) {
                                    arrayList.add(substring);
                                }
                            }
                        } catch (Exception e10) {
                            FileLog.e(e10);
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    public static String o(byte[] bArr) {
        char[] cArr = new char[bArr.length * 2];
        char[] charArray = "0123456789abcdef".toCharArray();
        for (int i10 = 0; i10 < bArr.length; i10++) {
            int i11 = i10 * 2;
            byte b10 = bArr[i10];
            cArr[i11] = charArray[(b10 & 255) >>> 4];
            cArr[i11 + 1] = charArray[b10 & 15];
        }
        return new String(cArr);
    }

    public static boolean t(Exception exc) {
        for (Exception exc2 = exc; exc2 != null; exc2 = exc2.getCause()) {
            if (exc2 instanceof UserNotAuthenticatedException) {
                return true;
            }
        }
        return false;
    }

    public static byte[] w(File file) {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byte[] bArr = new byte[4096];
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

    public static boolean y(jz0 jz0Var, String str) {
        Iterator it = ((LinkedHashMap) jz0Var.e).values().iterator();
        while (it.hasNext()) {
            if (str.equals(((JSONObject) it.next()).optString("alias"))) {
                return true;
            }
        }
        return false;
    }

    public static synchronized void z(Runnable runnable) {
        synchronized (p0.class) {
            Iterator it = i.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                Runnable runnable2 = (Runnable) weakReference.get();
                if (runnable2 == null || runnable2 == runnable) {
                    i.remove(weakReference);
                }
            }
        }
    }

    public final void B() {
        synchronized (f) {
            HashMap hashMap = g;
            File file = this.d;
            hashMap.put(file.getAbsolutePath(), Long.valueOf(l() + 1));
            AndroidUtilities.runOnUIThread(new q0(file.getAbsolutePath(), 0));
            try {
                jz0 jz0Var = new jz0();
                jz0Var.c = i(this.a);
                v(jz0Var, new LinkedHashMap());
                d(jz0Var);
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    public final byte[] a(jz0 jz0Var, String str) {
        return ("GramWallet:2\n" + this.c + "\n" + jz0Var.a + "\n" + str + "\n" + jz0Var.c).getBytes(StandardCharsets.UTF_8);
    }

    public final void b(long j10, boolean z10) {
        String str;
        m mVar;
        Object obj = f;
        synchronized (obj) {
            c(j10);
        }
        String absolutePath = this.d.getAbsolutePath();
        di.d1 d1Var = new di.d1(this, j10, 12);
        v0 v0Var = new v0();
        v0Var.d = absolutePath;
        AndroidUtilities.runOnUIThread(new f80(v0Var, d1Var, z10, 12));
        try {
            if (v0Var.a.await(90L, TimeUnit.SECONDS)) {
                str = v0Var.c;
                v0Var.b = true;
                mVar = new m(v0Var, 4);
            } else {
                str = "AUTH_TIMEOUT";
                v0Var.b = true;
                mVar = new m(v0Var, 4);
            }
            AndroidUtilities.runOnUIThread(mVar);
            synchronized (obj) {
                c(j10);
            }
            if (str != null) {
                throw new o0(str);
            }
        } catch (Throwable th2) {
            v0Var.b = true;
            AndroidUtilities.runOnUIThread(new m(v0Var, 4));
            throw th2;
        }
    }

    public final void c(long j10) {
        if (j10 != l()) {
            throw new o0("STORAGE_CANCELED");
        }
    }

    public final void d(jz0 jz0Var) {
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
                    if (nextElement.startsWith(this.e) && !y(jz0Var, nextElement)) {
                        keyStore.deleteEntry(nextElement);
                    }
                }
                if (jz0Var.d) {
                    return;
                }
                if (!q().edit().clear().commit()) {
                    throw new IOException("legacy cleanup");
                }
                keyStore.deleteEntry("gramwallet_free_" + str);
                keyStore.deleteEntry("gramwallet_lock_" + str);
            } catch (Throwable th2) {
                Os.close(open);
                throw th2;
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final void e(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        synchronized (f) {
            try {
                jz0 r6 = r();
                KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                keyStore.load(null);
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    String str = (String) obj;
                    if (!y(r6, str)) {
                        keyStore.deleteEntry(str);
                    }
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    public final boolean f(byte[] bArr) {
        boolean containsKey;
        if (bArr == null || bArr.length == 0) {
            return false;
        }
        synchronized (f) {
            try {
                try {
                    containsKey = ((LinkedHashMap) r().e).containsKey(o(bArr));
                } catch (Exception e) {
                    FileLog.e(e);
                    return false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return containsKey;
    }

    public final byte[] g(jz0 jz0Var, String str) {
        Key key;
        JSONObject jSONObject = (JSONObject) ((LinkedHashMap) jz0Var.e).get(str);
        if (jSONObject == null) {
            throw new IOException("record missing");
        }
        if (!jSONObject.optBoolean("legacy", false)) {
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(2, x(jSONObject), new GCMParameterSpec(128, Base64.decode(jSONObject.getString("iv"), 2)));
            cipher.updateAAD(a(jz0Var, str));
            return cipher.doFinal(Base64.decode(jSONObject.getString("ciphertext"), 2));
        }
        String string = q().getString("swkey", null);
        if (string != null) {
            key = new SecretKeySpec(Base64.decode(string, 2), "AES");
        } else {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(jz0Var.c ? "gramwallet_lock_" : "gramwallet_free_");
            sb2.append(this.c);
            Key key2 = keyStore.getKey(sb2.toString(), null);
            if (!(key2 instanceof SecretKey)) {
                throw new IOException("legacy key missing");
            }
            key = (SecretKey) key2;
        }
        Cipher cipher2 = Cipher.getInstance("AES/CBC/PKCS7Padding");
        cipher2.init(2, key, new IvParameterSpec(A(jSONObject.getString("iv"))));
        return cipher2.doFinal(A(jSONObject.getString("ciphertext")));
    }

    public final i0 h(jz0 jz0Var, String str, long j10) {
        byte[] g7;
        try {
            g7 = g(jz0Var, str);
        } catch (Exception e) {
            if (!jz0Var.c || !t(e)) {
                throw e;
            }
            b(j10, false);
            try {
                g7 = g(jz0Var, str);
            } catch (Exception e10) {
                if (!t(e10)) {
                    throw e10;
                }
                b(j10, true);
                g7 = g(jz0Var, str);
            }
        }
        try {
            return new i0(g7);
        } finally {
            Arrays.fill(g7, (byte) 0);
        }
    }

    public final JSONObject j(jz0 jz0Var, String str, i0 i0Var, ArrayList arrayList, long j10) {
        Cipher k10;
        String str2 = this.e + UUID.randomUUID();
        arrayList.add(str2);
        JSONObject put = new JSONObject().put("alias", str2);
        int i10 = Build.VERSION.SDK_INT;
        KeyGenParameterSpec.Builder userAuthenticationRequired = new KeyGenParameterSpec.Builder(str2, 3).setKeySize(256).setBlockModes("GCM").setEncryptionPaddings("NoPadding").setUserAuthenticationRequired(jz0Var.c);
        if (jz0Var.c) {
            if (i10 >= 30) {
                userAuthenticationRequired.setUserAuthenticationParameters(30, 3);
            } else {
                userAuthenticationRequired.setUserAuthenticationValidityDurationSeconds(30);
            }
            if (i10 >= 24) {
                userAuthenticationRequired.setInvalidatedByBiometricEnrollment(false);
            }
        }
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
        keyGenerator.init(userAuthenticationRequired.build());
        keyGenerator.generateKey();
        try {
            k10 = k(jz0Var, str, put);
        } catch (Exception e) {
            if (!jz0Var.c || !t(e)) {
                throw e;
            }
            b(j10, false);
            try {
                k10 = k(jz0Var, str, put);
            } catch (Exception e10) {
                if (!t(e10)) {
                    throw e10;
                }
                b(j10, true);
                k10 = k(jz0Var, str, put);
            }
        }
        byte[] c10 = i0Var.c();
        try {
            put.put("ciphertext", Base64.encodeToString(k10.doFinal(c10), 2));
            put.put("iv", Base64.encodeToString(k10.getIV(), 2));
            return put;
        } finally {
            Arrays.fill(c10, (byte) 0);
        }
    }

    public final Cipher k(jz0 jz0Var, String str, JSONObject jSONObject) {
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        cipher.init(1, x(jSONObject));
        cipher.updateAAD(a(jz0Var, str));
        return cipher;
    }

    public final long l() {
        long longValue;
        synchronized (f) {
            Long l4 = (Long) g.get(this.d.getAbsolutePath());
            longValue = l4 == null ? 0L : l4.longValue();
        }
        return longValue;
    }

    public final byte[][] m() {
        byte[][] bArr;
        synchronized (f) {
            try {
                try {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = ((LinkedHashMap) r().e).keySet().iterator();
                    while (it.hasNext()) {
                        arrayList.add(A((String) it.next()));
                    }
                    bArr = (byte[][]) arrayList.toArray(new byte[0][]);
                } catch (Exception e) {
                    FileLog.e(e);
                    return new byte[0][];
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bArr;
    }

    public final void p(long j10, byte[] bArr, i0 i0Var, Utilities.Callback callback) {
        h.execute(new bi.j3(this, bArr == null ? "" : o(bArr), i0Var == null ? null : i0Var.b(), l(), j10, callback));
    }

    public final SharedPreferences q() {
        return this.a.getSharedPreferences("gramwallet_" + this.c, 0);
    }

    public final jz0 r() {
        File file = this.d;
        if (file.exists()) {
            return u(new JSONObject(new String(w(file), StandardCharsets.UTF_8)));
        }
        jz0 jz0Var = new jz0();
        SharedPreferences q5 = q();
        jz0Var.c = q5.getBoolean("locked", i(this.a));
        jz0Var.a = q5.getLong("userId", 0L);
        jz0Var.b = q5.getInt("lastUsageDate", 0);
        if (!q5.contains("phrase")) {
            return jz0Var;
        }
        String o10 = o(A(q5.getString("pubkey", "")));
        if (o10.isEmpty()) {
            throw new IOException("legacy public key missing");
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("legacy", true);
        jSONObject.put("ciphertext", q5.getString("phrase", null));
        jSONObject.put("iv", q5.getString("iv", null));
        ((LinkedHashMap) jz0Var.e).put(o10, jSONObject);
        jz0Var.d = true;
        return jz0Var;
    }

    public final void s(jz0 jz0Var, String str, LinkedHashMap linkedHashMap, ArrayList arrayList, long j10) {
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) jz0Var.e;
        ArrayList arrayList2 = new ArrayList(linkedHashMap2.keySet());
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            String str2 = (String) obj;
            if (!str2.equals(str) && ((JSONObject) linkedHashMap2.get(str2)).optBoolean("legacy", false)) {
                i0 h10 = h(jz0Var, str2, j10);
                linkedHashMap.put(str2, h10);
                linkedHashMap2.put(str2, j(jz0Var, str2, h10, arrayList, j10));
            }
        }
        jz0Var.d = false;
    }

    public final jz0 u(JSONObject jSONObject) {
        if (jSONObject.getInt("version") == 2) {
            if (this.c.equals(jSONObject.getString("address"))) {
                jz0 jz0Var = new jz0();
                jz0Var.a = jSONObject.getLong("userId");
                jz0Var.b = jSONObject.getInt("lastUsage");
                jz0Var.c = jSONObject.getBoolean("locked");
                JSONObject jSONObject2 = jSONObject.getJSONObject("records");
                Iterator<String> keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    if (next.isEmpty() || !next.equals(o(A(next)))) {
                        throw new IOException("public key encoding");
                    }
                    JSONObject jSONObject3 = jSONObject2.getJSONObject(next);
                    ((LinkedHashMap) jz0Var.e).put(next, jSONObject3);
                    jz0Var.d |= jSONObject3.optBoolean("legacy", false);
                }
                return jz0Var;
            }
        }
        throw new IOException("wallet format/address");
    }

    public final void v(jz0 jz0Var, LinkedHashMap linkedHashMap) {
        File file = this.d;
        File parentFile = file.getParentFile();
        if (!parentFile.isDirectory() && !parentFile.mkdirs()) {
            throw new IOException("wallet directory");
        }
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : ((LinkedHashMap) jz0Var.e).entrySet()) {
            jSONObject.put((String) entry.getKey(), entry.getValue());
        }
        String jSONObject2 = new JSONObject().put("version", 2).put("address", this.c).put("userId", jz0Var.a).put("lastUsage", jz0Var.b).put("locked", jz0Var.c).put("records", jSONObject).toString();
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
                byte[] w10 = w(file2);
                if (!Arrays.equals(bytes, w10)) {
                    throw new IOException("wallet read-back mismatch");
                }
                jz0 u10 = u(new JSONObject(new String(w10, charset)));
                for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                    byte[] c10 = ((i0) entry2.getValue()).c();
                    byte[] bArr = null;
                    try {
                        bArr = g(u10, (String) entry2.getKey());
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
                AndroidUtilities.runOnUIThread(new w90(13));
            } finally {
            }
        } finally {
            if (file2.exists() && !file2.delete()) {
                FileLog.e(new IOException("wallet staging cleanup"));
            }
        }
    }

    public final SecretKey x(JSONObject jSONObject) {
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
