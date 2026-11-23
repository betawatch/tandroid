package m2;

import a8.xa;
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
import e2.c1;
import e2.i1;
import e2.k1;
import e2.l;
import e2.l1;
import e2.r;
import e2.r0;
import e2.r1;
import e2.s;
import e2.s1;
import e2.t;
import e2.t0;
import e2.u;
import e2.v0;
import e2.x1;
import h2.l0;
import h9.g0;
import j$.util.Objects;
import j2.d0;
import j2.v;
import j2.x;
import j6.k;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.Executor;
import l2.m;
import n2.w;
import u2.n;
import u2.p;
import x2.c0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class g implements b {
    public v0 F;
    public xa G;
    public xa H;
    public xa I;
    public u J;
    public u K;
    public u L;
    public boolean M;
    public int N;
    public boolean O;
    public int P;
    public int Q;
    public int R;
    public boolean S;
    public final Context a;
    public final f c;
    public final PlaybackSession d;
    public String s;
    public PlaybackMetrics.Builder w;
    public int x;
    public final Executor b = h2.a.e();
    public final k1 f = new k1();
    public final i1 h = new i1();
    public final HashMap r = new HashMap();
    public final HashMap n = new HashMap();
    public final long e = SystemClock.elapsedRealtime();
    public int y = 0;
    public int E = 0;

    public g(Context context, PlaybackSession playbackSession) {
        this.a = context.getApplicationContext();
        this.d = playbackSession;
        f fVar = new f();
        this.c = fVar;
        fVar.d = this;
    }

    public static g g(Context context) {
        MediaMetricsManager mediaMetricsManager = (MediaMetricsManager) context.getSystemService("media_metrics");
        if (mediaMetricsManager == null) {
            return null;
        }
        return new g(context, mediaMetricsManager.createPlaybackSession());
    }

    @Override // m2.b
    public final void A(l2.e eVar) {
        this.P += eVar.g;
        this.Q += eVar.e;
    }

    @Override // m2.b
    public final void C(a aVar, int i7) {
        if (i7 == 1) {
            this.M = true;
        }
        this.x = i7;
    }

    @Override // m2.b
    public final void G(v0 v0Var) {
        this.F = v0Var;
    }

    public final boolean f(xa xaVar) {
        String str;
        if (xaVar == null) {
            return false;
        }
        String str2 = (String) xaVar.d;
        f fVar = this.c;
        synchronized (fVar) {
            str = fVar.f;
        }
        return str2.equals(str);
    }

    public final void h() {
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
            this.b.execute(new ji.f(25, this, this.w.build()));
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0424  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0426  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x043c  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x043e  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x044e  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x047d  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x04a7  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x04d6  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x04f0  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x051a  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0522  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0536  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x058a  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x05b8  */
    /* JADX WARN: Removed duplicated region for block: B:190:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0539  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0525  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x04d8  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x04db  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x04de  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x04e0  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x04e2  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x04e4  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x04e6  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x04e8  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x04eb  */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v18, types: [a8.xa] */
    /* JADX WARN: Type inference failed for: r11v21 */
    @Override // m2.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(c1 c1Var, k kVar) {
        int i7;
        boolean z10;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        r0 r0Var;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        ?? r11;
        int i20;
        int i21;
        boolean z11;
        u uVar;
        r rVar;
        int i22;
        if (((s) kVar.b).a.size() == 0) {
            return;
        }
        for (int i23 = 0; i23 < ((s) kVar.b).a.size(); i23++) {
            int a10 = ((s) kVar.b).a(i23);
            a aVar = (a) ((SparseArray) kVar.c).get(a10);
            aVar.getClass();
            if (a10 == 0) {
                f fVar = this.c;
                synchronized (fVar) {
                    try {
                        fVar.d.getClass();
                        l1 l1Var = fVar.e;
                        fVar.e = aVar.b;
                        Iterator it = fVar.c.values().iterator();
                        while (it.hasNext()) {
                            e eVar = (e) it.next();
                            if (eVar.b(l1Var, fVar.e) && !eVar.a(aVar)) {
                            }
                            it.remove();
                            if (eVar.a.equals(fVar.f)) {
                                fVar.a(eVar);
                            }
                            if (eVar.e) {
                                fVar.d.n(aVar, eVar.a);
                            }
                        }
                        fVar.e(aVar);
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
        if (kVar.W(0)) {
            a aVar2 = (a) ((SparseArray) kVar.c).get(0);
            aVar2.getClass();
            if (this.w != null) {
                k(aVar2.b, aVar2.d);
            }
        }
        if (kVar.W(2) && this.w != null) {
            g0 listIterator = c1Var.k0().a.listIterator(0);
            loop2: while (true) {
                if (!listIterator.hasNext()) {
                    rVar = null;
                    break;
                }
                r1 r1Var = (r1) listIterator.next();
                for (int i24 = 0; i24 < r1Var.a; i24++) {
                    if (r1Var.e[i24] && (rVar = r1Var.b.d[i24].w) != null) {
                        break loop2;
                    }
                }
            }
            if (rVar != null) {
                PlaybackMetrics.Builder builder = this.w;
                String str = l0.a;
                int i25 = 0;
                while (true) {
                    if (i25 >= rVar.d) {
                        i22 = 1;
                        break;
                    }
                    UUID uuid = rVar.a[i25].b;
                    if (uuid.equals(l.e)) {
                        i22 = 3;
                        break;
                    } else if (uuid.equals(l.f)) {
                        i22 = 2;
                        break;
                    } else {
                        if (uuid.equals(l.d)) {
                            i22 = 6;
                            break;
                        }
                        i25++;
                    }
                }
                builder.setDrmType(i22);
            }
        }
        if (kVar.W(1011)) {
            this.R++;
        }
        v0 v0Var = this.F;
        if (v0Var == null) {
            i18 = 1;
            i10 = 6;
            i14 = 13;
            i11 = 8;
            i12 = 7;
            i13 = 9;
        } else {
            int i26 = v0Var.a;
            Context context = this.a;
            boolean z12 = this.N == 4;
            int i27 = 24;
            if (i26 == 1001) {
                r0Var = new r0(20, 0);
            } else {
                if (v0Var instanceof m) {
                    m mVar = (m) v0Var;
                    z10 = mVar.s == 1;
                    i7 = mVar.E;
                } else {
                    i7 = 0;
                    z10 = false;
                }
                Throwable cause = v0Var.getCause();
                cause.getClass();
                int i28 = 27;
                if (!(cause instanceof IOException)) {
                    i10 = 6;
                    i11 = 8;
                    i12 = 7;
                    i13 = 9;
                    if (z10 && (i7 == 0 || i7 == 1)) {
                        r0Var = new r0(35, 0);
                    } else if (z10 && i7 == 3) {
                        r0Var = new r0(15, 0);
                    } else if (z10 && i7 == 2) {
                        r0Var = new r0(23, 0);
                    } else {
                        if (cause instanceof p) {
                            i14 = 13;
                            r0Var = new r0(13, l0.A(((p) cause).d));
                        } else {
                            i14 = 13;
                            if (cause instanceof n) {
                                r0Var = new r0(14, ((n) cause).a);
                            } else if (cause instanceof OutOfMemoryError) {
                                r0Var = new r0(14, 0);
                            } else if (cause instanceof n2.u) {
                                r0Var = new r0(17, 0);
                            } else if (cause instanceof w) {
                                r0Var = new r0(18, ((w) cause).a);
                            } else if (cause instanceof MediaCodec.CryptoException) {
                                int errorCode = ((MediaCodec.CryptoException) cause).getErrorCode();
                                switch (l0.z(errorCode)) {
                                    case 6002:
                                        i28 = 24;
                                        break;
                                    case 6003:
                                        i28 = 28;
                                        break;
                                    case 6004:
                                        i28 = 25;
                                        break;
                                    case 6005:
                                        i28 = 26;
                                        break;
                                }
                                r0Var = new r0(i28, errorCode);
                            } else {
                                r0Var = new r0(22, 0);
                            }
                        }
                        this.b.execute(new ji.f(i27, this, new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(elapsedRealtime - this.e).setErrorCode(r0Var.a).setSubErrorCode(r0Var.b).setException(v0Var).build()));
                        i18 = 1;
                        this.S = true;
                        this.F = null;
                    }
                    i14 = 13;
                    this.b.execute(new ji.f(i27, this, new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(elapsedRealtime - this.e).setErrorCode(r0Var.a).setSubErrorCode(r0Var.b).setException(v0Var).build()));
                    i18 = 1;
                    this.S = true;
                    this.F = null;
                } else if (cause instanceof x) {
                    r0Var = new r0(5, ((x) cause).c);
                } else {
                    if ((cause instanceof j2.w) || (cause instanceof t0)) {
                        i15 = 8;
                        i10 = 6;
                        i16 = 9;
                        i17 = 7;
                        r0Var = new r0(z12 ? 10 : 11, 0);
                    } else {
                        boolean z13 = cause instanceof v;
                        if (z13 || (cause instanceof d0)) {
                            i16 = 9;
                            if (h2.w.a(context).b() == 1) {
                                r0Var = new r0(3, 0);
                            } else {
                                Throwable cause2 = cause.getCause();
                                if (cause2 instanceof UnknownHostException) {
                                    i10 = 6;
                                    r0Var = new r0(6, 0);
                                    i13 = 9;
                                    i14 = 13;
                                    i11 = 8;
                                    i12 = 7;
                                    this.b.execute(new ji.f(i27, this, new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(elapsedRealtime - this.e).setErrorCode(r0Var.a).setSubErrorCode(r0Var.b).setException(v0Var).build()));
                                    i18 = 1;
                                    this.S = true;
                                    this.F = null;
                                } else {
                                    i10 = 6;
                                    if (cause2 instanceof SocketTimeoutException) {
                                        i17 = 7;
                                        r0Var = new r0(7, 0);
                                    } else {
                                        i17 = 7;
                                        if (z13 && ((v) cause).b == 1) {
                                            r0Var = new r0(4, 0);
                                        } else {
                                            i15 = 8;
                                            r0Var = new r0(8, 0);
                                        }
                                    }
                                    i13 = 9;
                                    i12 = i17;
                                    i14 = 13;
                                    i11 = 8;
                                    this.b.execute(new ji.f(i27, this, new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(elapsedRealtime - this.e).setErrorCode(r0Var.a).setSubErrorCode(r0Var.b).setException(v0Var).build()));
                                    i18 = 1;
                                    this.S = true;
                                    this.F = null;
                                }
                            }
                        } else if (i26 == 1002) {
                            r0Var = new r0(21, 0);
                        } else if (cause instanceof q2.f) {
                            Throwable cause3 = cause.getCause();
                            cause3.getClass();
                            if (cause3 instanceof MediaDrm.MediaDrmStateException) {
                                int A = l0.A(((MediaDrm.MediaDrmStateException) cause3).getDiagnosticInfo());
                                switch (l0.z(A)) {
                                    case 6002:
                                        i28 = 24;
                                        break;
                                    case 6003:
                                        i28 = 28;
                                        break;
                                    case 6004:
                                        i28 = 25;
                                        break;
                                    case 6005:
                                        i28 = 26;
                                        break;
                                }
                                r0Var = new r0(i28, A);
                            } else {
                                r0Var = cause3 instanceof MediaDrmResetException ? new r0(27, 0) : cause3 instanceof NotProvisionedException ? new r0(24, 0) : cause3 instanceof DeniedByServerException ? new r0(29, 0) : cause3 instanceof q2.x ? new r0(23, 0) : cause3 instanceof q2.c ? new r0(28, 0) : new r0(30, 0);
                            }
                        } else if ((cause instanceof j2.s) && (cause.getCause() instanceof FileNotFoundException)) {
                            Throwable cause4 = cause.getCause();
                            cause4.getClass();
                            Throwable cause5 = cause4.getCause();
                            r0Var = ((cause5 instanceof ErrnoException) && ((ErrnoException) cause5).errno == OsConstants.EACCES) ? new r0(32, 0) : new r0(31, 0);
                        } else {
                            i16 = 9;
                            r0Var = new r0(9, 0);
                        }
                        i13 = i16;
                        i10 = 6;
                        i14 = 13;
                        i11 = 8;
                        i12 = 7;
                        this.b.execute(new ji.f(i27, this, new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(elapsedRealtime - this.e).setErrorCode(r0Var.a).setSubErrorCode(r0Var.b).setException(v0Var).build()));
                        i18 = 1;
                        this.S = true;
                        this.F = null;
                    }
                    i11 = i15;
                    i13 = i16;
                    i12 = i17;
                    i14 = 13;
                    this.b.execute(new ji.f(i27, this, new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(elapsedRealtime - this.e).setErrorCode(r0Var.a).setSubErrorCode(r0Var.b).setException(v0Var).build()));
                    i18 = 1;
                    this.S = true;
                    this.F = null;
                }
            }
            i10 = 6;
            i14 = 13;
            i11 = 8;
            i12 = 7;
            i13 = 9;
            this.b.execute(new ji.f(i27, this, new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(elapsedRealtime - this.e).setErrorCode(r0Var.a).setSubErrorCode(r0Var.b).setException(v0Var).build()));
            i18 = 1;
            this.S = true;
            this.F = null;
        }
        if (kVar.W(2)) {
            s1 k02 = c1Var.k0();
            boolean a11 = k02.a(2);
            boolean a12 = k02.a(i18);
            boolean a13 = k02.a(3);
            if (a11 || a12 || a13) {
                if (a11) {
                    uVar = null;
                } else {
                    uVar = null;
                    if (!Objects.equals(this.J, null)) {
                        int i29 = this.J == null ? 1 : 0;
                        this.J = null;
                        i19 = 10;
                        o(1, elapsedRealtime, null, i29);
                        if (!a12 && !Objects.equals(this.K, uVar)) {
                            int i30 = this.K != null ? 1 : 0;
                            this.K = uVar;
                            o(0, elapsedRealtime, uVar, i30);
                        }
                        if (!a13 && !Objects.equals(this.L, uVar)) {
                            int i31 = this.L != null ? 1 : 0;
                            this.L = uVar;
                            o(2, elapsedRealtime, uVar, i31);
                        }
                        r11 = uVar;
                        if (f(this.G)) {
                            xa xaVar = this.G;
                            u uVar2 = (u) xaVar.c;
                            if (uVar2.A != -1) {
                                int i32 = xaVar.b;
                                if (!Objects.equals(this.J, uVar2)) {
                                    int i33 = (this.J == null && i32 == 0) ? 1 : i32;
                                    this.J = uVar2;
                                    o(1, elapsedRealtime, uVar2, i33);
                                }
                                this.G = r11;
                            }
                        }
                        if (f(this.H)) {
                            xa xaVar2 = this.H;
                            u uVar3 = (u) xaVar2.c;
                            int i34 = xaVar2.b;
                            if (!Objects.equals(this.K, uVar3)) {
                                int i35 = (this.K == null && i34 == 0) ? 1 : i34;
                                this.K = uVar3;
                                o(0, elapsedRealtime, uVar3, i35);
                            }
                            this.H = r11;
                        }
                        if (f(this.I)) {
                            xa xaVar3 = this.I;
                            u uVar4 = (u) xaVar3.c;
                            int i36 = xaVar3.b;
                            if (!Objects.equals(this.L, uVar4)) {
                                int i37 = (this.L == null && i36 == 0) ? 1 : i36;
                                this.L = uVar4;
                                o(2, elapsedRealtime, uVar4, i37);
                            }
                            this.I = r11;
                        }
                        switch (h2.w.a(this.a).b()) {
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
                                i20 = i10;
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
                                i20 = i11;
                                break;
                            case 10:
                                i20 = i12;
                                break;
                        }
                        if (i20 != this.E) {
                            this.E = i20;
                            this.b.execute(new ji.f(23, this, new NetworkEvent.Builder().setNetworkType(i20).setTimeSinceCreatedMillis(elapsedRealtime - this.e).build()));
                        }
                        if (c1Var.i() != 2) {
                            this.M = false;
                        }
                        if (c1Var.X() == null) {
                            this.O = false;
                        } else if (kVar.W(i19)) {
                            this.O = true;
                        }
                        int i38 = c1Var.i();
                        if (this.M) {
                            i21 = 5;
                        } else if (this.O) {
                            i21 = i14;
                        } else if (i38 == 4) {
                            i21 = 11;
                        } else {
                            i21 = 2;
                            if (i38 == 2) {
                                int i39 = this.y;
                                if (i39 != 0 && i39 != 2 && i39 != 12) {
                                    i21 = !c1Var.v() ? i12 : c1Var.x0() != 0 ? i19 : i10;
                                }
                            } else {
                                i21 = 3;
                                if (i38 != 3) {
                                    z11 = true;
                                    i21 = (i38 != 1 || this.y == 0) ? this.y : 12;
                                    if (this.y != i21) {
                                        this.y = i21;
                                        this.S = z11;
                                        this.b.execute(new ji.f(26, this, new PlaybackStateEvent.Builder().setState(this.y).setTimeSinceCreatedMillis(elapsedRealtime - this.e).build()));
                                    }
                                    if (kVar.W(1028)) {
                                        return;
                                    }
                                    f fVar2 = this.c;
                                    a aVar3 = (a) ((SparseArray) kVar.c).get(1028);
                                    aVar3.getClass();
                                    fVar2.b(aVar3);
                                    return;
                                }
                                if (!c1Var.v()) {
                                    i21 = 4;
                                } else if (c1Var.x0() != 0) {
                                    i21 = i13;
                                }
                            }
                        }
                        z11 = true;
                        if (this.y != i21) {
                        }
                        if (kVar.W(1028)) {
                        }
                    }
                }
                i19 = 10;
                if (!a12) {
                    if (this.K != null) {
                    }
                    this.K = uVar;
                    o(0, elapsedRealtime, uVar, i30);
                }
                if (!a13) {
                    if (this.L != null) {
                    }
                    this.L = uVar;
                    o(2, elapsedRealtime, uVar, i31);
                }
                r11 = uVar;
                if (f(this.G)) {
                }
                if (f(this.H)) {
                }
                if (f(this.I)) {
                }
                switch (h2.w.a(this.a).b()) {
                }
                if (i20 != this.E) {
                }
                if (c1Var.i() != 2) {
                }
                if (c1Var.X() == null) {
                }
                int i382 = c1Var.i();
                if (this.M) {
                }
                z11 = true;
                if (this.y != i21) {
                }
                if (kVar.W(1028)) {
                }
            }
        }
        i19 = 10;
        r11 = 0;
        if (f(this.G)) {
        }
        if (f(this.H)) {
        }
        if (f(this.I)) {
        }
        switch (h2.w.a(this.a).b()) {
        }
        if (i20 != this.E) {
        }
        if (c1Var.i() != 2) {
        }
        if (c1Var.X() == null) {
        }
        int i3822 = c1Var.i();
        if (this.M) {
        }
        z11 = true;
        if (this.y != i21) {
        }
        if (kVar.W(1028)) {
        }
    }

    public final LogSessionId j() {
        return this.d.getSessionId();
    }

    public final void k(l1 l1Var, x2.g0 g0Var) {
        int b10;
        PlaybackMetrics.Builder builder = this.w;
        if (g0Var == null || (b10 = l1Var.b(g0Var.a)) == -1) {
            return;
        }
        i1 i1Var = this.h;
        int i7 = 0;
        l1Var.f(b10, i1Var, false);
        int i10 = i1Var.c;
        k1 k1Var = this.f;
        l1Var.n(i10, k1Var);
        e2.g0 g0Var2 = k1Var.c.b;
        if (g0Var2 != null) {
            int K = l0.K(g0Var2.a, g0Var2.b);
            i7 = K != 0 ? K != 1 ? K != 2 ? 1 : 4 : 5 : 3;
        }
        builder.setStreamType(i7);
        if (k1Var.m != -9223372036854775807L && !k1Var.k && !k1Var.i && !k1Var.a()) {
            builder.setMediaDurationMillis(l0.h0(k1Var.m));
        }
        builder.setPlaybackType(k1Var.a() ? 2 : 1);
        this.S = true;
    }

    @Override // m2.b
    public final void l(c0 c0Var) {
        this.N = c0Var.a;
    }

    public final void m(a aVar, String str) {
        x2.g0 g0Var = aVar.d;
        if (g0Var == null || !g0Var.b()) {
            h();
            this.s = str;
            this.w = new PlaybackMetrics.Builder().setPlayerName("AndroidXMedia3").setPlayerVersion("1.10.1");
            k(aVar.b, g0Var);
        }
    }

    public final void n(a aVar, String str) {
        x2.g0 g0Var = aVar.d;
        if ((g0Var == null || !g0Var.b()) && str.equals(this.s)) {
            h();
        }
        this.n.remove(str);
        this.r.remove(str);
    }

    public final void o(int i7, long j3, u uVar, int i10) {
        int i11;
        TrackChangeEvent.Builder timeSinceCreatedMillis = new TrackChangeEvent.Builder(i7).setTimeSinceCreatedMillis(j3 - this.e);
        if (uVar != null) {
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
            String str = uVar.r;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = uVar.s;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = uVar.k;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i12 = uVar.j;
            if (i12 != -1) {
                timeSinceCreatedMillis.setBitrate(i12);
            }
            int i13 = uVar.z;
            if (i13 != -1) {
                timeSinceCreatedMillis.setWidth(i13);
            }
            int i14 = uVar.A;
            if (i14 != -1) {
                timeSinceCreatedMillis.setHeight(i14);
            }
            int i15 = uVar.K;
            if (i15 != -1) {
                timeSinceCreatedMillis.setChannelCount(i15);
            }
            int i16 = uVar.L;
            if (i16 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i16);
            }
            String str4 = uVar.d;
            if (str4 != null) {
                String str5 = l0.a;
                String[] split = str4.split("-", -1);
                Pair create = Pair.create(split[0], split.length >= 2 ? split[1] : null);
                timeSinceCreatedMillis.setLanguage((String) create.first);
                Object obj = create.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f10 = uVar.D;
            if (f10 != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f10);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.S = true;
        this.b.execute(new ji.f(22, this, timeSinceCreatedMillis.build()));
    }

    @Override // m2.b
    public final void r(a aVar, int i7, long j3) {
        x2.g0 g0Var = aVar.d;
        if (g0Var != null) {
            String d = this.c.d(aVar.b, g0Var);
            HashMap hashMap = this.r;
            Long l10 = (Long) hashMap.get(d);
            HashMap hashMap2 = this.n;
            Long l11 = (Long) hashMap2.get(d);
            hashMap.put(d, Long.valueOf((l10 == null ? 0L : l10.longValue()) + j3));
            hashMap2.put(d, Long.valueOf((l11 != null ? l11.longValue() : 0L) + i7));
        }
    }

    @Override // m2.b
    public final void w(a aVar, c0 c0Var) {
        x2.g0 g0Var = aVar.d;
        if (g0Var == null) {
            return;
        }
        u uVar = c0Var.c;
        uVar.getClass();
        int i7 = c0Var.d;
        l1 l1Var = aVar.b;
        g0Var.getClass();
        xa xaVar = new xa(uVar, i7, this.c.d(l1Var, g0Var));
        int i10 = c0Var.b;
        if (i10 != 0) {
            if (i10 == 1) {
                this.H = xaVar;
                return;
            } else if (i10 != 2) {
                if (i10 != 3) {
                    return;
                }
                this.I = xaVar;
                return;
            }
        }
        this.G = xaVar;
    }

    @Override // m2.b
    public final void z(x1 x1Var) {
        xa xaVar = this.G;
        if (xaVar != null) {
            u uVar = (u) xaVar.c;
            if (uVar.A == -1) {
                t a10 = uVar.a();
                a10.y = x1Var.a;
                a10.z = x1Var.b;
                this.G = new xa(new u(a10), xaVar.b, (String) xaVar.d);
            }
        }
    }

    @Override // m2.b
    public final /* synthetic */ void onRenderedFirstFrame(a aVar) {
    }

    @Override // m2.b
    public final /* synthetic */ void onSeekStarted(a aVar) {
    }
}
