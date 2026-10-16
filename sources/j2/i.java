package j2;

import android.content.Context;
import android.media.DeniedByServerException;
import android.media.MediaCodec;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
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
import b2.b2;
import b2.g1;
import b2.k0;
import b2.m1;
import b2.n;
import b2.o1;
import b2.p1;
import b2.t;
import b2.v;
import b2.v0;
import b2.v1;
import b2.w;
import b2.w1;
import b2.x;
import b2.x0;
import b2.z0;
import e2.m0;
import e9.l0;
import fi.q3;
import g2.d0;
import g2.s;
import i2.m;
import j$.util.Objects;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.Executor;
import k2.y;
import r2.p;
import u2.c0;
import u2.g0;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public final class i implements b {
    public z0 E;
    public a5.a F;
    public a5.a G;
    public a5.a H;
    public x I;
    public x J;
    public x K;
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
    public final Executor b = e2.a.e();
    public final o1 f = new o1();
    public final m1 h = new m1();
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
    public final void a(i2.e eVar) {
        this.O += eVar.g;
        this.P += eVar.e;
    }

    @Override // j2.b
    public final void b(c0 c0Var) {
        this.M = c0Var.a;
    }

    @Override // j2.b
    public final void c(b2 b2Var) {
        a5.a aVar = this.F;
        if (aVar != null) {
            x xVar = (x) aVar.d;
            if (xVar.A == -1) {
                w a2 = xVar.a();
                a2.y = b2Var.a;
                a2.z = b2Var.b;
                this.F = new a5.a(new x(a2), aVar.b, (String) aVar.c, 9);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0422  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0424  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x043a  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x043c  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x044c  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x047b  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x04a5  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x04d4  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x04ee  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0518  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0520  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0534  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0588  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x05b6  */
    /* JADX WARN: Removed duplicated region for block: B:187:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0537  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0523  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x04d6  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x04d9  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x04dc  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x04de  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x04e0  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x04e2  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x04e4  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x04e6  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x04e9  */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9, types: [a5.a] */
    @Override // j2.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(g1 g1Var, qf.b bVar) {
        boolean z10;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        v0 v0Var;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        ?? r11;
        int i22;
        int i23;
        boolean z11;
        x xVar;
        t tVar;
        int i24;
        if (((v) bVar.b).a.size() == 0) {
            return;
        }
        for (int i25 = 0; i25 < ((v) bVar.b).a.size(); i25++) {
            int a2 = ((v) bVar.b).a(i25);
            a aVar = (a) ((SparseArray) bVar.c).get(a2);
            aVar.getClass();
            if (a2 == 0) {
                h hVar = this.c;
                synchronized (hVar) {
                    try {
                        hVar.d.getClass();
                        p1 p1Var = hVar.e;
                        hVar.e = aVar.b;
                        Iterator it = hVar.c.values().iterator();
                        while (it.hasNext()) {
                            g gVar = (g) it.next();
                            if (gVar.b(p1Var, hVar.e) && !gVar.a(aVar)) {
                            }
                            it.remove();
                            if (gVar.a.equals(hVar.f)) {
                                hVar.a(gVar);
                            }
                            if (gVar.e) {
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
        if (bVar.y(0)) {
            a aVar2 = (a) ((SparseArray) bVar.c).get(0);
            aVar2.getClass();
            if (this.v != null) {
                r(aVar2.b, aVar2.d);
            }
        }
        if (bVar.y(2) && this.v != null) {
            l0 listIterator = g1Var.h0().a.listIterator(0);
            loop2: while (true) {
                if (!listIterator.hasNext()) {
                    tVar = null;
                    break;
                }
                v1 v1Var = (v1) listIterator.next();
                for (int i26 = 0; i26 < v1Var.a; i26++) {
                    if (v1Var.e[i26] && (tVar = v1Var.b.d[i26].w) != null) {
                        break loop2;
                    }
                }
            }
            if (tVar != null) {
                PlaybackMetrics.Builder builder = this.v;
                String str = m0.a;
                int i27 = 0;
                while (true) {
                    if (i27 >= tVar.d) {
                        i24 = 1;
                        break;
                    }
                    UUID uuid = tVar.a[i27].b;
                    if (uuid.equals(n.e)) {
                        i24 = 3;
                        break;
                    } else if (uuid.equals(n.f)) {
                        i24 = 2;
                        break;
                    } else {
                        if (uuid.equals(n.d)) {
                            i24 = 6;
                            break;
                        }
                        i27++;
                    }
                }
                builder.setDrmType(i24);
            }
        }
        if (bVar.y(1011)) {
            this.Q++;
        }
        z0 z0Var = this.E;
        if (z0Var == null) {
            i19 = 2;
            i18 = 1;
            i11 = 6;
            i15 = 13;
            i12 = 9;
            i13 = 8;
            i14 = 7;
        } else {
            int i28 = z0Var.a;
            Context context = this.a;
            boolean z12 = this.M == 4;
            if (i28 == 1001) {
                v0Var = new v0(20, 0);
            } else {
                if (z0Var instanceof m) {
                    m mVar = (m) z0Var;
                    z10 = mVar.s == 1;
                    i10 = mVar.y;
                } else {
                    z10 = false;
                    i10 = 0;
                }
                Throwable cause = z0Var.getCause();
                cause.getClass();
                int i29 = 27;
                if (!(cause instanceof IOException)) {
                    i11 = 6;
                    i12 = 9;
                    i13 = 8;
                    i14 = 7;
                    if (z10 && (i10 == 0 || i10 == 1)) {
                        v0Var = new v0(35, 0);
                    } else if (z10 && i10 == 3) {
                        v0Var = new v0(15, 0);
                    } else if (z10 && i10 == 2) {
                        v0Var = new v0(23, 0);
                    } else {
                        if (cause instanceof p) {
                            i15 = 13;
                            v0Var = new v0(13, m0.A(((p) cause).d));
                        } else {
                            i15 = 13;
                            if (cause instanceof r2.n) {
                                v0Var = new v0(14, ((r2.n) cause).a);
                            } else if (cause instanceof OutOfMemoryError) {
                                v0Var = new v0(14, 0);
                            } else if (cause instanceof k2.w) {
                                v0Var = new v0(17, 0);
                            } else if (cause instanceof y) {
                                v0Var = new v0(18, ((y) cause).a);
                            } else if (cause instanceof MediaCodec.CryptoException) {
                                int errorCode = ((MediaCodec.CryptoException) cause).getErrorCode();
                                switch (m0.z(errorCode)) {
                                    case 6002:
                                        i29 = 24;
                                        break;
                                    case 6003:
                                        i29 = 28;
                                        break;
                                    case 6004:
                                        i29 = 25;
                                        break;
                                    case 6005:
                                        i29 = 26;
                                        break;
                                }
                                v0Var = new v0(i29, errorCode);
                            } else {
                                v0Var = new v0(22, 0);
                            }
                        }
                        this.b.execute(new q3(23, this, new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(elapsedRealtime - this.e).setErrorCode(v0Var.a).setSubErrorCode(v0Var.b).setException(z0Var).build()));
                        i18 = 1;
                        this.R = true;
                        this.E = null;
                        i19 = 2;
                    }
                    i15 = 13;
                    this.b.execute(new q3(23, this, new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(elapsedRealtime - this.e).setErrorCode(v0Var.a).setSubErrorCode(v0Var.b).setException(z0Var).build()));
                    i18 = 1;
                    this.R = true;
                    this.E = null;
                    i19 = 2;
                } else if (cause instanceof g2.x) {
                    v0Var = new v0(5, ((g2.x) cause).c);
                } else {
                    if ((cause instanceof g2.w) || (cause instanceof x0)) {
                        i16 = 7;
                        i11 = 6;
                        i17 = 8;
                        i12 = 9;
                        v0Var = new v0(z12 ? 10 : 11, 0);
                    } else {
                        boolean z13 = cause instanceof g2.v;
                        if (z13 || (cause instanceof d0)) {
                            i12 = 9;
                            if (e2.w.a(context).b() == 1) {
                                v0Var = new v0(3, 0);
                            } else {
                                Throwable cause2 = cause.getCause();
                                if (cause2 instanceof UnknownHostException) {
                                    i11 = 6;
                                    v0Var = new v0(6, 0);
                                    i15 = 13;
                                    i13 = 8;
                                    i14 = 7;
                                    this.b.execute(new q3(23, this, new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(elapsedRealtime - this.e).setErrorCode(v0Var.a).setSubErrorCode(v0Var.b).setException(z0Var).build()));
                                    i18 = 1;
                                    this.R = true;
                                    this.E = null;
                                    i19 = 2;
                                } else {
                                    i11 = 6;
                                    if (cause2 instanceof SocketTimeoutException) {
                                        i16 = 7;
                                        v0Var = new v0(7, 0);
                                    } else {
                                        i16 = 7;
                                        if (z13 && ((g2.v) cause).b == 1) {
                                            v0Var = new v0(4, 0);
                                        } else {
                                            i17 = 8;
                                            v0Var = new v0(8, 0);
                                        }
                                    }
                                    i14 = i16;
                                    i15 = 13;
                                    i13 = 8;
                                    this.b.execute(new q3(23, this, new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(elapsedRealtime - this.e).setErrorCode(v0Var.a).setSubErrorCode(v0Var.b).setException(z0Var).build()));
                                    i18 = 1;
                                    this.R = true;
                                    this.E = null;
                                    i19 = 2;
                                }
                            }
                        } else if (i28 == 1002) {
                            v0Var = new v0(21, 0);
                        } else if (cause instanceof n2.f) {
                            Throwable cause3 = cause.getCause();
                            cause3.getClass();
                            if (cause3 instanceof MediaDrm.MediaDrmStateException) {
                                int A = m0.A(((MediaDrm.MediaDrmStateException) cause3).getDiagnosticInfo());
                                switch (m0.z(A)) {
                                    case 6002:
                                        i29 = 24;
                                        break;
                                    case 6003:
                                        i29 = 28;
                                        break;
                                    case 6004:
                                        i29 = 25;
                                        break;
                                    case 6005:
                                        i29 = 26;
                                        break;
                                }
                                v0Var = new v0(i29, A);
                            } else {
                                v0Var = cause3 instanceof MediaDrmResetException ? new v0(27, 0) : cause3 instanceof NotProvisionedException ? new v0(24, 0) : cause3 instanceof DeniedByServerException ? new v0(29, 0) : cause3 instanceof n2.x ? new v0(23, 0) : cause3 instanceof n2.c ? new v0(28, 0) : new v0(30, 0);
                            }
                        } else if ((cause instanceof s) && (cause.getCause() instanceof FileNotFoundException)) {
                            Throwable cause4 = cause.getCause();
                            cause4.getClass();
                            Throwable cause5 = cause4.getCause();
                            v0Var = ((cause5 instanceof ErrnoException) && ((ErrnoException) cause5).errno == OsConstants.EACCES) ? new v0(32, 0) : new v0(31, 0);
                        } else {
                            i12 = 9;
                            v0Var = new v0(9, 0);
                        }
                        i11 = 6;
                        i15 = 13;
                        i13 = 8;
                        i14 = 7;
                        this.b.execute(new q3(23, this, new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(elapsedRealtime - this.e).setErrorCode(v0Var.a).setSubErrorCode(v0Var.b).setException(z0Var).build()));
                        i18 = 1;
                        this.R = true;
                        this.E = null;
                        i19 = 2;
                    }
                    i14 = i16;
                    i13 = i17;
                    i15 = 13;
                    this.b.execute(new q3(23, this, new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(elapsedRealtime - this.e).setErrorCode(v0Var.a).setSubErrorCode(v0Var.b).setException(z0Var).build()));
                    i18 = 1;
                    this.R = true;
                    this.E = null;
                    i19 = 2;
                }
            }
            i11 = 6;
            i15 = 13;
            i12 = 9;
            i13 = 8;
            i14 = 7;
            this.b.execute(new q3(23, this, new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(elapsedRealtime - this.e).setErrorCode(v0Var.a).setSubErrorCode(v0Var.b).setException(z0Var).build()));
            i18 = 1;
            this.R = true;
            this.E = null;
            i19 = 2;
        }
        if (bVar.y(i19)) {
            w1 h02 = g1Var.h0();
            boolean a10 = h02.a(i19);
            boolean a11 = h02.a(i18);
            boolean a12 = h02.a(3);
            if (a10 || a11 || a12) {
                if (a10) {
                    i20 = i12;
                    xVar = null;
                } else {
                    xVar = null;
                    if (Objects.equals(this.I, null)) {
                        i20 = i12;
                    } else {
                        int i30 = this.I == null ? 1 : 0;
                        this.I = null;
                        i20 = i12;
                        i21 = 10;
                        u(1, elapsedRealtime, null, i30);
                        if (!a11 && !Objects.equals(this.J, xVar)) {
                            int i31 = this.J != null ? 1 : 0;
                            this.J = xVar;
                            u(0, elapsedRealtime, xVar, i31);
                        }
                        if (!a12 && !Objects.equals(this.K, xVar)) {
                            int i32 = this.K != null ? 1 : 0;
                            this.K = xVar;
                            u(2, elapsedRealtime, xVar, i32);
                        }
                        r11 = xVar;
                        if (n(this.F)) {
                            a5.a aVar3 = this.F;
                            x xVar2 = (x) aVar3.d;
                            if (xVar2.A != -1) {
                                int i33 = aVar3.b;
                                if (!Objects.equals(this.I, xVar2)) {
                                    int i34 = (this.I == null && i33 == 0) ? 1 : i33;
                                    this.I = xVar2;
                                    u(1, elapsedRealtime, xVar2, i34);
                                }
                                this.F = r11;
                            }
                        }
                        if (n(this.G)) {
                            a5.a aVar4 = this.G;
                            x xVar3 = (x) aVar4.d;
                            int i35 = aVar4.b;
                            if (!Objects.equals(this.J, xVar3)) {
                                int i36 = (this.J == null && i35 == 0) ? 1 : i35;
                                this.J = xVar3;
                                u(0, elapsedRealtime, xVar3, i36);
                            }
                            this.G = r11;
                        }
                        if (n(this.H)) {
                            a5.a aVar5 = this.H;
                            x xVar4 = (x) aVar5.d;
                            int i37 = aVar5.b;
                            if (!Objects.equals(this.K, xVar4)) {
                                int i38 = (this.K == null && i37 == 0) ? 1 : i37;
                                this.K = xVar4;
                                u(2, elapsedRealtime, xVar4, i38);
                            }
                            this.H = r11;
                        }
                        switch (e2.w.a(this.a).b()) {
                            case 0:
                                i22 = 0;
                                break;
                            case 1:
                                i22 = i20;
                                break;
                            case 2:
                                i22 = 2;
                                break;
                            case 3:
                                i22 = 4;
                                break;
                            case 4:
                                i22 = 5;
                                break;
                            case 5:
                                i22 = i11;
                                break;
                            case 6:
                            case 8:
                            default:
                                i22 = 1;
                                break;
                            case 7:
                                i22 = 3;
                                break;
                            case 9:
                                i22 = i13;
                                break;
                            case 10:
                                i22 = i14;
                                break;
                        }
                        if (i22 != this.y) {
                            this.y = i22;
                            this.b.execute(new q3(22, this, new NetworkEvent.Builder().setNetworkType(i22).setTimeSinceCreatedMillis(elapsedRealtime - this.e).build()));
                        }
                        if (g1Var.d() != 2) {
                            this.L = false;
                        }
                        if (g1Var.W() == null) {
                            this.N = false;
                        } else if (bVar.y(i21)) {
                            this.N = true;
                        }
                        int d = g1Var.d();
                        if (this.L) {
                            i23 = 5;
                        } else if (this.N) {
                            i23 = i15;
                        } else if (d == 4) {
                            i23 = 11;
                        } else {
                            i23 = 2;
                            if (d == 2) {
                                int i39 = this.x;
                                if (i39 != 0 && i39 != 2 && i39 != 12) {
                                    i23 = !g1Var.t() ? i14 : g1Var.w0() != 0 ? i21 : i11;
                                }
                            } else {
                                i23 = 3;
                                if (d != 3) {
                                    z11 = true;
                                    i23 = (d != 1 || this.x == 0) ? this.x : 12;
                                    if (this.x != i23) {
                                        this.x = i23;
                                        this.R = z11;
                                        this.b.execute(new q3(25, this, new PlaybackStateEvent.Builder().setState(this.x).setTimeSinceCreatedMillis(elapsedRealtime - this.e).build()));
                                    }
                                    if (bVar.y(1028)) {
                                        return;
                                    }
                                    h hVar2 = this.c;
                                    a aVar6 = (a) ((SparseArray) bVar.c).get(1028);
                                    aVar6.getClass();
                                    hVar2.b(aVar6);
                                    return;
                                }
                                if (!g1Var.t()) {
                                    i23 = 4;
                                } else if (g1Var.w0() != 0) {
                                    i23 = i20;
                                }
                            }
                        }
                        z11 = true;
                        if (this.x != i23) {
                        }
                        if (bVar.y(1028)) {
                        }
                    }
                }
                i21 = 10;
                if (!a11) {
                    if (this.J != null) {
                    }
                    this.J = xVar;
                    u(0, elapsedRealtime, xVar, i31);
                }
                if (!a12) {
                    if (this.K != null) {
                    }
                    this.K = xVar;
                    u(2, elapsedRealtime, xVar, i32);
                }
                r11 = xVar;
                if (n(this.F)) {
                }
                if (n(this.G)) {
                }
                if (n(this.H)) {
                }
                switch (e2.w.a(this.a).b()) {
                }
                if (i22 != this.y) {
                }
                if (g1Var.d() != 2) {
                }
                if (g1Var.W() == null) {
                }
                int d10 = g1Var.d();
                if (this.L) {
                }
                z11 = true;
                if (this.x != i23) {
                }
                if (bVar.y(1028)) {
                }
            }
        }
        i20 = i12;
        i21 = 10;
        r11 = 0;
        if (n(this.F)) {
        }
        if (n(this.G)) {
        }
        if (n(this.H)) {
        }
        switch (e2.w.a(this.a).b()) {
        }
        if (i22 != this.y) {
        }
        if (g1Var.d() != 2) {
        }
        if (g1Var.W() == null) {
        }
        int d102 = g1Var.d();
        if (this.L) {
        }
        z11 = true;
        if (this.x != i23) {
        }
        if (bVar.y(1028)) {
        }
    }

    @Override // j2.b
    public final void e(a aVar, c0 c0Var) {
        g0 g0Var = aVar.d;
        if (g0Var == null) {
            return;
        }
        x xVar = c0Var.c;
        xVar.getClass();
        int i10 = c0Var.d;
        p1 p1Var = aVar.b;
        g0Var.getClass();
        a5.a aVar2 = new a5.a(xVar, i10, this.c.d(p1Var, g0Var), 9);
        int i11 = c0Var.b;
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
    public final void f(a aVar, int i10, long j10) {
        g0 g0Var = aVar.d;
        if (g0Var != null) {
            String d = this.c.d(aVar.b, g0Var);
            HashMap hashMap = this.r;
            Long l4 = (Long) hashMap.get(d);
            HashMap hashMap2 = this.n;
            Long l10 = (Long) hashMap2.get(d);
            hashMap.put(d, Long.valueOf((l4 == null ? 0L : l4.longValue()) + j10));
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
    public final void h(z0 z0Var) {
        this.E = z0Var;
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
            this.b.execute(new q3(24, this, this.v.build()));
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

    public final void r(p1 p1Var, g0 g0Var) {
        int b10;
        PlaybackMetrics.Builder builder = this.v;
        if (g0Var == null || (b10 = p1Var.b(g0Var.a)) == -1) {
            return;
        }
        m1 m1Var = this.h;
        int i10 = 0;
        p1Var.f(b10, m1Var, false);
        int i11 = m1Var.c;
        o1 o1Var = this.f;
        p1Var.n(i11, o1Var);
        k0 k0Var = o1Var.c.b;
        if (k0Var != null) {
            int K = m0.K(k0Var.a, k0Var.b);
            i10 = K != 0 ? K != 1 ? K != 2 ? 1 : 4 : 5 : 3;
        }
        builder.setStreamType(i10);
        if (o1Var.m != -9223372036854775807L && !o1Var.k && !o1Var.i && !o1Var.a()) {
            builder.setMediaDurationMillis(m0.h0(o1Var.m));
        }
        builder.setPlaybackType(o1Var.a() ? 2 : 1);
        this.R = true;
    }

    public final void s(a aVar, String str) {
        g0 g0Var = aVar.d;
        if (g0Var == null || !g0Var.b()) {
            p();
            this.s = str;
            this.v = new PlaybackMetrics.Builder().setPlayerName("AndroidXMedia3").setPlayerVersion("1.10.1");
            r(aVar.b, g0Var);
        }
    }

    public final void t(a aVar, String str) {
        g0 g0Var = aVar.d;
        if ((g0Var == null || !g0Var.b()) && str.equals(this.s)) {
            p();
        }
        this.n.remove(str);
        this.r.remove(str);
    }

    public final void u(int i10, long j10, x xVar, int i11) {
        int i12;
        TrackChangeEvent.Builder timeSinceCreatedMillis = new TrackChangeEvent.Builder(i10).setTimeSinceCreatedMillis(j10 - this.e);
        if (xVar != null) {
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
            String str = xVar.r;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = xVar.s;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = xVar.k;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i13 = xVar.j;
            if (i13 != -1) {
                timeSinceCreatedMillis.setBitrate(i13);
            }
            int i14 = xVar.z;
            if (i14 != -1) {
                timeSinceCreatedMillis.setWidth(i14);
            }
            int i15 = xVar.A;
            if (i15 != -1) {
                timeSinceCreatedMillis.setHeight(i15);
            }
            int i16 = xVar.K;
            if (i16 != -1) {
                timeSinceCreatedMillis.setChannelCount(i16);
            }
            int i17 = xVar.L;
            if (i17 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i17);
            }
            String str4 = xVar.d;
            if (str4 != null) {
                String str5 = m0.a;
                String[] split = str4.split("-", -1);
                Pair create = Pair.create(split[0], split.length >= 2 ? split[1] : null);
                timeSinceCreatedMillis.setLanguage((String) create.first);
                Object obj = create.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f7 = xVar.D;
            if (f7 != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f7);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.R = true;
        this.b.execute(new q3(21, this, timeSinceCreatedMillis.build()));
    }

    @Override // j2.b
    public final /* synthetic */ void onRenderedFirstFrame(a aVar) {
    }

    @Override // j2.b
    public final /* synthetic */ void onSeekStarted(a aVar) {
    }
}
