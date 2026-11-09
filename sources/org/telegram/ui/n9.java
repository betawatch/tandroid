package org.telegram.ui;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
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
