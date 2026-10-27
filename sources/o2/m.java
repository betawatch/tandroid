package o2;

import a8.ed;
import a8.yb;
import b2.x;
import com.google.android.gms.internal.cast.w4;
import e2.n0;
import java.util.ArrayList;
import java.util.Iterator;
import u2.d1;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class m implements d1 {
    public final int a;
    public final q b;
    public int c = -1;

    public m(q qVar, int i10) {
        this.b = qVar;
        this.a = i10;
    }

    public final void a() {
        yb.g(this.c == -1);
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

    public final boolean b() {
        int i10 = this.c;
        return (i10 == -1 || i10 == -3 || i10 == -2) ? false : true;
    }

    @Override // u2.d1
    public final void d() {
        int i10 = this.c;
        q qVar = this.b;
        if (i10 == -2) {
            qVar.e();
            throw new w4(a1.g.p("Unable to bind a sample queue to TrackGroup with MIME type ", qVar.Y.a(this.a).d[0].s, "."));
        }
        if (i10 == -1) {
            qVar.C();
        } else if (i10 != -3) {
            qVar.C();
            qVar.L[i10].C();
        }
    }

    @Override // u2.d1
    public final boolean e() {
        if (this.c == -3) {
            return true;
        }
        if (!b()) {
            return false;
        }
        int i10 = this.c;
        q qVar = this.b;
        return !qVar.y() && qVar.L[i10].A(qVar.j0);
    }

    @Override // u2.d1
    public final int f(n4.s sVar, h2.h hVar, int i10) {
        x xVar;
        if (this.c == -3) {
            hVar.addFlag(4);
            return -4;
        }
        if (b()) {
            int i11 = this.c;
            q qVar = this.b;
            ArrayList arrayList = qVar.y;
            if (!qVar.y()) {
                int i12 = 0;
                if (!arrayList.isEmpty()) {
                    int i13 = 0;
                    loop0: while (i13 < arrayList.size() - 1) {
                        int i14 = ((j) arrayList.get(i13)).v;
                        int length = qVar.L.length;
                        for (int i15 = 0; i15 < length; i15++) {
                            if (qVar.d0[i15] && qVar.L[i15].E() == i14) {
                                break loop0;
                            }
                        }
                        i13++;
                    }
                    n0.X(0, i13, arrayList);
                    j jVar = (j) arrayList.get(0);
                    x xVar2 = jVar.d;
                    if (!xVar2.equals(qVar.W)) {
                        qVar.v.l(qVar.b, xVar2, jVar.e, jVar.f, jVar.h);
                    }
                    qVar.W = xVar2;
                }
                if (arrayList.isEmpty() || ((j) arrayList.get(0)).g()) {
                    int F = qVar.L[i11].F(sVar, hVar, i10, qVar.j0);
                    if (F == -5) {
                        x xVar3 = (x) sVar.c;
                        xVar3.getClass();
                        if (i11 == qVar.R) {
                            int b10 = ed.b(qVar.L[i11].E());
                            while (i12 < arrayList.size() && ((j) arrayList.get(i12)).v != b10) {
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
                        sVar.c = xVar3;
                    }
                    return F;
                }
            }
        }
        return -3;
    }

    @Override // u2.d1
    public final int j(long j10) {
        Object next;
        Object obj;
        if (!b()) {
            return 0;
        }
        int i10 = this.c;
        q qVar = this.b;
        if (qVar.y()) {
            return 0;
        }
        p pVar = qVar.L[i10];
        int x9 = pVar.x(j10, qVar.j0);
        ArrayList arrayList = qVar.y;
        if (arrayList != null) {
            if (!arrayList.isEmpty()) {
                obj = ic.a.g(1, arrayList);
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
            x9 = Math.min(x9, jVar.f(i10) - pVar.v());
        }
        pVar.L(x9);
        return x9;
    }
}
