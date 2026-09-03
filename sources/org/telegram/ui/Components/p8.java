package org.telegram.ui.Components;

import android.app.Activity;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class p8 extends v8 {
    public final /* synthetic */ o8 D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p8(w8 w8Var, Activity activity, o8 o8Var) {
        super(w8Var, activity);
        this.D = o8Var;
    }

    @Override // org.telegram.ui.Components.v8, android.view.View
    public final void invalidate() {
        super.invalidate();
        this.D.invalidate();
    }
}
