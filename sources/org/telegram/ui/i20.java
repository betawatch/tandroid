package org.telegram.ui;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class i20 extends g.o {
    public final /* synthetic */ b50 c;

    public i20(b50 b50Var) {
        this.c = b50Var;
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
