package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class fc0 extends org.telegram.ui.Components.sv0 {
    public final /* synthetic */ pc0 f2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fc0(pc0 pc0Var, Context context, org.telegram.ui.Components.kv0 kv0Var, pc0 pc0Var2, ec0 ec0Var, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, 0L, kv0Var, 0, null, null, null, 8, 0, pc0Var2, ec0Var, 0, d6Var, null);
        this.f2 = pc0Var;
    }

    @Override // org.telegram.ui.Components.sv0
    public final int D0() {
        return 32;
    }

    @Override // org.telegram.ui.Components.sv0
    public final boolean N() {
        return true;
    }

    @Override // org.telegram.ui.Components.sv0
    public final int U0() {
        return 3;
    }

    @Override // org.telegram.ui.Components.sv0
    public final TL_stories.MediaArea getStoriesArea() {
        return this.f2.M0;
    }
}
