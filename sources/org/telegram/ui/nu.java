package org.telegram.ui;

import android.text.TextUtils;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class nu extends og.a {
    public final int c;
    public final int d;
    public final int e;
    public final CharSequence f;
    public final CharSequence g;
    public final int h;

    public nu(int i10, String str) {
        super(i10, false);
        this.f = str;
    }

    public static nu b(CharSequence charSequence, String str) {
        return new nu(-1, 0, 0, 0, charSequence, str);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof nu)) {
            return false;
        }
        nu nuVar = (nu) obj;
        CharSequence charSequence = nuVar.f;
        int i10 = nuVar.a;
        int i11 = this.a;
        if (i10 != i11) {
            return false;
        }
        CharSequence charSequence2 = this.f;
        if (i11 == 1 || i11 == 4 || i11 == 3 || i11 == 5) {
            return TextUtils.equals(charSequence2, charSequence);
        }
        if (i11 == 2) {
            return nuVar.h == this.h && TextUtils.equals(charSequence2, charSequence) && nuVar.d == this.d && nuVar.e == this.e && nuVar.c == this.c;
        }
        return true;
    }

    public nu(int i10, int i11, int i12, int i13, CharSequence charSequence, CharSequence charSequence2) {
        super(2, false);
        this.h = i10;
        this.c = i11;
        this.d = i12;
        this.e = i13;
        this.f = charSequence;
        this.g = charSequence2;
    }
}
