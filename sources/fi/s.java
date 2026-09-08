package fi;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.security.keystore.KeyGenParameterSpec;
import android.text.TextUtils;
import android.util.Pair;
import bi.k8;
import java.nio.charset.StandardCharsets;
import java.security.KeyStore;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import org.json.JSONObject;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final class s {
    public static final WeakHashMap k = new WeakHashMap();
    public static KeyStore l;
    public final Context a;
    public final int b;
    public final long c;
    public boolean d;
    public boolean e;
    public boolean f;
    public String g;
    public String h;
    public a4.m i;
    public bi.f0 j;

    public s(Context context, int i10, long j3) {
        this.a = context;
        this.b = i10;
        this.c = j3;
        h();
    }

    public static void b() {
        Context context = ApplicationLoader.applicationContext;
        if (context == null) {
            return;
        }
        for (int i10 = 0; i10 < 4; i10++) {
            context.getSharedPreferences("2botbiometry_" + i10, 0).edit().clear().apply();
        }
        k.clear();
    }

    public static s c(Context context, int i10, long j3) {
        Pair pair = new Pair(Integer.valueOf(i10), Long.valueOf(j3));
        WeakHashMap weakHashMap = k;
        s sVar = (s) weakHashMap.get(pair);
        if (sVar != null) {
            return sVar;
        }
        s sVar2 = new s(context, i10, j3);
        weakHashMap.put(pair, sVar2);
        return sVar2;
    }

    public static void d(Activity activity, int i10, Utilities.Callback callback) {
        int i11 = 0;
        SharedPreferences sharedPreferences = activity.getSharedPreferences("2botbiometry_" + i10, 0);
        ArrayList arrayList = new ArrayList();
        Iterator<Map.Entry<String, ?>> it = sharedPreferences.getAll().entrySet().iterator();
        while (it.hasNext()) {
            String key = it.next().getKey();
            if (key.endsWith("_requested")) {
                try {
                    arrayList.add(Long.valueOf(Long.parseLong(key.substring(0, key.length() - 10))));
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
            }
        }
        HashMap hashMap = new HashMap();
        int size = arrayList.size();
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            Long l4 = (Long) obj;
            s c10 = c(activity, i10, l4.longValue());
            if (c10.e && c10.f) {
                hashMap.put(l4, Boolean.valueOf(!c10.d));
            }
        }
        if (arrayList.isEmpty()) {
            callback.run(new ArrayList());
        } else {
            MessagesStorage.getInstance(i10).getStorageQueue().postRunnable(new k8(i10, arrayList, hashMap, callback));
        }
    }

    public final boolean a() {
        return this.f;
    }

    public final SecretKey e() {
        if (l == null) {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            l = keyStore;
            keyStore.load(null);
        }
        KeyStore keyStore2 = l;
        StringBuilder sb2 = new StringBuilder("9bot_");
        long j3 = this.c;
        sb2.append(j3);
        if (keyStore2.containsAlias(sb2.toString())) {
            return (SecretKey) l.getKey("9bot_" + j3, null);
        }
        KeyGenParameterSpec.Builder builder = new KeyGenParameterSpec.Builder("9bot_" + j3, 3);
        builder.setBlockModes("CBC");
        builder.setEncryptionPaddings("PKCS7Padding");
        builder.setUserAuthenticationRequired(true);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            builder.setUserAuthenticationParameters(60, 2);
        }
        if (i10 >= 24) {
            builder.setInvalidatedByBiometricEnrollment(true);
        }
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
        keyGenerator.init(builder.build());
        return keyGenerator.generateKey();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final JSONObject f() {
        String str;
        String string;
        JSONObject jSONObject = new JSONObject();
        Context context = this.a;
        try {
        } catch (Exception e7) {
            FileLog.e(e7);
        }
        if (new aa.a(new androidx.biometric.s(context, 0)).g(15) == 0) {
            str = "unknown";
            if (str == null) {
                jSONObject.put("available", true);
                jSONObject.put(TeXSymbolParser.TYPE_ATTR, str);
            } else {
                jSONObject.put("available", false);
            }
            jSONObject.put("access_requested", this.f);
            jSONObject.put("access_granted", (this.e || this.d) ? false : true);
            jSONObject.put("token_saved", !TextUtils.isEmpty(this.g));
            SharedPreferences sharedPreferences = context.getSharedPreferences("2botbiometry_" + this.b, 0);
            StringBuilder sb2 = new StringBuilder("device_id");
            long j3 = this.c;
            sb2.append(j3);
            string = sharedPreferences.getString(sb2.toString(), null);
            if (string == null) {
                byte[] bArr = new byte[32];
                new SecureRandom().nextBytes(bArr);
                SharedPreferences.Editor edit = sharedPreferences.edit();
                String o9 = a4.a.o(j3, "device_id");
                string = Utilities.bytesToHex(bArr);
                edit.putString(o9, string).apply();
            }
            jSONObject.put("device_id", string);
            return jSONObject;
        }
        str = null;
        if (str == null) {
        }
        jSONObject.put("access_requested", this.f);
        jSONObject.put("access_granted", (this.e || this.d) ? false : true);
        jSONObject.put("token_saved", !TextUtils.isEmpty(this.g));
        SharedPreferences sharedPreferences2 = context.getSharedPreferences("2botbiometry_" + this.b, 0);
        StringBuilder sb22 = new StringBuilder("device_id");
        long j32 = this.c;
        sb22.append(j32);
        string = sharedPreferences2.getString(sb22.toString(), null);
        if (string == null) {
        }
        jSONObject.put("device_id", string);
        return jSONObject;
    }

    public final boolean g() {
        return this.e;
    }

    public final void h() {
        SharedPreferences sharedPreferences = this.a.getSharedPreferences("2botbiometry_" + this.b, 0);
        long j3 = this.c;
        this.g = sharedPreferences.getString(String.valueOf(j3), null);
        this.h = sharedPreferences.getString(String.valueOf(j3) + "_iv", null);
        boolean z10 = true;
        boolean z11 = this.g != null;
        this.e = z11;
        if (!z11) {
            if (!sharedPreferences.getBoolean(j3 + "_requested", false)) {
                z10 = false;
            }
        }
        this.f = z10;
        this.d = sharedPreferences.getBoolean(j3 + "_disabled", false);
    }

    public final androidx.biometric.u i(boolean z10) {
        try {
            if (Build.VERSION.SDK_INT < 23) {
                return null;
            }
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
            SecretKey e7 = e();
            if (z10) {
                cipher.init(2, e7, new IvParameterSpec(Utilities.hexToBytes(this.h)));
            } else {
                cipher.init(1, e7);
            }
            return new androidx.biometric.u(cipher);
        } catch (Exception e10) {
            FileLog.e(e10);
            return null;
        }
    }

    public final void j(String str, boolean z10, String str2, Utilities.Callback3 callback3) {
        int i10;
        int i11;
        this.j = null;
        try {
            if (this.i == null) {
                this.i = new a4.m(LaunchActivity.G1, f0.e.e(this.a), new q(this));
            }
            androidx.biometric.u i12 = i(z10);
            TLRPC.User user = MessagesController.getInstance(this.b).getUser(Long.valueOf(this.c));
            j6.l lVar = new j6.l(1);
            lVar.b = UserObject.getUserName(user);
            lVar.d = LocaleController.getString(R.string.Back);
            lVar.a = 15;
            if (!TextUtils.isEmpty(str)) {
                lVar.c = str;
            }
            j6.l b10 = lVar.b();
            if (i12 != null) {
                Cipher cipher = i12.b;
                if (!z10 && (i11 = Build.VERSION.SDK_INT) >= 30) {
                    try {
                        if (TextUtils.isEmpty(str2)) {
                            this.g = null;
                        } else if (i11 < 23) {
                            this.g = str2;
                        } else {
                            this.g = Utilities.bytesToHex(cipher.doFinal(str2.getBytes(StandardCharsets.UTF_8)));
                            this.h = Utilities.bytesToHex(cipher.getIV());
                        }
                        k();
                        callback3.run(Boolean.TRUE, null, null);
                        return;
                    } catch (Exception e7) {
                        FileLog.e(e7);
                        i12 = i(z10);
                    }
                }
            }
            this.j = new bi.f0(3, callback3, (i12 == null || Build.VERSION.SDK_INT >= 30) ? null : i12);
            if (i12 == null || (i10 = Build.VERSION.SDK_INT) >= 30) {
                this.i.h0(b10, null);
                return;
            }
            a4.m mVar = this.i;
            mVar.getClass();
            int i13 = b10.a;
            int i14 = i13 != 0 ? i13 : 15;
            if ((i14 & 255) == 255) {
                throw new IllegalArgumentException("Crypto-based authentication is not supported for Class 2 (Weak) biometrics.");
            }
            if (i10 < 30 && v7.m.a(i14)) {
                throw new IllegalArgumentException("Crypto-based authentication is not supported for device credential prior to API 30.");
            }
            mVar.h0(b10, i12);
        } catch (Exception e10) {
            FileLog.e(e10);
            callback3.run(Boolean.FALSE, null, null);
        }
    }

    public final void k() {
        SharedPreferences.Editor edit = this.a.getSharedPreferences("2botbiometry_" + this.b, 0).edit();
        boolean z10 = this.f;
        long j3 = this.c;
        if (z10) {
            edit.putBoolean(j3 + "_requested", true);
        } else {
            edit.remove(j3 + "_requested");
        }
        if (this.e) {
            String valueOf = String.valueOf(j3);
            String str = this.g;
            if (str == null) {
                str = "";
            }
            edit.putString(valueOf, str);
            String str2 = String.valueOf(j3) + "_iv";
            String str3 = this.h;
            edit.putString(str2, str3 != null ? str3 : "");
        } else {
            edit.remove(String.valueOf(j3));
            edit.remove(String.valueOf(j3) + "_iv");
        }
        if (this.d) {
            edit.putBoolean(j3 + "_disabled", true);
        } else {
            edit.remove(j3 + "_disabled");
        }
        edit.apply();
    }

    public final void l(String str, final String str2, final bi.o4 o4Var) {
        j(str, false, str2, new Utilities.Callback3() { // from class: fi.p
            @Override // org.telegram.messenger.Utilities.Callback3
            public final void run(Object obj, Object obj2, Object obj3) {
                String str3 = str2;
                Boolean bool = (Boolean) obj;
                androidx.biometric.t tVar = (androidx.biometric.t) obj2;
                androidx.biometric.u uVar = (androidx.biometric.u) obj3;
                s sVar = s.this;
                sVar.getClass();
                if (tVar != null) {
                    try {
                        if (TextUtils.isEmpty(str3)) {
                            sVar.g = null;
                            sVar.h = null;
                        } else {
                            int i10 = Build.VERSION.SDK_INT;
                            if (i10 < 23) {
                                sVar.g = str3;
                                sVar.h = null;
                            } else {
                                if (i10 >= 30) {
                                    uVar = sVar.i(false);
                                }
                                if (uVar == null) {
                                    throw new RuntimeException("No cryptoObject found");
                                }
                                Cipher cipher = uVar.b;
                                sVar.g = Utilities.bytesToHex(cipher.doFinal(str3.getBytes(StandardCharsets.UTF_8)));
                                sVar.h = Utilities.bytesToHex(cipher.getIV());
                            }
                        }
                        sVar.k();
                    } catch (Exception e7) {
                        FileLog.e(e7);
                        bool = Boolean.FALSE;
                    }
                }
                o4Var.run(bool);
            }
        });
    }
}
