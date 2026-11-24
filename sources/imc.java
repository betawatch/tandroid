// default package

import android.view.View;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final /* synthetic */ class imc implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ mmc b;

    public /* synthetic */ imc(mmc mmcVar, byte b) {
        this.a = b;
        this.b = mmcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        mmc mmcVar = this.b;
        switch (b) {
            case 0:
                cm1 cm1Var = mmcVar.a;
                if (cm1Var.getParent() instanceof View) {
                    ((View) cm1Var.getParent()).invalidate();
                    break;
                }
                break;
            default:
                mmcVar.p();
                break;
        }
    }
}
