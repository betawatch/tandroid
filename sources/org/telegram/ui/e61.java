package org.telegram.ui;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class e61 extends eg.s1 {
    public final /* synthetic */ f61 J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e61(f61 f61Var, Context context) {
        super(context, 2, null);
        this.J = f61Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        f61 f61Var = this.J;
        if (f61Var.getParent() instanceof View) {
            ((View) f61Var.getParent()).invalidate();
        }
    }
}
