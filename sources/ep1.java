// default package

import android.app.Activity;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class ep1 extends qx3 {
    public final /* synthetic */ mu1 Q1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ep1(mu1 mu1Var, d dVar, Activity activity, wjb wjbVar, ArrayList arrayList) {
        super(dVar, activity, wjbVar, arrayList);
        this.Q1 = mu1Var;
    }

    @Override // qx3, fx0, android.app.Dialog, android.content.DialogInterface, zf0
    public final void dismiss() {
        super.dismiss();
        this.Q1.p6(false, true, 0.0f);
    }
}
