package org.telegram.ui.Components;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public abstract class vp extends m2.a {
    public abstract int j();

    public final int k(int i10) {
        int size = ((wh0) this).c.size();
        int j10 = j();
        if (i10 < j10) {
            return ((size - (j10 * 2)) - ((j10 - i10) - 1)) - 1;
        }
        int i11 = size - j10;
        return i10 >= i11 ? i10 - i11 : i10 - j10;
    }
}
