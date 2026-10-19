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
import b2.a2;
import b2.f1;
import b2.j0;
import b2.l1;
import b2.m;
import b2.n1;
import b2.o1;
import b2.s;
import b2.u;
import b2.u0;
import b2.u1;
import b2.v;
import b2.v1;
import b2.w;
import b2.w0;
import b2.y0;
import e2.m0;
import e9.l0;
import g2.d0;
import g2.x;
import hi.t;
import i2.n;
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

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes.dex */
public final class i implements b {
    public y0 E;
    public a5.a F;
    public a5.a G;
    public a5.a H;
    public w I;
    public w J;
    public w K;
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
    public final n1 f = new n1();
    public final l1 h = new l1();
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
    public final void a(i2.f fVar) {
        this.O += fVar.g;
        this.P += fVar.e;
    }

    @Override // j2.b
    public final void b(c0 c0Var) {
        this.M = c0Var.a;
    }

    @Override // j2.b
    public final void c(a2 a2Var) {
        a5.a aVar = this.F;
        if (aVar != null) {
            w wVar = (w) aVar.d;
            if (wVar.A == -1) {
                v a2 = wVar.a();
                a2.y = a2Var.a;
                a2.z = a2Var.b;
                this.F = new a5.a(new w(a2), aVar.b, (String) aVar.c, 9);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:119:0x042b  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x042d  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0443  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0445  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0455  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0484  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x04ae  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x04dd  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x04f7  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0524  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x052c  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0540  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0594  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x05c2  */
    /* JADX WARN: Removed duplicated region for block: B:189:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0543  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x052f  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x051b  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x04df  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x04e2  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x04e5  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x04e7  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x04ea  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x04ec  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x04ee  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x04f0  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x04f2  */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23, types: [a5.a] */
    /* JADX WARN: Type inference failed for: r8v52 */
    @Override // j2.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(f1 f1Var, qf.b bVar) {
        boolean z10;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        u0 u0Var;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        ?? r82;
        int i21;
        int i22;
        int i23;
        boolean z11;
        w wVar;
        s sVar;
        int i24;
        if (((u) bVar.b).a.size() == 0) {
            return;
        }
        for (int i25 = 0; i25 < ((u) bVar.b).a.size(); i25++) {
            int a2 = ((u) bVar.b).a(i25);
            a aVar = (a) ((SparseArray) bVar.c).get(a2);
            aVar.getClass();
            if (a2 == 0) {
                h hVar = this.c;
                synchronized (hVar) {
                    try {
                        hVar.d.getClass();
                        o1 o1Var = hVar.e;
                        hVar.e = aVar.b;
                        Iterator it = hVar.c.values().iterator();
                        while (it.hasNext()) {
                            g gVar = (g) it.next();
                            if (gVar.b(o1Var, hVar.e) && !gVar.a(aVar)) {
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
        if (bVar.B(0)) {
            a aVar2 = (a) ((SparseArray) bVar.c).get(0);
            aVar2.getClass();
            if (this.v != null) {
                r(aVar2.b, aVar2.d);
            }
        }
        if (bVar.B(2) && this.v != null) {
            l0 listIterator = f1Var.h0().a.listIterator(0);
            loop2: while (true) {
                if (!listIterator.hasNext()) {
                    sVar = null;
                    break;
                }
                u1 u1Var = (u1) listIterator.next();
                for (int i26 = 0; i26 < u1Var.a; i26++) {
                    if (u1Var.e[i26] && (sVar = u1Var.b.d[i26].w) != null) {
                        break loop2;
                    }
                }
            }
            if (sVar != null) {
                PlaybackMetrics.Builder builder = this.v;
                String str = m0.a;
                int i27 = 0;
                while (true) {
                    if (i27 >= sVar.d) {
                        i24 = 1;
                        break;
                    }
                    UUID uuid = sVar.a[i27].b;
                    if (uuid.equals(m.e)) {
                        i24 = 3;
                        break;
                    } else if (uuid.equals(m.f)) {
                        i24 = 2;
                        break;
                    } else {
                        if (uuid.equals(m.d)) {
                            i24 = 6;
                            break;
                        }
                        i27++;
                    }
                }
                builder.setDrmType(i24);
            }
        }
        if (bVar.B(1011)) {
            this.Q++;
        }
        y0 y0Var = this.E;
        if (y0Var == null) {
            i20 = 2;
            i19 = 1;
            i11 = 9;
            i15 = 13;
            i12 = 8;
            i13 = 7;
            i14 = 6;
        } else {
            int i28 = y0Var.a;
            Context context = this.a;
            boolean z12 = this.M == 4;
            if (i28 == 1001) {
                u0Var = new u0(20, 0);
            } else {
                if (y0Var instanceof n) {
                    n nVar = (n) y0Var;
                    z10 = nVar.s == 1;
                    i10 = nVar.y;
                } else {
                    z10 = false;
                    i10 = 0;
                }
                Throwable cause = y0Var.getCause();
                cause.getClass();
                int i29 = 27;
                if (!(cause instanceof IOException)) {
                    i11 = 9;
                    i12 = 8;
                    i13 = 7;
                    i14 = 6;
                    if (z10 && (i10 == 0 || i10 == 1)) {
                        u0Var = new u0(35, 0);
                    } else if (z10 && i10 == 3) {
                        u0Var = new u0(15, 0);
                    } else if (z10 && i10 == 2) {
                        u0Var = new u0(23, 0);
                    } else {
                        if (cause instanceof p) {
                            i15 = 13;
                            u0Var = new u0(13, m0.A(((p) cause).d));
                        } else {
                            i15 = 13;
                            if (cause instanceof r2.n) {
                                u0Var = new u0(14, ((r2.n) cause).a);
                            } else if (cause instanceof OutOfMemoryError) {
                                u0Var = new u0(14, 0);
                            } else if (cause instanceof k2.w) {
                                u0Var = new u0(17, 0);
                            } else if (cause instanceof y) {
                                u0Var = new u0(18, ((y) cause).a);
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
                                u0Var = new u0(i29, errorCode);
                            } else {
                                u0Var = new u0(22, 0);
                            }
                        }
                        this.b.execute(new t(12, this, new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(elapsedRealtime - this.e).setErrorCode(u0Var.a).setSubErrorCode(u0Var.b).setException(y0Var).build()));
                        i19 = 1;
                        this.R = true;
                        this.E = null;
                        i20 = 2;
                    }
                    i15 = 13;
                    this.b.execute(new t(12, this, new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(elapsedRealtime - this.e).setErrorCode(u0Var.a).setSubErrorCode(u0Var.b).setException(y0Var).build()));
                    i19 = 1;
                    this.R = true;
                    this.E = null;
                    i20 = 2;
                } else if (cause instanceof x) {
                    u0Var = new u0(5, ((x) cause).c);
                } else {
                    if ((cause instanceof g2.w) || (cause instanceof w0)) {
                        i16 = 8;
                        i17 = 6;
                        i11 = 9;
                        i18 = 7;
                        u0Var = new u0(z12 ? 10 : 11, 0);
                    } else {
                        boolean z13 = cause instanceof g2.v;
                        if (z13 || (cause instanceof d0)) {
                            i11 = 9;
                            if (e2.w.a(context).b() == 1) {
                                u0Var = new u0(3, 0);
                            } else {
                                Throwable cause2 = cause.getCause();
                                if (cause2 instanceof UnknownHostException) {
                                    u0Var = new u0(6, 0);
                                    i14 = 6;
                                    i15 = 13;
                                    i12 = 8;
                                    i13 = 7;
                                } else {
                                    i17 = 6;
                                    if (cause2 instanceof SocketTimeoutException) {
                                        i18 = 7;
                                        u0Var = new u0(7, 0);
                                    } else {
                                        i18 = 7;
                                        if (z13 && ((g2.v) cause).b == 1) {
                                            u0Var = new u0(4, 0);
                                        } else {
                                            i16 = 8;
                                            u0Var = new u0(8, 0);
                                        }
                                    }
                                    i14 = 6;
                                    i13 = i18;
                                    i15 = 13;
                                    i12 = 8;
                                }
                                this.b.execute(new t(12, this, new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(elapsedRealtime - this.e).setErrorCode(u0Var.a).setSubErrorCode(u0Var.b).setException(y0Var).build()));
                                i19 = 1;
                                this.R = true;
                                this.E = null;
                                i20 = 2;
                            }
                        } else if (i28 == 1002) {
                            u0Var = new u0(21, 0);
                        } else if (cause instanceof n2.g) {
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
                                u0Var = new u0(i29, A);
                            } else {
                                u0Var = cause3 instanceof MediaDrmResetException ? new u0(27, 0) : cause3 instanceof NotProvisionedException ? new u0(24, 0) : cause3 instanceof DeniedByServerException ? new u0(29, 0) : cause3 instanceof n2.y ? new u0(23, 0) : cause3 instanceof n2.c ? new u0(28, 0) : new u0(30, 0);
                            }
                        } else if ((cause instanceof g2.s) && (cause.getCause() instanceof FileNotFoundException)) {
                            Throwable cause4 = cause.getCause();
                            cause4.getClass();
                            Throwable cause5 = cause4.getCause();
                            u0Var = ((cause5 instanceof ErrnoException) && ((ErrnoException) cause5).errno == OsConstants.EACCES) ? new u0(32, 0) : new u0(31, 0);
                        } else {
                            i11 = 9;
                            u0Var = new u0(9, 0);
                        }
                        i15 = 13;
                        i12 = 8;
                        i13 = 7;
                        i14 = 6;
                        this.b.execute(new t(12, this, new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(elapsedRealtime - this.e).setErrorCode(u0Var.a).setSubErrorCode(u0Var.b).setException(y0Var).build()));
                        i19 = 1;
                        this.R = true;
                        this.E = null;
                        i20 = 2;
                    }
                    i12 = i16;
                    i14 = i17;
                    i13 = i18;
                    i15 = 13;
                    this.b.execute(new t(12, this, new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(elapsedRealtime - this.e).setErrorCode(u0Var.a).setSubErrorCode(u0Var.b).setException(y0Var).build()));
                    i19 = 1;
                    this.R = true;
                    this.E = null;
                    i20 = 2;
                }
            }
            i11 = 9;
            i15 = 13;
            i12 = 8;
            i13 = 7;
            i14 = 6;
            this.b.execute(new t(12, this, new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(elapsedRealtime - this.e).setErrorCode(u0Var.a).setSubErrorCode(u0Var.b).setException(y0Var).build()));
            i19 = 1;
            this.R = true;
            this.E = null;
            i20 = 2;
        }
        if (bVar.B(i20)) {
            v1 h02 = f1Var.h0();
            boolean a10 = h02.a(i20);
            boolean a11 = h02.a(i19);
            boolean a12 = h02.a(3);
            if (a10 || a11 || a12) {
                if (a10) {
                    wVar = null;
                } else {
                    wVar = null;
                    if (!Objects.equals(this.I, null)) {
                        int i30 = this.I == null ? 1 : 0;
                        this.I = null;
                        i21 = 10;
                        u(1, elapsedRealtime, null, i30);
                        if (!a11 && !Objects.equals(this.J, wVar)) {
                            int i31 = this.J != null ? 1 : 0;
                            this.J = wVar;
                            u(0, elapsedRealtime, wVar, i31);
                        }
                        if (!a12 && !Objects.equals(this.K, wVar)) {
                            int i32 = this.K != null ? 1 : 0;
                            this.K = wVar;
                            u(2, elapsedRealtime, wVar, i32);
                        }
                        r82 = wVar;
                        if (n(this.F)) {
                            a5.a aVar3 = this.F;
                            w wVar2 = (w) aVar3.d;
                            if (wVar2.A != -1) {
                                int i33 = aVar3.b;
                                if (!Objects.equals(this.I, wVar2)) {
                                    int i34 = (this.I == null && i33 == 0) ? 1 : i33;
                                    this.I = wVar2;
                                    u(1, elapsedRealtime, wVar2, i34);
                                }
                                this.F = r82;
                            }
                        }
                        if (n(this.G)) {
                            a5.a aVar4 = this.G;
                            w wVar3 = (w) aVar4.d;
                            int i35 = aVar4.b;
                            if (!Objects.equals(this.J, wVar3)) {
                                int i36 = (this.J == null && i35 == 0) ? 1 : i35;
                                this.J = wVar3;
                                u(0, elapsedRealtime, wVar3, i36);
                            }
                            this.G = r82;
                        }
                        if (n(this.H)) {
                            a5.a aVar5 = this.H;
                            w wVar4 = (w) aVar5.d;
                            int i37 = aVar5.b;
                            if (!Objects.equals(this.K, wVar4)) {
                                int i38 = (this.K == null && i37 == 0) ? 1 : i37;
                                this.K = wVar4;
                                u(2, elapsedRealtime, wVar4, i38);
                            }
                            this.H = r82;
                        }
                        switch (e2.w.a(this.a).b()) {
                            case 0:
                                i22 = 0;
                                break;
                            case 1:
                                i22 = i11;
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
                                i22 = i14;
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
                                i22 = i12;
                                break;
                            case 10:
                                i22 = i13;
                                break;
                        }
                        if (i22 != this.y) {
                            this.y = i22;
                            NetworkEvent build = new NetworkEvent.Builder().setNetworkType(i22).setTimeSinceCreatedMillis(elapsedRealtime - this.e).build();
                            i23 = 11;
                            this.b.execute(new t(i23, this, build));
                        } else {
                            i23 = 11;
                        }
                        if (f1Var.d() != 2) {
                            this.L = false;
                        }
                        if (f1Var.W() == null) {
                            this.N = false;
                        } else if (bVar.B(i21)) {
                            this.N = true;
                        }
                        int d = f1Var.d();
                        if (this.L) {
                            i23 = 5;
                        } else if (this.N) {
                            i23 = i15;
                        } else if (d != 4) {
                            int i39 = 2;
                            if (d == 2) {
                                int i40 = this.x;
                                if (i40 != 0 && i40 != 2 && i40 != 12) {
                                    i23 = !f1Var.t() ? i13 : f1Var.w0() != 0 ? i21 : i14;
                                }
                                i23 = i39;
                            } else {
                                i39 = 3;
                                i23 = 12;
                                if (d != 3) {
                                    z11 = true;
                                    if (d != 1 || this.x == 0) {
                                        i23 = this.x;
                                    }
                                    if (this.x != i23) {
                                        this.x = i23;
                                        this.R = z11;
                                        this.b.execute(new t(14, this, new PlaybackStateEvent.Builder().setState(this.x).setTimeSinceCreatedMillis(elapsedRealtime - this.e).build()));
                                    }
                                    if (bVar.B(1028)) {
                                        return;
                                    }
                                    h hVar2 = this.c;
                                    a aVar6 = (a) ((SparseArray) bVar.c).get(1028);
                                    aVar6.getClass();
                                    hVar2.b(aVar6);
                                    return;
                                }
                                if (f1Var.t()) {
                                    if (f1Var.w0() != 0) {
                                        i23 = i11;
                                    }
                                    i23 = i39;
                                } else {
                                    i23 = 4;
                                }
                            }
                        }
                        z11 = true;
                        if (this.x != i23) {
                        }
                        if (bVar.B(1028)) {
                        }
                    }
                }
                i21 = 10;
                if (!a11) {
                    if (this.J != null) {
                    }
                    this.J = wVar;
                    u(0, elapsedRealtime, wVar, i31);
                }
                if (!a12) {
                    if (this.K != null) {
                    }
                    this.K = wVar;
                    u(2, elapsedRealtime, wVar, i32);
                }
                r82 = wVar;
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
                if (f1Var.d() != 2) {
                }
                if (f1Var.W() == null) {
                }
                int d10 = f1Var.d();
                if (this.L) {
                }
                z11 = true;
                if (this.x != i23) {
                }
                if (bVar.B(1028)) {
                }
            }
        }
        r82 = 0;
        i21 = 10;
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
        if (f1Var.d() != 2) {
        }
        if (f1Var.W() == null) {
        }
        int d102 = f1Var.d();
        if (this.L) {
        }
        z11 = true;
        if (this.x != i23) {
        }
        if (bVar.B(1028)) {
        }
    }

    @Override // j2.b
    public final void e(a aVar, c0 c0Var) {
        g0 g0Var = aVar.d;
        if (g0Var == null) {
            return;
        }
        w wVar = c0Var.c;
        wVar.getClass();
        int i10 = c0Var.d;
        o1 o1Var = aVar.b;
        g0Var.getClass();
        a5.a aVar2 = new a5.a(wVar, i10, this.c.d(o1Var, g0Var), 9);
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
    public final void h(y0 y0Var) {
        this.E = y0Var;
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
            this.b.execute(new t(13, this, this.v.build()));
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

    public final void r(o1 o1Var, g0 g0Var) {
        int b10;
        PlaybackMetrics.Builder builder = this.v;
        if (g0Var == null || (b10 = o1Var.b(g0Var.a)) == -1) {
            return;
        }
        l1 l1Var = this.h;
        int i10 = 0;
        o1Var.f(b10, l1Var, false);
        int i11 = l1Var.c;
        n1 n1Var = this.f;
        o1Var.n(i11, n1Var);
        j0 j0Var = n1Var.c.b;
        if (j0Var != null) {
            int K = m0.K(j0Var.a, j0Var.b);
            i10 = K != 0 ? K != 1 ? K != 2 ? 1 : 4 : 5 : 3;
        }
        builder.setStreamType(i10);
        if (n1Var.m != -9223372036854775807L && !n1Var.k && !n1Var.i && !n1Var.a()) {
            builder.setMediaDurationMillis(m0.h0(n1Var.m));
        }
        builder.setPlaybackType(n1Var.a() ? 2 : 1);
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

    public final void u(int i10, long j10, w wVar, int i11) {
        int i12;
        TrackChangeEvent.Builder timeSinceCreatedMillis = new TrackChangeEvent.Builder(i10).setTimeSinceCreatedMillis(j10 - this.e);
        if (wVar != null) {
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
            String str = wVar.r;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = wVar.s;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = wVar.k;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i13 = wVar.j;
            if (i13 != -1) {
                timeSinceCreatedMillis.setBitrate(i13);
            }
            int i14 = wVar.z;
            if (i14 != -1) {
                timeSinceCreatedMillis.setWidth(i14);
            }
            int i15 = wVar.A;
            if (i15 != -1) {
                timeSinceCreatedMillis.setHeight(i15);
            }
            int i16 = wVar.K;
            if (i16 != -1) {
                timeSinceCreatedMillis.setChannelCount(i16);
            }
            int i17 = wVar.L;
            if (i17 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i17);
            }
            String str4 = wVar.d;
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
            float f7 = wVar.D;
            if (f7 != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f7);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.R = true;
        this.b.execute(new t(10, this, timeSinceCreatedMillis.build()));
    }

    @Override // j2.b
    public final /* synthetic */ void onRenderedFirstFrame(a aVar) {
    }

    @Override // j2.b
    public final /* synthetic */ void onSeekStarted(a aVar) {
    }
}
