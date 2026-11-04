package l2;

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
import b8.kg;
import d2.a2;
import d2.e1;
import d2.i0;
import d2.k1;
import d2.m;
import d2.m1;
import d2.n1;
import d2.s;
import d2.t;
import d2.t0;
import d2.u;
import d2.u1;
import d2.v;
import d2.v0;
import d2.v1;
import d2.x0;
import g2.n0;
import i2.e0;
import i2.x;
import j$.util.Objects;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.Executor;
import k2.l;
import m2.w;
import m2.y;
import t2.n;
import t2.p;
import w2.c0;
import w2.g0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class i implements b {
    public x0 F;
    public kg G;
    public kg H;
    public kg I;
    public v J;
    public v K;
    public v L;
    public boolean M;
    public int N;
    public boolean O;
    public int P;
    public int Q;
    public int R;
    public boolean S;
    public final Context a;
    public final h c;
    public final PlaybackSession d;
    public String s;
    public PlaybackMetrics.Builder w;
    public int x;
    public final Executor b = g2.a.e();
    public final m1 f = new m1();
    public final k1 h = new k1();
    public final HashMap r = new HashMap();
    public final HashMap n = new HashMap();
    public final long e = SystemClock.elapsedRealtime();
    public int y = 0;
    public int E = 0;

    public i(Context context, PlaybackSession playbackSession) {
        this.a = context.getApplicationContext();
        this.d = playbackSession;
        h hVar = new h();
        this.c = hVar;
        hVar.d = this;
    }

    public static i i(Context context) {
        MediaMetricsManager mediaMetricsManager = (MediaMetricsManager) context.getSystemService("media_metrics");
        if (mediaMetricsManager == null) {
            return null;
        }
        return new i(context, mediaMetricsManager.createPlaybackSession());
    }

    @Override // l2.b
    public final void A(a aVar, int i3) {
        if (i3 == 1) {
            this.M = true;
        }
        this.x = i3;
    }

    @Override // l2.b
    public final void D(a aVar, c0 c0Var) {
        g0 g0Var = aVar.d;
        if (g0Var == null) {
            return;
        }
        v vVar = c0Var.c;
        vVar.getClass();
        int i3 = c0Var.d;
        n1 n1Var = aVar.b;
        g0Var.getClass();
        kg kgVar = new kg(vVar, i3, this.c.d(n1Var, g0Var));
        int i10 = c0Var.b;
        if (i10 != 0) {
            if (i10 == 1) {
                this.H = kgVar;
                return;
            } else if (i10 != 2) {
                if (i10 != 3) {
                    return;
                }
                this.I = kgVar;
                return;
            }
        }
        this.G = kgVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:120:0x044a  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x044c  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0462  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0464  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0474  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x04a3  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x04cd  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x04fc  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0517  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0541  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0549  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x055d  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x05b2  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x05de  */
    /* JADX WARN: Removed duplicated region for block: B:190:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0560  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x054c  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x04fe  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0501  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0504  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0506  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0509  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x050b  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x050d  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x050f  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0512  */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v15, types: [b8.kg] */
    /* JADX WARN: Type inference failed for: r10v19 */
    @Override // l2.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(e1 e1Var, tf.b bVar) {
        int i3;
        boolean z10;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        t0 t0Var;
        t0 t0Var2;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        ?? r10;
        int i20;
        boolean z11;
        v vVar;
        s sVar;
        int i21;
        if (((t) bVar.a).a.size() == 0) {
            return;
        }
        for (int i22 = 0; i22 < ((t) bVar.a).a.size(); i22++) {
            int a10 = ((t) bVar.a).a(i22);
            a aVar = (a) ((SparseArray) bVar.b).get(a10);
            aVar.getClass();
            if (a10 == 0) {
                h hVar = this.c;
                synchronized (hVar) {
                    try {
                        hVar.d.getClass();
                        n1 n1Var = hVar.e;
                        hVar.e = aVar.b;
                        Iterator it = hVar.c.values().iterator();
                        while (it.hasNext()) {
                            g gVar = (g) it.next();
                            if (gVar.b(n1Var, hVar.e) && !gVar.a(aVar)) {
                            }
                            it.remove();
                            if (gVar.a.equals(hVar.f)) {
                                hVar.a(gVar);
                            }
                            if (gVar.e) {
                                hVar.d.o(aVar, gVar.a);
                            }
                        }
                        hVar.e(aVar);
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } else if (a10 == 11) {
                this.c.g(aVar, this.x);
            } else {
                this.c.f(aVar);
            }
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (bVar.r(0)) {
            a aVar2 = (a) ((SparseArray) bVar.b).get(0);
            aVar2.getClass();
            if (this.w != null) {
                m(aVar2.b, aVar2.d);
            }
        }
        if (bVar.r(2) && this.w != null) {
            g9.g0 listIterator = e1Var.f0().a.listIterator(0);
            loop2: while (true) {
                if (!listIterator.hasNext()) {
                    sVar = null;
                    break;
                }
                u1 u1Var = (u1) listIterator.next();
                for (int i23 = 0; i23 < u1Var.a; i23++) {
                    if (u1Var.e[i23] && (sVar = u1Var.b.d[i23].w) != null) {
                        break loop2;
                    }
                }
            }
            if (sVar != null) {
                PlaybackMetrics.Builder builder = this.w;
                String str = n0.a;
                int i24 = 0;
                while (true) {
                    if (i24 >= sVar.d) {
                        i21 = 1;
                        break;
                    }
                    UUID uuid = sVar.a[i24].b;
                    if (uuid.equals(m.e)) {
                        i21 = 3;
                        break;
                    } else if (uuid.equals(m.f)) {
                        i21 = 2;
                        break;
                    } else {
                        if (uuid.equals(m.d)) {
                            i21 = 6;
                            break;
                        }
                        i24++;
                    }
                }
                builder.setDrmType(i21);
            }
        }
        if (bVar.r(1011)) {
            this.R++;
        }
        x0 x0Var = this.F;
        int i25 = 21;
        if (x0Var == null) {
            i18 = 1;
            i14 = 13;
            i10 = 8;
            i11 = 7;
            i12 = 6;
            i13 = 9;
        } else {
            int i26 = x0Var.a;
            Context context = this.a;
            boolean z12 = this.N == 4;
            if (i26 == 1001) {
                t0Var = new t0(20, 0);
            } else {
                if (x0Var instanceof l) {
                    l lVar = (l) x0Var;
                    z10 = lVar.s == 1;
                    i3 = lVar.E;
                } else {
                    i3 = 0;
                    z10 = false;
                }
                Throwable cause = x0Var.getCause();
                cause.getClass();
                if (!(cause instanceof IOException)) {
                    int i27 = 27;
                    i10 = 8;
                    i11 = 7;
                    i12 = 6;
                    i13 = 9;
                    if (z10 && (i3 == 0 || i3 == 1)) {
                        t0Var = new t0(35, 0);
                    } else if (z10 && i3 == 3) {
                        t0Var = new t0(15, 0);
                    } else if (z10 && i3 == 2) {
                        t0Var = new t0(23, 0);
                    } else {
                        if (cause instanceof p) {
                            i14 = 13;
                            t0Var2 = new t0(13, n0.A(((p) cause).d));
                        } else {
                            i14 = 13;
                            if (cause instanceof n) {
                                t0Var2 = new t0(14, ((n) cause).a);
                            } else {
                                if (cause instanceof OutOfMemoryError) {
                                    t0Var = new t0(14, 0);
                                } else if (cause instanceof w) {
                                    t0Var = new t0(17, 0);
                                } else if (cause instanceof y) {
                                    t0Var2 = new t0(18, ((y) cause).a);
                                } else if (cause instanceof MediaCodec.CryptoException) {
                                    int errorCode = ((MediaCodec.CryptoException) cause).getErrorCode();
                                    switch (n0.z(errorCode)) {
                                        case 6002:
                                            i27 = 24;
                                            break;
                                        case 6003:
                                            i27 = 28;
                                            break;
                                        case 6004:
                                            i27 = 25;
                                            break;
                                        case 6005:
                                            i27 = 26;
                                            break;
                                    }
                                    t0Var = new t0(i27, errorCode);
                                } else {
                                    t0Var = new t0(22, 0);
                                }
                                this.b.execute(new ii.e(19, this, new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(elapsedRealtime - this.e).setErrorCode(t0Var.a).setSubErrorCode(t0Var.b).setException(x0Var).build()));
                                i18 = 1;
                                this.S = true;
                                this.F = null;
                            }
                        }
                        t0Var = t0Var2;
                        this.b.execute(new ii.e(19, this, new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(elapsedRealtime - this.e).setErrorCode(t0Var.a).setSubErrorCode(t0Var.b).setException(x0Var).build()));
                        i18 = 1;
                        this.S = true;
                        this.F = null;
                    }
                    i14 = 13;
                    this.b.execute(new ii.e(19, this, new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(elapsedRealtime - this.e).setErrorCode(t0Var.a).setSubErrorCode(t0Var.b).setException(x0Var).build()));
                    i18 = 1;
                    this.S = true;
                    this.F = null;
                } else if (cause instanceof i2.y) {
                    t0Var = new t0(5, ((i2.y) cause).c);
                } else {
                    if ((cause instanceof x) || (cause instanceof v0)) {
                        i13 = 9;
                        i11 = 7;
                        i12 = 6;
                        i10 = 8;
                        t0Var = new t0(z12 ? 10 : 11, 0);
                    } else {
                        boolean z13 = cause instanceof i2.w;
                        if (z13 || (cause instanceof e0)) {
                            i15 = 9;
                            if (g2.x.a(context).b() == 1) {
                                t0Var = new t0(3, 0);
                            } else {
                                Throwable cause2 = cause.getCause();
                                if (cause2 instanceof UnknownHostException) {
                                    t0Var = new t0(6, 0);
                                    i13 = 9;
                                    i12 = 6;
                                    i14 = 13;
                                    i10 = 8;
                                    i11 = 7;
                                } else {
                                    if (cause2 instanceof SocketTimeoutException) {
                                        i16 = 7;
                                        t0Var = new t0(7, 0);
                                    } else {
                                        i16 = 7;
                                        if (z13 && ((i2.w) cause).b == 1) {
                                            t0Var = new t0(4, 0);
                                        } else {
                                            t0Var = new t0(8, 0);
                                            i13 = 9;
                                            i11 = 7;
                                            i12 = 6;
                                            i10 = 8;
                                        }
                                    }
                                    i13 = 9;
                                    i11 = i16;
                                    i12 = 6;
                                    i14 = 13;
                                    i10 = 8;
                                }
                                this.b.execute(new ii.e(19, this, new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(elapsedRealtime - this.e).setErrorCode(t0Var.a).setSubErrorCode(t0Var.b).setException(x0Var).build()));
                                i18 = 1;
                                this.S = true;
                                this.F = null;
                            }
                        } else if (i26 == 1002) {
                            t0Var = new t0(21, 0);
                        } else if (cause instanceof p2.f) {
                            Throwable cause3 = cause.getCause();
                            cause3.getClass();
                            if (cause3 instanceof MediaDrm.MediaDrmStateException) {
                                int A = n0.A(((MediaDrm.MediaDrmStateException) cause3).getDiagnosticInfo());
                                switch (n0.z(A)) {
                                    case 6002:
                                        i17 = 24;
                                        break;
                                    case 6003:
                                        i17 = 28;
                                        break;
                                    case 6004:
                                        i17 = 25;
                                        break;
                                    case 6005:
                                        i17 = 26;
                                        break;
                                    default:
                                        i17 = 27;
                                        break;
                                }
                                t0Var = new t0(i17, A);
                            } else {
                                t0Var = cause3 instanceof MediaDrmResetException ? new t0(27, 0) : cause3 instanceof NotProvisionedException ? new t0(24, 0) : cause3 instanceof DeniedByServerException ? new t0(29, 0) : cause3 instanceof p2.x ? new t0(23, 0) : cause3 instanceof p2.c ? new t0(28, 0) : new t0(30, 0);
                            }
                        } else if ((cause instanceof i2.t) && (cause.getCause() instanceof FileNotFoundException)) {
                            Throwable cause4 = cause.getCause();
                            cause4.getClass();
                            Throwable cause5 = cause4.getCause();
                            t0Var = ((cause5 instanceof ErrnoException) && ((ErrnoException) cause5).errno == OsConstants.EACCES) ? new t0(32, 0) : new t0(31, 0);
                        } else {
                            i15 = 9;
                            t0Var = new t0(9, 0);
                        }
                        i13 = i15;
                        i14 = 13;
                        i10 = 8;
                        i11 = 7;
                        i12 = 6;
                        this.b.execute(new ii.e(19, this, new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(elapsedRealtime - this.e).setErrorCode(t0Var.a).setSubErrorCode(t0Var.b).setException(x0Var).build()));
                        i18 = 1;
                        this.S = true;
                        this.F = null;
                    }
                    i14 = 13;
                    this.b.execute(new ii.e(19, this, new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(elapsedRealtime - this.e).setErrorCode(t0Var.a).setSubErrorCode(t0Var.b).setException(x0Var).build()));
                    i18 = 1;
                    this.S = true;
                    this.F = null;
                }
            }
            i14 = 13;
            i10 = 8;
            i11 = 7;
            i12 = 6;
            i13 = 9;
            this.b.execute(new ii.e(19, this, new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(elapsedRealtime - this.e).setErrorCode(t0Var.a).setSubErrorCode(t0Var.b).setException(x0Var).build()));
            i18 = 1;
            this.S = true;
            this.F = null;
        }
        if (bVar.r(2)) {
            v1 f02 = e1Var.f0();
            boolean a11 = f02.a(2);
            boolean a12 = f02.a(i18);
            boolean a13 = f02.a(3);
            if (a11 || a12 || a13) {
                if (a11) {
                    vVar = null;
                } else {
                    vVar = null;
                    if (!Objects.equals(this.J, null)) {
                        int i28 = this.J == null ? 1 : 0;
                        this.J = null;
                        i19 = 10;
                        p(1, elapsedRealtime, null, i28);
                        if (!a12 && !Objects.equals(this.K, vVar)) {
                            int i29 = this.K != null ? 1 : 0;
                            this.K = vVar;
                            p(0, elapsedRealtime, vVar, i29);
                        }
                        if (!a13 && !Objects.equals(this.L, vVar)) {
                            int i30 = this.L != null ? 1 : 0;
                            this.L = vVar;
                            p(2, elapsedRealtime, vVar, i30);
                        }
                        r10 = vVar;
                        if (h(this.G)) {
                            kg kgVar = this.G;
                            v vVar2 = (v) kgVar.c;
                            if (vVar2.A != -1) {
                                int i31 = kgVar.b;
                                if (!Objects.equals(this.J, vVar2)) {
                                    int i32 = (this.J == null && i31 == 0) ? 1 : i31;
                                    this.J = vVar2;
                                    p(1, elapsedRealtime, vVar2, i32);
                                }
                                this.G = r10;
                            }
                        }
                        if (h(this.H)) {
                            kg kgVar2 = this.H;
                            v vVar3 = (v) kgVar2.c;
                            int i33 = kgVar2.b;
                            if (!Objects.equals(this.K, vVar3)) {
                                int i34 = (this.K == null && i33 == 0) ? 1 : i33;
                                this.K = vVar3;
                                p(0, elapsedRealtime, vVar3, i34);
                            }
                            this.H = r10;
                        }
                        if (h(this.I)) {
                            kg kgVar3 = this.I;
                            v vVar4 = (v) kgVar3.c;
                            int i35 = kgVar3.b;
                            if (!Objects.equals(this.L, vVar4)) {
                                int i36 = (this.L == null && i35 == 0) ? 1 : i35;
                                this.L = vVar4;
                                p(2, elapsedRealtime, vVar4, i36);
                            }
                            this.I = r10;
                        }
                        switch (g2.x.a(this.a).b()) {
                            case 0:
                                i20 = 0;
                                break;
                            case 1:
                                i20 = i13;
                                break;
                            case 2:
                                i20 = 2;
                                break;
                            case 3:
                                i20 = 4;
                                break;
                            case 4:
                                i20 = 5;
                                break;
                            case 5:
                                i20 = i12;
                                break;
                            case 6:
                            case 8:
                            default:
                                i20 = 1;
                                break;
                            case 7:
                                i20 = 3;
                                break;
                            case 9:
                                i20 = i10;
                                break;
                            case 10:
                                i20 = i11;
                                break;
                        }
                        if (i20 != this.E) {
                            this.E = i20;
                            this.b.execute(new ii.e(18, this, new NetworkEvent.Builder().setNetworkType(i20).setTimeSinceCreatedMillis(elapsedRealtime - this.e).build()));
                        }
                        if (e1Var.h() != 2) {
                            this.M = false;
                        }
                        if (e1Var.U() == null) {
                            this.O = false;
                        } else if (bVar.r(i19)) {
                            this.O = true;
                        }
                        int h = e1Var.h();
                        if (this.M) {
                            i19 = 5;
                        } else if (this.O) {
                            i19 = i14;
                        } else if (h == 4) {
                            i19 = 11;
                        } else if (h == 2) {
                            int i37 = this.y;
                            if (i37 == 0 || i37 == 2 || i37 == 12) {
                                i19 = 2;
                            } else if (!e1Var.u()) {
                                i19 = i11;
                            } else if (e1Var.t0() == 0) {
                                i19 = i12;
                            }
                        } else {
                            i19 = 3;
                            if (h != 3) {
                                z11 = true;
                                i19 = (h != 1 || this.y == 0) ? this.y : 12;
                                if (this.y != i19) {
                                    this.y = i19;
                                    this.S = z11;
                                    this.b.execute(new ii.e(i25, this, new PlaybackStateEvent.Builder().setState(this.y).setTimeSinceCreatedMillis(elapsedRealtime - this.e).build()));
                                }
                                if (bVar.r(1028)) {
                                    return;
                                }
                                h hVar2 = this.c;
                                a aVar3 = (a) ((SparseArray) bVar.b).get(1028);
                                aVar3.getClass();
                                hVar2.b(aVar3);
                                return;
                            }
                            if (!e1Var.u()) {
                                i19 = 4;
                            } else if (e1Var.t0() != 0) {
                                i19 = i13;
                            }
                        }
                        z11 = true;
                        if (this.y != i19) {
                        }
                        if (bVar.r(1028)) {
                        }
                    }
                }
                i19 = 10;
                if (!a12) {
                    if (this.K != null) {
                    }
                    this.K = vVar;
                    p(0, elapsedRealtime, vVar, i29);
                }
                if (!a13) {
                    if (this.L != null) {
                    }
                    this.L = vVar;
                    p(2, elapsedRealtime, vVar, i30);
                }
                r10 = vVar;
                if (h(this.G)) {
                }
                if (h(this.H)) {
                }
                if (h(this.I)) {
                }
                switch (g2.x.a(this.a).b()) {
                }
                if (i20 != this.E) {
                }
                if (e1Var.h() != 2) {
                }
                if (e1Var.U() == null) {
                }
                int h7 = e1Var.h();
                if (this.M) {
                }
                z11 = true;
                if (this.y != i19) {
                }
                if (bVar.r(1028)) {
                }
            }
        }
        i19 = 10;
        r10 = 0;
        if (h(this.G)) {
        }
        if (h(this.H)) {
        }
        if (h(this.I)) {
        }
        switch (g2.x.a(this.a).b()) {
        }
        if (i20 != this.E) {
        }
        if (e1Var.h() != 2) {
        }
        if (e1Var.U() == null) {
        }
        int h72 = e1Var.h();
        if (this.M) {
        }
        z11 = true;
        if (this.y != i19) {
        }
        if (bVar.r(1028)) {
        }
    }

    @Override // l2.b
    public final void d(c0 c0Var) {
        this.N = c0Var.a;
    }

    public final boolean h(kg kgVar) {
        String str;
        if (kgVar == null) {
            return false;
        }
        String str2 = (String) kgVar.d;
        h hVar = this.c;
        synchronized (hVar) {
            str = hVar.f;
        }
        return str2.equals(str);
    }

    @Override // l2.b
    public final void j(x0 x0Var) {
        this.F = x0Var;
    }

    public final void k() {
        PlaybackMetrics.Builder builder = this.w;
        if (builder != null && this.S) {
            builder.setAudioUnderrunCount(this.R);
            this.w.setVideoFramesDropped(this.P);
            this.w.setVideoFramesPlayed(this.Q);
            Long l10 = (Long) this.n.get(this.s);
            this.w.setNetworkTransferDurationMillis(l10 == null ? 0L : l10.longValue());
            Long l11 = (Long) this.r.get(this.s);
            this.w.setNetworkBytesRead(l11 == null ? 0L : l11.longValue());
            this.w.setStreamSource((l11 == null || l11.longValue() <= 0) ? 0 : 1);
            this.b.execute(new ii.e(20, this, this.w.build()));
        }
        this.w = null;
        this.s = null;
        this.R = 0;
        this.P = 0;
        this.Q = 0;
        this.J = null;
        this.K = null;
        this.L = null;
        this.S = false;
    }

    public final LogSessionId l() {
        return this.d.getSessionId();
    }

    public final void m(n1 n1Var, g0 g0Var) {
        int b10;
        PlaybackMetrics.Builder builder = this.w;
        if (g0Var == null || (b10 = n1Var.b(g0Var.a)) == -1) {
            return;
        }
        k1 k1Var = this.h;
        int i3 = 0;
        n1Var.f(b10, k1Var, false);
        int i10 = k1Var.c;
        m1 m1Var = this.f;
        n1Var.n(i10, m1Var);
        i0 i0Var = m1Var.c.b;
        if (i0Var != null) {
            int K = n0.K(i0Var.a, i0Var.b);
            i3 = K != 0 ? K != 1 ? K != 2 ? 1 : 4 : 5 : 3;
        }
        builder.setStreamType(i3);
        if (m1Var.m != -9223372036854775807L && !m1Var.k && !m1Var.i && !m1Var.a()) {
            builder.setMediaDurationMillis(n0.h0(m1Var.m));
        }
        builder.setPlaybackType(m1Var.a() ? 2 : 1);
        this.S = true;
    }

    public final void n(a aVar, String str) {
        g0 g0Var = aVar.d;
        if (g0Var == null || !g0Var.b()) {
            k();
            this.s = str;
            this.w = new PlaybackMetrics.Builder().setPlayerName("AndroidXMedia3").setPlayerVersion("1.10.1");
            m(aVar.b, g0Var);
        }
    }

    public final void o(a aVar, String str) {
        g0 g0Var = aVar.d;
        if ((g0Var == null || !g0Var.b()) && str.equals(this.s)) {
            k();
        }
        this.n.remove(str);
        this.r.remove(str);
    }

    public final void p(int i3, long j10, v vVar, int i10) {
        int i11;
        TrackChangeEvent.Builder timeSinceCreatedMillis = new TrackChangeEvent.Builder(i3).setTimeSinceCreatedMillis(j10 - this.e);
        if (vVar != null) {
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
            String str = vVar.r;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = vVar.s;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = vVar.k;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i12 = vVar.j;
            if (i12 != -1) {
                timeSinceCreatedMillis.setBitrate(i12);
            }
            int i13 = vVar.z;
            if (i13 != -1) {
                timeSinceCreatedMillis.setWidth(i13);
            }
            int i14 = vVar.A;
            if (i14 != -1) {
                timeSinceCreatedMillis.setHeight(i14);
            }
            int i15 = vVar.K;
            if (i15 != -1) {
                timeSinceCreatedMillis.setChannelCount(i15);
            }
            int i16 = vVar.L;
            if (i16 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i16);
            }
            String str4 = vVar.d;
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
            float f10 = vVar.D;
            if (f10 != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f10);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.S = true;
        this.b.execute(new ii.e(17, this, timeSinceCreatedMillis.build()));
    }

    @Override // l2.b
    public final void t(k2.d dVar) {
        this.P += dVar.g;
        this.Q += dVar.e;
    }

    @Override // l2.b
    public final void x(a2 a2Var) {
        kg kgVar = this.G;
        if (kgVar != null) {
            v vVar = (v) kgVar.c;
            if (vVar.A == -1) {
                u a10 = vVar.a();
                a10.y = a2Var.a;
                a10.z = a2Var.b;
                this.G = new kg(new v(a10), kgVar.b, (String) kgVar.d);
            }
        }
    }

    @Override // l2.b
    public final void z(a aVar, int i3, long j10) {
        g0 g0Var = aVar.d;
        if (g0Var != null) {
            String d = this.c.d(aVar.b, g0Var);
            HashMap hashMap = this.r;
            Long l10 = (Long) hashMap.get(d);
            HashMap hashMap2 = this.n;
            Long l11 = (Long) hashMap2.get(d);
            hashMap.put(d, Long.valueOf((l10 == null ? 0L : l10.longValue()) + j10));
            hashMap2.put(d, Long.valueOf((l11 != null ? l11.longValue() : 0L) + i3));
        }
    }

    @Override // l2.b
    public final /* synthetic */ void onRenderedFirstFrame(a aVar) {
    }

    @Override // l2.b
    public final /* synthetic */ void onSeekStarted(a aVar) {
    }
}
