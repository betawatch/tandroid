package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class l31 extends x51 {
    public static final /* synthetic */ int a = 0;

    static {
        x51.setup(new l31());
    }

    @Override // org.telegram.ui.Components.x51
    public final void bindView(View view, y51 y51Var, boolean z10, m61 m61Var, u61 u61Var) {
        m31 m31Var = (m31) view;
        boolean z11 = false;
        if (y51Var.r) {
            m31Var.e();
        } else {
            Object obj = y51Var.G;
            if (obj == null) {
                if (y51Var.B == -2) {
                    m31Var.b(y51Var.q, y51Var.e);
                } else {
                    m31Var.c((y51Var.y & 1) != 0, y51Var.q, y51Var.e);
                }
            } else if (obj instanceof TLRPC.TL_forumTopic) {
                if (y51Var.I) {
                    m31Var.a(y51Var.x, (TLRPC.TL_forumTopic) obj, y51Var.e);
                } else {
                    m31Var.f((TLRPC.TL_forumTopic) obj, y51Var.e);
                }
            }
        }
        if (u61Var != null && u61Var.c3 && m31Var.y) {
            z11 = true;
        }
        m31Var.setReorder(z11);
    }

    @Override // org.telegram.ui.Components.x51
    public final View createView(Context context, yl0 yl0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        return new m31(context, i10, f6Var);
    }
}
