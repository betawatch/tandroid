package org.telegram.ui;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class l51 extends cg.t1 {
    public final /* synthetic */ m51 I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l51(m51 m51Var, Context context) {
        super(context, 2, null);
        this.I = m51Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        m51 m51Var = this.I;
        if (m51Var.getParent() instanceof View) {
            ((View) m51Var.getParent()).invalidate();
        }
    }
}
