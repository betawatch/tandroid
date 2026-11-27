// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class cq7 extends sy9 {
    public final /* synthetic */ hq7 d;

    public cq7(hq7 hq7Var) {
        this.d = hq7Var;
    }

    @Override // sy9
    public final void c(boolean z) {
        this.d.a(!z);
    }

    @Override // sy9
    public final CharSequence d() {
        hq7 hq7Var = this.d;
        qcc qccVar = hq7Var.v0;
        int i = hq7Var.I;
        return qccVar != null ? (CharSequence) qccVar.a(Integer.valueOf(i)) : hq7Var.d(i);
    }
}
