package org.telegram.ui;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class h20 extends g.o {
    public final /* synthetic */ a50 c;

    public h20(a50 a50Var) {
        this.c = a50Var;
    }

    @Override // g.o
    public final int i(int i10) {
        int size = this.c.f4.e.size();
        if (size > 1 && size != 2) {
            return (size != 3 || i10 == 0 || i10 == 1) ? 3 : 6;
        }
        return 6;
    }
}
