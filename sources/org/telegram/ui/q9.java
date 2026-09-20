package org.telegram.ui;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
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
