// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class ga1 extends la1 {
    public final /* synthetic */ ha1 h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ga1(ha1 ha1Var, int i) {
        super(i);
        this.h0 = ha1Var;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void finishFragment() {
        setFinishing(true);
        this.h0.dismiss();
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void removeSelfFromStack() {
        this.h0.dismiss();
    }
}
