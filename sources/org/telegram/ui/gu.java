package org.telegram.ui;

import android.text.TextUtils;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class gu extends zf.a {
    public final int c;
    public final int d;
    public final int e;
    public final CharSequence f;
    public final CharSequence g;
    public final int h;

    public gu(int i10, String str) {
        super(i10, false);
        this.f = str;
    }

    public static gu b(CharSequence charSequence, String str) {
        return new gu(-1, 0, 0, 0, charSequence, str);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof gu)) {
            return false;
        }
        gu guVar = (gu) obj;
        CharSequence charSequence = guVar.f;
        int i10 = guVar.a;
        int i11 = this.a;
        if (i10 != i11) {
            return false;
        }
        CharSequence charSequence2 = this.f;
        if (i11 == 1 || i11 == 4 || i11 == 3 || i11 == 5) {
            return TextUtils.equals(charSequence2, charSequence);
        }
        if (i11 == 2) {
            return guVar.h == this.h && TextUtils.equals(charSequence2, charSequence) && guVar.d == this.d && guVar.e == this.e && guVar.c == this.c;
        }
        return true;
    }

    public gu(int i10, int i11, int i12, int i13, CharSequence charSequence, CharSequence charSequence2) {
        super(2, false);
        this.h = i10;
        this.c = i11;
        this.d = i12;
        this.e = i13;
        this.f = charSequence;
        this.g = charSequence2;
    }
}
