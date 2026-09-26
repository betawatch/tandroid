package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.r61;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.wl0;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class o3 extends u51 {
    public static final /* synthetic */ int a = 0;

    static {
        u51.setup(new o3());
    }

    @Override // org.telegram.ui.Components.u51
    public final void bindView(View view, v51 v51Var, boolean z10, j61 j61Var, r61 r61Var) {
        p3 p3Var = (p3) view;
        p3Var.a((TLRPC.StickerSetCovered) v51Var.G, z10, v51Var.t, false);
        p3Var.e.a(v51Var.t, false);
        p3Var.setAddOnClickListener(v51Var.D);
    }

    @Override // org.telegram.ui.Components.u51
    public final View createView(Context context, wl0 wl0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new p3(context, d6Var);
    }
}
