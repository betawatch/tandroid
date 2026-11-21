package org.telegram.ui;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class o9 extends t9 {
    public final /* synthetic */ p9 h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o9(p9 p9Var, int i7) {
        super(i7);
        this.h0 = p9Var;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void finishFragment() {
        setFinishing(true);
        this.h0.dismiss();
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void removeSelfFromStack() {
        this.h0.dismiss();
    }
}
