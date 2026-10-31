package org.telegram.ui.Components;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class wa extends o1.h {
    public final /* synthetic */ int a;

    public /* synthetic */ wa(int i10) {
        this.a = i10;
    }

    @Override // o1.h
    public final float a(Object obj) {
        switch (this.a) {
            case 0:
                return ((bb) obj).inOutOffset;
            case 1:
                return ((org.telegram.ui.rf0) obj).N;
            default:
                return ((org.telegram.ui.rf0) obj).M;
        }
    }

    @Override // o1.h
    public final void b(Object obj, float f7) {
        switch (this.a) {
            case 0:
                ((bb) obj).setInOutOffset(f7);
                break;
            case 1:
                org.telegram.ui.rf0 rf0Var = (org.telegram.ui.rf0) obj;
                rf0Var.N = f7;
                rf0Var.invalidate();
                break;
            default:
                org.telegram.ui.rf0 rf0Var2 = (org.telegram.ui.rf0) obj;
                rf0Var2.M = f7;
                rf0Var2.invalidate();
                break;
        }
    }
}
