package k;

import java.util.ArrayList;
import m.k3;
import r0.m0;
import r0.n0;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
                ((k3) this.d).a.setVisibility(0);
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
                    ((k3) this.d).a.setVisibility(this.c);
                    break;
                }
                break;
        }
    }

    public i(k3 k3Var, int i7) {
        this.a = 1;
        this.d = k3Var;
        this.c = i7;
        this.b = false;
    }
}
