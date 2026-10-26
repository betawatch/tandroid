package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class a81 extends m20 {
    public final fi.c2 J;
    public final /* synthetic */ b81 K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a81(b81 b81Var, Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, u6Var);
        this.K = b81Var;
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
