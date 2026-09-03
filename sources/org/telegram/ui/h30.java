package org.telegram.ui;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class h30 extends f2.v {
    public final /* synthetic */ e60 c;

    public h30(e60 e60Var) {
        this.c = e60Var;
    }

    @Override // f2.v
    public final int i(int i10) {
        int size = this.c.l2.e.size();
        if (size > 1 && size != 2) {
            return (size != 3 || i10 == 0 || i10 == 1) ? 3 : 6;
        }
        return 6;
    }
}
