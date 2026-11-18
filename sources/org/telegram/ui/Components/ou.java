package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class ou extends bv {
    public final /* synthetic */ bv R1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ou(bv bvVar, org.telegram.ui.ActionBar.h2 h2Var, Context context, org.telegram.ui.ActionBar.i6 i6Var, ArrayList arrayList) {
        super(h2Var, context, i6Var, arrayList);
        this.R1 = bvVar;
    }

    @Override // org.telegram.ui.Components.bv
    public final void M0() {
        this.R1.dismiss();
    }
}
