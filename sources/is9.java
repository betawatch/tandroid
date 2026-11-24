// default package

import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final /* synthetic */ class is9 implements qac {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ms9 b;

    public /* synthetic */ is9(ms9 ms9Var, byte b) {
        this.a = b;
        this.b = ms9Var;
    }

    @Override // qac
    public final void a(Object obj) {
        byte b = this.a;
        ms9 ms9Var = this.b;
        switch (b) {
            case 0:
                ls9 ls9Var = (ls9) obj;
                ms9Var.I = null;
                ms9Var.F = ls9Var;
                ms9Var.E = ls9Var != null;
                ms9Var.a();
                ms9Var.invalidate();
                f8b f8bVar = ms9Var.b;
                if (f8bVar != null) {
                    f8bVar.run();
                    break;
                }
                break;
            default:
                d dVar = (d) obj;
                ls9 ls9Var2 = ms9Var.F;
                if (ls9Var2 != null || dVar == null) {
                    ls9Var2.c(dVar);
                    break;
                }
        }
    }
}
