package org.telegram.ui;

import android.text.TextUtils;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class fu extends wf.a {
    public final int c;
    public final int d;
    public final int e;
    public final CharSequence f;
    public final CharSequence g;
    public final int h;

    public fu(int i9, String str) {
        super(i9, false);
        this.f = str;
    }

    public static fu b(CharSequence charSequence, String str) {
        return new fu(-1, 0, 0, 0, charSequence, str);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof fu)) {
            return false;
        }
        fu fuVar = (fu) obj;
        CharSequence charSequence = fuVar.f;
        int i9 = fuVar.a;
        int i10 = this.a;
        if (i9 != i10) {
            return false;
        }
        CharSequence charSequence2 = this.f;
        if (i10 == 1 || i10 == 4 || i10 == 3 || i10 == 5) {
            return TextUtils.equals(charSequence2, charSequence);
        }
        if (i10 == 2) {
            return fuVar.h == this.h && TextUtils.equals(charSequence2, charSequence) && fuVar.d == this.d && fuVar.e == this.e && fuVar.c == this.c;
        }
        return true;
    }

    public fu(int i9, int i10, int i11, int i12, CharSequence charSequence, CharSequence charSequence2) {
        super(2, false);
        this.h = i9;
        this.c = i10;
        this.d = i11;
        this.e = i12;
        this.f = charSequence;
        this.g = charSequence2;
    }
}
