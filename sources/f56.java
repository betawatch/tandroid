// default package

import android.content.Context;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class f56 extends ky8 {
    public final /* synthetic */ i56 t1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f56(i56 i56Var, Context context, String str, String str2, String str3) {
        super(context, str, str2, str3, false);
        this.t1 = i56Var;
    }

    @Override // nx0, android.app.Dialog, android.content.DialogInterface, ag0
    public final void dismiss() {
        super.dismiss();
        this.t1.F = null;
    }
}
