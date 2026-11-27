// default package

import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class iy3 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jy3 b;

    public /* synthetic */ iy3(jy3 jy3Var, byte b) {
        this.a = b;
        this.b = jy3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        jy3 jy3Var = this.b;
        switch (b) {
            case 0:
                jy3Var.f.dismiss();
                break;
            default:
                ly3 ly3Var = jy3Var.f;
                ly3Var.dismiss();
                e eVar = ly3Var.m1;
                if (eVar != null && eVar.getParentActivity() != null) {
                    xnb.x(null, 2131754428, d31.b0(eVar), null);
                    break;
                }
                break;
        }
    }
}
