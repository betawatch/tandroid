package org.telegram.ui;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class f30 extends f2.v {
    public final /* synthetic */ c60 c;

    public f30(c60 c60Var) {
        this.c = c60Var;
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
