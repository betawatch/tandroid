package org.telegram.ui.Components;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class hb extends r1.e {
    public final /* synthetic */ int a;

    public /* synthetic */ hb(int i7) {
        this.a = i7;
    }

    @Override // r1.e
    public final float a(Object obj) {
        switch (this.a) {
            case 0:
                return ((lb) obj).inOutOffset;
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
                ((lb) obj).setInOutOffset(f10);
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
