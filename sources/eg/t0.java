package eg;

import android.content.Context;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.Premium.LimitPreviewView;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class t0 extends LimitPreviewView {
    public final /* synthetic */ u0 j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(u0 u0Var, Context context, int i10, int i11, int i12, float f10, f6 f6Var) {
        super(context, i10, i11, i12, f10, f6Var);
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
