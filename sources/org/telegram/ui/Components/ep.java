package org.telegram.ui.Components;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public abstract class ep extends c5.a {
    public abstract int j();

    public final int k(int i7) {
        int size = ((rf0) this).c.size();
        int j3 = j();
        if (i7 < j3) {
            return ((size - (j3 * 2)) - ((j3 - i7) - 1)) - 1;
        }
        int i10 = size - j3;
        return i7 >= i10 ? i7 - i10 : i7 - j3;
    }
}
