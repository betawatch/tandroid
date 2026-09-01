package org.telegram.ui;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
