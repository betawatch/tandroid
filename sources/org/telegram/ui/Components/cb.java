package org.telegram.ui.Components;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
