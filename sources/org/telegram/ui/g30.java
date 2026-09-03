package org.telegram.ui;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class g30 extends f2.v {
    public final /* synthetic */ d60 c;

    public g30(d60 d60Var) {
        this.c = d60Var;
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
