package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class o31 extends e61 {
    public static final /* synthetic */ int a = 0;

    static {
        e61.setup(new o31());
    }

    @Override // org.telegram.ui.Components.e61
    public final void bindView(View view, f61 f61Var, boolean z10, s61 s61Var, a71 a71Var) {
        p31 p31Var = (p31) view;
        boolean z11 = false;
        if (f61Var.r) {
            p31Var.e();
        } else {
            Object obj = f61Var.G;
            if (obj == null) {
                if (f61Var.B == -2) {
                    p31Var.b(f61Var.q, f61Var.e);
                } else {
                    p31Var.c((f61Var.y & 1) != 0, f61Var.q, f61Var.e);
                }
            } else if (obj instanceof TLRPC.TL_forumTopic) {
                if (f61Var.I) {
                    p31Var.a(f61Var.x, (TLRPC.TL_forumTopic) obj, f61Var.e);
                } else {
                    p31Var.f((TLRPC.TL_forumTopic) obj, f61Var.e);
                }
            }
        }
        if (a71Var != null && a71Var.a3 && p31Var.y) {
            z11 = true;
        }
        p31Var.setReorder(z11);
    }

    @Override // org.telegram.ui.Components.e61
    public final View createView(Context context, im0 im0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new p31(context, i10, d6Var);
    }
}
