// default package

import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class lm1 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ zu1 b;
    public final /* synthetic */ ArrayList c;

    public /* synthetic */ lm1(zu1 zu1Var, ArrayList arrayList, byte b) {
        this.a = b;
        this.b = zu1Var;
        this.c = arrayList;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                zu1 zu1Var = this.b;
                if (zu1Var.getParentActivity() != null && zu1Var.getParentActivity() != null) {
                    new ly3(zu1Var, zu1Var.getParentActivity(), zu1Var.Ba, this.c).show();
                    zu1Var.M5(true);
                    break;
                }
                break;
            default:
                zu1 zu1Var2 = this.b;
                sp1 sp1Var = new sp1(zu1Var2, zu1Var2, zu1Var2.getParentActivity(), zu1Var2.Ba, this.c);
                boolean Y7 = zu1Var2.Y7();
                sp1Var.i0 = Y7;
                sp1Var.n = Y7;
                sp1Var.p0 = false;
                zu1Var2.M5(false);
                zu1Var2.showDialog(sp1Var);
                break;
        }
    }
}
