package org.telegram.ui.ActionBar;

import android.app.Activity;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class n4 extends ActionBarLayout {
    public final /* synthetic */ p z1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n4(Activity activity, p pVar) {
        super(activity, false);
        this.z1 = pVar;
    }

    @Override // org.telegram.ui.ActionBar.ActionBarLayout, org.telegram.ui.ActionBar.s4
    public final x2 getBottomSheet() {
        return ((x2[]) this.z1.b)[0];
    }
}
