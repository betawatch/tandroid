// default package

import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class mn1 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ yv1 b;
    public final /* synthetic */ ArrayList c;

    public /* synthetic */ mn1(yv1 yv1Var, ArrayList arrayList, byte b) {
        this.a = b;
        this.b = yv1Var;
        this.c = arrayList;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                yv1 yv1Var = this.b;
                rq1 rq1Var = new rq1(yv1Var, yv1Var, yv1Var.getParentActivity(), yv1Var.Ba, this.c);
                boolean Y7 = yv1Var.Y7();
                rq1Var.i0 = Y7;
                rq1Var.n = Y7;
                rq1Var.p0 = false;
                yv1Var.N5(false);
                yv1Var.showDialog(rq1Var);
                break;
            default:
                yv1 yv1Var2 = this.b;
                if (yv1Var2.getParentActivity() != null && yv1Var2.getParentActivity() != null) {
                    new az3(yv1Var2, yv1Var2.getParentActivity(), yv1Var2.Ba, this.c).show();
                    yv1Var2.N5(true);
                    break;
                }
                break;
        }
    }
}
