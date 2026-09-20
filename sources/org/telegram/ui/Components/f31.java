package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class f31 extends v51 {
    public static final /* synthetic */ int a = 0;

    static {
        v51.setup(new f31());
    }

    @Override // org.telegram.ui.Components.v51
    public final void bindView(View view, w51 w51Var, boolean z10, k61 k61Var, s61 s61Var) {
        g31 g31Var = (g31) view;
        boolean z11 = false;
        if (w51Var.r) {
            g31Var.f();
        } else {
            Object obj = w51Var.G;
            if (obj == null) {
                if (w51Var.d == -2) {
                    g31Var.c();
                } else {
                    g31Var.d((w51Var.y & 1) != 0, w51Var.q, w51Var.e);
                }
            } else if (obj instanceof TLRPC.TL_forumTopic) {
                if (w51Var.I) {
                    g31Var.b(w51Var.x, (TLRPC.TL_forumTopic) obj, w51Var.e);
                } else {
                    g31Var.g(w51Var.x, (TLRPC.TL_forumTopic) obj, w51Var.e);
                }
            }
        }
        g31Var.L = w7.d0.a(w51Var.y, 8) ? AndroidUtilities.dp(10.0f) : 0;
        if (s61Var != null && s61Var.c3 && g31Var.s) {
            z11 = true;
        }
        g31Var.setReorder(z11);
    }

    @Override // org.telegram.ui.Components.v51
    public final View createView(Context context, vl0 vl0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        return new g31(context, i10, f6Var);
    }
}
