package k3;

import android.content.Context;
import android.media.DeniedByServerException;
import android.media.MediaCodec;
import android.media.MediaDrm;
import android.media.NotProvisionedException;
import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackErrorEvent;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.PlaybackStateEvent;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.util.Pair;
import android.util.SparseArray;
import b4.e0;
import d4.l;
import d4.p;
import g5.c0;
import g5.w0;
import g5.z;
import h5.d0;
import h5.u;
import i5.y;
import j3.a2;
import j3.m0;
import j3.m2;
import j3.n;
import j3.n0;
import j3.n2;
import j3.o2;
import j3.p2;
import j3.q2;
import j3.r1;
import j3.t1;
import j3.y0;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.UUID;
import l3.s;
import o4.r;
import o4.v;
import s8.t;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class i implements b {
    public e0 B;
    public e0 C;
    public e0 D;
    public n0 E;
    public n0 F;
    public n0 G;
    public boolean H;
    public int I;
    public boolean J;
    public int K;
    public int L;
    public int M;
    public boolean N;
    public final Context a;
    public final h b;
    public final PlaybackSession c;
    public String r;
    public PlaybackMetrics.Builder s;
    public int v;
    public t1 y;
    public final n2 e = new n2();
    public final m2 f = new m2();
    public final HashMap n = new HashMap();
    public final HashMap h = new HashMap();
    public final long d = SystemClock.elapsedRealtime();
    public int w = 0;
    public int x = 0;

    public i(Context context, PlaybackSession playbackSession) {
        this.a = context.getApplicationContext();
        this.c = playbackSession;
        h hVar = new h();
        this.b = hVar;
        hVar.d = this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0435  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0437  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x044d  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x044f  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x045f  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x048e  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x04b8  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x04e7  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0500  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0523  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x052b  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0543  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0596  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x05be  */
    /* JADX WARN: Removed duplicated region for block: B:189:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0545  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0530  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x04e9  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x04eb  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x04ee  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x04f0  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x04f2  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x04f4  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x04f6  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x04f8  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x04fb  */
    @Override // k3.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(a2 a2Var, f7.b bVar) {
        int i10;
        boolean z4;
        c5.e eVar;
        c5.e eVar2;
        c5.e eVar3;
        int i11;
        e0 e0Var;
        int i12;
        int i13;
        int i14;
        n0 n0Var;
        o3.h hVar;
        int i15;
        if (((h5.g) bVar.b).a.size() == 0) {
            return;
        }
        for (int i16 = 0; i16 < ((h5.g) bVar.b).a.size(); i16++) {
            int a2 = ((h5.g) bVar.b).a(i16);
            a aVar = (a) ((SparseArray) bVar.c).get(a2);
            aVar.getClass();
            if (a2 == 0) {
                h hVar2 = this.b;
                synchronized (hVar2) {
                    try {
                        hVar2.d.getClass();
                        o2 o2Var = hVar2.e;
                        hVar2.e = aVar.b;
                        Iterator it = hVar2.c.values().iterator();
                        while (it.hasNext()) {
                            g gVar = (g) it.next();
                            if (gVar.b(o2Var, hVar2.e) && !gVar.a(aVar)) {
                            }
                            it.remove();
                            if (gVar.e) {
                                if (gVar.a.equals(hVar2.f)) {
                                    hVar2.a(gVar);
                                }
                                hVar2.d.m(aVar, gVar.a);
                            }
                        }
                        hVar2.e(aVar);
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } else if (a2 == 11) {
                this.b.g(aVar, this.v);
            } else {
                this.b.f(aVar);
            }
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (bVar.n(0)) {
            a aVar2 = (a) ((SparseArray) bVar.c).get(0);
            aVar2.getClass();
            if (this.s != null) {
                k(aVar2.b, aVar2.d);
            }
        }
        if (bVar.n(2) && this.s != null) {
            t listIterator = a2Var.t().a.listIterator(0);
            loop2: while (true) {
                if (!listIterator.hasNext()) {
                    hVar = null;
                    break;
                }
                p2 p2Var = (p2) listIterator.next();
                for (int i17 = 0; i17 < p2Var.a; i17++) {
                    if (p2Var.e[i17] && (hVar = p2Var.b.d[i17].F) != null) {
                        break loop2;
                    }
                }
            }
            if (hVar != null) {
                PlaybackMetrics.Builder builder = this.s;
                int i18 = d0.a;
                int i19 = 0;
                while (true) {
                    if (i19 >= hVar.d) {
                        i15 = 1;
                        break;
                    }
                    UUID uuid = hVar.a[i19].b;
                    if (uuid.equals(j3.h.d)) {
                        i15 = 3;
                        break;
                    } else if (uuid.equals(j3.h.e)) {
                        i15 = 2;
                        break;
                    } else {
                        if (uuid.equals(j3.h.c)) {
                            i15 = 6;
                            break;
                        }
                        i19++;
                    }
                }
                builder.setDrmType(i15);
            }
        }
        if (bVar.n(1011)) {
            this.M++;
        }
        t1 t1Var = this.y;
        if (t1Var == null) {
            i11 = 1;
        } else {
            int i20 = t1Var.a;
            Context context = this.a;
            boolean z10 = this.I == 4;
            if (i20 == 1001) {
                eVar = new c5.e(20, 0);
            } else {
                if (t1Var instanceof n) {
                    n nVar = (n) t1Var;
                    z4 = nVar.c == 1;
                    i10 = nVar.h;
                } else {
                    i10 = 0;
                    z4 = false;
                }
                Throwable cause = t1Var.getCause();
                cause.getClass();
                int i21 = 27;
                if (cause instanceof IOException) {
                    if (cause instanceof g5.e0) {
                        eVar3 = new c5.e(5, ((g5.e0) cause).d);
                    } else {
                        if ((cause instanceof g5.d0) || (cause instanceof r1)) {
                            eVar = new c5.e(z10 ? 10 : 11, 0);
                        } else {
                            boolean z11 = cause instanceof c0;
                            if (z11 || (cause instanceof w0)) {
                                if (u.d(context).f() == 1) {
                                    eVar = new c5.e(3, 0);
                                } else {
                                    Throwable cause2 = cause.getCause();
                                    eVar = cause2 instanceof UnknownHostException ? new c5.e(6, 0) : cause2 instanceof SocketTimeoutException ? new c5.e(7, 0) : (z11 && ((c0) cause).c == 1) ? new c5.e(4, 0) : new c5.e(8, 0);
                                }
                            } else if (i20 == 1002) {
                                eVar = new c5.e(21, 0);
                            } else if (cause instanceof o3.i) {
                                Throwable cause3 = cause.getCause();
                                cause3.getClass();
                                int i22 = d0.a;
                                if (i22 < 21 || !(cause3 instanceof MediaDrm.MediaDrmStateException)) {
                                    eVar = (i22 < 23 || !e.b(cause3)) ? (i22 < 18 || !(cause3 instanceof NotProvisionedException)) ? (i22 < 18 || !(cause3 instanceof DeniedByServerException)) ? cause3 instanceof o3.d0 ? new c5.e(23, 0) : cause3 instanceof o3.d ? new c5.e(28, 0) : new c5.e(30, 0) : new c5.e(29, 0) : new c5.e(24, 0) : new c5.e(27, 0);
                                } else {
                                    int s6 = d0.s(((MediaDrm.MediaDrmStateException) cause3).getDiagnosticInfo());
                                    switch (d0.r(s6)) {
                                        case 6002:
                                            i21 = 24;
                                            break;
                                        case 6003:
                                            i21 = 28;
                                            break;
                                        case 6004:
                                            i21 = 25;
                                            break;
                                        case 6005:
                                            i21 = 26;
                                            break;
                                    }
                                    eVar3 = new c5.e(i21, s6);
                                }
                            } else if ((cause instanceof z) && (cause.getCause() instanceof FileNotFoundException)) {
                                Throwable cause4 = cause.getCause();
                                cause4.getClass();
                                Throwable cause5 = cause4.getCause();
                                eVar = (d0.a >= 21 && (cause5 instanceof ErrnoException) && ((ErrnoException) cause5).errno == OsConstants.EACCES) ? new c5.e(32, 0) : new c5.e(31, 0);
                            } else {
                                eVar = new c5.e(9, 0);
                            }
                        }
                        this.c.reportPlaybackErrorEvent(new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(elapsedRealtime - this.d).setErrorCode(eVar.a).setSubErrorCode(eVar.b).setException(t1Var).build());
                        i11 = 1;
                        this.N = true;
                        this.y = null;
                    }
                    eVar = eVar3;
                } else {
                    if (z4 && (i10 == 0 || i10 == 1)) {
                        eVar = new c5.e(35, 0);
                    } else if (z4 && i10 == 3) {
                        eVar = new c5.e(15, 0);
                    } else if (z4 && i10 == 2) {
                        eVar = new c5.e(23, 0);
                    } else {
                        if (cause instanceof p) {
                            eVar2 = new c5.e(13, d0.s(((p) cause).d));
                        } else {
                            if (cause instanceof l) {
                                eVar = new c5.e(14, d0.s(((l) cause).a));
                            } else if (cause instanceof OutOfMemoryError) {
                                eVar = new c5.e(14, 0);
                            } else if (cause instanceof s) {
                                eVar2 = new c5.e(17, ((s) cause).a);
                            } else if (cause instanceof l3.u) {
                                eVar2 = new c5.e(18, ((l3.u) cause).a);
                            } else if (d0.a < 16 || !(cause instanceof MediaCodec.CryptoException)) {
                                eVar = new c5.e(22, 0);
                            } else {
                                int errorCode = ((MediaCodec.CryptoException) cause).getErrorCode();
                                switch (d0.r(errorCode)) {
                                    case 6002:
                                        i21 = 24;
                                        break;
                                    case 6003:
                                        i21 = 28;
                                        break;
                                    case 6004:
                                        i21 = 25;
                                        break;
                                    case 6005:
                                        i21 = 26;
                                        break;
                                }
                                eVar2 = new c5.e(i21, errorCode);
                            }
                            this.c.reportPlaybackErrorEvent(new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(elapsedRealtime - this.d).setErrorCode(eVar.a).setSubErrorCode(eVar.b).setException(t1Var).build());
                            i11 = 1;
                            this.N = true;
                            this.y = null;
                        }
                        eVar = eVar2;
                        this.c.reportPlaybackErrorEvent(new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(elapsedRealtime - this.d).setErrorCode(eVar.a).setSubErrorCode(eVar.b).setException(t1Var).build());
                        i11 = 1;
                        this.N = true;
                        this.y = null;
                    }
                    this.c.reportPlaybackErrorEvent(new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(elapsedRealtime - this.d).setErrorCode(eVar.a).setSubErrorCode(eVar.b).setException(t1Var).build());
                    i11 = 1;
                    this.N = true;
                    this.y = null;
                }
            }
            this.c.reportPlaybackErrorEvent(new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(elapsedRealtime - this.d).setErrorCode(eVar.a).setSubErrorCode(eVar.b).setException(t1Var).build());
            i11 = 1;
            this.N = true;
            this.y = null;
        }
        if (bVar.n(2)) {
            q2 t6 = a2Var.t();
            boolean a10 = t6.a(2);
            boolean a11 = t6.a(i11);
            boolean a12 = t6.a(3);
            if (a10 || a11 || a12) {
                if (a10) {
                    n0Var = null;
                } else {
                    n0Var = null;
                    if (!d0.a(this.E, null)) {
                        int i23 = this.E == null ? 1 : 0;
                        this.E = null;
                        i12 = 4;
                        n(1, elapsedRealtime, null, i23);
                        if (!a11 && !d0.a(this.F, n0Var)) {
                            int i24 = this.F != null ? 1 : 0;
                            this.F = n0Var;
                            n(0, elapsedRealtime, n0Var, i24);
                        }
                        if (!a12 && !d0.a(this.G, n0Var)) {
                            int i25 = this.G != null ? 1 : 0;
                            this.G = n0Var;
                            n(2, elapsedRealtime, n0Var, i25);
                        }
                        e0Var = n0Var;
                        if (i(this.B)) {
                            e0 e0Var2 = this.B;
                            n0 n0Var2 = (n0) e0Var2.c;
                            if (n0Var2.I != -1) {
                                int i26 = e0Var2.b;
                                if (!d0.a(this.E, n0Var2)) {
                                    int i27 = (this.E == null && i26 == 0) ? 1 : i26;
                                    this.E = n0Var2;
                                    n(1, elapsedRealtime, n0Var2, i27);
                                }
                                this.B = e0Var;
                            }
                        }
                        if (i(this.C)) {
                            e0 e0Var3 = this.C;
                            n0 n0Var3 = (n0) e0Var3.c;
                            int i28 = e0Var3.b;
                            if (!d0.a(this.F, n0Var3)) {
                                int i29 = (this.F == null && i28 == 0) ? 1 : i28;
                                this.F = n0Var3;
                                n(0, elapsedRealtime, n0Var3, i29);
                            }
                            this.C = e0Var;
                        }
                        if (i(this.D)) {
                            e0 e0Var4 = this.D;
                            n0 n0Var4 = (n0) e0Var4.c;
                            int i30 = e0Var4.b;
                            if (!d0.a(this.G, n0Var4)) {
                                int i31 = (this.G == null && i30 == 0) ? 1 : i30;
                                this.G = n0Var4;
                                n(2, elapsedRealtime, n0Var4, i31);
                            }
                            this.D = e0Var;
                        }
                        switch (u.d(this.a).f()) {
                            case 0:
                                i13 = 0;
                                break;
                            case 1:
                                i13 = 9;
                                break;
                            case 2:
                                i13 = 2;
                                break;
                            case 3:
                                i13 = 4;
                                break;
                            case 4:
                                i13 = 5;
                                break;
                            case 5:
                                i13 = 6;
                                break;
                            case 6:
                            case 8:
                            default:
                                i13 = 1;
                                break;
                            case 7:
                                i13 = 3;
                                break;
                            case 9:
                                i13 = 8;
                                break;
                            case 10:
                                i13 = 7;
                                break;
                        }
                        if (i13 != this.x) {
                            this.x = i13;
                            this.c.reportNetworkEvent(new NetworkEvent.Builder().setNetworkType(i13).setTimeSinceCreatedMillis(elapsedRealtime - this.d).build());
                        }
                        if (a2Var.c() != 2) {
                            this.H = false;
                        }
                        if (a2Var.v() == null) {
                            this.J = false;
                        } else if (bVar.n(10)) {
                            this.J = true;
                        }
                        int c3 = a2Var.c();
                        if (this.H) {
                            i14 = 5;
                        } else if (this.J) {
                            i14 = 13;
                        } else if (c3 == i12) {
                            i14 = 11;
                        } else if (c3 == 2) {
                            int i32 = this.w;
                            i14 = (i32 == 0 || i32 == 2) ? 2 : !a2Var.j() ? 7 : a2Var.y() != 0 ? 10 : 6;
                        } else {
                            i14 = c3 == 3 ? !a2Var.j() ? 4 : a2Var.y() != 0 ? 9 : 3 : (c3 != 1 || this.w == 0) ? this.w : 12;
                        }
                        if (this.w != i14) {
                            this.w = i14;
                            this.N = true;
                            this.c.reportPlaybackStateEvent(new PlaybackStateEvent.Builder().setState(this.w).setTimeSinceCreatedMillis(elapsedRealtime - this.d).build());
                        }
                        if (bVar.n(1028)) {
                            h hVar3 = this.b;
                            a aVar3 = (a) ((SparseArray) bVar.c).get(1028);
                            aVar3.getClass();
                            hVar3.b(aVar3);
                            return;
                        }
                        return;
                    }
                }
                i12 = 4;
                if (!a11) {
                    if (this.F != null) {
                    }
                    this.F = n0Var;
                    n(0, elapsedRealtime, n0Var, i24);
                }
                if (!a12) {
                    if (this.G != null) {
                    }
                    this.G = n0Var;
                    n(2, elapsedRealtime, n0Var, i25);
                }
                e0Var = n0Var;
                if (i(this.B)) {
                }
                if (i(this.C)) {
                }
                if (i(this.D)) {
                }
                switch (u.d(this.a).f()) {
                }
                if (i13 != this.x) {
                }
                if (a2Var.c() != 2) {
                }
                if (a2Var.v() == null) {
                }
                int c32 = a2Var.c();
                if (this.H) {
                }
                if (this.w != i14) {
                }
                if (bVar.n(1028)) {
                }
            }
        }
        e0Var = 0;
        i12 = 4;
        if (i(this.B)) {
        }
        if (i(this.C)) {
        }
        if (i(this.D)) {
        }
        switch (u.d(this.a).f()) {
        }
        if (i13 != this.x) {
        }
        if (a2Var.c() != 2) {
        }
        if (a2Var.v() == null) {
        }
        int c322 = a2Var.c();
        if (this.H) {
        }
        if (this.w != i14) {
        }
        if (bVar.n(1028)) {
        }
    }

    @Override // k3.b
    public final void b(t1 t1Var) {
        this.y = t1Var;
    }

    @Override // k3.b
    public final void c(a aVar, r rVar) {
        v vVar = aVar.d;
        if (vVar == null) {
            return;
        }
        n0 n0Var = rVar.c;
        n0Var.getClass();
        int i10 = rVar.d;
        o2 o2Var = aVar.b;
        vVar.getClass();
        e0 e0Var = new e0(n0Var, i10, this.b.d(o2Var, vVar), 11);
        int i11 = rVar.b;
        if (i11 != 0) {
            if (i11 == 1) {
                this.C = e0Var;
                return;
            } else if (i11 != 2) {
                if (i11 != 3) {
                    return;
                }
                this.D = e0Var;
                return;
            }
        }
        this.B = e0Var;
    }

    @Override // k3.b
    public final void d(n3.f fVar) {
        this.K += fVar.g;
        this.L += fVar.e;
    }

    @Override // k3.b
    public final void e(a aVar, int i10, long j10) {
        v vVar = aVar.d;
        if (vVar != null) {
            String d = this.b.d(aVar.b, vVar);
            HashMap hashMap = this.n;
            Long l10 = (Long) hashMap.get(d);
            HashMap hashMap2 = this.h;
            Long l11 = (Long) hashMap2.get(d);
            hashMap.put(d, Long.valueOf((l10 == null ? 0L : l10.longValue()) + j10));
            hashMap2.put(d, Long.valueOf((l11 != null ? l11.longValue() : 0L) + i10));
        }
    }

    @Override // k3.b
    public final void f(r rVar) {
        this.I = rVar.a;
    }

    @Override // k3.b
    public final void g(y yVar) {
        e0 e0Var = this.B;
        if (e0Var != null) {
            n0 n0Var = (n0) e0Var.c;
            if (n0Var.I == -1) {
                m0 a2 = n0Var.a();
                a2.t = yVar.a;
                a2.u = yVar.b;
                this.B = new e0(new n0(a2), e0Var.b, (String) e0Var.d, 11);
            }
        }
    }

    @Override // k3.b
    public final void h(a aVar, int i10) {
        if (i10 == 1) {
            this.H = true;
        }
        this.v = i10;
    }

    public final boolean i(e0 e0Var) {
        String str;
        if (e0Var == null) {
            return false;
        }
        String str2 = (String) e0Var.d;
        h hVar = this.b;
        synchronized (hVar) {
            str = hVar.f;
        }
        return str2.equals(str);
    }

    public final void j() {
        PlaybackMetrics.Builder builder = this.s;
        if (builder != null && this.N) {
            builder.setAudioUnderrunCount(this.M);
            this.s.setVideoFramesDropped(this.K);
            this.s.setVideoFramesPlayed(this.L);
            Long l10 = (Long) this.h.get(this.r);
            this.s.setNetworkTransferDurationMillis(l10 == null ? 0L : l10.longValue());
            Long l11 = (Long) this.n.get(this.r);
            this.s.setNetworkBytesRead(l11 == null ? 0L : l11.longValue());
            this.s.setStreamSource((l11 == null || l11.longValue() <= 0) ? 0 : 1);
            this.c.reportPlaybackMetrics(this.s.build());
        }
        this.s = null;
        this.r = null;
        this.M = 0;
        this.K = 0;
        this.L = 0;
        this.E = null;
        this.F = null;
        this.G = null;
        this.N = false;
    }

    public final void k(o2 o2Var, v vVar) {
        int b10;
        PlaybackMetrics.Builder builder = this.s;
        if (vVar == null || (b10 = o2Var.b(vVar.a)) == -1) {
            return;
        }
        m2 m2Var = this.f;
        int i10 = 0;
        o2Var.f(b10, m2Var, false);
        int i11 = m2Var.c;
        n2 n2Var = this.e;
        o2Var.n(i11, n2Var);
        y0 y0Var = n2Var.c.b;
        if (y0Var != null) {
            int C = d0.C(y0Var.a, y0Var.b);
            i10 = C != 0 ? C != 1 ? C != 2 ? 1 : 4 : 5 : 3;
        }
        builder.setStreamType(i10);
        if (n2Var.y != -9223372036854775807L && !n2Var.w && !n2Var.r && !n2Var.a()) {
            builder.setMediaDurationMillis(d0.S(n2Var.y));
        }
        builder.setPlaybackType(n2Var.a() ? 2 : 1);
        this.N = true;
    }

    public final void l(a aVar, String str) {
        v vVar = aVar.d;
        if (vVar == null || !vVar.a()) {
            j();
            this.r = str;
            this.s = new PlaybackMetrics.Builder().setPlayerName("ExoPlayerLib").setPlayerVersion("2.19.1");
            k(aVar.b, vVar);
        }
    }

    public final void m(a aVar, String str) {
        v vVar = aVar.d;
        if ((vVar == null || !vVar.a()) && str.equals(this.r)) {
            j();
        }
        this.h.remove(str);
        this.n.remove(str);
    }

    public final void n(int i10, long j10, n0 n0Var, int i11) {
        int i12;
        TrackChangeEvent.Builder timeSinceCreatedMillis = new TrackChangeEvent.Builder(i10).setTimeSinceCreatedMillis(j10 - this.d);
        if (n0Var != null) {
            timeSinceCreatedMillis.setTrackState(1);
            if (i11 != 1) {
                i12 = 3;
                if (i11 != 2) {
                    i12 = i11 != 3 ? 1 : 4;
                }
            } else {
                i12 = 2;
            }
            timeSinceCreatedMillis.setTrackChangeReason(i12);
            String str = n0Var.B;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = n0Var.C;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = n0Var.r;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i13 = n0Var.n;
            if (i13 != -1) {
                timeSinceCreatedMillis.setBitrate(i13);
            }
            int i14 = n0Var.H;
            if (i14 != -1) {
                timeSinceCreatedMillis.setWidth(i14);
            }
            int i15 = n0Var.I;
            if (i15 != -1) {
                timeSinceCreatedMillis.setHeight(i15);
            }
            int i16 = n0Var.P;
            if (i16 != -1) {
                timeSinceCreatedMillis.setChannelCount(i16);
            }
            int i17 = n0Var.Q;
            if (i17 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i17);
            }
            String str4 = n0Var.c;
            if (str4 != null) {
                int i18 = d0.a;
                String[] split = str4.split("-", -1);
                Pair create = Pair.create(split[0], split.length >= 2 ? split[1] : null);
                timeSinceCreatedMillis.setLanguage((String) create.first);
                Object obj = create.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f10 = n0Var.J;
            if (f10 != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f10);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.N = true;
        this.c.reportTrackChangeEvent(timeSinceCreatedMillis.build());
    }

    @Override // k3.b
    public final /* synthetic */ void onRenderedFirstFrame(a aVar) {
    }

    @Override // k3.b
    public final /* synthetic */ void onSeekStarted(a aVar) {
    }
}
