package mh;

import android.os.Build;
import android.security.keystore.KeyGenParameterSpec;
import android.text.TextUtils;
import android.util.Pair;
import j$.util.Collection;
import j$.util.stream.Collectors;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.security.KeyStore;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import org.json.JSONObject;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.UserConfig;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class p1 {
    public final int a;
    public final long b;
    public final long c;
    public final boolean d;
    public String e;

    public p1(long j10, long j11, int i9, boolean z10) {
        this.a = i9;
        this.b = j11;
        this.c = j10;
        this.d = z10;
    }

    public static File b() {
        try {
            File filesDir = ApplicationLoader.applicationContext.getFilesDir();
            if (filesDir != null) {
                File file = new File(filesDir, "apps_storage/");
                file.mkdirs();
                if (filesDir.exists() || filesDir.mkdirs()) {
                    if (filesDir.canWrite()) {
                        return file;
                    }
                }
            }
        } catch (Exception unused) {
        }
        return new File("");
    }

    public static SecretKey g() {
        if (Build.VERSION.SDK_INT < 23) {
            throw new RuntimeException("UNSUPPORTED");
        }
        KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
        keyStore.load(null);
        if (!keyStore.containsAlias("MiniAppsKey")) {
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
            keyGenerator.init(new KeyGenParameterSpec.Builder("MiniAppsKey", 3).setBlockModes("GCM").setEncryptionPaddings("NoPadding").setUserAuthenticationRequired(false).build());
            keyGenerator.generateKey();
        }
        return (SecretKey) keyStore.getKey("MiniAppsKey", null);
    }

    public static HashMap i() {
        HashMap hashMap = new HashMap();
        try {
            File file = new File(b(), "secure_config.json");
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                byte[] bArr = new byte[(int) file.length()];
                fileInputStream.read(bArr);
                fileInputStream.close();
                JSONObject jSONObject = new JSONObject(new String(bArr));
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    JSONObject jSONObject2 = jSONObject.getJSONObject(next);
                    o1 o1Var = new o1();
                    o1Var.a = next;
                    o1Var.b = jSONObject2.getLong("user_id");
                    o1Var.c = jSONObject2.getString("user_name");
                    o1Var.d = jSONObject2.getLong("created_at");
                    o1Var.e = jSONObject2.getLong("edited_at");
                    hashMap.put(next, o1Var);
                }
                return hashMap;
            } catch (OutOfMemoryError e10) {
                FileLog.e(e10);
                throw new RuntimeException("QUOTA_EXCEEDED");
            }
        } catch (Exception e11) {
            FileLog.e(e11);
            return hashMap;
        }
    }

    public static void k(HashMap hashMap) {
        try {
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry entry : hashMap.entrySet()) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("user_id", ((o1) entry.getValue()).b);
                jSONObject2.put("user_name", ((o1) entry.getValue()).c);
                jSONObject2.put("created_at", ((o1) entry.getValue()).d);
                jSONObject2.put("edited_at", ((o1) entry.getValue()).e);
                jSONObject.put((String) entry.getKey(), jSONObject2);
            }
            File file = new File(b(), "secure_config.json");
            byte[] bytes = jSONObject.toString().getBytes();
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            fileOutputStream.write(bytes);
            fileOutputStream.close();
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    public final byte[] a(File file) {
        byte[] bArr;
        FileInputStream fileInputStream = new FileInputStream(file);
        int length = (int) file.length();
        boolean z10 = this.d;
        if (z10) {
            int read = fileInputStream.read();
            bArr = new byte[read];
            length = (length - 1) - read;
            fileInputStream.read(bArr);
        } else {
            bArr = null;
        }
        try {
            byte[] bArr2 = new byte[length];
            fileInputStream.read(bArr2);
            fileInputStream.close();
            if (!z10) {
                return bArr2;
            }
            try {
                Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
                cipher.init(2, g(), new GCMParameterSpec(128, bArr));
                return cipher.doFinal(bArr2);
            } catch (Exception e10) {
                FileLog.e(e10);
                l(file, "{}".getBytes());
                throw new RuntimeException("UNKNOWN_ERROR");
            }
        } catch (OutOfMemoryError e11) {
            FileLog.e(e11);
            throw new RuntimeException("QUOTA_EXCEEDED");
        }
    }

    public final File c() {
        long j10;
        if (this.d && TextUtils.isEmpty(this.e)) {
            HashMap i9 = i();
            Iterator it = i9.entrySet().iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                j10 = this.c;
                if (!hasNext) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                if (((o1) entry.getValue()).b == j10) {
                    this.e = (String) entry.getKey();
                    break;
                }
            }
            if (TextUtils.isEmpty(this.e)) {
                String uuid = UUID.randomUUID().toString();
                this.e = uuid;
                o1 o1Var = new o1();
                o1Var.a = uuid;
                o1Var.b = j10;
                o1Var.c = DialogObject.getName(UserConfig.getInstance(this.a).getCurrentUser());
                long currentTimeMillis = System.currentTimeMillis();
                o1Var.e = currentTimeMillis;
                o1Var.d = currentTimeMillis;
                i9.put(this.e, o1Var);
                k(i9);
            }
        }
        return d(this.e);
    }

    public final File d(String str) {
        File b10 = b();
        StringBuilder sb2 = new StringBuilder();
        long j10 = this.c;
        boolean z10 = this.d;
        Object obj = str;
        if (!z10) {
            obj = Long.valueOf(j10);
        }
        sb2.append(obj);
        sb2.append("_");
        long j11 = this.b;
        sb2.append(j11);
        sb2.append(z10 ? "_s" : "");
        File file = new File(b10, sb2.toString());
        File b11 = b();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(j11);
        sb3.append(z10 ? "_s" : "");
        File file2 = new File(b11, sb3.toString());
        if (!file.exists() && file2.exists()) {
            file2.renameTo(file);
            return file;
        }
        if (z10) {
            File file3 = new File(b(), j10 + "_" + j11 + "_s");
            if (!file.exists() && file3.exists()) {
                file3.renameTo(file);
            }
        }
        return file;
    }

    public final JSONObject e(File file) {
        if (!file.exists() || file.length() > 5242880) {
            return new JSONObject();
        }
        try {
            return new JSONObject(new String(a(file)));
        } catch (Exception e10) {
            FileLog.e(e10);
            return new JSONObject();
        }
    }

    public final Pair f(String str) {
        boolean z10 = this.d;
        if (z10 && Build.VERSION.SDK_INT < 23) {
            throw new RuntimeException("UNSUPPORTED");
        }
        JSONObject e10 = e(c());
        String optString = e10.optString(str);
        boolean z11 = false;
        if (z10 && optString == null && !e10.keys().hasNext()) {
            HashSet hashSet = new HashSet();
            for (int i9 = 0; i9 < 4; i9++) {
                UserConfig userConfig = UserConfig.getInstance(i9);
                if (userConfig.isClientActivated()) {
                    hashSet.add(Long.valueOf(userConfig.getClientUserId()));
                }
            }
            Iterator it = ((Set) Collection.-EL.stream(i().values()).filter(new m1(hashSet, 0)).collect(Collectors.toSet())).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                try {
                    File d = d(((o1) it.next()).a);
                    if (d.exists() && e(d).has(str)) {
                        z11 = true;
                        break;
                    }
                } catch (Exception e11) {
                    FileLog.e(e11);
                }
            }
        }
        return new Pair(optString, Boolean.valueOf(z11));
    }

    public final ArrayList h(String str) {
        if (this.d && Build.VERSION.SDK_INT < 23) {
            throw new RuntimeException("UNSUPPORTED");
        }
        if (e(c()).keys().hasNext()) {
            throw new RuntimeException("STORAGE_NOT_EMPTY");
        }
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        for (int i9 = 0; i9 < 4; i9++) {
            UserConfig userConfig = UserConfig.getInstance(i9);
            if (userConfig.isClientActivated()) {
                hashSet.add(Long.valueOf(userConfig.getClientUserId()));
            }
        }
        for (o1 o1Var : (Set) Collection.-EL.stream(i().values()).filter(new m1(hashSet, 1)).collect(Collectors.toSet())) {
            try {
                File d = d(o1Var.a);
                if (d.exists() && e(d).has(str)) {
                    arrayList.add(o1Var);
                }
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        }
        return arrayList;
    }

    public final void j(String str) {
        if (this.d && Build.VERSION.SDK_INT < 23) {
            throw new RuntimeException("UNSUPPORTED");
        }
        if (e(c()).keys().hasNext()) {
            throw new RuntimeException("STORAGE_NOT_EMPTY");
        }
        HashSet hashSet = new HashSet();
        for (int i9 = 0; i9 < 4; i9++) {
            UserConfig userConfig = UserConfig.getInstance(i9);
            if (userConfig.isClientActivated()) {
                hashSet.add(Long.valueOf(userConfig.getClientUserId()));
            }
        }
        HashMap i10 = i();
        o1 o1Var = (o1) i10.get(str);
        if (o1Var == null) {
            throw new RuntimeException("STORAGE_NOT_FOUND");
        }
        o1Var.b = this.c;
        o1Var.c = DialogObject.getName(UserConfig.getInstance(this.a).getCurrentUser());
        o1Var.e = System.currentTimeMillis();
        k(i10);
        this.e = o1Var.a;
    }

    public final void l(File file, byte[] bArr) {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        if (this.d) {
            try {
                Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
                cipher.init(1, g());
                byte[] iv = cipher.getIV();
                fileOutputStream.write(iv.length);
                fileOutputStream.write(iv);
                bArr = cipher.doFinal(bArr);
            } catch (Exception e10) {
                FileLog.e(e10);
                throw new RuntimeException("UNKNOWN_ERROR");
            }
        }
        fileOutputStream.write(bArr);
        fileOutputStream.close();
    }

    public final void m(JSONObject jSONObject) {
        try {
            byte[] bytes = jSONObject.toString().getBytes();
            if (bytes.length > 5242880) {
                throw new RuntimeException("QUOTA_EXCEEDED");
            }
            try {
                l(c(), bytes);
            } catch (Exception e10) {
                FileLog.e(e10);
                throw new RuntimeException("UNKNOWN_ERROR");
            }
        } catch (Exception e11) {
            FileLog.e(e11);
            throw new RuntimeException("UNKNOWN_ERROR");
        } catch (OutOfMemoryError e12) {
            FileLog.e(e12);
            throw new RuntimeException("QUOTA_EXCEEDED");
        }
    }

    public final void n(String str, String str2) {
        boolean z10 = this.d;
        if (z10 && Build.VERSION.SDK_INT < 23) {
            throw new RuntimeException("UNSUPPORTED");
        }
        if (str2.length() + str.length() > 5242880) {
            throw new RuntimeException("QUOTA_EXCEEDED");
        }
        JSONObject e10 = e(c());
        try {
            e10.put(str, str2);
            if (e10.length() > 10 && z10) {
                throw new RuntimeException("QUOTA_EXCEEDED");
            }
            m(e10);
            if (z10) {
                try {
                    HashMap i9 = i();
                    o1 o1Var = (o1) i9.get(this.e);
                    if (o1Var != null) {
                        o1Var.e = System.currentTimeMillis();
                        k(i9);
                    }
                } catch (Exception unused) {
                }
            }
        } catch (Exception e11) {
            FileLog.e(e11);
            throw new RuntimeException("UNKNOWN_ERROR");
        }
    }
}
