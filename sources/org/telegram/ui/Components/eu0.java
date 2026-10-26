package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class eu0 extends uv0 {
    public final /* synthetic */ aw0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eu0(aw0 aw0Var, Context context) {
        super(aw0Var, context);
        this.h = aw0Var;
    }

    @Override // s4.h0
    public final void l() {
        super.l();
        aw0 aw0Var = this.h;
        tu0 d02 = aw0Var.d0(0);
        if (d02 == null || d02.n.getVisibility() != 0) {
            return;
        }
        aw0Var.K.l();
    }
}
