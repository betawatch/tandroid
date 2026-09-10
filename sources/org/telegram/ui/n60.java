package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class n60 extends org.telegram.ui.Components.voip.l {
    public final /* synthetic */ p60 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n60(p60 p60Var, Context context) {
        super(context, true);
        this.h = p60Var;
    }

    @Override // org.telegram.ui.Components.voip.l, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        p60 p60Var = this.h;
        if (!p60Var.r || getParticipant() == null) {
            return;
        }
        p60Var.E(this, true);
    }

    @Override // org.telegram.ui.Components.voip.l, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.h.E(this, false);
    }
}
