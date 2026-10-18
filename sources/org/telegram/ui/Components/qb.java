package org.telegram.ui.Components;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class qb extends o1.i {
    public final /* synthetic */ int a;

    public /* synthetic */ qb(int i10) {
        this.a = i10;
    }

    @Override // o1.i
    public final float a(Object obj) {
        switch (this.a) {
            case 0:
                return ((ub) obj).inOutOffset;
            case 1:
                return ((org.telegram.ui.qg0) obj).N;
            default:
                return ((org.telegram.ui.qg0) obj).M;
        }
    }

    @Override // o1.i
    public final void b(Object obj, float f7) {
        switch (this.a) {
            case 0:
                ((ub) obj).setInOutOffset(f7);
                break;
            case 1:
                org.telegram.ui.qg0 qg0Var = (org.telegram.ui.qg0) obj;
                qg0Var.N = f7;
                qg0Var.invalidate();
                break;
            default:
                org.telegram.ui.qg0 qg0Var2 = (org.telegram.ui.qg0) obj;
                qg0Var2.M = f7;
                qg0Var2.invalidate();
                break;
        }
    }
}
