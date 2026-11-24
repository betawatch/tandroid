// default package

import android.os.Build;
import android.text.TextUtils;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class hk0 {
    public String a = null;
    public String b = null;
    public String c = null;
    public byte d = 0;

    public final hk0 a() {
        if (TextUtils.isEmpty(this.a)) {
            u36.j("Title must be set and non-empty.");
            return null;
        }
        if (!zod.c(this.d)) {
            StringBuilder sb = new StringBuilder("Authenticator combination is unsupported on API ");
            sb.append(Build.VERSION.SDK_INT);
            sb.append(": ");
            byte b = this.d;
            sb.append(b != 15 ? b != 255 ? b != 32768 ? b != 32783 ? b != 33023 ? String.valueOf((int) b) : "BIOMETRIC_WEAK | DEVICE_CREDENTIAL" : "BIOMETRIC_STRONG | DEVICE_CREDENTIAL" : "DEVICE_CREDENTIAL" : "BIOMETRIC_WEAK" : "BIOMETRIC_STRONG");
            throw new IllegalArgumentException(sb.toString());
        }
        byte b2 = this.d;
        boolean b3 = b2 != 0 ? zod.b(b2) : false;
        if (TextUtils.isEmpty(this.c) && !b3) {
            u36.j("Negative text must be set and non-empty.");
            return null;
        }
        if (!TextUtils.isEmpty(this.c) && b3) {
            u36.j("Negative text must not be set if device credential authentication is allowed.");
            return null;
        }
        String str = this.a;
        String str2 = this.b;
        String str3 = this.c;
        byte b4 = this.d;
        hk0 hk0Var = new hk0();
        hk0Var.a = str;
        hk0Var.b = str2;
        hk0Var.c = str3;
        hk0Var.d = b4;
        return hk0Var;
    }
}
