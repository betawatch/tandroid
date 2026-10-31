package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class vk extends zf.i0 {
    public final /* synthetic */ int N = 0;
    public final /* synthetic */ org.telegram.messenger.us O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vk(bl blVar, Context context, org.telegram.ui.ActionBar.p6 p6Var, boolean z10) {
        super(context, p6Var, z10, false);
        this.O = blVar;
    }

    @Override // s4.g0
    public final void f() {
        int i10 = this.N;
        org.telegram.messenger.us usVar = this.O;
        switch (i10) {
            case 0:
                bl blVar = (bl) usVar;
                vk vkVar = blVar.P;
                org.telegram.ui.ActionBar.t0 t0Var = blVar.y;
                if (t0Var != null) {
                    t0Var.setShowSearchProgress(vkVar.J);
                }
                TextView textView = blVar.x;
                if (textView != null) {
                    org.telegram.messenger.m5.q("NoPlacesFoundInfo", null, 2131748195, new Object[]{vkVar.y}, textView);
                }
                super.f();
                break;
            default:
                org.telegram.ui.yb0 yb0Var = (org.telegram.ui.yb0) usVar;
                org.telegram.ui.ActionBar.p5 p5Var = yb0Var.s;
                if (p5Var != null) {
                    p5Var.setShowSearchProgress(yb0Var.U.J);
                }
                TextView textView2 = yb0Var.r;
                if (textView2 != null) {
                    org.telegram.messenger.m5.q("NoPlacesFoundInfo", null, 2131748195, new Object[]{yb0Var.U.y}, textView2);
                }
                super.f();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vk(org.telegram.ui.yb0 yb0Var, Context context, org.telegram.ui.ActionBar.p6 p6Var, boolean z10) {
        super(context, p6Var, false, z10);
        this.O = yb0Var;
    }
}
