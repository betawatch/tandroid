package eg;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.lv;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class z1 extends lv {
    public final /* synthetic */ e2 T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(e2 e2Var, y1 y1Var, Context context, f6 f6Var, ArrayList arrayList) {
        super(y1Var, context, f6Var, arrayList);
        this.T = e2Var;
    }

    @Override // org.telegram.ui.Components.lv
    public final void Y() {
        this.T.dismiss();
    }
}
