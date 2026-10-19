package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.t61;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class n3 extends f61 {
    public static final /* synthetic */ int a = 0;

    static {
        f61.setup(new n3());
    }

    @Override // org.telegram.ui.Components.f61
    public final void bindView(View view, g61 g61Var, boolean z10, t61 t61Var, b71 b71Var) {
        o3 o3Var = (o3) view;
        o3Var.a((TLRPC.StickerSetCovered) g61Var.G, z10, g61Var.t, false);
        o3Var.e.a(g61Var.t, false);
        o3Var.setAddOnClickListener(g61Var.D);
    }

    @Override // org.telegram.ui.Components.f61
    public final View createView(Context context, im0 im0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new o3(context, d6Var);
    }
}
