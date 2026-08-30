package o3;

import android.media.ResourceBusyException;
import android.media.UnsupportedSchemeException;
import android.os.Handler;
import android.os.Looper;
import androidx.biometric.f0;
import h5.d0;
import j3.n0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import m.j0;
import n7.qa;
import nh.n4;
import s8.i0;
import s8.u0;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class e implements o {
    public int B;
    public v C;
    public b D;
    public b E;
    public Looper F;
    public Handler G;
    public byte[] H;
    public k3.k I;
    public volatile androidx.mediarouter.app.d J;
    public final UUID a;
    public final j0 b;
    public final cb.m c;
    public final HashMap d;
    public final boolean e;
    public final int[] f;
    public final boolean h;
    public final qa n;
    public final ab.a r;
    public final a3.c s;
    public final long v;
    public final ArrayList w;
    public final Set x;
    public final Set y;

    public e(UUID uuid, cb.m mVar, HashMap hashMap, boolean z4, int[] iArr, boolean z10, ab.a aVar) {
        uuid.getClass();
        h5.a.e("Use C.CLEARKEY_UUID instead", !j3.h.b.equals(uuid));
        this.a = uuid;
        this.b = z.d;
        this.c = mVar;
        this.d = hashMap;
        this.e = z4;
        this.f = iArr;
        this.h = z10;
        this.r = aVar;
        this.n = new qa();
        this.s = new a3.c(this, 28);
        this.w = new ArrayList();
        this.x = Collections.newSetFromMap(new IdentityHashMap());
        this.y = Collections.newSetFromMap(new IdentityHashMap());
        this.v = 300000L;
    }

    public static boolean e(b bVar) {
        bVar.o();
        if (bVar.o != 1) {
            return false;
        }
        if (d0.a >= 19) {
            h g10 = bVar.g();
            g10.getClass();
            if (!(g10.getCause() instanceof ResourceBusyException)) {
                return false;
            }
        }
        return true;
    }

    public static ArrayList i(g gVar, UUID uuid, boolean z4) {
        ArrayList arrayList = new ArrayList(gVar.d);
        for (int i10 = 0; i10 < gVar.d; i10++) {
            f fVar = gVar.a[i10];
            if ((fVar.a(uuid) || (j3.h.c.equals(uuid) && fVar.a(j3.h.b))) && (fVar.e != null || z4)) {
                arrayList.add(fVar);
            }
        }
        return arrayList;
    }

    @Override // o3.o
    public final i J(l lVar, n0 n0Var) {
        k(false);
        h5.a.i(this.B > 0);
        h5.a.j(this.F);
        return d(this.F, lVar, n0Var, true);
    }

    @Override // o3.o
    public final void a() {
        v uVar;
        k(true);
        int i10 = this.B;
        this.B = i10 + 1;
        if (i10 != 0) {
            return;
        }
        if (this.C == null) {
            UUID uuid = this.a;
            this.b.getClass();
            try {
                try {
                    uVar = new z(uuid);
                } catch (c0 unused) {
                    h5.a.o("FrameworkMediaDrm", "Failed to instantiate a FrameworkMediaDrm for uuid: " + uuid + ".");
                    uVar = new h7.u(13);
                }
                this.C = uVar;
                uVar.B(new f0(this, 24));
                return;
            } catch (UnsupportedSchemeException e) {
                throw new c0(e);
            } catch (Exception e6) {
                throw new c0(e6);
            }
        }
        if (this.v == -9223372036854775807L) {
            return;
        }
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.w;
            if (i11 >= arrayList.size()) {
                return;
            }
            ((b) arrayList.get(i11)).d(null);
            i11++;
        }
    }

    @Override // o3.o
    public final int b(n0 n0Var) {
        k(false);
        v vVar = this.C;
        vVar.getClass();
        int b22 = vVar.b2();
        g gVar = n0Var.F;
        if (gVar == null) {
            int g10 = h5.o.g(n0Var.C);
            int i10 = 0;
            while (true) {
                int[] iArr = this.f;
                if (i10 >= iArr.length) {
                    i10 = -1;
                    break;
                }
                if (iArr[i10] == g10) {
                    break;
                }
                i10++;
            }
            if (i10 == -1) {
                return 0;
            }
        } else if (this.H == null) {
            UUID uuid = this.a;
            if (i(gVar, uuid, true).isEmpty()) {
                if (gVar.d == 1 && gVar.a[0].a(j3.h.b)) {
                    h5.a.K("DefaultDrmSessionMgr", "DrmInitData only contains common PSSH SchemeData. Assuming support for: " + uuid);
                }
                return 1;
            }
            String str = gVar.c;
            if (str != null && !"cenc".equals(str) && (!"cbcs".equals(str) ? "cbc1".equals(str) || "cens".equals(str) : d0.a < 25)) {
                return 1;
            }
        }
        return b22;
    }

    @Override // o3.o
    public final n c(l lVar, n0 n0Var) {
        h5.a.i(this.B > 0);
        h5.a.j(this.F);
        d dVar = new d(this, lVar);
        Handler handler = this.G;
        handler.getClass();
        handler.post(new n4(21, dVar, n0Var));
        return dVar;
    }

    public final i d(Looper looper, l lVar, n0 n0Var, boolean z4) {
        ArrayList arrayList;
        if (this.J == null) {
            this.J = new androidx.mediarouter.app.d(this, looper, 8);
        }
        g gVar = n0Var.F;
        int i10 = 0;
        b bVar = null;
        if (gVar == null) {
            int g10 = h5.o.g(n0Var.C);
            v vVar = this.C;
            vVar.getClass();
            if (vVar.b2() != 2 || !w.d) {
                int[] iArr = this.f;
                while (true) {
                    if (i10 >= iArr.length) {
                        i10 = -1;
                        break;
                    }
                    if (iArr[i10] == g10) {
                        break;
                    }
                    i10++;
                }
                if (i10 != -1 && vVar.b2() != 1) {
                    b bVar2 = this.D;
                    if (bVar2 == null) {
                        s8.t tVar = s8.v.b;
                        b g11 = g(i0.e, true, null, z4);
                        this.w.add(g11);
                        this.D = g11;
                    } else {
                        bVar2.d(null);
                    }
                    return this.D;
                }
            }
            return null;
        }
        if (this.H == null) {
            arrayList = i(gVar, this.a, false);
            if (arrayList.isEmpty()) {
                c cVar = new c("Media does not support uuid: " + this.a);
                h5.a.p("DefaultDrmSessionMgr", "DRM error", cVar);
                if (lVar != null) {
                    lVar.d(cVar);
                }
                return new s(new h(cVar, 6003));
            }
        } else {
            arrayList = null;
        }
        if (this.e) {
            ArrayList arrayList2 = this.w;
            int size = arrayList2.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size) {
                    break;
                }
                Object obj = arrayList2.get(i11);
                i11++;
                b bVar3 = (b) obj;
                if (d0.a(bVar3.a, arrayList)) {
                    bVar = bVar3;
                    break;
                }
            }
        } else {
            bVar = this.E;
        }
        if (bVar != null) {
            bVar.d(lVar);
            return bVar;
        }
        b g12 = g(arrayList, false, lVar, z4);
        if (!this.e) {
            this.E = g12;
        }
        this.w.add(g12);
        return g12;
    }

    public final b f(List list, boolean z4, l lVar) {
        this.C.getClass();
        boolean z10 = this.h | z4;
        v vVar = this.C;
        byte[] bArr = this.H;
        Looper looper = this.F;
        looper.getClass();
        k3.k kVar = this.I;
        kVar.getClass();
        b bVar = new b(this.a, vVar, this.n, this.s, list, z10, z4, bArr, this.d, this.c, looper, this.r, kVar);
        bVar.d(lVar);
        if (this.v != -9223372036854775807L) {
            bVar.d(null);
        }
        return bVar;
    }

    public final b g(List list, boolean z4, l lVar, boolean z10) {
        b f10 = f(list, z4, lVar);
        boolean e = e(f10);
        long j10 = this.v;
        Set set = this.y;
        if (e && !set.isEmpty()) {
            u0 it = s8.z.u(set).iterator();
            while (it.hasNext()) {
                ((i) it.next()).c(null);
            }
            f10.c(lVar);
            if (j10 != -9223372036854775807L) {
                f10.c(null);
            }
            f10 = f(list, z4, lVar);
        }
        if (e(f10) && z10) {
            Set set2 = this.x;
            if (!set2.isEmpty()) {
                u0 it2 = s8.z.u(set2).iterator();
                while (it2.hasNext()) {
                    ((d) it2.next()).release();
                }
                if (!set.isEmpty()) {
                    u0 it3 = s8.z.u(set).iterator();
                    while (it3.hasNext()) {
                        ((i) it3.next()).c(null);
                    }
                }
                f10.c(lVar);
                if (j10 != -9223372036854775807L) {
                    f10.c(null);
                }
                return f(list, z4, lVar);
            }
        }
        return f10;
    }

    @Override // o3.o
    public final void h(Looper looper, k3.k kVar) {
        synchronized (this) {
            try {
                Looper looper2 = this.F;
                if (looper2 == null) {
                    this.F = looper;
                    this.G = new Handler(looper);
                } else {
                    h5.a.i(looper2 == looper);
                    this.G.getClass();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.I = kVar;
    }

    public final void j() {
        if (this.C != null && this.B == 0 && this.w.isEmpty() && this.x.isEmpty()) {
            v vVar = this.C;
            vVar.getClass();
            vVar.release();
            this.C = null;
        }
    }

    public final void k(boolean z4) {
        if (z4 && this.F == null) {
            h5.a.L("DefaultDrmSessionMgr", "DefaultDrmSessionManager accessed before setPlayer(), possibly on the wrong thread.", new IllegalStateException());
            return;
        }
        Thread currentThread = Thread.currentThread();
        Looper looper = this.F;
        looper.getClass();
        if (currentThread != looper.getThread()) {
            h5.a.L("DefaultDrmSessionMgr", "DefaultDrmSessionManager accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + this.F.getThread().getName(), new IllegalStateException());
        }
    }

    @Override // o3.o
    public final void release() {
        k(true);
        int i10 = this.B - 1;
        this.B = i10;
        if (i10 != 0) {
            return;
        }
        if (this.v != -9223372036854775807L) {
            ArrayList arrayList = new ArrayList(this.w);
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                ((b) arrayList.get(i11)).c(null);
            }
        }
        u0 it = s8.z.u(this.x).iterator();
        while (it.hasNext()) {
            ((d) it.next()).release();
        }
        j();
    }
}
