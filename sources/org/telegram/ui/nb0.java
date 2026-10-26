package org.telegram.ui;

import android.text.TextUtils;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class nb0 extends qg.a {
    public final CharSequence c;
    public final int d;
    public final int e;
    public final int f;

    public nb0(int i10, int i11, CharSequence charSequence, int i12, int i13) {
        super(i10, false);
        this.c = charSequence;
        this.d = i11;
        this.e = i12;
        this.f = i13;
    }

    public static nb0 b(int i10, String str) {
        return new nb0(4, 0, str, i10, 0);
    }

    public static nb0 c(int i10, int i11, String str) {
        return new nb0(3, i10, str, i11, 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nb0)) {
            return false;
        }
        nb0 nb0Var = (nb0) obj;
        int i10 = nb0Var.a;
        int i11 = this.a;
        if (i10 != i11) {
            return false;
        }
        if (i11 == 3 && nb0Var.d != this.d) {
            return false;
        }
        if (i11 == 5 && nb0Var.f != this.f) {
            return false;
        }
        if ((i11 == 3 || i11 == 4) && nb0Var.e != this.e) {
            return false;
        }
        return !(i11 == 0 || i11 == 2 || i11 == 3 || i11 == 4 || i11 == 5) || TextUtils.equals(nb0Var.c, this.c);
    }
}
