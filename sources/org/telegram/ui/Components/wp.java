package org.telegram.ui.Components;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public abstract class wp extends z4.a {
    public abstract int j();

    public final int k(int i10) {
        int size = ((oh0) this).c.size();
        int j3 = j();
        if (i10 < j3) {
            return ((size - (j3 * 2)) - ((j3 - i10) - 1)) - 1;
        }
        int i11 = size - j3;
        return i10 >= i11 ? i10 - i11 : i10 - j3;
    }
}
