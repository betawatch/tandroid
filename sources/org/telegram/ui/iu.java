package org.telegram.ui;

import android.text.TextUtils;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class iu extends xf.a {
    public final int c;
    public final int d;
    public final int e;
    public final CharSequence f;
    public final CharSequence g;
    public final int h;

    public iu(int i10, String str) {
        super(i10, false);
        this.f = str;
    }

    public static iu b(CharSequence charSequence, String str) {
        return new iu(-1, 0, 0, 0, charSequence, str);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof iu)) {
            return false;
        }
        iu iuVar = (iu) obj;
        CharSequence charSequence = iuVar.f;
        int i10 = iuVar.a;
        int i11 = this.a;
        if (i10 != i11) {
            return false;
        }
        CharSequence charSequence2 = this.f;
        if (i11 == 1 || i11 == 4 || i11 == 3 || i11 == 5) {
            return TextUtils.equals(charSequence2, charSequence);
        }
        if (i11 == 2) {
            return iuVar.h == this.h && TextUtils.equals(charSequence2, charSequence) && iuVar.d == this.d && iuVar.e == this.e && iuVar.c == this.c;
        }
        return true;
    }

    public iu(int i10, int i11, int i12, int i13, CharSequence charSequence, CharSequence charSequence2) {
        super(2, false);
        this.h = i10;
        this.c = i11;
        this.d = i12;
        this.e = i13;
        this.f = charSequence;
        this.g = charSequence2;
    }
}
