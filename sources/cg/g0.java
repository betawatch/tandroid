package cg;

import android.content.Context;
import org.telegram.ui.ActionBar.c6;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class g0 extends d1 {
    public final /* synthetic */ v0 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(v0 v0Var, Context context, c6 c6Var) {
        super(context, c6Var, true);
        this.L = v0Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        if (this.L.b0) {
            return;
        }
        super.invalidate();
    }
}
