package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.ui.Components.v61;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes4.dex */
public final class a5 extends a3 {
    public final /* synthetic */ ViewGroup T1;
    public final /* synthetic */ View[] U1;
    public final /* synthetic */ Context V1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a5(Context context, ViewGroup viewGroup, org.telegram.ui.ActionBar.f6 f6Var, ViewGroup viewGroup2, View[] viewArr, Context context2) {
        super(context, viewGroup, f6Var);
        this.T1 = viewGroup2;
        this.U1 = viewArr;
        this.V1 = context2;
    }

    @Override // org.telegram.ui.Wallet.a3, org.telegram.ui.Components.na
    public final void T0(float f10) {
        super.T0(f10);
        if (this.T1 instanceof v61) {
            this.r0.setBounds(0, (int) f10, this.b.getWidth(), this.b.getHeight());
        }
    }

    @Override // org.telegram.ui.Components.na
    public final boolean Z0() {
        return !(this.T1 instanceof v61);
    }

    @Override // org.telegram.ui.Wallet.a3
    public final int d1() {
        return org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.d6, this.I0);
    }

    @Override // org.telegram.ui.Wallet.a3, org.telegram.ui.ActionBar.v2, android.app.Dialog
    public final void show() {
        super.show();
        if (this.T1 instanceof v61) {
            View[] viewArr = this.U1;
            if (viewArr[0] == null) {
                jh.h hVar = new jh.h(this, this.V1);
                viewArr[0] = hVar;
                this.b.addView(hVar, 0, c8.ha.e(-1, 50, 80));
            }
            this.b.setBackground(null);
            this.b.setPadding(0, 0, 0, 0);
            this.k1.setPadding(0, 0, 0, 0);
        }
    }
}
