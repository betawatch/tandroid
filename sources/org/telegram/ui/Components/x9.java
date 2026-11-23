package org.telegram.ui.Components;

import android.app.Activity;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class x9 implements View.OnClickListener {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ y9 b;

    public /* synthetic */ x9(y9 y9Var) {
        this.b = y9Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i7 = this.a;
        y9 y9Var = this.b;
        switch (i7) {
            case 0:
                int i10 = y9Var.w + 1;
                y9Var.w = i10;
                if (i10 >= 10) {
                    y9Var.setVisibility(8);
                    org.telegram.messenger.cz.j1 = null;
                    org.telegram.messenger.cz.y();
                    break;
                }
                break;
            default:
                org.telegram.messenger.t0.u();
                boolean z10 = org.telegram.messenger.s2.a;
                if (org.telegram.messenger.t0.a.b(y9Var.getContext())) {
                    TLRPC.TL_help_appUpdate tL_help_appUpdate = y9Var.n;
                    if (!(tL_help_appUpdate.document instanceof TLRPC.TL_document)) {
                        if (tL_help_appUpdate.url != null) {
                            vf.c.t(y9Var.getContext(), y9Var.n.url);
                            break;
                        }
                    } else if (!org.telegram.messenger.t0.a.v((Activity) y9Var.getContext(), y9Var.n.document)) {
                        org.telegram.messenger.w7.G(y9Var.s).W(y9Var.n.document, "update", 3, 1);
                        y9Var.a(true);
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ x9(y9 y9Var, LaunchActivity launchActivity) {
        this.b = y9Var;
    }
}
