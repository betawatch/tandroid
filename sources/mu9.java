// default package

import android.view.View;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class mu9 implements no7, ed {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qu9 b;

    public /* synthetic */ mu9(qu9 qu9Var, byte b) {
        this.a = b;
        this.b = qu9Var;
    }

    @Override // no7
    public final vxc W(View view, vxc vxcVar) {
        io5 H0 = gl.H0(vxcVar, false);
        qu9 qu9Var = this.b;
        qu9Var.e = H0;
        qu9Var.c.setPadding(H0.a, H0.b, H0.c, H0.d);
        qu9Var.b.requestLayout();
        return vxc.b;
    }

    @Override // ed
    public final void u(hd hdVar, int i) {
        byte b = this.a;
        qu9 qu9Var = this.b;
        switch (b) {
            case 1:
                hd hdVar2 = qu9Var.d0;
                if (hdVar2 != null) {
                    hdVar2.dismiss();
                    break;
                }
                break;
            default:
                hd hdVar3 = qu9Var.d0;
                if (hdVar3 != null) {
                    hdVar3.dismiss();
                    qu9Var.d0 = null;
                }
                qu9Var.dismiss();
                break;
        }
    }
}
