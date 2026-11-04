package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class hg0 extends bh.m {
    public final /* synthetic */ int L;
    public boolean M;
    public final /* synthetic */ org.telegram.ui.Components.ma N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hg0(org.telegram.ui.Components.ma maVar, Context context, org.telegram.ui.ActionBar.e6 e6Var, int i3) {
        super(context, e6Var);
        this.L = i3;
        this.N = maVar;
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        switch (this.L) {
            case 0:
                super.onLayout(z10, i3, i10, i11, i12);
                kg0 kg0Var = (kg0) this.N;
                kg0Var.e2 = org.telegram.messenger.g0.L(64.0f) + getMeasuredHeight();
                kg0Var.d2.G();
                boolean z11 = this.M;
                boolean z12 = kg0Var.d;
                if (z11 != z12) {
                    this.M = z12;
                    if (z12) {
                        org.telegram.ui.Components.tj0 tj0Var = kg0Var.l1;
                        ni.m mVar = new ni.m(kg0Var.getContext(), 2, 0.6f);
                        mVar.a = 1;
                        mVar.p = org.telegram.messenger.g0.L(36.0f);
                        tj0Var.getLayoutManager().w0(mVar);
                        break;
                    }
                }
                break;
            default:
                super.onLayout(z10, i3, i10, i11, i12);
                xg.e1 e1Var = (xg.e1) this.N;
                e1Var.j2 = org.telegram.messenger.g0.L(64.0f) + getMeasuredHeight();
                e1Var.i2.G();
                boolean z13 = this.M;
                boolean z14 = e1Var.d;
                if (z13 != z14) {
                    this.M = z14;
                    if (z14) {
                        org.telegram.ui.Components.tj0 tj0Var2 = e1Var.l1;
                        ni.m mVar2 = new ni.m(e1Var.getContext(), 2, 0.6f);
                        mVar2.a = 1;
                        mVar2.p = org.telegram.messenger.g0.L(36.0f);
                        tj0Var2.getLayoutManager().w0(mVar2);
                        break;
                    }
                }
                break;
        }
    }
}
