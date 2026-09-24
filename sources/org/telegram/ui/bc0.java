package org.telegram.ui;

import android.text.TextUtils;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class bc0 extends og.a {
    public final CharSequence c;
    public final int d;
    public final int e;
    public final int f;

    public bc0(int i10, int i11, CharSequence charSequence, int i12, int i13) {
        super(i10, false);
        this.c = charSequence;
        this.d = i11;
        this.e = i12;
        this.f = i13;
    }

    public static bc0 b(int i10, String str) {
        return new bc0(4, 0, str, i10, 0);
    }

    public static bc0 c(int i10, int i11, String str) {
        return new bc0(3, i10, str, i11, 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bc0)) {
            return false;
        }
        bc0 bc0Var = (bc0) obj;
        int i10 = bc0Var.a;
        int i11 = this.a;
        if (i10 != i11) {
            return false;
        }
        if (i11 == 3 && bc0Var.d != this.d) {
            return false;
        }
        if (i11 == 5 && bc0Var.f != this.f) {
            return false;
        }
        if ((i11 == 3 || i11 == 4) && bc0Var.e != this.e) {
            return false;
        }
        return !(i11 == 0 || i11 == 2 || i11 == 3 || i11 == 4 || i11 == 5) || TextUtils.equals(bc0Var.c, this.c);
    }
}
