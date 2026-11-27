// default package

import android.app.Activity;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class mp1 extends ly3 {
    public final /* synthetic */ zu1 Q1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mp1(zu1 zu1Var, e eVar, Activity activity, vnb vnbVar, ArrayList arrayList) {
        super(eVar, activity, vnbVar, arrayList);
        this.Q1 = zu1Var;
    }

    @Override // ly3, nx0, android.app.Dialog, android.content.DialogInterface, ag0
    public final void dismiss() {
        super.dismiss();
        this.Q1.y6(false, true, 0.0f);
    }
}
