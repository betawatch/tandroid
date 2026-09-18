package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.w51;
import org.telegram.ui.Components.wl0;
import org.telegram.ui.Components.x51;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class o3 extends w51 {
    public static final /* synthetic */ int a = 0;

    static {
        w51.setup(new o3());
    }

    @Override // org.telegram.ui.Components.w51
    public final void bindView(View view, x51 x51Var, boolean z10, l61 l61Var, t61 t61Var) {
        p3 p3Var = (p3) view;
        p3Var.a((TLRPC.StickerSetCovered) x51Var.G, z10, x51Var.t, false);
        p3Var.e.a(x51Var.t, false);
        p3Var.setAddOnClickListener(x51Var.D);
    }

    @Override // org.telegram.ui.Components.w51
    public final View createView(Context context, wl0 wl0Var, int i10, int i11, org.telegram.ui.ActionBar.e6 e6Var) {
        return new p3(context, e6Var);
    }
}
