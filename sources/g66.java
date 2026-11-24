// default package

import android.text.TextUtils;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class g66 extends ja {
    public final String c;
    public final int d;
    public final int e;
    public final boolean f;

    /* JADX WARN: Multi-variable type inference failed */
    public g66(int i, int i2, int i3, int i4, String str) {
        super(i, false);
        this.c = str;
        this.d = i2;
        this.e = i3;
        this.f = i4;
    }

    public static g66 b(int i, String str) {
        return new g66(4, 0, i, 0, str);
    }

    public static g66 c(int i, int i2, String str) {
        return new g66(3, i, i2, 0, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g66)) {
            return false;
        }
        g66 g66Var = (g66) obj;
        int i = g66Var.a;
        int i2 = this.a;
        if (i != i2) {
            return false;
        }
        if (i2 == 3 && g66Var.d != this.d) {
            return false;
        }
        if (i2 == 5 && g66Var.f != this.f) {
            return false;
        }
        if ((i2 == 3 || i2 == 4) && g66Var.e != this.e) {
            return false;
        }
        return !(i2 == 0 || i2 == 2 || i2 == 3 || i2 == 4 || i2 == 5) || TextUtils.equals(g66Var.c, this.c);
    }
}
