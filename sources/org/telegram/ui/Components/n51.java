package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class n51 extends c10 {
    public final ah.i K;
    public final /* synthetic */ o51 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n51(o51 o51Var, Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, i6Var);
        this.L = o51Var;
        ah.i iVar = this.r;
        this.K = iVar;
        iVar.setImeOptions(268435459);
        iVar.setHint(org.telegram.messenger.gd.M0(2131743102, null));
        iVar.addTextChangedListener(new ah.j(this, 29));
        iVar.setOnEditorActionListener(new g(this, 12));
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.L.K0(motionEvent, this.K);
        return super.onInterceptTouchEvent(motionEvent);
    }
}
