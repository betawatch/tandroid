package org.telegram.ui.ActionBar;

import android.app.Activity;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class a5 extends ActionBarLayout {
    public final /* synthetic */ o s1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a5(Activity activity, o oVar) {
        super(activity, false);
        this.s1 = oVar;
    }

    @Override // org.telegram.ui.ActionBar.ActionBarLayout, org.telegram.ui.ActionBar.f5
    public final h3 getBottomSheet() {
        return ((h3[]) this.s1.b)[0];
    }
}
