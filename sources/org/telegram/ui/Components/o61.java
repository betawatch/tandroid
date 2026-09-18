package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class o61 extends b20 {
    public final ci.h2 J;
    public final /* synthetic */ p61 K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o61(p61 p61Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var);
        this.K = p61Var;
        ci.h2 h2Var = this.r;
        this.J = h2Var;
        h2Var.setImeOptions(268435459);
        h2Var.setHint(LocaleController.getString(R.string.VoipGroupSearchMembers));
        h2Var.addTextChangedListener(new ci.i2(this, 14));
        h2Var.setOnEditorActionListener(new e1(this, 10));
    }

    @Override // org.telegram.ui.Components.b20
    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.K.E(motionEvent, this.J);
        return super.onInterceptTouchEvent(motionEvent);
    }
}
