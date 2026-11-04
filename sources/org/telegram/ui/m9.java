package org.telegram.ui;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class m9 extends s9 {
    public final /* synthetic */ n9 h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m9(n9 n9Var, int i3) {
        super(i3);
        this.h0 = n9Var;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void finishFragment() {
        setFinishing(true);
        this.h0.dismiss();
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void removeSelfFromStack() {
        this.h0.dismiss();
    }
}
