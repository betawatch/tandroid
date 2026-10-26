package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class fc0 extends org.telegram.ui.Components.aw0 {
    public final /* synthetic */ pc0 r2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fc0(pc0 pc0Var, Context context, org.telegram.ui.Components.sv0 sv0Var, pc0 pc0Var2, ec0 ec0Var, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, 0L, sv0Var, 0, null, null, null, 8, 0, pc0Var2, ec0Var, 0, u6Var, null);
        this.r2 = pc0Var;
    }

    @Override // org.telegram.ui.Components.aw0
    public final int J0() {
        return 32;
    }

    @Override // org.telegram.ui.Components.aw0
    public final boolean V() {
        return true;
    }

    @Override // org.telegram.ui.Components.aw0
    public final int Y0() {
        return 3;
    }

    @Override // org.telegram.ui.Components.aw0
    public final TL_stories.MediaArea getStoriesArea() {
        return this.r2.L0;
    }
}
