package org.telegram.ui;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
