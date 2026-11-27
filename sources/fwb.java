// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public enum fwb extends rwb {
    public fwb() {
        super("BetweenDoctypePublicAndSystemIdentifiers", 59);
    }

    @Override // rwb
    public final void c(bub bubVar, ik1 ik1Var) {
        char d = ik1Var.d();
        if (d == '\t' || d == '\n' || d == '\f' || d == '\r' || d == ' ') {
            return;
        }
        if (d == '\"') {
            bubVar.m(this);
            bubVar.c = rwb.A0;
            return;
        }
        if (d == '\'') {
            bubVar.m(this);
            bubVar.c = rwb.B0;
            return;
        }
        mub mubVar = rwb.a;
        if (d == '>') {
            bubVar.j();
            bubVar.c = mubVar;
        } else if (d != 65535) {
            bubVar.m(this);
            bubVar.c = rwb.D0;
        } else {
            bubVar.l(this);
            bubVar.j();
            bubVar.c = mubVar;
        }
    }
}
