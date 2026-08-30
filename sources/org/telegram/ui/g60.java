package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class g60 extends org.telegram.ui.Components.voip.l {
    public final /* synthetic */ i60 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g60(i60 i60Var, Context context) {
        super(context, true);
        this.h = i60Var;
    }

    @Override // org.telegram.ui.Components.voip.l, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        i60 i60Var = this.h;
        if (!i60Var.r || getParticipant() == null) {
            return;
        }
        i60Var.E(this, true);
    }

    @Override // org.telegram.ui.Components.voip.l, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.h.E(this, false);
    }
}
