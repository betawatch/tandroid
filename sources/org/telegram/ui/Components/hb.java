package org.telegram.ui.Components;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class hb extends o1.i {
    public final /* synthetic */ int a;

    public /* synthetic */ hb(int i10) {
        this.a = i10;
    }

    @Override // o1.i
    public final float a(Object obj) {
        switch (this.a) {
            case 0:
                return ((nb) obj).inOutOffset;
            case 1:
                return ((org.telegram.ui.yg0) obj).K;
            default:
                return ((org.telegram.ui.yg0) obj).J;
        }
    }

    @Override // o1.i
    public final void b(Object obj, float f10) {
        switch (this.a) {
            case 0:
                ((nb) obj).setInOutOffset(f10);
                break;
            case 1:
                org.telegram.ui.yg0 yg0Var = (org.telegram.ui.yg0) obj;
                yg0Var.K = f10;
                yg0Var.invalidate();
                break;
            default:
                org.telegram.ui.yg0 yg0Var2 = (org.telegram.ui.yg0) obj;
                yg0Var2.J = f10;
                yg0Var2.invalidate();
                break;
        }
    }
}
