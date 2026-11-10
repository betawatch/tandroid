package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Components.w31;
import org.telegram.ui.Components.x31;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class p3 extends w31 {
    public static final /* synthetic */ int b = 0;

    static {
        w31.h(new p3());
    }

    @Override // org.telegram.ui.Components.w31
    public final void b(View view, x31 x31Var, boolean z9, m41 m41Var, r41 r41Var) {
        q3 q3Var = (q3) view;
        q3Var.a((TLRPC.StickerSetCovered) x31Var.G, z9, x31Var.t, false);
        q3Var.f.a(x31Var.t, false);
        q3Var.setAddOnClickListener(x31Var.D);
    }

    @Override // org.telegram.ui.Components.w31
    public final View d(Context context, pj0 pj0Var, int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        return new q3(context, h6Var);
    }
}
