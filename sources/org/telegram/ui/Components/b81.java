package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class b81 extends m20 {
    public final fi.c2 J;
    public final /* synthetic */ c81 K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b81(c81 c81Var, Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, u6Var);
        this.K = c81Var;
        fi.c2 c2Var = this.r;
        this.J = c2Var;
        c2Var.setImeOptions(268435459);
        c2Var.setHint(LocaleController.getString(R.string.VoipGroupSearchMembers));
        c2Var.addTextChangedListener(new bi.u(this, 15));
        c2Var.setOnEditorActionListener(new d1(this, 11));
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.K.D(motionEvent, this.J);
        return super.onInterceptTouchEvent(motionEvent);
    }
}
