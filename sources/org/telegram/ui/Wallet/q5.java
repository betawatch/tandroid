package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.ui.Components.k71;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class q5 extends f3 {
    public final /* synthetic */ ViewGroup X1;
    public final /* synthetic */ View[] Y1;
    public final /* synthetic */ Context Z1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q5(Context context, ViewGroup viewGroup, org.telegram.ui.ActionBar.i6 i6Var, ViewGroup viewGroup2, View[] viewArr, Context context2) {
        super(context, viewGroup, i6Var);
        this.X1 = viewGroup2;
        this.Y1 = viewArr;
        this.Z1 = context2;
    }

    @Override // org.telegram.ui.Wallet.f3, org.telegram.ui.Components.ra
    public final void U0(float f10) {
        super.U0(f10);
        if (this.X1 instanceof k71) {
            this.s0.setBounds(0, (int) f10, this.b.getWidth(), this.b.getHeight());
        }
    }

    @Override // org.telegram.ui.Components.ra
    public final boolean a1() {
        return !(this.X1 instanceof k71);
    }

    @Override // org.telegram.ui.Wallet.f3
    public final int e1() {
        return org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.d6, this.J0);
    }

    @Override // org.telegram.ui.Wallet.f3, org.telegram.ui.ActionBar.w2, android.app.Dialog
    public final void show() {
        super.show();
        if (this.X1 instanceof k71) {
            View[] viewArr = this.Y1;
            if (viewArr[0] == null) {
                jh.h hVar = new jh.h(this, this.Z1);
                viewArr[0] = hVar;
                this.b.addView(hVar, 0, c8.na.e(-1, 50, 80));
            }
            this.b.setBackground(null);
            this.b.setPadding(0, 0, 0, 0);
            this.o1.setPadding(0, 0, 0, 0);
        }
    }
}
