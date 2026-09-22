package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class kk extends org.telegram.ui.Components.to {
    public final /* synthetic */ bo f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kk(bo boVar, Context context) {
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
