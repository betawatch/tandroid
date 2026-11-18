package org.telegram.messenger;

import java.io.File;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public final /* synthetic */ class gb implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ec b;
    public final /* synthetic */ String c;

    public /* synthetic */ gb(ec ecVar, String str, int i7) {
        this.a = i7;
        this.b = ecVar;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                String str = this.c;
                ec ecVar = this.b;
                sb sbVar = (sb) ecVar.g.get(str);
                if (sbVar != null) {
                    rb rbVar = sbVar.s;
                    if (rbVar != null) {
                        rb rbVar2 = new rb(ecVar, rbVar.a);
                        sbVar.s = rbVar2;
                        ecVar.o.add(rbVar2);
                    }
                    ecVar.T(false);
                    break;
                }
                break;
            case 1:
                sb sbVar2 = (sb) this.b.g.get(this.c);
                if (sbVar2 != null) {
                    sbVar2.c(null, null);
                    break;
                }
                break;
            case 2:
                this.b.w.remove(this.c);
                break;
            case 3:
                String str2 = this.c;
                String B = ec.B(str2, "jpg");
                String str3 = Utilities.a(str2) + "." + B;
                File file = new File(w7.z(4), str3);
                if (!file.exists()) {
                    fc g10 = fc.g(str2);
                    ec ecVar2 = this.b;
                    sb sbVar3 = new sb(ecVar2);
                    sbVar3.m = 1;
                    sbVar3.d = Utilities.a(str2);
                    sbVar3.f = null;
                    sbVar3.i = g10;
                    sbVar3.g = B;
                    sbVar3.j = null;
                    int i7 = g10.p;
                    if (i7 != 0) {
                        sbVar3.l = i7;
                    }
                    sbVar3.e = str3;
                    ecVar2.g.put(str3, sbVar3);
                    sbVar3.q = new File(w7.z(4), p5.c.v(Utilities.a(g10.g), "_temp.jpg"));
                    sbVar3.p = file;
                    rb rbVar3 = new rb(ecVar2, sbVar3);
                    sbVar3.s = rbVar3;
                    ecVar2.o.add(rbVar3);
                    ecVar2.T(false);
                    break;
                }
                break;
            default:
                String str4 = this.c;
                ec ecVar3 = this.b;
                sb sbVar4 = (sb) ecVar3.g.get(str4);
                if (sbVar4 != null) {
                    zb zbVar = sbVar4.t;
                    if (zbVar != null) {
                        zb zbVar2 = new zb(ecVar3, zbVar.a, zbVar.c);
                        sbVar4.t = zbVar2;
                        ecVar3.n.add(zbVar2);
                    }
                    ecVar3.V(false);
                    break;
                }
                break;
        }
    }
}
