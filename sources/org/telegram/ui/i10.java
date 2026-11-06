package org.telegram.ui;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class i10 extends g.p {
    public final /* synthetic */ c40 c;

    public i10(c40 c40Var) {
        this.c = c40Var;
    }

    @Override // g.p
    public final int i(int i7) {
        int size = this.c.f4.e.size();
        if (size > 1 && size != 2) {
            return (size != 3 || i7 == 0 || i7 == 1) ? 3 : 6;
        }
        return 6;
    }
}
