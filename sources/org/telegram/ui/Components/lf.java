package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class lf extends org.telegram.ui.eg0 {
    public final /* synthetic */ ji.e E0;
    public final /* synthetic */ ChatActivityEnterView F0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lf(ChatActivityEnterView chatActivityEnterView, Context context, org.telegram.ui.ActionBar.i6 i6Var, ji.e eVar) {
        super(context, i6Var);
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
