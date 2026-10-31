package org.telegram.messenger;

import java.io.File;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class ib implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ hc b;
    public final /* synthetic */ String c;

    public /* synthetic */ ib(hc hcVar, String str, int i10) {
        this.a = i10;
        this.b = hcVar;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                String str = this.c;
                hc hcVar = this.b;
                vb vbVar = (vb) hcVar.g.get(str);
                if (vbVar != null) {
                    ub ubVar = vbVar.s;
                    if (ubVar != null) {
                        ub ubVar2 = new ub(hcVar, ubVar.a);
                        vbVar.s = ubVar2;
                        hcVar.o.add(ubVar2);
                    }
                    hcVar.T(false);
                    break;
                }
                break;
            case 1:
                vb vbVar2 = (vb) this.b.g.get(this.c);
                if (vbVar2 != null) {
                    vbVar2.c(null, null);
                    break;
                }
                break;
            case 2:
                this.b.w.remove(this.c);
                break;
            case 3:
                String str2 = this.c;
                String B = hc.B(str2, "jpg");
                String str3 = Utilities.a(str2) + "." + B;
                File file = new File(b8.z(4), str3);
                if (!file.exists()) {
                    ic g10 = ic.g(str2);
                    hc hcVar2 = this.b;
                    vb vbVar3 = new vb(hcVar2);
                    vbVar3.m = 1;
                    vbVar3.d = Utilities.a(str2);
                    vbVar3.f = null;
                    vbVar3.i = g10;
                    vbVar3.g = B;
                    vbVar3.j = null;
                    int i10 = g10.p;
                    if (i10 != 0) {
                        vbVar3.l = i10;
                    }
                    vbVar3.e = str3;
                    hcVar2.g.put(str3, vbVar3);
                    vbVar3.q = new File(b8.z(4), sc.e.A(Utilities.a(g10.g), "_temp.jpg"));
                    vbVar3.p = file;
                    ub ubVar3 = new ub(hcVar2, vbVar3);
                    vbVar3.s = ubVar3;
                    hcVar2.o.add(ubVar3);
                    hcVar2.T(false);
                    break;
                }
                break;
            default:
                String str4 = this.c;
                hc hcVar3 = this.b;
                vb vbVar4 = (vb) hcVar3.g.get(str4);
                if (vbVar4 != null) {
                    cc ccVar = vbVar4.t;
                    if (ccVar != null) {
                        cc ccVar2 = new cc(hcVar3, ccVar.a, ccVar.c);
                        vbVar4.t = ccVar2;
                        hcVar3.n.add(ccVar2);
                    }
                    hcVar3.V(false);
                    break;
                }
                break;
        }
    }
}
