package org.telegram.ui;

import android.text.TextUtils;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class jc0 extends og.a {
    public final CharSequence c;
    public final int d;
    public final int e;
    public final int f;

    public jc0(int i10, int i11, CharSequence charSequence, int i12, int i13) {
        super(i10, false);
        this.c = charSequence;
        this.d = i11;
        this.e = i12;
        this.f = i13;
    }

    public static jc0 b(int i10, String str) {
        return new jc0(4, 0, str, i10, 0);
    }

    public static jc0 c(int i10, int i11, String str) {
        return new jc0(3, i10, str, i11, 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jc0)) {
            return false;
        }
        jc0 jc0Var = (jc0) obj;
        int i10 = jc0Var.a;
        int i11 = this.a;
        if (i10 != i11) {
            return false;
        }
        if (i11 == 3 && jc0Var.d != this.d) {
            return false;
        }
        if (i11 == 5 && jc0Var.f != this.f) {
            return false;
        }
        if ((i11 == 3 || i11 == 4) && jc0Var.e != this.e) {
            return false;
        }
        return !(i11 == 0 || i11 == 2 || i11 == 3 || i11 == 4 || i11 == 5) || TextUtils.equals(jc0Var.c, this.c);
    }
}
