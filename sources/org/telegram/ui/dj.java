package org.telegram.ui;

import android.app.Activity;
import java.util.ArrayList;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final class dj extends org.telegram.ui.Components.vv {
    public final /* synthetic */ wn W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dj(wn wnVar, org.telegram.ui.ActionBar.m2 m2Var, Activity activity, org.telegram.ui.ActionBar.d6 d6Var, ArrayList arrayList) {
        super(m2Var, activity, d6Var, arrayList);
        this.W = wnVar;
    }

    @Override // org.telegram.ui.Components.vv, org.telegram.ui.ActionBar.e3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.i2
    public final void dismiss() {
        super.dismiss();
        wn wnVar = this.W;
        wnVar.getClass();
        wnVar.g8(false, true, 0.0f);
    }
}
