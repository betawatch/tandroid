package org.telegram.ui;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class i10 extends g.p {
    public final /* synthetic */ c40 c;

    public i10(c40 c40Var) {
        this.c = c40Var;
    }

    @Override // g.p
    public final int i(int i7) {
        int size = this.c.n4.e.size();
        if (size > 1 && size != 2) {
            return (size != 3 || i7 == 0 || i7 == 1) ? 3 : 6;
        }
        return 6;
    }
}
