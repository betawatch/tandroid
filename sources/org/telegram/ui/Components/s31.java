package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class s31 extends k61 {
    public static final /* synthetic */ int a = 0;

    static {
        k61.setup(new s31());
    }

    @Override // org.telegram.ui.Components.k61
    public final void bindView(View view, l61 l61Var, boolean z10, z61 z61Var, h71 h71Var) {
        t31 t31Var = (t31) view;
        boolean z11 = false;
        if (l61Var.r) {
            t31Var.f();
        } else {
            Object obj = l61Var.G;
            if (obj == null) {
                if (l61Var.d == -2) {
                    t31Var.c();
                } else {
                    t31Var.d((l61Var.y & 1) != 0, l61Var.q, l61Var.e);
                }
            } else if (obj instanceof TLRPC.TL_forumTopic) {
                if (l61Var.I) {
                    t31Var.b(l61Var.x, (TLRPC.TL_forumTopic) obj, l61Var.e);
                } else {
                    t31Var.g(l61Var.x, (TLRPC.TL_forumTopic) obj, l61Var.e);
                }
            }
        }
        t31Var.L = w7.m6.a(l61Var.y, 8) ? AndroidUtilities.dp(10.0f) : 0;
        if (h71Var != null && h71Var.a3 && t31Var.s) {
            z11 = true;
        }
        t31Var.setReorder(z11);
    }

    @Override // org.telegram.ui.Components.k61
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        return new t31(context, i10, c6Var);
    }
}
