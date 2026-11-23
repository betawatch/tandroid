package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class ou extends bv {
    public final /* synthetic */ bv R1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ou(bv bvVar, org.telegram.ui.ActionBar.g2 g2Var, Context context, org.telegram.ui.ActionBar.i6 i6Var, ArrayList arrayList) {
        super(g2Var, context, i6Var, arrayList);
        this.R1 = bvVar;
    }

    @Override // org.telegram.ui.Components.bv
    public final void M0() {
        this.R1.dismiss();
    }
}
