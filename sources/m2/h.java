package m2;

import a8.wa;
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
import e2.t0;
import e2.u;
import e2.v0;
import e2.x1;
import h2.m0;
import h9.g0;
import j$.util.Objects;
import j2.e0;
import j2.t;
import j2.w;
import j2.x;
import j2.y;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.Executor;
import li.j3;
import u2.n;
import u2.p;
import x2.c0;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class h implements b {
    public v0 E;
    public wa F;
    public wa G;
    public wa H;
    public u I;
    public u J;
    public u K;
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
    public PlaybackMetrics.Builder w;
    public int x;
    public final Executor b = h2.a.e();
    public final k1 f = new k1();
    public final i1 h = new i1();
    public final HashMap r = new HashMap();
    public final HashMap n = new HashMap();
    public final long e = SystemClock.elapsedRealtime();
    public int y = 0;
    public int D = 0;

    public h(Context context, PlaybackSession playbackSession) {
        this.a = context.getApplicationContext();
        this.d = playbackSession;
        g gVar = new g();
        this.c = gVar;
        gVar.d = this;
    }

    public static h i(Context context) {
        MediaMetricsManager mediaMetricsManager = (MediaMetricsManager) context.getSystemService("media_metrics");
        if (mediaMetricsManager == null) {
            return null;
        }
        return new h(context, mediaMetricsManager.createPlaybackSession());
    }

    @Override // m2.b
    public final void A(a aVar, int i7) {
        if (i7 == 1) {
            this.L = true;
        }
        this.x = i7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0443  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0472  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x049c  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x04cb  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x04e4  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x050c  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0514  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x052c  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x057f  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x05ad  */
    /* JADX WARN: Removed duplicated region for block: B:186:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:187:0x052f  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0519  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x04cd  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x04d0  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x04d3  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x04d5  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x04d7  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x04d9  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x04db  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x04dd  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x04df  */
    /* JADX WARN: Type inference failed for: r9v10, types: [a8.wa] */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v9 */
    @Override // m2.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void E(c1 c1Var, wf.b bVar) {
        int i7;
        boolean z9;
        int i10;
        int i11;
        int i12;
        int i13;
        r0 r0Var;
        r0 r0Var2;
        int i14;
        int i15;
        r0 r0Var3;
        int i16;
        int i17;
        int i18;
        int i19;
        ?? r92;
        int i20;
        int i21;
        boolean z10;
        u uVar;
        r rVar;
        int i22;
        if (((s) bVar.b).a.size() == 0) {
            return;
        }
        for (int i23 = 0; i23 < ((s) bVar.b).a.size(); i23++) {
            int a10 = ((s) bVar.b).a(i23);
            a aVar = (a) ((SparseArray) bVar.c).get(a10);
            aVar.getClass();
            if (a10 == 0) {
                g gVar = this.c;
                synchronized (gVar) {
                    try {
                        gVar.d.getClass();
                        l1 l1Var = gVar.e;
                        gVar.e = aVar.b;
                        Iterator it = gVar.c.values().iterator();
                        while (it.hasNext()) {
                            f fVar = (f) it.next();
                            if (fVar.b(l1Var, gVar.e) && !fVar.a(aVar)) {
                            }
                            it.remove();
                            if (fVar.a.equals(gVar.f)) {
                                gVar.a(fVar);
                            }
                            if (fVar.e) {
                                gVar.d.n(aVar, fVar.a);
                            }
                        }
                        gVar.e(aVar);
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
        if (bVar.C(0)) {
            a aVar2 = (a) ((SparseArray) bVar.c).get(0);
            aVar2.getClass();
            if (this.w != null) {
                l(aVar2.b, aVar2.d);
            }
        }
        if (bVar.C(2) && this.w != null) {
            g0 listIterator = c1Var.j0().a.listIterator(0);
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
                String str = m0.a;
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
        if (bVar.C(1011)) {
            this.Q++;
        }
        v0 v0Var = this.E;
        int i26 = 5;
        if (v0Var == null) {
            i11 = 4;
            i18 = 2;
            i17 = 1;
            i16 = 6;
            i13 = 13;
            i10 = 9;
            i12 = 7;
        } else {
            int i27 = v0Var.a;
            Context context = this.a;
            boolean z11 = this.M == 4;
            if (i27 == 1001) {
                r0Var = new r0(20, 0);
            } else {
                if (v0Var instanceof l2.l) {
                    l2.l lVar = (l2.l) v0Var;
                    z9 = lVar.s == 1;
                    i7 = lVar.D;
                } else {
                    i7 = 0;
                    z9 = false;
                }
                Throwable cause = v0Var.getCause();
                cause.getClass();
                int i28 = 27;
                if (cause instanceof IOException) {
                    if (cause instanceof y) {
                        r0Var3 = new r0(5, ((y) cause).c);
                    } else {
                        if ((cause instanceof x) || (cause instanceof t0)) {
                            i14 = 7;
                            i15 = 4;
                            i10 = 9;
                            r0Var = new r0(z11 ? 10 : 11, 0);
                        } else {
                            boolean z12 = cause instanceof w;
                            if (z12 || (cause instanceof e0)) {
                                i10 = 9;
                                if (h2.w.a(context).b() == 1) {
                                    r0Var = new r0(3, 0);
                                } else {
                                    Throwable cause2 = cause.getCause();
                                    if (cause2 instanceof UnknownHostException) {
                                        r0Var = new r0(6, 0);
                                    } else if (cause2 instanceof SocketTimeoutException) {
                                        r0Var = new r0(7, 0);
                                        i12 = 7;
                                        i13 = 13;
                                        i11 = 4;
                                        i16 = 6;
                                        this.b.execute(new j3(i16, this, new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(elapsedRealtime - this.e).setErrorCode(r0Var.a).setSubErrorCode(r0Var.b).setException(v0Var).build()));
                                        i17 = 1;
                                        this.R = true;
                                        this.E = null;
                                        i18 = 2;
                                    } else {
                                        i14 = 7;
                                        if (z12 && ((w) cause).b == 1) {
                                            i15 = 4;
                                            r0Var = new r0(4, 0);
                                        } else {
                                            i15 = 4;
                                            r0Var = new r0(8, 0);
                                        }
                                    }
                                }
                            } else if (i27 == 1002) {
                                r0Var = new r0(21, 0);
                            } else if (cause instanceof q2.f) {
                                Throwable cause3 = cause.getCause();
                                cause3.getClass();
                                if (cause3 instanceof MediaDrm.MediaDrmStateException) {
                                    int A = m0.A(((MediaDrm.MediaDrmStateException) cause3).getDiagnosticInfo());
                                    switch (m0.z(A)) {
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
                                    r0Var3 = new r0(i28, A);
                                } else {
                                    r0Var = cause3 instanceof MediaDrmResetException ? new r0(27, 0) : cause3 instanceof NotProvisionedException ? new r0(24, 0) : cause3 instanceof DeniedByServerException ? new r0(29, 0) : cause3 instanceof q2.x ? new r0(23, 0) : cause3 instanceof q2.c ? new r0(28, 0) : new r0(30, 0);
                                }
                            } else if ((cause instanceof t) && (cause.getCause() instanceof FileNotFoundException)) {
                                Throwable cause4 = cause.getCause();
                                cause4.getClass();
                                Throwable cause5 = cause4.getCause();
                                r0Var = ((cause5 instanceof ErrnoException) && ((ErrnoException) cause5).errno == OsConstants.EACCES) ? new r0(32, 0) : new r0(31, 0);
                            } else {
                                i10 = 9;
                                r0Var = new r0(9, 0);
                            }
                            i13 = 13;
                            i11 = 4;
                            i12 = 7;
                            i16 = 6;
                            this.b.execute(new j3(i16, this, new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(elapsedRealtime - this.e).setErrorCode(r0Var.a).setSubErrorCode(r0Var.b).setException(v0Var).build()));
                            i17 = 1;
                            this.R = true;
                            this.E = null;
                            i18 = 2;
                        }
                        i12 = i14;
                        i11 = i15;
                        i13 = 13;
                        i16 = 6;
                        this.b.execute(new j3(i16, this, new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(elapsedRealtime - this.e).setErrorCode(r0Var.a).setSubErrorCode(r0Var.b).setException(v0Var).build()));
                        i17 = 1;
                        this.R = true;
                        this.E = null;
                        i18 = 2;
                    }
                    r0Var = r0Var3;
                } else {
                    i10 = 9;
                    i11 = 4;
                    i12 = 7;
                    if (z9 && (i7 == 0 || i7 == 1)) {
                        r0Var = new r0(35, 0);
                    } else if (z9 && i7 == 3) {
                        r0Var = new r0(15, 0);
                    } else if (z9 && i7 == 2) {
                        r0Var = new r0(23, 0);
                    } else {
                        if (cause instanceof p) {
                            i13 = 13;
                            r0Var2 = new r0(13, m0.A(((p) cause).d));
                        } else {
                            i13 = 13;
                            if (cause instanceof n) {
                                r0Var = new r0(14, ((n) cause).a);
                            } else if (cause instanceof OutOfMemoryError) {
                                r0Var = new r0(14, 0);
                            } else if (cause instanceof n2.u) {
                                r0Var = new r0(17, 0);
                            } else if (cause instanceof n2.w) {
                                r0Var2 = new r0(18, ((n2.w) cause).a);
                            } else if (cause instanceof MediaCodec.CryptoException) {
                                int errorCode = ((MediaCodec.CryptoException) cause).getErrorCode();
                                switch (m0.z(errorCode)) {
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
                                r0Var2 = new r0(i28, errorCode);
                            } else {
                                r0Var = new r0(22, 0);
                            }
                            i16 = 6;
                            this.b.execute(new j3(i16, this, new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(elapsedRealtime - this.e).setErrorCode(r0Var.a).setSubErrorCode(r0Var.b).setException(v0Var).build()));
                            i17 = 1;
                            this.R = true;
                            this.E = null;
                            i18 = 2;
                        }
                        r0Var = r0Var2;
                        i16 = 6;
                        this.b.execute(new j3(i16, this, new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(elapsedRealtime - this.e).setErrorCode(r0Var.a).setSubErrorCode(r0Var.b).setException(v0Var).build()));
                        i17 = 1;
                        this.R = true;
                        this.E = null;
                        i18 = 2;
                    }
                    i13 = 13;
                    i16 = 6;
                    this.b.execute(new j3(i16, this, new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(elapsedRealtime - this.e).setErrorCode(r0Var.a).setSubErrorCode(r0Var.b).setException(v0Var).build()));
                    i17 = 1;
                    this.R = true;
                    this.E = null;
                    i18 = 2;
                }
            }
            i13 = 13;
            i10 = 9;
            i11 = 4;
            i12 = 7;
            i16 = 6;
            this.b.execute(new j3(i16, this, new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(elapsedRealtime - this.e).setErrorCode(r0Var.a).setSubErrorCode(r0Var.b).setException(v0Var).build()));
            i17 = 1;
            this.R = true;
            this.E = null;
            i18 = 2;
        }
        if (bVar.C(i18)) {
            s1 j02 = c1Var.j0();
            boolean a11 = j02.a(i18);
            boolean a12 = j02.a(i17);
            boolean a13 = j02.a(3);
            if (a11 || a12 || a13) {
                if (a11) {
                    i19 = i11;
                    uVar = null;
                } else {
                    uVar = null;
                    if (Objects.equals(this.I, null)) {
                        i19 = i11;
                    } else {
                        int i29 = this.I == null ? 1 : 0;
                        this.I = null;
                        i19 = i11;
                        o(1, elapsedRealtime, null, i29);
                    }
                }
                if (!a12 && !Objects.equals(this.J, uVar)) {
                    int i30 = this.J == null ? 1 : 0;
                    this.J = uVar;
                    o(0, elapsedRealtime, uVar, i30);
                }
                if (!a13 && !Objects.equals(this.K, uVar)) {
                    int i31 = this.K == null ? 1 : 0;
                    this.K = uVar;
                    o(2, elapsedRealtime, uVar, i31);
                }
                r92 = uVar;
                if (h(this.F)) {
                    wa waVar = this.F;
                    u uVar2 = (u) waVar.c;
                    if (uVar2.A != -1) {
                        int i32 = waVar.b;
                        if (!Objects.equals(this.I, uVar2)) {
                            int i33 = (this.I == null && i32 == 0) ? 1 : i32;
                            this.I = uVar2;
                            o(1, elapsedRealtime, uVar2, i33);
                        }
                        this.F = r92;
                    }
                }
                if (h(this.G)) {
                    wa waVar2 = this.G;
                    u uVar3 = (u) waVar2.c;
                    int i34 = waVar2.b;
                    if (!Objects.equals(this.J, uVar3)) {
                        int i35 = (this.J == null && i34 == 0) ? 1 : i34;
                        this.J = uVar3;
                        o(0, elapsedRealtime, uVar3, i35);
                    }
                    this.G = r92;
                }
                if (h(this.H)) {
                    wa waVar3 = this.H;
                    u uVar4 = (u) waVar3.c;
                    int i36 = waVar3.b;
                    if (!Objects.equals(this.K, uVar4)) {
                        int i37 = (this.K == null && i36 == 0) ? 1 : i36;
                        this.K = uVar4;
                        o(2, elapsedRealtime, uVar4, i37);
                    }
                    this.H = r92;
                }
                switch (h2.w.a(this.a).b()) {
                    case 0:
                        i20 = 0;
                        break;
                    case 1:
                        i20 = i10;
                        break;
                    case 2:
                        i20 = 2;
                        break;
                    case 3:
                        i20 = i19;
                        break;
                    case 4:
                        i20 = 5;
                        break;
                    case 5:
                        i20 = i16;
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
                        i20 = 8;
                        break;
                    case 10:
                        i20 = i12;
                        break;
                }
                if (i20 != this.D) {
                    this.D = i20;
                    this.b.execute(new j3(i26, this, new NetworkEvent.Builder().setNetworkType(i20).setTimeSinceCreatedMillis(elapsedRealtime - this.e).build()));
                }
                if (c1Var.i() != 2) {
                    this.L = false;
                }
                if (c1Var.W() != null) {
                    this.N = false;
                    i21 = 10;
                } else {
                    i21 = 10;
                    if (bVar.C(10)) {
                        this.N = true;
                    }
                }
                int i38 = c1Var.i();
                if (!this.L) {
                    i16 = 5;
                } else if (this.N) {
                    i16 = i13;
                } else if (i38 == i19) {
                    i16 = 11;
                } else if (i38 == 2) {
                    int i39 = this.y;
                    if (i39 == 0 || i39 == 2 || i39 == 12) {
                        i16 = 2;
                    } else if (!c1Var.u()) {
                        i16 = i12;
                    } else if (c1Var.w0() != 0) {
                        i16 = i21;
                    }
                } else {
                    if (i38 != 3) {
                        z10 = true;
                        i16 = (i38 != 1 || this.y == 0) ? this.y : 12;
                        if (this.y != i16) {
                            this.y = i16;
                            this.R = z10;
                            this.b.execute(new j3(8, this, new PlaybackStateEvent.Builder().setState(this.y).setTimeSinceCreatedMillis(elapsedRealtime - this.e).build()));
                        }
                        if (bVar.C(1028)) {
                            g gVar2 = this.c;
                            a aVar3 = (a) ((SparseArray) bVar.c).get(1028);
                            aVar3.getClass();
                            gVar2.b(aVar3);
                            return;
                        }
                        return;
                    }
                    i16 = !c1Var.u() ? i19 : c1Var.w0() != 0 ? i10 : 3;
                }
                z10 = true;
                if (this.y != i16) {
                }
                if (bVar.C(1028)) {
                }
            }
        }
        i19 = i11;
        r92 = 0;
        if (h(this.F)) {
        }
        if (h(this.G)) {
        }
        if (h(this.H)) {
        }
        switch (h2.w.a(this.a).b()) {
        }
        if (i20 != this.D) {
        }
        if (c1Var.i() != 2) {
        }
        if (c1Var.W() != null) {
        }
        int i382 = c1Var.i();
        if (!this.L) {
        }
        z10 = true;
        if (this.y != i16) {
        }
        if (bVar.C(1028)) {
        }
    }

    @Override // m2.b
    public final void G(v0 v0Var) {
        this.E = v0Var;
    }

    @Override // m2.b
    public final void b(c0 c0Var) {
        this.M = c0Var.a;
    }

    @Override // m2.b
    public final void d(a aVar, int i7, long j3) {
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

    public final boolean h(wa waVar) {
        String str;
        if (waVar == null) {
            return false;
        }
        String str2 = (String) waVar.d;
        g gVar = this.c;
        synchronized (gVar) {
            str = gVar.f;
        }
        return str2.equals(str);
    }

    public final void j() {
        PlaybackMetrics.Builder builder = this.w;
        if (builder != null && this.R) {
            builder.setAudioUnderrunCount(this.Q);
            this.w.setVideoFramesDropped(this.O);
            this.w.setVideoFramesPlayed(this.P);
            Long l10 = (Long) this.n.get(this.s);
            this.w.setNetworkTransferDurationMillis(l10 == null ? 0L : l10.longValue());
            Long l11 = (Long) this.r.get(this.s);
            this.w.setNetworkBytesRead(l11 == null ? 0L : l11.longValue());
            this.w.setStreamSource((l11 == null || l11.longValue() <= 0) ? 0 : 1);
            this.b.execute(new j3(7, this, this.w.build()));
        }
        this.w = null;
        this.s = null;
        this.Q = 0;
        this.O = 0;
        this.P = 0;
        this.I = null;
        this.J = null;
        this.K = null;
        this.R = false;
    }

    public final LogSessionId k() {
        return this.d.getSessionId();
    }

    public final void l(l1 l1Var, x2.g0 g0Var) {
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
            int K = m0.K(g0Var2.a, g0Var2.b);
            i7 = K != 0 ? K != 1 ? K != 2 ? 1 : 4 : 5 : 3;
        }
        builder.setStreamType(i7);
        if (k1Var.m != -9223372036854775807L && !k1Var.k && !k1Var.i && !k1Var.a()) {
            builder.setMediaDurationMillis(m0.h0(k1Var.m));
        }
        builder.setPlaybackType(k1Var.a() ? 2 : 1);
        this.R = true;
    }

    public final void m(a aVar, String str) {
        x2.g0 g0Var = aVar.d;
        if (g0Var == null || !g0Var.b()) {
            j();
            this.s = str;
            this.w = new PlaybackMetrics.Builder().setPlayerName("AndroidXMedia3").setPlayerVersion("1.10.1");
            l(aVar.b, g0Var);
        }
    }

    public final void n(a aVar, String str) {
        x2.g0 g0Var = aVar.d;
        if ((g0Var == null || !g0Var.b()) && str.equals(this.s)) {
            j();
        }
        this.n.remove(str);
        this.r.remove(str);
    }

    public final void o(int i7, long j3, u uVar, int i10) {
        int i11;
        TrackChangeEvent.Builder timeSinceCreatedMillis = new TrackChangeEvent.Builder(i7).setTimeSinceCreatedMillis(j3 - this.e);
        int i12 = 4;
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
            int i13 = uVar.j;
            if (i13 != -1) {
                timeSinceCreatedMillis.setBitrate(i13);
            }
            int i14 = uVar.z;
            if (i14 != -1) {
                timeSinceCreatedMillis.setWidth(i14);
            }
            int i15 = uVar.A;
            if (i15 != -1) {
                timeSinceCreatedMillis.setHeight(i15);
            }
            int i16 = uVar.K;
            if (i16 != -1) {
                timeSinceCreatedMillis.setChannelCount(i16);
            }
            int i17 = uVar.L;
            if (i17 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i17);
            }
            String str4 = uVar.d;
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
            float f10 = uVar.D;
            if (f10 != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f10);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.R = true;
        this.b.execute(new j3(i12, this, timeSinceCreatedMillis.build()));
    }

    @Override // m2.b
    public final void r(a aVar, c0 c0Var) {
        x2.g0 g0Var = aVar.d;
        if (g0Var == null) {
            return;
        }
        u uVar = c0Var.c;
        uVar.getClass();
        int i7 = c0Var.d;
        l1 l1Var = aVar.b;
        g0Var.getClass();
        wa waVar = new wa(uVar, i7, this.c.d(l1Var, g0Var));
        int i10 = c0Var.b;
        if (i10 != 0) {
            if (i10 == 1) {
                this.G = waVar;
                return;
            } else if (i10 != 2) {
                if (i10 != 3) {
                    return;
                }
                this.H = waVar;
                return;
            }
        }
        this.F = waVar;
    }

    @Override // m2.b
    public final void w(x1 x1Var) {
        wa waVar = this.F;
        if (waVar != null) {
            u uVar = (u) waVar.c;
            if (uVar.A == -1) {
                e2.t a10 = uVar.a();
                a10.y = x1Var.a;
                a10.z = x1Var.b;
                this.F = new wa(new u(a10), waVar.b, (String) waVar.d);
            }
        }
    }

    @Override // m2.b
    public final void z(l2.d dVar) {
        this.O += dVar.g;
        this.P += dVar.e;
    }

    @Override // m2.b
    public final /* synthetic */ void onRenderedFirstFrame(a aVar) {
    }

    @Override // m2.b
    public final /* synthetic */ void onSeekStarted(a aVar) {
    }
}
