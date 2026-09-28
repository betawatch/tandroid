package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final class fv extends uv {
    public final /* synthetic */ uv W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fv(uv uvVar, org.telegram.ui.ActionBar.m2 m2Var, Context context, org.telegram.ui.ActionBar.d6 d6Var, ArrayList arrayList) {
        super(m2Var, context, d6Var, arrayList);
        this.W = uvVar;
    }

    @Override // org.telegram.ui.Components.uv
    public final void Y() {
        this.W.dismiss();
    }
}
