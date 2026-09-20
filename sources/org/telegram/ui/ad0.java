package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class ad0 extends org.telegram.ui.Components.jv0 {
    public final /* synthetic */ kd0 f2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ad0(kd0 kd0Var, Context context, org.telegram.ui.Components.bv0 bv0Var, kd0 kd0Var2, zc0 zc0Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, 0L, bv0Var, 0, null, null, null, 8, 0, kd0Var2, zc0Var, 0, f6Var, null);
        this.f2 = kd0Var;
    }

    @Override // org.telegram.ui.Components.jv0
    public final int B0() {
        return 32;
    }

    @Override // org.telegram.ui.Components.jv0
    public final boolean N() {
        return true;
    }

    @Override // org.telegram.ui.Components.jv0
    public final int S0() {
        return 3;
    }

    @Override // org.telegram.ui.Components.jv0
    public final TL_stories.MediaArea getStoriesArea() {
        return this.f2.M0;
    }
}
