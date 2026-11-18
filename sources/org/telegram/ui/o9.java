package org.telegram.ui;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
