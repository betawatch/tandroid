package org.telegram.ui;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class e61 extends fg.r1 {
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
