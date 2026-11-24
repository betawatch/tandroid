// default package

import android.content.DialogInterface;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class me6 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qe6 b;

    public /* synthetic */ me6(qe6 qe6Var, byte b) {
        this.a = b;
        this.b = qe6Var;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        byte b = this.a;
        qe6 qe6Var = this.b;
        switch (b) {
            case 0:
                qe6Var.v0.finishFragment();
                break;
            default:
                qe6Var.v0.finishFragment();
                break;
        }
    }
}
