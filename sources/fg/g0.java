package fg;

import android.content.Context;
import org.telegram.ui.ActionBar.g6;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class g0 extends b1 {
    public final /* synthetic */ v0 M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(v0 v0Var, Context context, g6 g6Var) {
        super(context, g6Var, true);
        this.M = v0Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        if (this.M.c0) {
            return;
        }
        super.invalidate();
    }
}
