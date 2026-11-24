// default package

import android.content.Context;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class cx3 extends qx3 {
    public final /* synthetic */ qx3 Q1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cx3(qx3 qx3Var, d dVar, Context context, wjb wjbVar, ArrayList arrayList) {
        super(dVar, context, wjbVar, arrayList);
        this.Q1 = qx3Var;
    }

    @Override // qx3
    public final void G0() {
        this.Q1.dismiss();
    }
}
