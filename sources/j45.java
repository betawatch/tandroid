// default package

import android.view.View;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final /* synthetic */ class j45 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ el7 b;

    public /* synthetic */ j45(el7 el7Var, byte b) {
        this.a = b;
        this.b = el7Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        el7 el7Var = this.b;
        switch (b) {
            case 0:
                el7Var.dismiss();
                break;
            default:
                el7Var.dismiss();
                break;
        }
    }
}
