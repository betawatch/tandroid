package kg;

import android.content.Context;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.Components.Premium.LimitPreviewView;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class o0 extends LimitPreviewView {
    public final /* synthetic */ p0 p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(p0 p0Var, Context context, int i10, int i11, int i12, float f7, p6 p6Var) {
        super(context, i10, i11, i12, f7, p6Var);
        this.p0 = p0Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        if (this.p0.e.X1) {
            return;
        }
        super.invalidate();
    }
}
