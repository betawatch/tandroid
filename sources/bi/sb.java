package bi;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
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
