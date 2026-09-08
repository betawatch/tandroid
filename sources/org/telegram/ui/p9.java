package org.telegram.ui;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class p9 extends u9 {
    public final /* synthetic */ q9 f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p9(q9 q9Var, int i10) {
        super(i10);
        this.f0 = q9Var;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void finishFragment() {
        setFinishing(true);
        this.f0.dismiss();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void removeSelfFromStack() {
        this.f0.dismiss();
    }
}
