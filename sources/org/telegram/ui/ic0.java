package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class ic0 extends org.telegram.ui.Components.xv0 {
    public final /* synthetic */ sc0 i2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ic0(sc0 sc0Var, Context context, org.telegram.ui.Components.pv0 pv0Var, sc0 sc0Var2, hc0 hc0Var, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, 0L, pv0Var, 0, null, null, null, 8, 0, sc0Var2, hc0Var, 0, g6Var, null);
        this.i2 = sc0Var;
    }

    @Override // org.telegram.ui.Components.xv0
    public final int E0() {
        return 32;
    }

    @Override // org.telegram.ui.Components.xv0
    public final boolean O() {
        return true;
    }

    @Override // org.telegram.ui.Components.xv0
    public final int V0() {
        return 3;
    }

    @Override // org.telegram.ui.Components.xv0
    public final TL_stories.MediaArea getStoriesArea() {
        return this.i2.M0;
    }
}
