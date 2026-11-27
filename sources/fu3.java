// default package

import android.app.Dialog;
import android.content.Context;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final class fu3 extends Dialog {
    public final /* synthetic */ qu0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fu3(qu0 qu0Var, Context context) {
        super(context);
        this.a = qu0Var;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        gu3 gu3Var = (gu3) this.a.b;
        gu3Var.a.k(false);
        gu3Var.a.e();
    }
}
