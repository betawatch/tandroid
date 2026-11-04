package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class u41 extends n00 {
    public final bh.g K;
    public final /* synthetic */ v41 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u41(v41 v41Var, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var);
        this.L = v41Var;
        bh.g gVar = this.r;
        this.K = gVar;
        gVar.setImeOptions(268435459);
        gVar.setHint(org.telegram.messenger.bd.M0(2131743349, null));
        gVar.addTextChangedListener(new bh.h(this, 26));
        gVar.setOnEditorActionListener(new s0(this, 11));
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.L.J0(motionEvent, this.K);
        return super.onInterceptTouchEvent(motionEvent);
    }
}
