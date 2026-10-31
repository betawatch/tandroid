package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class qb0 extends org.telegram.ui.Components.zt0 {
    public final /* synthetic */ yb0 w2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qb0(yb0 yb0Var, Context context, org.telegram.ui.Components.rt0 rt0Var, yb0 yb0Var2, pb0 pb0Var, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context, 0L, rt0Var, 0, null, null, null, 8, 0, yb0Var2, pb0Var, 0, p6Var, null);
        this.w2 = yb0Var;
    }

    @Override // org.telegram.ui.Components.zt0
    public final int K0() {
        return 32;
    }

    @Override // org.telegram.ui.Components.zt0
    public final boolean W() {
        return true;
    }

    @Override // org.telegram.ui.Components.zt0
    public final int Z0() {
        return 3;
    }

    @Override // org.telegram.ui.Components.zt0
    public final TL_stories.MediaArea getStoriesArea() {
        return this.w2.U0;
    }
}
