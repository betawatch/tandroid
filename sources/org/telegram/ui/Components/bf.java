package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class bf extends org.telegram.ui.bg0 {
    public final /* synthetic */ ji.e E0;
    public final /* synthetic */ ChatActivityEnterView F0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bf(ChatActivityEnterView chatActivityEnterView, Context context, org.telegram.ui.ActionBar.e6 e6Var, ji.e eVar) {
        super(context, e6Var);
        this.F0 = chatActivityEnterView;
        this.E0 = eVar;
    }

    @Override // org.telegram.ui.bg0
    public final void m(long j3) {
        this.F0.setEffectId(j3);
        ji.e eVar = this.E0;
        if (eVar != null) {
            eVar.invalidate();
        }
    }
}
