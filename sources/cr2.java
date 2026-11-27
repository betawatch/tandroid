// default package

import android.os.Handler;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public abstract class cr2 extends rg0 {
    public final HashMap i = new HashMap();
    public Handler j;

    @Override // rg0
    public final void e() {
        for (br2 br2Var : this.i.values()) {
            br2Var.a.d(br2Var.b);
        }
    }

    @Override // rg0
    public final void g() {
        for (br2 br2Var : this.i.values()) {
            br2Var.a.f(br2Var.b);
        }
    }

    @Override // rg0
    public void k() {
        Iterator it = this.i.values().iterator();
        while (it.hasNext()) {
            ((br2) it.next()).a.k();
        }
    }

    @Override // rg0
    public void q() {
        HashMap hashMap = this.i;
        for (br2 br2Var : hashMap.values()) {
            rg0 rg0Var = br2Var.a;
            ar2 ar2Var = br2Var.c;
            rg0Var.p(br2Var.b);
            rg0Var.s(ar2Var);
            rg0Var.r(ar2Var);
        }
        hashMap.clear();
    }

    public abstract vz6 u(Integer num, vz6 vz6Var);

    public abstract void x(Integer num, rg0 rg0Var, asb asbVar);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [wz6, zq2] */
    public final void y(final Integer num, rg0 rg0Var) {
        HashMap hashMap = this.i;
        yve.f(!hashMap.containsKey(num));
        ?? r1 = new wz6() { // from class: zq2
            @Override // wz6
            public final void a(rg0 rg0Var2, asb asbVar) {
                cr2.this.x(num, rg0Var2, asbVar);
            }
        };
        ar2 ar2Var = new ar2(this, num);
        hashMap.put(num, new br2(rg0Var, r1, ar2Var));
        Handler handler = this.j;
        handler.getClass();
        rg0Var.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) rg0Var.c.d;
        yz6 yz6Var = new yz6();
        yz6Var.a = handler;
        yz6Var.b = ar2Var;
        copyOnWriteArrayList.add(yz6Var);
        Handler handler2 = this.j;
        handler2.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList2 = rg0Var.d.c;
        lr3 lr3Var = new lr3();
        lr3Var.a = handler2;
        lr3Var.b = ar2Var;
        copyOnWriteArrayList2.add(lr3Var);
        ig8 ig8Var = this.g;
        ig8Var.getClass();
        la3 la3Var = this.h;
        la3Var.getClass();
        rg0Var.l(r1, ig8Var, la3Var);
        if (this.b.isEmpty()) {
            rg0Var.d(r1);
        }
    }

    public long v(long j, Integer num) {
        return j;
    }

    public int w(int i, Integer num) {
        return i;
    }
}
