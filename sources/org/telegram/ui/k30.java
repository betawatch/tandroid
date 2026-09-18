package org.telegram.ui;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
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
