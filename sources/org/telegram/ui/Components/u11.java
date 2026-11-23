package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class u11 extends n41 {
    public static final /* synthetic */ int b = 0;

    static {
        n41.h(new u11());
    }

    @Override // org.telegram.ui.Components.n41
    public final void b(View view, o41 o41Var, boolean z10, c51 c51Var, h51 h51Var) {
        v11 v11Var = (v11) view;
        boolean z11 = false;
        if (o41Var.s) {
            v11Var.f();
        } else {
            Object obj = o41Var.H;
            if (obj == null) {
                if (o41Var.d == -2) {
                    v11Var.c();
                } else {
                    v11Var.d((o41Var.z & 1) != 0, o41Var.r, o41Var.e);
                }
            } else if (obj instanceof TLRPC.TL_forumTopic) {
                if (o41Var.J) {
                    v11Var.b(o41Var.y, (TLRPC.TL_forumTopic) obj, o41Var.e);
                } else {
                    v11Var.g(o41Var.y, (TLRPC.TL_forumTopic) obj, o41Var.e);
                }
            }
        }
        v11Var.M = c8.dd.a(o41Var.z, 8) ? org.telegram.messenger.g0.L(10.0f) : 0;
        if (h51Var != null && h51Var.k3 && v11Var.s) {
            z11 = true;
        }
        v11Var.setReorder(z11);
    }

    @Override // org.telegram.ui.Components.n41
    public final View d(Context context, ek0 ek0Var, int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        return new v11(i7, context, h6Var);
    }
}
