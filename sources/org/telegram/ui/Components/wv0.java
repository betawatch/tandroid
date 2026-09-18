package org.telegram.ui.Components;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wv0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ yv0 b;

    public /* synthetic */ wv0(yv0 yv0Var, int i10) {
        this.a = i10;
        this.b = yv0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                yv0 yv0Var = this.b;
                yv0Var.V0 = false;
                if (!yv0Var.Y0 && yv0Var.W0) {
                    yv0Var.C(true);
                    break;
                }
                break;
            case 1:
                this.b.V0 = false;
                break;
            case 2:
                yv0 yv0Var2 = this.b;
                yv0Var2.Y0 = false;
                if (!yv0Var2.V0 && yv0Var2.W0) {
                    yv0Var2.C(true);
                    break;
                }
                break;
            default:
                this.b.Y0 = false;
                break;
        }
    }
}
