package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class la0 extends org.telegram.ui.Components.zs0 {
    public final /* synthetic */ ra0 w2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public la0(ra0 ra0Var, Context context, org.telegram.ui.Components.rs0 rs0Var, ra0 ra0Var2, ka0 ka0Var, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, 0L, rs0Var, 0, null, null, null, 8, 0, ra0Var2, ka0Var, 0, g6Var, null);
        this.w2 = ra0Var;
    }

    @Override // org.telegram.ui.Components.zs0
    public final int O0() {
        return 32;
    }

    @Override // org.telegram.ui.Components.zs0
    public final boolean Y() {
        return true;
    }

    @Override // org.telegram.ui.Components.zs0
    public final int e1() {
        return 3;
    }

    @Override // org.telegram.ui.Components.zs0
    public final TL_stories.MediaArea getStoriesArea() {
        return this.w2.N0;
    }
}
