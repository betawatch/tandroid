package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.r71;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.t61;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class l3 extends s61 {
    public static final /* synthetic */ int a = 0;

    static {
        s61.setup(new l3());
    }

    @Override // org.telegram.ui.Components.s61
    public final void bindView(View view, t61 t61Var, boolean z10, j71 j71Var, r71 r71Var) {
        m3 m3Var = (m3) view;
        m3Var.a((TLRPC.StickerSetCovered) t61Var.G, z10, t61Var.t, false);
        m3Var.f.a(t61Var.t, false);
        m3Var.setAddOnClickListener(t61Var.D);
    }

    @Override // org.telegram.ui.Components.s61
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, org.telegram.ui.ActionBar.u6 u6Var) {
        return new m3(context, u6Var);
    }
}
