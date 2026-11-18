package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.z41;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class q3 extends k41 {
    public static final /* synthetic */ int b = 0;

    static {
        k41.h(new q3());
    }

    @Override // org.telegram.ui.Components.k41
    public final void b(View view, l41 l41Var, boolean z10, z41 z41Var, e51 e51Var) {
        r3 r3Var = (r3) view;
        r3Var.a((TLRPC.StickerSetCovered) l41Var.H, z10, l41Var.u, false);
        r3Var.f.a(l41Var.u, false);
        r3Var.setAddOnClickListener(l41Var.E);
    }

    @Override // org.telegram.ui.Components.k41
    public final View d(Context context, ck0 ck0Var, int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        return new r3(context, i6Var);
    }
}
