// default package

import android.app.Dialog;
import android.content.Context;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
