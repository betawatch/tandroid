package j2;

import android.content.Context;
import android.media.DeniedByServerException;
import android.media.MediaCodec;
import android.media.MediaDrm;
import android.media.NotProvisionedException;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
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
import b2.b1;
import b2.h1;
import b2.j1;
import b2.k1;
import b2.o;
import b2.q;
import b2.q0;
import b2.r;
import b2.r1;
import b2.s;
import b2.s0;
import b2.s1;
import b2.u0;
import b2.x1;
import e2.d0;
import e2.u;
import e9.g0;
import fi.j4;
import g2.v;
import g2.w;
import g2.x;
import j$.util.Objects;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.Executor;
import k2.m;
import r2.n;
import r2.p;
import u2.b0;
import u2.f0;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class i implements b {
    public u0 E;
    public a5.a F;
    public a5.a G;
    public a5.a H;
    public s I;
    public s J;
    public s K;
    public boolean L;
    public int M;
    public boolean N;
    public int O;
    public int P;
    public int Q;
    public boolean R;
    public final Context a;
    public final h c;
    public final PlaybackSession d;
    public String s;
    public PlaybackMetrics.Builder v;
    public int w;
    public final Executor b = e2.a.g();
    public final j1 f = new j1();
    public final h1 h = new h1();
    public final HashMap r = new HashMap();
    public final HashMap n = new HashMap();
    public final long e = SystemClock.elapsedRealtime();
    public int x = 0;
    public int y = 0;

    public i(Context context, PlaybackSession playbackSession) {
        this.a = context.getApplicationContext();
        this.d = playbackSession;
        h hVar = new h();
        this.c = hVar;
        hVar.d = this;
    }

    public static i o(Context context) {
        MediaMetricsManager mediaMetricsManager = (MediaMetricsManager) context.getSystemService("media_metrics");
        if (mediaMetricsManager == null) {
            return null;
        }
        return new i(context, mediaMetricsManager.createPlaybackSession());
    }

    @Override // j2.b
    public final void a(i2.h hVar) {
        this.O += hVar.g;
        this.P += hVar.e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:120:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x041e  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0434  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0436  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0446  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0475  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x049f  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x04ce  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x04e7  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0511  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0519  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x052d  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0589  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x05b7  */
    /* JADX WARN: Removed duplicated region for block: B:189:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0530  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x051c  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x04d0  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x04d2  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x04d5  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x04d7  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x04d9  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x04db  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x04dd  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x04df  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x04e2  */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v2, types: [a5.a] */
    /* JADX WARN: Type inference failed for: r11v5 */
    @Override // j2.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(b1 b1Var, pf.b bVar) {
        int i10;
        boolean z10;
        int i11;
        q0 q0Var;
        q0 q0Var2;
        q0 q0Var3;
        int i12;
        int i13;
        ?? r11;
        int i14;
        boolean z11;
        s sVar;
        o oVar;
        int i15;
        if (((q) bVar.b).a.size() == 0) {
            return;
        }
        for (int i16 = 0; i16 < ((q) bVar.b).a.size(); i16++) {
            int a2 = ((q) bVar.b).a(i16);
            a aVar = (a) ((SparseArray) bVar.c).get(a2);
            aVar.getClass();
            if (a2 == 0) {
                h hVar = this.c;
                synchronized (hVar) {
                    try {
                        hVar.d.getClass();
                        k1 k1Var = hVar.e;
                        hVar.e = aVar.b;
                        Iterator it = hVar.c.values().iterator();
                        while (it.hasNext()) {
                            g gVar = (g) it.next();
                            if (gVar.b(k1Var, hVar.e) && !gVar.a(aVar)) {
                            }
                            it.remove();
                            if (gVar.e) {
                                if (gVar.a.equals(hVar.f)) {
                                    hVar.a(gVar);
                                }
                                hVar.d.t(aVar, gVar.a);
                            }
                        }
                        hVar.e(aVar);
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } else if (a2 == 11) {
                this.c.g(aVar, this.w);
            } else {
                this.c.f(aVar);
            }
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (bVar.z(0)) {
            a aVar2 = (a) ((SparseArray) bVar.c).get(0);
            aVar2.getClass();
            if (this.v != null) {
                r(aVar2.b, aVar2.d);
            }
        }
        if (bVar.z(2) && this.v != null) {
            g0 listIterator = b1Var.g0().a.listIterator(0);
            loop2: while (true) {
                if (!listIterator.hasNext()) {
                    oVar = null;
                    break;
                }
                r1 r1Var = (r1) listIterator.next();
                for (int i17 = 0; i17 < r1Var.a; i17++) {
                    if (r1Var.e[i17] && (oVar = r1Var.b.d[i17].v) != null) {
                        break loop2;
                    }
                }
            }
            if (oVar != null) {
                PlaybackMetrics.Builder builder = this.v;
                String str = d0.a;
                int i18 = 0;
                while (true) {
                    if (i18 >= oVar.d) {
                        i15 = 1;
                        break;
                    }
                    UUID uuid = oVar.a[i18].b;
                    if (uuid.equals(b2.i.d)) {
                        i15 = 3;
                        break;
                    } else if (uuid.equals(b2.i.e)) {
                        i15 = 2;
                        break;
                    } else {
                        if (uuid.equals(b2.i.c)) {
                            i15 = 6;
                            break;
                        }
                        i18++;
                    }
                }
                builder.setDrmType(i15);
            }
        }
        if (bVar.z(1011)) {
            this.Q++;
        }
        u0 u0Var = this.E;
        if (u0Var == null) {
            i12 = 1;
            i11 = 13;
        } else {
            int i19 = u0Var.a;
            Context context = this.a;
            boolean z12 = this.M == 4;
            int i20 = 21;
            if (i19 == 1001) {
                q0Var = new q0(20, 0);
            } else {
                if (u0Var instanceof i2.o) {
                    i2.o oVar2 = (i2.o) u0Var;
                    z10 = oVar2.s == 1;
                    i10 = oVar2.y;
                } else {
                    i10 = 0;
                    z10 = false;
                }
                Throwable cause = u0Var.getCause();
                cause.getClass();
                int i21 = 27;
                if (cause instanceof IOException) {
                    if (cause instanceof x) {
                        q0Var3 = new q0(5, ((x) cause).d);
                    } else {
                        if ((cause instanceof w) || (cause instanceof s0)) {
                            q0Var = new q0(z12 ? 10 : 11, 0);
                        } else {
                            boolean z13 = cause instanceof v;
                            if (z13 || (cause instanceof g2.d0)) {
                                if (u.a(context).b() == 1) {
                                    q0Var = new q0(3, 0);
                                } else {
                                    Throwable cause2 = cause.getCause();
                                    q0Var = cause2 instanceof UnknownHostException ? new q0(6, 0) : cause2 instanceof SocketTimeoutException ? new q0(7, 0) : (z13 && ((v) cause).c == 1) ? new q0(4, 0) : new q0(8, 0);
                                }
                            } else if (i19 == 1002) {
                                q0Var = new q0(21, 0);
                            } else if (cause instanceof n2.f) {
                                Throwable cause3 = cause.getCause();
                                cause3.getClass();
                                if (cause3 instanceof MediaDrm.MediaDrmStateException) {
                                    int y3 = d0.y(((MediaDrm.MediaDrmStateException) cause3).getDiagnosticInfo());
                                    switch (d0.x(y3)) {
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
                                    q0Var3 = new q0(i21, y3);
                                } else {
                                    q0Var = e.g(cause3) ? new q0(27, 0) : cause3 instanceof NotProvisionedException ? new q0(24, 0) : cause3 instanceof DeniedByServerException ? new q0(29, 0) : cause3 instanceof n2.w ? new q0(23, 0) : cause3 instanceof n2.c ? new q0(28, 0) : new q0(30, 0);
                                }
                            } else if ((cause instanceof g2.s) && (cause.getCause() instanceof FileNotFoundException)) {
                                Throwable cause4 = cause.getCause();
                                cause4.getClass();
                                Throwable cause5 = cause4.getCause();
                                q0Var = ((cause5 instanceof ErrnoException) && ((ErrnoException) cause5).errno == OsConstants.EACCES) ? new q0(32, 0) : new q0(31, 0);
                            } else {
                                q0Var = new q0(9, 0);
                            }
                        }
                        i11 = 13;
                        this.b.execute(new j4(i20, this, new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(elapsedRealtime - this.e).setErrorCode(q0Var.a).setSubErrorCode(q0Var.b).setException(u0Var).build()));
                        i12 = 1;
                        this.R = true;
                        this.E = null;
                    }
                    q0Var = q0Var3;
                } else {
                    if (z10 && (i10 == 0 || i10 == 1)) {
                        q0Var = new q0(35, 0);
                    } else if (z10 && i10 == 3) {
                        q0Var = new q0(15, 0);
                    } else if (z10 && i10 == 2) {
                        q0Var = new q0(23, 0);
                    } else {
                        if (cause instanceof p) {
                            i11 = 13;
                            q0Var2 = new q0(13, d0.y(((p) cause).d));
                        } else {
                            i11 = 13;
                            if (cause instanceof n) {
                                q0Var2 = new q0(14, ((n) cause).a);
                            } else {
                                if (cause instanceof OutOfMemoryError) {
                                    q0Var = new q0(14, 0);
                                } else if (cause instanceof m) {
                                    q0Var2 = new q0(17, ((m) cause).a);
                                } else if (cause instanceof k2.o) {
                                    q0Var2 = new q0(18, ((k2.o) cause).a);
                                } else if (cause instanceof MediaCodec.CryptoException) {
                                    int errorCode = ((MediaCodec.CryptoException) cause).getErrorCode();
                                    switch (d0.x(errorCode)) {
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
                                    q0Var2 = new q0(i21, errorCode);
                                } else {
                                    q0Var = new q0(22, 0);
                                }
                                this.b.execute(new j4(i20, this, new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(elapsedRealtime - this.e).setErrorCode(q0Var.a).setSubErrorCode(q0Var.b).setException(u0Var).build()));
                                i12 = 1;
                                this.R = true;
                                this.E = null;
                            }
                        }
                        q0Var = q0Var2;
                        this.b.execute(new j4(i20, this, new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(elapsedRealtime - this.e).setErrorCode(q0Var.a).setSubErrorCode(q0Var.b).setException(u0Var).build()));
                        i12 = 1;
                        this.R = true;
                        this.E = null;
                    }
                    i11 = 13;
                    this.b.execute(new j4(i20, this, new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(elapsedRealtime - this.e).setErrorCode(q0Var.a).setSubErrorCode(q0Var.b).setException(u0Var).build()));
                    i12 = 1;
                    this.R = true;
                    this.E = null;
                }
            }
            i11 = 13;
            this.b.execute(new j4(i20, this, new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(elapsedRealtime - this.e).setErrorCode(q0Var.a).setSubErrorCode(q0Var.b).setException(u0Var).build()));
            i12 = 1;
            this.R = true;
            this.E = null;
        }
        if (bVar.z(2)) {
            s1 g02 = b1Var.g0();
            boolean a10 = g02.a(2);
            boolean a11 = g02.a(i12);
            boolean a12 = g02.a(3);
            if (a10 || a11 || a12) {
                if (a10) {
                    sVar = null;
                } else {
                    sVar = null;
                    if (!Objects.equals(this.I, null)) {
                        int i22 = this.I == null ? 1 : 0;
                        this.I = null;
                        i13 = 10;
                        u(1, elapsedRealtime, null, i22);
                        if (!a11 && !Objects.equals(this.J, sVar)) {
                            int i23 = this.J != null ? 1 : 0;
                            this.J = sVar;
                            u(0, elapsedRealtime, sVar, i23);
                        }
                        if (!a12 && !Objects.equals(this.K, sVar)) {
                            int i24 = this.K != null ? 1 : 0;
                            this.K = sVar;
                            u(2, elapsedRealtime, sVar, i24);
                        }
                        r11 = sVar;
                        if (n(this.F)) {
                            a5.a aVar3 = this.F;
                            s sVar2 = (s) aVar3.d;
                            if (sVar2.z != -1) {
                                int i25 = aVar3.b;
                                if (!Objects.equals(this.I, sVar2)) {
                                    int i26 = (this.I == null && i25 == 0) ? 1 : i25;
                                    this.I = sVar2;
                                    u(1, elapsedRealtime, sVar2, i26);
                                }
                                this.F = r11;
                            }
                        }
                        if (n(this.G)) {
                            a5.a aVar4 = this.G;
                            s sVar3 = (s) aVar4.d;
                            int i27 = aVar4.b;
                            if (!Objects.equals(this.J, sVar3)) {
                                int i28 = (this.J == null && i27 == 0) ? 1 : i27;
                                this.J = sVar3;
                                u(0, elapsedRealtime, sVar3, i28);
                            }
                            this.G = r11;
                        }
                        if (n(this.H)) {
                            a5.a aVar5 = this.H;
                            s sVar4 = (s) aVar5.d;
                            int i29 = aVar5.b;
                            if (!Objects.equals(this.K, sVar4)) {
                                int i30 = (this.K == null && i29 == 0) ? 1 : i29;
                                this.K = sVar4;
                                u(2, elapsedRealtime, sVar4, i30);
                            }
                            this.H = r11;
                        }
                        switch (u.a(this.a).b()) {
                            case 0:
                                i14 = 0;
                                break;
                            case 1:
                                i14 = 9;
                                break;
                            case 2:
                                i14 = 2;
                                break;
                            case 3:
                                i14 = 4;
                                break;
                            case 4:
                                i14 = 5;
                                break;
                            case 5:
                                i14 = 6;
                                break;
                            case 6:
                            case 8:
                            default:
                                i14 = 1;
                                break;
                            case 7:
                                i14 = 3;
                                break;
                            case 9:
                                i14 = 8;
                                break;
                            case 10:
                                i14 = 7;
                                break;
                        }
                        if (i14 != this.y) {
                            this.y = i14;
                            this.b.execute(new j4(20, this, new NetworkEvent.Builder().setNetworkType(i14).setTimeSinceCreatedMillis(elapsedRealtime - this.e).build()));
                        }
                        if (b1Var.d() != 2) {
                            this.L = false;
                        }
                        if (b1Var.W() == null) {
                            this.N = false;
                        } else if (bVar.z(i13)) {
                            this.N = true;
                        }
                        int d = b1Var.d();
                        if (this.L) {
                            z11 = true;
                            i11 = 5;
                        } else {
                            if (!this.N) {
                                i11 = 4;
                                if (d == 4) {
                                    z11 = true;
                                    i11 = 11;
                                } else if (d == 2) {
                                    int i31 = this.x;
                                    if (i31 == 0 || i31 == 2 || i31 == 12) {
                                        z11 = true;
                                        i11 = 2;
                                    } else if (b1Var.u()) {
                                        z11 = true;
                                        i11 = b1Var.u0() != 0 ? 10 : 6;
                                    } else {
                                        z11 = true;
                                        i11 = 7;
                                    }
                                } else if (d != 3) {
                                    z11 = true;
                                    i11 = (d != 1 || this.x == 0) ? this.x : 12;
                                } else if (b1Var.u()) {
                                    z11 = true;
                                    i11 = b1Var.u0() != 0 ? 9 : 3;
                                }
                            }
                            z11 = true;
                        }
                        if (this.x != i11) {
                            this.x = i11;
                            this.R = z11;
                            this.b.execute(new j4(23, this, new PlaybackStateEvent.Builder().setState(this.x).setTimeSinceCreatedMillis(elapsedRealtime - this.e).build()));
                        }
                        if (bVar.z(1028)) {
                            h hVar2 = this.c;
                            a aVar6 = (a) ((SparseArray) bVar.c).get(1028);
                            aVar6.getClass();
                            hVar2.b(aVar6);
                            return;
                        }
                        return;
                    }
                }
                i13 = 10;
                if (!a11) {
                    if (this.J != null) {
                    }
                    this.J = sVar;
                    u(0, elapsedRealtime, sVar, i23);
                }
                if (!a12) {
                    if (this.K != null) {
                    }
                    this.K = sVar;
                    u(2, elapsedRealtime, sVar, i24);
                }
                r11 = sVar;
                if (n(this.F)) {
                }
                if (n(this.G)) {
                }
                if (n(this.H)) {
                }
                switch (u.a(this.a).b()) {
                }
                if (i14 != this.y) {
                }
                if (b1Var.d() != 2) {
                }
                if (b1Var.W() == null) {
                }
                int d10 = b1Var.d();
                if (this.L) {
                }
                if (this.x != i11) {
                }
                if (bVar.z(1028)) {
                }
            }
        }
        i13 = 10;
        r11 = 0;
        if (n(this.F)) {
        }
        if (n(this.G)) {
        }
        if (n(this.H)) {
        }
        switch (u.a(this.a).b()) {
        }
        if (i14 != this.y) {
        }
        if (b1Var.d() != 2) {
        }
        if (b1Var.W() == null) {
        }
        int d102 = b1Var.d();
        if (this.L) {
        }
        if (this.x != i11) {
        }
        if (bVar.z(1028)) {
        }
    }

    @Override // j2.b
    public final void c(b0 b0Var) {
        this.M = b0Var.a;
    }

    @Override // j2.b
    public final void d(x1 x1Var) {
        a5.a aVar = this.F;
        if (aVar != null) {
            s sVar = (s) aVar.d;
            if (sVar.z == -1) {
                r a2 = sVar.a();
                a2.x = x1Var.a;
                a2.y = x1Var.b;
                this.F = new a5.a(new s(a2), aVar.b, (String) aVar.c, 9);
            }
        }
    }

    @Override // j2.b
    public final void e(a aVar, b0 b0Var) {
        f0 f0Var = aVar.d;
        if (f0Var == null) {
            return;
        }
        s sVar = b0Var.c;
        sVar.getClass();
        int i10 = b0Var.d;
        k1 k1Var = aVar.b;
        f0Var.getClass();
        a5.a aVar2 = new a5.a(sVar, i10, this.c.d(k1Var, f0Var), 9);
        int i11 = b0Var.b;
        if (i11 != 0) {
            if (i11 == 1) {
                this.G = aVar2;
                return;
            } else if (i11 != 2) {
                if (i11 != 3) {
                    return;
                }
                this.H = aVar2;
                return;
            }
        }
        this.F = aVar2;
    }

    @Override // j2.b
    public final void f(a aVar, int i10, long j3) {
        f0 f0Var = aVar.d;
        if (f0Var != null) {
            String d = this.c.d(aVar.b, f0Var);
            HashMap hashMap = this.r;
            Long l4 = (Long) hashMap.get(d);
            HashMap hashMap2 = this.n;
            Long l10 = (Long) hashMap2.get(d);
            hashMap.put(d, Long.valueOf((l4 == null ? 0L : l4.longValue()) + j3));
            hashMap2.put(d, Long.valueOf((l10 != null ? l10.longValue() : 0L) + i10));
        }
    }

    @Override // j2.b
    public final void g(a aVar, int i10) {
        if (i10 == 1) {
            this.L = true;
        }
        this.w = i10;
    }

    @Override // j2.b
    public final void h(u0 u0Var) {
        this.E = u0Var;
    }

    public final boolean n(a5.a aVar) {
        String str;
        if (aVar == null) {
            return false;
        }
        String str2 = (String) aVar.c;
        h hVar = this.c;
        synchronized (hVar) {
            str = hVar.f;
        }
        return str2.equals(str);
    }

    public final void p() {
        PlaybackMetrics.Builder builder = this.v;
        if (builder != null && this.R) {
            builder.setAudioUnderrunCount(this.Q);
            this.v.setVideoFramesDropped(this.O);
            this.v.setVideoFramesPlayed(this.P);
            Long l4 = (Long) this.n.get(this.s);
            this.v.setNetworkTransferDurationMillis(l4 == null ? 0L : l4.longValue());
            Long l10 = (Long) this.r.get(this.s);
            this.v.setNetworkBytesRead(l10 == null ? 0L : l10.longValue());
            this.v.setStreamSource((l10 == null || l10.longValue() <= 0) ? 0 : 1);
            this.b.execute(new j4(22, this, this.v.build()));
        }
        this.v = null;
        this.s = null;
        this.Q = 0;
        this.O = 0;
        this.P = 0;
        this.I = null;
        this.J = null;
        this.K = null;
        this.R = false;
    }

    public final LogSessionId q() {
        return this.d.getSessionId();
    }

    public final void r(k1 k1Var, f0 f0Var) {
        int b10;
        PlaybackMetrics.Builder builder = this.v;
        if (f0Var == null || (b10 = k1Var.b(f0Var.a)) == -1) {
            return;
        }
        h1 h1Var = this.h;
        int i10 = 0;
        k1Var.f(b10, h1Var, false);
        int i11 = h1Var.c;
        j1 j1Var = this.f;
        k1Var.n(i11, j1Var);
        b2.f0 f0Var2 = j1Var.c.b;
        if (f0Var2 != null) {
            int I = d0.I(f0Var2.a, f0Var2.b);
            i10 = I != 0 ? I != 1 ? I != 2 ? 1 : 4 : 5 : 3;
        }
        builder.setStreamType(i10);
        if (j1Var.m != -9223372036854775807L && !j1Var.k && !j1Var.i && !j1Var.a()) {
            builder.setMediaDurationMillis(d0.e0(j1Var.m));
        }
        builder.setPlaybackType(j1Var.a() ? 2 : 1);
        this.R = true;
    }

    public final void s(a aVar, String str) {
        f0 f0Var = aVar.d;
        if (f0Var == null || !f0Var.b()) {
            p();
            this.s = str;
            this.v = new PlaybackMetrics.Builder().setPlayerName("AndroidXMedia3").setPlayerVersion("1.8.1");
            r(aVar.b, f0Var);
        }
    }

    public final void t(a aVar, String str) {
        f0 f0Var = aVar.d;
        if ((f0Var == null || !f0Var.b()) && str.equals(this.s)) {
            p();
        }
        this.n.remove(str);
        this.r.remove(str);
    }

    public final void u(int i10, long j3, s sVar, int i11) {
        int i12;
        TrackChangeEvent.Builder timeSinceCreatedMillis = new TrackChangeEvent.Builder(i10).setTimeSinceCreatedMillis(j3 - this.e);
        if (sVar != null) {
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
            String str = sVar.q;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = sVar.r;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = sVar.k;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i13 = sVar.j;
            if (i13 != -1) {
                timeSinceCreatedMillis.setBitrate(i13);
            }
            int i14 = sVar.y;
            if (i14 != -1) {
                timeSinceCreatedMillis.setWidth(i14);
            }
            int i15 = sVar.z;
            if (i15 != -1) {
                timeSinceCreatedMillis.setHeight(i15);
            }
            int i16 = sVar.J;
            if (i16 != -1) {
                timeSinceCreatedMillis.setChannelCount(i16);
            }
            int i17 = sVar.K;
            if (i17 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i17);
            }
            String str4 = sVar.d;
            if (str4 != null) {
                String str5 = d0.a;
                String[] split = str4.split("-", -1);
                Pair create = Pair.create(split[0], split.length >= 2 ? split[1] : null);
                timeSinceCreatedMillis.setLanguage((String) create.first);
                Object obj = create.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f7 = sVar.C;
            if (f7 != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f7);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.R = true;
        this.b.execute(new j4(19, this, timeSinceCreatedMillis.build()));
    }

    @Override // j2.b
    public final /* synthetic */ void onRenderedFirstFrame(a aVar) {
    }

    @Override // j2.b
    public final /* synthetic */ void onSeekStarted(a aVar) {
    }
}
