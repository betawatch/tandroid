package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.ui.Components.o91;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class c4 extends i2 {
    public final /* synthetic */ ViewGroup b0;
    public final /* synthetic */ View[] c0;
    public final /* synthetic */ Context d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c4(Context context, ViewGroup viewGroup, org.telegram.ui.ActionBar.e6 e6Var, ViewGroup viewGroup2, View[] viewArr, Context context2) {
        super(context, viewGroup, e6Var);
        this.b0 = viewGroup2;
        this.c0 = viewArr;
        this.d0 = context2;
    }

    @Override // org.telegram.ui.Wallet.i2, org.telegram.ui.Components.eb
    public final void G(float f7) {
        super.G(f7);
        if (this.b0 instanceof o91) {
            this.shadowDrawable.setBounds(0, (int) f7, this.containerView.getWidth(), this.containerView.getHeight());
        }
    }

    @Override // org.telegram.ui.Components.eb
    public final boolean M() {
        return !(this.b0 instanceof o91);
    }

    @Override // org.telegram.ui.Wallet.i2
    public final int Q() {
        return getThemedColor(org.telegram.ui.ActionBar.i6.d6);
    }

    @Override // org.telegram.ui.Wallet.i2, org.telegram.ui.ActionBar.f3, android.app.Dialog
    public final void show() {
        super.show();
        if (this.b0 instanceof o91) {
            View[] viewArr = this.c0;
            if (viewArr[0] == null) {
                gi.a aVar = new gi.a(this, this.d0);
                viewArr[0] = aVar;
                this.containerView.addView(aVar, 0, w7.x5.e(-1, 50, 80));
            }
            this.containerView.setBackground(null);
            this.containerView.setPadding(0, 0, 0, 0);
            this.d.setPadding(0, 0, 0, 0);
        }
    }
}
