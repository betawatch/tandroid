// default package

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import org.telegram.messenger.a;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class eo1 implements ru1, fi4, la8, no7, ed {
    public final /* synthetic */ byte a;
    public final /* synthetic */ mu1 b;

    public /* synthetic */ eo1(mu1 mu1Var, byte b) {
        this.a = b;
        this.b = mu1Var;
    }

    @Override // no7
    public final vxc W(View view, vxc vxcVar) {
        mu1 mu1Var = this.b;
        vxc J6 = mu1Var.J6(vxcVar);
        io5 H0 = gl.H0(J6, false);
        int i = H0.a;
        int i2 = H0.c;
        if (mu1Var.rb != i || mu1Var.sb != i2) {
            mu1Var.rb = i;
            mu1Var.sb = i2;
            mu1Var.m1.requestLayout();
        }
        mu1Var.w.j(J6);
        yc ycVar = mu1Var.Z3;
        if (ycVar != null) {
            ycVar.setPadding(i, 0, i2, 0);
        }
        mu1Var.t5();
        mu1Var.x5();
        mu1Var.H7();
        boolean p = J6.a.p(8);
        if (mu1Var.qb != p) {
            mu1Var.qb = p;
            mu1Var.m1.R();
        }
        vq1 vq1Var = mu1Var.F1;
        if (vq1Var != null) {
            jdc.b(vq1Var, J6);
        }
        return vxc.b;
    }

    @Override // la8
    public final void a(float[] fArr) {
        mu1 mu1Var = this.b;
        fArr[1] = mu1Var.A0.getBottom() - mu1Var.Ya;
        fArr[0] = (mu1Var.A0.getTop() + mu1Var.P9) - gl.L(4.0f);
    }

    @Override // fi4
    public final boolean run() {
        mu1 mu1Var = this.b;
        return mu1Var.h != null || mu1Var.R7();
    }

    @Override // ed
    public final void u(hd hdVar, int i) {
        byte b = this.a;
        mu1 mu1Var = this.b;
        switch (b) {
            case 4:
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + a.b.getPackageName()));
                    mu1Var.getParentActivity().startActivity(intent);
                    break;
                } catch (Exception e) {
                    fa4.g(e, true);
                    return;
                }
            default:
                mu1Var.presentFragment(new p3c(6, null));
                break;
        }
    }
}
