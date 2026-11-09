package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class pg0 extends ah.o {
    public final /* synthetic */ int K;
    public boolean L;
    public final /* synthetic */ org.telegram.ui.Components.na M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pg0(org.telegram.ui.Components.na naVar, Context context, org.telegram.ui.ActionBar.g6 g6Var, int i7) {
        super(context, g6Var);
        this.K = i7;
        this.M = naVar;
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        switch (this.K) {
            case 0:
                super.onLayout(z9, i7, i10, i11, i12);
                sg0 sg0Var = (sg0) this.M;
                sg0Var.d2 = org.telegram.messenger.g0.L(64.0f) + getMeasuredHeight();
                sg0Var.c2.G();
                boolean z10 = this.L;
                boolean z11 = sg0Var.d;
                if (z10 != z11) {
                    this.L = z11;
                    if (z11) {
                        org.telegram.ui.Components.qj0 qj0Var = sg0Var.k1;
                        mi.m mVar = new mi.m(sg0Var.getContext(), 2, 0.6f);
                        mVar.a = 1;
                        mVar.p = org.telegram.messenger.g0.L(36.0f);
                        qj0Var.getLayoutManager().w0(mVar);
                        break;
                    }
                }
                break;
            default:
                super.onLayout(z9, i7, i10, i11, i12);
                wg.f1 f1Var = (wg.f1) this.M;
                f1Var.i2 = org.telegram.messenger.g0.L(64.0f) + getMeasuredHeight();
                f1Var.h2.G();
                boolean z12 = this.L;
                boolean z13 = f1Var.d;
                if (z12 != z13) {
                    this.L = z13;
                    if (z13) {
                        org.telegram.ui.Components.qj0 qj0Var2 = f1Var.k1;
                        mi.m mVar2 = new mi.m(f1Var.getContext(), 2, 0.6f);
                        mVar2.a = 1;
                        mVar2.p = org.telegram.messenger.g0.L(36.0f);
                        qj0Var2.getLayoutManager().w0(mVar2);
                        break;
                    }
                }
                break;
        }
    }
}
