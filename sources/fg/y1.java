package fg;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.ov;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
