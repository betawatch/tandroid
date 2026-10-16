package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class q71 extends o20 {
    public final di.g2 J;
    public final /* synthetic */ r71 K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q71(r71 r71Var, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var);
        this.K = r71Var;
        di.g2 g2Var = this.r;
        this.J = g2Var;
        g2Var.setImeOptions(268435459);
        g2Var.setHint(LocaleController.getString(R.string.VoipGroupSearchMembers));
        g2Var.addTextChangedListener(new di.h2(this, 14));
        g2Var.setOnEditorActionListener(new e1(this, 11));
    }

    @Override // org.telegram.ui.Components.o20
    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.K.F(motionEvent, this.J);
        return super.onInterceptTouchEvent(motionEvent);
    }
}
