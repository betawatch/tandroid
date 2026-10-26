package di;

import a8.yb;
import android.content.Context;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class p4 {
    public boolean a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;

    public p4(Context context, int i10) {
        switch (i10) {
            case 2:
                this.d = ui.h.a;
                this.a = true;
                this.g = ui.o.H;
                this.b = context;
                break;
            default:
                this.b = context;
                this.c = k2.b.f;
                break;
        }
    }

    public k2.u0 a() {
        Context context = (Context) this.b;
        yb.p(!this.a);
        this.a = true;
        if (((a8.h0) this.d) == null) {
            this.d = new a8.h0(new c2.o[0]);
        }
        if (((k2.l0) this.f) == null) {
            if (((k2.o0) this.g) == null) {
                this.g = new k2.o0(context);
            }
            if (((k2.v0) this.e) == null) {
                this.e = k2.v0.a;
            }
            k2.k0 k0Var = new k2.k0(context);
            k2.b bVar = context != null ? null : (k2.b) this.c;
            Context context2 = k0Var.a;
            if (context2 == null) {
                k0Var.d = bVar;
            }
            k2.o0 o0Var = (k2.o0) this.g;
            k0Var.b = o0Var;
            k0Var.c = (k2.v0) this.e;
            if (o0Var == null) {
                k0Var.b = new k2.o0(context2);
            }
            this.f = new k2.l0(k0Var);
        } else {
            yb.p(((k2.o0) this.g) == null);
            yb.p(((k2.v0) this.e) == null);
        }
        return new k2.u0(this);
    }

    public void b() {
        ArrayList arrayList = (ArrayList) this.g;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((View) arrayList.get(i10)).invalidate();
        }
    }
}
