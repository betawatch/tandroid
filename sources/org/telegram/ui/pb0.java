package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class pb0 extends org.telegram.ui.Components.au0 {
    public final /* synthetic */ xb0 w2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pb0(xb0 xb0Var, Context context, org.telegram.ui.Components.st0 st0Var, xb0 xb0Var2, ob0 ob0Var, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context, 0L, st0Var, 0, null, null, null, 8, 0, xb0Var2, ob0Var, 0, p6Var, null);
        this.w2 = xb0Var;
    }

    @Override // org.telegram.ui.Components.au0
    public final int L0() {
        return 32;
    }

    @Override // org.telegram.ui.Components.au0
    public final boolean X() {
        return true;
    }

    @Override // org.telegram.ui.Components.au0
    public final int a1() {
        return 3;
    }

    @Override // org.telegram.ui.Components.au0
    public final TL_stories.MediaArea getStoriesArea() {
        return this.w2.U0;
    }
}
