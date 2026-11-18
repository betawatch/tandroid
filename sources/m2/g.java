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
import j2.w;
import j2.x;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.Executor;
import ji.j;
import kg.h0;
import u2.n;
import u2.p;
import x2.c0;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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

    public static g i(Context context) {
        MediaMetricsManager mediaMetricsManager = (MediaMetricsManager) context.getSystemService("media_metrics");
        if (mediaMetricsManager == null) {
            return null;
        }
        return new g(context, mediaMetricsManager.createPlaybackSession());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0462  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0491  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x04bb  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x04ea  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0504  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x052e  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0536  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x054e  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x05a3  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x05d1  */
    /* JADX WARN: Removed duplicated region for block: B:186:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0551  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x053b  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x04ec  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x04ef  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x04f2  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x04f4  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x04f7  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x04f9  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x04fb  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x04fd  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x04ff  */
    /* JADX WARN: Type inference failed for: r8v52 */
    /* JADX WARN: Type inference failed for: r8v53, types: [a8.xa] */
    /* JADX WARN: Type inference failed for: r8v71 */
    @Override // m2.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A(c1 c1Var, j jVar) {
        boolean z10;
        int i7;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        r0 r0Var;
        r0 r0Var2;
        int i15;
        r0 r0Var3;
        int i16;
        int i17;
        int i18;
        ?? r82;
        int i19;
        int i20;
        int i21;
        boolean z11;
        u uVar;
        r rVar;
        int i22;
        if (((s) jVar.b).a.size() == 0) {
            return;
        }
        for (int i23 = 0; i23 < ((s) jVar.b).a.size(); i23++) {
            int a10 = ((s) jVar.b).a(i23);
            a aVar = (a) ((SparseArray) jVar.c).get(a10);
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
        if (jVar.G(0)) {
            a aVar2 = (a) ((SparseArray) jVar.c).get(0);
            aVar2.getClass();
            if (this.w != null) {
                l(aVar2.b, aVar2.d);
            }
        }
        if (jVar.G(2) && this.w != null) {
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
        if (jVar.G(1011)) {
            this.R++;
        }
        v0 v0Var = this.F;
        if (v0Var == null) {
            i17 = 2;
            i16 = 1;
            i14 = 13;
            i10 = 9;
            i11 = 8;
            i12 = 7;
            i13 = 6;
        } else {
            int i26 = v0Var.a;
            Context context = this.a;
            boolean z12 = this.N == 4;
            if (i26 == 1001) {
                r0Var = new r0(20, 0);
            } else {
                if (v0Var instanceof l2.l) {
                    l2.l lVar = (l2.l) v0Var;
                    z10 = lVar.s == 1;
                    i7 = lVar.E;
                } else {
                    z10 = false;
                    i7 = 0;
                }
                Throwable cause = v0Var.getCause();
                cause.getClass();
                int i27 = 27;
                if (cause instanceof IOException) {
                    if (cause instanceof x) {
                        r0Var3 = new r0(5, ((x) cause).c);
                    } else {
                        if ((cause instanceof w) || (cause instanceof t0)) {
                            i10 = 9;
                            i12 = 7;
                            i13 = 6;
                            i11 = 8;
                            r0Var = new r0(z12 ? 10 : 11, 0);
                        } else {
                            boolean z13 = cause instanceof v;
                            if (z13 || (cause instanceof d0)) {
                                i10 = 9;
                                if (h2.w.a(context).b() == 1) {
                                    r0Var = new r0(3, 0);
                                } else {
                                    Throwable cause2 = cause.getCause();
                                    if (cause2 instanceof UnknownHostException) {
                                        r0Var = new r0(6, 0);
                                        i13 = 6;
                                        i14 = 13;
                                        i11 = 8;
                                        i12 = 7;
                                    } else {
                                        if (cause2 instanceof SocketTimeoutException) {
                                            i15 = 7;
                                            r0Var = new r0(7, 0);
                                        } else {
                                            i15 = 7;
                                            if (z13 && ((v) cause).b == 1) {
                                                r0Var = new r0(4, 0);
                                            } else {
                                                r0Var = new r0(8, 0);
                                                i12 = 7;
                                                i13 = 6;
                                                i11 = 8;
                                            }
                                        }
                                        i12 = i15;
                                        i13 = 6;
                                        i14 = 13;
                                        i11 = 8;
                                    }
                                    this.b.execute(new h0(20, this, new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(elapsedRealtime - this.e).setErrorCode(r0Var.a).setSubErrorCode(r0Var.b).setException(v0Var).build()));
                                    i16 = 1;
                                    this.S = true;
                                    this.F = null;
                                    i17 = 2;
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
                                    r0Var3 = new r0(i27, A);
                                } else {
                                    r0Var = cause3 instanceof MediaDrmResetException ? new r0(27, 0) : cause3 instanceof NotProvisionedException ? new r0(24, 0) : cause3 instanceof DeniedByServerException ? new r0(29, 0) : cause3 instanceof q2.x ? new r0(23, 0) : cause3 instanceof q2.c ? new r0(28, 0) : new r0(30, 0);
                                }
                            } else if ((cause instanceof j2.s) && (cause.getCause() instanceof FileNotFoundException)) {
                                Throwable cause4 = cause.getCause();
                                cause4.getClass();
                                Throwable cause5 = cause4.getCause();
                                r0Var = ((cause5 instanceof ErrnoException) && ((ErrnoException) cause5).errno == OsConstants.EACCES) ? new r0(32, 0) : new r0(31, 0);
                            } else {
                                i10 = 9;
                                r0Var = new r0(9, 0);
                            }
                            i14 = 13;
                            i11 = 8;
                            i12 = 7;
                            i13 = 6;
                            this.b.execute(new h0(20, this, new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(elapsedRealtime - this.e).setErrorCode(r0Var.a).setSubErrorCode(r0Var.b).setException(v0Var).build()));
                            i16 = 1;
                            this.S = true;
                            this.F = null;
                            i17 = 2;
                        }
                        i14 = 13;
                        this.b.execute(new h0(20, this, new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(elapsedRealtime - this.e).setErrorCode(r0Var.a).setSubErrorCode(r0Var.b).setException(v0Var).build()));
                        i16 = 1;
                        this.S = true;
                        this.F = null;
                        i17 = 2;
                    }
                    r0Var = r0Var3;
                } else {
                    i10 = 9;
                    i11 = 8;
                    i12 = 7;
                    i13 = 6;
                    if (z10 && (i7 == 0 || i7 == 1)) {
                        r0Var = new r0(35, 0);
                    } else if (z10 && i7 == 3) {
                        r0Var = new r0(15, 0);
                    } else if (z10 && i7 == 2) {
                        r0Var = new r0(23, 0);
                    } else {
                        if (cause instanceof p) {
                            i14 = 13;
                            r0Var2 = new r0(13, l0.A(((p) cause).d));
                        } else {
                            i14 = 13;
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
                                switch (l0.z(errorCode)) {
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
                                r0Var2 = new r0(i27, errorCode);
                            } else {
                                r0Var = new r0(22, 0);
                            }
                            this.b.execute(new h0(20, this, new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(elapsedRealtime - this.e).setErrorCode(r0Var.a).setSubErrorCode(r0Var.b).setException(v0Var).build()));
                            i16 = 1;
                            this.S = true;
                            this.F = null;
                            i17 = 2;
                        }
                        r0Var = r0Var2;
                        this.b.execute(new h0(20, this, new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(elapsedRealtime - this.e).setErrorCode(r0Var.a).setSubErrorCode(r0Var.b).setException(v0Var).build()));
                        i16 = 1;
                        this.S = true;
                        this.F = null;
                        i17 = 2;
                    }
                    i14 = 13;
                    this.b.execute(new h0(20, this, new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(elapsedRealtime - this.e).setErrorCode(r0Var.a).setSubErrorCode(r0Var.b).setException(v0Var).build()));
                    i16 = 1;
                    this.S = true;
                    this.F = null;
                    i17 = 2;
                }
            }
            i14 = 13;
            i10 = 9;
            i11 = 8;
            i12 = 7;
            i13 = 6;
            this.b.execute(new h0(20, this, new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(elapsedRealtime - this.e).setErrorCode(r0Var.a).setSubErrorCode(r0Var.b).setException(v0Var).build()));
            i16 = 1;
            this.S = true;
            this.F = null;
            i17 = 2;
        }
        if (jVar.G(i17)) {
            s1 j02 = c1Var.j0();
            boolean a11 = j02.a(i17);
            boolean a12 = j02.a(i16);
            boolean a13 = j02.a(3);
            if (a11 || a12 || a13) {
                if (a11) {
                    i18 = 5;
                    uVar = null;
                } else if (Objects.equals(this.J, null)) {
                    i18 = 5;
                    uVar = null;
                } else {
                    int i28 = this.J == null ? 1 : 0;
                    this.J = null;
                    i18 = 5;
                    uVar = null;
                    o(1, elapsedRealtime, null, i28);
                }
                if (!a12 && !Objects.equals(this.K, uVar)) {
                    int i29 = this.K == null ? 1 : 0;
                    this.K = uVar;
                    o(0, elapsedRealtime, uVar, i29);
                }
                if (!a13 && !Objects.equals(this.L, uVar)) {
                    int i30 = this.L == null ? 1 : 0;
                    this.L = uVar;
                    o(2, elapsedRealtime, uVar, i30);
                }
                r82 = uVar;
                if (h(this.G)) {
                    xa xaVar = this.G;
                    u uVar2 = (u) xaVar.c;
                    if (uVar2.A != -1) {
                        int i31 = xaVar.b;
                        if (!Objects.equals(this.J, uVar2)) {
                            int i32 = (this.J == null && i31 == 0) ? 1 : i31;
                            this.J = uVar2;
                            o(1, elapsedRealtime, uVar2, i32);
                        }
                        this.G = r82;
                    }
                }
                if (h(this.H)) {
                    xa xaVar2 = this.H;
                    u uVar3 = (u) xaVar2.c;
                    int i33 = xaVar2.b;
                    if (!Objects.equals(this.K, uVar3)) {
                        int i34 = (this.K == null && i33 == 0) ? 1 : i33;
                        this.K = uVar3;
                        o(0, elapsedRealtime, uVar3, i34);
                    }
                    this.H = r82;
                }
                if (h(this.I)) {
                    xa xaVar3 = this.I;
                    u uVar4 = (u) xaVar3.c;
                    int i35 = xaVar3.b;
                    if (!Objects.equals(this.L, uVar4)) {
                        int i36 = (this.L == null && i35 == 0) ? 1 : i35;
                        this.L = uVar4;
                        o(2, elapsedRealtime, uVar4, i36);
                    }
                    this.I = r82;
                }
                switch (h2.w.a(this.a).b()) {
                    case 0:
                        i19 = 0;
                        break;
                    case 1:
                        i19 = i10;
                        break;
                    case 2:
                        i19 = 2;
                        break;
                    case 3:
                        i19 = 4;
                        break;
                    case 4:
                        i19 = i18;
                        break;
                    case 5:
                        i19 = i13;
                        break;
                    case 6:
                    case 8:
                    default:
                        i19 = 1;
                        break;
                    case 7:
                        i19 = 3;
                        break;
                    case 9:
                        i19 = i11;
                        break;
                    case 10:
                        i19 = i12;
                        break;
                }
                if (i19 != this.E) {
                    this.E = i19;
                    this.b.execute(new h0(19, this, new NetworkEvent.Builder().setNetworkType(i19).setTimeSinceCreatedMillis(elapsedRealtime - this.e).build()));
                }
                if (c1Var.i() != 2) {
                    this.M = false;
                }
                if (c1Var.W() != null) {
                    this.O = false;
                    i20 = 10;
                } else {
                    i20 = 10;
                    if (jVar.G(10)) {
                        this.O = true;
                    }
                }
                int i37 = c1Var.i();
                if (!this.M) {
                    i21 = i18;
                } else {
                    if (!this.O) {
                        if (i37 == 4) {
                            z11 = true;
                            i21 = 11;
                        } else {
                            i21 = 12;
                            int i38 = 2;
                            if (i37 == 2) {
                                int i39 = this.y;
                                if (i39 != 0 && i39 != 2 && i39 != 12) {
                                    i21 = !c1Var.u() ? i12 : c1Var.w0() != 0 ? i20 : i13;
                                }
                                i21 = i38;
                            } else {
                                i38 = 3;
                                if (i37 != 3) {
                                    z11 = true;
                                    if (i37 != 1 || this.y == 0) {
                                        i21 = this.y;
                                    }
                                } else if (c1Var.u()) {
                                    if (c1Var.w0() != 0) {
                                        i21 = i10;
                                    }
                                    i21 = i38;
                                } else {
                                    i21 = 4;
                                }
                            }
                        }
                        if (this.y != i21) {
                            this.y = i21;
                            this.S = z11;
                            this.b.execute(new h0(22, this, new PlaybackStateEvent.Builder().setState(this.y).setTimeSinceCreatedMillis(elapsedRealtime - this.e).build()));
                        }
                        if (jVar.G(1028)) {
                            f fVar2 = this.c;
                            a aVar3 = (a) ((SparseArray) jVar.c).get(1028);
                            aVar3.getClass();
                            fVar2.b(aVar3);
                            return;
                        }
                        return;
                    }
                    i21 = i14;
                }
                z11 = true;
                if (this.y != i21) {
                }
                if (jVar.G(1028)) {
                }
            }
        }
        i18 = 5;
        r82 = 0;
        if (h(this.G)) {
        }
        if (h(this.H)) {
        }
        if (h(this.I)) {
        }
        switch (h2.w.a(this.a).b()) {
        }
        if (i19 != this.E) {
        }
        if (c1Var.i() != 2) {
        }
        if (c1Var.W() != null) {
        }
        int i372 = c1Var.i();
        if (!this.M) {
        }
        z11 = true;
        if (this.y != i21) {
        }
        if (jVar.G(1028)) {
        }
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

    @Override // m2.b
    public final void b(c0 c0Var) {
        this.N = c0Var.a;
    }

    @Override // m2.b
    public final void c(a aVar, int i7, long j3) {
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

    public final boolean h(xa xaVar) {
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

    public final void j() {
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
            this.b.execute(new h0(21, this, this.w.build()));
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
        this.b.execute(new h0(18, this, timeSinceCreatedMillis.build()));
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
    public final void w(x1 x1Var) {
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
    public final void z(l2.d dVar) {
        this.P += dVar.g;
        this.Q += dVar.e;
    }

    @Override // m2.b
    public final /* synthetic */ void onRenderedFirstFrame(a aVar) {
    }

    @Override // m2.b
    public final /* synthetic */ void onSeekStarted(a aVar) {
    }
}
