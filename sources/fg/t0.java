package fg;

import android.content.Context;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.Premium.LimitPreviewView;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class t0 extends LimitPreviewView {
    public final /* synthetic */ u0 j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(u0 u0Var, Context context, int i10, int i11, int i12, float f10, g6 g6Var) {
        super(context, i10, i11, i12, f10, g6Var);
        this.j0 = u0Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        if (this.j0.e.c0) {
            return;
        }
        super.invalidate();
    }
}
