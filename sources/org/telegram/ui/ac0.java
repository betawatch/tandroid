package org.telegram.ui;

import android.text.TextUtils;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class ac0 extends bg.b {
    public final CharSequence c;
    public final int d;
    public final int e;
    public final int f;

    public ac0(int i10, int i11, CharSequence charSequence, int i12, int i13) {
        super(i10, false);
        this.c = charSequence;
        this.d = i11;
        this.e = i12;
        this.f = i13;
    }

    public static ac0 b(int i10, String str) {
        return new ac0(4, 0, str, i10, 0);
    }

    public static ac0 c(int i10, int i11, String str) {
        return new ac0(3, i10, str, i11, 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ac0)) {
            return false;
        }
        ac0 ac0Var = (ac0) obj;
        int i10 = ac0Var.a;
        int i11 = this.a;
        if (i10 != i11) {
            return false;
        }
        if (i11 == 3 && ac0Var.d != this.d) {
            return false;
        }
        if (i11 == 5 && ac0Var.f != this.f) {
            return false;
        }
        if ((i11 == 3 || i11 == 4) && ac0Var.e != this.e) {
            return false;
        }
        return !(i11 == 0 || i11 == 2 || i11 == 3 || i11 == 4 || i11 == 5) || TextUtils.equals(ac0Var.c, this.c);
    }
}
