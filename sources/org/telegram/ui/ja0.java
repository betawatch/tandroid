package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class ja0 extends org.telegram.ui.Components.xs0 {
    public final /* synthetic */ pa0 w2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ja0(pa0 pa0Var, Context context, org.telegram.ui.Components.ps0 ps0Var, pa0 pa0Var2, ia0 ia0Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, 0L, ps0Var, 0, null, null, null, 8, 0, pa0Var2, ia0Var, 0, f6Var, null);
        this.w2 = pa0Var;
    }

    @Override // org.telegram.ui.Components.xs0
    public final int N0() {
        return 32;
    }

    @Override // org.telegram.ui.Components.xs0
    public final boolean Y() {
        return true;
    }

    @Override // org.telegram.ui.Components.xs0
    public final int c1() {
        return 3;
    }

    @Override // org.telegram.ui.Components.xs0
    public final TL_stories.MediaArea getStoriesArea() {
        return this.w2.N0;
    }
}
