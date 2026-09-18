package ai;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes4.dex */
public final class mc extends qg.v0 {
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
