package org.telegram.ui;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class my extends org.telegram.ui.Components.v51 {
    public final /* synthetic */ int m3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ my(Context context, int i10, int i11, boolean z10, org.telegram.messenger.k20 k20Var, org.telegram.messenger.p20 p20Var, org.telegram.messenger.q20 q20Var, org.telegram.ui.ActionBar.p6 p6Var, int i12) {
        super(context, i10, i11, z10, k20Var, p20Var, q20Var, p6Var);
        this.m3 = i12;
    }

    @Override // org.telegram.ui.Components.uk0
    public Integer V0(int i10) {
        switch (this.m3) {
            case 0:
                org.telegram.ui.Components.b51 G = this.f3.G(i10);
                if (G == null || G.d != 2) {
                    return super.V0(i10);
                }
                return 0;
            case 1:
            default:
                return super.V0(i10);
            case 2:
                return 0;
        }
    }

    @Override // org.telegram.ui.Components.uk0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public void onMeasure(int i10, int i11) {
        switch (this.m3) {
            case 3:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(Math.min((int) (org.telegram.messenger.i0.q.y * 0.35f), View.MeasureSpec.getSize(i11)), View.MeasureSpec.getMode(i11)));
                break;
            case 4:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(Math.min((int) (org.telegram.messenger.i0.q.y * 0.35f), View.MeasureSpec.getSize(i11)), View.MeasureSpec.getMode(i11)));
                break;
            case 5:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(Math.min((int) (org.telegram.messenger.i0.q.y * 0.35f), View.MeasureSpec.getSize(i11)), View.MeasureSpec.getMode(i11)));
                break;
            case 6:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(Math.min((int) (org.telegram.messenger.i0.q.y * 0.35f), View.MeasureSpec.getSize(i11)), View.MeasureSpec.getMode(i11)));
                break;
            case 7:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(Math.min((int) (org.telegram.messenger.i0.q.y * 0.35f), View.MeasureSpec.getSize(i11)), View.MeasureSpec.getMode(i11)));
                break;
            case 8:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(Math.min((int) (org.telegram.messenger.i0.q.y * 0.35f), View.MeasureSpec.getSize(i11)), View.MeasureSpec.getMode(i11)));
                break;
            default:
                super.onMeasure(i10, i11);
                break;
        }
    }

    @Override // org.telegram.ui.Components.uk0
    public boolean u1(View view) {
        switch (this.m3) {
            case 1:
                if (view instanceof org.telegram.ui.Wallet.w3) {
                    org.telegram.ui.Wallet.w3 w3Var = (org.telegram.ui.Wallet.w3) view;
                    if (w3Var.F > 0.0f || w3Var.I.d()) {
                        return false;
                    }
                }
                return true;
            default:
                return super.u1(view);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ my(Context context, int i10, int i11, boolean z10, org.telegram.messenger.k20 k20Var, org.telegram.messenger.p20 p20Var, org.telegram.messenger.q20 q20Var, org.telegram.ui.ActionBar.p6 p6Var, int i12, int i13) {
        super(context, i10, i11, z10, k20Var, p20Var, q20Var, p6Var, i12, i13);
        this.m3 = 1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ my(org.telegram.ui.ActionBar.k2 k2Var, org.telegram.messenger.k20 k20Var, org.telegram.messenger.p20 p20Var, org.telegram.messenger.q20 q20Var, int i10) {
        super(k2Var, k20Var, p20Var, q20Var);
        this.m3 = i10;
    }
}
