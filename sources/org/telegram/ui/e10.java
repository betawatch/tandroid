package org.telegram.ui;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class e10 extends g.p {
    public final /* synthetic */ x30 c;

    public e10(x30 x30Var) {
        this.c = x30Var;
    }

    @Override // g.p
    public final int i(int i3) {
        int size = this.c.g4.e.size();
        if (size > 1 && size != 2) {
            return (size != 3 || i3 == 0 || i3 == 1) ? 3 : 6;
        }
        return 6;
    }
}
