package org.telegram.ui.Components;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class ob extends o1.i {
    public final /* synthetic */ int a;

    public /* synthetic */ ob(int i10) {
        this.a = i10;
    }

    @Override // o1.i
    public final float a(Object obj) {
        switch (this.a) {
            case 0:
                return ((sb) obj).inOutOffset;
            case 1:
                return ((org.telegram.ui.ih0) obj).N;
            default:
                return ((org.telegram.ui.ih0) obj).M;
        }
    }

    @Override // o1.i
    public final void b(Object obj, float f7) {
        switch (this.a) {
            case 0:
                ((sb) obj).setInOutOffset(f7);
                break;
            case 1:
                org.telegram.ui.ih0 ih0Var = (org.telegram.ui.ih0) obj;
                ih0Var.N = f7;
                ih0Var.invalidate();
                break;
            default:
                org.telegram.ui.ih0 ih0Var2 = (org.telegram.ui.ih0) obj;
                ih0Var2.M = f7;
                ih0Var2.invalidate();
                break;
        }
    }
}
