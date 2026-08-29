package org.telegram.ui;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class m9 extends r9 {
    public final /* synthetic */ n9 b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m9(n9 n9Var, int i10) {
        super(i10);
        this.b0 = n9Var;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void finishFragment() {
        setFinishing(true);
        this.b0.dismiss();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void removeSelfFromStack() {
        this.b0.dismiss();
    }
}
