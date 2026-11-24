// default package

import android.app.Activity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class ba5 extends h26 {
    public final /* synthetic */ ca5 S2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ba5(ca5 ca5Var, ca5 ca5Var2, Activity activity, int i, int i2, wjb wjbVar) {
        super(i, i2, wjbVar, activity, ca5Var2);
        this.S2 = ca5Var;
    }

    @Override // fx0, android.app.Dialog, android.content.DialogInterface, zf0
    public final void dismiss() {
        super.dismiss();
        this.S2.C0 = false;
    }

    @Override // fx0
    public final void x() {
        this.S2.C0 = false;
    }
}
