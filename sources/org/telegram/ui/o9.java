package org.telegram.ui;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class o9 extends u9 {
    public final /* synthetic */ p9 g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o9(p9 p9Var, int i10) {
        super(i10);
        this.g0 = p9Var;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void finishFragment() {
        setFinishing(true);
        this.g0.dismiss();
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void removeSelfFromStack() {
        this.g0.dismiss();
    }
}
