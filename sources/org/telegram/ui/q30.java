package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class q30 extends org.telegram.ui.Components.voip.k {
    public final /* synthetic */ int h = 1;
    public final /* synthetic */ org.telegram.ui.Components.sj0 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q30(a40 a40Var, Context context) {
        super(context, true);
        this.n = a40Var;
    }

    @Override // org.telegram.ui.Components.voip.k, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        switch (this.h) {
            case 0:
                super.onAttachedToWindow();
                x30 x30Var = ((r30) this.n).N;
                if (x30Var.I1.getVisibility() == 0 && x30Var.H4) {
                    x30.J0(x30Var, this, true);
                    break;
                }
                break;
            default:
                super.onAttachedToWindow();
                a40 a40Var = (a40) this.n;
                if (a40Var.r && getParticipant() != null) {
                    a40Var.E(this, true);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.voip.k, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        switch (this.h) {
            case 0:
                super.onDetachedFromWindow();
                x30.J0(((r30) this.n).N, this, false);
                break;
            default:
                super.onDetachedFromWindow();
                ((a40) this.n).E(this, false);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q30(r30 r30Var, Context context) {
        super(context, false);
        this.n = r30Var;
    }
}
