package org.telegram.ui.Components;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public abstract class iq extends z4.a {
    public abstract int j();

    public final int k(int i10) {
        int size = ((oi0) this).c.size();
        int j10 = j();
        if (i10 < j10) {
            return ((size - (j10 * 2)) - ((j10 - i10) - 1)) - 1;
        }
        int i11 = size - j10;
        return i10 >= i11 ? i10 - i11 : i10 - j10;
    }
}
