package org.telegram.ui.Components;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class s51 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ s51(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                t51 t51Var = (t51) ((li.b6) this.b).f;
                t51Var.a0.removeCallbacksAndMessages(null);
                t51Var.K.F(false, null);
                break;
            case 1:
                ((v51) this.b).g = false;
                break;
            case 2:
                ((l71) ((w30) ((org.telegram.ui.ActionBar.h1) this.b).b).b).w.b();
                break;
            default:
                ((h71) this.b).d(false, true);
                break;
        }
    }
}
