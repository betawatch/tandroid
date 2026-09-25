package ai;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes4.dex */
public final class mc extends qg.t0 {
    public final /* synthetic */ nc Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mc(nc ncVar, Context context, float f7) {
        super(context, f7);
        this.Q = ncVar;
    }

    @Override // android.view.View
    public final void invalidate() {
        View view = this.Q.c;
        if (view != null) {
            view.invalidate();
        }
    }
}
