package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class dd0 extends org.telegram.ui.Components.xv0 {
    public final /* synthetic */ nd0 f2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dd0(nd0 nd0Var, Context context, org.telegram.ui.Components.pv0 pv0Var, nd0 nd0Var2, cd0 cd0Var, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, 0L, pv0Var, 0, null, null, null, 8, 0, nd0Var2, cd0Var, 0, c6Var, null);
        this.f2 = nd0Var;
    }

    @Override // org.telegram.ui.Components.xv0
    public final int B0() {
        return 32;
    }

    @Override // org.telegram.ui.Components.xv0
    public final boolean N() {
        return true;
    }

    @Override // org.telegram.ui.Components.xv0
    public final int S0() {
        return 3;
    }

    @Override // org.telegram.ui.Components.xv0
    public final TL_stories.MediaArea getStoriesArea() {
        return this.f2.M0;
    }
}
