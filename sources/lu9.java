// default package

import android.view.View;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class lu9 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qu9 b;

    public /* synthetic */ lu9(qu9 qu9Var, byte b) {
        this.a = b;
        this.b = qu9Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        qu9 qu9Var = this.b;
        switch (b) {
            case 0:
                if (qu9Var.Z == null) {
                    qu9Var.dismiss();
                    break;
                }
                break;
            default:
                qu9Var.dismiss();
                break;
        }
    }
}
