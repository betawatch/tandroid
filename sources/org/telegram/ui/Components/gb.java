package org.telegram.ui.Components;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class gb extends r1.e {
    public final /* synthetic */ int a;

    public /* synthetic */ gb(int i7) {
        this.a = i7;
    }

    @Override // r1.e
    public final float a(Object obj) {
        switch (this.a) {
            case 0:
                return ((kb) obj).inOutOffset;
            case 1:
                return ((org.telegram.ui.ne0) obj).O;
            default:
                return ((org.telegram.ui.ne0) obj).N;
        }
    }

    @Override // r1.e
    public final void b(Object obj, float f10) {
        switch (this.a) {
            case 0:
                ((kb) obj).setInOutOffset(f10);
                break;
            case 1:
                org.telegram.ui.ne0 ne0Var = (org.telegram.ui.ne0) obj;
                ne0Var.O = f10;
                ne0Var.invalidate();
                break;
            default:
                org.telegram.ui.ne0 ne0Var2 = (org.telegram.ui.ne0) obj;
                ne0Var2.N = f10;
                ne0Var2.invalidate();
                break;
        }
    }
}
