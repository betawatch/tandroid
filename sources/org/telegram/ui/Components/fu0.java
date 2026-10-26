package org.telegram.ui.Components;

import android.content.Context;
import android.os.Bundle;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class fu0 extends org.telegram.ui.wn {
    public final /* synthetic */ aw0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fu0(aw0 aw0Var, Context context, org.telegram.ui.ActionBar.j5 j5Var, Bundle bundle) {
        super(context, j5Var, bundle);
        this.f = aw0Var;
    }

    @Override // org.telegram.ui.wn
    public final void b(boolean z10) {
        org.telegram.ui.ActionBar.w0 w0Var = this.f.p0;
        if (w0Var != null) {
            w0Var.setShowSearchProgress(z10);
        }
    }
}
