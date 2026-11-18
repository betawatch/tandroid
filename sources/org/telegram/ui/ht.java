package org.telegram.ui;

import android.text.TextUtils;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class ht extends rg.a {
    public final int c;
    public final int d;
    public final int e;
    public final CharSequence f;
    public final CharSequence g;
    public final int h;

    public ht(int i7, String str) {
        super(i7, false);
        this.f = str;
    }

    public static ht b(CharSequence charSequence, String str) {
        return new ht(-1, 0, 0, 0, charSequence, str);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ht)) {
            return false;
        }
        ht htVar = (ht) obj;
        CharSequence charSequence = htVar.f;
        int i7 = htVar.a;
        int i10 = this.a;
        if (i7 != i10) {
            return false;
        }
        CharSequence charSequence2 = this.f;
        if (i10 == 1 || i10 == 4 || i10 == 3 || i10 == 5) {
            return TextUtils.equals(charSequence2, charSequence);
        }
        if (i10 == 2) {
            return htVar.h == this.h && TextUtils.equals(charSequence2, charSequence) && htVar.d == this.d && htVar.e == this.e && htVar.c == this.c;
        }
        return true;
    }

    public ht(int i7, int i10, int i11, int i12, CharSequence charSequence, CharSequence charSequence2) {
        super(2, false);
        this.h = i7;
        this.c = i10;
        this.d = i11;
        this.e = i12;
        this.f = charSequence;
        this.g = charSequence2;
    }
}
