package ki;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.security.keystore.KeyGenParameterSpec;
import android.text.TextUtils;
import android.util.Pair;
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
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.hd;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.q10;
import org.telegram.messenger.u10;
import org.telegram.messenger.vr;
import org.telegram.messenger.z10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes4.dex */
public final class r {
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
    public d6.i i;
    public bi.e4 j;

    public r(Context context, int i7, long j3) {
        this.a = context;
        this.b = i7;
        this.c = j3;
        h();
    }

    public static void b() {
        Context context = org.telegram.messenger.t0.b;
        if (context == null) {
            return;
        }
        for (int i7 = 0; i7 < 4; i7++) {
            context.getSharedPreferences("2botbiometry_" + i7, 0).edit().clear().apply();
        }
        k.clear();
    }

    public static r c(Context context, int i7, long j3) {
        Pair pair = new Pair(Integer.valueOf(i7), Long.valueOf(j3));
        WeakHashMap weakHashMap = k;
        r rVar = (r) weakHashMap.get(pair);
        if (rVar != null) {
            return rVar;
        }
        r rVar2 = new r(context, i7, j3);
        weakHashMap.put(pair, rVar2);
        return rVar2;
    }

    public static void d(Activity activity, int i7, z10 z10Var) {
        int i10 = 0;
        SharedPreferences sharedPreferences = activity.getSharedPreferences("2botbiometry_" + i7, 0);
        ArrayList arrayList = new ArrayList();
        Iterator<Map.Entry<String, ?>> it = sharedPreferences.getAll().entrySet().iterator();
        while (it.hasNext()) {
            String key = it.next().getKey();
            if (key.endsWith("_requested")) {
                try {
                    arrayList.add(Long.valueOf(Long.parseLong(key.substring(0, key.length() - 10))));
                } catch (Exception e10) {
                    a8.g(e10, true);
                }
            }
        }
        HashMap hashMap = new HashMap();
        int size = arrayList.size();
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            Long l10 = (Long) obj;
            r c10 = c(activity, i7, l10.longValue());
            if (c10.e && c10.f) {
                hashMap.put(l10, Boolean.valueOf(!c10.d));
            }
        }
        if (arrayList.isEmpty()) {
            z10Var.a(new ArrayList());
        } else {
            vr.a0(i7).a.c(new ci.p0(i7, arrayList, hashMap, z10Var, 8));
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
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 30) {
            builder.setUserAuthenticationParameters(60, 2);
        }
        if (i7 >= 24) {
            builder.setInvalidatedByBiometricEnrollment(true);
        }
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
        keyGenerator.init(builder.build());
        return keyGenerator.generateKey();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final JSONObject f() {
        String str;
        String string;
        JSONObject jSONObject = new JSONObject();
        Context context = this.a;
        try {
        } catch (Exception e10) {
            a8.g(e10, true);
        }
        if (new android.support.v4.media.session.a0(new androidx.biometric.t(context)).c(15) == 0) {
            str = "unknown";
            if (str == null) {
                jSONObject.put("available", true);
                jSONObject.put(TeXSymbolParser.TYPE_ATTR, str);
            } else {
                jSONObject.put("available", false);
            }
            jSONObject.put("access_requested", this.f);
            jSONObject.put("access_granted", (this.e || this.d) ? false : true);
            jSONObject.put("token_saved", true ^ TextUtils.isEmpty(this.g));
            SharedPreferences sharedPreferences = context.getSharedPreferences("2botbiometry_" + this.b, 0);
            StringBuilder sb2 = new StringBuilder("device_id");
            long j3 = this.c;
            sb2.append(j3);
            string = sharedPreferences.getString(sb2.toString(), null);
            if (string == null) {
                byte[] bArr = new byte[32];
                new SecureRandom().nextBytes(bArr);
                SharedPreferences.Editor edit = sharedPreferences.edit();
                String o4 = a8.p0.o(j3, "device_id");
                string = Utilities.f(bArr);
                edit.putString(o4, string).apply();
            }
            jSONObject.put("device_id", string);
            return jSONObject;
        }
        str = null;
        if (str == null) {
        }
        jSONObject.put("access_requested", this.f);
        jSONObject.put("access_granted", (this.e || this.d) ? false : true);
        jSONObject.put("token_saved", true ^ TextUtils.isEmpty(this.g));
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

    public final androidx.biometric.v i(boolean z10) {
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
            SecretKey e10 = e();
            if (z10) {
                cipher.init(2, e10, new IvParameterSpec(Utilities.v(this.h)));
            } else {
                cipher.init(1, e10);
            }
            return new androidx.biometric.v(cipher);
        } catch (Exception e11) {
            a8.g(e11, true);
            return null;
        }
    }

    public final void j(String str, boolean z10, String str2, u10 u10Var) {
        int i7;
        this.j = null;
        try {
            if (this.i == null) {
                this.i = new d6.i(LaunchActivity.H1, f0.d.e(this.a), new p(this, 0));
            }
            androidx.biometric.v i10 = i(z10);
            TLRPC.User a22 = np.s1(this.b).a2(Long.valueOf(this.c));
            m6.n nVar = new m6.n(1);
            nVar.b = q10.p(a22);
            nVar.d = hd.M0(2131753756, null);
            nVar.a = 15;
            if (!TextUtils.isEmpty(str)) {
                nVar.c = str;
            }
            m6.n b10 = nVar.b();
            if (i10 != null) {
                Cipher cipher = i10.b;
                if (!z10 && Build.VERSION.SDK_INT >= 30) {
                    try {
                        if (TextUtils.isEmpty(str2)) {
                            this.g = null;
                        } else {
                            this.g = Utilities.f(cipher.doFinal(str2.getBytes(StandardCharsets.UTF_8)));
                            this.h = Utilities.f(cipher.getIV());
                        }
                        k();
                        u10Var.a(Boolean.TRUE, null, null);
                        return;
                    } catch (Exception e10) {
                        a8.g(e10, true);
                        i10 = i(z10);
                    }
                }
            }
            this.j = new bi.e4(8, u10Var, (i10 == null || Build.VERSION.SDK_INT >= 30) ? null : i10);
            if (i10 == null || (i7 = Build.VERSION.SDK_INT) >= 30) {
                this.i.N(b10, null);
                return;
            }
            d6.i iVar = this.i;
            iVar.getClass();
            int i11 = b10.a;
            int i12 = i11 != 0 ? i11 : 15;
            if ((i12 & ns.e4) == 255) {
                throw new IllegalArgumentException("Crypto-based authentication is not supported for Class 2 (Weak) biometrics.");
            }
            if (i7 < 30 && a8.l1.a(i12)) {
                throw new IllegalArgumentException("Crypto-based authentication is not supported for device credential prior to API 30.");
            }
            iVar.N(b10, i10);
        } catch (Exception e11) {
            a8.g(e11, true);
            u10Var.a(Boolean.FALSE, null, null);
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

    public final void l(String str, final String str2, final bi.j jVar) {
        j(str, false, str2, new u10() { // from class: ki.o
            @Override // org.telegram.messenger.u10
            public final void a(Object obj, Object obj2, Object obj3) {
                String str3 = str2;
                Boolean bool = (Boolean) obj;
                androidx.biometric.u uVar = (androidx.biometric.u) obj2;
                androidx.biometric.v vVar = (androidx.biometric.v) obj3;
                r rVar = r.this;
                rVar.getClass();
                if (uVar != null) {
                    try {
                        if (TextUtils.isEmpty(str3)) {
                            rVar.g = null;
                            rVar.h = null;
                        } else {
                            if (Build.VERSION.SDK_INT >= 30) {
                                vVar = rVar.i(false);
                            }
                            if (vVar == null) {
                                throw new RuntimeException("No cryptoObject found");
                            }
                            Cipher cipher = vVar.b;
                            rVar.g = Utilities.f(cipher.doFinal(str3.getBytes(StandardCharsets.UTF_8)));
                            rVar.h = Utilities.f(cipher.getIV());
                        }
                        rVar.k();
                    } catch (Exception e10) {
                        a8.g(e10, true);
                        bool = Boolean.FALSE;
                    }
                }
                jVar.a(bool);
            }
        });
    }
}
