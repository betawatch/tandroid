// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public enum fub extends rwb {
    public fub() {
        super("RCDATAEndTagName", 12);
    }

    public static void e(bub bubVar, ik1 ik1Var) {
        bubVar.h("</".concat(bubVar.h.toString()));
        ik1Var.q();
        bubVar.c = rwb.c;
    }

    @Override // rwb
    public final void c(bub bubVar, ik1 ik1Var) {
        if (ik1Var.o()) {
            String e = ik1Var.e();
            bubVar.i.y(e);
            bubVar.h.append(e);
            return;
        }
        char d = ik1Var.d();
        if (d == '\t' || d == '\n' || d == '\f' || d == '\r' || d == ' ') {
            if (bubVar.n()) {
                bubVar.c = rwb.X;
                return;
            } else {
                e(bubVar, ik1Var);
                return;
            }
        }
        if (d == '/') {
            if (bubVar.n()) {
                bubVar.c = rwb.f0;
                return;
            } else {
                e(bubVar, ik1Var);
                return;
            }
        }
        if (d != '>') {
            e(bubVar, ik1Var);
        } else if (!bubVar.n()) {
            e(bubVar, ik1Var);
        } else {
            bubVar.k();
            bubVar.c = rwb.a;
        }
    }
}
