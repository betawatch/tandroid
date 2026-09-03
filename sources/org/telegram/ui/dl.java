package org.telegram.ui;

import android.app.Activity;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class dl extends org.telegram.ui.Components.z50 {
    public final /* synthetic */ xn a1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dl(xn xnVar, Activity activity, org.telegram.ui.Components.s50 s50Var, org.telegram.ui.ActionBar.g6 g6Var) {
        super(activity, s50Var, g6Var, true);
        this.a1 = xnVar;
    }

    @Override // org.telegram.ui.Components.z50
    public final void m(boolean z4, boolean z10) {
        super.m(z4, z10);
        this.a1.sc.a(z4, true);
    }
}
