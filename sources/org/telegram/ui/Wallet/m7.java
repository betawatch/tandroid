package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class m7 extends vg.e {
    public final /* synthetic */ n7 M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m7(n7 n7Var, Context context) {
        super(context);
        this.M = n7Var;
    }

    @Override // vg.e, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return !this.M.y && super.onTouchEvent(motionEvent);
    }
}
