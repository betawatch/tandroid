// default package

import android.view.View;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
