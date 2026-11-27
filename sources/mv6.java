// default package

import android.view.View;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class mv6 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wv6 b;

    public /* synthetic */ mv6(wv6 wv6Var, byte b) {
        this.a = b;
        this.b = wv6Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        wv6 wv6Var = this.b;
        switch (b) {
            case 0:
                wv6Var.dismiss();
                break;
            default:
                if (wv6Var.r.g()) {
                    wv6Var.f.getClass();
                    lw6.j(2);
                }
                wv6Var.dismiss();
                break;
        }
    }
}
