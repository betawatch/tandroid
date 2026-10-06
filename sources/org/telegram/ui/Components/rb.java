package org.telegram.ui.Components;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final class rb extends o1.i {
    public final /* synthetic */ int a;

    public /* synthetic */ rb(int i10) {
        this.a = i10;
    }

    @Override // o1.i
    public final float a(Object obj) {
        switch (this.a) {
            case 0:
                return ((vb) obj).inOutOffset;
            case 1:
                return ((org.telegram.ui.eh0) obj).N;
            default:
                return ((org.telegram.ui.eh0) obj).M;
        }
    }

    @Override // o1.i
    public final void b(Object obj, float f7) {
        switch (this.a) {
            case 0:
                ((vb) obj).setInOutOffset(f7);
                break;
            case 1:
                org.telegram.ui.eh0 eh0Var = (org.telegram.ui.eh0) obj;
                eh0Var.N = f7;
                eh0Var.invalidate();
                break;
            default:
                org.telegram.ui.eh0 eh0Var2 = (org.telegram.ui.eh0) obj;
                eh0Var2.M = f7;
                eh0Var2.invalidate();
                break;
        }
    }
}
