// default package

import android.text.TextUtils;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class k86 extends ka {
    public final String c;
    public final int d;
    public final int e;
    public final boolean f;

    /* JADX WARN: Multi-variable type inference failed */
    public k86(int i, int i2, int i3, int i4, String str) {
        super(i, false);
        this.c = str;
        this.d = i2;
        this.e = i3;
        this.f = i4;
    }

    public static k86 b(int i, String str) {
        return new k86(4, 0, i, 0, str);
    }

    public static k86 c(int i, int i2, String str) {
        return new k86(3, i, i2, 0, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k86)) {
            return false;
        }
        k86 k86Var = (k86) obj;
        int i = k86Var.a;
        int i2 = this.a;
        if (i != i2) {
            return false;
        }
        if (i2 == 3 && k86Var.d != this.d) {
            return false;
        }
        if (i2 == 5 && k86Var.f != this.f) {
            return false;
        }
        if ((i2 == 3 || i2 == 4) && k86Var.e != this.e) {
            return false;
        }
        return !(i2 == 0 || i2 == 2 || i2 == 3 || i2 == 4 || i2 == 5) || TextUtils.equals(k86Var.c, this.c);
    }
}
