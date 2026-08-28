package org.telegram.ui.Components;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class hb extends o1.i {
    public final /* synthetic */ int a;

    public /* synthetic */ hb(int i9) {
        this.a = i9;
    }

    @Override // o1.i
    public final float a(Object obj) {
        switch (this.a) {
            case 0:
                return ((lb) obj).inOutOffset;
            case 1:
                return ((org.telegram.ui.pg0) obj).J;
            default:
                return ((org.telegram.ui.pg0) obj).I;
        }
    }

    @Override // o1.i
    public final void b(Object obj, float f10) {
        switch (this.a) {
            case 0:
                ((lb) obj).setInOutOffset(f10);
                break;
            case 1:
                org.telegram.ui.pg0 pg0Var = (org.telegram.ui.pg0) obj;
                pg0Var.J = f10;
                pg0Var.invalidate();
                break;
            default:
                org.telegram.ui.pg0 pg0Var2 = (org.telegram.ui.pg0) obj;
                pg0Var2.I = f10;
                pg0Var2.invalidate();
                break;
        }
    }
}
