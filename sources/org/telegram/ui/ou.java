package org.telegram.ui;

import android.text.TextUtils;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class ou extends bg.b {
    public final int c;
    public final int d;
    public final int e;
    public final CharSequence f;
    public final CharSequence g;
    public final int h;

    public ou(int i10, String str) {
        super(i10, false);
        this.f = str;
    }

    public static ou b(CharSequence charSequence, String str) {
        return new ou(-1, 0, 0, 0, charSequence, str);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ou)) {
            return false;
        }
        ou ouVar = (ou) obj;
        CharSequence charSequence = ouVar.f;
        int i10 = ouVar.a;
        int i11 = this.a;
        if (i10 != i11) {
            return false;
        }
        CharSequence charSequence2 = this.f;
        if (i11 == 1 || i11 == 4 || i11 == 3 || i11 == 5) {
            return TextUtils.equals(charSequence2, charSequence);
        }
        if (i11 == 2) {
            return ouVar.h == this.h && TextUtils.equals(charSequence2, charSequence) && ouVar.d == this.d && ouVar.e == this.e && ouVar.c == this.c;
        }
        return true;
    }

    public ou(int i10, int i11, int i12, int i13, CharSequence charSequence, CharSequence charSequence2) {
        super(2, false);
        this.h = i10;
        this.c = i11;
        this.d = i12;
        this.e = i13;
        this.f = charSequence;
        this.g = charSequence2;
    }
}
