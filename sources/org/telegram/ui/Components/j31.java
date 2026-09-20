package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class j31 extends v51 {
    public static final /* synthetic */ int a = 0;

    static {
        v51.setup(new j31());
    }

    @Override // org.telegram.ui.Components.v51
    public final void bindView(View view, w51 w51Var, boolean z10, k61 k61Var, s61 s61Var) {
        k31 k31Var = (k31) view;
        boolean z11 = false;
        if (w51Var.r) {
            k31Var.e();
        } else {
            Object obj = w51Var.G;
            if (obj == null) {
                if (w51Var.B == -2) {
                    k31Var.b(w51Var.q, w51Var.e);
                } else {
                    k31Var.c((w51Var.y & 1) != 0, w51Var.q, w51Var.e);
                }
            } else if (obj instanceof TLRPC.TL_forumTopic) {
                if (w51Var.I) {
                    k31Var.a(w51Var.x, (TLRPC.TL_forumTopic) obj, w51Var.e);
                } else {
                    k31Var.f((TLRPC.TL_forumTopic) obj, w51Var.e);
                }
            }
        }
        if (s61Var != null && s61Var.c3 && k31Var.y) {
            z11 = true;
        }
        k31Var.setReorder(z11);
    }

    @Override // org.telegram.ui.Components.v51
    public final View createView(Context context, vl0 vl0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        return new k31(context, i10, f6Var);
    }
}
