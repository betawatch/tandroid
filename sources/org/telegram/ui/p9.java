package org.telegram.ui;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
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
