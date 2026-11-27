// default package

import android.os.Build;
import android.text.TextUtils;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes3.dex */
public final class ij0 {
    public String a = null;
    public String b = null;
    public String c = null;
    public byte d = 0;

    public final ij0 a() {
        if (TextUtils.isEmpty(this.a)) {
            lq5.j("Title must be set and non-empty.");
            return null;
        }
        if (!nrd.c(this.d)) {
            StringBuilder sb = new StringBuilder("Authenticator combination is unsupported on API ");
            sb.append(Build.VERSION.SDK_INT);
            sb.append(": ");
            byte b = this.d;
            sb.append(b != 15 ? b != 255 ? b != 32768 ? b != 32783 ? b != 33023 ? String.valueOf((int) b) : "BIOMETRIC_WEAK | DEVICE_CREDENTIAL" : "BIOMETRIC_STRONG | DEVICE_CREDENTIAL" : "DEVICE_CREDENTIAL" : "BIOMETRIC_WEAK" : "BIOMETRIC_STRONG");
            throw new IllegalArgumentException(sb.toString());
        }
        byte b2 = this.d;
        boolean b3 = b2 != 0 ? nrd.b(b2) : false;
        if (TextUtils.isEmpty(this.c) && !b3) {
            lq5.j("Negative text must be set and non-empty.");
            return null;
        }
        if (!TextUtils.isEmpty(this.c) && b3) {
            lq5.j("Negative text must not be set if device credential authentication is allowed.");
            return null;
        }
        String str = this.a;
        String str2 = this.b;
        String str3 = this.c;
        byte b4 = this.d;
        ij0 ij0Var = new ij0();
        ij0Var.a = str;
        ij0Var.b = str2;
        ij0Var.c = str3;
        ij0Var.d = b4;
        return ij0Var;
    }
}
