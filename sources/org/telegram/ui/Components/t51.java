package org.telegram.ui.Components;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class t51 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ t51(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                u51 u51Var = (u51) ((li.b6) this.b).f;
                u51Var.a0.removeCallbacksAndMessages(null);
                u51Var.K.F(false, null);
                break;
            case 1:
                ((w51) this.b).g = false;
                break;
            case 2:
                ((m71) ((x30) ((org.telegram.ui.ActionBar.h1) this.b).b).b).w.b();
                break;
            default:
                ((i71) this.b).d(false, true);
                break;
        }
    }
}
