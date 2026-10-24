package ci;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public final class o4 {
    public boolean a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;

    public o4(Context context, int i10) {
        switch (i10) {
            case 2:
                this.d = ri.h.a;
                this.a = true;
                this.g = ri.o.H;
                this.b = context;
                break;
            default:
                this.b = context;
                this.c = k2.b.f;
                break;
        }
    }

    public k2.t0 a() {
        Context context = (Context) this.b;
        v7.u6.p(!this.a);
        this.a = true;
        if (((androidx.biometric.e) this.d) == null) {
            this.d = new androidx.biometric.e(new c2.n[0]);
        }
        if (((k2.k0) this.f) == null) {
            if (((k2.n0) this.g) == null) {
                this.g = new k2.n0(context);
            }
            if (((k2.u0) this.e) == null) {
                this.e = k2.u0.a;
            }
            k2.j0 j0Var = new k2.j0(context);
            k2.b bVar = context != null ? null : (k2.b) this.c;
            Context context2 = j0Var.a;
            if (context2 == null) {
                j0Var.d = bVar;
            }
            k2.n0 n0Var = (k2.n0) this.g;
            j0Var.b = n0Var;
            j0Var.c = (k2.u0) this.e;
            if (n0Var == null) {
                j0Var.b = new k2.n0(context2);
            }
            this.f = new k2.k0(j0Var);
        } else {
            v7.u6.p(((k2.n0) this.g) == null);
            v7.u6.p(((k2.u0) this.e) == null);
        }
        return new k2.t0(this);
    }

    public void b() {
        ArrayList arrayList = (ArrayList) this.g;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((View) arrayList.get(i10)).invalidate();
        }
    }
}
