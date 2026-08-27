package ag;

import android.content.Context;
import org.telegram.ui.ActionBar.c6;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class r0 extends s1 {
    public final /* synthetic */ i1 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(i1 i1Var, Context context, c6 c6Var) {
        super(context, c6Var, true);
        this.L = i1Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        if (this.L.b0) {
            return;
        }
        super.invalidate();
    }
}
