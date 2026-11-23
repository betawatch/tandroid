package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.ui.Components.j71;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes4.dex */
public final class p5 extends e3 {
    public final /* synthetic */ ViewGroup X1;
    public final /* synthetic */ View[] Y1;
    public final /* synthetic */ Context Z1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p5(Context context, ViewGroup viewGroup, org.telegram.ui.ActionBar.h6 h6Var, ViewGroup viewGroup2, View[] viewArr, Context context2) {
        super(context, viewGroup, h6Var);
        this.X1 = viewGroup2;
        this.Y1 = viewArr;
        this.Z1 = context2;
    }

    @Override // org.telegram.ui.Wallet.e3, org.telegram.ui.Components.sa
    public final void U0(float f10) {
        super.U0(f10);
        if (this.X1 instanceof j71) {
            this.s0.setBounds(0, (int) f10, this.b.getWidth(), this.b.getHeight());
        }
    }

    @Override // org.telegram.ui.Components.sa
    public final boolean a1() {
        return !(this.X1 instanceof j71);
    }

    @Override // org.telegram.ui.Wallet.e3
    public final int e1() {
        return org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.d6, this.J0);
    }

    @Override // org.telegram.ui.Wallet.e3, org.telegram.ui.ActionBar.w2, android.app.Dialog
    public final void show() {
        super.show();
        if (this.X1 instanceof j71) {
            View[] viewArr = this.Y1;
            if (viewArr[0] == null) {
                jh.h hVar = new jh.h(this, this.Z1);
                viewArr[0] = hVar;
                this.b.addView(hVar, 0, c8.ma.e(-1, 50, 80));
            }
            this.b.setBackground(null);
            this.b.setPadding(0, 0, 0, 0);
            this.o1.setPadding(0, 0, 0, 0);
        }
    }
}
