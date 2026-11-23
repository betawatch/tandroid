package org.telegram.ui;

import android.text.TextUtils;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class gt extends rg.a {
    public final int c;
    public final int d;
    public final int e;
    public final CharSequence f;
    public final CharSequence g;
    public final int h;

    public gt(int i7, String str) {
        super(i7, false);
        this.f = str;
    }

    public static gt b(CharSequence charSequence, String str) {
        return new gt(-1, 0, 0, 0, charSequence, str);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof gt)) {
            return false;
        }
        gt gtVar = (gt) obj;
        CharSequence charSequence = gtVar.f;
        int i7 = gtVar.a;
        int i10 = this.a;
        if (i7 != i10) {
            return false;
        }
        CharSequence charSequence2 = this.f;
        if (i10 == 1 || i10 == 4 || i10 == 3 || i10 == 5) {
            return TextUtils.equals(charSequence2, charSequence);
        }
        if (i10 == 2) {
            return gtVar.h == this.h && TextUtils.equals(charSequence2, charSequence) && gtVar.d == this.d && gtVar.e == this.e && gtVar.c == this.c;
        }
        return true;
    }

    public gt(int i7, int i10, int i11, int i12, CharSequence charSequence, CharSequence charSequence2) {
        super(2, false);
        this.h = i7;
        this.c = i10;
        this.d = i11;
        this.e = i12;
        this.f = charSequence;
        this.g = charSequence2;
    }
}
