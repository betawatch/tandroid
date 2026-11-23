package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class t11 extends m41 {
    public static final /* synthetic */ int b = 0;

    static {
        m41.h(new t11());
    }

    @Override // org.telegram.ui.Components.m41
    public final void b(View view, n41 n41Var, boolean z10, b51 b51Var, g51 g51Var) {
        u11 u11Var = (u11) view;
        boolean z11 = false;
        if (n41Var.s) {
            u11Var.f();
        } else {
            Object obj = n41Var.H;
            if (obj == null) {
                if (n41Var.d == -2) {
                    u11Var.c();
                } else {
                    u11Var.d((n41Var.z & 1) != 0, n41Var.r, n41Var.e);
                }
            } else if (obj instanceof TLRPC.TL_forumTopic) {
                if (n41Var.J) {
                    u11Var.b(n41Var.y, (TLRPC.TL_forumTopic) obj, n41Var.e);
                } else {
                    u11Var.g(n41Var.y, (TLRPC.TL_forumTopic) obj, n41Var.e);
                }
            }
        }
        u11Var.M = c8.ed.a(n41Var.z, 8) ? org.telegram.messenger.g0.L(10.0f) : 0;
        if (g51Var != null && g51Var.k3 && u11Var.s) {
            z11 = true;
        }
        u11Var.setReorder(z11);
    }

    @Override // org.telegram.ui.Components.m41
    public final View d(Context context, ek0 ek0Var, int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        return new u11(i7, context, i6Var);
    }
}
