package org.telegram.ui.ActionBar;

import android.app.Activity;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class m4 extends ActionBarLayout {
    public final /* synthetic */ org.telegram.tgnet.g z1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m4(Activity activity, org.telegram.tgnet.g gVar) {
        super(activity, false);
        this.z1 = gVar;
    }

    @Override // org.telegram.ui.ActionBar.ActionBarLayout, org.telegram.ui.ActionBar.r4
    public final w2 getBottomSheet() {
        return ((w2[]) this.z1.b)[0];
    }
}
