package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class ja0 extends org.telegram.ui.Components.ys0 {
    public final /* synthetic */ pa0 x2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ja0(pa0 pa0Var, Context context, org.telegram.ui.Components.qs0 qs0Var, pa0 pa0Var2, ia0 ia0Var, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, 0L, qs0Var, 0, null, null, null, 8, 0, pa0Var2, ia0Var, 0, e6Var, null);
        this.x2 = pa0Var;
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
        return this.x2.O0;
    }
}
