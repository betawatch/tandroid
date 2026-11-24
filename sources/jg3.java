// default package

import android.app.Dialog;
import android.content.DialogInterface;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class jg3 implements DialogInterface.OnCancelListener {
    public final /* synthetic */ mg3 a;

    public jg3(mg3 mg3Var) {
        this.a = mg3Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        mg3 mg3Var = this.a;
        Dialog dialog = mg3Var.w0;
        if (dialog != null) {
            mg3Var.onCancel(dialog);
        }
    }
}
