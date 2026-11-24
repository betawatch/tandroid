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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class dc3 implements ga6 {
    public final Uri a;
    public final HashSet b;
    public final mx6 c;
    public final a83 d;
    public ch5 e;
    public long f;
    public long h;
    public long n;
    public long r;
    public boolean s;
    public IOException w;
    public boolean x;
    public final /* synthetic */ fc3 y;

    public dc3(fc3 fc3Var, Uri uri, String str) {
        this.y = fc3Var;
        this.a = uri;
        HashSet hashSet = new HashSet();
        this.b = hashSet;
        hashSet.add(str);
        this.c = new mx6("DefaultHlsPlaylistTracker:MediaPlaylist");
        this.d = ((y73) fc3Var.a.b).createDataSource();
    }

    @Override // ga6
    public final void W0(ja6 ja6Var, long j, long j2, int i) {
        dx7 dx7Var = (dx7) ja6Var;
        da6 da6Var = new da6(dx7Var.a, dx7Var.b, j);
        if (i != 0) {
            c0b c0bVar = dx7Var.d;
            da6Var.d = c0bVar.c;
            da6Var.e = c0bVar.d;
            da6Var.f = j2;
            da6Var.g = c0bVar.b;
        }
        this.y.f.u(new ea6(da6Var), dx7Var.c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i);
    }

    public final Uri a() {
        ch5 ch5Var = this.e;
        Uri uri = this.a;
        if (ch5Var != null) {
            bh5 bh5Var = ch5Var.v;
            if (bh5Var.a != -9223372036854775807L || bh5Var.e) {
                Uri.Builder buildUpon = uri.buildUpon();
                ch5 ch5Var2 = this.e;
                if (ch5Var2.v.e) {
                    buildUpon.appendQueryParameter("_HLS_msn", String.valueOf(ch5Var2.k + ch5Var2.r.size()));
                    ch5 ch5Var3 = this.e;
                    if (ch5Var3.n != -9223372036854775807L) {
                        mo5 mo5Var = ch5Var3.s;
                        int size = mo5Var.size();
                        if (!mo5Var.isEmpty() && ((xg5) lne.b(mo5Var)).y) {
                            size--;
                        }
                        buildUpon.appendQueryParameter("_HLS_part", String.valueOf(size));
                    }
                }
                bh5 bh5Var2 = this.e.v;
                if (bh5Var2.a != -9223372036854775807L) {
                    buildUpon.appendQueryParameter("_HLS_skip", bh5Var2.b ? "v2" : "YES");
                }
                return buildUpon.build();
            }
        }
        return uri;
    }

    public final void b(Uri uri) {
        fc3 fc3Var = this.y;
        cx7 a = fc3Var.b.a(fc3Var.w, this.e);
        Map map = Collections.EMPTY_MAP;
        jte.l(uri, "The uri must be set.");
        xvc xvcVar = new xvc(this.d, new g83(uri, 1, null, map, 0L, -1L, null, 1), a);
        rg5 rg5Var = fc3Var.y;
        String str = null;
        if (rg5Var != null && rg5Var.k) {
            ec3 ec3Var = (ec3) fc3Var.d.get(this.a);
            HashSet hashSet = this.b;
            if (ec3Var != null) {
                String str2 = ec3Var.a.d;
                if (hashSet.contains(str2)) {
                    str = str2;
                }
            }
            str = (String) lne.a(hashSet, null);
        }
        xvcVar.e = str;
        dx7 dx7Var = new dx7(xvcVar);
        this.c.v0(dx7Var, this, fc3Var.c.v3(dx7Var.c));
    }

    public final void c(Uri uri) {
        this.r = 0L;
        if (this.s) {
            return;
        }
        mx6 mx6Var = this.c;
        if (mx6Var.Y() || mx6Var.U()) {
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.n;
        if (elapsedRealtime >= j) {
            b(uri);
        } else {
            this.s = true;
            this.y.n.postDelayed(new mv2((Object) this, (Object) uri, (byte) 29), j - elapsedRealtime);
        }
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
    public final void d(ch5 ch5Var, ea6 ea6Var) {
        boolean z;
        boolean z2;
        long j;
        mo5 mo5Var;
        long j2;
        long j3;
        int i;
        ch5 ch5Var2;
        ?? r1;
        ol2 ol2Var;
        boolean z3;
        bh5 bh5Var;
        int size;
        int size2;
        int size3;
        boolean z4 = ch5Var.o;
        mo5 mo5Var2 = ch5Var.r;
        long j4 = ch5Var.k;
        ch5 ch5Var3 = this.e;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.f = elapsedRealtime;
        fc3 fc3Var = this.y;
        CopyOnWriteArrayList copyOnWriteArrayList = fc3Var.e;
        if (ch5Var3 != null) {
            long j5 = ch5Var3.k;
            if (j4 <= j5 && (j4 < j5 || ((size = mo5Var2.size() - ch5Var3.r.size()) == 0 ? !((size2 = ch5Var.s.size()) > (size3 = ch5Var3.s.size()) || (size2 == size3 && z4 && !ch5Var3.o)) : size <= 0))) {
                z = false;
                mo5 mo5Var3 = ch5Var.r;
                long j6 = 0;
                if (!z) {
                    z2 = true;
                    if (ch5Var.p) {
                        j = ch5Var.h;
                        mo5Var = mo5Var2;
                    } else {
                        ch5 ch5Var4 = fc3Var.J;
                        j = ch5Var4 != null ? ch5Var4.h : 0L;
                        mo5Var = mo5Var2;
                        if (ch5Var3 != null) {
                            long j7 = ch5Var3.h;
                            long j8 = ch5Var3.k;
                            mo5 mo5Var4 = ch5Var3.r;
                            int size4 = mo5Var4.size();
                            j2 = j4;
                            int i2 = (int) (j2 - j8);
                            zg5 zg5Var = i2 < mo5Var4.size() ? (zg5) mo5Var4.get(i2) : null;
                            if (zg5Var != null) {
                                j3 = zg5Var.e;
                            } else {
                                if (size4 == j2 - j8) {
                                    j3 = ch5Var3.u;
                                }
                                long j9 = j;
                                if (ch5Var.i) {
                                    i = ch5Var.j;
                                } else {
                                    ch5 ch5Var5 = fc3Var.J;
                                    i = ch5Var5 != null ? ch5Var5.j : 0;
                                    if (ch5Var3 != null) {
                                        int i3 = (int) (j2 - ch5Var3.k);
                                        mo5 mo5Var5 = ch5Var3.r;
                                        zg5 zg5Var2 = i3 < mo5Var5.size() ? (zg5) mo5Var5.get(i3) : null;
                                        if (zg5Var2 != null) {
                                            i = (ch5Var3.j + zg5Var2.d) - ((zg5) mo5Var3.get(0)).d;
                                        }
                                    }
                                }
                                r1 = 0;
                                ch5Var2 = new ch5(ch5Var.d, ch5Var.a, ch5Var.b, ch5Var.e, ch5Var.g, j9, true, i, ch5Var.k, ch5Var.l, ch5Var.m, ch5Var.n, ch5Var.c, ch5Var.o, ch5Var.p, ch5Var.q, mo5Var3, ch5Var.s, ch5Var.v, ch5Var.t, ch5Var.w, ch5Var.x);
                            }
                            j = j7 + j3;
                            long j92 = j;
                            if (ch5Var.i) {
                            }
                            r1 = 0;
                            ch5Var2 = new ch5(ch5Var.d, ch5Var.a, ch5Var.b, ch5Var.e, ch5Var.g, j92, true, i, ch5Var.k, ch5Var.l, ch5Var.m, ch5Var.n, ch5Var.c, ch5Var.o, ch5Var.p, ch5Var.q, mo5Var3, ch5Var.s, ch5Var.v, ch5Var.t, ch5Var.w, ch5Var.x);
                        }
                    }
                    j2 = j4;
                    long j922 = j;
                    if (ch5Var.i) {
                    }
                    r1 = 0;
                    ch5Var2 = new ch5(ch5Var.d, ch5Var.a, ch5Var.b, ch5Var.e, ch5Var.g, j922, true, i, ch5Var.k, ch5Var.l, ch5Var.m, ch5Var.n, ch5Var.c, ch5Var.o, ch5Var.p, ch5Var.q, mo5Var3, ch5Var.s, ch5Var.v, ch5Var.t, ch5Var.w, ch5Var.x);
                } else if (!z4) {
                    z2 = true;
                    mo5Var = mo5Var2;
                    j2 = j4;
                    ch5Var2 = ch5Var3;
                    r1 = 0;
                } else if (ch5Var3.o) {
                    mo5Var = mo5Var2;
                    j2 = j4;
                    ch5Var2 = ch5Var3;
                    r1 = 0;
                    z2 = true;
                } else {
                    z2 = true;
                    mo5Var = mo5Var2;
                    ch5Var2 = new ch5(ch5Var3.d, ch5Var3.a, ch5Var3.b, ch5Var3.e, ch5Var3.g, ch5Var3.h, ch5Var3.i, ch5Var3.j, ch5Var3.k, ch5Var3.l, ch5Var3.m, ch5Var3.n, ch5Var3.c, true, ch5Var3.p, ch5Var3.q, ch5Var3.r, ch5Var3.s, ch5Var3.v, ch5Var3.t, ch5Var3.w, ch5Var3.x);
                    r1 = 0;
                    j2 = j4;
                }
                this.e = ch5Var2;
                Uri uri = this.a;
                if (ch5Var2 == ch5Var3) {
                    this.w = r1;
                    this.h = elapsedRealtime;
                    if (uri.equals(fc3Var.K)) {
                        fc3Var.I = uri;
                        fc3Var.K = r1;
                    }
                    if (uri.equals(fc3Var.I)) {
                        if (fc3Var.J == null) {
                            fc3Var.L = !ch5Var2.o;
                            fc3Var.M = ch5Var2.h;
                        }
                        fc3Var.J = ch5Var2;
                        fc3Var.r.v(ch5Var2);
                    }
                    Iterator it = copyOnWriteArrayList.iterator();
                    while (it.hasNext()) {
                        ((lh5) it.next()).a();
                    }
                } else if (!ch5Var2.o) {
                    long size5 = j2 + mo5Var.size();
                    ch5 ch5Var6 = this.e;
                    if (size5 < ch5Var6.k) {
                        ol2Var = new ol2();
                        z3 = z2;
                    } else {
                        ol2Var = ((double) (elapsedRealtime - this.h)) > ((double) hac.i0(ch5Var6.m)) * 3.5d ? new ol2() : r1;
                        z3 = false;
                    }
                    if (ol2Var != null) {
                        this.w = ol2Var;
                        de deVar = new de((Object) ol2Var, z2 ? 1 : 0, (byte) 8);
                        Iterator it2 = copyOnWriteArrayList.iterator();
                        while (it2.hasNext()) {
                            ((lh5) it2.next()).b(uri, deVar, z3);
                        }
                    }
                }
                ch5 ch5Var7 = this.e;
                bh5Var = ch5Var7.v;
                long j10 = ch5Var7.m;
                if (!bh5Var.e) {
                    if (ch5Var7 == ch5Var3) {
                        long j11 = ch5Var7.n;
                        if (j11 != -9223372036854775807L) {
                            j6 = j11 / 2;
                        } else {
                            j10 /= 2;
                        }
                    }
                    this.n = (hac.i0(j6) + elapsedRealtime) - ea6Var.f;
                    if (this.e.o) {
                        return;
                    }
                    if (uri.equals(fc3Var.I) || this.x) {
                        c(a());
                        return;
                    }
                    return;
                }
                if (ch5Var7 == ch5Var3) {
                    j10 /= 2;
                }
                j6 = j10;
                this.n = (hac.i0(j6) + elapsedRealtime) - ea6Var.f;
                if (this.e.o) {
                }
            }
        }
        z = true;
        mo5 mo5Var32 = ch5Var.r;
        long j62 = 0;
        if (!z) {
        }
        this.e = ch5Var2;
        Uri uri2 = this.a;
        if (ch5Var2 == ch5Var3) {
        }
        ch5 ch5Var72 = this.e;
        bh5Var = ch5Var72.v;
        long j102 = ch5Var72.m;
        if (!bh5Var.e) {
        }
        j62 = j102;
        this.n = (hac.i0(j62) + elapsedRealtime) - ea6Var.f;
        if (this.e.o) {
        }
    }

    @Override // ga6
    public final ha6 f2(ja6 ja6Var, long j, long j2, IOException iOException, int i) {
        dx7 dx7Var = (dx7) ja6Var;
        ha6 ha6Var = mx6.y;
        long j3 = dx7Var.a;
        byte b = dx7Var.c;
        da6 da6Var = new da6(j3, dx7Var.b, j);
        c0b c0bVar = dx7Var.d;
        da6Var.d = c0bVar.c;
        da6Var.e = c0bVar.d;
        da6Var.f = j2;
        da6Var.g = c0bVar.b;
        ea6 ea6Var = new ea6(da6Var);
        boolean z = c0bVar.c.getQueryParameter("_HLS_msn") != null;
        boolean z2 = iOException instanceof ih5;
        Uri uri = this.a;
        fc3 fc3Var = this.y;
        if (z || z2) {
            int i2 = iOException instanceof ki5 ? ((ki5) iOException).c : ConnectionsManager.DEFAULT_DATACENTER_ID;
            if (z2 || i2 == 400 || i2 == 503) {
                this.n = SystemClock.elapsedRealtime();
                c(uri);
                kq kqVar = fc3Var.f;
                String str = hac.a;
                kqVar.s(ea6Var, b, iOException, true);
                return ha6Var;
            }
        }
        de deVar = new de((Object) iOException, i, (byte) 8);
        Iterator it = fc3Var.e.iterator();
        boolean z3 = false;
        while (it.hasNext()) {
            z3 |= !((lh5) it.next()).b(uri, deVar, false);
        }
        k4f k4fVar = fc3Var.c;
        if (z3) {
            k4fVar.getClass();
            long w3 = k4f.w3(deVar);
            ha6Var = w3 != -9223372036854775807L ? new ha6(0, w3) : mx6.E;
        }
        boolean a = ha6Var.a();
        fc3Var.f.s(ea6Var, b, iOException, !a);
        if (!a) {
            k4fVar.getClass();
        }
        return ha6Var;
    }

    @Override // ga6
    public final void g0(ja6 ja6Var, long j, long j2) {
        dx7 dx7Var = (dx7) ja6Var;
        hh5 hh5Var = (hh5) dx7Var.f;
        da6 da6Var = new da6(dx7Var.a, dx7Var.b, j);
        c0b c0bVar = dx7Var.d;
        da6Var.d = c0bVar.c;
        da6Var.e = c0bVar.d;
        da6Var.f = j2;
        da6Var.g = c0bVar.b;
        ea6 ea6Var = new ea6(da6Var);
        if (hh5Var instanceof ch5) {
            d((ch5) hh5Var, ea6Var);
            this.y.f.p(ea6Var, 4);
        } else {
            bx7 b = bx7.b("Loaded playlist has unexpected type.", null);
            this.w = b;
            this.y.f.s(ea6Var, 4, b, true);
        }
        this.y.c.getClass();
    }

    @Override // ga6
    public final void w(ja6 ja6Var, long j, long j2, boolean z) {
        dx7 dx7Var = (dx7) ja6Var;
        da6 da6Var = new da6(dx7Var.a, dx7Var.b, j);
        c0b c0bVar = dx7Var.d;
        da6Var.d = c0bVar.c;
        da6Var.e = c0bVar.d;
        da6Var.f = j2;
        da6Var.g = c0bVar.b;
        ea6 ea6Var = new ea6(da6Var);
        fc3 fc3Var = this.y;
        fc3Var.c.getClass();
        fc3Var.f.o(ea6Var, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }
}
