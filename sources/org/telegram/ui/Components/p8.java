package org.telegram.ui.Components;

import android.app.Activity;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class p8 extends v8 {
    public final /* synthetic */ o8 C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p8(w8 w8Var, Activity activity, o8 o8Var) {
        super(w8Var, activity);
        this.C = o8Var;
    }

    @Override // org.telegram.ui.Components.v8, android.view.View
    public final void invalidate() {
        super.invalidate();
        this.C.invalidate();
    }
}
