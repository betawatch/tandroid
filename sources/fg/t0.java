package fg;

import android.content.Context;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.Premium.LimitPreviewView;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
