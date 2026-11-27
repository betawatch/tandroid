// default package

import android.app.Dialog;
import android.content.Context;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
