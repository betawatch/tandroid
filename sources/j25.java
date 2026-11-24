// default package

import android.view.View;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final /* synthetic */ class j25 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ cj7 b;

    public /* synthetic */ j25(cj7 cj7Var, byte b) {
        this.a = b;
        this.b = cj7Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        cj7 cj7Var = this.b;
        switch (b) {
            case 0:
                cj7Var.dismiss();
                break;
            default:
                cj7Var.dismiss();
                break;
        }
    }
}
