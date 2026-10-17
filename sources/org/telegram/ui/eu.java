package org.telegram.ui;

import android.text.TextUtils;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class eu extends pg.a {
    public final int c;
    public final int d;
    public final int e;
    public final CharSequence f;
    public final CharSequence g;
    public final int h;

    public eu(int i10, String str) {
        super(i10, false);
        this.f = str;
    }

    public static eu b(CharSequence charSequence, String str) {
        return new eu(-1, 0, 0, 0, charSequence, str);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof eu)) {
            return false;
        }
        eu euVar = (eu) obj;
        CharSequence charSequence = euVar.f;
        int i10 = euVar.a;
        int i11 = this.a;
        if (i10 != i11) {
            return false;
        }
        CharSequence charSequence2 = this.f;
        if (i11 == 1 || i11 == 4 || i11 == 3 || i11 == 5) {
            return TextUtils.equals(charSequence2, charSequence);
        }
        if (i11 == 2) {
            return euVar.h == this.h && TextUtils.equals(charSequence2, charSequence) && euVar.d == this.d && euVar.e == this.e && euVar.c == this.c;
        }
        return true;
    }

    public eu(int i10, int i11, int i12, int i13, CharSequence charSequence, CharSequence charSequence2) {
        super(2, false);
        this.h = i10;
        this.c = i11;
        this.d = i12;
        this.e = i13;
        this.f = charSequence;
        this.g = charSequence2;
    }
}
