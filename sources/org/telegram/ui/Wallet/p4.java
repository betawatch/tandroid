package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.ui.Components.e91;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes4.dex */
public final class p4 extends k2 {
    public final /* synthetic */ ViewGroup b0;
    public final /* synthetic */ View[] c0;
    public final /* synthetic */ Context d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p4(Context context, ViewGroup viewGroup, org.telegram.ui.ActionBar.d6 d6Var, ViewGroup viewGroup2, View[] viewArr, Context context2) {
        super(context, viewGroup, d6Var);
        this.b0 = viewGroup2;
        this.c0 = viewArr;
        this.d0 = context2;
    }

    @Override // org.telegram.ui.Wallet.k2, org.telegram.ui.Components.bb
    public final void F(float f7) {
        super.F(f7);
        if (this.b0 instanceof e91) {
            this.shadowDrawable.setBounds(0, (int) f7, this.containerView.getWidth(), this.containerView.getHeight());
        }
    }

    @Override // org.telegram.ui.Components.bb
    public final boolean M() {
        return !(this.b0 instanceof e91);
    }

    @Override // org.telegram.ui.Wallet.k2
    public final int Q() {
        return getThemedColor(org.telegram.ui.ActionBar.h6.d6);
    }

    @Override // org.telegram.ui.Wallet.k2, org.telegram.ui.ActionBar.f3, android.app.Dialog
    public final void show() {
        super.show();
        if (this.b0 instanceof e91) {
            View[] viewArr = this.c0;
            if (viewArr[0] == null) {
                ai.i7 i7Var = new ai.i7(this, this.d0);
                viewArr[0] = i7Var;
                this.containerView.addView(i7Var, 0, w7.z5.e(-1, 50, 80));
            }
            this.containerView.setBackground(null);
            this.containerView.setPadding(0, 0, 0, 0);
            this.d.setPadding(0, 0, 0, 0);
        }
    }
}
