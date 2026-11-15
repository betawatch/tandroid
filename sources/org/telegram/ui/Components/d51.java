package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class d51 extends v00 {
    public final ah.i K;
    public final /* synthetic */ e51 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d51(e51 e51Var, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var);
        this.L = e51Var;
        ah.i iVar = this.r;
        this.K = iVar;
        iVar.setImeOptions(268435459);
        iVar.setHint(org.telegram.messenger.hd.M0(2131743339, null));
        iVar.addTextChangedListener(new ah.j(this, 28));
        iVar.setOnEditorActionListener(new q0(this, 11));
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.L.J0(motionEvent, this.K);
        return super.onInterceptTouchEvent(motionEvent);
    }
}
