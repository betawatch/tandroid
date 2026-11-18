package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class t11 extends k41 {
    public static final /* synthetic */ int b = 0;

    static {
        k41.h(new t11());
    }

    @Override // org.telegram.ui.Components.k41
    public final void b(View view, l41 l41Var, boolean z10, z41 z41Var, e51 e51Var) {
        u11 u11Var = (u11) view;
        boolean z11 = false;
        if (l41Var.s) {
            u11Var.f();
        } else {
            Object obj = l41Var.H;
            if (obj == null) {
                if (l41Var.d == -2) {
                    u11Var.c();
                } else {
                    u11Var.d((l41Var.z & 1) != 0, l41Var.r, l41Var.e);
                }
            } else if (obj instanceof TLRPC.TL_forumTopic) {
                if (l41Var.J) {
                    u11Var.b(l41Var.y, (TLRPC.TL_forumTopic) obj, l41Var.e);
                } else {
                    u11Var.g(l41Var.y, (TLRPC.TL_forumTopic) obj, l41Var.e);
                }
            }
        }
        u11Var.M = c8.dd.a(l41Var.z, 8) ? org.telegram.messenger.g0.L(10.0f) : 0;
        if (e51Var != null && e51Var.k3 && u11Var.s) {
            z11 = true;
        }
        u11Var.setReorder(z11);
    }

    @Override // org.telegram.ui.Components.k41
    public final View d(Context context, ck0 ck0Var, int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        return new u11(i7, context, i6Var);
    }
}
