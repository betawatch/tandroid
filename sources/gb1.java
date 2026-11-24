// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class gb1 extends lb1 {
    public final /* synthetic */ hb1 h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gb1(hb1 hb1Var, int i) {
        super(i);
        this.h0 = hb1Var;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void finishFragment() {
        setFinishing(true);
        this.h0.dismiss();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void removeSelfFromStack() {
        this.h0.dismiss();
    }
}
