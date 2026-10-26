package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.u91;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class m4 extends j2 {
    public final /* synthetic */ ViewGroup b0;
    public final /* synthetic */ View[] c0;
    public final /* synthetic */ Context d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m4(Context context, ViewGroup viewGroup, org.telegram.ui.ActionBar.u6 u6Var, ViewGroup viewGroup2, View[] viewArr, Context context2) {
        super(context, viewGroup, u6Var);
        this.b0 = viewGroup2;
        this.c0 = viewArr;
        this.d0 = context2;
    }

    @Override // org.telegram.ui.Wallet.j2, org.telegram.ui.Components.bb
    public final void F(float f7) {
        super.F(f7);
        if (this.b0 instanceof u91) {
            this.shadowDrawable.setBounds(0, (int) f7, this.containerView.getWidth(), this.containerView.getHeight());
        }
    }

    @Override // org.telegram.ui.Components.bb
    public final boolean L() {
        return !(this.b0 instanceof u91);
    }

    @Override // org.telegram.ui.Wallet.j2
    public final int P() {
        return getThemedColor(org.telegram.ui.ActionBar.y6.d6);
    }

    @Override // org.telegram.ui.Wallet.j2, org.telegram.ui.ActionBar.k3, android.app.Dialog
    public final void show() {
        super.show();
        if (this.b0 instanceof u91) {
            View[] viewArr = this.c0;
            if (viewArr[0] == null) {
                jh.h hVar = new jh.h(this, this.d0);
                viewArr[0] = hVar;
                this.containerView.addView(hVar, 0, gb1.i(-1, 50, 80));
            }
            this.containerView.setBackground(null);
            this.containerView.setPadding(0, 0, 0, 0);
            this.d.setPadding(0, 0, 0, 0);
        }
    }
}
