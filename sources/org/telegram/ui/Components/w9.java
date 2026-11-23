package org.telegram.ui.Components;

import android.app.Activity;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class w9 implements View.OnClickListener {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ x9 b;

    public /* synthetic */ w9(x9 x9Var) {
        this.b = x9Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i7 = this.a;
        x9 x9Var = this.b;
        switch (i7) {
            case 0:
                int i10 = x9Var.w + 1;
                x9Var.w = i10;
                if (i10 >= 10) {
                    x9Var.setVisibility(8);
                    org.telegram.messenger.bz.j1 = null;
                    org.telegram.messenger.bz.y();
                    break;
                }
                break;
            default:
                org.telegram.messenger.t0.u();
                boolean z10 = org.telegram.messenger.s2.a;
                if (org.telegram.messenger.t0.a.b(x9Var.getContext())) {
                    TLRPC.TL_help_appUpdate tL_help_appUpdate = x9Var.n;
                    if (!(tL_help_appUpdate.document instanceof TLRPC.TL_document)) {
                        if (tL_help_appUpdate.url != null) {
                            vf.c.t(x9Var.getContext(), x9Var.n.url);
                            break;
                        }
                    } else if (!org.telegram.messenger.t0.a.v((Activity) x9Var.getContext(), x9Var.n.document)) {
                        org.telegram.messenger.w7.G(x9Var.s).W(x9Var.n.document, "update", 3, 1);
                        x9Var.a(true);
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ w9(x9 x9Var, LaunchActivity launchActivity) {
        this.b = x9Var;
    }
}
