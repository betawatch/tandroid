package org.telegram.ui;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class o9 extends t9 {
    public final /* synthetic */ p9 h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o9(p9 p9Var, int i7) {
        super(i7);
        this.h0 = p9Var;
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final void finishFragment() {
        setFinishing(true);
        this.h0.dismiss();
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final void removeSelfFromStack() {
        this.h0.dismiss();
    }
}
