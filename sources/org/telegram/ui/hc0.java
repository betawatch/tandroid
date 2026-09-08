package org.telegram.ui;

import android.text.TextUtils;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class hc0 extends pg.a {
    public final CharSequence c;
    public final int d;
    public final int e;
    public final int f;

    public hc0(int i10, int i11, CharSequence charSequence, int i12, int i13) {
        super(i10, false);
        this.c = charSequence;
        this.d = i11;
        this.e = i12;
        this.f = i13;
    }

    public static hc0 b(int i10, String str) {
        return new hc0(4, 0, str, i10, 0);
    }

    public static hc0 c(int i10, int i11, String str) {
        return new hc0(3, i10, str, i11, 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hc0)) {
            return false;
        }
        hc0 hc0Var = (hc0) obj;
        int i10 = hc0Var.a;
        int i11 = this.a;
        if (i10 != i11) {
            return false;
        }
        if (i11 == 3 && hc0Var.d != this.d) {
            return false;
        }
        if (i11 == 5 && hc0Var.f != this.f) {
            return false;
        }
        if ((i11 == 3 || i11 == 4) && hc0Var.e != this.e) {
            return false;
        }
        return !(i11 == 0 || i11 == 2 || i11 == 3 || i11 == 4 || i11 == 5) || TextUtils.equals(hc0Var.c, this.c);
    }
}
