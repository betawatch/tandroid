package org.telegram.ui;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
