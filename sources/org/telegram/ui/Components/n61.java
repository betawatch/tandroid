package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class n61 extends b20 {
    public final di.h2 J;
    public final /* synthetic */ o61 K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n61(o61 o61Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var);
        this.K = o61Var;
        di.h2 h2Var = this.r;
        this.J = h2Var;
        h2Var.setImeOptions(268435459);
        h2Var.setHint(LocaleController.getString(R.string.VoipGroupSearchMembers));
        h2Var.addTextChangedListener(new di.i2(this, 14));
        h2Var.setOnEditorActionListener(new f1(this, 10));
    }

    @Override // org.telegram.ui.Components.b20
    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.K.D(motionEvent, this.J);
        return super.onInterceptTouchEvent(motionEvent);
    }
}
