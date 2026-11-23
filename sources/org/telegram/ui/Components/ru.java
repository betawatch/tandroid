package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class ru extends ev {
    public final /* synthetic */ ev R1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ru(ev evVar, org.telegram.ui.ActionBar.g2 g2Var, Context context, org.telegram.ui.ActionBar.h6 h6Var, ArrayList arrayList) {
        super(g2Var, context, h6Var, arrayList);
        this.R1 = evVar;
    }

    @Override // org.telegram.ui.Components.ev
    public final void M0() {
        this.R1.dismiss();
    }
}
