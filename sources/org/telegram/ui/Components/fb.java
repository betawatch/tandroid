package org.telegram.ui.Components;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class fb extends o1.i {
    public final /* synthetic */ int a;

    public /* synthetic */ fb(int i10) {
        this.a = i10;
    }

    @Override // o1.i
    public final float a(Object obj) {
        switch (this.a) {
            case 0:
                return ((jb) obj).inOutOffset;
            case 1:
                return ((org.telegram.ui.sg0) obj).J;
            default:
                return ((org.telegram.ui.sg0) obj).I;
        }
    }

    @Override // o1.i
    public final void b(Object obj, float f10) {
        switch (this.a) {
            case 0:
                ((jb) obj).setInOutOffset(f10);
                break;
            case 1:
                org.telegram.ui.sg0 sg0Var = (org.telegram.ui.sg0) obj;
                sg0Var.J = f10;
                sg0Var.invalidate();
                break;
            default:
                org.telegram.ui.sg0 sg0Var2 = (org.telegram.ui.sg0) obj;
                sg0Var2.I = f10;
                sg0Var2.invalidate();
                break;
        }
    }
}
