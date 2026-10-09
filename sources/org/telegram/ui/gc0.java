package org.telegram.ui;

import android.text.TextUtils;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class gc0 extends og.a {
    public final CharSequence c;
    public final int d;
    public final int e;
    public final int f;

    public gc0(int i10, int i11, CharSequence charSequence, int i12, int i13) {
        super(i10, false);
        this.c = charSequence;
        this.d = i11;
        this.e = i12;
        this.f = i13;
    }

    public static gc0 b(int i10, String str) {
        return new gc0(4, 0, str, i10, 0);
    }

    public static gc0 c(int i10, int i11, String str) {
        return new gc0(3, i10, str, i11, 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gc0)) {
            return false;
        }
        gc0 gc0Var = (gc0) obj;
        int i10 = gc0Var.a;
        int i11 = this.a;
        if (i10 != i11) {
            return false;
        }
        if (i11 == 3 && gc0Var.d != this.d) {
            return false;
        }
        if (i11 == 5 && gc0Var.f != this.f) {
            return false;
        }
        if ((i11 == 3 || i11 == 4) && gc0Var.e != this.e) {
            return false;
        }
        return !(i11 == 0 || i11 == 2 || i11 == 3 || i11 == 4 || i11 == 5) || TextUtils.equals(gc0Var.c, this.c);
    }
}
