package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class lk extends org.telegram.ui.Components.to {
    public final /* synthetic */ bo f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lk(bo boVar, Context context) {
        super(context);
        this.f = boVar;
    }

    @Override // org.telegram.ui.Components.to
    public final void a(boolean z10) {
        bo boVar = this.f;
        boVar.t7();
        boVar.r7();
        boVar.u7();
        boVar.v7();
        dl dlVar = boVar.ab;
        if (dlVar != null) {
            dlVar.setTranslationY(boVar.w9 + getCurrentHeight());
        }
        if (!z10) {
            boVar.o9();
        } else {
            boVar.D9 = true;
            boVar.jc();
        }
    }
}
