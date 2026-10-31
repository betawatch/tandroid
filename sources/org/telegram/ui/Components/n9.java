package org.telegram.ui.Components;

import android.app.Activity;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class n9 implements View.OnClickListener {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ o9 b;

    public /* synthetic */ n9(o9 o9Var) {
        this.b = o9Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.a;
        o9 o9Var = this.b;
        switch (i10) {
            case 0:
                int i11 = o9Var.w + 1;
                o9Var.w = i11;
                if (i11 >= 10) {
                    o9Var.setVisibility(8);
                    org.telegram.messenger.tz.j1 = null;
                    org.telegram.messenger.tz.y();
                    break;
                }
                break;
            default:
                org.telegram.messenger.w0.u();
                boolean z10 = org.telegram.messenger.v2.a;
                if (org.telegram.messenger.w0.a.b(o9Var.getContext())) {
                    TLRPC.TL_help_appUpdate tL_help_appUpdate = o9Var.n;
                    if (!(tL_help_appUpdate.document instanceof TLRPC.TL_document)) {
                        if (tL_help_appUpdate.url != null) {
                            gf.f.r(o9Var.getContext(), o9Var.n.url);
                            break;
                        }
                    } else if (!org.telegram.messenger.w0.a.v((Activity) o9Var.getContext(), o9Var.n.document)) {
                        org.telegram.messenger.b8.G(o9Var.s).X(o9Var.n.document, "update", 3, 1);
                        o9Var.a(true);
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ n9(o9 o9Var, LaunchActivity launchActivity) {
        this.b = o9Var;
    }
}
