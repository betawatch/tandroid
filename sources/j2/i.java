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
import g2.v;
import g2.w;
import g2.x;
import gg.w1;
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
import k2.m;
import u2.b0;
import u2.f0;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
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
    public final void a(i2.g gVar) {
        this.O += gVar.g;
        this.P += gVar.e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0436  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0438  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x044e  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0450  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0460  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x048f  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x04b9  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x04e8  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0502  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x052a  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0532  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0546  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x059a  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x05c8  */
    /* JADX WARN: Removed duplicated region for block: B:190:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0549  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0535  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x04ea  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x04ed  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x04f0  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x04f2  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x04f5  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x04f7  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x04f9  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x04fb  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x04fd  */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v14, types: [a5.a] */
    /* JADX WARN: Type inference failed for: r11v16 */
    @Override // j2.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(b1 b1Var, pf.b bVar) {
        int i10;
        boolean z10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        q0 q0Var;
        q0 q0Var2;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        ?? r11;
        int i22;
        boolean z11;
        s sVar;
        o oVar;
        int i23;
        if (((q) bVar.b).a.size() == 0) {
            return;
        }
        for (int i24 = 0; i24 < ((q) bVar.b).a.size(); i24++) {
            int a2 = ((q) bVar.b).a(i24);
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
        if (bVar.C(0)) {
            a aVar2 = (a) ((SparseArray) bVar.c).get(0);
            aVar2.getClass();
            if (this.v != null) {
                r(aVar2.b, aVar2.d);
            }
        }
        if (bVar.C(2) && this.v != null) {
            g0 listIterator = b1Var.g0().a.listIterator(0);
            loop2: while (true) {
                if (!listIterator.hasNext()) {
                    oVar = null;
                    break;
                }
                r1 r1Var = (r1) listIterator.next();
                for (int i25 = 0; i25 < r1Var.a; i25++) {
                    if (r1Var.e[i25] && (oVar = r1Var.b.d[i25].v) != null) {
                        break loop2;
                    }
                }
            }
            if (oVar != null) {
                PlaybackMetrics.Builder builder = this.v;
                String str = d0.a;
                int i26 = 0;
                while (true) {
                    if (i26 >= oVar.d) {
                        i23 = 1;
                        break;
                    }
                    UUID uuid = oVar.a[i26].b;
                    if (uuid.equals(b2.i.d)) {
                        i23 = 3;
                        break;
                    } else if (uuid.equals(b2.i.e)) {
                        i23 = 2;
                        break;
                    } else {
                        if (uuid.equals(b2.i.c)) {
                            i23 = 6;
                            break;
                        }
                        i26++;
                    }
                }
                builder.setDrmType(i23);
            }
        }
        if (bVar.C(1011)) {
            this.Q++;
        }
        u0 u0Var = this.E;
        int i27 = 21;
        if (u0Var == null) {
            i20 = 1;
            i15 = 13;
            i11 = 9;
            i12 = 8;
            i13 = 7;
            i14 = 6;
        } else {
            int i28 = u0Var.a;
            Context context = this.a;
            boolean z12 = this.M == 4;
            if (i28 == 1001) {
                q0Var = new q0(20, 0);
            } else {
                if (u0Var instanceof n) {
                    n nVar = (n) u0Var;
                    z10 = nVar.s == 1;
                    i10 = nVar.y;
                } else {
                    i10 = 0;
                    z10 = false;
                }
                Throwable cause = u0Var.getCause();
                cause.getClass();
                if (!(cause instanceof IOException)) {
                    int i29 = 27;
                    i11 = 9;
                    i12 = 8;
                    i13 = 7;
                    i14 = 6;
                    if (z10 && (i10 == 0 || i10 == 1)) {
                        q0Var = new q0(35, 0);
                    } else if (z10 && i10 == 3) {
                        q0Var = new q0(15, 0);
                    } else if (z10 && i10 == 2) {
                        q0Var = new q0(23, 0);
                    } else {
                        if (cause instanceof r2.q) {
                            i15 = 13;
                            q0Var2 = new q0(13, d0.x(((r2.q) cause).d));
                        } else {
                            i15 = 13;
                            if (cause instanceof r2.o) {
                                q0Var2 = new q0(14, ((r2.o) cause).a);
                            } else {
                                if (cause instanceof OutOfMemoryError) {
                                    q0Var = new q0(14, 0);
                                } else if (cause instanceof m) {
                                    q0Var2 = new q0(17, ((m) cause).a);
                                } else if (cause instanceof k2.o) {
                                    q0Var2 = new q0(18, ((k2.o) cause).a);
                                } else if (cause instanceof MediaCodec.CryptoException) {
                                    int errorCode = ((MediaCodec.CryptoException) cause).getErrorCode();
                                    switch (d0.w(errorCode)) {
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
                                    q0Var = new q0(i29, errorCode);
                                } else {
                                    q0Var = new q0(22, 0);
                                }
                                this.b.execute(new w1(22, this, new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(elapsedRealtime - this.e).setErrorCode(q0Var.a).setSubErrorCode(q0Var.b).setException(u0Var).build()));
                                i20 = 1;
                                this.R = true;
                                this.E = null;
                            }
                        }
                        q0Var = q0Var2;
                        this.b.execute(new w1(22, this, new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(elapsedRealtime - this.e).setErrorCode(q0Var.a).setSubErrorCode(q0Var.b).setException(u0Var).build()));
                        i20 = 1;
                        this.R = true;
                        this.E = null;
                    }
                    i15 = 13;
                    this.b.execute(new w1(22, this, new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(elapsedRealtime - this.e).setErrorCode(q0Var.a).setSubErrorCode(q0Var.b).setException(u0Var).build()));
                    i20 = 1;
                    this.R = true;
                    this.E = null;
                } else if (cause instanceof x) {
                    q0Var = new q0(5, ((x) cause).d);
                } else {
                    if ((cause instanceof w) || (cause instanceof s0)) {
                        i16 = 6;
                        i17 = 8;
                        i18 = 7;
                        i11 = 9;
                        q0Var = new q0(z12 ? 10 : 11, 0);
                    } else {
                        boolean z13 = cause instanceof v;
                        if (z13 || (cause instanceof g2.d0)) {
                            i11 = 9;
                            if (u.a(context).b() == 1) {
                                q0Var = new q0(3, 0);
                            } else {
                                Throwable cause2 = cause.getCause();
                                if (cause2 instanceof UnknownHostException) {
                                    q0Var = new q0(6, 0);
                                    i14 = 6;
                                    i15 = 13;
                                    i12 = 8;
                                    i13 = 7;
                                } else {
                                    i16 = 6;
                                    if (cause2 instanceof SocketTimeoutException) {
                                        i18 = 7;
                                        q0Var = new q0(7, 0);
                                    } else {
                                        i18 = 7;
                                        if (z13 && ((v) cause).c == 1) {
                                            q0Var = new q0(4, 0);
                                        } else {
                                            i17 = 8;
                                            q0Var = new q0(8, 0);
                                        }
                                    }
                                    i14 = 6;
                                    i13 = i18;
                                    i15 = 13;
                                    i12 = 8;
                                }
                                this.b.execute(new w1(22, this, new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(elapsedRealtime - this.e).setErrorCode(q0Var.a).setSubErrorCode(q0Var.b).setException(u0Var).build()));
                                i20 = 1;
                                this.R = true;
                                this.E = null;
                            }
                        } else if (i28 == 1002) {
                            q0Var = new q0(21, 0);
                        } else if (cause instanceof n2.f) {
                            Throwable cause3 = cause.getCause();
                            cause3.getClass();
                            if (cause3 instanceof MediaDrm.MediaDrmStateException) {
                                int x10 = d0.x(((MediaDrm.MediaDrmStateException) cause3).getDiagnosticInfo());
                                switch (d0.w(x10)) {
                                    case 6002:
                                        i19 = 24;
                                        break;
                                    case 6003:
                                        i19 = 28;
                                        break;
                                    case 6004:
                                        i19 = 25;
                                        break;
                                    case 6005:
                                        i19 = 26;
                                        break;
                                    default:
                                        i19 = 27;
                                        break;
                                }
                                q0Var = new q0(i19, x10);
                            } else {
                                q0Var = cause3 instanceof MediaDrmResetException ? new q0(27, 0) : cause3 instanceof NotProvisionedException ? new q0(24, 0) : cause3 instanceof DeniedByServerException ? new q0(29, 0) : cause3 instanceof n2.w ? new q0(23, 0) : cause3 instanceof n2.c ? new q0(28, 0) : new q0(30, 0);
                            }
                        } else if ((cause instanceof g2.s) && (cause.getCause() instanceof FileNotFoundException)) {
                            Throwable cause4 = cause.getCause();
                            cause4.getClass();
                            Throwable cause5 = cause4.getCause();
                            q0Var = ((cause5 instanceof ErrnoException) && ((ErrnoException) cause5).errno == OsConstants.EACCES) ? new q0(32, 0) : new q0(31, 0);
                        } else {
                            i11 = 9;
                            q0Var = new q0(9, 0);
                        }
                        i15 = 13;
                        i12 = 8;
                        i13 = 7;
                        i14 = 6;
                        this.b.execute(new w1(22, this, new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(elapsedRealtime - this.e).setErrorCode(q0Var.a).setSubErrorCode(q0Var.b).setException(u0Var).build()));
                        i20 = 1;
                        this.R = true;
                        this.E = null;
                    }
                    i14 = i16;
                    i12 = i17;
                    i13 = i18;
                    i15 = 13;
                    this.b.execute(new w1(22, this, new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(elapsedRealtime - this.e).setErrorCode(q0Var.a).setSubErrorCode(q0Var.b).setException(u0Var).build()));
                    i20 = 1;
                    this.R = true;
                    this.E = null;
                }
            }
            i15 = 13;
            i11 = 9;
            i12 = 8;
            i13 = 7;
            i14 = 6;
            this.b.execute(new w1(22, this, new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(elapsedRealtime - this.e).setErrorCode(q0Var.a).setSubErrorCode(q0Var.b).setException(u0Var).build()));
            i20 = 1;
            this.R = true;
            this.E = null;
        }
        if (bVar.C(2)) {
            s1 g02 = b1Var.g0();
            boolean a10 = g02.a(2);
            boolean a11 = g02.a(i20);
            boolean a12 = g02.a(3);
            if (a10 || a11 || a12) {
                if (a10) {
                    sVar = null;
                } else {
                    sVar = null;
                    if (!Objects.equals(this.I, null)) {
                        int i30 = this.I == null ? 1 : 0;
                        this.I = null;
                        i21 = 10;
                        u(1, elapsedRealtime, null, i30);
                        if (!a11 && !Objects.equals(this.J, sVar)) {
                            int i31 = this.J != null ? 1 : 0;
                            this.J = sVar;
                            u(0, elapsedRealtime, sVar, i31);
                        }
                        if (!a12 && !Objects.equals(this.K, sVar)) {
                            int i32 = this.K != null ? 1 : 0;
                            this.K = sVar;
                            u(2, elapsedRealtime, sVar, i32);
                        }
                        r11 = sVar;
                        if (n(this.F)) {
                            a5.a aVar3 = this.F;
                            s sVar2 = (s) aVar3.d;
                            if (sVar2.z != -1) {
                                int i33 = aVar3.b;
                                if (!Objects.equals(this.I, sVar2)) {
                                    int i34 = (this.I == null && i33 == 0) ? 1 : i33;
                                    this.I = sVar2;
                                    u(1, elapsedRealtime, sVar2, i34);
                                }
                                this.F = r11;
                            }
                        }
                        if (n(this.G)) {
                            a5.a aVar4 = this.G;
                            s sVar3 = (s) aVar4.d;
                            int i35 = aVar4.b;
                            if (!Objects.equals(this.J, sVar3)) {
                                int i36 = (this.J == null && i35 == 0) ? 1 : i35;
                                this.J = sVar3;
                                u(0, elapsedRealtime, sVar3, i36);
                            }
                            this.G = r11;
                        }
                        if (n(this.H)) {
                            a5.a aVar5 = this.H;
                            s sVar4 = (s) aVar5.d;
                            int i37 = aVar5.b;
                            if (!Objects.equals(this.K, sVar4)) {
                                int i38 = (this.K == null && i37 == 0) ? 1 : i37;
                                this.K = sVar4;
                                u(2, elapsedRealtime, sVar4, i38);
                            }
                            this.H = r11;
                        }
                        switch (u.a(this.a).b()) {
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
                            this.b.execute(new w1(i27, this, new NetworkEvent.Builder().setNetworkType(i22).setTimeSinceCreatedMillis(elapsedRealtime - this.e).build()));
                        }
                        if (b1Var.d() != 2) {
                            this.L = false;
                        }
                        if (b1Var.W() == null) {
                            this.N = false;
                        } else if (bVar.C(i21)) {
                            this.N = true;
                        }
                        int d = b1Var.d();
                        if (this.L) {
                            i15 = 5;
                        } else if (!this.N) {
                            i15 = 4;
                            if (d == 4) {
                                z11 = true;
                                i15 = 11;
                            } else {
                                int i39 = 2;
                                if (d == 2) {
                                    int i40 = this.x;
                                    if (i40 != 0 && i40 != 2 && i40 != 12) {
                                        i15 = !b1Var.u() ? i13 : b1Var.u0() != 0 ? i21 : i14;
                                    }
                                    i15 = i39;
                                } else {
                                    i39 = 3;
                                    if (d != 3) {
                                        z11 = true;
                                        i15 = (d != 1 || this.x == 0) ? this.x : 12;
                                    } else if (b1Var.u()) {
                                        if (b1Var.u0() != 0) {
                                            i15 = i11;
                                        }
                                        i15 = i39;
                                    }
                                }
                            }
                            if (this.x != i15) {
                                this.x = i15;
                                this.R = z11;
                                this.b.execute(new w1(24, this, new PlaybackStateEvent.Builder().setState(this.x).setTimeSinceCreatedMillis(elapsedRealtime - this.e).build()));
                            }
                            if (bVar.C(1028)) {
                                return;
                            }
                            h hVar2 = this.c;
                            a aVar6 = (a) ((SparseArray) bVar.c).get(1028);
                            aVar6.getClass();
                            hVar2.b(aVar6);
                            return;
                        }
                        z11 = true;
                        if (this.x != i15) {
                        }
                        if (bVar.C(1028)) {
                        }
                    }
                }
                i21 = 10;
                if (!a11) {
                    if (this.J != null) {
                    }
                    this.J = sVar;
                    u(0, elapsedRealtime, sVar, i31);
                }
                if (!a12) {
                    if (this.K != null) {
                    }
                    this.K = sVar;
                    u(2, elapsedRealtime, sVar, i32);
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
                if (i22 != this.y) {
                }
                if (b1Var.d() != 2) {
                }
                if (b1Var.W() == null) {
                }
                int d10 = b1Var.d();
                if (this.L) {
                }
                z11 = true;
                if (this.x != i15) {
                }
                if (bVar.C(1028)) {
                }
            }
        }
        i21 = 10;
        r11 = 0;
        if (n(this.F)) {
        }
        if (n(this.G)) {
        }
        if (n(this.H)) {
        }
        switch (u.a(this.a).b()) {
        }
        if (i22 != this.y) {
        }
        if (b1Var.d() != 2) {
        }
        if (b1Var.W() == null) {
        }
        int d102 = b1Var.d();
        if (this.L) {
        }
        z11 = true;
        if (this.x != i15) {
        }
        if (bVar.C(1028)) {
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
            this.b.execute(new w1(23, this, this.v.build()));
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
            int H = d0.H(f0Var2.a, f0Var2.b);
            i10 = H != 0 ? H != 1 ? H != 2 ? 1 : 4 : 5 : 3;
        }
        builder.setStreamType(i10);
        if (j1Var.m != -9223372036854775807L && !j1Var.k && !j1Var.i && !j1Var.a()) {
            builder.setMediaDurationMillis(d0.d0(j1Var.m));
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
        this.b.execute(new w1(20, this, timeSinceCreatedMillis.build()));
    }

    @Override // j2.b
    public final /* synthetic */ void onRenderedFirstFrame(a aVar) {
    }

    @Override // j2.b
    public final /* synthetic */ void onSeekStarted(a aVar) {
    }
}
