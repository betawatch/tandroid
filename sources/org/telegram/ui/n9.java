package org.telegram.ui;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class n9 extends t9 {
    public final /* synthetic */ o9 h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n9(o9 o9Var, int i7) {
        super(i7);
        this.h0 = o9Var;
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void finishFragment() {
        setFinishing(true);
        this.h0.dismiss();
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void removeSelfFromStack() {
        this.h0.dismiss();
    }
}
