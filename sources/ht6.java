// default package

import android.view.View;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class ht6 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ rt6 b;

    public /* synthetic */ ht6(rt6 rt6Var, byte b) {
        this.a = b;
        this.b = rt6Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        rt6 rt6Var = this.b;
        switch (b) {
            case 0:
                rt6Var.dismiss();
                break;
            default:
                if (rt6Var.r.g()) {
                    rt6Var.f.getClass();
                    gu6.j(2);
                }
                rt6Var.dismiss();
                break;
        }
    }
}
