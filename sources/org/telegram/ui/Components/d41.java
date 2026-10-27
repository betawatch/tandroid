package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class d41 extends t61 {
    public static final /* synthetic */ int a = 0;

    static {
        t61.setup(new d41());
    }

    @Override // org.telegram.ui.Components.t61
    public final void bindView(View view, u61 u61Var, boolean z10, k71 k71Var, s71 s71Var) {
        e41 e41Var = (e41) view;
        boolean z11 = false;
        if (u61Var.r) {
            e41Var.e();
        } else {
            Object obj = u61Var.G;
            if (obj == null) {
                if (u61Var.B == -2) {
                    e41Var.b(u61Var.q, u61Var.e);
                } else {
                    e41Var.c((u61Var.y & 1) != 0, u61Var.q, u61Var.e);
                }
            } else if (obj instanceof TLRPC.TL_forumTopic) {
                if (u61Var.I) {
                    e41Var.a(u61Var.x, (TLRPC.TL_forumTopic) obj, u61Var.e);
                } else {
                    e41Var.f((TLRPC.TL_forumTopic) obj, u61Var.e);
                }
            }
        }
        if (s71Var != null && s71Var.k3 && e41Var.E) {
            z11 = true;
        }
        e41Var.setReorder(z11);
    }

    @Override // org.telegram.ui.Components.t61
    public final View createView(Context context, nm0 nm0Var, int i10, int i11, org.telegram.ui.ActionBar.u6 u6Var) {
        return new e41(context, i10, u6Var);
    }
}
