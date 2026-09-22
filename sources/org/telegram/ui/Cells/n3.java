package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.e61;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.w51;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class n3 extends h51 {
    public static final /* synthetic */ int a = 0;

    static {
        h51.setup(new n3());
    }

    @Override // org.telegram.ui.Components.h51
    public final void bindView(View view, i51 i51Var, boolean z10, w51 w51Var, e61 e61Var) {
        o3 o3Var = (o3) view;
        o3Var.a((TLRPC.StickerSetCovered) i51Var.G, z10, i51Var.t, false);
        o3Var.e.a(i51Var.t, false);
        o3Var.setAddOnClickListener(i51Var.D);
    }

    @Override // org.telegram.ui.Components.h51
    public final View createView(Context context, ll0 ll0Var, int i10, int i11, org.telegram.ui.ActionBar.e6 e6Var) {
        return new o3(context, e6Var);
    }
}
