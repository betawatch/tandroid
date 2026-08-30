package eg;

import android.content.Context;
import org.telegram.ui.ActionBar.f6;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class g0 extends c1 {
    public final /* synthetic */ v0 M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(v0 v0Var, Context context, f6 f6Var) {
        super(context, f6Var, true);
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
