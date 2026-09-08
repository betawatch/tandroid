package k2;

import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioAttributes;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.media.PlaybackParams;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import b2.r0;
import b2.v0;
import bi.n5;
import com.google.android.gms.internal.vision.e2;
import di.g7;
import e9.a1;
import ig.t0;
import j$.util.Objects;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import ji.k5;
import ji.u4;
import org.telegram.messenger.BuildConfig;
import org.telegram.messenger.MediaController;
import v7.x7;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class d0 implements p {
    public static final Object o0 = new Object();
    public static ScheduledExecutorService p0;
    public static int q0;
    public y A;
    public b2.e B;
    public w C;
    public w D;
    public v0 E;
    public boolean F;
    public ByteBuffer G;
    public int H;
    public long I;
    public long J;
    public long K;
    public long L;
    public int M;
    public boolean N;
    public boolean O;
    public long P;
    public float Q;
    public ByteBuffer R;
    public int S;
    public ByteBuffer T;
    public boolean U;
    public boolean V;
    public boolean W;
    public boolean X;
    public boolean Y;
    public int Z;
    public final Context a;
    public boolean a0;
    public final aa.a b;
    public b2.f b0;
    public final t c;
    public u4 c0;
    public final m0 d;
    public boolean d0;
    public final c2.l e;
    public long e0;
    public final l0 f;
    public long f0;
    public final a1 g;
    public boolean g0;
    public final s h;
    public boolean h0;
    public final ArrayDeque i;
    public Looper i0;
    public final boolean j;
    public long j0;
    public int k;
    public long k0;
    public c0 l;
    public Handler l0;
    public final z m;
    public Context m0;
    public final z n;
    public final boolean n0;
    public final e0 o;
    public final pf.b p;
    public final f0 q;
    public final int r;
    public j2.k s;
    public n t;
    public v u;
    public v v;
    public c2.e w;
    public AudioTrack x;
    public b y;
    public g7 z;

    public d0(n5 n5Var) {
        int deviceId;
        Context context = (Context) n5Var.b;
        Context applicationContext = context == null ? null : context.getApplicationContext();
        this.a = applicationContext;
        this.B = b2.e.h;
        this.y = applicationContext == null ? (b) n5Var.c : null;
        this.b = (aa.a) n5Var.d;
        int i10 = Build.VERSION.SDK_INT;
        this.j = false;
        this.k = 0;
        this.o = (e0) n5Var.e;
        pf.b bVar = (pf.b) n5Var.g;
        bVar.getClass();
        this.p = bVar;
        this.h = new s(new xa.c(this, 25));
        t tVar = new t();
        this.c = tVar;
        m0 m0Var = new m0();
        m0Var.m = e2.d0.b;
        this.d = m0Var;
        this.e = new c2.l();
        this.f = new l0();
        this.g = e9.i0.A(m0Var, tVar);
        this.Q = 1.0f;
        this.Z = 0;
        this.b0 = new b2.f();
        v0 v0Var = v0.d;
        this.D = new w(v0Var, 0L, 0L);
        this.E = v0Var;
        this.F = false;
        this.i = new ArrayDeque();
        this.m = new z();
        this.n = new z();
        this.q = (f0) n5Var.f;
        int i11 = -1;
        if (i10 >= 34 && context != null && (deviceId = context.getDeviceId()) != 0 && deviceId != -1) {
            i11 = deviceId;
        }
        this.r = i11;
        this.n0 = true;
    }

    public static boolean r(AudioTrack audioTrack) {
        return Build.VERSION.SDK_INT >= 29 && audioTrack.isOffloadedPlayback();
    }

    public final void A(int i10) {
        if (this.a0) {
            if (this.Z != i10) {
                return;
            } else {
                this.a0 = false;
            }
        }
        if (this.Z != i10) {
            this.Z = i10;
            this.Y = i10 != 0;
            g();
        }
    }

    public final void B() {
        if (q()) {
            try {
                this.x.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(this.E.a).setPitch(this.E.b).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e7) {
                e2.a.o("DefaultAudioSink", "Failed to set playback params", e7);
            }
            v0 v0Var = new v0(this.x.getPlaybackParams().getSpeed(), this.x.getPlaybackParams().getPitch());
            this.E = v0Var;
            float f7 = v0Var.a;
            s sVar = this.h;
            sVar.i = f7;
            r rVar = sVar.e;
            if (rVar != null) {
                rVar.a(0);
            }
            sVar.g();
        }
    }

    public final void C(b2.f fVar) {
        if (this.b0.equals(fVar)) {
            return;
        }
        fVar.getClass();
        if (this.x != null) {
            this.b0.getClass();
        }
        this.b0 = fVar;
    }

    public final void D(int i10, int i11) {
        v vVar;
        AudioTrack audioTrack = this.x;
        if (audioTrack == null || !r(audioTrack) || (vVar = this.v) == null || !vVar.k) {
            return;
        }
        this.x.setOffloadDelayPadding(i10, i11);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01ee A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0057 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void E(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2;
        int i10;
        byte b10;
        int i11;
        int i12;
        e2.d.g(this.T == null);
        if (byteBuffer.hasRemaining()) {
            if (this.v.c == 0) {
                int Y = (int) e2.d0.Y(e2.d0.Q(20L), this.v.e, 1000000L, RoundingMode.UP);
                long m10 = m();
                long j3 = Y;
                if (m10 < j3) {
                    v vVar = this.v;
                    int i13 = vVar.g;
                    int i14 = vVar.d;
                    int i15 = (int) m10;
                    byteBuffer2 = ByteBuffer.allocateDirect(byteBuffer.remaining()).order(ByteOrder.nativeOrder());
                    int position = byteBuffer.position();
                    while (byteBuffer.hasRemaining() && i15 < Y) {
                        if (i13 != 2) {
                            if (i13 == 3) {
                                i12 = (byteBuffer.get() & 255) << 24;
                            } else if (i13 == 4) {
                                float g10 = e2.d0.g(byteBuffer.getFloat(), -1.0f, 1.0f);
                                i12 = (int) (g10 < 0.0f ? (-g10) * (-2.14748365E9f) : g10 * 2.14748365E9f);
                            } else if (i13 == 21) {
                                i10 = ((byteBuffer.get() & 255) << 8) | ((byteBuffer.get() & 255) << 16);
                                b10 = byteBuffer.get();
                            } else if (i13 != 22) {
                                if (i13 == 268435456) {
                                    i10 = (byteBuffer.get() & 255) << 24;
                                    i11 = (byteBuffer.get() & 255) << 16;
                                } else if (i13 == 1342177280) {
                                    i10 = ((byteBuffer.get() & 255) << 24) | ((byteBuffer.get() & 255) << 16);
                                    i11 = (byteBuffer.get() & 255) << 8;
                                } else {
                                    if (i13 != 1610612736) {
                                        throw new IllegalStateException();
                                    }
                                    i10 = ((byteBuffer.get() & 255) << 24) | ((byteBuffer.get() & 255) << 16) | ((byteBuffer.get() & 255) << 8);
                                    i11 = byteBuffer.get() & 255;
                                }
                                i12 = i10 | i11;
                            } else {
                                i10 = (byteBuffer.get() & 255) | ((byteBuffer.get() & 255) << 8) | ((byteBuffer.get() & 255) << 16);
                                b10 = byteBuffer.get();
                            }
                            int i16 = (int) ((i12 * i15) / j3);
                            if (i13 != 2) {
                                byteBuffer2.put((byte) (i16 >> 16));
                                byteBuffer2.put((byte) (i16 >> 24));
                            } else if (i13 == 3) {
                                byteBuffer2.put((byte) (i16 >> 24));
                            } else if (i13 != 4) {
                                if (i13 == 21) {
                                    byteBuffer2.put((byte) (i16 >> 8));
                                    byteBuffer2.put((byte) (i16 >> 16));
                                    byteBuffer2.put((byte) (i16 >> 24));
                                } else if (i13 == 22) {
                                    byteBuffer2.put((byte) i16);
                                    byteBuffer2.put((byte) (i16 >> 8));
                                    byteBuffer2.put((byte) (i16 >> 16));
                                    byteBuffer2.put((byte) (i16 >> 24));
                                } else if (i13 == 268435456) {
                                    byteBuffer2.put((byte) (i16 >> 24));
                                    byteBuffer2.put((byte) (i16 >> 16));
                                } else if (i13 == 1342177280) {
                                    byteBuffer2.put((byte) (i16 >> 24));
                                    byteBuffer2.put((byte) (i16 >> 16));
                                    byteBuffer2.put((byte) (i16 >> 8));
                                } else {
                                    if (i13 != 1610612736) {
                                        throw new IllegalStateException();
                                    }
                                    byteBuffer2.put((byte) (i16 >> 24));
                                    byteBuffer2.put((byte) (i16 >> 16));
                                    byteBuffer2.put((byte) (i16 >> 8));
                                    byteBuffer2.put((byte) i16);
                                }
                            } else if (i16 < 0) {
                                byteBuffer2.putFloat((-i16) / (-2.14748365E9f));
                            } else {
                                byteBuffer2.putFloat(i16 / 2.14748365E9f);
                            }
                            if (byteBuffer.position() != position + i14) {
                                i15++;
                                position = byteBuffer.position();
                            }
                        } else {
                            i10 = (byteBuffer.get() & 255) << 16;
                            b10 = byteBuffer.get();
                        }
                        i11 = (b10 & 255) << 24;
                        i12 = i10 | i11;
                        int i162 = (int) ((i12 * i15) / j3);
                        if (i13 != 2) {
                        }
                        if (byteBuffer.position() != position + i14) {
                        }
                    }
                    byteBuffer2.put(byteBuffer);
                    byteBuffer2.flip();
                    this.T = byteBuffer2;
                }
            }
            byteBuffer2 = byteBuffer;
            this.T = byteBuffer2;
        }
    }

    public final void F(v0 v0Var) {
        this.E = new v0(e2.d0.g(v0Var.a, 0.1f, 8.0f), e2.d0.g(v0Var.b, 0.1f, 8.0f));
        if (H()) {
            B();
            return;
        }
        w wVar = new w(v0Var, -9223372036854775807L, -9223372036854775807L);
        if (q()) {
            this.C = wVar;
        } else {
            this.D = wVar;
        }
    }

    public final boolean G(b2.s sVar) {
        return k(sVar) != 0;
    }

    public final boolean H() {
        v vVar = this.v;
        return vVar != null && vVar.j && Build.VERSION.SDK_INT >= 23;
    }

    public final void a(long j3) {
        v0 v0Var;
        boolean H = H();
        boolean z10 = false;
        aa.a aVar = this.b;
        if (H) {
            v0Var = v0.d;
        } else {
            if (!this.d0) {
                v vVar = this.v;
                if (vVar.c == 0) {
                    int i10 = vVar.a.L;
                    v0Var = this.E;
                    c2.k kVar = (c2.k) aVar.d;
                    float f7 = v0Var.a;
                    kVar.getClass();
                    e2.d.b(f7 > 0.0f);
                    if (kVar.c != f7) {
                        kVar.c = f7;
                        kVar.i = true;
                    }
                    float f10 = v0Var.b;
                    e2.d.b(f10 > 0.0f);
                    if (kVar.d != f10) {
                        kVar.d = f10;
                        kVar.i = true;
                    }
                    this.E = v0Var;
                }
            }
            v0Var = v0.d;
            this.E = v0Var;
        }
        v0 v0Var2 = v0Var;
        if (!this.d0) {
            v vVar2 = this.v;
            if (vVar2.c == 0) {
                int i11 = vVar2.a.L;
                z10 = this.F;
                ((j0) aVar.c).o = z10;
            }
        }
        this.F = z10;
        this.i.add(new w(v0Var2, Math.max(0L, j3), e2.d0.W(this.v.e, m())));
        c2.e eVar = this.v.i;
        this.w = eVar;
        eVar.a();
        n nVar = this.t;
        if (nVar != null) {
            nVar.onSkipSilenceEnabledChanged(this.F);
        }
    }

    public final AudioTrack b(k kVar, b2.e eVar, int i10, b2.s sVar, Context context) {
        try {
            AudioTrack a2 = this.q.a(kVar, eVar, i10, context);
            int state = a2.getState();
            if (state == 1) {
                return a2;
            }
            try {
                a2.release();
            } catch (Exception unused) {
            }
            throw new m(state, kVar.b, kVar.c, kVar.a, kVar.f, sVar, kVar.e, null);
        } catch (IllegalArgumentException | UnsupportedOperationException e7) {
            throw new m(0, kVar.b, kVar.c, kVar.a, kVar.f, sVar, kVar.e, e7);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AudioTrack c(v vVar) {
        d0 d0Var;
        m mVar;
        n nVar;
        Context context;
        int i10;
        try {
            int i11 = this.Z;
            int i12 = this.r;
            try {
                if (i12 != -1) {
                    try {
                        Context context2 = this.a;
                        if (context2 != null && Build.VERSION.SDK_INT >= 34) {
                            if (this.m0 == null) {
                                this.m0 = context2.createDeviceContext(i12);
                            }
                            context = this.m0;
                            i10 = 0;
                            d0Var = this;
                            return d0Var.b(vVar.a(), this.B, i10, vVar.a, context);
                        }
                    } catch (m e7) {
                        mVar = e7;
                        d0Var = this;
                        nVar = d0Var.t;
                        if (nVar != null) {
                            throw mVar;
                        }
                        nVar.z(mVar);
                        throw mVar;
                    }
                }
                return d0Var.b(vVar.a(), this.B, i10, vVar.a, context);
            } catch (m e10) {
                e = e10;
                mVar = e;
                nVar = d0Var.t;
                if (nVar != null) {
                }
            }
            i10 = i11;
            context = null;
            d0Var = this;
        } catch (m e11) {
            e = e11;
            d0Var = this;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x01c1, code lost:
    
        if (r11 > 0) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01c4, code lost:
    
        if (r14 > 0) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01c7, code lost:
    
        if (r14 < 0) goto L84;
     */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(b2.s sVar, int[] iArr) {
        int i10;
        c2.e eVar;
        int intValue;
        int intValue2;
        int i11;
        int i12;
        int i13;
        boolean z10;
        c2.e eVar2;
        int i14;
        int h;
        int i15;
        int i16;
        int i17;
        s();
        String str = sVar.r;
        int i18 = sVar.K;
        int i19 = sVar.J;
        int i20 = sVar.L;
        boolean equals = "audio/raw".equals(str);
        boolean z11 = this.j;
        f0 f0Var = this.q;
        if (equals) {
            e2.d.b(e2.d0.K(i20));
            int t10 = e2.d0.t(i20) * i19;
            e9.f0 f0Var2 = new e9.f0(4);
            f0Var2.d(this.g);
            f0Var2.b(this.e);
            c2.h[] hVarArr = (c2.h[]) this.b.b;
            int length = hVarArr.length;
            e9.q.d(length, hVarArr);
            f0Var2.g(length);
            System.arraycopy(hVarArr, 0, f0Var2.c, f0Var2.a, length);
            f0Var2.a += length;
            c2.e eVar3 = new c2.e(f0Var2.i());
            if (eVar3.equals(this.w)) {
                eVar3 = this.w;
            }
            int i21 = sVar.M;
            int i22 = sVar.N;
            m0 m0Var = this.d;
            m0Var.i = i21;
            m0Var.j = i22;
            this.c.i = iArr;
            c2.f fVar = new c2.f(i18, i19, i20);
            try {
                e9.i0 i0Var = eVar3.a;
                if (fVar.equals(c2.f.e)) {
                    throw new c2.g(fVar);
                }
                for (int i23 = 0; i23 < i0Var.size(); i23++) {
                    c2.h hVar = (c2.h) i0Var.get(i23);
                    c2.f d = hVar.d(fVar);
                    if (hVar.isActive()) {
                        e2.d.g(!d.equals(c2.f.e));
                        fVar = d;
                    }
                }
                int i24 = fVar.b;
                int i25 = fVar.c;
                int i26 = fVar.a;
                f0Var.getClass();
                int s10 = e2.d0.s(i24);
                int t11 = e2.d0.t(i25) * i24;
                eVar = eVar3;
                z10 = false;
                i10 = i26;
                intValue2 = s10;
                intValue = i25;
                i11 = t10;
                i12 = t11;
                i13 = 0;
            } catch (c2.g e7) {
                throw new l(e7, sVar);
            }
        } else {
            c2.e eVar4 = new c2.e(a1.e);
            e j3 = this.k != 0 ? j(sVar) : e.d;
            if (this.k == 0 || !j3.a) {
                Pair d10 = this.y.d(this.B, sVar);
                if (d10 == null) {
                    throw new l("Unable to configure passthrough for: " + sVar, sVar);
                }
                i10 = i18;
                eVar = eVar4;
                intValue = ((Integer) d10.first).intValue();
                intValue2 = ((Integer) d10.second).intValue();
                i11 = -1;
                i12 = -1;
                i13 = 2;
                z10 = false;
            } else {
                str.getClass();
                int c10 = r0.c(str, sVar.k);
                f0Var.getClass();
                int s11 = e2.d0.s(i19);
                i10 = i18;
                eVar = eVar4;
                z10 = j3.b;
                intValue2 = s11;
                i11 = -1;
                z11 = true;
                i13 = 1;
                intValue = c10;
                i12 = -1;
            }
        }
        if (intValue == 0) {
            throw new l("Invalid output encoding (mode=" + i13 + ") for: " + sVar, sVar);
        }
        if (intValue2 == 0) {
            throw new l("Invalid output channel config (mode=" + i13 + ") for: " + sVar, sVar);
        }
        int i27 = sVar.j;
        if ("audio/vnd.dts.hd;profile=lbr".equals(str) && i27 == -1) {
            i27 = 768000;
        }
        int minBufferSize = AudioTrack.getMinBufferSize(i10, intValue2, intValue);
        e2.d.g(minBufferSize != -2);
        int i28 = i12 != -1 ? i12 : 1;
        double d11 = z11 ? 8.0d : 1.0d;
        this.o.getClass();
        if (i13 != 0) {
            if (i13 == 1) {
                eVar2 = eVar;
                int i29 = c3.b.i(intValue);
                e2.d.g(i29 != -2147483647);
                h = x7.b((50000000 * i29) / 1000000);
            } else {
                if (i13 != 2) {
                    throw new IllegalArgumentException();
                }
                if (intValue == 5) {
                    i16 = 500000;
                } else if (intValue == 8) {
                    i16 = MediaController.VIDEO_BITRATE_480;
                } else {
                    i15 = -1;
                    i16 = 250000;
                    if (i27 == i15) {
                        RoundingMode roundingMode = RoundingMode.CEILING;
                        roundingMode.getClass();
                        int i30 = i27 / 8;
                        int i31 = i27 - (8 * i30);
                        if (i31 != 0) {
                            int i32 = ((i27 ^ 8) >> 31) | 1;
                            switch (g9.d.a[roundingMode.ordinal()]) {
                                case 1:
                                    if (i31 != 0) {
                                        throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
                                    }
                                    break;
                                case 2:
                                    break;
                                case 3:
                                    break;
                                case 4:
                                    i30 += i32;
                                    break;
                                case 5:
                                    break;
                                case 6:
                                case 7:
                                case 8:
                                    int abs = Math.abs(i31);
                                    int abs2 = abs - (Math.abs(8) - abs);
                                    if (abs2 == 0) {
                                        RoundingMode roundingMode2 = RoundingMode.HALF_UP;
                                        RoundingMode roundingMode3 = RoundingMode.HALF_EVEN;
                                        break;
                                    }
                                    break;
                                default:
                                    throw new AssertionError();
                            }
                        }
                        i17 = i30;
                    } else {
                        i17 = c3.b.i(intValue);
                        e2.d.g(i17 != -2147483647);
                    }
                    eVar2 = eVar;
                    h = x7.b((i16 * i17) / 1000000);
                }
                i15 = -1;
                if (i27 == i15) {
                }
                eVar2 = eVar;
                h = x7.b((i16 * i17) / 1000000);
            }
            i14 = i11;
        } else {
            eVar2 = eVar;
            i14 = i11;
            long j10 = i10;
            long j11 = 250000 * j10;
            long j12 = i28;
            h = e2.d0.h(minBufferSize * 4, x7.b((j11 * j12) / 1000000), x7.b(((MediaController.VIDEO_BITRATE_360 * j10) * j12) / 1000000));
        }
        this.g0 = false;
        boolean z12 = z11;
        int i33 = intValue2;
        v vVar = new v(sVar, i14, i13, i12, i10, i33, intValue, (((Math.max(minBufferSize, (int) (h * d11)) + i28) - 1) / i28) * i28, eVar2, z12, z10, this.d0);
        if (q()) {
            this.u = vVar;
        } else {
            this.v = vVar;
        }
    }

    public final void e(long j3) {
        int write;
        n nVar;
        boolean z10;
        z zVar = this.n;
        if (this.T == null) {
            return;
        }
        if (zVar.a != null) {
            synchronized (o0) {
                z10 = q0 > 0;
            }
            if (z10 || SystemClock.elapsedRealtime() < zVar.c) {
                return;
            }
        }
        int remaining = this.T.remaining();
        if (this.d0) {
            e2.d.g(j3 != -9223372036854775807L);
            if (j3 == Long.MIN_VALUE) {
                j3 = this.e0;
            } else {
                this.e0 = j3;
            }
            AudioTrack audioTrack = this.x;
            ByteBuffer byteBuffer = this.T;
            if (Build.VERSION.SDK_INT >= 26) {
                write = audioTrack.write(byteBuffer, remaining, 1, 1000 * j3);
            } else {
                if (this.G == null) {
                    ByteBuffer allocate = ByteBuffer.allocate(16);
                    this.G = allocate;
                    allocate.order(ByteOrder.BIG_ENDIAN);
                    this.G.putInt(1431633921);
                }
                if (this.H == 0) {
                    this.G.putInt(4, remaining);
                    this.G.putLong(8, j3 * 1000);
                    this.G.position(0);
                    this.H = remaining;
                }
                int remaining2 = this.G.remaining();
                if (remaining2 > 0) {
                    int write2 = audioTrack.write(this.G, remaining2, 1);
                    if (write2 < 0) {
                        this.H = 0;
                        write = write2;
                    } else if (write2 < remaining2) {
                        write = 0;
                    }
                }
                write = audioTrack.write(byteBuffer, remaining, 1);
                if (write < 0) {
                    this.H = 0;
                } else {
                    this.H -= write;
                }
            }
        } else {
            write = this.x.write(this.T, remaining, 1);
        }
        this.f0 = SystemClock.elapsedRealtime();
        if (write < 0) {
            if ((Build.VERSION.SDK_INT >= 24 && write == -6) || write == -32) {
                if (m() <= 0) {
                    if (r(this.x)) {
                        if (this.v.c == 1) {
                            this.g0 = true;
                        }
                    }
                }
                r2 = true;
            }
            o oVar = new o(write, this.v.a, r2);
            n nVar2 = this.t;
            if (nVar2 != null) {
                nVar2.z(oVar);
            }
            if (!oVar.b || this.a == null) {
                zVar.a(oVar);
                return;
            }
            b bVar = b.c;
            this.y = bVar;
            this.z.a(bVar);
            throw oVar;
        }
        zVar.a = null;
        zVar.b = -9223372036854775807L;
        zVar.c = -9223372036854775807L;
        if (r(this.x)) {
            if (this.L > 0) {
                this.h0 = false;
            }
            if (this.X && (nVar = this.t) != null && write < remaining && !this.h0) {
                nVar.l();
            }
        }
        int i10 = this.v.c;
        if (i10 == 0) {
            this.K += write;
        }
        if (write == remaining) {
            if (i10 != 0) {
                e2.d.g(this.T == this.R);
                this.L = (this.M * this.S) + this.L;
            }
            this.T = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0044 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0043 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean f() {
        ByteBuffer byteBuffer;
        if (!this.w.d()) {
            e(Long.MIN_VALUE);
            return this.T == null;
        }
        c2.e eVar = this.w;
        if (eVar.d() && !eVar.d) {
            eVar.d = true;
            ((c2.h) eVar.b.get(0)).e();
        }
        x(Long.MIN_VALUE);
        if (!this.w.c() || ((byteBuffer = this.T) != null && byteBuffer.hasRemaining())) {
        }
    }

    public final void g() {
        y yVar;
        if (q()) {
            this.I = 0L;
            this.J = 0L;
            this.K = 0L;
            this.L = 0L;
            this.h0 = false;
            this.M = 0;
            this.D = new w(this.E, 0L, 0L);
            this.P = 0L;
            this.C = null;
            this.i.clear();
            this.R = null;
            this.S = 0;
            this.T = null;
            this.V = false;
            this.U = false;
            this.W = false;
            this.G = null;
            this.H = 0;
            this.d.o = 0L;
            c2.e eVar = this.v.i;
            this.w = eVar;
            eVar.a();
            AudioTrack audioTrack = this.h.c;
            audioTrack.getClass();
            if (audioTrack.getPlayState() == 3) {
                this.x.pause();
            }
            if (r(this.x)) {
                c0 c0Var = this.l;
                c0Var.getClass();
                c0Var.a(this.x);
            }
            k a2 = this.v.a();
            v vVar = this.u;
            if (vVar != null) {
                this.v = vVar;
                this.u = null;
            }
            s sVar = this.h;
            sVar.g();
            sVar.c = null;
            sVar.e = null;
            if (Build.VERSION.SDK_INT >= 24 && (yVar = this.A) != null) {
                yVar.b();
                this.A = null;
            }
            AudioTrack audioTrack2 = this.x;
            n nVar = this.t;
            Handler handler = new Handler(Looper.myLooper());
            synchronized (o0) {
                try {
                    if (p0 == null) {
                        String str = e2.d0.a;
                        p0 = Executors.newSingleThreadScheduledExecutor(new e2.c0(0));
                    }
                    q0++;
                    p0.schedule(new androidx.car.app.utils.b(audioTrack2, nVar, handler, a2, 20), 20L, TimeUnit.MILLISECONDS);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.x = null;
        }
        z zVar = this.n;
        zVar.a = null;
        zVar.b = -9223372036854775807L;
        zVar.c = -9223372036854775807L;
        z zVar2 = this.m;
        zVar2.a = null;
        zVar2.b = -9223372036854775807L;
        zVar2.c = -9223372036854775807L;
        this.j0 = 0L;
        this.k0 = 0L;
        Handler handler2 = this.l0;
        if (handler2 != null) {
            handler2.removeCallbacksAndMessages(null);
        }
    }

    public final long h() {
        long j3;
        if (!q()) {
            return -9223372036854775807L;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            return e0.b.c(this.x, this.v);
        }
        v vVar = this.v;
        if (vVar.c == 0) {
            j3 = vVar.e * vVar.d;
        } else {
            int i10 = c3.b.i(vVar.g);
            e2.d.g(i10 != -2147483647);
            j3 = i10;
        }
        return e2.d0.Y(this.v.h, 1000000L, j3, RoundingMode.DOWN);
    }

    public final long i() {
        ArrayDeque arrayDeque;
        long j3;
        if (!q() || this.O) {
            return Long.MIN_VALUE;
        }
        long min = Math.min(this.h.a(), e2.d0.W(this.v.e, m()));
        while (true) {
            arrayDeque = this.i;
            if (arrayDeque.isEmpty() || min < ((w) arrayDeque.getFirst()).c) {
                break;
            }
            this.D = (w) arrayDeque.remove();
        }
        w wVar = this.D;
        long j10 = min - wVar.c;
        long z10 = e2.d0.z(j10, wVar.a.a);
        boolean isEmpty = arrayDeque.isEmpty();
        aa.a aVar = this.b;
        if (isEmpty) {
            c2.k kVar = (c2.k) aVar.d;
            if (kVar.isActive()) {
                if (kVar.o >= 1024) {
                    long j11 = kVar.n;
                    kVar.j.getClass();
                    long j12 = j11 - ((r8.k * r8.b) * 2);
                    int i10 = kVar.h.a;
                    int i11 = kVar.g.a;
                    j10 = i10 == i11 ? e2.d0.Y(j10, j12, kVar.o, RoundingMode.DOWN) : e2.d0.Y(j10, j12 * i10, kVar.o * i11, RoundingMode.DOWN);
                } else {
                    j10 = (long) (kVar.c * j10);
                }
            }
            w wVar2 = this.D;
            j3 = wVar2.b + j10;
            wVar2.d = j10 - z10;
        } else {
            w wVar3 = this.D;
            j3 = wVar3.b + z10 + wVar3.d;
        }
        long j13 = ((j0) aVar.c).q;
        long W = e2.d0.W(this.v.e, j13) + j3;
        long j14 = this.j0;
        if (j13 > j14) {
            long W2 = e2.d0.W(this.v.e, j13 - j14);
            this.j0 = j13;
            this.k0 += W2;
            if (this.l0 == null) {
                this.l0 = new Handler(Looper.myLooper());
            }
            this.l0.removeCallbacksAndMessages(null);
            this.l0.postDelayed(new t0(this, 12), 100L);
        }
        return W;
    }

    public final e j(b2.s sVar) {
        boolean booleanValue;
        if (this.g0) {
            return e.d;
        }
        b2.e eVar = this.B;
        pf.b bVar = this.p;
        bVar.getClass();
        sVar.getClass();
        int i10 = sVar.K;
        eVar.getClass();
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 29 || i10 == -1) {
            return e.d;
        }
        Context context = (Context) bVar.b;
        Boolean bool = (Boolean) bVar.c;
        if (bool != null) {
            booleanValue = bool.booleanValue();
        } else {
            if (context != null) {
                String parameters = c2.d.e(context).getParameters("offloadVariableRateSupported");
                bVar.c = Boolean.valueOf(parameters != null && parameters.equals("offloadVariableRateSupported=1"));
            } else {
                bVar.c = Boolean.FALSE;
            }
            booleanValue = ((Boolean) bVar.c).booleanValue();
        }
        String str = sVar.r;
        str.getClass();
        int c10 = r0.c(str, sVar.k);
        if (c10 == 0 || i11 < e2.d0.q(c10)) {
            return e.d;
        }
        int s10 = e2.d0.s(sVar.J);
        if (s10 == 0) {
            return e.d;
        }
        try {
            AudioFormat r10 = e2.d0.r(i10, s10, c10);
            return i11 >= 31 ? e0.h0.a(r10, (AudioAttributes) eVar.b().a, booleanValue) : b2.c.f(r10, (AudioAttributes) eVar.b().a, booleanValue);
        } catch (IllegalArgumentException unused) {
            return e.d;
        }
    }

    public final int k(b2.s sVar) {
        s();
        String str = sVar.r;
        int i10 = sVar.L;
        if ("audio/raw".equals(str)) {
            if (!e2.d0.K(i10)) {
                e2.n(i10, "Invalid PCM encoding: ", "DefaultAudioSink");
                return 0;
            }
            if (i10 != 2) {
                return 1;
            }
        } else if (this.y.d(this.B, sVar) == null) {
            return 0;
        }
        return 2;
    }

    public final long l() {
        return this.v.c == 0 ? this.I / r0.b : this.J;
    }

    public final long m() {
        v vVar = this.v;
        if (vVar.c != 0) {
            return this.L;
        }
        long j3 = this.K;
        long j10 = vVar.d;
        String str = e2.d0.a;
        return ((j3 + j10) - 1) / j10;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x0113, code lost:
    
        if (r9.b() == 0) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x03b6, code lost:
    
        if (r13 == 0) goto L223;
     */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x048a  */
    /* JADX WARN: Removed duplicated region for block: B:228:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:230:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x016a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean n(long j3, int i10, ByteBuffer byteBuffer) {
        boolean z10;
        boolean z11;
        boolean z12;
        int i11;
        int k10;
        int i12;
        byte b10;
        int i13;
        byte b11;
        int i14;
        int i15;
        int i16;
        int i17;
        ByteBuffer byteBuffer2 = this.R;
        e2.d.b(byteBuffer2 == null || byteBuffer == byteBuffer2);
        v vVar = this.u;
        s sVar = this.h;
        if (vVar != null) {
            if (!f()) {
                return false;
            }
            v vVar2 = this.u;
            v vVar3 = this.v;
            vVar2.getClass();
            if (vVar3.c == vVar2.c && vVar3.g == vVar2.g && vVar3.e == vVar2.e && vVar3.f == vVar2.f && vVar3.d == vVar2.d && vVar3.j == vVar2.j && vVar3.k == vVar2.k) {
                this.v = this.u;
                this.u = null;
                AudioTrack audioTrack = this.x;
                if (audioTrack != null && r(audioTrack) && this.v.k) {
                    if (this.x.getPlayState() == 3) {
                        this.x.setOffloadEndOfStream();
                        sVar.G = true;
                        r rVar = sVar.e;
                        if (rVar != null) {
                            rVar.a.f = true;
                        }
                    }
                    AudioTrack audioTrack2 = this.x;
                    b2.s sVar2 = this.v.a;
                    audioTrack2.setOffloadDelayPadding(sVar2.M, sVar2.N);
                    this.h0 = true;
                }
            } else {
                v();
                if (o()) {
                    return false;
                }
                g();
            }
            a(j3);
        }
        boolean q6 = q();
        z zVar = this.m;
        if (!q6) {
            try {
                if (!p()) {
                    return false;
                }
            } catch (m e7) {
                if (e7.b) {
                    throw e7;
                }
                zVar.a(e7);
                return false;
            }
        }
        zVar.a = null;
        zVar.b = -9223372036854775807L;
        zVar.c = -9223372036854775807L;
        if (this.O) {
            this.P = Math.max(0L, j3);
            this.N = false;
            this.O = false;
            if (H()) {
                B();
            }
            a(j3);
            if (this.X) {
                u();
            }
        }
        long m10 = m();
        AudioTrack audioTrack3 = sVar.c;
        audioTrack3.getClass();
        int playState = audioTrack3.getPlayState();
        if (sVar.g) {
            if (playState == 2) {
                sVar.q = false;
            } else if (playState == 1) {
            }
            z11 = false;
            if (z11) {
                return false;
            }
            if (this.R == null) {
                e2.d.b(byteBuffer.order() == ByteOrder.LITTLE_ENDIAN);
                if (byteBuffer.hasRemaining()) {
                    v vVar4 = this.v;
                    if (vVar4.c != 0 && this.M == 0) {
                        int i18 = vVar4.g;
                        if (i18 != 20) {
                            if (i18 != 30) {
                                switch (i18) {
                                    case 5:
                                    case 6:
                                        if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) {
                                            k10 = c3.b.c[((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4 : 3] * 256;
                                            break;
                                        } else {
                                            k10 = 1536;
                                            break;
                                        }
                                    case 7:
                                    case 8:
                                        break;
                                    case 9:
                                        int position = byteBuffer.position();
                                        String str = e2.d0.a;
                                        int i19 = byteBuffer.getInt(position);
                                        if (byteBuffer.order() != ByteOrder.BIG_ENDIAN) {
                                            i19 = Integer.reverseBytes(i19);
                                        }
                                        if (((i19 & (-2097152)) == -2097152) && (i14 = (i19 >>> 19) & 3) != 1 && (i15 = (i19 >>> 17) & 3) != 0) {
                                            int i20 = (i19 >>> 12) & 15;
                                            int i21 = (i19 >>> 10) & 3;
                                            if (i20 != 0 && i20 != 15 && i21 != 3) {
                                                i16 = 1152;
                                                if (i15 != 1) {
                                                    if (i15 != 2) {
                                                        if (i15 != 3) {
                                                            throw new IllegalArgumentException();
                                                        }
                                                        i16 = 384;
                                                    }
                                                } else if (i14 != 3) {
                                                    i16 = 576;
                                                }
                                                if (i16 != -1) {
                                                    throw new IllegalArgumentException();
                                                }
                                                k10 = i16;
                                                break;
                                            }
                                        }
                                        i16 = -1;
                                        if (i16 != -1) {
                                        }
                                        break;
                                    case 10:
                                        k10 = 1024;
                                        break;
                                    case 11:
                                    case 12:
                                        k10 = 2048;
                                        break;
                                    default:
                                        switch (i18) {
                                            case 14:
                                                int position2 = byteBuffer.position();
                                                int limit = byteBuffer.limit() - 10;
                                                int i22 = position2;
                                                while (true) {
                                                    if (i22 <= limit) {
                                                        String str2 = e2.d0.a;
                                                        int i23 = byteBuffer.getInt(i22 + 4);
                                                        if (byteBuffer.order() != ByteOrder.BIG_ENDIAN) {
                                                            i23 = Integer.reverseBytes(i23);
                                                        }
                                                        if ((i23 & (-2)) == -126718022) {
                                                            i17 = i22 - position2;
                                                        } else {
                                                            i22++;
                                                        }
                                                    } else {
                                                        i17 = -1;
                                                    }
                                                }
                                                if (i17 == -1) {
                                                    k10 = 0;
                                                    break;
                                                } else {
                                                    k10 = (40 << ((byteBuffer.get((byteBuffer.position() + i17) + ((byteBuffer.get((byteBuffer.position() + i17) + 7) & 255) == 187 ? 9 : 8)) >> 4) & 7)) * 16;
                                                    break;
                                                }
                                            case 15:
                                                k10 = 512;
                                                break;
                                            case 16:
                                                break;
                                            case 17:
                                                byte[] bArr = new byte[16];
                                                int position3 = byteBuffer.position();
                                                byteBuffer.get(bArr);
                                                byteBuffer.position(position3);
                                                k10 = c3.b.m(new a4.h(bArr, 16)).c;
                                                break;
                                            case 18:
                                                break;
                                            default:
                                                throw new IllegalStateException(i2.g.i(i18, "Unexpected audio encoding: "));
                                        }
                                }
                            }
                            if (byteBuffer.getInt(0) != -233094848 && byteBuffer.getInt(0) != -398277519) {
                                if (byteBuffer.getInt(0) == 622876772) {
                                    k10 = 4096;
                                } else {
                                    int position4 = byteBuffer.position();
                                    byte b12 = byteBuffer.get(position4);
                                    if (b12 != -2) {
                                        if (b12 == -1) {
                                            i12 = (byteBuffer.get(position4 + 4) & 7) << 4;
                                            b11 = byteBuffer.get(position4 + 7);
                                        } else if (b12 != 31) {
                                            i12 = (byteBuffer.get(position4 + 4) & 1) << 6;
                                            b10 = byteBuffer.get(position4 + 5);
                                        } else {
                                            i12 = (byteBuffer.get(position4 + 5) & 7) << 4;
                                            b11 = byteBuffer.get(position4 + 6);
                                        }
                                        i13 = b11 & 60;
                                        k10 = (((i13 >> 2) | i12) + 1) * 32;
                                    } else {
                                        i12 = (byteBuffer.get(position4 + 5) & 1) << 6;
                                        b10 = byteBuffer.get(position4 + 4);
                                    }
                                    i13 = b10 & 252;
                                    k10 = (((i13 >> 2) | i12) + 1) * 32;
                                }
                            }
                            k10 = 1024;
                        } else {
                            if ((byteBuffer.get(5) & 2) == 0) {
                                i11 = 0;
                            } else {
                                byte b13 = byteBuffer.get(26);
                                int i24 = 28;
                                int i25 = 28;
                                for (int i26 = 0; i26 < b13; i26++) {
                                    i25 += byteBuffer.get(i26 + 27);
                                }
                                byte b14 = byteBuffer.get(i25 + 26);
                                for (int i27 = 0; i27 < b14; i27++) {
                                    i24 += byteBuffer.get(i25 + 27 + i27);
                                }
                                i11 = i25 + i24;
                            }
                            int i28 = byteBuffer.get(i11 + 26) + 27 + i11;
                            k10 = (int) ((c3.b.k(byteBuffer.get(i28), byteBuffer.limit() - i28 > 1 ? byteBuffer.get(i28 + 1) : (byte) 0) * 48000) / 1000000);
                        }
                        this.M = k10;
                    }
                    if (this.C != null) {
                        if (!f()) {
                            return false;
                        }
                        a(j3);
                        this.C = null;
                    }
                    long W = e2.d0.W(this.v.a.K, l() - this.d.o) + this.P;
                    if (!this.N && Math.abs(W - j3) > 200000) {
                        n nVar = this.t;
                        if (nVar != null) {
                            StringBuilder t10 = a4.a.t(W, "Unexpected audio track timestamp discontinuity: expected ", ", got ");
                            t10.append(j3);
                            nVar.z(new cc.k(t10.toString()));
                        }
                        this.N = true;
                    }
                    if (this.N) {
                        if (!f()) {
                            return false;
                        }
                        long j10 = j3 - W;
                        this.P += j10;
                        this.N = false;
                        a(j3);
                        n nVar2 = this.t;
                        if (nVar2 != null && j10 != 0) {
                            nVar2.K();
                        }
                    }
                    if (this.v.c == 0) {
                        this.I += byteBuffer.remaining();
                    } else {
                        this.J = (this.M * i10) + this.J;
                    }
                    this.R = byteBuffer;
                    this.S = i10;
                }
                return true;
            }
            x(j3);
            if (!this.R.hasRemaining()) {
                this.R = null;
                this.S = 0;
                return true;
            }
            long m11 = m();
            if (sVar.A != -9223372036854775807L && m11 > 0) {
                sVar.I.getClass();
                if (SystemClock.elapsedRealtime() - sVar.A >= 200) {
                    z12 = true;
                    if (z12) {
                        return false;
                    }
                    e2.a.n("DefaultAudioSink", "Resetting stalled audio track");
                    g();
                    return true;
                }
            }
            z12 = false;
            if (z12) {
            }
        }
        if (Build.VERSION.SDK_INT >= 24) {
            AudioTrack audioTrack4 = sVar.c;
            audioTrack4.getClass();
            int underrunCount = audioTrack4.getUnderrunCount();
            z10 = underrunCount > sVar.l;
            sVar.l = underrunCount;
        } else {
            boolean z13 = sVar.q;
            boolean e10 = sVar.e(m10);
            sVar.q = e10;
            z10 = (!z13 || e10 || playState == 1) ? false : true;
        }
        if (z10) {
            xa.c cVar = sVar.a;
            int i29 = sVar.d;
            long e02 = e2.d0.e0(sVar.h);
            d0 d0Var = (d0) cVar.b;
            if (d0Var.t != null) {
                d0Var.t.q(i29, e02, SystemClock.elapsedRealtime() - d0Var.f0);
            }
        }
        z11 = true;
        if (z11) {
        }
    }

    public final boolean o() {
        if (q()) {
            return !(Build.VERSION.SDK_INT >= 29 && this.x.isOffloadedPlayback() && this.W) && this.h.e(m());
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:87:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:89:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean p() {
        AudioTrack c10;
        g7 g7Var;
        j2.k kVar;
        boolean z10;
        z zVar = this.m;
        if (zVar.a != null) {
            synchronized (o0) {
                z10 = q0 > 0;
            }
            if (z10 || SystemClock.elapsedRealtime() < zVar.c) {
                return false;
            }
        }
        try {
            v vVar = this.v;
            vVar.getClass();
            c10 = c(vVar);
        } catch (m e7) {
            v vVar2 = this.v;
            if (vVar2.h > 1000000) {
                v vVar3 = new v(vVar2.a, vVar2.b, vVar2.c, vVar2.d, vVar2.e, vVar2.f, vVar2.g, MediaController.VIDEO_BITRATE_480, vVar2.i, vVar2.j, vVar2.k, vVar2.l);
                try {
                    c10 = c(vVar3);
                    this.v = vVar3;
                } catch (m e10) {
                    e7.addSuppressed(e10);
                    if (this.v.c == 1) {
                    }
                }
            }
            if (this.v.c == 1) {
                throw e7;
            }
            this.g0 = true;
            throw e7;
        }
        this.x = c10;
        if (r(c10)) {
            AudioTrack audioTrack = this.x;
            if (this.l == null) {
                this.l = new c0(this);
            }
            c0 c0Var = this.l;
            Handler handler = c0Var.a;
            Objects.requireNonNull(handler);
            audioTrack.registerStreamEventCallback(new a0(handler, 0), c0Var.b);
            v vVar4 = this.v;
            if (vVar4.k) {
                AudioTrack audioTrack2 = this.x;
                b2.s sVar = vVar4.a;
                audioTrack2.setOffloadDelayPadding(sVar.M, sVar.N);
            }
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31 && (kVar = this.s) != null) {
            e0.h0.d(this.x, kVar);
        }
        s sVar2 = this.h;
        AudioTrack audioTrack3 = this.x;
        v vVar5 = this.v;
        boolean z11 = vVar5.c == 2;
        int i11 = vVar5.g;
        int i12 = vVar5.d;
        int i13 = vVar5.h;
        boolean z12 = this.n0;
        sVar2.c = audioTrack3;
        sVar2.d = i13;
        sVar2.e = new r(audioTrack3, sVar2.a);
        sVar2.f = audioTrack3.getSampleRate();
        sVar2.g = z11 && i10 < 23 && (i11 == 5 || i11 == 6);
        boolean K = e2.d0.K(i11);
        sVar2.r = K;
        sVar2.h = K ? e2.d0.W(sVar2.f, i13 / i12) : -9223372036854775807L;
        sVar2.u = 0L;
        sVar2.v = 0L;
        sVar2.G = false;
        sVar2.H = 0L;
        sVar2.w = 0L;
        sVar2.q = false;
        sVar2.z = -9223372036854775807L;
        sVar2.A = -9223372036854775807L;
        sVar2.s = 0L;
        sVar2.p = 0L;
        sVar2.i = 1.0f;
        sVar2.l = 0;
        sVar2.k = -9223372036854775807L;
        sVar2.D = z12;
        if (q()) {
            this.x.setVolume(this.Q);
        }
        this.b0.getClass();
        u4 u4Var = this.c0;
        if (u4Var != null && i10 >= 23) {
            e0.b.G(this.x, u4Var);
            g7 g7Var2 = this.z;
            if (g7Var2 != null) {
                g7Var2.c((AudioDeviceInfo) this.c0.b);
            }
        }
        if (i10 >= 24 && (g7Var = this.z) != null) {
            this.A = new y(this.x, g7Var);
        }
        this.O = true;
        int audioSessionId = this.x.getAudioSessionId();
        boolean z13 = audioSessionId != this.Z;
        this.Z = audioSessionId;
        n nVar = this.t;
        if (nVar != null) {
            nVar.V(this.v.a());
            if (z13) {
                this.a0 = true;
                this.t.onAudioSessionIdChanged(this.Z);
            }
        }
        return true;
    }

    public final boolean q() {
        return this.x != null;
    }

    public final void s() {
        Context context;
        b bVar;
        c cVar;
        Looper myLooper = Looper.myLooper();
        boolean z10 = this.z == null || this.i0 == myLooper;
        StringBuilder sb2 = new StringBuilder("DefaultAudioSink accessed on multiple threads: ");
        Looper looper = this.i0;
        String str = BuildConfig.BETA_URL;
        sb2.append(looper == null ? BuildConfig.BETA_URL : looper.getThread().getName());
        sb2.append(" and ");
        if (myLooper != null) {
            str = myLooper.getThread().getName();
        }
        sb2.append(str);
        e2.d.f(sb2.toString(), z10);
        if (this.z == null && (context = this.a) != null) {
            this.i0 = myLooper;
            g7 g7Var = new g7(context, new k5(this, 1), this.B, this.c0);
            this.z = g7Var;
            Handler handler = (Handler) g7Var.d;
            Context context2 = (Context) g7Var.b;
            if (g7Var.a) {
                bVar = (b) g7Var.h;
                bVar.getClass();
            } else {
                g7Var.a = true;
                d dVar = (d) g7Var.g;
                if (dVar != null) {
                    dVar.a.registerContentObserver(dVar.b, false, dVar);
                }
                if (Build.VERSION.SDK_INT >= 23 && (cVar = (c) g7Var.e) != null) {
                    e0.b.u(context2, cVar, handler);
                }
                b b10 = b.b(context2, context2.registerReceiver((androidx.mediarouter.app.g) g7Var.f, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), null, handler), (b2.e) g7Var.j, (u4) g7Var.i);
                g7Var.h = b10;
                bVar = b10;
            }
            this.y = bVar;
        }
        this.y.getClass();
    }

    public final void t() {
        this.X = false;
        if (q()) {
            s sVar = this.h;
            sVar.g();
            if (sVar.z == -9223372036854775807L) {
                r rVar = sVar.e;
                rVar.getClass();
                rVar.a(0);
            }
            sVar.B = sVar.b();
            if (!this.V || r(this.x)) {
                this.x.pause();
            }
        }
    }

    public final void u() {
        this.X = true;
        if (q()) {
            s sVar = this.h;
            if (sVar.z != -9223372036854775807L) {
                sVar.I.getClass();
                sVar.z = e2.d0.Q(SystemClock.elapsedRealtime());
            }
            sVar.k = e2.d0.W(sVar.f, sVar.b());
            r rVar = sVar.e;
            rVar.getClass();
            rVar.a(0);
            if (!this.V || r(this.x)) {
                this.x.play();
            }
        }
    }

    public final void v() {
        if (this.V) {
            return;
        }
        this.V = true;
        long m10 = m();
        s sVar = this.h;
        sVar.B = sVar.b();
        sVar.I.getClass();
        sVar.z = e2.d0.Q(SystemClock.elapsedRealtime());
        sVar.C = m10;
        if (r(this.x)) {
            this.W = false;
        }
        this.x.stop();
        this.H = 0;
    }

    public final void w() {
        if (!this.U && q() && f()) {
            v();
            this.U = true;
        }
    }

    public final void x(long j3) {
        ByteBuffer byteBuffer;
        e(j3);
        if (this.T != null) {
            return;
        }
        if (!this.w.d()) {
            ByteBuffer byteBuffer2 = this.R;
            if (byteBuffer2 != null) {
                E(byteBuffer2);
                e(j3);
                return;
            }
            return;
        }
        while (!this.w.c()) {
            do {
                c2.e eVar = this.w;
                if (eVar.d()) {
                    ByteBuffer byteBuffer3 = eVar.c[eVar.b()];
                    if (byteBuffer3.hasRemaining()) {
                        byteBuffer = byteBuffer3;
                    } else {
                        eVar.e(c2.h.a);
                        byteBuffer = eVar.c[eVar.b()];
                    }
                } else {
                    byteBuffer = c2.h.a;
                }
                if (byteBuffer.hasRemaining()) {
                    E(byteBuffer);
                    e(j3);
                } else {
                    ByteBuffer byteBuffer4 = this.R;
                    if (byteBuffer4 == null || !byteBuffer4.hasRemaining()) {
                        return;
                    }
                    c2.e eVar2 = this.w;
                    ByteBuffer byteBuffer5 = this.R;
                    if (eVar2.d() && !eVar2.d) {
                        eVar2.e(byteBuffer5);
                    }
                }
            } while (this.T == null);
            return;
        }
    }

    public final void y() {
        g();
        e9.g0 listIterator = this.g.listIterator(0);
        while (listIterator.hasNext()) {
            ((c2.h) listIterator.next()).reset();
        }
        this.e.reset();
        this.f.reset();
        c2.e eVar = this.w;
        if (eVar != null) {
            e9.i0 i0Var = eVar.a;
            for (int i10 = 0; i10 < i0Var.size(); i10++) {
                c2.h hVar = (c2.h) i0Var.get(i10);
                hVar.flush();
                hVar.reset();
            }
            eVar.c = new ByteBuffer[0];
            c2.f fVar = c2.f.e;
            eVar.d = false;
        }
        this.X = false;
        this.g0 = false;
    }

    public final void z(b2.e eVar) {
        if (this.B.equals(eVar)) {
            return;
        }
        this.B = eVar;
        if (this.d0) {
            return;
        }
        g7 g7Var = this.z;
        if (g7Var != null) {
            g7Var.j = eVar;
            g7Var.a(b.c((Context) g7Var.b, eVar, (u4) g7Var.i));
        }
        g();
    }
}
