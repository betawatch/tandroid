package org.telegram.ui;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes3.dex */
public final class k30 extends g.p {
    public final /* synthetic */ j60 c;

    public k30(j60 j60Var) {
        this.c = j60Var;
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
