package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class m60 extends org.telegram.ui.Components.voip.l {
    public final /* synthetic */ o60 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m60(o60 o60Var, Context context) {
        super(context, true);
        this.h = o60Var;
    }

    @Override // org.telegram.ui.Components.voip.l, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        o60 o60Var = this.h;
        if (!o60Var.r || getParticipant() == null) {
            return;
        }
        o60Var.E(this, true);
    }

    @Override // org.telegram.ui.Components.voip.l, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.h.E(this, false);
    }
}
