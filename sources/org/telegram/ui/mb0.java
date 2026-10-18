package org.telegram.ui;

import android.text.TextUtils;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class mb0 extends pg.a {
    public final CharSequence c;
    public final int d;
    public final int e;
    public final int f;

    public mb0(int i10, int i11, CharSequence charSequence, int i12, int i13) {
        super(i10, false);
        this.c = charSequence;
        this.d = i11;
        this.e = i12;
        this.f = i13;
    }

    public static mb0 b(int i10, String str) {
        return new mb0(4, 0, str, i10, 0);
    }

    public static mb0 c(int i10, int i11, String str) {
        return new mb0(3, i10, str, i11, 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mb0)) {
            return false;
        }
        mb0 mb0Var = (mb0) obj;
        int i10 = mb0Var.a;
        int i11 = this.a;
        if (i10 != i11) {
            return false;
        }
        if (i11 == 3 && mb0Var.d != this.d) {
            return false;
        }
        if (i11 == 5 && mb0Var.f != this.f) {
            return false;
        }
        if ((i11 == 3 || i11 == 4) && mb0Var.e != this.e) {
            return false;
        }
        return !(i11 == 0 || i11 == 2 || i11 == 3 || i11 == 4 || i11 == 5) || TextUtils.equals(mb0Var.c, this.c);
    }
}
