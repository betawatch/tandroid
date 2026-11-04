package org.telegram.ui;

import android.text.TextUtils;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class at extends sg.a {
    public final int c;
    public final int d;
    public final int e;
    public final CharSequence f;
    public final CharSequence g;
    public final int h;

    public at(int i3, String str) {
        super(i3, false);
        this.f = str;
    }

    public static at b(CharSequence charSequence, String str) {
        return new at(-1, 0, 0, 0, charSequence, str);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof at)) {
            return false;
        }
        at atVar = (at) obj;
        CharSequence charSequence = atVar.f;
        int i3 = atVar.a;
        int i10 = this.a;
        if (i3 != i10) {
            return false;
        }
        CharSequence charSequence2 = this.f;
        if (i10 == 1 || i10 == 4 || i10 == 3 || i10 == 5) {
            return TextUtils.equals(charSequence2, charSequence);
        }
        if (i10 == 2) {
            return atVar.h == this.h && TextUtils.equals(charSequence2, charSequence) && atVar.d == this.d && atVar.e == this.e && atVar.c == this.c;
        }
        return true;
    }

    public at(int i3, int i10, int i11, int i12, CharSequence charSequence, CharSequence charSequence2) {
        super(2, false);
        this.h = i3;
        this.c = i10;
        this.d = i11;
        this.e = i12;
        this.f = charSequence;
        this.g = charSequence2;
    }
}
