package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class jc0 extends org.telegram.ui.Components.hu0 {
    public final /* synthetic */ tc0 b2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jc0(tc0 tc0Var, Context context, org.telegram.ui.Components.zt0 zt0Var, tc0 tc0Var2, ic0 ic0Var, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, 0L, zt0Var, 0, null, null, null, 8, 0, tc0Var2, ic0Var, 0, c6Var, null);
        this.b2 = tc0Var;
    }

    @Override // org.telegram.ui.Components.hu0
    public final int B0() {
        return 32;
    }

    @Override // org.telegram.ui.Components.hu0
    public final boolean N() {
        return true;
    }

    @Override // org.telegram.ui.Components.hu0
    public final int S0() {
        return 3;
    }

    @Override // org.telegram.ui.Components.hu0
    public final TL_stories.MediaArea getStoriesArea() {
        return this.b2.I0;
    }
}
