package org.telegram.ui.Components;

import android.app.Activity;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class p9 implements View.OnClickListener {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ q9 b;

    public /* synthetic */ p9(q9 q9Var) {
        this.b = q9Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i7 = this.a;
        q9 q9Var = this.b;
        switch (i7) {
            case 0:
                int i10 = q9Var.w + 1;
                q9Var.w = i10;
                if (i10 >= 10) {
                    q9Var.setVisibility(8);
                    org.telegram.messenger.gz.j1 = null;
                    org.telegram.messenger.gz.y();
                    break;
                }
                break;
            default:
                org.telegram.messenger.t0.u();
                boolean z10 = org.telegram.messenger.r2.a;
                if (org.telegram.messenger.t0.a.b(q9Var.getContext())) {
                    TLRPC.TL_help_appUpdate tL_help_appUpdate = q9Var.n;
                    if (!(tL_help_appUpdate.document instanceof TLRPC.TL_document)) {
                        if (tL_help_appUpdate.url != null) {
                            vf.c.t(q9Var.getContext(), q9Var.n.url);
                            break;
                        }
                    } else if (!org.telegram.messenger.t0.a.v((Activity) q9Var.getContext(), q9Var.n.document)) {
                        org.telegram.messenger.w7.G(q9Var.s).W(q9Var.n.document, "update", 3, 1);
                        q9Var.a(true);
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ p9(q9 q9Var, LaunchActivity launchActivity) {
        this.b = q9Var;
    }
}
