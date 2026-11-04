package org.telegram.ui;

import android.text.TextUtils;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class o90 extends sg.a {
    public final CharSequence c;
    public final int d;
    public final int e;
    public final int f;

    public o90(int i3, int i10, CharSequence charSequence, int i11, int i12) {
        super(i3, false);
        this.c = charSequence;
        this.d = i10;
        this.e = i11;
        this.f = i12;
    }

    public static o90 b(int i3, String str) {
        return new o90(4, 0, str, i3, 0);
    }

    public static o90 c(int i3, int i10, String str) {
        return new o90(3, i3, str, i10, 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o90)) {
            return false;
        }
        o90 o90Var = (o90) obj;
        int i3 = o90Var.a;
        int i10 = this.a;
        if (i3 != i10) {
            return false;
        }
        if (i10 == 3 && o90Var.d != this.d) {
            return false;
        }
        if (i10 == 5 && o90Var.f != this.f) {
            return false;
        }
        if ((i10 == 3 || i10 == 4) && o90Var.e != this.e) {
            return false;
        }
        return !(i10 == 0 || i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5) || TextUtils.equals(o90Var.c, this.c);
    }
}
