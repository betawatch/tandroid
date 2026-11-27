// default package

import android.view.View;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
