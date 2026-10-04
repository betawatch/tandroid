package org.telegram.ui.ActionBar;

import android.app.Activity;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class x4 extends ActionBarLayout {
    public final /* synthetic */ p s1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x4(Activity activity, p pVar) {
        super(activity, false);
        this.s1 = pVar;
    }

    @Override // org.telegram.ui.ActionBar.ActionBarLayout, org.telegram.ui.ActionBar.c5
    public final f3 getBottomSheet() {
        return ((f3[]) this.s1.b)[0];
    }
}
