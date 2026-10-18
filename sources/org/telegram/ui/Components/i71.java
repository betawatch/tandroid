package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class i71 extends k20 {
    public final ei.e2 J;
    public final /* synthetic */ j71 K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i71(j71 j71Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, d6Var);
        this.K = j71Var;
        ei.e2 e2Var = this.r;
        this.J = e2Var;
        e2Var.setImeOptions(268435459);
        e2Var.setHint(LocaleController.getString(R.string.VoipGroupSearchMembers));
        e2Var.addTextChangedListener(new ai.u(this, 15));
        e2Var.setOnEditorActionListener(new e1(this, 11));
    }

    @Override // org.telegram.ui.Components.k20
    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.K.F(motionEvent, this.J);
        return super.onInterceptTouchEvent(motionEvent);
    }
}
