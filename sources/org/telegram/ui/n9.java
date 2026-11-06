package org.telegram.ui;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class n9 extends s9 {
    public final /* synthetic */ o9 g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n9(o9 o9Var, int i7) {
        super(i7);
        this.g0 = o9Var;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void finishFragment() {
        setFinishing(true);
        this.g0.dismiss();
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void removeSelfFromStack() {
        this.g0.dismiss();
    }
}
