package org.telegram.ui.Components;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
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
                return ((org.telegram.ui.oe0) obj).O;
            default:
                return ((org.telegram.ui.oe0) obj).N;
        }
    }

    @Override // r1.e
    public final void b(Object obj, float f10) {
        switch (this.a) {
            case 0:
                ((lb) obj).setInOutOffset(f10);
                break;
            case 1:
                org.telegram.ui.oe0 oe0Var = (org.telegram.ui.oe0) obj;
                oe0Var.O = f10;
                oe0Var.invalidate();
                break;
            default:
                org.telegram.ui.oe0 oe0Var2 = (org.telegram.ui.oe0) obj;
                oe0Var2.N = f10;
                oe0Var2.invalidate();
                break;
        }
    }
}
