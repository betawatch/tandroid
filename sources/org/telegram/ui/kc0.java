package org.telegram.ui;

import android.text.TextUtils;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class kc0 extends pg.a {
    public final CharSequence c;
    public final int d;
    public final int e;
    public final int f;

    public kc0(int i10, int i11, CharSequence charSequence, int i12, int i13) {
        super(i10, false);
        this.c = charSequence;
        this.d = i11;
        this.e = i12;
        this.f = i13;
    }

    public static kc0 b(int i10, String str) {
        return new kc0(4, 0, str, i10, 0);
    }

    public static kc0 c(int i10, int i11, String str) {
        return new kc0(3, i10, str, i11, 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kc0)) {
            return false;
        }
        kc0 kc0Var = (kc0) obj;
        int i10 = kc0Var.a;
        int i11 = this.a;
        if (i10 != i11) {
            return false;
        }
        if (i11 == 3 && kc0Var.d != this.d) {
            return false;
        }
        if (i11 == 5 && kc0Var.f != this.f) {
            return false;
        }
        if ((i11 == 3 || i11 == 4) && kc0Var.e != this.e) {
            return false;
        }
        return !(i11 == 0 || i11 == 2 || i11 == 3 || i11 == 4 || i11 == 5) || TextUtils.equals(kc0Var.c, this.c);
    }
}
