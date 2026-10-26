package j2;

import a8.ng;
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
import e2.n0;
import g2.d0;
import hi.u2;
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
import k2.z;
import n4.s;
import r2.p;
import u2.c0;
import u2.g0;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class h implements b {
    public z0 E;
    public ng F;
    public ng G;
    public ng H;
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
    public final g c;
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

    public h(Context context, PlaybackSession playbackSession) {
        this.a = context.getApplicationContext();
        this.d = playbackSession;
        g gVar = new g();
        this.c = gVar;
        gVar.d = this;
    }

    public static h o(Context context) {
        MediaMetricsManager mediaMetricsManager = (MediaMetricsManager) context.getSystemService("media_metrics");
        if (mediaMetricsManager == null) {
            return null;
        }
        return new h(context, mediaMetricsManager.createPlaybackSession());
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
        ng ngVar = this.F;
        if (ngVar != null) {
            x xVar = (x) ngVar.c;
            if (xVar.A == -1) {
                w a2 = xVar.a();
                a2.y = b2Var.a;
                a2.z = b2Var.b;
                this.F = new ng(new x(a2), ngVar.b, (String) ngVar.d);
            }
        }
    }

    @Override // j2.b
    public final void d(a aVar, c0 c0Var) {
        g0 g0Var = aVar.d;
        if (g0Var == null) {
            return;
        }
        x xVar = c0Var.c;
        xVar.getClass();
        int i10 = c0Var.d;
        p1 p1Var = aVar.b;
        g0Var.getClass();
        ng ngVar = new ng(xVar, i10, this.c.d(p1Var, g0Var));
        int i11 = c0Var.b;
        if (i11 != 0) {
            if (i11 == 1) {
                this.G = ngVar;
                return;
            } else if (i11 != 2) {
                if (i11 != 3) {
                    return;
                }
                this.H = ngVar;
                return;
            }
        }
        this.F = ngVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0471  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x04a0  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x04ca  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x04f9  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0513  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x053d  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0545  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x055d  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x05b3  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x05e1  */
    /* JADX WARN: Removed duplicated region for block: B:186:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0561  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x054a  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x04fb  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x04fe  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0501  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0503  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0506  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0508  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x050a  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x050c  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x050e  */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v25, types: [a8.ng] */
    /* JADX WARN: Type inference failed for: r8v42 */
    @Override // j2.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(g1 g1Var, s sVar) {
        int i10;
        boolean z10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        v0 v0Var;
        v0 v0Var2;
        int i17;
        int i18;
        int i19;
        int i20;
        v0 v0Var3;
        int i21;
        int i22;
        int i23;
        ?? r82;
        int i24;
        int i25;
        int i26;
        boolean z11;
        x xVar;
        t tVar;
        int i27;
        if (((v) sVar.b).a.size() == 0) {
            return;
        }
        for (int i28 = 0; i28 < ((v) sVar.b).a.size(); i28++) {
            int a2 = ((v) sVar.b).a(i28);
            a aVar = (a) ((SparseArray) sVar.c).get(a2);
            aVar.getClass();
            if (a2 == 0) {
                g gVar = this.c;
                synchronized (gVar) {
                    try {
                        gVar.d.getClass();
                        p1 p1Var = gVar.e;
                        gVar.e = aVar.b;
                        Iterator it = gVar.c.values().iterator();
                        while (it.hasNext()) {
                            f fVar = (f) it.next();
                            if (fVar.b(p1Var, gVar.e) && !fVar.a(aVar)) {
                            }
                            it.remove();
                            if (fVar.a.equals(gVar.f)) {
                                gVar.a(fVar);
                            }
                            if (fVar.e) {
                                gVar.d.t(aVar, fVar.a);
                            }
                        }
                        gVar.e(aVar);
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
        if (sVar.e(0)) {
            a aVar2 = (a) ((SparseArray) sVar.c).get(0);
            aVar2.getClass();
            if (this.v != null) {
                r(aVar2.b, aVar2.d);
            }
        }
        if (sVar.e(2) && this.v != null) {
            f9.g0 listIterator = g1Var.h0().a.listIterator(0);
            loop2: while (true) {
                if (!listIterator.hasNext()) {
                    tVar = null;
                    break;
                }
                v1 v1Var = (v1) listIterator.next();
                for (int i29 = 0; i29 < v1Var.a; i29++) {
                    if (v1Var.e[i29] && (tVar = v1Var.b.d[i29].w) != null) {
                        break loop2;
                    }
                }
            }
            if (tVar != null) {
                PlaybackMetrics.Builder builder = this.v;
                String str = n0.a;
                int i30 = 0;
                while (true) {
                    if (i30 >= tVar.d) {
                        i27 = 1;
                        break;
                    }
                    UUID uuid = tVar.a[i30].b;
                    if (uuid.equals(n.e)) {
                        i27 = 3;
                        break;
                    } else if (uuid.equals(n.f)) {
                        i27 = 2;
                        break;
                    } else {
                        if (uuid.equals(n.d)) {
                            i27 = 6;
                            break;
                        }
                        i30++;
                    }
                }
                builder.setDrmType(i27);
            }
        }
        if (sVar.e(1011)) {
            this.Q++;
        }
        z0 z0Var = this.E;
        if (z0Var == null) {
            i13 = 4;
            i22 = 2;
            i21 = 1;
            i16 = 13;
            i11 = 9;
            i12 = 8;
            i14 = 7;
            i15 = 6;
        } else {
            int i31 = z0Var.a;
            Context context = this.a;
            boolean z12 = this.M == 4;
            if (i31 == 1001) {
                v0Var = new v0(20, 0);
            } else {
                if (z0Var instanceof m) {
                    m mVar = (m) z0Var;
                    z10 = mVar.s == 1;
                    i10 = mVar.y;
                } else {
                    i10 = 0;
                    z10 = false;
                }
                Throwable cause = z0Var.getCause();
                cause.getClass();
                int i32 = 27;
                if (cause instanceof IOException) {
                    if (cause instanceof g2.x) {
                        v0Var3 = new v0(5, ((g2.x) cause).c);
                    } else {
                        if ((cause instanceof g2.w) || (cause instanceof x0)) {
                            i17 = 7;
                            i18 = 6;
                            i19 = 4;
                            i20 = 8;
                            i11 = 9;
                            v0Var = new v0(z12 ? 10 : 11, 0);
                        } else {
                            boolean z13 = cause instanceof g2.v;
                            if (z13 || (cause instanceof d0)) {
                                i11 = 9;
                                if (e2.w.a(context).b() == 1) {
                                    v0Var = new v0(3, 0);
                                } else {
                                    Throwable cause2 = cause.getCause();
                                    if (cause2 instanceof UnknownHostException) {
                                        v0Var = new v0(6, 0);
                                        i15 = 6;
                                        i16 = 13;
                                        i12 = 8;
                                        i13 = 4;
                                        i14 = 7;
                                    } else {
                                        i18 = 6;
                                        if (cause2 instanceof SocketTimeoutException) {
                                            v0Var = new v0(7, 0);
                                            i14 = 7;
                                            i15 = 6;
                                            i16 = 13;
                                            i12 = 8;
                                            i13 = 4;
                                        } else {
                                            i17 = 7;
                                            if (z13 && ((g2.v) cause).b == 1) {
                                                v0Var = new v0(4, 0);
                                                i14 = 7;
                                                i15 = 6;
                                                i13 = 4;
                                                i16 = 13;
                                                i12 = 8;
                                            } else {
                                                i19 = 4;
                                                i20 = 8;
                                                v0Var = new v0(8, 0);
                                            }
                                        }
                                    }
                                    this.b.execute(new u2(17, this, new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(elapsedRealtime - this.e).setErrorCode(v0Var.a).setSubErrorCode(v0Var.b).setException(z0Var).build()));
                                    i21 = 1;
                                    this.R = true;
                                    this.E = null;
                                    i22 = 2;
                                }
                            } else if (i31 == 1002) {
                                v0Var = new v0(21, 0);
                            } else if (cause instanceof n2.f) {
                                Throwable cause3 = cause.getCause();
                                cause3.getClass();
                                if (cause3 instanceof MediaDrm.MediaDrmStateException) {
                                    int A = n0.A(((MediaDrm.MediaDrmStateException) cause3).getDiagnosticInfo());
                                    switch (n0.z(A)) {
                                        case 6002:
                                            i32 = 24;
                                            break;
                                        case 6003:
                                            i32 = 28;
                                            break;
                                        case 6004:
                                            i32 = 25;
                                            break;
                                        case 6005:
                                            i32 = 26;
                                            break;
                                    }
                                    v0Var3 = new v0(i32, A);
                                } else {
                                    v0Var = cause3 instanceof MediaDrmResetException ? new v0(27, 0) : cause3 instanceof NotProvisionedException ? new v0(24, 0) : cause3 instanceof DeniedByServerException ? new v0(29, 0) : cause3 instanceof n2.x ? new v0(23, 0) : cause3 instanceof n2.c ? new v0(28, 0) : new v0(30, 0);
                                }
                            } else if ((cause instanceof g2.s) && (cause.getCause() instanceof FileNotFoundException)) {
                                Throwable cause4 = cause.getCause();
                                cause4.getClass();
                                Throwable cause5 = cause4.getCause();
                                v0Var = ((cause5 instanceof ErrnoException) && ((ErrnoException) cause5).errno == OsConstants.EACCES) ? new v0(32, 0) : new v0(31, 0);
                            } else {
                                i11 = 9;
                                v0Var = new v0(9, 0);
                            }
                            i16 = 13;
                            i12 = 8;
                            i13 = 4;
                            i14 = 7;
                            i15 = 6;
                            this.b.execute(new u2(17, this, new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(elapsedRealtime - this.e).setErrorCode(v0Var.a).setSubErrorCode(v0Var.b).setException(z0Var).build()));
                            i21 = 1;
                            this.R = true;
                            this.E = null;
                            i22 = 2;
                        }
                        i14 = i17;
                        i15 = i18;
                        i13 = i19;
                        i12 = i20;
                        i16 = 13;
                        this.b.execute(new u2(17, this, new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(elapsedRealtime - this.e).setErrorCode(v0Var.a).setSubErrorCode(v0Var.b).setException(z0Var).build()));
                        i21 = 1;
                        this.R = true;
                        this.E = null;
                        i22 = 2;
                    }
                    v0Var = v0Var3;
                } else {
                    i11 = 9;
                    i12 = 8;
                    i13 = 4;
                    i14 = 7;
                    i15 = 6;
                    if (z10 && (i10 == 0 || i10 == 1)) {
                        v0Var = new v0(35, 0);
                    } else if (z10 && i10 == 3) {
                        v0Var = new v0(15, 0);
                    } else if (z10 && i10 == 2) {
                        v0Var = new v0(23, 0);
                    } else {
                        if (cause instanceof p) {
                            i16 = 13;
                            v0Var2 = new v0(13, n0.A(((p) cause).d));
                        } else {
                            i16 = 13;
                            if (cause instanceof r2.n) {
                                v0Var = new v0(14, ((r2.n) cause).a);
                            } else if (cause instanceof OutOfMemoryError) {
                                v0Var = new v0(14, 0);
                            } else if (cause instanceof k2.x) {
                                v0Var = new v0(17, 0);
                            } else if (cause instanceof z) {
                                v0Var2 = new v0(18, ((z) cause).a);
                            } else if (cause instanceof MediaCodec.CryptoException) {
                                int errorCode = ((MediaCodec.CryptoException) cause).getErrorCode();
                                switch (n0.z(errorCode)) {
                                    case 6002:
                                        i32 = 24;
                                        break;
                                    case 6003:
                                        i32 = 28;
                                        break;
                                    case 6004:
                                        i32 = 25;
                                        break;
                                    case 6005:
                                        i32 = 26;
                                        break;
                                }
                                v0Var2 = new v0(i32, errorCode);
                            } else {
                                v0Var = new v0(22, 0);
                            }
                            this.b.execute(new u2(17, this, new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(elapsedRealtime - this.e).setErrorCode(v0Var.a).setSubErrorCode(v0Var.b).setException(z0Var).build()));
                            i21 = 1;
                            this.R = true;
                            this.E = null;
                            i22 = 2;
                        }
                        v0Var = v0Var2;
                        this.b.execute(new u2(17, this, new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(elapsedRealtime - this.e).setErrorCode(v0Var.a).setSubErrorCode(v0Var.b).setException(z0Var).build()));
                        i21 = 1;
                        this.R = true;
                        this.E = null;
                        i22 = 2;
                    }
                    i16 = 13;
                    this.b.execute(new u2(17, this, new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(elapsedRealtime - this.e).setErrorCode(v0Var.a).setSubErrorCode(v0Var.b).setException(z0Var).build()));
                    i21 = 1;
                    this.R = true;
                    this.E = null;
                    i22 = 2;
                }
            }
            i16 = 13;
            i11 = 9;
            i12 = 8;
            i13 = 4;
            i14 = 7;
            i15 = 6;
            this.b.execute(new u2(17, this, new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(elapsedRealtime - this.e).setErrorCode(v0Var.a).setSubErrorCode(v0Var.b).setException(z0Var).build()));
            i21 = 1;
            this.R = true;
            this.E = null;
            i22 = 2;
        }
        if (sVar.e(i22)) {
            w1 h02 = g1Var.h0();
            boolean a10 = h02.a(i22);
            boolean a11 = h02.a(i21);
            boolean a12 = h02.a(3);
            if (a10 || a11 || a12) {
                if (a10) {
                    i23 = i13;
                    xVar = null;
                } else {
                    xVar = null;
                    if (Objects.equals(this.I, null)) {
                        i23 = i13;
                    } else {
                        int i33 = this.I == null ? 1 : 0;
                        this.I = null;
                        i23 = i13;
                        u(1, elapsedRealtime, null, i33);
                    }
                }
                if (!a11 && !Objects.equals(this.J, xVar)) {
                    int i34 = this.J == null ? 1 : 0;
                    this.J = xVar;
                    u(0, elapsedRealtime, xVar, i34);
                }
                if (!a12 && !Objects.equals(this.K, xVar)) {
                    int i35 = this.K == null ? 1 : 0;
                    this.K = xVar;
                    u(2, elapsedRealtime, xVar, i35);
                }
                r82 = xVar;
                if (n(this.F)) {
                    ng ngVar = this.F;
                    x xVar2 = (x) ngVar.c;
                    if (xVar2.A != -1) {
                        int i36 = ngVar.b;
                        if (!Objects.equals(this.I, xVar2)) {
                            int i37 = (this.I == null && i36 == 0) ? 1 : i36;
                            this.I = xVar2;
                            u(1, elapsedRealtime, xVar2, i37);
                        }
                        this.F = r82;
                    }
                }
                if (n(this.G)) {
                    ng ngVar2 = this.G;
                    x xVar3 = (x) ngVar2.c;
                    int i38 = ngVar2.b;
                    if (!Objects.equals(this.J, xVar3)) {
                        int i39 = (this.J == null && i38 == 0) ? 1 : i38;
                        this.J = xVar3;
                        u(0, elapsedRealtime, xVar3, i39);
                    }
                    this.G = r82;
                }
                if (n(this.H)) {
                    ng ngVar3 = this.H;
                    x xVar4 = (x) ngVar3.c;
                    int i40 = ngVar3.b;
                    if (!Objects.equals(this.K, xVar4)) {
                        int i41 = (this.K == null && i40 == 0) ? 1 : i40;
                        this.K = xVar4;
                        u(2, elapsedRealtime, xVar4, i41);
                    }
                    this.H = r82;
                }
                switch (e2.w.a(this.a).b()) {
                    case 0:
                        i24 = 0;
                        break;
                    case 1:
                        i24 = i11;
                        break;
                    case 2:
                        i24 = 2;
                        break;
                    case 3:
                        i24 = i23;
                        break;
                    case 4:
                        i24 = 5;
                        break;
                    case 5:
                        i24 = i15;
                        break;
                    case 6:
                    case 8:
                    default:
                        i24 = 1;
                        break;
                    case 7:
                        i24 = 3;
                        break;
                    case 9:
                        i24 = i12;
                        break;
                    case 10:
                        i24 = i14;
                        break;
                }
                if (i24 != this.y) {
                    this.y = i24;
                    this.b.execute(new u2(16, this, new NetworkEvent.Builder().setNetworkType(i24).setTimeSinceCreatedMillis(elapsedRealtime - this.e).build()));
                }
                if (g1Var.d() != 2) {
                    this.L = false;
                }
                if (g1Var.W() != null) {
                    this.N = false;
                    i25 = 10;
                } else {
                    i25 = 10;
                    if (sVar.e(10)) {
                        this.N = true;
                    }
                }
                int d = g1Var.d();
                if (!this.L) {
                    i26 = 5;
                } else if (this.N) {
                    i26 = i16;
                } else if (d == i23) {
                    i26 = 11;
                } else {
                    i26 = 12;
                    if (d == 2) {
                        int i42 = this.x;
                        i26 = (i42 == 0 || i42 == 2 || i42 == 12) ? 2 : !g1Var.t() ? i14 : g1Var.w0() != 0 ? i25 : i15;
                    } else {
                        if (d != 3) {
                            z11 = true;
                            if (d != 1 || this.x == 0) {
                                i26 = this.x;
                            }
                            if (this.x != i26) {
                                this.x = i26;
                                this.R = z11;
                                this.b.execute(new u2(19, this, new PlaybackStateEvent.Builder().setState(this.x).setTimeSinceCreatedMillis(elapsedRealtime - this.e).build()));
                            }
                            if (sVar.e(1028)) {
                                g gVar2 = this.c;
                                a aVar3 = (a) ((SparseArray) sVar.c).get(1028);
                                aVar3.getClass();
                                gVar2.b(aVar3);
                                return;
                            }
                            return;
                        }
                        i26 = !g1Var.t() ? i23 : g1Var.w0() != 0 ? i11 : 3;
                    }
                }
                z11 = true;
                if (this.x != i26) {
                }
                if (sVar.e(1028)) {
                }
            }
        }
        i23 = i13;
        r82 = 0;
        if (n(this.F)) {
        }
        if (n(this.G)) {
        }
        if (n(this.H)) {
        }
        switch (e2.w.a(this.a).b()) {
        }
        if (i24 != this.y) {
        }
        if (g1Var.d() != 2) {
        }
        if (g1Var.W() != null) {
        }
        int d10 = g1Var.d();
        if (!this.L) {
        }
        z11 = true;
        if (this.x != i26) {
        }
        if (sVar.e(1028)) {
        }
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

    public final boolean n(ng ngVar) {
        String str;
        if (ngVar == null) {
            return false;
        }
        String str2 = (String) ngVar.d;
        g gVar = this.c;
        synchronized (gVar) {
            str = gVar.f;
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
            this.b.execute(new u2(18, this, this.v.build()));
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
            int K = n0.K(k0Var.a, k0Var.b);
            i10 = K != 0 ? K != 1 ? K != 2 ? 1 : 4 : 5 : 3;
        }
        builder.setStreamType(i10);
        if (o1Var.m != -9223372036854775807L && !o1Var.k && !o1Var.i && !o1Var.a()) {
            builder.setMediaDurationMillis(n0.h0(o1Var.m));
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
                String str5 = n0.a;
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
        this.b.execute(new u2(15, this, timeSinceCreatedMillis.build()));
    }

    @Override // j2.b
    public final /* synthetic */ void onRenderedFirstFrame(a aVar) {
    }

    @Override // j2.b
    public final /* synthetic */ void onSeekStarted(a aVar) {
    }
}
