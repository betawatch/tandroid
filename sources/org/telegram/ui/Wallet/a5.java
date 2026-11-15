package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.ui.Components.w61;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes4.dex */
public final class a5 extends x2 {
    public final /* synthetic */ ViewGroup X1;
    public final /* synthetic */ View[] Y1;
    public final /* synthetic */ Context Z1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a5(Context context, ViewGroup viewGroup, org.telegram.ui.ActionBar.e6 e6Var, ViewGroup viewGroup2, View[] viewArr, Context context2) {
        super(context, viewGroup, e6Var);
        this.X1 = viewGroup2;
        this.Y1 = viewArr;
        this.Z1 = context2;
    }

    @Override // org.telegram.ui.Wallet.x2, org.telegram.ui.Components.ja
    public final void T0(float f10) {
        super.T0(f10);
        if (this.X1 instanceof w61) {
            this.s0.setBounds(0, (int) f10, this.b.getWidth(), this.b.getHeight());
        }
    }

    @Override // org.telegram.ui.Components.ja
    public final boolean Z0() {
        return !(this.X1 instanceof w61);
    }

    @Override // org.telegram.ui.Wallet.x2
    public final int d1() {
        return org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.d6, this.J0);
    }

    @Override // org.telegram.ui.Wallet.x2, org.telegram.ui.ActionBar.u2, android.app.Dialog
    public final void show() {
        super.show();
        if (this.X1 instanceof w61) {
            View[] viewArr = this.Y1;
            if (viewArr[0] == null) {
                jh.h hVar = new jh.h(this, this.Z1);
                viewArr[0] = hVar;
                this.b.addView(hVar, 0, c8.ja.e(-1, 50, 80));
            }
            this.b.setBackground(null);
            this.b.setPadding(0, 0, 0, 0);
            this.o1.setPadding(0, 0, 0, 0);
        }
    }
}
