// default package

import android.view.View;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
