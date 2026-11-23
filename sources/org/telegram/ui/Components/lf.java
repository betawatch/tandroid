package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class lf extends org.telegram.ui.eg0 {
    public final /* synthetic */ ji.e E0;
    public final /* synthetic */ ChatActivityEnterView F0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lf(ChatActivityEnterView chatActivityEnterView, Context context, org.telegram.ui.ActionBar.h6 h6Var, ji.e eVar) {
        super(context, h6Var);
        this.F0 = chatActivityEnterView;
        this.E0 = eVar;
    }

    @Override // org.telegram.ui.eg0
    public final void m(long j3) {
        this.F0.setEffectId(j3);
        ji.e eVar = this.E0;
        if (eVar != null) {
            eVar.invalidate();
        }
    }
}
