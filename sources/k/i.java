package k;

import java.util.ArrayList;
import m.k3;
import r0.m0;
import r0.n0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class i extends n0 {
    public final /* synthetic */ int a;
    public boolean b;
    public int c;
    public final /* synthetic */ Object d;

    public i(j jVar) {
        this.a = 0;
        this.d = jVar;
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
                    m0 m0Var = (m0) ((j) this.d).e;
                    if (m0Var != null) {
                        m0Var.b();
                        break;
                    }
                }
                break;
            default:
                ((k3) this.d).a.setVisibility(0);
                break;
        }
    }

    @Override // r0.m0
    public final void c() {
        switch (this.a) {
            case 0:
                int i3 = this.c + 1;
                this.c = i3;
                j jVar = (j) this.d;
                if (i3 == ((ArrayList) jVar.c).size()) {
                    m0 m0Var = (m0) jVar.e;
                    if (m0Var != null) {
                        m0Var.c();
                    }
                    this.c = 0;
                    this.b = false;
                    jVar.b = false;
                    break;
                }
                break;
            default:
                if (!this.b) {
                    ((k3) this.d).a.setVisibility(this.c);
                    break;
                }
                break;
        }
    }

    public i(k3 k3Var, int i3) {
        this.a = 1;
        this.d = k3Var;
        this.c = i3;
        this.b = false;
    }
}
