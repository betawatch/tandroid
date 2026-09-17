package bi;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-09da8b159cf36792e88674cebe3dc77c7407e16cea1bdebcb1e8ccd47061bd65 */
/* loaded from: classes4.dex */
public final class sb extends rg.u0 {
    public final /* synthetic */ tb Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sb(tb tbVar, Context context, float f7) {
        super(context, f7);
        this.Q = tbVar;
    }

    @Override // android.view.View
    public final void invalidate() {
        View view = this.Q.c;
        if (view != null) {
            view.invalidate();
        }
    }
}
