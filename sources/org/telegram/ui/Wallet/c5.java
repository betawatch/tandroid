package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.ui.Components.w71;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class c5 extends z2 {
    public final /* synthetic */ ViewGroup T1;
    public final /* synthetic */ View[] U1;
    public final /* synthetic */ Context V1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c5(Context context, ViewGroup viewGroup, org.telegram.ui.ActionBar.p6 p6Var, ViewGroup viewGroup2, View[] viewArr, Context context2) {
        super(context, viewGroup, p6Var);
        this.T1 = viewGroup2;
        this.U1 = viewArr;
        this.V1 = context2;
    }

    @Override // org.telegram.ui.Wallet.z2, org.telegram.ui.Components.ha
    public final void T0(float f7) {
        super.T0(f7);
        if (this.T1 instanceof w71) {
            this.r0.setBounds(0, (int) f7, this.b.getWidth(), this.b.getHeight());
        }
    }

    @Override // org.telegram.ui.Components.ha
    public final boolean Z0() {
        return !(this.T1 instanceof w71);
    }

    @Override // org.telegram.ui.Wallet.z2
    public final int d1() {
        return org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.d6, this.I0);
    }

    @Override // org.telegram.ui.Wallet.z2, org.telegram.ui.ActionBar.z2, android.app.Dialog
    public final void show() {
        super.show();
        if (this.T1 instanceof w71) {
            View[] viewArr = this.U1;
            if (viewArr[0] == null) {
                b5 b5Var = new b5(this, this.V1);
                viewArr[0] = b5Var;
                this.b.addView(b5Var, 0, w7.b6.e(-1, 50, 80));
            }
            this.b.setBackground(null);
            this.b.setPadding(0, 0, 0, 0);
            this.k1.setPadding(0, 0, 0, 0);
        }
    }
}
