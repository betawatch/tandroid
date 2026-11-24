// default package

import android.view.View;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final /* synthetic */ class gmc implements it3 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ mmc b;

    public /* synthetic */ gmc(mmc mmcVar, byte b) {
        this.a = b;
        this.b = mmcVar;
    }

    @Override // it3
    public final void a(zna znaVar, float f, float f2) {
        byte b = this.a;
        mmc mmcVar = this.b;
        switch (b) {
            case 0:
                mmcVar.C = f;
                mmcVar.a.invalidate();
                break;
            case 1:
                mmcVar.c0 = f;
                cm1 cm1Var = mmcVar.a;
                cm1Var.invalidate();
                if (cm1Var.getParent() instanceof View) {
                    ((View) cm1Var.getParent()).invalidate();
                    break;
                }
                break;
            default:
                mmcVar.a0 = f;
                cm1 cm1Var2 = mmcVar.a;
                cm1Var2.invalidate();
                if (cm1Var2.getParent() instanceof View) {
                    ((View) cm1Var2.getParent()).invalidate();
                    break;
                }
                break;
        }
    }
}
