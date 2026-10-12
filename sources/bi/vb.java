package bi;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
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
