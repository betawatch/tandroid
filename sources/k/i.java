package k;

import java.util.ArrayList;
import m.m3;
import r0.m0;
import r0.n0;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final class i extends n0 {
    public final /* synthetic */ int a;
    public boolean b;
    public int c;
    public final /* synthetic */ Object d;

    public i(ac.d dVar) {
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
                    m0 m0Var = (m0) ((ac.d) this.d).e;
                    if (m0Var != null) {
                        m0Var.b();
                        break;
                    }
                }
                break;
            default:
                ((m3) this.d).a.setVisibility(0);
                break;
        }
    }

    @Override // r0.m0
    public final void c() {
        switch (this.a) {
            case 0:
                int i7 = this.c + 1;
                this.c = i7;
                ac.d dVar = (ac.d) this.d;
                if (i7 == ((ArrayList) dVar.c).size()) {
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
                    ((m3) this.d).a.setVisibility(this.c);
                    break;
                }
                break;
        }
    }

    public i(m3 m3Var, int i7) {
        this.a = 1;
        this.d = m3Var;
        this.c = i7;
        this.b = false;
    }
}
