package ii;

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
import org.telegram.messenger.bd;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.l10;
import org.telegram.messenger.p10;
import org.telegram.messenger.qr;
import org.telegram.messenger.u10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
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
    public android.support.v4.media.c i;
    public ai.q4 j;

    public r(Context context, int i3, long j10) {
        this.a = context;
        this.b = i3;
        this.c = j10;
        h();
    }

    public static void b() {
        Context context = org.telegram.messenger.t0.b;
        if (context == null) {
            return;
        }
        for (int i3 = 0; i3 < 4; i3++) {
            context.getSharedPreferences("2botbiometry_" + i3, 0).edit().clear().apply();
        }
        k.clear();
    }

    public static r c(Context context, int i3, long j10) {
        Pair pair = new Pair(Integer.valueOf(i3), Long.valueOf(j10));
        WeakHashMap weakHashMap = k;
        r rVar = (r) weakHashMap.get(pair);
        if (rVar != null) {
            return rVar;
        }
        r rVar2 = new r(context, i3, j10);
        weakHashMap.put(pair, rVar2);
        return rVar2;
    }

    public static void d(Activity activity, int i3, u10 u10Var) {
        int i10 = 0;
        SharedPreferences sharedPreferences = activity.getSharedPreferences("2botbiometry_" + i3, 0);
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
            r c2 = c(activity, i3, l10.longValue());
            if (c2.e && c2.f) {
                hashMap.put(l10, Boolean.valueOf(!c2.d));
            }
        }
        if (arrayList.isEmpty()) {
            u10Var.a(new ArrayList());
        } else {
            qr.a0(i3).a.c(new bi.q0(i3, arrayList, hashMap, u10Var, 4));
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
        long j10 = this.c;
        sb2.append(j10);
        if (keyStore2.containsAlias(sb2.toString())) {
            return (SecretKey) l.getKey("9bot_" + j10, null);
        }
        KeyGenParameterSpec.Builder builder = new KeyGenParameterSpec.Builder("9bot_" + j10, 3);
        builder.setBlockModes("CBC");
        builder.setEncryptionPaddings("PKCS7Padding");
        builder.setUserAuthenticationRequired(true);
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 30) {
            builder.setUserAuthenticationParameters(60, 2);
        }
        if (i3 >= 24) {
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
        } catch (Exception e10) {
            a8.g(e10, true);
        }
        if (new android.support.v4.media.session.a0(new androidx.biometric.t(context, 0)).b(15) == 0) {
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
            long j10 = this.c;
            sb2.append(j10);
            string = sharedPreferences.getString(sb2.toString(), null);
            if (string == null) {
                byte[] bArr = new byte[32];
                new SecureRandom().nextBytes(bArr);
                SharedPreferences.Editor edit = sharedPreferences.edit();
                String p10 = a1.g.p(j10, "device_id");
                string = Utilities.f(bArr);
                edit.putString(p10, string).apply();
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
        long j102 = this.c;
        sb22.append(j102);
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
        long j10 = this.c;
        this.g = sharedPreferences.getString(String.valueOf(j10), null);
        this.h = sharedPreferences.getString(String.valueOf(j10) + "_iv", null);
        boolean z10 = true;
        boolean z11 = this.g != null;
        this.e = z11;
        if (!z11) {
            if (!sharedPreferences.getBoolean(j10 + "_requested", false)) {
                z10 = false;
            }
        }
        this.f = z10;
        this.d = sharedPreferences.getBoolean(j10 + "_disabled", false);
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

    public final void j(String str, boolean z10, String str2, p10 p10Var) {
        int i3;
        this.j = null;
        try {
            if (this.i == null) {
                this.i = new android.support.v4.media.c(LaunchActivity.K1, f0.d.e(this.a), new p(this, 0));
            }
            androidx.biometric.v i10 = i(z10);
            TLRPC.User a22 = hp.s1(this.b).a2(Long.valueOf(this.c));
            l6.n nVar = new l6.n(1);
            nVar.b = l10.p(a22);
            nVar.d = bd.M0(2131753756, null);
            nVar.a = 15;
            if (!TextUtils.isEmpty(str)) {
                nVar.c = str;
            }
            l6.n c2 = nVar.c();
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
                        p10Var.a(Boolean.TRUE, null, null);
                        return;
                    } catch (Exception e10) {
                        a8.g(e10, true);
                        i10 = i(z10);
                    }
                }
            }
            this.j = new ai.q4(8, p10Var, (i10 == null || Build.VERSION.SDK_INT >= 30) ? null : i10);
            if (i10 == null || (i3 = Build.VERSION.SDK_INT) >= 30) {
                this.i.Y(c2, null);
                return;
            }
            android.support.v4.media.c cVar = this.i;
            cVar.getClass();
            int i11 = c2.a;
            int i12 = i11 != 0 ? i11 : 15;
            if ((i12 & hs.e4) == 255) {
                throw new IllegalArgumentException("Crypto-based authentication is not supported for Class 2 (Weak) biometrics.");
            }
            if (i3 < 30 && b8.k0.a(i12)) {
                throw new IllegalArgumentException("Crypto-based authentication is not supported for device credential prior to API 30.");
            }
            cVar.Y(c2, i10);
        } catch (Exception e11) {
            a8.g(e11, true);
            p10Var.a(Boolean.FALSE, null, null);
        }
    }

    public final void k() {
        SharedPreferences.Editor edit = this.a.getSharedPreferences("2botbiometry_" + this.b, 0).edit();
        boolean z10 = this.f;
        long j10 = this.c;
        if (z10) {
            edit.putBoolean(j10 + "_requested", true);
        } else {
            edit.remove(j10 + "_requested");
        }
        if (this.e) {
            String valueOf = String.valueOf(j10);
            String str = this.g;
            if (str == null) {
                str = "";
            }
            edit.putString(valueOf, str);
            String str2 = String.valueOf(j10) + "_iv";
            String str3 = this.h;
            edit.putString(str2, str3 != null ? str3 : "");
        } else {
            edit.remove(String.valueOf(j10));
            edit.remove(String.valueOf(j10) + "_iv");
        }
        if (this.d) {
            edit.putBoolean(j10 + "_disabled", true);
        } else {
            edit.remove(j10 + "_disabled");
        }
        edit.apply();
    }

    public final void l(String str, final String str2, final ai.m mVar) {
        j(str, false, str2, new p10() { // from class: ii.o
            @Override // org.telegram.messenger.p10
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
                mVar.a(bool);
            }
        });
    }
}
