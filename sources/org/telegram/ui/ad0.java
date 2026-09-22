package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class ad0 extends org.telegram.ui.Components.lv0 {
    public final /* synthetic */ kd0 f2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ad0(kd0 kd0Var, Context context, org.telegram.ui.Components.dv0 dv0Var, kd0 kd0Var2, zc0 zc0Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, 0L, dv0Var, 0, null, null, null, 8, 0, kd0Var2, zc0Var, 0, f6Var, null);
        this.f2 = kd0Var;
    }

    @Override // org.telegram.ui.Components.lv0
    public final int B0() {
        return 32;
    }

    @Override // org.telegram.ui.Components.lv0
    public final boolean N() {
        return true;
    }

    @Override // org.telegram.ui.Components.lv0
    public final int S0() {
        return 3;
    }

    @Override // org.telegram.ui.Components.lv0
    public final TL_stories.MediaArea getStoriesArea() {
        return this.f2.M0;
    }
}
