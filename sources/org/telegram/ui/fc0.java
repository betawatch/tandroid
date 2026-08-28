package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class fc0 extends org.telegram.ui.Components.eu0 {
    public final /* synthetic */ pc0 b2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fc0(pc0 pc0Var, Context context, org.telegram.ui.Components.wt0 wt0Var, pc0 pc0Var2, ec0 ec0Var, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context, 0L, wt0Var, 0, null, null, null, 8, 0, pc0Var2, ec0Var, 0, b6Var, null);
        this.b2 = pc0Var;
    }

    @Override // org.telegram.ui.Components.eu0
    public final int B0() {
        return 32;
    }

    @Override // org.telegram.ui.Components.eu0
    public final boolean N() {
        return true;
    }

    @Override // org.telegram.ui.Components.eu0
    public final int S0() {
        return 3;
    }

    @Override // org.telegram.ui.Components.eu0
    public final TL_stories.MediaArea getStoriesArea() {
        return this.b2.I0;
    }
}
