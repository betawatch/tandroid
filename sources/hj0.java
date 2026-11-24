// default package

import android.os.Build;
import android.text.TextUtils;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final class hj0 {
    public String a = null;
    public String b = null;
    public String c = null;
    public byte d = 0;

    public final hj0 a() {
        if (TextUtils.isEmpty(this.a)) {
            w26.j("Title must be set and non-empty.");
            return null;
        }
        if (!wmd.c(this.d)) {
            StringBuilder sb = new StringBuilder("Authenticator combination is unsupported on API ");
            sb.append(Build.VERSION.SDK_INT);
            sb.append(": ");
            byte b = this.d;
            sb.append(b != 15 ? b != 255 ? b != 32768 ? b != 32783 ? b != 33023 ? String.valueOf((int) b) : "BIOMETRIC_WEAK | DEVICE_CREDENTIAL" : "BIOMETRIC_STRONG | DEVICE_CREDENTIAL" : "DEVICE_CREDENTIAL" : "BIOMETRIC_WEAK" : "BIOMETRIC_STRONG");
            throw new IllegalArgumentException(sb.toString());
        }
        byte b2 = this.d;
        boolean b3 = b2 != 0 ? wmd.b(b2) : false;
        if (TextUtils.isEmpty(this.c) && !b3) {
            w26.j("Negative text must be set and non-empty.");
            return null;
        }
        if (!TextUtils.isEmpty(this.c) && b3) {
            w26.j("Negative text must not be set if device credential authentication is allowed.");
            return null;
        }
        String str = this.a;
        String str2 = this.b;
        String str3 = this.c;
        byte b4 = this.d;
        hj0 hj0Var = new hj0();
        hj0Var.a = str;
        hj0Var.b = str2;
        hj0Var.c = str3;
        hj0Var.d = b4;
        return hj0Var;
    }
}
