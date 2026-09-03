package org.telegram.ui;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
