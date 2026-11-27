// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public enum kvb extends rwb {
    public kvb() {
        super("AfterAttributeValue_quoted", 40);
    }

    @Override // rwb
    public final void c(bub bubVar, ik1 ik1Var) {
        char d = ik1Var.d();
        cvb cvbVar = rwb.X;
        if (d == '\t' || d == '\n' || d == '\f' || d == '\r' || d == ' ') {
            bubVar.c = cvbVar;
            return;
        }
        if (d == '/') {
            bubVar.c = rwb.f0;
            return;
        }
        mub mubVar = rwb.a;
        if (d == '>') {
            bubVar.k();
            bubVar.c = mubVar;
        } else if (d == 65535) {
            bubVar.l(this);
            bubVar.c = mubVar;
        } else {
            bubVar.m(this);
            ik1Var.q();
            bubVar.c = cvbVar;
        }
    }
}
