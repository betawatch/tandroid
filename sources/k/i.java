package k;

import java.util.ArrayList;
import m.l3;
import r0.l0;
import r0.m0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class i extends m0 {
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

    @Override // r0.m0, r0.l0
    public void a() {
        switch (this.a) {
            case 1:
                this.b = true;
                break;
        }
    }

    @Override // r0.m0, r0.l0
    public final void b() {
        switch (this.a) {
            case 0:
                if (!this.b) {
                    this.b = true;
                    l0 l0Var = (l0) ((j) this.d).e;
                    if (l0Var != null) {
                        l0Var.b();
                        break;
                    }
                }
                break;
            default:
                ((l3) this.d).a.setVisibility(0);
                break;
        }
    }

    @Override // r0.l0
    public final void c() {
        switch (this.a) {
            case 0:
                int i10 = this.c + 1;
                this.c = i10;
                j jVar = (j) this.d;
                if (i10 == ((ArrayList) jVar.c).size()) {
                    l0 l0Var = (l0) jVar.e;
                    if (l0Var != null) {
                        l0Var.c();
                    }
                    this.c = 0;
                    this.b = false;
                    jVar.b = false;
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
