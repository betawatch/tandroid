package org.telegram.ui;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gg1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ hg1 b;

    public /* synthetic */ gg1(hg1 hg1Var, int i10) {
        this.a = i10;
        this.b = hg1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.Components.e51 e51Var = this.b.a;
                if (e51Var != null) {
                    e51Var.U2.N(true);
                    break;
                }
                break;
            default:
                org.telegram.ui.Components.e51 e51Var2 = this.b.a;
                if (e51Var2 != null) {
                    e51Var2.U2.N(true);
                    break;
                }
                break;
        }
    }
}
