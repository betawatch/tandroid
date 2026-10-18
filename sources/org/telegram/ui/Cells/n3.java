package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.e61;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.s61;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class n3 extends e61 {
    public static final /* synthetic */ int a = 0;

    static {
        e61.setup(new n3());
    }

    @Override // org.telegram.ui.Components.e61
    public final void bindView(View view, f61 f61Var, boolean z10, s61 s61Var, a71 a71Var) {
        o3 o3Var = (o3) view;
        o3Var.a((TLRPC.StickerSetCovered) f61Var.G, z10, f61Var.t, false);
        o3Var.e.a(f61Var.t, false);
        o3Var.setAddOnClickListener(f61Var.D);
    }

    @Override // org.telegram.ui.Components.e61
    public final View createView(Context context, im0 im0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new o3(context, d6Var);
    }
}
