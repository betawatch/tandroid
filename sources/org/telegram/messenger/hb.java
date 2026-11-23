package org.telegram.messenger;

import java.io.File;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final /* synthetic */ class hb implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ fc b;
    public final /* synthetic */ String c;

    public /* synthetic */ hb(fc fcVar, String str, int i7) {
        this.a = i7;
        this.b = fcVar;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                String str = this.c;
                fc fcVar = this.b;
                tb tbVar = (tb) fcVar.g.get(str);
                if (tbVar != null) {
                    sb sbVar = tbVar.s;
                    if (sbVar != null) {
                        sb sbVar2 = new sb(fcVar, sbVar.a);
                        tbVar.s = sbVar2;
                        fcVar.o.add(sbVar2);
                    }
                    fcVar.T(false);
                    break;
                }
                break;
            case 1:
                tb tbVar2 = (tb) this.b.g.get(this.c);
                if (tbVar2 != null) {
                    tbVar2.c(null, null);
                    break;
                }
                break;
            case 2:
                this.b.w.remove(this.c);
                break;
            case 3:
                String str2 = this.c;
                String B = fc.B(str2, "jpg");
                String str3 = Utilities.a(str2) + "." + B;
                File file = new File(w7.z(4), str3);
                if (!file.exists()) {
                    gc g10 = gc.g(str2);
                    fc fcVar2 = this.b;
                    tb tbVar3 = new tb(fcVar2);
                    tbVar3.m = 1;
                    tbVar3.d = Utilities.a(str2);
                    tbVar3.f = null;
                    tbVar3.i = g10;
                    tbVar3.g = B;
                    tbVar3.j = null;
                    int i7 = g10.p;
                    if (i7 != 0) {
                        tbVar3.l = i7;
                    }
                    tbVar3.e = str3;
                    fcVar2.g.put(str3, tbVar3);
                    tbVar3.q = new File(w7.z(4), p5.c.v(Utilities.a(g10.g), "_temp.jpg"));
                    tbVar3.p = file;
                    sb sbVar3 = new sb(fcVar2, tbVar3);
                    tbVar3.s = sbVar3;
                    fcVar2.o.add(sbVar3);
                    fcVar2.T(false);
                    break;
                }
                break;
            default:
                String str4 = this.c;
                fc fcVar3 = this.b;
                tb tbVar4 = (tb) fcVar3.g.get(str4);
                if (tbVar4 != null) {
                    ac acVar = tbVar4.t;
                    if (acVar != null) {
                        ac acVar2 = new ac(fcVar3, acVar.a, acVar.c);
                        tbVar4.t = acVar2;
                        fcVar3.n.add(acVar2);
                    }
                    fcVar3.V(false);
                    break;
                }
                break;
        }
    }
}
