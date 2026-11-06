package org.telegram.ui.Components;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class cb extends r1.e {
    public final /* synthetic */ int a;

    public /* synthetic */ cb(int i7) {
        this.a = i7;
    }

    @Override // r1.e
    public final float a(Object obj) {
        switch (this.a) {
            case 0:
                return ((gb) obj).inOutOffset;
            case 1:
                return ((org.telegram.ui.le0) obj).N;
            default:
                return ((org.telegram.ui.le0) obj).M;
        }
    }

    @Override // r1.e
    public final void b(Object obj, float f10) {
        switch (this.a) {
            case 0:
                ((gb) obj).setInOutOffset(f10);
                break;
            case 1:
                org.telegram.ui.le0 le0Var = (org.telegram.ui.le0) obj;
                le0Var.N = f10;
                le0Var.invalidate();
                break;
            default:
                org.telegram.ui.le0 le0Var2 = (org.telegram.ui.le0) obj;
                le0Var2.M = f10;
                le0Var2.invalidate();
                break;
        }
    }
}
