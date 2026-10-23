package org.telegram.ui;

import android.text.TextUtils;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class kb0 extends pg.a {
    public final CharSequence c;
    public final int d;
    public final int e;
    public final int f;

    public kb0(int i10, int i11, CharSequence charSequence, int i12, int i13) {
        super(i10, false);
        this.c = charSequence;
        this.d = i11;
        this.e = i12;
        this.f = i13;
    }

    public static kb0 b(int i10, String str) {
        return new kb0(4, 0, str, i10, 0);
    }

    public static kb0 c(int i10, int i11, String str) {
        return new kb0(3, i10, str, i11, 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kb0)) {
            return false;
        }
        kb0 kb0Var = (kb0) obj;
        int i10 = kb0Var.a;
        int i11 = this.a;
        if (i10 != i11) {
            return false;
        }
        if (i11 == 3 && kb0Var.d != this.d) {
            return false;
        }
        if (i11 == 5 && kb0Var.f != this.f) {
            return false;
        }
        if ((i11 == 3 || i11 == 4) && kb0Var.e != this.e) {
            return false;
        }
        return !(i11 == 0 || i11 == 2 || i11 == 3 || i11 == 4 || i11 == 5) || TextUtils.equals(kb0Var.c, this.c);
    }
}
