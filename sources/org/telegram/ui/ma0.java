package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class ma0 extends org.telegram.ui.Components.ys0 {
    public final /* synthetic */ sa0 w2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ma0(sa0 sa0Var, Context context, org.telegram.ui.Components.qs0 qs0Var, sa0 sa0Var2, la0 la0Var, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, 0L, qs0Var, 0, null, null, null, 8, 0, sa0Var2, la0Var, 0, h6Var, null);
        this.w2 = sa0Var;
    }

    @Override // org.telegram.ui.Components.ys0
    public final int O0() {
        return 32;
    }

    @Override // org.telegram.ui.Components.ys0
    public final boolean Y() {
        return true;
    }

    @Override // org.telegram.ui.Components.ys0
    public final int e1() {
        return 3;
    }

    @Override // org.telegram.ui.Components.ys0
    public final TL_stories.MediaArea getStoriesArea() {
        return this.w2.N0;
    }
}
