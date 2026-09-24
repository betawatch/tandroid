package org.telegram.ui.Components;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public abstract class wp extends z4.a {
    public abstract int j();

    public final int k(int i10) {
        int size = ((yh0) this).c.size();
        int j3 = j();
        if (i10 < j3) {
            return ((size - (j3 * 2)) - ((j3 - i10) - 1)) - 1;
        }
        int i11 = size - j3;
        return i10 >= i11 ? i10 - i11 : i10 - j3;
    }
}
