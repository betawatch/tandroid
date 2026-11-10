package org.telegram.ui;

import android.text.TextUtils;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class ft extends rg.a {
    public final int c;
    public final int d;
    public final int e;
    public final CharSequence f;
    public final CharSequence g;
    public final int h;

    public ft(int i7, String str) {
        super(i7, false);
        this.f = str;
    }

    public static ft b(CharSequence charSequence, String str) {
        return new ft(-1, 0, 0, 0, charSequence, str);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ft)) {
            return false;
        }
        ft ftVar = (ft) obj;
        CharSequence charSequence = ftVar.f;
        int i7 = ftVar.a;
        int i10 = this.a;
        if (i7 != i10) {
            return false;
        }
        CharSequence charSequence2 = this.f;
        if (i10 == 1 || i10 == 4 || i10 == 3 || i10 == 5) {
            return TextUtils.equals(charSequence2, charSequence);
        }
        if (i10 == 2) {
            return ftVar.h == this.h && TextUtils.equals(charSequence2, charSequence) && ftVar.d == this.d && ftVar.e == this.e && ftVar.c == this.c;
        }
        return true;
    }

    public ft(int i7, int i10, int i11, int i12, CharSequence charSequence, CharSequence charSequence2) {
        super(2, false);
        this.h = i7;
        this.c = i10;
        this.d = i11;
        this.e = i12;
        this.f = charSequence;
        this.g = charSequence2;
    }
}
