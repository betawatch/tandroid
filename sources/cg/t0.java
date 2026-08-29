package cg;

import android.content.Context;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.Premium.LimitPreviewView;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class t0 extends LimitPreviewView {
    public final /* synthetic */ u0 i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(u0 u0Var, Context context, int i10, int i11, int i12, float f9, c6 c6Var) {
        super(context, i10, i11, i12, f9, c6Var);
        this.i0 = u0Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        if (this.i0.e.b0) {
            return;
        }
        super.invalidate();
    }
}
