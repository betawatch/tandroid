package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class x11 extends m41 {
    public static final /* synthetic */ int b = 0;

    static {
        m41.h(new x11());
    }

    @Override // org.telegram.ui.Components.m41
    public final void b(View view, n41 n41Var, boolean z10, b51 b51Var, g51 g51Var) {
        y11 y11Var = (y11) view;
        boolean z11 = false;
        if (n41Var.s) {
            y11Var.e();
        } else {
            Object obj = n41Var.H;
            if (obj == null) {
                if (n41Var.C == -2) {
                    y11Var.b(n41Var.r, n41Var.e);
                } else {
                    y11Var.c((n41Var.z & 1) != 0, n41Var.r, n41Var.e);
                }
            } else if (obj instanceof TLRPC.TL_forumTopic) {
                if (n41Var.J) {
                    y11Var.a(n41Var.y, (TLRPC.TL_forumTopic) obj, n41Var.e);
                } else {
                    y11Var.f((TLRPC.TL_forumTopic) obj, n41Var.e);
                }
            }
        }
        if (g51Var != null && g51Var.k3 && y11Var.F) {
            z11 = true;
        }
        y11Var.setReorder(z11);
    }

    @Override // org.telegram.ui.Components.m41
    public final View d(Context context, ek0 ek0Var, int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        return new y11(i7, context, i6Var);
    }
}
