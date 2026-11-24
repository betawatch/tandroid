// default package

import android.view.View;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class fua implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ yua b;

    public /* synthetic */ fua(yua yuaVar, byte b) {
        this.a = b;
        this.b = yuaVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        d Q;
        d Q2;
        byte b = this.a;
        yua yuaVar = this.b;
        switch (b) {
            case 0:
                if (yuaVar.e > 0 && (Q = LaunchActivity.Q()) != null) {
                    ag0 ag0Var = new ag0();
                    ag0Var.a = true;
                    Q.showAsSheet(new jva(), ag0Var);
                    break;
                }
                break;
            default:
                if (yuaVar.e > 0 && (Q2 = LaunchActivity.Q()) != null) {
                    ag0 ag0Var2 = new ag0();
                    ag0Var2.a = true;
                    Q2.showAsSheet(new jva(), ag0Var2);
                    break;
                }
                break;
        }
    }
}
