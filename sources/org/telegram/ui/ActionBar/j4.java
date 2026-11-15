package org.telegram.ui.ActionBar;

import android.app.Activity;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class j4 extends ActionBarLayout {
    public final /* synthetic */ z z1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j4(Activity activity, z zVar) {
        super(activity, false);
        this.z1 = zVar;
    }

    @Override // org.telegram.ui.ActionBar.ActionBarLayout, org.telegram.ui.ActionBar.o4
    public final u2 getBottomSheet() {
        return ((u2[]) this.z1.b)[0];
    }
}
