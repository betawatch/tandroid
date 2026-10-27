package org.telegram.ui.ActionBar;

import android.app.Activity;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class d5 extends ActionBarLayout {
    public final /* synthetic */ p y1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d5(Activity activity, p pVar) {
        super(activity, false);
        this.y1 = pVar;
    }

    @Override // org.telegram.ui.ActionBar.ActionBarLayout, org.telegram.ui.ActionBar.j5
    public final k3 getBottomSheet() {
        return ((k3[]) this.y1.b)[0];
    }
}
