// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public enum iwb extends rwb {
    public iwb() {
        super("DoctypeSystemIdentifier_doubleQuoted", 62);
    }

    @Override // rwb
    public final void c(bub bubVar, ik1 ik1Var) {
        stb stbVar = bubVar.m;
        char d = ik1Var.d();
        if (d == 0) {
            bubVar.m(this);
            stbVar.g.append((char) 65533);
            return;
        }
        if (d == '\"') {
            bubVar.c = rwb.C0;
            return;
        }
        mub mubVar = rwb.a;
        if (d == '>') {
            bubVar.m(this);
            bubVar.j();
            bubVar.c = mubVar;
        } else {
            if (d != 65535) {
                stbVar.g.append(d);
                return;
            }
            bubVar.l(this);
            bubVar.j();
            bubVar.c = mubVar;
        }
    }
}
