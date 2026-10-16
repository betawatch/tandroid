package bi;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final class p5 {
    public boolean a;
    public Object b;
    public Object c = k2.b.f;
    public Object d;
    public Object e;
    public Object f;
    public Object g;

    public p5(Context context) {
        this.b = context;
    }

    public k2.s0 a() {
        Context context = (Context) this.b;
        v7.u6.p(!this.a);
        this.a = true;
        if (((androidx.biometric.e) this.d) == null) {
            this.d = new androidx.biometric.e(new c2.n[0]);
        }
        if (((k2.j0) this.f) == null) {
            if (((k2.m0) this.g) == null) {
                this.g = new k2.m0(context);
            }
            if (((k2.t0) this.e) == null) {
                this.e = k2.t0.a;
            }
            k2.i0 i0Var = new k2.i0(context);
            k2.b bVar = context != null ? null : (k2.b) this.c;
            Context context2 = i0Var.a;
            if (context2 == null) {
                i0Var.d = bVar;
            }
            k2.m0 m0Var = (k2.m0) this.g;
            i0Var.b = m0Var;
            i0Var.c = (k2.t0) this.e;
            if (m0Var == null) {
                i0Var.b = new k2.m0(context2);
            }
            this.f = new k2.j0(i0Var);
        } else {
            v7.u6.p(((k2.m0) this.g) == null);
            v7.u6.p(((k2.t0) this.e) == null);
        }
        return new k2.s0(this);
    }

    public void b() {
        ArrayList arrayList = (ArrayList) this.g;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((View) arrayList.get(i10)).invalidate();
        }
    }
}
