package org.telegram.ui;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class j51 extends sg.c1 {
    public final /* synthetic */ k51 M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j51(k51 k51Var, Context context) {
        super(context, 2, null);
        this.M = k51Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        k51 k51Var = this.M;
        if (k51Var.getParent() instanceof View) {
            ((View) k51Var.getParent()).invalidate();
        }
    }
}
