package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class fa0 extends org.telegram.ui.Components.ws0 {
    public final /* synthetic */ la0 x2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fa0(la0 la0Var, Context context, org.telegram.ui.Components.os0 os0Var, la0 la0Var2, ea0 ea0Var, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, 0L, os0Var, 0, null, null, null, 8, 0, la0Var2, ea0Var, 0, e6Var, null);
        this.x2 = la0Var;
    }

    @Override // org.telegram.ui.Components.ws0
    public final int N0() {
        return 32;
    }

    @Override // org.telegram.ui.Components.ws0
    public final boolean Y() {
        return true;
    }

    @Override // org.telegram.ui.Components.ws0
    public final int c1() {
        return 3;
    }

    @Override // org.telegram.ui.Components.ws0
    public final TL_stories.MediaArea getStoriesArea() {
        return this.x2.O0;
    }
}
