package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class hc0 extends org.telegram.ui.Components.bw0 {
    public final /* synthetic */ rc0 r2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hc0(rc0 rc0Var, Context context, org.telegram.ui.Components.tv0 tv0Var, rc0 rc0Var2, gc0 gc0Var, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, 0L, tv0Var, 0, null, null, null, 8, 0, rc0Var2, gc0Var, 0, u6Var, null);
        this.r2 = rc0Var;
    }

    @Override // org.telegram.ui.Components.bw0
    public final int J0() {
        return 32;
    }

    @Override // org.telegram.ui.Components.bw0
    public final boolean V() {
        return true;
    }

    @Override // org.telegram.ui.Components.bw0
    public final int Y0() {
        return 3;
    }

    @Override // org.telegram.ui.Components.bw0
    public final TL_stories.MediaArea getStoriesArea() {
        return this.r2.L0;
    }
}
