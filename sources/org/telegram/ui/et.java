package org.telegram.ui;

import android.text.TextUtils;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class et extends rg.a {
    public final int c;
    public final int d;
    public final int e;
    public final CharSequence f;
    public final CharSequence g;
    public final int h;

    public et(int i7, String str) {
        super(i7, false);
        this.f = str;
    }

    public static et b(CharSequence charSequence, String str) {
        return new et(-1, 0, 0, 0, charSequence, str);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof et)) {
            return false;
        }
        et etVar = (et) obj;
        CharSequence charSequence = etVar.f;
        int i7 = etVar.a;
        int i10 = this.a;
        if (i7 != i10) {
            return false;
        }
        CharSequence charSequence2 = this.f;
        if (i10 == 1 || i10 == 4 || i10 == 3 || i10 == 5) {
            return TextUtils.equals(charSequence2, charSequence);
        }
        if (i10 == 2) {
            return etVar.h == this.h && TextUtils.equals(charSequence2, charSequence) && etVar.d == this.d && etVar.e == this.e && etVar.c == this.c;
        }
        return true;
    }

    public et(int i7, int i10, int i11, int i12, CharSequence charSequence, CharSequence charSequence2) {
        super(2, false);
        this.h = i7;
        this.c = i10;
        this.d = i11;
        this.e = i12;
        this.f = charSequence;
        this.g = charSequence2;
    }
}
