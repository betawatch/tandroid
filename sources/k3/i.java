package k3;

import a4.o;
import a4.s;
import ag.j2;
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
import com.google.android.exoplayer2.upstream.f0;
import com.google.android.exoplayer2.upstream.g0;
import com.google.android.exoplayer2.upstream.h0;
import com.google.android.exoplayer2.upstream.z0;
import f5.d0;
import f5.u;
import g5.y;
import g9.l;
import j3.c1;
import j3.c2;
import j3.n;
import j3.p2;
import j3.q2;
import j3.r2;
import j3.s0;
import j3.s2;
import j3.t0;
import j3.t1;
import j3.t2;
import j3.v1;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.UUID;
import l3.q;
import l4.c0;
import l4.x;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class i implements b {
    public j2 A;
    public j2 B;
    public j2 C;
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

    public i(Context context, PlaybackSession playbackSession) {
        this.a = context.getApplicationContext();
        this.c = playbackSession;
        h hVar = new h();
        this.b = hVar;
        hVar.d = this;
    }

    @Override // k3.b
    public final void a(v1 v1Var) {
        this.y = v1Var;
    }

    @Override // k3.b
    public final void b(a aVar, x xVar) {
        c0 c0Var = aVar.d;
        if (c0Var == null) {
            return;
        }
        t0 t0Var = xVar.c;
        t0Var.getClass();
        int i10 = xVar.d;
        r2 r2Var = aVar.b;
        c0Var.getClass();
        j2 j2Var = new j2(t0Var, i10, this.b.c(r2Var, c0Var));
        int i11 = xVar.b;
        if (i11 != 0) {
            if (i11 == 1) {
                this.B = j2Var;
                return;
            } else if (i11 != 2) {
                if (i11 != 3) {
                    return;
                }
                this.C = j2Var;
                return;
            }
        }
        this.A = j2Var;
    }

    @Override // k3.b
    public final void d(y yVar) {
        j2 j2Var = this.A;
        if (j2Var != null) {
            t0 t0Var = (t0) j2Var.c;
            if (t0Var.H == -1) {
                s0 a2 = t0Var.a();
                a2.t = yVar.a;
                a2.u = yVar.b;
                this.A = new j2(new t0(a2), j2Var.b, (String) j2Var.d);
            }
        }
    }

    @Override // k3.b
    public final void e(int i10) {
        if (i10 == 1) {
            this.G = true;
        }
        this.v = i10;
    }

    @Override // k3.b
    public final void f(m3.f fVar) {
        this.J += fVar.g;
        this.K += fVar.e;
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
    @Override // k3.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(c2 c2Var, l lVar) {
        int i10;
        boolean z10;
        a5.e eVar;
        a5.e eVar2;
        a5.e eVar3;
        int i11;
        j2 j2Var;
        int i12;
        int i13;
        int i14;
        t0 t0Var;
        n3.c cVar;
        int i15;
        if (((f5.g) lVar.b).a.size() == 0) {
            return;
        }
        for (int i16 = 0; i16 < ((f5.g) lVar.b).a.size(); i16++) {
            int a2 = ((f5.g) lVar.b).a(i16);
            a aVar = (a) ((SparseArray) lVar.c).get(a2);
            aVar.getClass();
            if (a2 == 0) {
                h hVar = this.b;
                synchronized (hVar) {
                    try {
                        hVar.d.getClass();
                        r2 r2Var = hVar.e;
                        hVar.e = aVar.b;
                        Iterator it = hVar.c.values().iterator();
                        while (it.hasNext()) {
                            g gVar = (g) it.next();
                            if (gVar.b(r2Var, hVar.e) && !gVar.a(aVar)) {
                            }
                            it.remove();
                            if (gVar.e) {
                                if (gVar.a.equals(hVar.f)) {
                                    hVar.f = null;
                                }
                                hVar.d.n(aVar, gVar.a);
                            }
                        }
                        hVar.d(aVar);
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } else if (a2 == 11) {
                this.b.f(aVar, this.v);
            } else {
                this.b.e(aVar);
            }
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (lVar.i(0)) {
            a aVar2 = (a) ((SparseArray) lVar.c).get(0);
            aVar2.getClass();
            if (this.s != null) {
                l(aVar2.b, aVar2.d);
            }
        }
        if (lVar.i(2) && this.s != null) {
            q8.x listIterator = c2Var.t().a.listIterator(0);
            loop2: while (true) {
                if (!listIterator.hasNext()) {
                    cVar = null;
                    break;
                }
                s2 s2Var = (s2) listIterator.next();
                for (int i17 = 0; i17 < s2Var.a; i17++) {
                    if (s2Var.e[i17] && (cVar = s2Var.b.d[i17].E) != null) {
                        break loop2;
                    }
                }
            }
            if (cVar != null) {
                PlaybackMetrics.Builder builder = this.s;
                int i18 = d0.a;
                int i19 = 0;
                while (true) {
                    if (i19 >= cVar.d) {
                        i15 = 1;
                        break;
                    }
                    UUID uuid = cVar.a[i19].b;
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
        if (lVar.i(1011)) {
            this.L++;
        }
        v1 v1Var = this.y;
        if (v1Var == null) {
            i11 = 1;
        } else {
            int i20 = v1Var.a;
            Context context = this.a;
            boolean z11 = this.H == 4;
            if (i20 == 1001) {
                eVar = new a5.e(20, 0);
            } else {
                if (v1Var instanceof n) {
                    n nVar = (n) v1Var;
                    z10 = nVar.c == 1;
                    i10 = nVar.h;
                } else {
                    i10 = 0;
                    z10 = false;
                }
                Throwable cause = v1Var.getCause();
                cause.getClass();
                int i21 = 27;
                if (cause instanceof IOException) {
                    if (cause instanceof h0) {
                        eVar3 = new a5.e(5, ((h0) cause).d);
                    } else {
                        if ((cause instanceof g0) || (cause instanceof t1)) {
                            eVar = new a5.e(z11 ? 10 : 11, 0);
                        } else {
                            boolean z12 = cause instanceof f0;
                            if (z12 || (cause instanceof z0)) {
                                if (u.f(context).g() == 1) {
                                    eVar = new a5.e(3, 0);
                                } else {
                                    Throwable cause2 = cause.getCause();
                                    eVar = cause2 instanceof UnknownHostException ? new a5.e(6, 0) : cause2 instanceof SocketTimeoutException ? new a5.e(7, 0) : (z12 && ((f0) cause).c == 1) ? new a5.e(4, 0) : new a5.e(8, 0);
                                }
                            } else if (i20 == 1002) {
                                eVar = new a5.e(21, 0);
                            } else if (cause instanceof n3.d) {
                                Throwable cause3 = cause.getCause();
                                cause3.getClass();
                                int i22 = d0.a;
                                if (i22 < 21 || !(cause3 instanceof MediaDrm.MediaDrmStateException)) {
                                    eVar = (i22 < 23 || !(cause3 instanceof MediaDrmResetException)) ? (i22 < 18 || !(cause3 instanceof NotProvisionedException)) ? (i22 < 18 || !(cause3 instanceof DeniedByServerException)) ? cause3 instanceof n3.k ? new a5.e(23, 0) : cause3 instanceof n3.a ? new a5.e(28, 0) : new a5.e(30, 0) : new a5.e(29, 0) : new a5.e(24, 0) : new a5.e(27, 0);
                                } else {
                                    int r6 = d0.r(((MediaDrm.MediaDrmStateException) cause3).getDiagnosticInfo());
                                    switch (d0.q(r6)) {
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
                                    eVar3 = new a5.e(i21, r6);
                                }
                            } else if ((cause instanceof com.google.android.exoplayer2.upstream.c0) && (cause.getCause() instanceof FileNotFoundException)) {
                                Throwable cause4 = cause.getCause();
                                cause4.getClass();
                                Throwable cause5 = cause4.getCause();
                                eVar = (d0.a >= 21 && (cause5 instanceof ErrnoException) && ((ErrnoException) cause5).errno == OsConstants.EACCES) ? new a5.e(32, 0) : new a5.e(31, 0);
                            } else {
                                eVar = new a5.e(9, 0);
                            }
                        }
                        this.c.reportPlaybackErrorEvent(new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(elapsedRealtime - this.d).setErrorCode(eVar.a).setSubErrorCode(eVar.b).setException(v1Var).build());
                        i11 = 1;
                        this.M = true;
                        this.y = null;
                    }
                    eVar = eVar3;
                } else {
                    if (z10 && (i10 == 0 || i10 == 1)) {
                        eVar = new a5.e(35, 0);
                    } else if (z10 && i10 == 3) {
                        eVar = new a5.e(15, 0);
                    } else if (z10 && i10 == 2) {
                        eVar = new a5.e(23, 0);
                    } else {
                        if (cause instanceof s) {
                            eVar2 = new a5.e(13, d0.r(((s) cause).d));
                        } else {
                            if (cause instanceof o) {
                                eVar = new a5.e(14, d0.r(((o) cause).a));
                            } else if (cause instanceof OutOfMemoryError) {
                                eVar = new a5.e(14, 0);
                            } else if (cause instanceof q) {
                                eVar2 = new a5.e(17, ((q) cause).a);
                            } else if (cause instanceof l3.s) {
                                eVar2 = new a5.e(18, ((l3.s) cause).a);
                            } else if (d0.a < 16 || !(cause instanceof MediaCodec.CryptoException)) {
                                eVar = new a5.e(22, 0);
                            } else {
                                int errorCode = ((MediaCodec.CryptoException) cause).getErrorCode();
                                switch (d0.q(errorCode)) {
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
                                eVar2 = new a5.e(i21, errorCode);
                            }
                            this.c.reportPlaybackErrorEvent(new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(elapsedRealtime - this.d).setErrorCode(eVar.a).setSubErrorCode(eVar.b).setException(v1Var).build());
                            i11 = 1;
                            this.M = true;
                            this.y = null;
                        }
                        eVar = eVar2;
                        this.c.reportPlaybackErrorEvent(new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(elapsedRealtime - this.d).setErrorCode(eVar.a).setSubErrorCode(eVar.b).setException(v1Var).build());
                        i11 = 1;
                        this.M = true;
                        this.y = null;
                    }
                    this.c.reportPlaybackErrorEvent(new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(elapsedRealtime - this.d).setErrorCode(eVar.a).setSubErrorCode(eVar.b).setException(v1Var).build());
                    i11 = 1;
                    this.M = true;
                    this.y = null;
                }
            }
            this.c.reportPlaybackErrorEvent(new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(elapsedRealtime - this.d).setErrorCode(eVar.a).setSubErrorCode(eVar.b).setException(v1Var).build());
            i11 = 1;
            this.M = true;
            this.y = null;
        }
        if (lVar.i(2)) {
            t2 t10 = c2Var.t();
            boolean a10 = t10.a(2);
            boolean a11 = t10.a(i11);
            boolean a12 = t10.a(3);
            if (a10 || a11 || a12) {
                if (a10) {
                    t0Var = null;
                } else {
                    t0Var = null;
                    if (!d0.a(this.D, null)) {
                        int i23 = this.D == null ? 1 : 0;
                        this.D = null;
                        i12 = 4;
                        o(1, elapsedRealtime, null, i23);
                        if (!a11 && !d0.a(this.E, t0Var)) {
                            int i24 = this.E != null ? 1 : 0;
                            this.E = t0Var;
                            o(0, elapsedRealtime, t0Var, i24);
                        }
                        if (!a12 && !d0.a(this.F, t0Var)) {
                            int i25 = this.F != null ? 1 : 0;
                            this.F = t0Var;
                            o(2, elapsedRealtime, t0Var, i25);
                        }
                        j2Var = t0Var;
                        if (j(this.A)) {
                            j2 j2Var2 = this.A;
                            t0 t0Var2 = (t0) j2Var2.c;
                            if (t0Var2.H != -1) {
                                int i26 = j2Var2.b;
                                if (!d0.a(this.D, t0Var2)) {
                                    int i27 = (this.D == null && i26 == 0) ? 1 : i26;
                                    this.D = t0Var2;
                                    o(1, elapsedRealtime, t0Var2, i27);
                                }
                                this.A = j2Var;
                            }
                        }
                        if (j(this.B)) {
                            j2 j2Var3 = this.B;
                            t0 t0Var3 = (t0) j2Var3.c;
                            int i28 = j2Var3.b;
                            if (!d0.a(this.E, t0Var3)) {
                                int i29 = (this.E == null && i28 == 0) ? 1 : i28;
                                this.E = t0Var3;
                                o(0, elapsedRealtime, t0Var3, i29);
                            }
                            this.B = j2Var;
                        }
                        if (j(this.C)) {
                            j2 j2Var4 = this.C;
                            t0 t0Var4 = (t0) j2Var4.c;
                            int i30 = j2Var4.b;
                            if (!d0.a(this.F, t0Var4)) {
                                int i31 = (this.F == null && i30 == 0) ? 1 : i30;
                                this.F = t0Var4;
                                o(2, elapsedRealtime, t0Var4, i31);
                            }
                            this.C = j2Var;
                        }
                        switch (u.f(this.a).g()) {
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
                        if (c2Var.b() != 2) {
                            this.G = false;
                        }
                        if (c2Var.v() == null) {
                            this.I = false;
                        } else if (lVar.i(10)) {
                            this.I = true;
                        }
                        int b10 = c2Var.b();
                        if (this.G) {
                            i14 = 5;
                        } else if (this.I) {
                            i14 = 13;
                        } else if (b10 == i12) {
                            i14 = 11;
                        } else if (b10 == 2) {
                            int i32 = this.w;
                            i14 = (i32 == 0 || i32 == 2) ? 2 : !c2Var.h() ? 7 : c2Var.z() != 0 ? 10 : 6;
                        } else {
                            i14 = b10 == 3 ? !c2Var.h() ? 4 : c2Var.z() != 0 ? 9 : 3 : (b10 != 1 || this.w == 0) ? this.w : 12;
                        }
                        if (this.w != i14) {
                            this.w = i14;
                            this.M = true;
                            this.c.reportPlaybackStateEvent(new PlaybackStateEvent.Builder().setState(this.w).setTimeSinceCreatedMillis(elapsedRealtime - this.d).build());
                        }
                        if (lVar.i(1028)) {
                            h hVar2 = this.b;
                            a aVar3 = (a) ((SparseArray) lVar.c).get(1028);
                            aVar3.getClass();
                            hVar2.a(aVar3);
                            return;
                        }
                        return;
                    }
                }
                i12 = 4;
                if (!a11) {
                    if (this.E != null) {
                    }
                    this.E = t0Var;
                    o(0, elapsedRealtime, t0Var, i24);
                }
                if (!a12) {
                    if (this.F != null) {
                    }
                    this.F = t0Var;
                    o(2, elapsedRealtime, t0Var, i25);
                }
                j2Var = t0Var;
                if (j(this.A)) {
                }
                if (j(this.B)) {
                }
                if (j(this.C)) {
                }
                switch (u.f(this.a).g()) {
                }
                if (i13 != this.x) {
                }
                if (c2Var.b() != 2) {
                }
                if (c2Var.v() == null) {
                }
                int b102 = c2Var.b();
                if (this.G) {
                }
                if (this.w != i14) {
                }
                if (lVar.i(1028)) {
                }
            }
        }
        j2Var = 0;
        i12 = 4;
        if (j(this.A)) {
        }
        if (j(this.B)) {
        }
        if (j(this.C)) {
        }
        switch (u.f(this.a).g()) {
        }
        if (i13 != this.x) {
        }
        if (c2Var.b() != 2) {
        }
        if (c2Var.v() == null) {
        }
        int b1022 = c2Var.b();
        if (this.G) {
        }
        if (this.w != i14) {
        }
        if (lVar.i(1028)) {
        }
    }

    @Override // k3.b
    public final void h(x xVar) {
        this.H = xVar.a;
    }

    @Override // k3.b
    public final void i(int i10, long j10, a aVar) {
        c0 c0Var = aVar.d;
        if (c0Var != null) {
            String c3 = this.b.c(aVar.b, c0Var);
            HashMap hashMap = this.n;
            Long l10 = (Long) hashMap.get(c3);
            HashMap hashMap2 = this.h;
            Long l11 = (Long) hashMap2.get(c3);
            hashMap.put(c3, Long.valueOf((l10 == null ? 0L : l10.longValue()) + j10));
            hashMap2.put(c3, Long.valueOf((l11 != null ? l11.longValue() : 0L) + i10));
        }
    }

    public final boolean j(j2 j2Var) {
        String str;
        if (j2Var == null) {
            return false;
        }
        String str2 = (String) j2Var.d;
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

    public final void l(r2 r2Var, c0 c0Var) {
        int b10;
        PlaybackMetrics.Builder builder = this.s;
        if (c0Var == null || (b10 = r2Var.b(c0Var.a)) == -1) {
            return;
        }
        p2 p2Var = this.f;
        int i10 = 0;
        r2Var.f(b10, p2Var, false);
        int i11 = p2Var.c;
        q2 q2Var = this.e;
        r2Var.n(i11, q2Var);
        c1 c1Var = q2Var.c.b;
        if (c1Var != null) {
            int C = d0.C(c1Var.a, c1Var.b);
            i10 = C != 0 ? C != 1 ? C != 2 ? 1 : 4 : 5 : 3;
        }
        builder.setStreamType(i10);
        if (q2Var.y != -9223372036854775807L && !q2Var.w && !q2Var.r && !q2Var.a()) {
            builder.setMediaDurationMillis(d0.S(q2Var.y));
        }
        builder.setPlaybackType(q2Var.a() ? 2 : 1);
        this.M = true;
    }

    public final void m(a aVar, String str) {
        c0 c0Var = aVar.d;
        if (c0Var == null || !c0Var.a()) {
            k();
            this.r = str;
            this.s = new PlaybackMetrics.Builder().setPlayerName("ExoPlayerLib").setPlayerVersion("2.18.3");
            l(aVar.b, c0Var);
        }
    }

    public final void n(a aVar, String str) {
        c0 c0Var = aVar.d;
        if ((c0Var == null || !c0Var.a()) && str.equals(this.r)) {
            k();
        }
        this.h.remove(str);
        this.n.remove(str);
    }

    public final void o(int i10, long j10, t0 t0Var, int i11) {
        int i12;
        TrackChangeEvent.Builder timeSinceCreatedMillis = new TrackChangeEvent.Builder(i10).setTimeSinceCreatedMillis(j10 - this.d);
        if (t0Var != null) {
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
            int i13 = t0Var.n;
            if (i13 != -1) {
                timeSinceCreatedMillis.setBitrate(i13);
            }
            int i14 = t0Var.G;
            if (i14 != -1) {
                timeSinceCreatedMillis.setWidth(i14);
            }
            int i15 = t0Var.H;
            if (i15 != -1) {
                timeSinceCreatedMillis.setHeight(i15);
            }
            int i16 = t0Var.O;
            if (i16 != -1) {
                timeSinceCreatedMillis.setChannelCount(i16);
            }
            int i17 = t0Var.P;
            if (i17 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i17);
            }
            String str4 = t0Var.c;
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
            float f9 = t0Var.I;
            if (f9 != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f9);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.M = true;
        this.c.reportTrackChangeEvent(timeSinceCreatedMillis.build());
    }

    @Override // k3.b
    public final /* synthetic */ void c(a aVar) {
    }

    @Override // k3.b
    public final /* synthetic */ void onRenderedFirstFrame(a aVar) {
    }

    @Override // k3.b
    public final /* synthetic */ void onSeekStarted(a aVar) {
    }
}
