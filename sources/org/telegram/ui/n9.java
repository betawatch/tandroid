package org.telegram.ui;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class n9 extends s9 {
    public final /* synthetic */ o9 b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n9(o9 o9Var, int i9) {
        super(i9);
        this.b0 = o9Var;
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
