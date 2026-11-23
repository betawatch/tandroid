package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class ja0 extends org.telegram.ui.Components.it0 {
    public final /* synthetic */ pa0 x2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ja0(pa0 pa0Var, Context context, org.telegram.ui.Components.at0 at0Var, pa0 pa0Var2, ia0 ia0Var, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, 0L, at0Var, 0, null, null, null, 8, 0, pa0Var2, ia0Var, 0, i6Var, null);
        this.x2 = pa0Var;
    }

    @Override // org.telegram.ui.Components.it0
    public final int O0() {
        return 32;
    }

    @Override // org.telegram.ui.Components.it0
    public final boolean Y() {
        return true;
    }

    @Override // org.telegram.ui.Components.it0
    public final int e1() {
        return 3;
    }

    @Override // org.telegram.ui.Components.it0
    public final TL_stories.MediaArea getStoriesArea() {
        return this.x2.T0;
    }
}
