package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class qc0 extends org.telegram.ui.Components.yu0 {
    public final /* synthetic */ ad0 c2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qc0(ad0 ad0Var, Context context, org.telegram.ui.Components.qu0 qu0Var, ad0 ad0Var2, pc0 pc0Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, 0L, qu0Var, 0, null, null, null, 8, 0, ad0Var2, pc0Var, 0, f6Var, null);
        this.c2 = ad0Var;
    }

    @Override // org.telegram.ui.Components.yu0
    public final int B0() {
        return 32;
    }

    @Override // org.telegram.ui.Components.yu0
    public final boolean N() {
        return true;
    }

    @Override // org.telegram.ui.Components.yu0
    public final int S0() {
        return 3;
    }

    @Override // org.telegram.ui.Components.yu0
    public final TL_stories.MediaArea getStoriesArea() {
        return this.c2.J0;
    }
}
