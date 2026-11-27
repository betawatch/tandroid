// default package

import android.view.View;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
