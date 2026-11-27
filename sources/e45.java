// default package

import android.view.View;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e45 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ kl7 b;

    public /* synthetic */ e45(kl7 kl7Var, byte b) {
        this.a = b;
        this.b = kl7Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        kl7 kl7Var = this.b;
        switch (b) {
            case 0:
                kl7Var.dismiss();
                break;
            default:
                kl7Var.dismiss();
                break;
        }
    }
}
