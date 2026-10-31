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
import b2.f1;
import b2.k0;
import b2.l1;
import b2.n;
import b2.n1;
import b2.o1;
import b2.t;
import b2.v;
import b2.v1;
import b2.w;
import b2.w0;
import b2.w1;
import b2.x;
import b2.y0;
import e2.l0;
import g2.e0;
import g2.y;
import j$.util.Objects;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.Executor;
import k2.a0;
import r2.p;
import u2.c0;
import u2.g0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class j implements b {
    public y0 E;
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
    public final i c;
    public final PlaybackSession d;
    public String s;
    public PlaybackMetrics.Builder w;
    public int x;
    public final Executor b = e2.a.e();
    public final n1 f = new n1();
    public final l1 h = new l1();
    public final HashMap r = new HashMap();
    public final HashMap n = new HashMap();
    public final long e = SystemClock.elapsedRealtime();
    public int y = 0;
    public int D = 0;

    public j(Context context, PlaybackSession playbackSession) {
        this.a = context.getApplicationContext();
        this.d = playbackSession;
        i iVar = new i();
        this.c = iVar;
        iVar.d = this;
    }

    public static j h(Context context) {
        MediaMetricsManager mediaMetricsManager = (MediaMetricsManager) context.getSystemService("media_metrics");
        if (mediaMetricsManager == null) {
            return null;
        }
        return new j(context, mediaMetricsManager.createPlaybackSession());
    }

    @Override // j2.b
    public final void B(a aVar, int i10) {
        if (i10 == 1) {
            this.L = true;
        }
        this.x = i10;
    }

    @Override // j2.b
    public final void E(y0 y0Var) {
        this.E = y0Var;
    }

    @Override // j2.b
    public final void b(i2.d dVar) {
        this.O += dVar.g;
        this.P += dVar.e;
    }

    public final boolean g(a5.a aVar) {
        String str;
        if (aVar == null) {
            return false;
        }
        String str2 = (String) aVar.c;
        i iVar = this.c;
        synchronized (iVar) {
            str = iVar.f;
        }
        return str2.equals(str);
    }

    public final void i() {
        PlaybackMetrics.Builder builder = this.w;
        if (builder != null && this.R) {
            builder.setAudioUnderrunCount(this.Q);
            this.w.setVideoFramesDropped(this.O);
            this.w.setVideoFramesPlayed(this.P);
            Long l4 = (Long) this.n.get(this.s);
            this.w.setNetworkTransferDurationMillis(l4 == null ? 0L : l4.longValue());
            Long l10 = (Long) this.r.get(this.s);
            this.w.setNetworkBytesRead(l10 == null ? 0L : l10.longValue());
            this.w.setStreamSource((l10 == null || l10.longValue() <= 0) ? 0 : 1);
            this.b.execute(new d1.e(22, this, this.w.build()));
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

    @Override // j2.b
    public final void j(c0 c0Var) {
        this.M = c0Var.a;
    }

    public final LogSessionId k() {
        return this.d.getSessionId();
    }

    @Override // j2.b
    public final void l(b2 b2Var) {
        a5.a aVar = this.F;
        if (aVar != null) {
            x xVar = (x) aVar.d;
            if (xVar.A == -1) {
                w a2 = xVar.a();
                a2.y = b2Var.a;
                a2.z = b2Var.b;
                this.F = new a5.a(new x(a2), aVar.b, (String) aVar.c, 10);
            }
        }
    }

    public final void m(o1 o1Var, g0 g0Var) {
        int b10;
        PlaybackMetrics.Builder builder = this.w;
        if (g0Var == null || (b10 = o1Var.b(g0Var.a)) == -1) {
            return;
        }
        l1 l1Var = this.h;
        int i10 = 0;
        o1Var.f(b10, l1Var, false);
        int i11 = l1Var.c;
        n1 n1Var = this.f;
        o1Var.n(i11, n1Var);
        k0 k0Var = n1Var.c.b;
        if (k0Var != null) {
            int K = l0.K(k0Var.a, k0Var.b);
            i10 = K != 0 ? K != 1 ? K != 2 ? 1 : 4 : 5 : 3;
        }
        builder.setStreamType(i10);
        if (n1Var.m != -9223372036854775807L && !n1Var.k && !n1Var.i && !n1Var.a()) {
            builder.setMediaDurationMillis(l0.h0(n1Var.m));
        }
        builder.setPlaybackType(n1Var.a() ? 2 : 1);
        this.R = true;
    }

    @Override // j2.b
    public final void n(a aVar, c0 c0Var) {
        g0 g0Var = aVar.d;
        if (g0Var == null) {
            return;
        }
        x xVar = c0Var.c;
        xVar.getClass();
        int i10 = c0Var.d;
        o1 o1Var = aVar.b;
        g0Var.getClass();
        a5.a aVar2 = new a5.a(xVar, i10, this.c.d(o1Var, g0Var), 10);
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

    public final void o(a aVar, String str) {
        g0 g0Var = aVar.d;
        if (g0Var == null || !g0Var.b()) {
            i();
            this.s = str;
            this.w = new PlaybackMetrics.Builder().setPlayerName("AndroidXMedia3").setPlayerVersion("1.10.1");
            m(aVar.b, g0Var);
        }
    }

    public final void p(a aVar, String str) {
        g0 g0Var = aVar.d;
        if ((g0Var == null || !g0Var.b()) && str.equals(this.s)) {
            i();
        }
        this.n.remove(str);
        this.r.remove(str);
    }

    public final void q(int i10, long j10, x xVar, int i11) {
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
                String str5 = l0.a;
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
        this.b.execute(new d1.e(19, this, timeSinceCreatedMillis.build()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:120:0x042c  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x042e  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0444  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0446  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0456  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0485  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x04af  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x04de  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x04f8  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0522  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x052a  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x053e  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0592  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x05c0  */
    /* JADX WARN: Removed duplicated region for block: B:190:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0541  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x052d  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x04e0  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x04e3  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x04e6  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x04e8  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x04eb  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x04ed  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x04ef  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x04f1  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x04f3  */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v2, types: [a5.a] */
    /* JADX WARN: Type inference failed for: r11v5 */
    @Override // j2.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void r(f1 f1Var, hf.b bVar) {
        int i10;
        boolean z10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        ac.g gVar;
        ac.g gVar2;
        int i16;
        int i17;
        int i18;
        ac.g gVar3;
        int i19;
        int i20;
        ?? r11;
        int i21;
        boolean z11;
        x xVar;
        t tVar;
        int i22;
        if (((v) bVar.b).a.size() == 0) {
            return;
        }
        for (int i23 = 0; i23 < ((v) bVar.b).a.size(); i23++) {
            int a2 = ((v) bVar.b).a(i23);
            a aVar = (a) ((SparseArray) bVar.c).get(a2);
            aVar.getClass();
            if (a2 == 0) {
                i iVar = this.c;
                synchronized (iVar) {
                    try {
                        iVar.d.getClass();
                        o1 o1Var = iVar.e;
                        iVar.e = aVar.b;
                        Iterator it = iVar.c.values().iterator();
                        while (it.hasNext()) {
                            h hVar = (h) it.next();
                            if (hVar.b(o1Var, iVar.e) && !hVar.a(aVar)) {
                            }
                            it.remove();
                            if (hVar.a.equals(iVar.f)) {
                                iVar.a(hVar);
                            }
                            if (hVar.e) {
                                iVar.d.p(aVar, hVar.a);
                            }
                        }
                        iVar.e(aVar);
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } else if (a2 == 11) {
                this.c.g(aVar, this.x);
            } else {
                this.c.f(aVar);
            }
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (bVar.M(0)) {
            a aVar2 = (a) ((SparseArray) bVar.c).get(0);
            aVar2.getClass();
            if (this.w != null) {
                m(aVar2.b, aVar2.d);
            }
        }
        if (bVar.M(2) && this.w != null) {
            e9.l0 listIterator = f1Var.g0().a.listIterator(0);
            loop2: while (true) {
                if (!listIterator.hasNext()) {
                    tVar = null;
                    break;
                }
                v1 v1Var = (v1) listIterator.next();
                for (int i24 = 0; i24 < v1Var.a; i24++) {
                    if (v1Var.e[i24] && (tVar = v1Var.b.d[i24].w) != null) {
                        break loop2;
                    }
                }
            }
            if (tVar != null) {
                PlaybackMetrics.Builder builder = this.w;
                String str = l0.a;
                int i25 = 0;
                while (true) {
                    if (i25 >= tVar.d) {
                        i22 = 1;
                        break;
                    }
                    UUID uuid = tVar.a[i25].b;
                    if (uuid.equals(n.e)) {
                        i22 = 3;
                        break;
                    } else if (uuid.equals(n.f)) {
                        i22 = 2;
                        break;
                    } else {
                        if (uuid.equals(n.d)) {
                            i22 = 6;
                            break;
                        }
                        i25++;
                    }
                }
                builder.setDrmType(i22);
            }
        }
        if (bVar.M(1011)) {
            this.Q++;
        }
        y0 y0Var = this.E;
        if (y0Var == null) {
            i19 = 1;
            i15 = 13;
            i11 = 9;
            i12 = 8;
            i13 = 7;
            i14 = 6;
        } else {
            int i26 = y0Var.a;
            Context context = this.a;
            boolean z12 = this.M == 4;
            int i27 = 21;
            if (i26 == 1001) {
                gVar = new ac.g(20, 0);
            } else {
                if (y0Var instanceof i2.l) {
                    i2.l lVar = (i2.l) y0Var;
                    z10 = lVar.s == 1;
                    i10 = lVar.D;
                } else {
                    i10 = 0;
                    z10 = false;
                }
                Throwable cause = y0Var.getCause();
                cause.getClass();
                int i28 = 27;
                if (cause instanceof IOException) {
                    if (cause instanceof y) {
                        gVar3 = new ac.g(5, ((y) cause).c);
                    } else {
                        if ((cause instanceof g2.x) || (cause instanceof w0)) {
                            i16 = 6;
                            i17 = 8;
                            i18 = 7;
                            i11 = 9;
                            gVar = new ac.g(z12 ? 10 : 11, 0);
                        } else {
                            boolean z13 = cause instanceof g2.w;
                            if (z13 || (cause instanceof e0)) {
                                i11 = 9;
                                if (e2.w.a(context).b() == 1) {
                                    gVar = new ac.g(3, 0);
                                } else {
                                    Throwable cause2 = cause.getCause();
                                    if (cause2 instanceof UnknownHostException) {
                                        gVar = new ac.g(6, 0);
                                        i14 = 6;
                                        i15 = 13;
                                        i12 = 8;
                                        i13 = 7;
                                    } else {
                                        i16 = 6;
                                        if (cause2 instanceof SocketTimeoutException) {
                                            i18 = 7;
                                            gVar = new ac.g(7, 0);
                                        } else {
                                            i18 = 7;
                                            if (z13 && ((g2.w) cause).b == 1) {
                                                gVar = new ac.g(4, 0);
                                            } else {
                                                i17 = 8;
                                                gVar = new ac.g(8, 0);
                                            }
                                        }
                                        i14 = 6;
                                        i13 = i18;
                                        i15 = 13;
                                        i12 = 8;
                                    }
                                    this.b.execute(new d1.e(i27, this, new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(elapsedRealtime - this.e).setErrorCode(gVar.a).setSubErrorCode(gVar.b).setException(y0Var).build()));
                                    i19 = 1;
                                    this.R = true;
                                    this.E = null;
                                }
                            } else if (i26 == 1002) {
                                gVar = new ac.g(21, 0);
                            } else if (cause instanceof n2.f) {
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
                                    gVar3 = new ac.g(i28, A);
                                } else {
                                    gVar = cause3 instanceof MediaDrmResetException ? new ac.g(27, 0) : cause3 instanceof NotProvisionedException ? new ac.g(24, 0) : cause3 instanceof DeniedByServerException ? new ac.g(29, 0) : cause3 instanceof n2.y ? new ac.g(23, 0) : cause3 instanceof n2.c ? new ac.g(28, 0) : new ac.g(30, 0);
                                }
                            } else if ((cause instanceof g2.t) && (cause.getCause() instanceof FileNotFoundException)) {
                                Throwable cause4 = cause.getCause();
                                cause4.getClass();
                                Throwable cause5 = cause4.getCause();
                                gVar = ((cause5 instanceof ErrnoException) && ((ErrnoException) cause5).errno == OsConstants.EACCES) ? new ac.g(32, 0) : new ac.g(31, 0);
                            } else {
                                i11 = 9;
                                gVar = new ac.g(9, 0);
                            }
                            i15 = 13;
                            i12 = 8;
                            i13 = 7;
                            i14 = 6;
                            this.b.execute(new d1.e(i27, this, new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(elapsedRealtime - this.e).setErrorCode(gVar.a).setSubErrorCode(gVar.b).setException(y0Var).build()));
                            i19 = 1;
                            this.R = true;
                            this.E = null;
                        }
                        i14 = i16;
                        i12 = i17;
                        i13 = i18;
                        i15 = 13;
                        this.b.execute(new d1.e(i27, this, new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(elapsedRealtime - this.e).setErrorCode(gVar.a).setSubErrorCode(gVar.b).setException(y0Var).build()));
                        i19 = 1;
                        this.R = true;
                        this.E = null;
                    }
                    gVar = gVar3;
                } else {
                    i11 = 9;
                    i12 = 8;
                    i13 = 7;
                    i14 = 6;
                    if (z10 && (i10 == 0 || i10 == 1)) {
                        gVar = new ac.g(35, 0);
                    } else if (z10 && i10 == 3) {
                        gVar = new ac.g(15, 0);
                    } else if (z10 && i10 == 2) {
                        gVar = new ac.g(23, 0);
                    } else {
                        if (cause instanceof p) {
                            i15 = 13;
                            gVar2 = new ac.g(13, l0.A(((p) cause).d));
                        } else {
                            i15 = 13;
                            if (cause instanceof r2.n) {
                                gVar2 = new ac.g(14, ((r2.n) cause).a);
                            } else {
                                if (cause instanceof OutOfMemoryError) {
                                    gVar = new ac.g(14, 0);
                                } else if (cause instanceof k2.y) {
                                    gVar = new ac.g(17, 0);
                                } else if (cause instanceof a0) {
                                    gVar2 = new ac.g(18, ((a0) cause).a);
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
                                    gVar2 = new ac.g(i28, errorCode);
                                } else {
                                    gVar = new ac.g(22, 0);
                                }
                                this.b.execute(new d1.e(i27, this, new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(elapsedRealtime - this.e).setErrorCode(gVar.a).setSubErrorCode(gVar.b).setException(y0Var).build()));
                                i19 = 1;
                                this.R = true;
                                this.E = null;
                            }
                        }
                        gVar = gVar2;
                        this.b.execute(new d1.e(i27, this, new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(elapsedRealtime - this.e).setErrorCode(gVar.a).setSubErrorCode(gVar.b).setException(y0Var).build()));
                        i19 = 1;
                        this.R = true;
                        this.E = null;
                    }
                    i15 = 13;
                    this.b.execute(new d1.e(i27, this, new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(elapsedRealtime - this.e).setErrorCode(gVar.a).setSubErrorCode(gVar.b).setException(y0Var).build()));
                    i19 = 1;
                    this.R = true;
                    this.E = null;
                }
            }
            i15 = 13;
            i11 = 9;
            i12 = 8;
            i13 = 7;
            i14 = 6;
            this.b.execute(new d1.e(i27, this, new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(elapsedRealtime - this.e).setErrorCode(gVar.a).setSubErrorCode(gVar.b).setException(y0Var).build()));
            i19 = 1;
            this.R = true;
            this.E = null;
        }
        if (bVar.M(2)) {
            w1 g02 = f1Var.g0();
            boolean a10 = g02.a(2);
            boolean a11 = g02.a(i19);
            boolean a12 = g02.a(3);
            if (a10 || a11 || a12) {
                if (a10) {
                    xVar = null;
                } else {
                    xVar = null;
                    if (!Objects.equals(this.I, null)) {
                        int i29 = this.I == null ? 1 : 0;
                        this.I = null;
                        i20 = 10;
                        q(1, elapsedRealtime, null, i29);
                        if (!a11 && !Objects.equals(this.J, xVar)) {
                            int i30 = this.J != null ? 1 : 0;
                            this.J = xVar;
                            q(0, elapsedRealtime, xVar, i30);
                        }
                        if (!a12 && !Objects.equals(this.K, xVar)) {
                            int i31 = this.K != null ? 1 : 0;
                            this.K = xVar;
                            q(2, elapsedRealtime, xVar, i31);
                        }
                        r11 = xVar;
                        if (g(this.F)) {
                            a5.a aVar3 = this.F;
                            x xVar2 = (x) aVar3.d;
                            if (xVar2.A != -1) {
                                int i32 = aVar3.b;
                                if (!Objects.equals(this.I, xVar2)) {
                                    int i33 = (this.I == null && i32 == 0) ? 1 : i32;
                                    this.I = xVar2;
                                    q(1, elapsedRealtime, xVar2, i33);
                                }
                                this.F = r11;
                            }
                        }
                        if (g(this.G)) {
                            a5.a aVar4 = this.G;
                            x xVar3 = (x) aVar4.d;
                            int i34 = aVar4.b;
                            if (!Objects.equals(this.J, xVar3)) {
                                int i35 = (this.J == null && i34 == 0) ? 1 : i34;
                                this.J = xVar3;
                                q(0, elapsedRealtime, xVar3, i35);
                            }
                            this.G = r11;
                        }
                        if (g(this.H)) {
                            a5.a aVar5 = this.H;
                            x xVar4 = (x) aVar5.d;
                            int i36 = aVar5.b;
                            if (!Objects.equals(this.K, xVar4)) {
                                int i37 = (this.K == null && i36 == 0) ? 1 : i36;
                                this.K = xVar4;
                                q(2, elapsedRealtime, xVar4, i37);
                            }
                            this.H = r11;
                        }
                        switch (e2.w.a(this.a).b()) {
                            case 0:
                                i21 = 0;
                                break;
                            case 1:
                                i21 = i11;
                                break;
                            case 2:
                                i21 = 2;
                                break;
                            case 3:
                                i21 = 4;
                                break;
                            case 4:
                                i21 = 5;
                                break;
                            case 5:
                                i21 = i14;
                                break;
                            case 6:
                            case 8:
                            default:
                                i21 = 1;
                                break;
                            case 7:
                                i21 = 3;
                                break;
                            case 9:
                                i21 = i12;
                                break;
                            case 10:
                                i21 = i13;
                                break;
                        }
                        if (i21 != this.D) {
                            this.D = i21;
                            this.b.execute(new d1.e(20, this, new NetworkEvent.Builder().setNetworkType(i21).setTimeSinceCreatedMillis(elapsedRealtime - this.e).build()));
                        }
                        if (f1Var.h() != 2) {
                            this.L = false;
                        }
                        if (f1Var.V() == null) {
                            this.N = false;
                        } else if (bVar.M(i20)) {
                            this.N = true;
                        }
                        int h = f1Var.h();
                        if (this.L) {
                            i15 = 5;
                        } else if (!this.N) {
                            i15 = 4;
                            if (h == 4) {
                                z11 = true;
                                i15 = 11;
                            } else {
                                int i38 = 2;
                                if (h == 2) {
                                    int i39 = this.y;
                                    if (i39 != 0 && i39 != 2 && i39 != 12) {
                                        i15 = !f1Var.t() ? i13 : f1Var.w0() != 0 ? i20 : i14;
                                    }
                                    i15 = i38;
                                } else {
                                    i38 = 3;
                                    if (h != 3) {
                                        z11 = true;
                                        i15 = (h != 1 || this.y == 0) ? this.y : 12;
                                    } else if (f1Var.t()) {
                                        if (f1Var.w0() != 0) {
                                            i15 = i11;
                                        }
                                        i15 = i38;
                                    }
                                }
                            }
                            if (this.y != i15) {
                                this.y = i15;
                                this.R = z11;
                                this.b.execute(new d1.e(23, this, new PlaybackStateEvent.Builder().setState(this.y).setTimeSinceCreatedMillis(elapsedRealtime - this.e).build()));
                            }
                            if (bVar.M(1028)) {
                                return;
                            }
                            i iVar2 = this.c;
                            a aVar6 = (a) ((SparseArray) bVar.c).get(1028);
                            aVar6.getClass();
                            iVar2.b(aVar6);
                            return;
                        }
                        z11 = true;
                        if (this.y != i15) {
                        }
                        if (bVar.M(1028)) {
                        }
                    }
                }
                i20 = 10;
                if (!a11) {
                    if (this.J != null) {
                    }
                    this.J = xVar;
                    q(0, elapsedRealtime, xVar, i30);
                }
                if (!a12) {
                    if (this.K != null) {
                    }
                    this.K = xVar;
                    q(2, elapsedRealtime, xVar, i31);
                }
                r11 = xVar;
                if (g(this.F)) {
                }
                if (g(this.G)) {
                }
                if (g(this.H)) {
                }
                switch (e2.w.a(this.a).b()) {
                }
                if (i21 != this.D) {
                }
                if (f1Var.h() != 2) {
                }
                if (f1Var.V() == null) {
                }
                int h10 = f1Var.h();
                if (this.L) {
                }
                z11 = true;
                if (this.y != i15) {
                }
                if (bVar.M(1028)) {
                }
            }
        }
        i20 = 10;
        r11 = 0;
        if (g(this.F)) {
        }
        if (g(this.G)) {
        }
        if (g(this.H)) {
        }
        switch (e2.w.a(this.a).b()) {
        }
        if (i21 != this.D) {
        }
        if (f1Var.h() != 2) {
        }
        if (f1Var.V() == null) {
        }
        int h102 = f1Var.h();
        if (this.L) {
        }
        z11 = true;
        if (this.y != i15) {
        }
        if (bVar.M(1028)) {
        }
    }

    @Override // j2.b
    public final void t(a aVar, int i10, long j10) {
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
    public final /* synthetic */ void onRenderedFirstFrame(a aVar) {
    }

    @Override // j2.b
    public final /* synthetic */ void onSeekStarted(a aVar) {
    }
}
