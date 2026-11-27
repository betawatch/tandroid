// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class k6d implements pd0 {
    public final /* synthetic */ n05 a;

    public k6d(n05 n05Var) {
        this.a = n05Var;
    }

    @Override // pd0
    public final void a(boolean z) {
        Boolean valueOf = Boolean.valueOf(z);
        b99 b99Var = this.a.y;
        b99Var.sendMessage(b99Var.obtainMessage(1, valueOf));
    }
}
