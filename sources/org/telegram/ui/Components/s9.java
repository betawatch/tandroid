package org.telegram.ui.Components;

import android.app.Activity;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class s9 implements View.OnClickListener {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ u9 b;

    public /* synthetic */ s9(u9 u9Var) {
        this.b = u9Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i7 = this.a;
        u9 u9Var = this.b;
        switch (i7) {
            case 0:
                int i10 = u9Var.w + 1;
                u9Var.w = i10;
                if (i10 >= 10) {
                    u9Var.setVisibility(8);
                    org.telegram.messenger.iz.j1 = null;
                    org.telegram.messenger.iz.y();
                    break;
                }
                break;
            default:
                org.telegram.messenger.t0.u();
                boolean z9 = org.telegram.messenger.r2.a;
                if (org.telegram.messenger.t0.a.b(u9Var.getContext())) {
                    TLRPC.TL_help_appUpdate tL_help_appUpdate = u9Var.n;
                    if (!(tL_help_appUpdate.document instanceof TLRPC.TL_document)) {
                        if (tL_help_appUpdate.url != null) {
                            vf.c.t(u9Var.getContext(), u9Var.n.url);
                            break;
                        }
                    } else if (!org.telegram.messenger.t0.a.v((Activity) u9Var.getContext(), u9Var.n.document)) {
                        org.telegram.messenger.w7.G(u9Var.s).W(u9Var.n.document, "update", 3, 1);
                        u9Var.a(true);
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ s9(u9 u9Var, LaunchActivity launchActivity) {
        this.b = u9Var;
    }
}
