package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class r71 extends k20 {
    public final ei.e2 J;
    public final /* synthetic */ s71 K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r71(s71 s71Var, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, g6Var);
        this.K = s71Var;
        ei.e2 e2Var = this.r;
        this.J = e2Var;
        e2Var.setImeOptions(268435459);
        e2Var.setHint(LocaleController.getString(R.string.VoipGroupSearchMembers));
        e2Var.addTextChangedListener(new ai.u(this, 15));
        e2Var.setOnEditorActionListener(new d1(this, 11));
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.K.D(motionEvent, this.J);
        return super.onInterceptTouchEvent(motionEvent);
    }
}
