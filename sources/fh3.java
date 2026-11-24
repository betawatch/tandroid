// default package

import android.content.Context;
import org.telegram.ui.Components.FragmentContextView;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class fh3 extends FragmentContextView {
    public final /* synthetic */ byte X0;
    public final /* synthetic */ cj3 Y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fh3(cj3 cj3Var, Context context, cj3 cj3Var2, byte b) {
        super(context, cj3Var2, true);
        this.X0 = b;
        switch (b) {
            case 1:
                this.Y0 = cj3Var;
                super(context, cj3Var2, false);
                break;
            default:
                this.Y0 = cj3Var;
                break;
        }
    }

    @Override // org.telegram.ui.Components.FragmentContextView, android.view.View
    public final void setVisibility(int i) {
        byte b = this.X0;
        cj3 cj3Var = this.Y0;
        switch (b) {
            case 0:
                cj3Var.L1.j(cj3Var.I1, i == 0, true);
                break;
            default:
                cj3Var.L1.j(cj3Var.K1, i == 0, true);
                break;
        }
    }
}
