package fg;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.ov;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class y1 extends ov {
    public final /* synthetic */ d2 T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(d2 d2Var, x1 x1Var, Context context, g6 g6Var, ArrayList arrayList) {
        super(x1Var, context, g6Var, arrayList);
        this.T = d2Var;
    }

    @Override // org.telegram.ui.Components.ov
    public final void Y() {
        this.T.dismiss();
    }
}
