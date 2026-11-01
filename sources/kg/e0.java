package kg;

import android.content.Context;
import org.telegram.ui.ActionBar.p6;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class e0 extends x0 {
    public final /* synthetic */ q0 R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(q0 q0Var, Context context, p6 p6Var) {
        super(context, p6Var, true);
        this.R = q0Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        if (this.R.X1) {
            return;
        }
        super.invalidate();
    }
}
