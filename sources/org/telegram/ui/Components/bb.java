package org.telegram.ui.Components;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class bb extends q1.e {
    public final /* synthetic */ int a;

    public /* synthetic */ bb(int i3) {
        this.a = i3;
    }

    @Override // q1.e
    public final float a(Object obj) {
        switch (this.a) {
            case 0:
                return ((fb) obj).inOutOffset;
            case 1:
                return ((org.telegram.ui.ge0) obj).O;
            default:
                return ((org.telegram.ui.ge0) obj).N;
        }
    }

    @Override // q1.e
    public final void b(Object obj, float f10) {
        switch (this.a) {
            case 0:
                ((fb) obj).setInOutOffset(f10);
                break;
            case 1:
                org.telegram.ui.ge0 ge0Var = (org.telegram.ui.ge0) obj;
                ge0Var.O = f10;
                ge0Var.invalidate();
                break;
            default:
                org.telegram.ui.ge0 ge0Var2 = (org.telegram.ui.ge0) obj;
                ge0Var2.N = f10;
                ge0Var2.invalidate();
                break;
        }
    }
}
