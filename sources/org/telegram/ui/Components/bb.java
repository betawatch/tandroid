package org.telegram.ui.Components;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class bb extends r1.e {
    public final /* synthetic */ int a;

    public /* synthetic */ bb(int i7) {
        this.a = i7;
    }

    @Override // r1.e
    public final float a(Object obj) {
        switch (this.a) {
            case 0:
                return ((fb) obj).inOutOffset;
            case 1:
                return ((org.telegram.ui.oe0) obj).N;
            default:
                return ((org.telegram.ui.oe0) obj).M;
        }
    }

    @Override // r1.e
    public final void b(Object obj, float f10) {
        switch (this.a) {
            case 0:
                ((fb) obj).setInOutOffset(f10);
                break;
            case 1:
                org.telegram.ui.oe0 oe0Var = (org.telegram.ui.oe0) obj;
                oe0Var.N = f10;
                oe0Var.invalidate();
                break;
            default:
                org.telegram.ui.oe0 oe0Var2 = (org.telegram.ui.oe0) obj;
                oe0Var2.M = f10;
                oe0Var2.invalidate();
                break;
        }
    }
}
