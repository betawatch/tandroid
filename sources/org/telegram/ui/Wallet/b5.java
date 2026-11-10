package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.ui.Components.v61;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes4.dex */
public final class b5 extends y2 {
    public final /* synthetic */ ViewGroup W1;
    public final /* synthetic */ View[] X1;
    public final /* synthetic */ Context Y1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b5(Context context, ViewGroup viewGroup, org.telegram.ui.ActionBar.h6 h6Var, ViewGroup viewGroup2, View[] viewArr, Context context2) {
        super(context, viewGroup, h6Var);
        this.W1 = viewGroup2;
        this.X1 = viewArr;
        this.Y1 = context2;
    }

    @Override // org.telegram.ui.Wallet.y2, org.telegram.ui.Components.ma
    public final void T0(float f10) {
        super.T0(f10);
        if (this.W1 instanceof v61) {
            this.r0.setBounds(0, (int) f10, this.b.getWidth(), this.b.getHeight());
        }
    }

    @Override // org.telegram.ui.Components.ma
    public final boolean Z0() {
        return !(this.W1 instanceof v61);
    }

    @Override // org.telegram.ui.Wallet.y2
    public final int d1() {
        return org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.d6, this.I0);
    }

    @Override // org.telegram.ui.Wallet.y2, org.telegram.ui.ActionBar.w2, android.app.Dialog
    public final void show() {
        super.show();
        if (this.W1 instanceof v61) {
            View[] viewArr = this.X1;
            if (viewArr[0] == null) {
                jh.h hVar = new jh.h(this, this.Y1);
                viewArr[0] = hVar;
                this.b.addView(hVar, 0, c8.ha.e(-1, 50, 80));
            }
            this.b.setBackground(null);
            this.b.setPadding(0, 0, 0, 0);
            this.n1.setPadding(0, 0, 0, 0);
        }
    }
}
