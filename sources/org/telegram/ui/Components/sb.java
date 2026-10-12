package org.telegram.ui.Components;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class sb extends o1.i {
    public final /* synthetic */ int a;

    public /* synthetic */ sb(int i10) {
        this.a = i10;
    }

    @Override // o1.i
    public final float a(Object obj) {
        switch (this.a) {
            case 0:
                return ((wb) obj).inOutOffset;
            case 1:
                return ((org.telegram.ui.mh0) obj).N;
            default:
                return ((org.telegram.ui.mh0) obj).M;
        }
    }

    @Override // o1.i
    public final void b(Object obj, float f7) {
        switch (this.a) {
            case 0:
                ((wb) obj).setInOutOffset(f7);
                break;
            case 1:
                org.telegram.ui.mh0 mh0Var = (org.telegram.ui.mh0) obj;
                mh0Var.N = f7;
                mh0Var.invalidate();
                break;
            default:
                org.telegram.ui.mh0 mh0Var2 = (org.telegram.ui.mh0) obj;
                mh0Var2.M = f7;
                mh0Var2.invalidate();
                break;
        }
    }
}
