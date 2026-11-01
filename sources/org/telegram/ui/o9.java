package org.telegram.ui;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
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
