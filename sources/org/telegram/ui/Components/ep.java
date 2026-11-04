package org.telegram.ui.Components;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public abstract class ep extends b5.a {
    public abstract int j();

    public final int k(int i3) {
        int size = ((uf0) this).c.size();
        int j10 = j();
        if (i3 < j10) {
            return ((size - (j10 * 2)) - ((j10 - i3) - 1)) - 1;
        }
        int i10 = size - j10;
        return i3 >= i10 ? i3 - i10 : i3 - j10;
    }
}
