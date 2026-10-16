package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class bd0 extends org.telegram.ui.Components.xv0 {
    public final /* synthetic */ ld0 f2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bd0(ld0 ld0Var, Context context, org.telegram.ui.Components.pv0 pv0Var, ld0 ld0Var2, ad0 ad0Var, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, 0L, pv0Var, 0, null, null, null, 8, 0, ld0Var2, ad0Var, 0, c6Var, null);
        this.f2 = ld0Var;
    }

    @Override // org.telegram.ui.Components.xv0
    public final int C0() {
        return 32;
    }

    @Override // org.telegram.ui.Components.xv0
    public final boolean N() {
        return true;
    }

    @Override // org.telegram.ui.Components.xv0
    public final int T0() {
        return 3;
    }

    @Override // org.telegram.ui.Components.xv0
    public final TL_stories.MediaArea getStoriesArea() {
        return this.f2.M0;
    }
}
