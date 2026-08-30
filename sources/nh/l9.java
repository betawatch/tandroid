package nh;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final class l9 extends dg.l1 {
    public final /* synthetic */ m9 N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l9(m9 m9Var, Context context, float f10) {
        super(context, f10);
        this.N = m9Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        View view = this.N.c;
        if (view != null) {
            view.invalidate();
        }
    }
}
