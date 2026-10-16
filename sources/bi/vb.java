package bi;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final class vb extends rg.u0 {
    public final /* synthetic */ wb Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vb(wb wbVar, Context context, float f7) {
        super(context, f7);
        this.Q = wbVar;
    }

    @Override // android.view.View
    public final void invalidate() {
        View view = this.Q.c;
        if (view != null) {
            view.invalidate();
        }
    }
}
