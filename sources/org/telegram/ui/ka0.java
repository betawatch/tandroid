package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class ka0 extends org.telegram.ui.Components.gt0 {
    public final /* synthetic */ qa0 x2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ka0(qa0 qa0Var, Context context, org.telegram.ui.Components.ys0 ys0Var, qa0 qa0Var2, ja0 ja0Var, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, 0L, ys0Var, 0, null, null, null, 8, 0, qa0Var2, ja0Var, 0, i6Var, null);
        this.x2 = qa0Var;
    }

    @Override // org.telegram.ui.Components.gt0
    public final int O0() {
        return 32;
    }

    @Override // org.telegram.ui.Components.gt0
    public final boolean Y() {
        return true;
    }

    @Override // org.telegram.ui.Components.gt0
    public final int e1() {
        return 3;
    }

    @Override // org.telegram.ui.Components.gt0
    public final TL_stories.MediaArea getStoriesArea() {
        return this.x2.T0;
    }
}
