package org.telegram.ui.Components;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
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
                return ((org.telegram.ui.qf0) obj).N;
            default:
                return ((org.telegram.ui.qf0) obj).M;
        }
    }

    @Override // o1.h
    public final void b(Object obj, float f7) {
        switch (this.a) {
            case 0:
                ((bb) obj).setInOutOffset(f7);
                break;
            case 1:
                org.telegram.ui.qf0 qf0Var = (org.telegram.ui.qf0) obj;
                qf0Var.N = f7;
                qf0Var.invalidate();
                break;
            default:
                org.telegram.ui.qf0 qf0Var2 = (org.telegram.ui.qf0) obj;
                qf0Var2.M = f7;
                qf0Var2.invalidate();
                break;
        }
    }
}
