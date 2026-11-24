// default package

import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class em1 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ mu1 b;
    public final /* synthetic */ ArrayList c;

    public /* synthetic */ em1(mu1 mu1Var, ArrayList arrayList, byte b) {
        this.a = b;
        this.b = mu1Var;
        this.c = arrayList;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                mu1 mu1Var = this.b;
                ep1 ep1Var = new ep1(mu1Var, mu1Var, mu1Var.getParentActivity(), mu1Var.Ba, this.c);
                boolean Q7 = mu1Var.Q7();
                ep1Var.i0 = Q7;
                ep1Var.n = Q7;
                ep1Var.p0 = false;
                mu1Var.G5(false);
                mu1Var.showDialog(ep1Var);
                break;
            default:
                mu1 mu1Var2 = this.b;
                if (mu1Var2.getParentActivity() != null && mu1Var2.getParentActivity() != null) {
                    new qx3(mu1Var2, mu1Var2.getParentActivity(), mu1Var2.Ba, this.c).show();
                    mu1Var2.G5(true);
                    break;
                }
                break;
        }
    }
}
