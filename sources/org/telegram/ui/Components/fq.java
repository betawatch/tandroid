package org.telegram.ui.Components;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public abstract class fq extends z4.a {
    public abstract int j();

    public final int k(int i10) {
        int size = ((ji0) this).c.size();
        int j10 = j();
        if (i10 < j10) {
            return ((size - (j10 * 2)) - ((j10 - i10) - 1)) - 1;
        }
        int i11 = size - j10;
        return i10 >= i11 ? i10 - i11 : i10 - j10;
    }
}
