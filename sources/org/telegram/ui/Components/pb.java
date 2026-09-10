package org.telegram.ui.Components;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
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
                return ((org.telegram.ui.hh0) obj).N;
            default:
                return ((org.telegram.ui.hh0) obj).M;
        }
    }

    @Override // o1.i
    public final void b(Object obj, float f7) {
        switch (this.a) {
            case 0:
                ((tb) obj).setInOutOffset(f7);
                break;
            case 1:
                org.telegram.ui.hh0 hh0Var = (org.telegram.ui.hh0) obj;
                hh0Var.N = f7;
                hh0Var.invalidate();
                break;
            default:
                org.telegram.ui.hh0 hh0Var2 = (org.telegram.ui.hh0) obj;
                hh0Var2.M = f7;
                hh0Var2.invalidate();
                break;
        }
    }
}
