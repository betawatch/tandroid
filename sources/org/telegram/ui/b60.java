package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class b60 extends org.telegram.ui.Components.voip.l {
    public final /* synthetic */ d60 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b60(d60 d60Var, Context context) {
        super(context, true);
        this.h = d60Var;
    }

    @Override // org.telegram.ui.Components.voip.l, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        d60 d60Var = this.h;
        if (!d60Var.r || getParticipant() == null) {
            return;
        }
        d60Var.E(this, true);
    }

    @Override // org.telegram.ui.Components.voip.l, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.h.E(this, false);
    }
}
