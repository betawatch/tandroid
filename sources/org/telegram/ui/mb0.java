package org.telegram.ui;

import android.text.TextUtils;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class mb0 extends wf.a {
    public final CharSequence c;
    public final int d;
    public final int e;
    public final int f;

    public mb0(int i9, int i10, CharSequence charSequence, int i11, int i12) {
        super(i9, false);
        this.c = charSequence;
        this.d = i10;
        this.e = i11;
        this.f = i12;
    }

    public static mb0 b(int i9, String str) {
        return new mb0(4, 0, str, i9, 0);
    }

    public static mb0 c(int i9, int i10, String str) {
        return new mb0(3, i9, str, i10, 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mb0)) {
            return false;
        }
        mb0 mb0Var = (mb0) obj;
        int i9 = mb0Var.a;
        int i10 = this.a;
        if (i9 != i10) {
            return false;
        }
        if (i10 == 3 && mb0Var.d != this.d) {
            return false;
        }
        if (i10 == 5 && mb0Var.f != this.f) {
            return false;
        }
        if ((i10 == 3 || i10 == 4) && mb0Var.e != this.e) {
            return false;
        }
        return !(i10 == 0 || i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5) || TextUtils.equals(mb0Var.c, this.c);
    }
}
