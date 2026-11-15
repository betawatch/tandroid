package org.telegram.ui.Components;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class ya extends r1.e {
    public final /* synthetic */ int a;

    public /* synthetic */ ya(int i7) {
        this.a = i7;
    }

    @Override // r1.e
    public final float a(Object obj) {
        switch (this.a) {
            case 0:
                return ((cb) obj).inOutOffset;
            case 1:
                return ((org.telegram.ui.le0) obj).O;
            default:
                return ((org.telegram.ui.le0) obj).N;
        }
    }

    @Override // r1.e
    public final void b(Object obj, float f10) {
        switch (this.a) {
            case 0:
                ((cb) obj).setInOutOffset(f10);
                break;
            case 1:
                org.telegram.ui.le0 le0Var = (org.telegram.ui.le0) obj;
                le0Var.O = f10;
                le0Var.invalidate();
                break;
            default:
                org.telegram.ui.le0 le0Var2 = (org.telegram.ui.le0) obj;
                le0Var2.N = f10;
                le0Var2.invalidate();
                break;
        }
    }
}
