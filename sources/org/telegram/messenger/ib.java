package org.telegram.messenger;

import java.io.File;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final /* synthetic */ class ib implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ gc b;
    public final /* synthetic */ String c;

    public /* synthetic */ ib(gc gcVar, String str, int i7) {
        this.a = i7;
        this.b = gcVar;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                String str = this.c;
                gc gcVar = this.b;
                ub ubVar = (ub) gcVar.g.get(str);
                if (ubVar != null) {
                    tb tbVar = ubVar.s;
                    if (tbVar != null) {
                        tb tbVar2 = new tb(gcVar, tbVar.a);
                        ubVar.s = tbVar2;
                        gcVar.o.add(tbVar2);
                    }
                    gcVar.T(false);
                    break;
                }
                break;
            case 1:
                ub ubVar2 = (ub) this.b.g.get(this.c);
                if (ubVar2 != null) {
                    ubVar2.c(null, null);
                    break;
                }
                break;
            case 2:
                this.b.w.remove(this.c);
                break;
            case 3:
                String str2 = this.c;
                String B = gc.B(str2, "jpg");
                String str3 = Utilities.a(str2) + "." + B;
                File file = new File(w7.z(4), str3);
                if (!file.exists()) {
                    hc g10 = hc.g(str2);
                    gc gcVar2 = this.b;
                    ub ubVar3 = new ub(gcVar2);
                    ubVar3.m = 1;
                    ubVar3.d = Utilities.a(str2);
                    ubVar3.f = null;
                    ubVar3.i = g10;
                    ubVar3.g = B;
                    ubVar3.j = null;
                    int i7 = g10.p;
                    if (i7 != 0) {
                        ubVar3.l = i7;
                    }
                    ubVar3.e = str3;
                    gcVar2.g.put(str3, ubVar3);
                    ubVar3.q = new File(w7.z(4), rf.b.q(Utilities.a(g10.g), "_temp.jpg"));
                    ubVar3.p = file;
                    tb tbVar3 = new tb(gcVar2, ubVar3);
                    ubVar3.s = tbVar3;
                    gcVar2.o.add(tbVar3);
                    gcVar2.T(false);
                    break;
                }
                break;
            default:
                String str4 = this.c;
                gc gcVar3 = this.b;
                ub ubVar4 = (ub) gcVar3.g.get(str4);
                if (ubVar4 != null) {
                    bc bcVar = ubVar4.t;
                    if (bcVar != null) {
                        bc bcVar2 = new bc(gcVar3, bcVar.a, bcVar.c);
                        ubVar4.t = bcVar2;
                        gcVar3.n.add(bcVar2);
                    }
                    gcVar3.V(false);
                    break;
                }
                break;
        }
    }
}
