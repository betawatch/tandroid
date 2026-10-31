package o2;

import b2.x;
import com.google.android.gms.internal.cast.x4;
import e2.l0;
import java.util.ArrayList;
import java.util.Iterator;
import u2.d1;
import v7.c8;
import v7.t6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class m implements d1 {
    public final int a;
    public final q b;
    public int c = -1;

    public m(q qVar, int i10) {
        this.b = qVar;
        this.a = i10;
    }

    @Override // u2.d1
    public final void a() {
        int i10 = this.c;
        q qVar = this.b;
        if (i10 == -2) {
            qVar.e();
            throw new x4(a1.g.n("Unable to bind a sample queue to TrackGroup with MIME type ", qVar.Y.a(this.a).d[0].s, "."));
        }
        if (i10 == -1) {
            qVar.C();
        } else if (i10 != -3) {
            qVar.C();
            qVar.L[i10].C();
        }
    }

    public final void b() {
        t6.f(this.c == -1);
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

    public final boolean c() {
        int i10 = this.c;
        return (i10 == -1 || i10 == -3 || i10 == -2) ? false : true;
    }

    @Override // u2.d1
    public final boolean e() {
        if (this.c == -3) {
            return true;
        }
        if (!c()) {
            return false;
        }
        int i10 = this.c;
        q qVar = this.b;
        return !qVar.A() && qVar.L[i10].A(qVar.j0);
    }

    @Override // u2.d1
    public final int i(long j10) {
        Object next;
        Object obj;
        if (!c()) {
            return 0;
        }
        int i10 = this.c;
        q qVar = this.b;
        if (qVar.A()) {
            return 0;
        }
        p pVar = qVar.L[i10];
        int x10 = pVar.x(j10, qVar.j0);
        ArrayList arrayList = qVar.D;
        if (arrayList != null) {
            if (!arrayList.isEmpty()) {
                obj = i0.a.g(1, arrayList);
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
            x10 = Math.min(x10, jVar.f(i10) - pVar.v());
        }
        pVar.L(x10);
        return x10;
    }

    @Override // u2.d1
    public final int r(hf.b bVar, h2.h hVar, int i10) {
        x xVar;
        if (this.c == -3) {
            hVar.addFlag(4);
            return -4;
        }
        if (c()) {
            int i11 = this.c;
            q qVar = this.b;
            ArrayList arrayList = qVar.D;
            if (!qVar.A()) {
                int i12 = 0;
                if (!arrayList.isEmpty()) {
                    int i13 = 0;
                    loop0: while (i13 < arrayList.size() - 1) {
                        int i14 = ((j) arrayList.get(i13)).w;
                        int length = qVar.L.length;
                        for (int i15 = 0; i15 < length; i15++) {
                            if (qVar.d0[i15] && qVar.L[i15].E() == i14) {
                                break loop0;
                            }
                        }
                        i13++;
                    }
                    l0.X(0, i13, arrayList);
                    j jVar = (j) arrayList.get(0);
                    x xVar2 = jVar.d;
                    if (!xVar2.equals(qVar.W)) {
                        qVar.w.l(qVar.b, xVar2, jVar.e, jVar.f, jVar.h);
                    }
                    qVar.W = xVar2;
                }
                if (arrayList.isEmpty() || ((j) arrayList.get(0)).g()) {
                    int F = qVar.L[i11].F(bVar, hVar, i10, qVar.j0);
                    if (F == -5) {
                        x xVar3 = (x) bVar.c;
                        xVar3.getClass();
                        if (i11 == qVar.R) {
                            int b10 = c8.b(qVar.L[i11].E());
                            while (i12 < arrayList.size() && ((j) arrayList.get(i12)).w != b10) {
                                i12++;
                            }
                            if (i12 < arrayList.size()) {
                                xVar = ((j) arrayList.get(i12)).d;
                            } else {
                                xVar = qVar.V;
                                xVar.getClass();
                            }
                            xVar3 = xVar3.d(xVar);
                        }
                        bVar.c = xVar3;
                    }
                    return F;
                }
            }
        }
        return -3;
    }
}
