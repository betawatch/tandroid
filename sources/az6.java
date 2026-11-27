// default package

import java.util.List;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final /* synthetic */ class az6 implements mz6, nz6 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ sz6 b;
    public final /* synthetic */ int c;

    public /* synthetic */ az6(sz6 sz6Var, int i, byte b) {
        this.a = b;
        this.b = sz6Var;
        this.c = i;
    }

    @Override // nz6
    public final void a(og8 og8Var, xw6 xw6Var, List list) {
        byte b = this.a;
        int i = this.c;
        sz6 sz6Var = this.b;
        switch (b) {
            case 1:
                og8Var.Z(sz6Var.f(xw6Var, og8Var, i), list);
                break;
            case 2:
                if (list.size() != 1) {
                    og8Var.r0(list, sz6Var.f(xw6Var, og8Var, i), sz6Var.f(xw6Var, og8Var, i + 1));
                    break;
                } else {
                    og8Var.A0(sz6Var.f(xw6Var, og8Var, i), (ft6) list.get(0));
                    break;
                }
            default:
                og8Var.Z(sz6Var.f(xw6Var, og8Var, i), list);
                break;
        }
    }

    @Override // mz6
    public final void d(og8 og8Var, xw6 xw6Var) {
        byte b = this.a;
        int i = this.c;
        sz6 sz6Var = this.b;
        switch (b) {
            case 0:
                og8Var.W(sz6Var.f(xw6Var, og8Var, i));
                break;
            default:
                og8Var.O(sz6Var.f(xw6Var, og8Var, i));
                break;
        }
    }
}
