package i3;

import android.content.Context;
import android.media.DeniedByServerException;
import android.media.MediaCodec;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
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
import com.google.android.exoplayer2.upstream.c0;
import com.google.android.exoplayer2.upstream.g0;
import com.google.android.exoplayer2.upstream.h0;
import com.google.android.exoplayer2.upstream.z0;
import d5.f0;
import d5.p;
import d5.w;
import e5.z;
import h3.c1;
import h3.c2;
import h3.n;
import h3.p2;
import h3.q2;
import h3.r2;
import h3.s0;
import h3.s2;
import h3.t0;
import h3.t1;
import h3.t2;
import h3.v1;
import j3.r;
import j4.d0;
import j4.y;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.UUID;
import o8.x;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class j implements b {
    public a6.a A;
    public a6.a B;
    public a6.a C;
    public t0 D;
    public t0 E;
    public t0 F;
    public boolean G;
    public int H;
    public boolean I;
    public int J;
    public int K;
    public int L;
    public boolean M;
    public final Context a;
    public final h b;
    public final PlaybackSession c;
    public String r;
    public PlaybackMetrics.Builder s;
    public int v;
    public v1 y;
    public final q2 e = new q2();
    public final p2 f = new p2();
    public final HashMap n = new HashMap();
    public final HashMap h = new HashMap();
    public final long d = SystemClock.elapsedRealtime();
    public int w = 0;
    public int x = 0;

    public j(Context context, PlaybackSession playbackSession) {
        this.a = context.getApplicationContext();
        this.c = playbackSession;
        h hVar = new h();
        this.b = hVar;
        hVar.d = this;
    }

    @Override // i3.b
    public final void a(v1 v1Var) {
        this.y = v1Var;
    }

    @Override // i3.b
    public final void b(y yVar) {
        this.H = yVar.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0433  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0435  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x044b  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x044d  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x045d  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x048c  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x04b6  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x04e5  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x04fe  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0521  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0529  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0541  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0594  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x05bc  */
    /* JADX WARN: Removed duplicated region for block: B:189:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0543  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x052e  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x04e7  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x04e9  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x04ec  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x04ee  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x04f0  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x04f2  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x04f4  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x04f6  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x04f9  */
    @Override // i3.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(c2 c2Var, g5.b bVar) {
        int i9;
        boolean z10;
        p pVar;
        p pVar2;
        p pVar3;
        int i10;
        a6.a aVar;
        int i11;
        int i12;
        int i13;
        t0 t0Var;
        l3.c cVar;
        int i14;
        if (((d5.g) bVar.b).a.size() == 0) {
            return;
        }
        for (int i15 = 0; i15 < ((d5.g) bVar.b).a.size(); i15++) {
            int a2 = ((d5.g) bVar.b).a(i15);
            a aVar2 = (a) ((SparseArray) bVar.c).get(a2);
            aVar2.getClass();
            if (a2 == 0) {
                h hVar = this.b;
                synchronized (hVar) {
                    try {
                        hVar.d.getClass();
                        r2 r2Var = hVar.e;
                        hVar.e = aVar2.b;
                        Iterator it = hVar.c.values().iterator();
                        while (it.hasNext()) {
                            g gVar = (g) it.next();
                            if (gVar.b(r2Var, hVar.e) && !gVar.a(aVar2)) {
                            }
                            it.remove();
                            if (gVar.e) {
                                if (gVar.a.equals(hVar.f)) {
                                    hVar.f = null;
                                }
                                hVar.d.n(aVar2, gVar.a);
                            }
                        }
                        hVar.d(aVar2);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } else if (a2 == 11) {
                this.b.f(aVar2, this.v);
            } else {
                this.b.e(aVar2);
            }
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (bVar.j(0)) {
            a aVar3 = (a) ((SparseArray) bVar.c).get(0);
            aVar3.getClass();
            if (this.s != null) {
                l(aVar3.b, aVar3.d);
            }
        }
        if (bVar.j(2) && this.s != null) {
            x listIterator = c2Var.u().a.listIterator(0);
            loop2: while (true) {
                if (!listIterator.hasNext()) {
                    cVar = null;
                    break;
                }
                s2 s2Var = (s2) listIterator.next();
                for (int i16 = 0; i16 < s2Var.a; i16++) {
                    if (s2Var.e[i16] && (cVar = s2Var.b.d[i16].E) != null) {
                        break loop2;
                    }
                }
            }
            if (cVar != null) {
                PlaybackMetrics.Builder builder = this.s;
                int i17 = f0.a;
                int i18 = 0;
                while (true) {
                    if (i18 >= cVar.d) {
                        i14 = 1;
                        break;
                    }
                    UUID uuid = cVar.a[i18].b;
                    if (uuid.equals(h3.h.d)) {
                        i14 = 3;
                        break;
                    } else if (uuid.equals(h3.h.e)) {
                        i14 = 2;
                        break;
                    } else {
                        if (uuid.equals(h3.h.c)) {
                            i14 = 6;
                            break;
                        }
                        i18++;
                    }
                }
                builder.setDrmType(i14);
            }
        }
        if (bVar.j(1011)) {
            this.L++;
        }
        v1 v1Var = this.y;
        if (v1Var == null) {
            i10 = 1;
        } else {
            int i19 = v1Var.a;
            Context context = this.a;
            boolean z11 = this.H == 4;
            if (i19 == 1001) {
                pVar = new p(20, 0);
            } else {
                if (v1Var instanceof n) {
                    n nVar = (n) v1Var;
                    z10 = nVar.c == 1;
                    i9 = nVar.h;
                } else {
                    i9 = 0;
                    z10 = false;
                }
                Throwable cause = v1Var.getCause();
                cause.getClass();
                int i20 = 27;
                if (cause instanceof IOException) {
                    if (cause instanceof h0) {
                        pVar3 = new p(5, ((h0) cause).d);
                    } else {
                        if ((cause instanceof g0) || (cause instanceof t1)) {
                            pVar = new p(z11 ? 10 : 11, 0);
                        } else {
                            boolean z12 = cause instanceof com.google.android.exoplayer2.upstream.f0;
                            if (z12 || (cause instanceof z0)) {
                                if (w.f(context).g() == 1) {
                                    pVar = new p(3, 0);
                                } else {
                                    Throwable cause2 = cause.getCause();
                                    pVar = cause2 instanceof UnknownHostException ? new p(6, 0) : cause2 instanceof SocketTimeoutException ? new p(7, 0) : (z12 && ((com.google.android.exoplayer2.upstream.f0) cause).c == 1) ? new p(4, 0) : new p(8, 0);
                                }
                            } else if (i19 == 1002) {
                                pVar = new p(21, 0);
                            } else if (cause instanceof l3.d) {
                                Throwable cause3 = cause.getCause();
                                cause3.getClass();
                                int i21 = f0.a;
                                if (i21 < 21 || !(cause3 instanceof MediaDrm.MediaDrmStateException)) {
                                    pVar = (i21 < 23 || !(cause3 instanceof MediaDrmResetException)) ? (i21 < 18 || !(cause3 instanceof NotProvisionedException)) ? (i21 < 18 || !(cause3 instanceof DeniedByServerException)) ? cause3 instanceof l3.k ? new p(23, 0) : cause3 instanceof l3.a ? new p(28, 0) : new p(30, 0) : new p(29, 0) : new p(24, 0) : new p(27, 0);
                                } else {
                                    int r10 = f0.r(((MediaDrm.MediaDrmStateException) cause3).getDiagnosticInfo());
                                    switch (f0.q(r10)) {
                                        case 6002:
                                            i20 = 24;
                                            break;
                                        case 6003:
                                            i20 = 28;
                                            break;
                                        case 6004:
                                            i20 = 25;
                                            break;
                                        case 6005:
                                            i20 = 26;
                                            break;
                                    }
                                    pVar3 = new p(i20, r10);
                                }
                            } else if ((cause instanceof c0) && (cause.getCause() instanceof FileNotFoundException)) {
                                Throwable cause4 = cause.getCause();
                                cause4.getClass();
                                Throwable cause5 = cause4.getCause();
                                pVar = (f0.a >= 21 && (cause5 instanceof ErrnoException) && ((ErrnoException) cause5).errno == OsConstants.EACCES) ? new p(32, 0) : new p(31, 0);
                            } else {
                                pVar = new p(9, 0);
                            }
                        }
                        this.c.reportPlaybackErrorEvent(new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(elapsedRealtime - this.d).setErrorCode(pVar.a).setSubErrorCode(pVar.b).setException(v1Var).build());
                        i10 = 1;
                        this.M = true;
                        this.y = null;
                    }
                    pVar = pVar3;
                } else {
                    if (z10 && (i9 == 0 || i9 == 1)) {
                        pVar = new p(35, 0);
                    } else if (z10 && i9 == 3) {
                        pVar = new p(15, 0);
                    } else if (z10 && i9 == 2) {
                        pVar = new p(23, 0);
                    } else {
                        if (cause instanceof y3.p) {
                            pVar2 = new p(13, f0.r(((y3.p) cause).d));
                        } else {
                            if (cause instanceof y3.l) {
                                pVar = new p(14, f0.r(((y3.l) cause).a));
                            } else if (cause instanceof OutOfMemoryError) {
                                pVar = new p(14, 0);
                            } else if (cause instanceof j3.p) {
                                pVar2 = new p(17, ((j3.p) cause).a);
                            } else if (cause instanceof r) {
                                pVar2 = new p(18, ((r) cause).a);
                            } else if (f0.a < 16 || !(cause instanceof MediaCodec.CryptoException)) {
                                pVar = new p(22, 0);
                            } else {
                                int errorCode = ((MediaCodec.CryptoException) cause).getErrorCode();
                                switch (f0.q(errorCode)) {
                                    case 6002:
                                        i20 = 24;
                                        break;
                                    case 6003:
                                        i20 = 28;
                                        break;
                                    case 6004:
                                        i20 = 25;
                                        break;
                                    case 6005:
                                        i20 = 26;
                                        break;
                                }
                                pVar2 = new p(i20, errorCode);
                            }
                            this.c.reportPlaybackErrorEvent(new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(elapsedRealtime - this.d).setErrorCode(pVar.a).setSubErrorCode(pVar.b).setException(v1Var).build());
                            i10 = 1;
                            this.M = true;
                            this.y = null;
                        }
                        pVar = pVar2;
                        this.c.reportPlaybackErrorEvent(new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(elapsedRealtime - this.d).setErrorCode(pVar.a).setSubErrorCode(pVar.b).setException(v1Var).build());
                        i10 = 1;
                        this.M = true;
                        this.y = null;
                    }
                    this.c.reportPlaybackErrorEvent(new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(elapsedRealtime - this.d).setErrorCode(pVar.a).setSubErrorCode(pVar.b).setException(v1Var).build());
                    i10 = 1;
                    this.M = true;
                    this.y = null;
                }
            }
            this.c.reportPlaybackErrorEvent(new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(elapsedRealtime - this.d).setErrorCode(pVar.a).setSubErrorCode(pVar.b).setException(v1Var).build());
            i10 = 1;
            this.M = true;
            this.y = null;
        }
        if (bVar.j(2)) {
            t2 u10 = c2Var.u();
            boolean a3 = u10.a(2);
            boolean a10 = u10.a(i10);
            boolean a11 = u10.a(3);
            if (a3 || a10 || a11) {
                if (a3) {
                    t0Var = null;
                } else {
                    t0Var = null;
                    if (!f0.a(this.D, null)) {
                        int i22 = this.D == null ? 1 : 0;
                        this.D = null;
                        i11 = 4;
                        o(1, elapsedRealtime, null, i22);
                        if (!a10 && !f0.a(this.E, t0Var)) {
                            int i23 = this.E != null ? 1 : 0;
                            this.E = t0Var;
                            o(0, elapsedRealtime, t0Var, i23);
                        }
                        if (!a11 && !f0.a(this.F, t0Var)) {
                            int i24 = this.F != null ? 1 : 0;
                            this.F = t0Var;
                            o(2, elapsedRealtime, t0Var, i24);
                        }
                        aVar = t0Var;
                        if (j(this.A)) {
                            a6.a aVar4 = this.A;
                            t0 t0Var2 = (t0) aVar4.d;
                            if (t0Var2.H != -1) {
                                int i25 = aVar4.c;
                                if (!f0.a(this.D, t0Var2)) {
                                    int i26 = (this.D == null && i25 == 0) ? 1 : i25;
                                    this.D = t0Var2;
                                    o(1, elapsedRealtime, t0Var2, i26);
                                }
                                this.A = aVar;
                            }
                        }
                        if (j(this.B)) {
                            a6.a aVar5 = this.B;
                            t0 t0Var3 = (t0) aVar5.d;
                            int i27 = aVar5.c;
                            if (!f0.a(this.E, t0Var3)) {
                                int i28 = (this.E == null && i27 == 0) ? 1 : i27;
                                this.E = t0Var3;
                                o(0, elapsedRealtime, t0Var3, i28);
                            }
                            this.B = aVar;
                        }
                        if (j(this.C)) {
                            a6.a aVar6 = this.C;
                            t0 t0Var4 = (t0) aVar6.d;
                            int i29 = aVar6.c;
                            if (!f0.a(this.F, t0Var4)) {
                                int i30 = (this.F == null && i29 == 0) ? 1 : i29;
                                this.F = t0Var4;
                                o(2, elapsedRealtime, t0Var4, i30);
                            }
                            this.C = aVar;
                        }
                        switch (w.f(this.a).g()) {
                            case 0:
                                i12 = 0;
                                break;
                            case 1:
                                i12 = 9;
                                break;
                            case 2:
                                i12 = 2;
                                break;
                            case 3:
                                i12 = 4;
                                break;
                            case 4:
                                i12 = 5;
                                break;
                            case 5:
                                i12 = 6;
                                break;
                            case 6:
                            case 8:
                            default:
                                i12 = 1;
                                break;
                            case 7:
                                i12 = 3;
                                break;
                            case 9:
                                i12 = 8;
                                break;
                            case 10:
                                i12 = 7;
                                break;
                        }
                        if (i12 != this.x) {
                            this.x = i12;
                            this.c.reportNetworkEvent(new NetworkEvent.Builder().setNetworkType(i12).setTimeSinceCreatedMillis(elapsedRealtime - this.d).build());
                        }
                        if (c2Var.b() != 2) {
                            this.G = false;
                        }
                        if (c2Var.v() == null) {
                            this.I = false;
                        } else if (bVar.j(10)) {
                            this.I = true;
                        }
                        int b10 = c2Var.b();
                        if (this.G) {
                            i13 = 5;
                        } else if (this.I) {
                            i13 = 13;
                        } else if (b10 == i11) {
                            i13 = 11;
                        } else if (b10 == 2) {
                            int i31 = this.w;
                            i13 = (i31 == 0 || i31 == 2) ? 2 : !c2Var.h() ? 7 : c2Var.z() != 0 ? 10 : 6;
                        } else {
                            i13 = b10 == 3 ? !c2Var.h() ? 4 : c2Var.z() != 0 ? 9 : 3 : (b10 != 1 || this.w == 0) ? this.w : 12;
                        }
                        if (this.w != i13) {
                            this.w = i13;
                            this.M = true;
                            this.c.reportPlaybackStateEvent(new PlaybackStateEvent.Builder().setState(this.w).setTimeSinceCreatedMillis(elapsedRealtime - this.d).build());
                        }
                        if (bVar.j(1028)) {
                            h hVar2 = this.b;
                            a aVar7 = (a) ((SparseArray) bVar.c).get(1028);
                            aVar7.getClass();
                            hVar2.a(aVar7);
                            return;
                        }
                        return;
                    }
                }
                i11 = 4;
                if (!a10) {
                    if (this.E != null) {
                    }
                    this.E = t0Var;
                    o(0, elapsedRealtime, t0Var, i23);
                }
                if (!a11) {
                    if (this.F != null) {
                    }
                    this.F = t0Var;
                    o(2, elapsedRealtime, t0Var, i24);
                }
                aVar = t0Var;
                if (j(this.A)) {
                }
                if (j(this.B)) {
                }
                if (j(this.C)) {
                }
                switch (w.f(this.a).g()) {
                }
                if (i12 != this.x) {
                }
                if (c2Var.b() != 2) {
                }
                if (c2Var.v() == null) {
                }
                int b102 = c2Var.b();
                if (this.G) {
                }
                if (this.w != i13) {
                }
                if (bVar.j(1028)) {
                }
            }
        }
        aVar = 0;
        i11 = 4;
        if (j(this.A)) {
        }
        if (j(this.B)) {
        }
        if (j(this.C)) {
        }
        switch (w.f(this.a).g()) {
        }
        if (i12 != this.x) {
        }
        if (c2Var.b() != 2) {
        }
        if (c2Var.v() == null) {
        }
        int b1022 = c2Var.b();
        if (this.G) {
        }
        if (this.w != i13) {
        }
        if (bVar.j(1028)) {
        }
    }

    @Override // i3.b
    public final void d(z zVar) {
        a6.a aVar = this.A;
        if (aVar != null) {
            t0 t0Var = (t0) aVar.d;
            if (t0Var.H == -1) {
                s0 a2 = t0Var.a();
                a2.t = zVar.a;
                a2.u = zVar.b;
                this.A = new a6.a(new t0(a2), aVar.c, (String) aVar.b, 11);
            }
        }
    }

    @Override // i3.b
    public final void e(int i9) {
        if (i9 == 1) {
            this.G = true;
        }
        this.v = i9;
    }

    @Override // i3.b
    public final void g(a aVar, y yVar) {
        d0 d0Var = aVar.d;
        if (d0Var == null) {
            return;
        }
        t0 t0Var = yVar.c;
        t0Var.getClass();
        int i9 = yVar.d;
        r2 r2Var = aVar.b;
        d0Var.getClass();
        a6.a aVar2 = new a6.a(t0Var, i9, this.b.c(r2Var, d0Var), 11);
        int i10 = yVar.b;
        if (i10 != 0) {
            if (i10 == 1) {
                this.B = aVar2;
                return;
            } else if (i10 != 2) {
                if (i10 != 3) {
                    return;
                }
                this.C = aVar2;
                return;
            }
        }
        this.A = aVar2;
    }

    @Override // i3.b
    public final void h(k3.f fVar) {
        this.J += fVar.g;
        this.K += fVar.e;
    }

    @Override // i3.b
    public final void i(a aVar, int i9, long j10) {
        d0 d0Var = aVar.d;
        if (d0Var != null) {
            String c10 = this.b.c(aVar.b, d0Var);
            HashMap hashMap = this.n;
            Long l10 = (Long) hashMap.get(c10);
            HashMap hashMap2 = this.h;
            Long l11 = (Long) hashMap2.get(c10);
            hashMap.put(c10, Long.valueOf((l10 == null ? 0L : l10.longValue()) + j10));
            hashMap2.put(c10, Long.valueOf((l11 != null ? l11.longValue() : 0L) + i9));
        }
    }

    public final boolean j(a6.a aVar) {
        String str;
        if (aVar == null) {
            return false;
        }
        String str2 = (String) aVar.b;
        h hVar = this.b;
        synchronized (hVar) {
            str = hVar.f;
        }
        return str2.equals(str);
    }

    public final void k() {
        PlaybackMetrics.Builder builder = this.s;
        if (builder != null && this.M) {
            builder.setAudioUnderrunCount(this.L);
            this.s.setVideoFramesDropped(this.J);
            this.s.setVideoFramesPlayed(this.K);
            Long l10 = (Long) this.h.get(this.r);
            this.s.setNetworkTransferDurationMillis(l10 == null ? 0L : l10.longValue());
            Long l11 = (Long) this.n.get(this.r);
            this.s.setNetworkBytesRead(l11 == null ? 0L : l11.longValue());
            this.s.setStreamSource((l11 == null || l11.longValue() <= 0) ? 0 : 1);
            this.c.reportPlaybackMetrics(this.s.build());
        }
        this.s = null;
        this.r = null;
        this.L = 0;
        this.J = 0;
        this.K = 0;
        this.D = null;
        this.E = null;
        this.F = null;
        this.M = false;
    }

    public final void l(r2 r2Var, d0 d0Var) {
        int b10;
        PlaybackMetrics.Builder builder = this.s;
        if (d0Var == null || (b10 = r2Var.b(d0Var.a)) == -1) {
            return;
        }
        p2 p2Var = this.f;
        int i9 = 0;
        r2Var.f(b10, p2Var, false);
        int i10 = p2Var.c;
        q2 q2Var = this.e;
        r2Var.n(i10, q2Var);
        c1 c1Var = q2Var.c.b;
        if (c1Var != null) {
            int C = f0.C(c1Var.a, c1Var.b);
            i9 = C != 0 ? C != 1 ? C != 2 ? 1 : 4 : 5 : 3;
        }
        builder.setStreamType(i9);
        if (q2Var.y != -9223372036854775807L && !q2Var.w && !q2Var.r && !q2Var.a()) {
            builder.setMediaDurationMillis(f0.S(q2Var.y));
        }
        builder.setPlaybackType(q2Var.a() ? 2 : 1);
        this.M = true;
    }

    public final void m(a aVar, String str) {
        d0 d0Var = aVar.d;
        if (d0Var == null || !d0Var.a()) {
            k();
            this.r = str;
            this.s = new PlaybackMetrics.Builder().setPlayerName("ExoPlayerLib").setPlayerVersion("2.18.3");
            l(aVar.b, d0Var);
        }
    }

    public final void n(a aVar, String str) {
        d0 d0Var = aVar.d;
        if ((d0Var == null || !d0Var.a()) && str.equals(this.r)) {
            k();
        }
        this.h.remove(str);
        this.n.remove(str);
    }

    public final void o(int i9, long j10, t0 t0Var, int i10) {
        int i11;
        TrackChangeEvent.Builder timeSinceCreatedMillis = new TrackChangeEvent.Builder(i9).setTimeSinceCreatedMillis(j10 - this.d);
        if (t0Var != null) {
            timeSinceCreatedMillis.setTrackState(1);
            if (i10 != 1) {
                i11 = 3;
                if (i10 != 2) {
                    i11 = i10 != 3 ? 1 : 4;
                }
            } else {
                i11 = 2;
            }
            timeSinceCreatedMillis.setTrackChangeReason(i11);
            String str = t0Var.A;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = t0Var.B;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = t0Var.r;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i12 = t0Var.n;
            if (i12 != -1) {
                timeSinceCreatedMillis.setBitrate(i12);
            }
            int i13 = t0Var.G;
            if (i13 != -1) {
                timeSinceCreatedMillis.setWidth(i13);
            }
            int i14 = t0Var.H;
            if (i14 != -1) {
                timeSinceCreatedMillis.setHeight(i14);
            }
            int i15 = t0Var.O;
            if (i15 != -1) {
                timeSinceCreatedMillis.setChannelCount(i15);
            }
            int i16 = t0Var.P;
            if (i16 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i16);
            }
            String str4 = t0Var.c;
            if (str4 != null) {
                int i17 = f0.a;
                String[] split = str4.split("-", -1);
                Pair create = Pair.create(split[0], split.length >= 2 ? split[1] : null);
                timeSinceCreatedMillis.setLanguage((String) create.first);
                Object obj = create.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f10 = t0Var.I;
            if (f10 != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f10);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.M = true;
        this.c.reportTrackChangeEvent(timeSinceCreatedMillis.build());
    }

    @Override // i3.b
    public final /* synthetic */ void f(a aVar) {
    }

    @Override // i3.b
    public final /* synthetic */ void onRenderedFirstFrame(a aVar) {
    }

    @Override // i3.b
    public final /* synthetic */ void onSeekStarted(a aVar) {
    }
}
