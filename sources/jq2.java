// default package

import android.os.Handler;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public abstract class jq2 extends qg0 {
    public final HashMap i = new HashMap();
    public Handler j;

    @Override // qg0
    public final void e() {
        for (iq2 iq2Var : this.i.values()) {
            iq2Var.a.d(iq2Var.b);
        }
    }

    @Override // qg0
    public final void g() {
        for (iq2 iq2Var : this.i.values()) {
            iq2Var.a.f(iq2Var.b);
        }
    }

    @Override // qg0
    public void k() {
        Iterator it = this.i.values().iterator();
        while (it.hasNext()) {
            ((iq2) it.next()).a.k();
        }
    }

    @Override // qg0
    public void q() {
        HashMap hashMap = this.i;
        for (iq2 iq2Var : hashMap.values()) {
            qg0 qg0Var = iq2Var.a;
            hq2 hq2Var = iq2Var.c;
            qg0Var.p(iq2Var.b);
            qg0Var.s(hq2Var);
            qg0Var.r(hq2Var);
        }
        hashMap.clear();
    }

    public abstract rx6 u(Integer num, rx6 rx6Var);

    public abstract void x(Integer num, qg0 qg0Var, aob aobVar);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [gq2, sx6] */
    public final void y(final Integer num, qg0 qg0Var) {
        HashMap hashMap = this.i;
        gre.f(!hashMap.containsKey(num));
        ?? r1 = new sx6() { // from class: gq2
            @Override // sx6
            public final void a(qg0 qg0Var2, aob aobVar) {
                jq2.this.x(num, qg0Var2, aobVar);
            }
        };
        hq2 hq2Var = new hq2(this, num);
        hashMap.put(num, new iq2(qg0Var, r1, hq2Var));
        Handler handler = this.j;
        handler.getClass();
        qg0Var.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) qg0Var.c.d;
        ux6 ux6Var = new ux6();
        ux6Var.a = handler;
        ux6Var.b = hq2Var;
        copyOnWriteArrayList.add(ux6Var);
        Handler handler2 = this.j;
        handler2.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList2 = qg0Var.d.c;
        uq3 uq3Var = new uq3();
        uq3Var.a = handler2;
        uq3Var.b = hq2Var;
        copyOnWriteArrayList2.add(uq3Var);
        uc8 uc8Var = this.g;
        uc8Var.getClass();
        s93 s93Var = this.h;
        s93Var.getClass();
        qg0Var.l(r1, uc8Var, s93Var);
        if (this.b.isEmpty()) {
            qg0Var.d(r1);
        }
    }

    public long v(long j, Integer num) {
        return j;
    }

    public int w(int i, Integer num) {
        return i;
    }
}
