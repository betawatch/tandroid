package org.telegram.ui;

import android.text.TextUtils;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class ct extends rg.a {
    public final int c;
    public final int d;
    public final int e;
    public final CharSequence f;
    public final CharSequence g;
    public final int h;

    public ct(int i7, String str) {
        super(i7, false);
        this.f = str;
    }

    public static ct b(CharSequence charSequence, String str) {
        return new ct(-1, 0, 0, 0, charSequence, str);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ct)) {
            return false;
        }
        ct ctVar = (ct) obj;
        CharSequence charSequence = ctVar.f;
        int i7 = ctVar.a;
        int i10 = this.a;
        if (i7 != i10) {
            return false;
        }
        CharSequence charSequence2 = this.f;
        if (i10 == 1 || i10 == 4 || i10 == 3 || i10 == 5) {
            return TextUtils.equals(charSequence2, charSequence);
        }
        if (i10 == 2) {
            return ctVar.h == this.h && TextUtils.equals(charSequence2, charSequence) && ctVar.d == this.d && ctVar.e == this.e && ctVar.c == this.c;
        }
        return true;
    }

    public ct(int i7, int i10, int i11, int i12, CharSequence charSequence, CharSequence charSequence2) {
        super(2, false);
        this.h = i7;
        this.c = i10;
        this.d = i11;
        this.e = i12;
        this.f = charSequence;
        this.g = charSequence2;
    }
}
