// default package

import android.content.Context;
import org.telegram.ui.Components.FragmentContextView;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class hr1 extends FragmentContextView {
    public final /* synthetic */ byte X0;
    public final /* synthetic */ zu1 Y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hr1(zu1 zu1Var, Context context, zu1 zu1Var2, vnb vnbVar, byte b) {
        super(context, zu1Var2, null, true, vnbVar);
        this.X0 = b;
        switch (b) {
            case 1:
                this.Y0 = zu1Var;
                super(context, zu1Var2, null, false, vnbVar);
                break;
            default:
                this.Y0 = zu1Var;
                break;
        }
    }

    @Override // org.telegram.ui.Components.FragmentContextView, android.view.View
    public final void setVisibility(int i) {
        byte b = this.X0;
        zu1 zu1Var = this.Y0;
        switch (b) {
            case 0:
                zu1Var.b1.j(zu1Var.p2, i == 0, true);
                break;
            default:
                zu1Var.b1.j(zu1Var.n2, i == 0, true);
                break;
        }
    }
}
