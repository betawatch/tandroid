package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class g11 extends w31 {
    public static final /* synthetic */ int b = 0;

    static {
        w31.h(new g11());
    }

    @Override // org.telegram.ui.Components.w31
    public final void b(View view, x31 x31Var, boolean z9, l41 l41Var, q41 q41Var) {
        h11 h11Var = (h11) view;
        boolean z10 = false;
        if (x31Var.r) {
            h11Var.f();
        } else {
            Object obj = x31Var.G;
            if (obj == null) {
                if (x31Var.d == -2) {
                    h11Var.c();
                } else {
                    h11Var.d((x31Var.y & 1) != 0, x31Var.q, x31Var.e);
                }
            } else if (obj instanceof TLRPC.TL_forumTopic) {
                if (x31Var.I) {
                    h11Var.b(x31Var.x, (TLRPC.TL_forumTopic) obj, x31Var.e);
                } else {
                    h11Var.g(x31Var.x, (TLRPC.TL_forumTopic) obj, x31Var.e);
                }
            }
        }
        h11Var.L = c8.zc.a(x31Var.y, 8) ? org.telegram.messenger.g0.L(10.0f) : 0;
        if (q41Var != null && q41Var.j3 && h11Var.s) {
            z10 = true;
        }
        h11Var.setReorder(z10);
    }

    @Override // org.telegram.ui.Components.w31
    public final View d(Context context, pj0 pj0Var, int i7, org.telegram.ui.ActionBar.f6 f6Var) {
        return new h11(i7, context, f6Var);
    }
}
