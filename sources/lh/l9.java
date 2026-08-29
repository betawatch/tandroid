package lh;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class l9 extends bg.n1 {
    public final /* synthetic */ m9 M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l9(m9 m9Var, Context context, float f9) {
        super(context, f9);
        this.M = m9Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        View view = this.M.c;
        if (view != null) {
            view.invalidate();
        }
    }
}
