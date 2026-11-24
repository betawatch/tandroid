// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class gp7 extends bx9 {
    public final /* synthetic */ lp7 d;

    public gp7(lp7 lp7Var) {
        this.d = lp7Var;
    }

    @Override // bx9
    public final void c(boolean z) {
        this.d.a(!z);
    }

    @Override // bx9
    public final CharSequence d() {
        lp7 lp7Var = this.d;
        rac racVar = lp7Var.v0;
        int i = lp7Var.I;
        return racVar != null ? (CharSequence) racVar.a(Integer.valueOf(i)) : lp7Var.d(i);
    }
}
