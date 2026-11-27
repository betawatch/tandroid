// default package

import android.app.Activity;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class cc5 extends l46 {
    public final /* synthetic */ dc5 S2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cc5(dc5 dc5Var, dc5 dc5Var2, Activity activity, int i, int i2, vnb vnbVar) {
        super(i, i2, vnbVar, activity, dc5Var2);
        this.S2 = dc5Var;
    }

    @Override // nx0, android.app.Dialog, android.content.DialogInterface, ag0
    public final void dismiss() {
        super.dismiss();
        this.S2.C0 = false;
    }

    @Override // nx0
    public final void x() {
        this.S2.C0 = false;
    }
}
