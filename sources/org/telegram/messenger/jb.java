package org.telegram.messenger;

import java.io.File;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class jb implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ic b;
    public final /* synthetic */ String c;

    public /* synthetic */ jb(ic icVar, String str, int i10) {
        this.a = i10;
        this.b = icVar;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                String str = this.c;
                ic icVar = this.b;
                wb wbVar = (wb) icVar.g.get(str);
                if (wbVar != null) {
                    vb vbVar = wbVar.s;
                    if (vbVar != null) {
                        vb vbVar2 = new vb(icVar, vbVar.a);
                        wbVar.s = vbVar2;
                        icVar.o.add(vbVar2);
                    }
                    icVar.T(false);
                    break;
                }
                break;
            case 1:
                wb wbVar2 = (wb) this.b.g.get(this.c);
                if (wbVar2 != null) {
                    wbVar2.c(null, null);
                    break;
                }
                break;
            case 2:
                this.b.w.remove(this.c);
                break;
            case 3:
                String str2 = this.c;
                String B = ic.B(str2, "jpg");
                String str3 = Utilities.a(str2) + "." + B;
                File file = new File(b8.z(4), str3);
                if (!file.exists()) {
                    jc g10 = jc.g(str2);
                    ic icVar2 = this.b;
                    wb wbVar3 = new wb(icVar2);
                    wbVar3.m = 1;
                    wbVar3.d = Utilities.a(str2);
                    wbVar3.f = null;
                    wbVar3.i = g10;
                    wbVar3.g = B;
                    wbVar3.j = null;
                    int i10 = g10.p;
                    if (i10 != 0) {
                        wbVar3.l = i10;
                    }
                    wbVar3.e = str3;
                    icVar2.g.put(str3, wbVar3);
                    wbVar3.q = new File(b8.z(4), sc.e.A(Utilities.a(g10.g), "_temp.jpg"));
                    wbVar3.p = file;
                    vb vbVar3 = new vb(icVar2, wbVar3);
                    wbVar3.s = vbVar3;
                    icVar2.o.add(vbVar3);
                    icVar2.T(false);
                    break;
                }
                break;
            default:
                String str4 = this.c;
                ic icVar3 = this.b;
                wb wbVar4 = (wb) icVar3.g.get(str4);
                if (wbVar4 != null) {
                    dc dcVar = wbVar4.t;
                    if (dcVar != null) {
                        dc dcVar2 = new dc(icVar3, dcVar.a, dcVar.c);
                        wbVar4.t = dcVar2;
                        icVar3.n.add(dcVar2);
                    }
                    icVar3.V(false);
                    break;
                }
                break;
        }
    }
}
