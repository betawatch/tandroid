package k;

import java.util.ArrayList;
import m.p3;
import r0.n0;
import r0.o0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class i extends o0 {
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
                    n0 n0Var = (n0) ((j) this.d).e;
                    if (n0Var != null) {
                        n0Var.b();
                        break;
                    }
                }
                break;
            default:
                ((p3) this.d).a.setVisibility(0);
                break;
        }
    }

    @Override // r0.n0
    public final void c() {
        switch (this.a) {
            case 0:
                int i10 = this.c + 1;
                this.c = i10;
                j jVar = (j) this.d;
                if (i10 == ((ArrayList) jVar.c).size()) {
                    n0 n0Var = (n0) jVar.e;
                    if (n0Var != null) {
                        n0Var.c();
                    }
                    this.c = 0;
                    this.b = false;
                    jVar.b = false;
                    break;
                }
                break;
            default:
                if (!this.b) {
                    ((p3) this.d).a.setVisibility(this.c);
                    break;
                }
                break;
        }
    }

    public i(p3 p3Var, int i10) {
        this.a = 1;
        this.d = p3Var;
        this.c = i10;
        this.b = false;
    }
}
