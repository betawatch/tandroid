// default package

import android.net.Uri;
import android.os.SystemClock;
import java.io.IOException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class kb3 implements la6 {
    public final Uri a;
    public final HashSet b;
    public final rx6 c;
    public final h73 d;
    public fh5 e;
    public long f;
    public long h;
    public long n;
    public long r;
    public boolean s;
    public IOException w;
    public boolean x;
    public final /* synthetic */ mb3 y;

    public kb3(mb3 mb3Var, Uri uri, String str) {
        this.y = mb3Var;
        this.a = uri;
        HashSet hashSet = new HashSet();
        this.b = hashSet;
        hashSet.add(str);
        this.c = new rx6("DefaultHlsPlaylistTracker:MediaPlaylist");
        this.d = ((f73) mb3Var.a.b).createDataSource();
    }

    @Override // la6
    public final void R0(oa6 oa6Var, long j, long j2, int i) {
        jy7 jy7Var = (jy7) oa6Var;
        ia6 ia6Var = new ia6(jy7Var.a, jy7Var.b, j);
        if (i != 0) {
            b2b b2bVar = jy7Var.d;
            ia6Var.d = b2bVar.c;
            ia6Var.e = b2bVar.d;
            ia6Var.f = j2;
            ia6Var.g = b2bVar.b;
        }
        this.y.f.v(new ja6(ia6Var), jy7Var.c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i);
    }

    public final Uri a() {
        fh5 fh5Var = this.e;
        Uri uri = this.a;
        if (fh5Var != null) {
            eh5 eh5Var = fh5Var.v;
            if (eh5Var.a != -9223372036854775807L || eh5Var.e) {
                Uri.Builder buildUpon = uri.buildUpon();
                fh5 fh5Var2 = this.e;
                if (fh5Var2.v.e) {
                    buildUpon.appendQueryParameter("_HLS_msn", String.valueOf(fh5Var2.k + fh5Var2.r.size()));
                    fh5 fh5Var3 = this.e;
                    if (fh5Var3.n != -9223372036854775807L) {
                        po5 po5Var = fh5Var3.s;
                        int size = po5Var.size();
                        if (!po5Var.isEmpty() && ((ah5) dqe.b(po5Var)).y) {
                            size--;
                        }
                        buildUpon.appendQueryParameter("_HLS_part", String.valueOf(size));
                    }
                }
                eh5 eh5Var2 = this.e.v;
                if (eh5Var2.a != -9223372036854775807L) {
                    buildUpon.appendQueryParameter("_HLS_skip", eh5Var2.b ? "v2" : "YES");
                }
                return buildUpon.build();
            }
        }
        return uri;
    }

    public final void b(Uri uri) {
        mb3 mb3Var = this.y;
        iy7 a = mb3Var.b.a(mb3Var.w, this.e);
        Map map = Collections.EMPTY_MAP;
        yve.l(uri, "The uri must be set.");
        lyc lycVar = new lyc(this.d, new n73(uri, 1, null, map, 0L, -1L, null, 1), a);
        ug5 ug5Var = mb3Var.y;
        String str = null;
        if (ug5Var != null && ug5Var.k) {
            lb3 lb3Var = (lb3) mb3Var.d.get(this.a);
            HashSet hashSet = this.b;
            if (lb3Var != null) {
                String str2 = lb3Var.a.d;
                if (hashSet.contains(str2)) {
                    str = str2;
                }
            }
            str = (String) dqe.a(hashSet, null);
        }
        lycVar.e = str;
        jy7 jy7Var = new jy7(lycVar);
        this.c.w0(jy7Var, this, mb3Var.c.v3(jy7Var.c));
    }

    public final void c(Uri uri) {
        this.r = 0L;
        if (this.s) {
            return;
        }
        rx6 rx6Var = this.c;
        if (rx6Var.Z() || rx6Var.U()) {
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.n;
        if (elapsedRealtime >= j) {
            b(uri);
        } else {
            this.s = true;
            this.y.n.postDelayed(new bv2((Object) this, (Object) uri, (byte) 27), j - elapsedRealtime);
        }
    }

    @Override // la6
    public final ma6 c2(oa6 oa6Var, long j, long j2, IOException iOException, int i) {
        jy7 jy7Var = (jy7) oa6Var;
        ma6 ma6Var = rx6.y;
        long j3 = jy7Var.a;
        byte b = jy7Var.c;
        ia6 ia6Var = new ia6(j3, jy7Var.b, j);
        b2b b2bVar = jy7Var.d;
        ia6Var.d = b2bVar.c;
        ia6Var.e = b2bVar.d;
        ia6Var.f = j2;
        ia6Var.g = b2bVar.b;
        ja6 ja6Var = new ja6(ia6Var);
        boolean z = b2bVar.c.getQueryParameter("_HLS_msn") != null;
        boolean z2 = iOException instanceof lh5;
        Uri uri = this.a;
        mb3 mb3Var = this.y;
        if (z || z2) {
            int i2 = iOException instanceof ni5 ? ((ni5) iOException).c : ConnectionsManager.DEFAULT_DATACENTER_ID;
            if (z2 || i2 == 400 || i2 == 503) {
                this.n = SystemClock.elapsedRealtime();
                c(uri);
                lp lpVar = mb3Var.f;
                String str = gcc.a;
                lpVar.s(ja6Var, b, iOException, true);
                return ma6Var;
            }
        }
        ed edVar = new ed((Object) iOException, i, (byte) 8);
        Iterator it = mb3Var.e.iterator();
        boolean z3 = false;
        while (it.hasNext()) {
            z3 |= !((oh5) it.next()).b(uri, edVar, false);
        }
        z6f z6fVar = mb3Var.c;
        if (z3) {
            z6fVar.getClass();
            long w3 = z6f.w3(edVar);
            ma6Var = w3 != -9223372036854775807L ? new ma6(0, w3) : rx6.E;
        }
        boolean a = ma6Var.a();
        mb3Var.f.s(ja6Var, b, iOException, !a);
        if (!a) {
            z6fVar.getClass();
        }
        return ma6Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0123  */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v3, types: [android.net.Uri, java.io.IOException] */
    /* JADX WARN: Type inference failed for: r1v38 */
    /* JADX WARN: Type inference failed for: r1v39 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(fh5 fh5Var, ja6 ja6Var) {
        boolean z;
        boolean z2;
        long j;
        po5 po5Var;
        long j2;
        long j3;
        int i;
        fh5 fh5Var2;
        ?? r1;
        wk2 wk2Var;
        boolean z3;
        eh5 eh5Var;
        int size;
        int size2;
        int size3;
        boolean z4 = fh5Var.o;
        po5 po5Var2 = fh5Var.r;
        long j4 = fh5Var.k;
        fh5 fh5Var3 = this.e;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.f = elapsedRealtime;
        mb3 mb3Var = this.y;
        CopyOnWriteArrayList copyOnWriteArrayList = mb3Var.e;
        if (fh5Var3 != null) {
            long j5 = fh5Var3.k;
            if (j4 <= j5 && (j4 < j5 || ((size = po5Var2.size() - fh5Var3.r.size()) == 0 ? !((size2 = fh5Var.s.size()) > (size3 = fh5Var3.s.size()) || (size2 == size3 && z4 && !fh5Var3.o)) : size <= 0))) {
                z = false;
                po5 po5Var3 = fh5Var.r;
                long j6 = 0;
                if (!z) {
                    z2 = true;
                    if (fh5Var.p) {
                        j = fh5Var.h;
                        po5Var = po5Var2;
                    } else {
                        fh5 fh5Var4 = mb3Var.J;
                        j = fh5Var4 != null ? fh5Var4.h : 0L;
                        po5Var = po5Var2;
                        if (fh5Var3 != null) {
                            long j7 = fh5Var3.h;
                            long j8 = fh5Var3.k;
                            po5 po5Var4 = fh5Var3.r;
                            int size4 = po5Var4.size();
                            j2 = j4;
                            int i2 = (int) (j2 - j8);
                            ch5 ch5Var = i2 < po5Var4.size() ? (ch5) po5Var4.get(i2) : null;
                            if (ch5Var != null) {
                                j3 = ch5Var.e;
                            } else {
                                if (size4 == j2 - j8) {
                                    j3 = fh5Var3.u;
                                }
                                long j9 = j;
                                if (fh5Var.i) {
                                    i = fh5Var.j;
                                } else {
                                    fh5 fh5Var5 = mb3Var.J;
                                    i = fh5Var5 != null ? fh5Var5.j : 0;
                                    if (fh5Var3 != null) {
                                        int i3 = (int) (j2 - fh5Var3.k);
                                        po5 po5Var5 = fh5Var3.r;
                                        ch5 ch5Var2 = i3 < po5Var5.size() ? (ch5) po5Var5.get(i3) : null;
                                        if (ch5Var2 != null) {
                                            i = (fh5Var3.j + ch5Var2.d) - ((ch5) po5Var3.get(0)).d;
                                        }
                                    }
                                }
                                r1 = 0;
                                fh5Var2 = new fh5(fh5Var.d, fh5Var.a, fh5Var.b, fh5Var.e, fh5Var.g, j9, true, i, fh5Var.k, fh5Var.l, fh5Var.m, fh5Var.n, fh5Var.c, fh5Var.o, fh5Var.p, fh5Var.q, po5Var3, fh5Var.s, fh5Var.v, fh5Var.t, fh5Var.w, fh5Var.x);
                            }
                            j = j7 + j3;
                            long j92 = j;
                            if (fh5Var.i) {
                            }
                            r1 = 0;
                            fh5Var2 = new fh5(fh5Var.d, fh5Var.a, fh5Var.b, fh5Var.e, fh5Var.g, j92, true, i, fh5Var.k, fh5Var.l, fh5Var.m, fh5Var.n, fh5Var.c, fh5Var.o, fh5Var.p, fh5Var.q, po5Var3, fh5Var.s, fh5Var.v, fh5Var.t, fh5Var.w, fh5Var.x);
                        }
                    }
                    j2 = j4;
                    long j922 = j;
                    if (fh5Var.i) {
                    }
                    r1 = 0;
                    fh5Var2 = new fh5(fh5Var.d, fh5Var.a, fh5Var.b, fh5Var.e, fh5Var.g, j922, true, i, fh5Var.k, fh5Var.l, fh5Var.m, fh5Var.n, fh5Var.c, fh5Var.o, fh5Var.p, fh5Var.q, po5Var3, fh5Var.s, fh5Var.v, fh5Var.t, fh5Var.w, fh5Var.x);
                } else if (!z4) {
                    z2 = true;
                    po5Var = po5Var2;
                    j2 = j4;
                    fh5Var2 = fh5Var3;
                    r1 = 0;
                } else if (fh5Var3.o) {
                    po5Var = po5Var2;
                    j2 = j4;
                    fh5Var2 = fh5Var3;
                    r1 = 0;
                    z2 = true;
                } else {
                    z2 = true;
                    po5Var = po5Var2;
                    fh5Var2 = new fh5(fh5Var3.d, fh5Var3.a, fh5Var3.b, fh5Var3.e, fh5Var3.g, fh5Var3.h, fh5Var3.i, fh5Var3.j, fh5Var3.k, fh5Var3.l, fh5Var3.m, fh5Var3.n, fh5Var3.c, true, fh5Var3.p, fh5Var3.q, fh5Var3.r, fh5Var3.s, fh5Var3.v, fh5Var3.t, fh5Var3.w, fh5Var3.x);
                    r1 = 0;
                    j2 = j4;
                }
                this.e = fh5Var2;
                Uri uri = this.a;
                if (fh5Var2 == fh5Var3) {
                    this.w = r1;
                    this.h = elapsedRealtime;
                    if (uri.equals(mb3Var.K)) {
                        mb3Var.I = uri;
                        mb3Var.K = r1;
                    }
                    if (uri.equals(mb3Var.I)) {
                        if (mb3Var.J == null) {
                            mb3Var.L = !fh5Var2.o;
                            mb3Var.M = fh5Var2.h;
                        }
                        mb3Var.J = fh5Var2;
                        mb3Var.r.v(fh5Var2);
                    }
                    Iterator it = copyOnWriteArrayList.iterator();
                    while (it.hasNext()) {
                        ((oh5) it.next()).a();
                    }
                } else if (!fh5Var2.o) {
                    long size5 = j2 + po5Var.size();
                    fh5 fh5Var6 = this.e;
                    if (size5 < fh5Var6.k) {
                        wk2Var = new wk2();
                        z3 = z2;
                    } else {
                        wk2Var = ((double) (elapsedRealtime - this.h)) > ((double) gcc.i0(fh5Var6.m)) * 3.5d ? new wk2() : r1;
                        z3 = false;
                    }
                    if (wk2Var != null) {
                        this.w = wk2Var;
                        ed edVar = new ed((Object) wk2Var, z2 ? 1 : 0, (byte) 8);
                        Iterator it2 = copyOnWriteArrayList.iterator();
                        while (it2.hasNext()) {
                            ((oh5) it2.next()).b(uri, edVar, z3);
                        }
                    }
                }
                fh5 fh5Var7 = this.e;
                eh5Var = fh5Var7.v;
                long j10 = fh5Var7.m;
                if (!eh5Var.e) {
                    if (fh5Var7 == fh5Var3) {
                        long j11 = fh5Var7.n;
                        if (j11 != -9223372036854775807L) {
                            j6 = j11 / 2;
                        } else {
                            j10 /= 2;
                        }
                    }
                    this.n = (gcc.i0(j6) + elapsedRealtime) - ja6Var.f;
                    if (this.e.o) {
                        return;
                    }
                    if (uri.equals(mb3Var.I) || this.x) {
                        c(a());
                        return;
                    }
                    return;
                }
                if (fh5Var7 == fh5Var3) {
                    j10 /= 2;
                }
                j6 = j10;
                this.n = (gcc.i0(j6) + elapsedRealtime) - ja6Var.f;
                if (this.e.o) {
                }
            }
        }
        z = true;
        po5 po5Var32 = fh5Var.r;
        long j62 = 0;
        if (!z) {
        }
        this.e = fh5Var2;
        Uri uri2 = this.a;
        if (fh5Var2 == fh5Var3) {
        }
        fh5 fh5Var72 = this.e;
        eh5Var = fh5Var72.v;
        long j102 = fh5Var72.m;
        if (!eh5Var.e) {
        }
        j62 = j102;
        this.n = (gcc.i0(j62) + elapsedRealtime) - ja6Var.f;
        if (this.e.o) {
        }
    }

    @Override // la6
    public final void f(oa6 oa6Var, long j, long j2, boolean z) {
        jy7 jy7Var = (jy7) oa6Var;
        ia6 ia6Var = new ia6(jy7Var.a, jy7Var.b, j);
        b2b b2bVar = jy7Var.d;
        ia6Var.d = b2bVar.c;
        ia6Var.e = b2bVar.d;
        ia6Var.f = j2;
        ia6Var.g = b2bVar.b;
        ja6 ja6Var = new ja6(ia6Var);
        mb3 mb3Var = this.y;
        mb3Var.c.getClass();
        mb3Var.f.o(ja6Var, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    @Override // la6
    public final void f0(oa6 oa6Var, long j, long j2) {
        jy7 jy7Var = (jy7) oa6Var;
        kh5 kh5Var = (kh5) jy7Var.f;
        ia6 ia6Var = new ia6(jy7Var.a, jy7Var.b, j);
        b2b b2bVar = jy7Var.d;
        ia6Var.d = b2bVar.c;
        ia6Var.e = b2bVar.d;
        ia6Var.f = j2;
        ia6Var.g = b2bVar.b;
        ja6 ja6Var = new ja6(ia6Var);
        if (kh5Var instanceof fh5) {
            d((fh5) kh5Var, ja6Var);
            this.y.f.p(ja6Var, 4);
        } else {
            hy7 b = hy7.b("Loaded playlist has unexpected type.", null);
            this.w = b;
            this.y.f.s(ja6Var, 4, b, true);
        }
        this.y.c.getClass();
    }
}
