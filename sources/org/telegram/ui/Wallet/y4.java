package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import b8.mf;
import org.telegram.ui.Components.n61;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class y4 extends y2 {
    public final /* synthetic */ ViewGroup U1;
    public final /* synthetic */ View[] V1;
    public final /* synthetic */ Context W1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y4(Context context, ViewGroup viewGroup, org.telegram.ui.ActionBar.e6 e6Var, ViewGroup viewGroup2, View[] viewArr, Context context2) {
        super(context, viewGroup, e6Var);
        this.U1 = viewGroup2;
        this.V1 = viewArr;
        this.W1 = context2;
    }

    @Override // org.telegram.ui.Wallet.y2, org.telegram.ui.Components.ma
    public final void T0(float f10) {
        super.T0(f10);
        if (this.U1 instanceof n61) {
            this.s0.setBounds(0, (int) f10, this.b.getWidth(), this.b.getHeight());
        }
    }

    @Override // org.telegram.ui.Components.ma
    public final boolean Z0() {
        return !(this.U1 instanceof n61);
    }

    @Override // org.telegram.ui.Wallet.y2
    public final int d1() {
        return org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.d6, this.J0);
    }

    @Override // org.telegram.ui.Wallet.y2, org.telegram.ui.ActionBar.t2, android.app.Dialog
    public final void show() {
        super.show();
        if (this.U1 instanceof n61) {
            View[] viewArr = this.V1;
            if (viewArr[0] == null) {
                kh.h hVar = new kh.h(this, this.W1);
                viewArr[0] = hVar;
                this.b.addView(hVar, 0, mf.e(-1, 50, 80));
            }
            this.b.setBackground(null);
            this.b.setPadding(0, 0, 0, 0);
            this.l1.setPadding(0, 0, 0, 0);
        }
    }
}
