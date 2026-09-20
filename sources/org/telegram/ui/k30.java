package org.telegram.ui;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
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
