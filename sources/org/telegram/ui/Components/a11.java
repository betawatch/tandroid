package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class a11 extends q31 {
    public static final /* synthetic */ int b = 0;

    static {
        q31.h(new a11());
    }

    @Override // org.telegram.ui.Components.q31
    public final void b(View view, r31 r31Var, boolean z9, f41 f41Var, k41 k41Var) {
        b11 b11Var = (b11) view;
        boolean z10 = false;
        if (r31Var.r) {
            b11Var.f();
        } else {
            Object obj = r31Var.G;
            if (obj == null) {
                if (r31Var.d == -2) {
                    b11Var.c();
                } else {
                    b11Var.d((r31Var.y & 1) != 0, r31Var.q, r31Var.e);
                }
            } else if (obj instanceof TLRPC.TL_forumTopic) {
                if (r31Var.I) {
                    b11Var.b(r31Var.x, (TLRPC.TL_forumTopic) obj, r31Var.e);
                } else {
                    b11Var.g(r31Var.x, (TLRPC.TL_forumTopic) obj, r31Var.e);
                }
            }
        }
        b11Var.L = c8.yc.a(r31Var.y, 8) ? org.telegram.messenger.g0.L(10.0f) : 0;
        if (k41Var != null && k41Var.j3 && b11Var.s) {
            z10 = true;
        }
        b11Var.setReorder(z10);
    }

    @Override // org.telegram.ui.Components.q31
    public final View d(Context context, pj0 pj0Var, int i7, org.telegram.ui.ActionBar.f6 f6Var) {
        return new b11(i7, context, f6Var);
    }
}
