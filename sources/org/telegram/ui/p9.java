package org.telegram.ui;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final class p9 extends u9 {
    public final /* synthetic */ q9 f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p9(q9 q9Var, int i10) {
        super(i10);
        this.f0 = q9Var;
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final void finishFragment() {
        setFinishing(true);
        this.f0.dismiss();
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final void removeSelfFromStack() {
        this.f0.dismiss();
    }
}
