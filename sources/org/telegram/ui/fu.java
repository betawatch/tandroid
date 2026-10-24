package org.telegram.ui;

import android.text.TextUtils;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class fu extends pg.a {
    public final int c;
    public final int d;
    public final int e;
    public final CharSequence f;
    public final CharSequence g;
    public final int h;

    public fu(int i10, String str) {
        super(i10, false);
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
        int i10 = fuVar.a;
        int i11 = this.a;
        if (i10 != i11) {
            return false;
        }
        CharSequence charSequence2 = this.f;
        if (i11 == 1 || i11 == 4 || i11 == 3 || i11 == 5) {
            return TextUtils.equals(charSequence2, charSequence);
        }
        if (i11 == 2) {
            return fuVar.h == this.h && TextUtils.equals(charSequence2, charSequence) && fuVar.d == this.d && fuVar.e == this.e && fuVar.c == this.c;
        }
        return true;
    }

    public fu(int i10, int i11, int i12, int i13, CharSequence charSequence, CharSequence charSequence2) {
        super(2, false);
        this.h = i10;
        this.c = i11;
        this.d = i12;
        this.e = i13;
        this.f = charSequence;
        this.g = charSequence2;
    }
}
