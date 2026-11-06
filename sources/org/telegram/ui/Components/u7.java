package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class u7 extends mm0 {
    public final /* synthetic */ b8 m0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u7(b8 b8Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var, false);
        this.m0 = b8Var;
    }

    @Override // org.telegram.ui.Components.mm0
    public final boolean d(MotionEvent motionEvent) {
        if (this.m0.x2 != 0) {
            return false;
        }
        return super.d(motionEvent);
    }
}
