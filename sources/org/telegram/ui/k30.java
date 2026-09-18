package org.telegram.ui;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class k30 extends g.p {
    public final /* synthetic */ i60 c;

    public k30(i60 i60Var) {
        this.c = i60Var;
    }

    @Override // g.p
    public final int i(int i10) {
        int size = this.c.o2.e.size();
        if (size > 1 && size != 2) {
            return (size != 3 || i10 == 0 || i10 == 1) ? 3 : 6;
        }
        return 6;
    }
}
