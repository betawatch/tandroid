package ag;

import android.content.Context;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.Premium.LimitPreviewView;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class f1 extends LimitPreviewView {
    public final /* synthetic */ g1 i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(g1 g1Var, Context context, int i10, int i11, int i12, float f10, c6 c6Var) {
        super(context, i10, i11, i12, f10, c6Var);
        this.i0 = g1Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        if (this.i0.e.b0) {
            return;
        }
        super.invalidate();
    }
}
