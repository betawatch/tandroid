package o2;

import com.google.android.gms.internal.cast.b5;
import e2.d0;
import java.util.ArrayList;
import java.util.Iterator;
import n4.y;
import u2.b1;
import v7.x7;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class m implements b1 {
    public final int a;
    public final q b;
    public int c = -1;

    public m(q qVar, int i10) {
        this.b = qVar;
        this.a = i10;
    }

    public final void a() {
        e2.d.b(this.c == -1);
        q qVar = this.b;
        qVar.e();
        qVar.a0.getClass();
        int[] iArr = qVar.a0;
        int i10 = this.a;
        int i11 = iArr[i10];
        if (i11 == -1) {
            if (qVar.Z.contains(qVar.Y.a(i10))) {
                i11 = -3;
            }
            i11 = -2;
        } else {
            boolean[] zArr = qVar.d0;
            if (!zArr[i11]) {
                zArr[i11] = true;
            }
            i11 = -2;
        }
        this.c = i11;
    }

    @Override // u2.b1
    public final void b() {
        int i10 = this.c;
        q qVar = this.b;
        if (i10 == -2) {
            qVar.e();
            throw new b5(a4.a.p("Unable to bind a sample queue to TrackGroup with MIME type ", qVar.Y.a(this.a).d[0].r, "."));
        }
        if (i10 == -1) {
            qVar.D();
        } else if (i10 != -3) {
            qVar.D();
            qVar.L[i10].z();
        }
    }

    public final boolean c() {
        int i10 = this.c;
        return (i10 == -1 || i10 == -3 || i10 == -2) ? false : true;
    }

    @Override // u2.b1
    public final boolean e() {
        if (this.c == -3) {
            return true;
        }
        if (!c()) {
            return false;
        }
        int i10 = this.c;
        q qVar = this.b;
        return !qVar.B() && qVar.L[i10].x(qVar.j0);
    }

    @Override // u2.b1
    public final int f(y yVar, h2.g gVar, int i10) {
        b2.s sVar;
        if (this.c == -3) {
            gVar.a(4);
            return -4;
        }
        if (c()) {
            int i11 = this.c;
            q qVar = this.b;
            ArrayList arrayList = qVar.y;
            if (!qVar.B()) {
                int i12 = 0;
                if (!arrayList.isEmpty()) {
                    int i13 = 0;
                    loop0: while (i13 < arrayList.size() - 1) {
                        int i14 = ((j) arrayList.get(i13)).v;
                        int length = qVar.L.length;
                        for (int i15 = 0; i15 < length; i15++) {
                            if (qVar.d0[i15] && qVar.L[i15].B() == i14) {
                                break loop0;
                            }
                        }
                        i13++;
                    }
                    d0.V(0, i13, arrayList);
                    j jVar = (j) arrayList.get(0);
                    b2.s sVar2 = jVar.d;
                    if (!sVar2.equals(qVar.W)) {
                        qVar.v.j(qVar.b, sVar2, jVar.e, jVar.f, jVar.h);
                    }
                    qVar.W = sVar2;
                }
                if (arrayList.isEmpty() || ((j) arrayList.get(0)).g()) {
                    int C = qVar.L[i11].C(yVar, gVar, i10, qVar.j0);
                    if (C == -5) {
                        b2.s sVar3 = (b2.s) yVar.c;
                        sVar3.getClass();
                        if (i11 == qVar.R) {
                            int b10 = x7.b(qVar.L[i11].B());
                            while (i12 < arrayList.size() && ((j) arrayList.get(i12)).v != b10) {
                                i12++;
                            }
                            if (i12 < arrayList.size()) {
                                sVar = ((j) arrayList.get(i12)).d;
                            } else {
                                sVar = qVar.V;
                                sVar.getClass();
                            }
                            sVar3 = sVar3.d(sVar);
                        }
                        yVar.c = sVar3;
                    }
                    return C;
                }
            }
        }
        return -3;
    }

    @Override // u2.b1
    public final int m(long j3) {
        Object next;
        Object obj;
        if (!c()) {
            return 0;
        }
        int i10 = this.c;
        q qVar = this.b;
        if (qVar.B()) {
            return 0;
        }
        p pVar = qVar.L[i10];
        int v = pVar.v(j3, qVar.j0);
        ArrayList arrayList = qVar.y;
        if (arrayList != null) {
            if (!arrayList.isEmpty()) {
                obj = i2.g.h(1, arrayList);
            }
            obj = null;
        } else {
            Iterator it = arrayList.iterator();
            if (it.hasNext()) {
                do {
                    next = it.next();
                } while (it.hasNext());
                obj = next;
            }
            obj = null;
        }
        j jVar = (j) obj;
        if (jVar != null && !jVar.g()) {
            v = Math.min(v, jVar.f(i10) - pVar.t());
        }
        pVar.H(v);
        return v;
    }
}
