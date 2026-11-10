package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class t7 extends mm0 {
    public final /* synthetic */ a8 m0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t7(a8 a8Var, Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, h6Var, false);
        this.m0 = a8Var;
    }

    @Override // org.telegram.ui.Components.mm0
    public final boolean d(MotionEvent motionEvent) {
        if (this.m0.A2 != 0) {
            return false;
        }
        return super.d(motionEvent);
    }
}
