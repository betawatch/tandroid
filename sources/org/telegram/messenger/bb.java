package org.telegram.messenger;

import java.io.File;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class bb implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zb b;
    public final /* synthetic */ String c;

    public /* synthetic */ bb(zb zbVar, String str, int i3) {
        this.a = i3;
        this.b = zbVar;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                String str = this.c;
                zb zbVar = this.b;
                nb nbVar = (nb) zbVar.g.get(str);
                if (nbVar != null) {
                    mb mbVar = nbVar.s;
                    if (mbVar != null) {
                        mb mbVar2 = new mb(zbVar, mbVar.a);
                        nbVar.s = mbVar2;
                        zbVar.o.add(mbVar2);
                    }
                    zbVar.T(false);
                    break;
                }
                break;
            case 1:
                nb nbVar2 = (nb) this.b.g.get(this.c);
                if (nbVar2 != null) {
                    nbVar2.c(null, null);
                    break;
                }
                break;
            case 2:
                this.b.w.remove(this.c);
                break;
            case 3:
                String str2 = this.c;
                String B = zb.B(str2, "jpg");
                String str3 = Utilities.a(str2) + "." + B;
                File file = new File(w7.z(4), str3);
                if (!file.exists()) {
                    ac g7 = ac.g(str2);
                    zb zbVar2 = this.b;
                    nb nbVar3 = new nb(zbVar2);
                    nbVar3.m = 1;
                    nbVar3.d = Utilities.a(str2);
                    nbVar3.f = null;
                    nbVar3.i = g7;
                    nbVar3.g = B;
                    nbVar3.j = null;
                    int i3 = g7.p;
                    if (i3 != 0) {
                        nbVar3.l = i3;
                    }
                    nbVar3.e = str3;
                    zbVar2.g.put(str3, nbVar3);
                    nbVar3.q = new File(w7.z(4), t4.c.q(Utilities.a(g7.g), "_temp.jpg"));
                    nbVar3.p = file;
                    mb mbVar3 = new mb(zbVar2, nbVar3);
                    nbVar3.s = mbVar3;
                    zbVar2.o.add(mbVar3);
                    zbVar2.T(false);
                    break;
                }
                break;
            default:
                String str4 = this.c;
                zb zbVar3 = this.b;
                nb nbVar4 = (nb) zbVar3.g.get(str4);
                if (nbVar4 != null) {
                    ub ubVar = nbVar4.t;
                    if (ubVar != null) {
                        ub ubVar2 = new ub(zbVar3, ubVar.a, ubVar.c);
                        nbVar4.t = ubVar2;
                        zbVar3.n.add(ubVar2);
                    }
                    zbVar3.V(false);
                    break;
                }
                break;
        }
    }
}
