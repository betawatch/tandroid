package o4;

import com.google.android.gms.internal.cast.z4;
import d5.f0;
import h3.t0;
import h3.u0;
import j3.r0;
import j4.b1;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class n implements b1 {
    public final int a;
    public final r b;
    public int c = -1;

    public n(r rVar, int i9) {
        this.b = rVar;
        this.a = i9;
    }

    @Override // j4.b1
    public final void a() {
        int i9 = this.c;
        r rVar = this.b;
        if (i9 == -2) {
            rVar.f();
            throw new z4(aa.d.o("Unable to bind a sample queue to TrackGroup with mime type ", rVar.U.a(this.a).d[0].B, "."));
        }
        if (i9 == -1) {
            rVar.D();
        } else if (i9 != -3) {
            rVar.D();
            rVar.H[i9].w();
        }
    }

    public final void b() {
        d5.a.f(this.c == -1);
        r rVar = this.b;
        rVar.f();
        rVar.W.getClass();
        int[] iArr = rVar.W;
        int i9 = this.a;
        int i10 = iArr[i9];
        if (i10 == -1) {
            if (rVar.V.contains(rVar.U.a(i9))) {
                i10 = -3;
            }
            i10 = -2;
        } else {
            boolean[] zArr = rVar.Z;
            if (!zArr[i10]) {
                zArr[i10] = true;
            }
            i10 = -2;
        }
        this.c = i10;
    }

    public final boolean c() {
        int i9 = this.c;
        return (i9 == -1 || i9 == -3 || i9 == -2) ? false : true;
    }

    @Override // j4.b1
    public final boolean f() {
        if (this.c == -3) {
            return true;
        }
        if (!c()) {
            return false;
        }
        int i9 = this.c;
        r rVar = this.b;
        return !rVar.A() && rVar.H[i9].u(rVar.f0);
    }

    @Override // j4.b1
    public final int j(long j10) {
        Object next;
        Object obj;
        if (!c()) {
            return 0;
        }
        int i9 = this.c;
        r rVar = this.b;
        if (rVar.A()) {
            return 0;
        }
        q qVar = rVar.H[i9];
        int s10 = qVar.s(j10, rVar.f0);
        ArrayList arrayList = rVar.y;
        if (arrayList != null) {
            if (!arrayList.isEmpty()) {
                obj = r0.j(1, arrayList);
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
        k kVar = (k) obj;
        if (kVar != null && !kVar.W) {
            s10 = Math.min(s10, kVar.f(i9) - qVar.q());
        }
        qVar.E(s10);
        return s10;
    }

    @Override // j4.b1
    public final int l(u0 u0Var, k3.i iVar, int i9) {
        t0 t0Var;
        if (this.c == -3) {
            iVar.addFlag(4);
            return -4;
        }
        if (c()) {
            int i10 = this.c;
            r rVar = this.b;
            ArrayList arrayList = rVar.y;
            if (!rVar.A()) {
                int i11 = 0;
                if (!arrayList.isEmpty()) {
                    int i12 = 0;
                    loop0: while (i12 < arrayList.size() - 1) {
                        int i13 = ((k) arrayList.get(i12)).v;
                        int length = rVar.H.length;
                        for (int i14 = 0; i14 < length; i14++) {
                            if (rVar.Z[i14] && rVar.H[i14].y() == i13) {
                                break loop0;
                            }
                        }
                        i12++;
                    }
                    f0.N(0, i12, arrayList);
                    k kVar = (k) arrayList.get(0);
                    t0 t0Var2 = kVar.d;
                    if (!t0Var2.equals(rVar.S)) {
                        rVar.v.b(rVar.b, t0Var2, kVar.e, kVar.f, kVar.h);
                    }
                    rVar.S = t0Var2;
                }
                if (arrayList.isEmpty() || ((k) arrayList.get(0)).W) {
                    int z10 = rVar.H[i10].z(u0Var, iVar, i9, rVar.f0);
                    if (z10 == -5) {
                        t0 t0Var3 = u0Var.b;
                        t0Var3.getClass();
                        if (i10 == rVar.N) {
                            int y10 = rVar.H[i10].y();
                            while (i11 < arrayList.size() && ((k) arrayList.get(i11)).v != y10) {
                                i11++;
                            }
                            if (i11 < arrayList.size()) {
                                t0Var = ((k) arrayList.get(i11)).d;
                            } else {
                                t0Var = rVar.R;
                                t0Var.getClass();
                            }
                            t0Var3 = t0Var3.c(t0Var);
                        }
                        u0Var.b = t0Var3;
                    }
                    return z10;
                }
            }
        }
        return -3;
    }
}
