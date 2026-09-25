package org.telegram.ui;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
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
