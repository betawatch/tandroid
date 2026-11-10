package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class tk extends jg.s0 {
    public final /* synthetic */ int D = 0;
    public final /* synthetic */ org.telegram.messenger.ls E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tk(vk vkVar, Context context, org.telegram.ui.ActionBar.h6 h6Var, boolean z9) {
        super(context, h6Var, z9, false);
        this.E = vkVar;
    }

    @Override // v4.g0
    public final void f() {
        int i7 = this.D;
        org.telegram.messenger.ls lsVar = this.E;
        switch (i7) {
            case 0:
                vk vkVar = (vk) lsVar;
                tk tkVar = vkVar.N;
                org.telegram.ui.ActionBar.r0 r0Var = vkVar.x;
                if (r0Var != null) {
                    r0Var.setShowSearchProgress(tkVar.w);
                }
                TextView textView = vkVar.w;
                if (textView != null) {
                    textView.setText(org.telegram.messenger.id.a0(null, null, 2131748165, tkVar.h));
                }
                super.f();
                break;
            default:
                org.telegram.ui.sa0 sa0Var = (org.telegram.ui.sa0) lsVar;
                org.telegram.ui.ActionBar.g5 g5Var = sa0Var.r;
                if (g5Var != null) {
                    g5Var.setShowSearchProgress(sa0Var.S.w);
                }
                TextView textView2 = sa0Var.n;
                if (textView2 != null) {
                    textView2.setText(org.telegram.messenger.id.a0(null, null, 2131748165, sa0Var.S.h));
                }
                super.f();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tk(org.telegram.ui.sa0 sa0Var, Context context, org.telegram.ui.ActionBar.h6 h6Var, boolean z9) {
        super(context, h6Var, false, z9);
        this.E = sa0Var;
    }
}
