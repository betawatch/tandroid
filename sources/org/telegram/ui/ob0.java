package org.telegram.ui;

import android.text.TextUtils;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class ob0 extends zf.a {
    public final CharSequence c;
    public final int d;
    public final int e;
    public final int f;

    public ob0(int i10, int i11, CharSequence charSequence, int i12, int i13) {
        super(i10, false);
        this.c = charSequence;
        this.d = i11;
        this.e = i12;
        this.f = i13;
    }

    public static ob0 b(int i10, String str) {
        return new ob0(4, 0, str, i10, 0);
    }

    public static ob0 c(int i10, int i11, String str) {
        return new ob0(3, i10, str, i11, 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ob0)) {
            return false;
        }
        ob0 ob0Var = (ob0) obj;
        int i10 = ob0Var.a;
        int i11 = this.a;
        if (i10 != i11) {
            return false;
        }
        if (i11 == 3 && ob0Var.d != this.d) {
            return false;
        }
        if (i11 == 5 && ob0Var.f != this.f) {
            return false;
        }
        if ((i11 == 3 || i11 == 4) && ob0Var.e != this.e) {
            return false;
        }
        return !(i11 == 0 || i11 == 2 || i11 == 3 || i11 == 4 || i11 == 5) || TextUtils.equals(ob0Var.c, this.c);
    }
}
