package org.telegram.ui.Components;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public abstract class vp extends z4.a {
    public abstract int j();

    public final int k(int i10) {
        int size = ((ai0) this).c.size();
        int j3 = j();
        if (i10 < j3) {
            return ((size - (j3 * 2)) - ((j3 - i10) - 1)) - 1;
        }
        int i11 = size - j3;
        return i10 >= i11 ? i10 - i11 : i10 - j3;
    }
}
