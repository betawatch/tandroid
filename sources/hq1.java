// default package

import android.app.Activity;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class hq1 extends ly3 {
    public final /* synthetic */ zu1 Q1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hq1(zu1 zu1Var, e eVar, Activity activity, vnb vnbVar, ArrayList arrayList) {
        super(eVar, activity, vnbVar, arrayList);
        this.Q1 = zu1Var;
    }

    @Override // ly3, nx0, android.app.Dialog, android.content.DialogInterface, ag0
    public final void dismiss() {
        super.dismiss();
        zu1 zu1Var = this.Q1;
        zu1Var.getClass();
        zu1Var.y6(false, true, 0.0f);
    }
}
