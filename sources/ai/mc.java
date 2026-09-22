package ai;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
