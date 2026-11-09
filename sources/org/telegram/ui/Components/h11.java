package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class h11 extends x31 {
    public static final /* synthetic */ int b = 0;

    static {
        x31.h(new h11());
    }

    @Override // org.telegram.ui.Components.x31
    public final void b(View view, y31 y31Var, boolean z9, m41 m41Var, r41 r41Var) {
        i11 i11Var = (i11) view;
        boolean z10 = false;
        if (y31Var.r) {
            i11Var.f();
        } else {
            Object obj = y31Var.G;
            if (obj == null) {
                if (y31Var.d == -2) {
                    i11Var.c();
                } else {
                    i11Var.d((y31Var.y & 1) != 0, y31Var.q, y31Var.e);
                }
            } else if (obj instanceof TLRPC.TL_forumTopic) {
                if (y31Var.I) {
                    i11Var.b(y31Var.x, (TLRPC.TL_forumTopic) obj, y31Var.e);
                } else {
                    i11Var.g(y31Var.x, (TLRPC.TL_forumTopic) obj, y31Var.e);
                }
            }
        }
        i11Var.L = c8.zc.a(y31Var.y, 8) ? org.telegram.messenger.g0.L(10.0f) : 0;
        if (r41Var != null && r41Var.j3 && i11Var.s) {
            z10 = true;
        }
        i11Var.setReorder(z10);
    }

    @Override // org.telegram.ui.Components.x31
    public final View d(Context context, qj0 qj0Var, int i7, org.telegram.ui.ActionBar.g6 g6Var) {
        return new i11(i7, context, g6Var);
    }
}
