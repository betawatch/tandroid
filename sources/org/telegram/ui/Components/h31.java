package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class h31 extends x51 {
    public static final /* synthetic */ int a = 0;

    static {
        x51.setup(new h31());
    }

    @Override // org.telegram.ui.Components.x51
    public final void bindView(View view, y51 y51Var, boolean z10, m61 m61Var, u61 u61Var) {
        i31 i31Var = (i31) view;
        boolean z11 = false;
        if (y51Var.r) {
            i31Var.f();
        } else {
            Object obj = y51Var.G;
            if (obj == null) {
                if (y51Var.d == -2) {
                    i31Var.c();
                } else {
                    i31Var.d((y51Var.y & 1) != 0, y51Var.q, y51Var.e);
                }
            } else if (obj instanceof TLRPC.TL_forumTopic) {
                if (y51Var.I) {
                    i31Var.b(y51Var.x, (TLRPC.TL_forumTopic) obj, y51Var.e);
                } else {
                    i31Var.g(y51Var.x, (TLRPC.TL_forumTopic) obj, y51Var.e);
                }
            }
        }
        i31Var.L = w7.d0.a(y51Var.y, 8) ? AndroidUtilities.dp(10.0f) : 0;
        if (u61Var != null && u61Var.c3 && i31Var.s) {
            z11 = true;
        }
        i31Var.setReorder(z11);
    }

    @Override // org.telegram.ui.Components.x51
    public final View createView(Context context, yl0 yl0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        return new i31(context, i10, f6Var);
    }
}
