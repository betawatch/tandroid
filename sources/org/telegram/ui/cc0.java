package org.telegram.ui;

import android.text.TextUtils;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class cc0 extends og.a {
    public final CharSequence c;
    public final int d;
    public final int e;
    public final int f;

    public cc0(int i10, int i11, CharSequence charSequence, int i12, int i13) {
        super(i10, false);
        this.c = charSequence;
        this.d = i11;
        this.e = i12;
        this.f = i13;
    }

    public static cc0 b(int i10, String str) {
        return new cc0(4, 0, str, i10, 0);
    }

    public static cc0 c(int i10, int i11, String str) {
        return new cc0(3, i10, str, i11, 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cc0)) {
            return false;
        }
        cc0 cc0Var = (cc0) obj;
        int i10 = cc0Var.a;
        int i11 = this.a;
        if (i10 != i11) {
            return false;
        }
        if (i11 == 3 && cc0Var.d != this.d) {
            return false;
        }
        if (i11 == 5 && cc0Var.f != this.f) {
            return false;
        }
        if ((i11 == 3 || i11 == 4) && cc0Var.e != this.e) {
            return false;
        }
        return !(i11 == 0 || i11 == 2 || i11 == 3 || i11 == 4 || i11 == 5) || TextUtils.equals(cc0Var.c, this.c);
    }
}
