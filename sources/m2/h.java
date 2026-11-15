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
import kg.t1;
import q2.y;
import u2.n;
import u2.p;
import x2.b0;
import x2.f0;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class h implements b {
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
    public int E = 0;

    public h(Context context, PlaybackSession playbackSession) {
        this.a = context.getApplicationContext();
        this.d = playbackSession;
        g gVar = new g();
        this.c = gVar;
        gVar.d = this;
    }

    public static h g(Context context) {
        MediaMetricsManager mediaMetricsManager = (MediaMetricsManager) context.getSystemService("media_metrics");
        if (mediaMetricsManager == null) {
            return null;
        }
        return new h(context, mediaMetricsManager.createPlaybackSession());
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
    /* JADX WARN: Type inference failed for: r8v25, types: [a8.xa] */
    /* JADX WARN: Type inference failed for: r8v42 */
    @Override // m2.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A(c1 c1Var, ji.j jVar) {
        int i7;
        boolean z10;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        r0 r0Var;
        r0 r0Var2;
        int i16;
        int i17;
        int i18;
        int i19;
        r0 r0Var3;
        int i20;
        int i21;
        int i22;
        ?? r82;
        int i23;
        int i24;
        int i25;
        boolean z11;
        u uVar;
        r rVar;
        int i26;
        if (((s) jVar.b).a.size() == 0) {
            return;
        }
        for (int i27 = 0; i27 < ((s) jVar.b).a.size(); i27++) {
            int a10 = ((s) jVar.b).a(i27);
            a aVar = (a) ((SparseArray) jVar.c).get(a10);
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
                                gVar.d.m(aVar, fVar.a);
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
        if (jVar.V(0)) {
            a aVar2 = (a) ((SparseArray) jVar.c).get(0);
            aVar2.getClass();
            if (this.w != null) {
                j(aVar2.b, aVar2.d);
            }
        }
        if (jVar.V(2) && this.w != null) {
            g0 listIterator = c1Var.j0().a.listIterator(0);
            loop2: while (true) {
                if (!listIterator.hasNext()) {
                    rVar = null;
                    break;
                }
                r1 r1Var = (r1) listIterator.next();
                for (int i28 = 0; i28 < r1Var.a; i28++) {
                    if (r1Var.e[i28] && (rVar = r1Var.b.d[i28].w) != null) {
                        break loop2;
                    }
                }
            }
            if (rVar != null) {
                PlaybackMetrics.Builder builder = this.w;
                String str = l0.a;
                int i29 = 0;
                while (true) {
                    if (i29 >= rVar.d) {
                        i26 = 1;
                        break;
                    }
                    UUID uuid = rVar.a[i29].b;
                    if (uuid.equals(l.e)) {
                        i26 = 3;
                        break;
                    } else if (uuid.equals(l.f)) {
                        i26 = 2;
                        break;
                    } else {
                        if (uuid.equals(l.d)) {
                            i26 = 6;
                            break;
                        }
                        i29++;
                    }
                }
                builder.setDrmType(i26);
            }
        }
        if (jVar.V(1011)) {
            this.R++;
        }
        v0 v0Var = this.F;
        if (v0Var == null) {
            i12 = 4;
            i21 = 2;
            i20 = 1;
            i15 = 13;
            i10 = 9;
            i11 = 8;
            i13 = 7;
            i14 = 6;
        } else {
            int i30 = v0Var.a;
            Context context = this.a;
            boolean z12 = this.N == 4;
            if (i30 == 1001) {
                r0Var = new r0(20, 0);
            } else {
                if (v0Var instanceof l2.l) {
                    l2.l lVar = (l2.l) v0Var;
                    z10 = lVar.s == 1;
                    i7 = lVar.E;
                } else {
                    i7 = 0;
                    z10 = false;
                }
                Throwable cause = v0Var.getCause();
                cause.getClass();
                int i31 = 27;
                if (cause instanceof IOException) {
                    if (cause instanceof x) {
                        r0Var3 = new r0(5, ((x) cause).c);
                    } else {
                        if ((cause instanceof w) || (cause instanceof t0)) {
                            i16 = 7;
                            i17 = 6;
                            i18 = 4;
                            i19 = 8;
                            i10 = 9;
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
                                        i14 = 6;
                                        i15 = 13;
                                        i11 = 8;
                                        i12 = 4;
                                        i13 = 7;
                                    } else {
                                        i17 = 6;
                                        if (cause2 instanceof SocketTimeoutException) {
                                            r0Var = new r0(7, 0);
                                            i13 = 7;
                                            i14 = 6;
                                            i15 = 13;
                                            i11 = 8;
                                            i12 = 4;
                                        } else {
                                            i16 = 7;
                                            if (z13 && ((v) cause).b == 1) {
                                                r0Var = new r0(4, 0);
                                                i13 = 7;
                                                i14 = 6;
                                                i12 = 4;
                                                i15 = 13;
                                                i11 = 8;
                                            } else {
                                                i18 = 4;
                                                i19 = 8;
                                                r0Var = new r0(8, 0);
                                            }
                                        }
                                    }
                                    this.b.execute(new t1(17, this, new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(elapsedRealtime - this.e).setErrorCode(r0Var.a).setSubErrorCode(r0Var.b).setException(v0Var).build()));
                                    i20 = 1;
                                    this.S = true;
                                    this.F = null;
                                    i21 = 2;
                                }
                            } else if (i30 == 1002) {
                                r0Var = new r0(21, 0);
                            } else if (cause instanceof q2.g) {
                                Throwable cause3 = cause.getCause();
                                cause3.getClass();
                                if (cause3 instanceof MediaDrm.MediaDrmStateException) {
                                    int A = l0.A(((MediaDrm.MediaDrmStateException) cause3).getDiagnosticInfo());
                                    switch (l0.z(A)) {
                                        case 6002:
                                            i31 = 24;
                                            break;
                                        case 6003:
                                            i31 = 28;
                                            break;
                                        case 6004:
                                            i31 = 25;
                                            break;
                                        case 6005:
                                            i31 = 26;
                                            break;
                                    }
                                    r0Var3 = new r0(i31, A);
                                } else {
                                    r0Var = cause3 instanceof MediaDrmResetException ? new r0(27, 0) : cause3 instanceof NotProvisionedException ? new r0(24, 0) : cause3 instanceof DeniedByServerException ? new r0(29, 0) : cause3 instanceof y ? new r0(23, 0) : cause3 instanceof q2.c ? new r0(28, 0) : new r0(30, 0);
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
                            i15 = 13;
                            i11 = 8;
                            i12 = 4;
                            i13 = 7;
                            i14 = 6;
                            this.b.execute(new t1(17, this, new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(elapsedRealtime - this.e).setErrorCode(r0Var.a).setSubErrorCode(r0Var.b).setException(v0Var).build()));
                            i20 = 1;
                            this.S = true;
                            this.F = null;
                            i21 = 2;
                        }
                        i13 = i16;
                        i14 = i17;
                        i12 = i18;
                        i11 = i19;
                        i15 = 13;
                        this.b.execute(new t1(17, this, new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(elapsedRealtime - this.e).setErrorCode(r0Var.a).setSubErrorCode(r0Var.b).setException(v0Var).build()));
                        i20 = 1;
                        this.S = true;
                        this.F = null;
                        i21 = 2;
                    }
                    r0Var = r0Var3;
                } else {
                    i10 = 9;
                    i11 = 8;
                    i12 = 4;
                    i13 = 7;
                    i14 = 6;
                    if (z10 && (i7 == 0 || i7 == 1)) {
                        r0Var = new r0(35, 0);
                    } else if (z10 && i7 == 3) {
                        r0Var = new r0(15, 0);
                    } else if (z10 && i7 == 2) {
                        r0Var = new r0(23, 0);
                    } else {
                        if (cause instanceof p) {
                            i15 = 13;
                            r0Var2 = new r0(13, l0.A(((p) cause).d));
                        } else {
                            i15 = 13;
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
                                        i31 = 24;
                                        break;
                                    case 6003:
                                        i31 = 28;
                                        break;
                                    case 6004:
                                        i31 = 25;
                                        break;
                                    case 6005:
                                        i31 = 26;
                                        break;
                                }
                                r0Var2 = new r0(i31, errorCode);
                            } else {
                                r0Var = new r0(22, 0);
                            }
                            this.b.execute(new t1(17, this, new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(elapsedRealtime - this.e).setErrorCode(r0Var.a).setSubErrorCode(r0Var.b).setException(v0Var).build()));
                            i20 = 1;
                            this.S = true;
                            this.F = null;
                            i21 = 2;
                        }
                        r0Var = r0Var2;
                        this.b.execute(new t1(17, this, new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(elapsedRealtime - this.e).setErrorCode(r0Var.a).setSubErrorCode(r0Var.b).setException(v0Var).build()));
                        i20 = 1;
                        this.S = true;
                        this.F = null;
                        i21 = 2;
                    }
                    i15 = 13;
                    this.b.execute(new t1(17, this, new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(elapsedRealtime - this.e).setErrorCode(r0Var.a).setSubErrorCode(r0Var.b).setException(v0Var).build()));
                    i20 = 1;
                    this.S = true;
                    this.F = null;
                    i21 = 2;
                }
            }
            i15 = 13;
            i10 = 9;
            i11 = 8;
            i12 = 4;
            i13 = 7;
            i14 = 6;
            this.b.execute(new t1(17, this, new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(elapsedRealtime - this.e).setErrorCode(r0Var.a).setSubErrorCode(r0Var.b).setException(v0Var).build()));
            i20 = 1;
            this.S = true;
            this.F = null;
            i21 = 2;
        }
        if (jVar.V(i21)) {
            s1 j02 = c1Var.j0();
            boolean a11 = j02.a(i21);
            boolean a12 = j02.a(i20);
            boolean a13 = j02.a(3);
            if (a11 || a12 || a13) {
                if (a11) {
                    i22 = i12;
                    uVar = null;
                } else {
                    uVar = null;
                    if (Objects.equals(this.J, null)) {
                        i22 = i12;
                    } else {
                        int i32 = this.J == null ? 1 : 0;
                        this.J = null;
                        i22 = i12;
                        n(1, elapsedRealtime, null, i32);
                    }
                }
                if (!a12 && !Objects.equals(this.K, uVar)) {
                    int i33 = this.K == null ? 1 : 0;
                    this.K = uVar;
                    n(0, elapsedRealtime, uVar, i33);
                }
                if (!a13 && !Objects.equals(this.L, uVar)) {
                    int i34 = this.L == null ? 1 : 0;
                    this.L = uVar;
                    n(2, elapsedRealtime, uVar, i34);
                }
                r82 = uVar;
                if (f(this.G)) {
                    xa xaVar = this.G;
                    u uVar2 = (u) xaVar.c;
                    if (uVar2.A != -1) {
                        int i35 = xaVar.b;
                        if (!Objects.equals(this.J, uVar2)) {
                            int i36 = (this.J == null && i35 == 0) ? 1 : i35;
                            this.J = uVar2;
                            n(1, elapsedRealtime, uVar2, i36);
                        }
                        this.G = r82;
                    }
                }
                if (f(this.H)) {
                    xa xaVar2 = this.H;
                    u uVar3 = (u) xaVar2.c;
                    int i37 = xaVar2.b;
                    if (!Objects.equals(this.K, uVar3)) {
                        int i38 = (this.K == null && i37 == 0) ? 1 : i37;
                        this.K = uVar3;
                        n(0, elapsedRealtime, uVar3, i38);
                    }
                    this.H = r82;
                }
                if (f(this.I)) {
                    xa xaVar3 = this.I;
                    u uVar4 = (u) xaVar3.c;
                    int i39 = xaVar3.b;
                    if (!Objects.equals(this.L, uVar4)) {
                        int i40 = (this.L == null && i39 == 0) ? 1 : i39;
                        this.L = uVar4;
                        n(2, elapsedRealtime, uVar4, i40);
                    }
                    this.I = r82;
                }
                switch (h2.w.a(this.a).b()) {
                    case 0:
                        i23 = 0;
                        break;
                    case 1:
                        i23 = i10;
                        break;
                    case 2:
                        i23 = 2;
                        break;
                    case 3:
                        i23 = i22;
                        break;
                    case 4:
                        i23 = 5;
                        break;
                    case 5:
                        i23 = i14;
                        break;
                    case 6:
                    case 8:
                    default:
                        i23 = 1;
                        break;
                    case 7:
                        i23 = 3;
                        break;
                    case 9:
                        i23 = i11;
                        break;
                    case 10:
                        i23 = i13;
                        break;
                }
                if (i23 != this.E) {
                    this.E = i23;
                    this.b.execute(new t1(16, this, new NetworkEvent.Builder().setNetworkType(i23).setTimeSinceCreatedMillis(elapsedRealtime - this.e).build()));
                }
                if (c1Var.i() != 2) {
                    this.M = false;
                }
                if (c1Var.W() != null) {
                    this.O = false;
                    i24 = 10;
                } else {
                    i24 = 10;
                    if (jVar.V(10)) {
                        this.O = true;
                    }
                }
                int i41 = c1Var.i();
                if (!this.M) {
                    i25 = 5;
                } else if (this.O) {
                    i25 = i15;
                } else if (i41 == i22) {
                    i25 = 11;
                } else {
                    i25 = 12;
                    if (i41 == 2) {
                        int i42 = this.y;
                        i25 = (i42 == 0 || i42 == 2 || i42 == 12) ? 2 : !c1Var.u() ? i13 : c1Var.w0() != 0 ? i24 : i14;
                    } else {
                        if (i41 != 3) {
                            z11 = true;
                            if (i41 != 1 || this.y == 0) {
                                i25 = this.y;
                            }
                            if (this.y != i25) {
                                this.y = i25;
                                this.S = z11;
                                this.b.execute(new t1(19, this, new PlaybackStateEvent.Builder().setState(this.y).setTimeSinceCreatedMillis(elapsedRealtime - this.e).build()));
                            }
                            if (jVar.V(1028)) {
                                g gVar2 = this.c;
                                a aVar3 = (a) ((SparseArray) jVar.c).get(1028);
                                aVar3.getClass();
                                gVar2.b(aVar3);
                                return;
                            }
                            return;
                        }
                        i25 = !c1Var.u() ? i22 : c1Var.w0() != 0 ? i10 : 3;
                    }
                }
                z11 = true;
                if (this.y != i25) {
                }
                if (jVar.V(1028)) {
                }
            }
        }
        i22 = i12;
        r82 = 0;
        if (f(this.G)) {
        }
        if (f(this.H)) {
        }
        if (f(this.I)) {
        }
        switch (h2.w.a(this.a).b()) {
        }
        if (i23 != this.E) {
        }
        if (c1Var.i() != 2) {
        }
        if (c1Var.W() != null) {
        }
        int i412 = c1Var.i();
        if (!this.M) {
        }
        z11 = true;
        if (this.y != i25) {
        }
        if (jVar.V(1028)) {
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

    public final boolean f(xa xaVar) {
        String str;
        if (xaVar == null) {
            return false;
        }
        String str2 = (String) xaVar.d;
        g gVar = this.c;
        synchronized (gVar) {
            str = gVar.f;
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
            this.b.execute(new t1(18, this, this.w.build()));
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

    public final LogSessionId i() {
        return this.d.getSessionId();
    }

    public final void j(l1 l1Var, f0 f0Var) {
        int b10;
        PlaybackMetrics.Builder builder = this.w;
        if (f0Var == null || (b10 = l1Var.b(f0Var.a)) == -1) {
            return;
        }
        i1 i1Var = this.h;
        int i7 = 0;
        l1Var.f(b10, i1Var, false);
        int i10 = i1Var.c;
        k1 k1Var = this.f;
        l1Var.n(i10, k1Var);
        e2.g0 g0Var = k1Var.c.b;
        if (g0Var != null) {
            int K = l0.K(g0Var.a, g0Var.b);
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
    public final void k(b0 b0Var) {
        this.N = b0Var.a;
    }

    public final void l(a aVar, String str) {
        f0 f0Var = aVar.d;
        if (f0Var == null || !f0Var.b()) {
            h();
            this.s = str;
            this.w = new PlaybackMetrics.Builder().setPlayerName("AndroidXMedia3").setPlayerVersion("1.10.1");
            j(aVar.b, f0Var);
        }
    }

    public final void m(a aVar, String str) {
        f0 f0Var = aVar.d;
        if ((f0Var == null || !f0Var.b()) && str.equals(this.s)) {
            h();
        }
        this.n.remove(str);
        this.r.remove(str);
    }

    public final void n(int i7, long j3, u uVar, int i10) {
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
        this.b.execute(new t1(15, this, timeSinceCreatedMillis.build()));
    }

    @Override // m2.b
    public final void p(a aVar, int i7, long j3) {
        f0 f0Var = aVar.d;
        if (f0Var != null) {
            String d = this.c.d(aVar.b, f0Var);
            HashMap hashMap = this.r;
            Long l10 = (Long) hashMap.get(d);
            HashMap hashMap2 = this.n;
            Long l11 = (Long) hashMap2.get(d);
            hashMap.put(d, Long.valueOf((l10 == null ? 0L : l10.longValue()) + j3));
            hashMap2.put(d, Long.valueOf((l11 != null ? l11.longValue() : 0L) + i7));
        }
    }

    @Override // m2.b
    public final void r(a aVar, b0 b0Var) {
        f0 f0Var = aVar.d;
        if (f0Var == null) {
            return;
        }
        u uVar = b0Var.c;
        uVar.getClass();
        int i7 = b0Var.d;
        l1 l1Var = aVar.b;
        f0Var.getClass();
        xa xaVar = new xa(uVar, i7, this.c.d(l1Var, f0Var));
        int i10 = b0Var.b;
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
