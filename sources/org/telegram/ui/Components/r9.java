package org.telegram.ui.Components;

import android.app.Activity;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class r9 implements View.OnClickListener {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ t9 b;

    public /* synthetic */ r9(t9 t9Var) {
        this.b = t9Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i7 = this.a;
        t9 t9Var = this.b;
        switch (i7) {
            case 0:
                int i10 = t9Var.w + 1;
                t9Var.w = i10;
                if (i10 >= 10) {
                    t9Var.setVisibility(8);
                    org.telegram.messenger.iz.j1 = null;
                    org.telegram.messenger.iz.y();
                    break;
                }
                break;
            default:
                org.telegram.messenger.t0.u();
                boolean z9 = org.telegram.messenger.r2.a;
                if (org.telegram.messenger.t0.a.b(t9Var.getContext())) {
                    TLRPC.TL_help_appUpdate tL_help_appUpdate = t9Var.n;
                    if (!(tL_help_appUpdate.document instanceof TLRPC.TL_document)) {
                        if (tL_help_appUpdate.url != null) {
                            vf.c.t(t9Var.getContext(), t9Var.n.url);
                            break;
                        }
                    } else if (!org.telegram.messenger.t0.a.v((Activity) t9Var.getContext(), t9Var.n.document)) {
                        org.telegram.messenger.w7.G(t9Var.s).W(t9Var.n.document, "update", 3, 1);
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
