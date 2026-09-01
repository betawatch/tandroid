package org.telegram.ui.ActionBar;

import android.app.Activity;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class a5 extends ActionBarLayout {
    public final /* synthetic */ n p1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a5(Activity activity, n nVar) {
        super(activity, false);
        this.p1 = nVar;
    }

    @Override // org.telegram.ui.ActionBar.ActionBarLayout, org.telegram.ui.ActionBar.f5
    public final h3 getBottomSheet() {
        return ((h3[]) this.p1.b)[0];
    }
}
