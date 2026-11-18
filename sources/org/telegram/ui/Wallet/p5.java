package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.ui.Components.g71;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final class p5 extends e3 {
    public final /* synthetic */ ViewGroup X1;
    public final /* synthetic */ View[] Y1;
    public final /* synthetic */ Context Z1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p5(Context context, ViewGroup viewGroup, org.telegram.ui.ActionBar.i6 i6Var, ViewGroup viewGroup2, View[] viewArr, Context context2) {
        super(context, viewGroup, i6Var);
        this.X1 = viewGroup2;
        this.Y1 = viewArr;
        this.Z1 = context2;
    }

    @Override // org.telegram.ui.Wallet.e3, org.telegram.ui.Components.sa
    public final void U0(float f10) {
        super.U0(f10);
        if (this.X1 instanceof g71) {
            this.s0.setBounds(0, (int) f10, this.b.getWidth(), this.b.getHeight());
        }
    }

    @Override // org.telegram.ui.Components.sa
    public final boolean a1() {
        return !(this.X1 instanceof g71);
    }

    @Override // org.telegram.ui.Wallet.e3
    public final int e1() {
        return org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.d6, this.J0);
    }

    @Override // org.telegram.ui.Wallet.e3, org.telegram.ui.ActionBar.x2, android.app.Dialog
    public final void show() {
        super.show();
        if (this.X1 instanceof g71) {
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
