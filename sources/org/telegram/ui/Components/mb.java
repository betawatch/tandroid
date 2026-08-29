package org.telegram.ui.Components;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class mb extends o1.j {
    public final /* synthetic */ int a;

    public /* synthetic */ mb(int i10) {
        this.a = i10;
    }

    @Override // o1.j
    public final float a(Object obj) {
        switch (this.a) {
            case 0:
                return ((rb) obj).inOutOffset;
            case 1:
                return ((org.telegram.ui.pg0) obj).J;
            default:
                return ((org.telegram.ui.pg0) obj).I;
        }
    }

    @Override // o1.j
    public final void b(Object obj, float f9) {
        switch (this.a) {
            case 0:
                ((rb) obj).setInOutOffset(f9);
                break;
            case 1:
                org.telegram.ui.pg0 pg0Var = (org.telegram.ui.pg0) obj;
                pg0Var.J = f9;
                pg0Var.invalidate();
                break;
            default:
                org.telegram.ui.pg0 pg0Var2 = (org.telegram.ui.pg0) obj;
                pg0Var2.I = f9;
                pg0Var2.invalidate();
                break;
        }
    }
}
