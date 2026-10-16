package org.telegram.ui.Components;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
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
                return ((org.telegram.ui.lh0) obj).N;
            default:
                return ((org.telegram.ui.lh0) obj).M;
        }
    }

    @Override // o1.i
    public final void b(Object obj, float f7) {
        switch (this.a) {
            case 0:
                ((wb) obj).setInOutOffset(f7);
                break;
            case 1:
                org.telegram.ui.lh0 lh0Var = (org.telegram.ui.lh0) obj;
                lh0Var.N = f7;
                lh0Var.invalidate();
                break;
            default:
                org.telegram.ui.lh0 lh0Var2 = (org.telegram.ui.lh0) obj;
                lh0Var2.M = f7;
                lh0Var2.invalidate();
                break;
        }
    }
}
