package org.telegram.ui.Components;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class pb extends o1.i {
    public final /* synthetic */ int a;

    public /* synthetic */ pb(int i10) {
        this.a = i10;
    }

    @Override // o1.i
    public final float a(Object obj) {
        switch (this.a) {
            case 0:
                return ((tb) obj).inOutOffset;
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
                ((tb) obj).setInOutOffset(f7);
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
