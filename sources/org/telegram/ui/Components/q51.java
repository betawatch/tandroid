package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class q51 extends e10 {
    public final ah.i K;
    public final /* synthetic */ r51 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q51(r51 r51Var, Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, h6Var);
        this.L = r51Var;
        ah.i iVar = this.r;
        this.K = iVar;
        iVar.setImeOptions(268435459);
        iVar.setHint(org.telegram.messenger.gd.N0(2131743096, null));
        iVar.addTextChangedListener(new ah.j(this, 29));
        iVar.setOnEditorActionListener(new h(this, 12));
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.L.K0(motionEvent, this.K);
        return super.onInterceptTouchEvent(motionEvent);
    }
}
