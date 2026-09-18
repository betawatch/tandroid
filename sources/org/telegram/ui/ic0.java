package org.telegram.ui;

import android.text.TextUtils;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class ic0 extends og.a {
    public final CharSequence c;
    public final int d;
    public final int e;
    public final int f;

    public ic0(int i10, int i11, CharSequence charSequence, int i12, int i13) {
        super(i10, false);
        this.c = charSequence;
        this.d = i11;
        this.e = i12;
        this.f = i13;
    }

    public static ic0 b(int i10, String str) {
        return new ic0(4, 0, str, i10, 0);
    }

    public static ic0 c(int i10, int i11, String str) {
        return new ic0(3, i10, str, i11, 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ic0)) {
            return false;
        }
        ic0 ic0Var = (ic0) obj;
        int i10 = ic0Var.a;
        int i11 = this.a;
        if (i10 != i11) {
            return false;
        }
        if (i11 == 3 && ic0Var.d != this.d) {
            return false;
        }
        if (i11 == 5 && ic0Var.f != this.f) {
            return false;
        }
        if ((i11 == 3 || i11 == 4) && ic0Var.e != this.e) {
            return false;
        }
        return !(i11 == 0 || i11 == 2 || i11 == 3 || i11 == 4 || i11 == 5) || TextUtils.equals(ic0Var.c, this.c);
    }
}
