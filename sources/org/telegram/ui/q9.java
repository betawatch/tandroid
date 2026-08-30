package org.telegram.ui;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class q9 extends v9 {
    public final /* synthetic */ r9 c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q9(r9 r9Var, int i10) {
        super(i10);
        this.c0 = r9Var;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void finishFragment() {
        setFinishing(true);
        this.c0.dismiss();
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void removeSelfFromStack() {
        this.c0.dismiss();
    }
}
