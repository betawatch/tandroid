package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class x7 extends an0 {
    public final /* synthetic */ e8 n0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x7(e8 e8Var, Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, i6Var, false);
        this.n0 = e8Var;
    }

    @Override // org.telegram.ui.Components.an0
    public final boolean d(MotionEvent motionEvent) {
        if (this.n0.B2 != 0) {
            return false;
        }
        return super.d(motionEvent);
    }
}
