package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class uk extends jg.s0 {
    public final /* synthetic */ int D = 0;
    public final /* synthetic */ org.telegram.messenger.ls E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uk(wk wkVar, Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z9) {
        super(context, f6Var, z9, false);
        this.E = wkVar;
    }

    @Override // v4.g0
    public final void f() {
        int i7 = this.D;
        org.telegram.messenger.ls lsVar = this.E;
        switch (i7) {
            case 0:
                wk wkVar = (wk) lsVar;
                uk ukVar = wkVar.N;
                org.telegram.ui.ActionBar.r0 r0Var = wkVar.x;
                if (r0Var != null) {
                    r0Var.setShowSearchProgress(ukVar.w);
                }
                TextView textView = wkVar.w;
                if (textView != null) {
                    textView.setText(org.telegram.messenger.hd.a0(null, null, 2131748164, ukVar.h));
                }
                super.f();
                break;
            default:
                org.telegram.ui.pa0 pa0Var = (org.telegram.ui.pa0) lsVar;
                org.telegram.ui.ActionBar.f5 f5Var = pa0Var.r;
                if (f5Var != null) {
                    f5Var.setShowSearchProgress(pa0Var.S.w);
                }
                TextView textView2 = pa0Var.n;
                if (textView2 != null) {
                    textView2.setText(org.telegram.messenger.hd.a0(null, null, 2131748164, pa0Var.S.h));
                }
                super.f();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uk(org.telegram.ui.pa0 pa0Var, Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z9) {
        super(context, f6Var, false, z9);
        this.E = pa0Var;
    }
}
