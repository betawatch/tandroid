package org.telegram.ui;

import android.text.TextUtils;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class mu extends og.a {
    public final int c;
    public final int d;
    public final int e;
    public final CharSequence f;
    public final CharSequence g;
    public final int h;

    public mu(int i10, String str) {
        super(i10, false);
        this.f = str;
    }

    public static mu b(CharSequence charSequence, String str) {
        return new mu(-1, 0, 0, 0, charSequence, str);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof mu)) {
            return false;
        }
        mu muVar = (mu) obj;
        CharSequence charSequence = muVar.f;
        int i10 = muVar.a;
        int i11 = this.a;
        if (i10 != i11) {
            return false;
        }
        CharSequence charSequence2 = this.f;
        if (i11 == 1 || i11 == 4 || i11 == 3 || i11 == 5) {
            return TextUtils.equals(charSequence2, charSequence);
        }
        if (i11 == 2) {
            return muVar.h == this.h && TextUtils.equals(charSequence2, charSequence) && muVar.d == this.d && muVar.e == this.e && muVar.c == this.c;
        }
        return true;
    }

    public mu(int i10, int i11, int i12, int i13, CharSequence charSequence, CharSequence charSequence2) {
        super(2, false);
        this.h = i10;
        this.c = i11;
        this.d = i12;
        this.e = i13;
        this.f = charSequence;
        this.g = charSequence2;
    }
}
