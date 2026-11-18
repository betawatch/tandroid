package org.telegram.ui.Components;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class gu0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ iu0 b;

    public /* synthetic */ gu0(iu0 iu0Var, int i7) {
        this.a = i7;
        this.b = iu0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                iu0 iu0Var = this.b;
                iu0Var.W0 = false;
                if (!iu0Var.Z0 && iu0Var.X0) {
                    iu0Var.C(true);
                    break;
                }
                break;
            case 1:
                this.b.W0 = false;
                break;
            case 2:
                iu0 iu0Var2 = this.b;
                iu0Var2.Z0 = false;
                if (!iu0Var2.W0 && iu0Var2.X0) {
                    iu0Var2.C(true);
                    break;
                }
                break;
            default:
                this.b.Z0 = false;
                break;
        }
    }
}
