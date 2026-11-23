package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class mf extends org.telegram.ui.dg0 {
    public final /* synthetic */ ji.e E0;
    public final /* synthetic */ ChatActivityEnterView F0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mf(ChatActivityEnterView chatActivityEnterView, Context context, org.telegram.ui.ActionBar.i6 i6Var, ji.e eVar) {
        super(context, i6Var);
        this.F0 = chatActivityEnterView;
        this.E0 = eVar;
    }

    @Override // org.telegram.ui.dg0
    public final void m(long j3) {
        this.F0.setEffectId(j3);
        ji.e eVar = this.E0;
        if (eVar != null) {
            eVar.invalidate();
        }
    }
}
