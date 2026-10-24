package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.ui.Components.l91;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final class o4 extends j2 {
    public final /* synthetic */ ViewGroup b0;
    public final /* synthetic */ View[] c0;
    public final /* synthetic */ Context d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o4(Context context, ViewGroup viewGroup, org.telegram.ui.ActionBar.g6 g6Var, ViewGroup viewGroup2, View[] viewArr, Context context2) {
        super(context, viewGroup, g6Var);
        this.b0 = viewGroup2;
        this.c0 = viewArr;
        this.d0 = context2;
    }

    @Override // org.telegram.ui.Wallet.j2, org.telegram.ui.Components.bb
    public final void E(float f7) {
        super.E(f7);
        if (this.b0 instanceof l91) {
            this.shadowDrawable.setBounds(0, (int) f7, this.containerView.getWidth(), this.containerView.getHeight());
        }
    }

    @Override // org.telegram.ui.Components.bb
    public final boolean L() {
        return !(this.b0 instanceof l91);
    }

    @Override // org.telegram.ui.Wallet.j2
    public final int P() {
        return getThemedColor(org.telegram.ui.ActionBar.k6.d6);
    }

    @Override // org.telegram.ui.Wallet.j2, org.telegram.ui.ActionBar.h3, android.app.Dialog
    public final void show() {
        super.show();
        if (this.b0 instanceof l91) {
            View[] viewArr = this.c0;
            if (viewArr[0] == null) {
                ih.h hVar = new ih.h(this, this.d0);
                viewArr[0] = hVar;
                this.containerView.addView(hVar, 0, w7.z5.e(-1, 50, 80));
            }
            this.containerView.setBackground(null);
            this.containerView.setPadding(0, 0, 0, 0);
            this.d.setPadding(0, 0, 0, 0);
        }
    }
}
