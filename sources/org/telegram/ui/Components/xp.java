package org.telegram.ui.Components;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public abstract class xp extends z4.a {
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
