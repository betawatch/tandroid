package org.telegram.ui.Components;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
                return ((org.telegram.ui.zg0) obj).K;
            default:
                return ((org.telegram.ui.zg0) obj).J;
        }
    }

    @Override // o1.i
    public final void b(Object obj, float f10) {
        switch (this.a) {
            case 0:
                ((nb) obj).setInOutOffset(f10);
                break;
            case 1:
                org.telegram.ui.zg0 zg0Var = (org.telegram.ui.zg0) obj;
                zg0Var.K = f10;
                zg0Var.invalidate();
                break;
            default:
                org.telegram.ui.zg0 zg0Var2 = (org.telegram.ui.zg0) obj;
                zg0Var2.J = f10;
                zg0Var2.invalidate();
                break;
        }
    }
}
