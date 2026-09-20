package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class ot0 extends dv0 {
    public final /* synthetic */ jv0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ot0(jv0 jv0Var, Context context) {
        super(jv0Var, context);
        this.h = jv0Var;
    }

    @Override // s4.h0
    public final void l() {
        super.l();
        jv0 jv0Var = this.h;
        cu0 W = jv0Var.W(0);
        if (W == null || W.r.getVisibility() != 0) {
            return;
        }
        jv0Var.I.l();
    }
}
