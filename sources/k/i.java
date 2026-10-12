package k;

import java.util.ArrayList;
import m.m3;
import r0.n0;
import r0.o0;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final class i extends o0 {
    public final /* synthetic */ int a;
    public boolean b;
    public int c;
    public final /* synthetic */ Object d;

    public i(cc.d dVar) {
        this.a = 0;
        this.d = dVar;
        this.b = false;
        this.c = 0;
    }

    @Override // r0.o0, r0.n0
    public void a() {
        switch (this.a) {
            case 1:
                this.b = true;
                break;
        }
    }

    @Override // r0.o0, r0.n0
    public final void b() {
        switch (this.a) {
            case 0:
                if (!this.b) {
                    this.b = true;
                    n0 n0Var = (n0) ((cc.d) this.d).e;
                    if (n0Var != null) {
                        n0Var.b();
                        break;
                    }
                }
                break;
            default:
                ((m3) this.d).a.setVisibility(0);
                break;
        }
    }

    @Override // r0.n0
    public final void c() {
        switch (this.a) {
            case 0:
                int i10 = this.c + 1;
                this.c = i10;
                cc.d dVar = (cc.d) this.d;
                if (i10 == ((ArrayList) dVar.c).size()) {
                    n0 n0Var = (n0) dVar.e;
                    if (n0Var != null) {
                        n0Var.c();
                    }
                    this.c = 0;
                    this.b = false;
                    dVar.b = false;
                    break;
                }
                break;
            default:
                if (!this.b) {
                    ((m3) this.d).a.setVisibility(this.c);
                    break;
                }
                break;
        }
    }

    public i(m3 m3Var, int i10) {
        this.a = 1;
        this.d = m3Var;
        this.c = i10;
        this.b = false;
    }
}
