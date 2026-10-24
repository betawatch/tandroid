package org.telegram.ui;

import android.text.TextUtils;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class qb0 extends pg.a {
    public final CharSequence c;
    public final int d;
    public final int e;
    public final int f;

    public qb0(int i10, int i11, CharSequence charSequence, int i12, int i13) {
        super(i10, false);
        this.c = charSequence;
        this.d = i11;
        this.e = i12;
        this.f = i13;
    }

    public static qb0 b(int i10, String str) {
        return new qb0(4, 0, str, i10, 0);
    }

    public static qb0 c(int i10, int i11, String str) {
        return new qb0(3, i10, str, i11, 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qb0)) {
            return false;
        }
        qb0 qb0Var = (qb0) obj;
        int i10 = qb0Var.a;
        int i11 = this.a;
        if (i10 != i11) {
            return false;
        }
        if (i11 == 3 && qb0Var.d != this.d) {
            return false;
        }
        if (i11 == 5 && qb0Var.f != this.f) {
            return false;
        }
        if ((i11 == 3 || i11 == 4) && qb0Var.e != this.e) {
            return false;
        }
        return !(i11 == 0 || i11 == 2 || i11 == 3 || i11 == 4 || i11 == 5) || TextUtils.equals(qb0Var.c, this.c);
    }
}
