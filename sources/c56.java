// default package

import android.content.Context;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class c56 extends ax8 {
    public final /* synthetic */ f56 t1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c56(f56 f56Var, Context context, String str, String str2, String str3) {
        super(context, str, str2, str3, false);
        this.t1 = f56Var;
    }

    @Override // my0, android.app.Dialog, android.content.DialogInterface, ah0
    public final void dismiss() {
        super.dismiss();
        this.t1.F = null;
    }
}
