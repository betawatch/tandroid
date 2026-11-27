// default package

import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
