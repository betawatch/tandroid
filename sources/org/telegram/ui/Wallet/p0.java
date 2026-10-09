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
import org.telegram.ui.Components.dz0;
import org.telegram.ui.ha0;
import org.telegram.ui.t21;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class p0 {
    public static final Object f = new Object();
    public static final HashMap g = new HashMap();
    public static final ExecutorService h = Executors.newSingleThreadExecutor(new e2.c0(5));
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
            String o9 = o(MessageDigest.getInstance("SHA-256").digest(str.getBytes(StandardCharsets.UTF_8)));
            this.d = new File(new File(context.getNoBackupFilesDir(), "gramwallets"), o9.concat(".json"));
            this.e = a1.g.q("gramwallet_v2_", o9, "_");
        } catch (Exception e7) {
            throw new IllegalStateException(e7);
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
            } catch (Exception e7) {
                FileLog.e(e7);
            }
        }
        return false;
    }

    public static ArrayList n(Context context, long j3) {
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
                                dz0 u10 = p0Var.u(jSONObject);
                                if (u10.a == j3 && !((LinkedHashMap) u10.e).isEmpty()) {
                                    arrayList.add(string);
                                }
                            }
                        } catch (Exception e7) {
                            FileLog.e(e7);
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
                                dz0 r10 = p0Var2.r();
                                if (r10.a == j3 && !((LinkedHashMap) r10.e).isEmpty() && !arrayList.contains(substring)) {
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

    public static boolean y(dz0 dz0Var, String str) {
        Iterator it = ((LinkedHashMap) dz0Var.e).values().iterator();
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
                dz0 dz0Var = new dz0();
                dz0Var.c = i(this.a);
                v(dz0Var, new LinkedHashMap());
                d(dz0Var);
            } catch (Exception e7) {
                FileLog.e(e7);
            }
        }
    }

    public final byte[] a(dz0 dz0Var, String str) {
        return ("GramWallet:2\n" + this.c + "\n" + dz0Var.a + "\n" + str + "\n" + dz0Var.c).getBytes(StandardCharsets.UTF_8);
    }

    public final void b(long j3, boolean z10) {
        String str;
        m mVar;
        Object obj = f;
        synchronized (obj) {
            c(j3);
        }
        String absolutePath = this.d.getAbsolutePath();
        ai.z1 z1Var = new ai.z1(this, j3, 12);
        v0 v0Var = new v0();
        v0Var.d = absolutePath;
        AndroidUtilities.runOnUIThread(new ha0(v0Var, z1Var, z10, 10));
        try {
            if (v0Var.a.await(90L, TimeUnit.SECONDS)) {
                str = v0Var.c;
                v0Var.b = true;
                mVar = new m(v0Var, 3);
            } else {
                str = "AUTH_TIMEOUT";
                v0Var.b = true;
                mVar = new m(v0Var, 3);
            }
            AndroidUtilities.runOnUIThread(mVar);
            synchronized (obj) {
                c(j3);
            }
            if (str != null) {
                throw new o0(str);
            }
        } catch (Throwable th2) {
            v0Var.b = true;
            AndroidUtilities.runOnUIThread(new m(v0Var, 3));
            throw th2;
        }
    }

    public final void c(long j3) {
        if (j3 != l()) {
            throw new o0("STORAGE_CANCELED");
        }
    }

    public final void d(dz0 dz0Var) {
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
                    if (nextElement.startsWith(this.e) && !y(dz0Var, nextElement)) {
                        keyStore.deleteEntry(nextElement);
                    }
                }
                if (dz0Var.d) {
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
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    public final void e(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        synchronized (f) {
            try {
                dz0 r10 = r();
                KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                keyStore.load(null);
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    String str = (String) obj;
                    if (!y(r10, str)) {
                        keyStore.deleteEntry(str);
                    }
                }
            } catch (Exception e7) {
                FileLog.e(e7);
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
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return containsKey;
    }

    public final byte[] g(dz0 dz0Var, String str) {
        Key key;
        JSONObject jSONObject = (JSONObject) ((LinkedHashMap) dz0Var.e).get(str);
        if (jSONObject == null) {
            throw new IOException("record missing");
        }
        if (!jSONObject.optBoolean("legacy", false)) {
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(2, x(jSONObject), new GCMParameterSpec(128, Base64.decode(jSONObject.getString("iv"), 2)));
            cipher.updateAAD(a(dz0Var, str));
            return cipher.doFinal(Base64.decode(jSONObject.getString("ciphertext"), 2));
        }
        String string = q().getString("swkey", null);
        if (string != null) {
            key = new SecretKeySpec(Base64.decode(string, 2), "AES");
        } else {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(dz0Var.c ? "gramwallet_lock_" : "gramwallet_free_");
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

    public final h0 h(dz0 dz0Var, String str, long j3) {
        byte[] g10;
        try {
            g10 = g(dz0Var, str);
        } catch (Exception e7) {
            if (!dz0Var.c || !t(e7)) {
                throw e7;
            }
            b(j3, false);
            try {
                g10 = g(dz0Var, str);
            } catch (Exception e10) {
                if (!t(e10)) {
                    throw e10;
                }
                b(j3, true);
                g10 = g(dz0Var, str);
            }
        }
        try {
            return new h0(g10);
        } finally {
            Arrays.fill(g10, (byte) 0);
        }
    }

    public final JSONObject j(dz0 dz0Var, String str, h0 h0Var, ArrayList arrayList, long j3) {
        Cipher k10;
        String str2 = this.e + UUID.randomUUID();
        arrayList.add(str2);
        JSONObject put = new JSONObject().put("alias", str2);
        int i10 = Build.VERSION.SDK_INT;
        KeyGenParameterSpec.Builder userAuthenticationRequired = new KeyGenParameterSpec.Builder(str2, 3).setKeySize(256).setBlockModes("GCM").setEncryptionPaddings("NoPadding").setUserAuthenticationRequired(dz0Var.c);
        if (dz0Var.c) {
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
            k10 = k(dz0Var, str, put);
        } catch (Exception e7) {
            if (!dz0Var.c || !t(e7)) {
                throw e7;
            }
            b(j3, false);
            try {
                k10 = k(dz0Var, str, put);
            } catch (Exception e10) {
                if (!t(e10)) {
                    throw e10;
                }
                b(j3, true);
                k10 = k(dz0Var, str, put);
            }
        }
        byte[] c10 = h0Var.c();
        try {
            put.put("ciphertext", Base64.encodeToString(k10.doFinal(c10), 2));
            put.put("iv", Base64.encodeToString(k10.getIV(), 2));
            return put;
        } finally {
            Arrays.fill(c10, (byte) 0);
        }
    }

    public final Cipher k(dz0 dz0Var, String str, JSONObject jSONObject) {
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        cipher.init(1, x(jSONObject));
        cipher.updateAAD(a(dz0Var, str));
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
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return new byte[0][];
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bArr;
    }

    public final void p(long j3, byte[] bArr, h0 h0Var, Utilities.Callback callback) {
        h.execute(new n0(this, bArr == null ? "" : o(bArr), h0Var == null ? null : h0Var.b(), l(), j3, callback));
    }

    public final SharedPreferences q() {
        return this.a.getSharedPreferences("gramwallet_" + this.c, 0);
    }

    public final dz0 r() {
        File file = this.d;
        if (file.exists()) {
            return u(new JSONObject(new String(w(file), StandardCharsets.UTF_8)));
        }
        dz0 dz0Var = new dz0();
        SharedPreferences q6 = q();
        dz0Var.c = q6.getBoolean("locked", i(this.a));
        dz0Var.a = q6.getLong("userId", 0L);
        dz0Var.b = q6.getInt("lastUsageDate", 0);
        if (!q6.contains("phrase")) {
            return dz0Var;
        }
        String o9 = o(A(q6.getString("pubkey", "")));
        if (o9.isEmpty()) {
            throw new IOException("legacy public key missing");
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("legacy", true);
        jSONObject.put("ciphertext", q6.getString("phrase", null));
        jSONObject.put("iv", q6.getString("iv", null));
        ((LinkedHashMap) dz0Var.e).put(o9, jSONObject);
        dz0Var.d = true;
        return dz0Var;
    }

    public final void s(dz0 dz0Var, String str, LinkedHashMap linkedHashMap, ArrayList arrayList, long j3) {
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) dz0Var.e;
        ArrayList arrayList2 = new ArrayList(linkedHashMap2.keySet());
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            String str2 = (String) obj;
            if (!str2.equals(str) && ((JSONObject) linkedHashMap2.get(str2)).optBoolean("legacy", false)) {
                h0 h10 = h(dz0Var, str2, j3);
                linkedHashMap.put(str2, h10);
                linkedHashMap2.put(str2, j(dz0Var, str2, h10, arrayList, j3));
            }
        }
        dz0Var.d = false;
    }

    public final dz0 u(JSONObject jSONObject) {
        if (jSONObject.getInt("version") == 2) {
            if (this.c.equals(jSONObject.getString("address"))) {
                dz0 dz0Var = new dz0();
                dz0Var.a = jSONObject.getLong("userId");
                dz0Var.b = jSONObject.getInt("lastUsage");
                dz0Var.c = jSONObject.getBoolean("locked");
                JSONObject jSONObject2 = jSONObject.getJSONObject("records");
                Iterator<String> keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    if (next.isEmpty() || !next.equals(o(A(next)))) {
                        throw new IOException("public key encoding");
                    }
                    JSONObject jSONObject3 = jSONObject2.getJSONObject(next);
                    ((LinkedHashMap) dz0Var.e).put(next, jSONObject3);
                    dz0Var.d |= jSONObject3.optBoolean("legacy", false);
                }
                return dz0Var;
            }
        }
        throw new IOException("wallet format/address");
    }

    public final void v(dz0 dz0Var, LinkedHashMap linkedHashMap) {
        File file = this.d;
        File parentFile = file.getParentFile();
        if (!parentFile.isDirectory() && !parentFile.mkdirs()) {
            throw new IOException("wallet directory");
        }
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : ((LinkedHashMap) dz0Var.e).entrySet()) {
            jSONObject.put((String) entry.getKey(), entry.getValue());
        }
        String jSONObject2 = new JSONObject().put("version", 2).put("address", this.c).put("userId", dz0Var.a).put("lastUsage", dz0Var.b).put("locked", dz0Var.c).put("records", jSONObject).toString();
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
                dz0 u10 = u(new JSONObject(new String(w10, charset)));
                for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                    byte[] c10 = ((h0) entry2.getValue()).c();
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
                AndroidUtilities.runOnUIThread(new t21(6));
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
