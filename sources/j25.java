// default package

import android.view.View;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
