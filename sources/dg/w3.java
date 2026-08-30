package dg;

import android.content.Context;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class w3 extends g1 {
    public final /* synthetic */ y3 q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w3(y3 y3Var, Context context, float f10) {
        super(context, f10);
        this.q0 = y3Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        this.q0.d.invalidate();
        super.invalidate();
    }
}
