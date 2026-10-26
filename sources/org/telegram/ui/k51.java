package org.telegram.ui;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class k51 extends tg.c1 {
    public final /* synthetic */ l51 M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k51(l51 l51Var, Context context) {
        super(context, 2, null);
        this.M = l51Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        l51 l51Var = this.M;
        if (l51Var.getParent() instanceof View) {
            ((View) l51Var.getParent()).invalidate();
        }
    }
}
