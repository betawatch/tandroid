package org.telegram.ui;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class q9 extends v9 {
    public final /* synthetic */ r9 f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q9(r9 r9Var, int i10) {
        super(i10);
        this.f0 = r9Var;
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
