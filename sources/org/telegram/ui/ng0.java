package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class ng0 extends ah.o {
    public final /* synthetic */ int L;
    public boolean M;
    public final /* synthetic */ org.telegram.ui.Components.ja N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ng0(org.telegram.ui.Components.ja jaVar, Context context, org.telegram.ui.ActionBar.e6 e6Var, int i7) {
        super(context, e6Var);
        this.L = i7;
        this.N = jaVar;
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        switch (this.L) {
            case 0:
                super.onLayout(z10, i7, i10, i11, i12);
                qg0 qg0Var = (qg0) this.N;
                qg0Var.h2 = org.telegram.messenger.g0.L(64.0f) + getMeasuredHeight();
                qg0Var.g2.G();
                boolean z11 = this.M;
                boolean z12 = qg0Var.d;
                if (z11 != z12) {
                    this.M = z12;
                    if (z12) {
                        org.telegram.ui.Components.uj0 uj0Var = qg0Var.o1;
                        pi.l lVar = new pi.l(qg0Var.getContext(), 2, 0.6f);
                        lVar.a = 1;
                        lVar.p = org.telegram.messenger.g0.L(36.0f);
                        uj0Var.getLayoutManager().w0(lVar);
                        break;
                    }
                }
                break;
            default:
                super.onLayout(z10, i7, i10, i11, i12);
                wg.c1 c1Var = (wg.c1) this.N;
                c1Var.m2 = org.telegram.messenger.g0.L(64.0f) + getMeasuredHeight();
                c1Var.l2.G();
                boolean z13 = this.M;
                boolean z14 = c1Var.d;
                if (z13 != z14) {
                    this.M = z14;
                    if (z14) {
                        org.telegram.ui.Components.uj0 uj0Var2 = c1Var.o1;
                        pi.l lVar2 = new pi.l(c1Var.getContext(), 2, 0.6f);
                        lVar2.a = 1;
                        lVar2.p = org.telegram.messenger.g0.L(36.0f);
                        uj0Var2.getLayoutManager().w0(lVar2);
                        break;
                    }
                }
                break;
        }
    }
}
