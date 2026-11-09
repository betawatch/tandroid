package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class l11 extends x31 {
    public static final /* synthetic */ int b = 0;

    static {
        x31.h(new l11());
    }

    @Override // org.telegram.ui.Components.x31
    public final void b(View view, y31 y31Var, boolean z9, m41 m41Var, r41 r41Var) {
        m11 m11Var = (m11) view;
        boolean z10 = false;
        if (y31Var.r) {
            m11Var.e();
        } else {
            Object obj = y31Var.G;
            if (obj == null) {
                if (y31Var.B == -2) {
                    m11Var.b(y31Var.q, y31Var.e);
                } else {
                    m11Var.c((y31Var.y & 1) != 0, y31Var.q, y31Var.e);
                }
            } else if (obj instanceof TLRPC.TL_forumTopic) {
                if (y31Var.I) {
                    m11Var.a(y31Var.x, (TLRPC.TL_forumTopic) obj, y31Var.e);
                } else {
                    m11Var.f((TLRPC.TL_forumTopic) obj, y31Var.e);
                }
            }
        }
        if (r41Var != null && r41Var.j3 && m11Var.E) {
            z10 = true;
        }
        m11Var.setReorder(z10);
    }

    @Override // org.telegram.ui.Components.x31
    public final View d(Context context, qj0 qj0Var, int i7, org.telegram.ui.ActionBar.g6 g6Var) {
        return new m11(i7, context, g6Var);
    }
}
