package k;

import java.util.ArrayList;
import m.l3;
import r0.m0;
import r0.n0;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class i extends n0 {
    public final /* synthetic */ int a;
    public boolean b;
    public int c;
    public final /* synthetic */ Object d;

    public i(bc.d dVar) {
        this.a = 0;
        this.d = dVar;
        this.b = false;
        this.c = 0;
    }

    @Override // r0.n0, r0.m0
    public void a() {
        switch (this.a) {
            case 1:
                this.b = true;
                break;
        }
    }

    @Override // r0.n0, r0.m0
    public final void b() {
        switch (this.a) {
            case 0:
                if (!this.b) {
                    this.b = true;
                    m0 m0Var = (m0) ((bc.d) this.d).e;
                    if (m0Var != null) {
                        m0Var.b();
                        break;
                    }
                }
                break;
            default:
                ((l3) this.d).a.setVisibility(0);
                break;
        }
    }

    @Override // r0.m0
    public final void c() {
        switch (this.a) {
            case 0:
                int i10 = this.c + 1;
                this.c = i10;
                bc.d dVar = (bc.d) this.d;
                if (i10 == ((ArrayList) dVar.c).size()) {
                    m0 m0Var = (m0) dVar.e;
                    if (m0Var != null) {
                        m0Var.c();
                    }
                    this.c = 0;
                    this.b = false;
                    dVar.b = false;
                    break;
                }
                break;
            default:
                if (!this.b) {
                    ((l3) this.d).a.setVisibility(this.c);
                    break;
                }
                break;
        }
    }

    public i(l3 l3Var, int i10) {
        this.a = 1;
        this.d = l3Var;
        this.c = i10;
        this.b = false;
    }
}
