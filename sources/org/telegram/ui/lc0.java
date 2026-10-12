package org.telegram.ui;

import android.text.TextUtils;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class lc0 extends pg.a {
    public final CharSequence c;
    public final int d;
    public final int e;
    public final int f;

    public lc0(int i10, int i11, CharSequence charSequence, int i12, int i13) {
        super(i10, false);
        this.c = charSequence;
        this.d = i11;
        this.e = i12;
        this.f = i13;
    }

    public static lc0 b(int i10, String str) {
        return new lc0(4, 0, str, i10, 0);
    }

    public static lc0 c(int i10, int i11, String str) {
        return new lc0(3, i10, str, i11, 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lc0)) {
            return false;
        }
        lc0 lc0Var = (lc0) obj;
        int i10 = lc0Var.a;
        int i11 = this.a;
        if (i10 != i11) {
            return false;
        }
        if (i11 == 3 && lc0Var.d != this.d) {
            return false;
        }
        if (i11 == 5 && lc0Var.f != this.f) {
            return false;
        }
        if ((i11 == 3 || i11 == 4) && lc0Var.e != this.e) {
            return false;
        }
        return !(i11 == 0 || i11 == 2 || i11 == 3 || i11 == 4 || i11 == 5) || TextUtils.equals(lc0Var.c, this.c);
    }
}
