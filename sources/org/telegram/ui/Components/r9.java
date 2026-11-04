package org.telegram.ui.Components;

import android.app.Activity;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class r9 implements View.OnClickListener {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ t9 b;

    public /* synthetic */ r9(t9 t9Var) {
        this.b = t9Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i3 = this.a;
        t9 t9Var = this.b;
        switch (i3) {
            case 0:
                int i10 = t9Var.w + 1;
                t9Var.w = i10;
                if (i10 >= 10) {
                    t9Var.setVisibility(8);
                    org.telegram.messenger.az.j1 = null;
                    org.telegram.messenger.az.y();
                    break;
                }
                break;
            default:
                org.telegram.messenger.t0.u();
                boolean z10 = org.telegram.messenger.r2.a;
                if (org.telegram.messenger.t0.a.b(t9Var.getContext())) {
                    TLRPC.TL_help_appUpdate tL_help_appUpdate = t9Var.n;
                    if (!(tL_help_appUpdate.document instanceof TLRPC.TL_document)) {
                        if (tL_help_appUpdate.url != null) {
                            sf.c.t(t9Var.getContext(), t9Var.n.url);
                            break;
                        }
                    } else if (!org.telegram.messenger.t0.a.v((Activity) t9Var.getContext(), t9Var.n.document)) {
                        org.telegram.messenger.w7.G(t9Var.s).X(t9Var.n.document, "update", 3, 1);
                        t9Var.a(true);
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ r9(t9 t9Var, LaunchActivity launchActivity) {
        this.b = t9Var;
    }
}
