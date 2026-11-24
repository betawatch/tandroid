// default package

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class cx9 extends oh8 {
    public final /* synthetic */ dx9 N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cx9(dx9 dx9Var, Context context) {
        super(2, null, context);
        this.N = dx9Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        dx9 dx9Var = this.N;
        if (dx9Var.getParent() instanceof View) {
            ((View) dx9Var.getParent()).invalidate();
        }
    }
}
