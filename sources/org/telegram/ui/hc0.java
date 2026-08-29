package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class hc0 extends org.telegram.ui.Components.qu0 {
    public final /* synthetic */ rc0 b2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hc0(rc0 rc0Var, Context context, org.telegram.ui.Components.iu0 iu0Var, rc0 rc0Var2, gc0 gc0Var, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, 0L, iu0Var, 0, null, null, null, 8, 0, rc0Var2, gc0Var, 0, c6Var, null);
        this.b2 = rc0Var;
    }

    @Override // org.telegram.ui.Components.qu0
    public final int B0() {
        return 32;
    }

    @Override // org.telegram.ui.Components.qu0
    public final boolean N() {
        return true;
    }

    @Override // org.telegram.ui.Components.qu0
    public final int S0() {
        return 3;
    }

    @Override // org.telegram.ui.Components.qu0
    public final TL_stories.MediaArea getStoriesArea() {
        return this.b2.I0;
    }
}
