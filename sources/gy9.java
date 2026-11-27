// default package

import android.view.View;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class gy9 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ky9 b;

    public /* synthetic */ gy9(ky9 ky9Var, byte b) {
        this.a = b;
        this.b = ky9Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        ky9 ky9Var = this.b;
        switch (b) {
            case 0:
                if (ky9Var.Z == null) {
                    ky9Var.dismiss();
                    break;
                }
                break;
            default:
                ky9Var.dismiss();
                break;
        }
    }
}
