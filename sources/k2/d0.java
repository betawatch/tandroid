package k2;

import ai.e6;
import ai.i5;
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
import ci.e7;
import com.google.android.gms.internal.vision.e2;
import e9.a1;
import ei.c5;
import j$.util.Objects;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.telegram.messenger.MediaController;
import v7.v7;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class d0 implements p {
    public static final Object n0 = new Object();
    public static ScheduledExecutorService o0;
    public static int p0;
    public b2.e A;
    public w B;
    public w C;
    public v0 D;
    public boolean E;
    public ByteBuffer F;
    public int G;
    public long H;
    public long I;
    public long J;
    public long K;
    public int L;
    public boolean M;
    public boolean N;
    public long O;
    public float P;
    public ByteBuffer Q;
    public int R;
    public ByteBuffer S;
    public boolean T;
    public boolean U;
    public boolean V;
    public boolean W;
    public boolean X;
    public int Y;
    public boolean Z;
    public final Context a;
    public b2.f a0;
    public final aa.a b;
    public a4.l b0;
    public final t c;
    public boolean c0;
    public final m0 d;
    public long d0;
    public final c2.l e;
    public long e0;
    public final l0 f;
    public boolean f0;
    public final a1 g;
    public boolean g0;
    public final s h;
    public Looper h0;
    public final ArrayDeque i;
    public long i0;
    public int j;
    public long j0;
    public c0 k;
    public Handler k0;
    public final z l;
    public Context l0;
    public final z m;
    public final boolean m0;
    public final e0 n;
    public final pf.b o;
    public final f0 p;
    public final int q;
    public j2.k r;
    public n s;
    public v t;
    public v u;
    public c2.e v;
    public AudioTrack w;
    public b x;
    public e7 y;
    public y z;

    public d0(e6 e6Var) {
        int deviceId;
        Context context = (Context) e6Var.b;
        Context applicationContext = context == null ? null : context.getApplicationContext();
        this.a = applicationContext;
        this.A = b2.e.h;
        this.x = applicationContext == null ? (b) e6Var.c : null;
        this.b = (aa.a) e6Var.d;
        int i10 = Build.VERSION.SDK_INT;
        this.j = 0;
        this.n = (e0) e6Var.e;
        pf.b bVar = (pf.b) e6Var.g;
        bVar.getClass();
        this.o = bVar;
        this.h = new s(new xa.d(this, 28));
        t tVar = new t();
        this.c = tVar;
        m0 m0Var = new m0();
        m0Var.m = e2.d0.b;
        this.d = m0Var;
        this.e = new c2.l();
        this.f = new l0();
        this.g = e9.i0.A(m0Var, tVar);
        this.P = 1.0f;
        this.Y = 0;
        this.a0 = new b2.f();
        v0 v0Var = v0.d;
        this.C = new w(v0Var, 0L, 0L);
        this.D = v0Var;
        this.E = false;
        this.i = new ArrayDeque();
        this.l = new z();
        this.m = new z();
        this.p = (f0) e6Var.f;
        int i11 = -1;
        if (i10 >= 34 && context != null && (deviceId = context.getDeviceId()) != 0 && deviceId != -1) {
            i11 = deviceId;
        }
        this.q = i11;
        this.m0 = true;
    }

    public static boolean r(AudioTrack audioTrack) {
        return Build.VERSION.SDK_INT >= 29 && audioTrack.isOffloadedPlayback();
    }

    public final void A(int i10) {
        if (this.Z) {
            if (this.Y != i10) {
                return;
            } else {
                this.Z = false;
            }
        }
        if (this.Y != i10) {
            this.Y = i10;
            this.X = i10 != 0;
            g();
        }
    }

    public final void B() {
        if (q()) {
            try {
                this.w.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(this.D.a).setPitch(this.D.b).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e7) {
                e2.a.o("DefaultAudioSink", "Failed to set playback params", e7);
            }
            v0 v0Var = new v0(this.w.getPlaybackParams().getSpeed(), this.w.getPlaybackParams().getPitch());
            this.D = v0Var;
            float f7 = v0Var.a;
            s sVar = this.h;
            sVar.h = f7;
            r rVar = sVar.e;
            if (rVar != null) {
                rVar.a(0);
            }
            sVar.f();
        }
    }

    public final void C(b2.f fVar) {
        if (this.a0.equals(fVar)) {
            return;
        }
        fVar.getClass();
        if (this.w != null) {
            this.a0.getClass();
        }
        this.a0 = fVar;
    }

    public final void D(int i10, int i11) {
        v vVar;
        AudioTrack audioTrack = this.w;
        if (audioTrack == null || !r(audioTrack) || (vVar = this.u) == null || !vVar.k) {
            return;
        }
        this.w.setOffloadDelayPadding(i10, i11);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01ed A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0057 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void E(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2;
        int i10;
        byte b10;
        int i11;
        int i12;
        e2.d.g(this.S == null);
        if (byteBuffer.hasRemaining()) {
            if (this.u.c == 0) {
                int X = (int) e2.d0.X(e2.d0.P(20L), this.u.e, 1000000L, RoundingMode.UP);
                long m10 = m();
                long j3 = X;
                if (m10 < j3) {
                    v vVar = this.u;
                    int i13 = vVar.g;
                    int i14 = vVar.d;
                    int i15 = (int) m10;
                    byteBuffer2 = ByteBuffer.allocateDirect(byteBuffer.remaining()).order(ByteOrder.nativeOrder());
                    int position = byteBuffer.position();
                    while (byteBuffer.hasRemaining() && i15 < X) {
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
                    this.S = byteBuffer2;
                }
            }
            byteBuffer2 = byteBuffer;
            this.S = byteBuffer2;
        }
    }

    public final void F(v0 v0Var) {
        this.D = new v0(e2.d0.g(v0Var.a, 0.1f, 8.0f), e2.d0.g(v0Var.b, 0.1f, 8.0f));
        v vVar = this.u;
        if (vVar != null && vVar.j) {
            B();
            return;
        }
        w wVar = new w(v0Var, -9223372036854775807L, -9223372036854775807L);
        if (q()) {
            this.B = wVar;
        } else {
            this.C = wVar;
        }
    }

    public final boolean G(b2.s sVar) {
        return k(sVar) != 0;
    }

    public final void a(long j3) {
        v0 v0Var;
        v vVar = this.u;
        boolean z10 = false;
        aa.a aVar = this.b;
        if (vVar == null || !vVar.j) {
            if (this.c0 || vVar.c != 0) {
                v0Var = v0.d;
            } else {
                int i10 = vVar.a.L;
                v0Var = this.D;
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
            }
            this.D = v0Var;
        } else {
            v0Var = v0.d;
        }
        v0 v0Var2 = v0Var;
        if (!this.c0) {
            v vVar2 = this.u;
            if (vVar2.c == 0) {
                int i11 = vVar2.a.L;
                z10 = this.E;
                ((j0) aVar.c).o = z10;
            }
        }
        this.E = z10;
        this.i.add(new w(v0Var2, Math.max(0L, j3), e2.d0.V(this.u.e, m())));
        c2.e eVar = this.u.i;
        this.v = eVar;
        eVar.a();
        n nVar = this.s;
        if (nVar != null) {
            nVar.onSkipSilenceEnabledChanged(this.E);
        }
    }

    public final AudioTrack b(k kVar, b2.e eVar, int i10, b2.s sVar, Context context) {
        try {
            AudioTrack a2 = this.p.a(kVar, eVar, i10, context);
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
            int i11 = this.Y;
            int i12 = this.q;
            try {
                if (i12 != -1) {
                    try {
                        Context context2 = this.a;
                        if (context2 != null && Build.VERSION.SDK_INT >= 34) {
                            if (this.l0 == null) {
                                this.l0 = context2.createDeviceContext(i12);
                            }
                            context = this.l0;
                            i10 = 0;
                            d0Var = this;
                            return d0Var.b(vVar.a(), this.A, i10, vVar.a, context);
                        }
                    } catch (m e7) {
                        mVar = e7;
                        d0Var = this;
                        nVar = d0Var.s;
                        if (nVar != null) {
                            throw mVar;
                        }
                        nVar.f0(mVar);
                        throw mVar;
                    }
                }
                return d0Var.b(vVar.a(), this.A, i10, vVar.a, context);
            } catch (m e10) {
                e = e10;
                mVar = e;
                nVar = d0Var.s;
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
    /* JADX WARN: Code restructure failed: missing block: B:58:0x01c0, code lost:
    
        if (r11 > 0) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x01c3, code lost:
    
        if (r15 > 0) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01c6, code lost:
    
        if (r15 < 0) goto L83;
     */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(b2.s sVar, int[] iArr) {
        int i10;
        c2.e eVar;
        int intValue;
        int intValue2;
        boolean z10;
        boolean z11;
        int i11;
        int i12;
        int i13;
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
        f0 f0Var = this.p;
        if (equals) {
            e2.d.b(e2.d0.J(i20));
            int s10 = e2.d0.s(i20) * i19;
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
            if (eVar3.equals(this.v)) {
                eVar3 = this.v;
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
                int r10 = e2.d0.r(i24);
                int s11 = e2.d0.s(i25) * i24;
                eVar = eVar3;
                z10 = false;
                z11 = false;
                i10 = i26;
                intValue2 = r10;
                intValue = i25;
                i11 = s10;
                i12 = s11;
                i13 = 0;
            } catch (c2.g e7) {
                throw new l(e7, sVar);
            }
        } else {
            c2.e eVar4 = new c2.e(a1.e);
            e j3 = this.j != 0 ? j(sVar) : e.d;
            if (this.j == 0 || !j3.a) {
                Pair d10 = this.x.d(this.A, sVar);
                if (d10 == null) {
                    throw new l("Unable to configure passthrough for: " + sVar, sVar);
                }
                i10 = i18;
                eVar = eVar4;
                intValue = ((Integer) d10.first).intValue();
                intValue2 = ((Integer) d10.second).intValue();
                z10 = false;
                z11 = false;
                i11 = -1;
                i12 = -1;
                i13 = 2;
            } else {
                str.getClass();
                int c10 = r0.c(str, sVar.k);
                f0Var.getClass();
                int r11 = e2.d0.r(i19);
                i10 = i18;
                eVar = eVar4;
                z10 = j3.b;
                intValue2 = r11;
                i13 = 1;
                z11 = true;
                i11 = -1;
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
        this.n.getClass();
        if (i13 != 0) {
            if (i13 == 1) {
                eVar2 = eVar;
                int i29 = c3.b.i(intValue);
                e2.d.g(i29 != -2147483647);
                h = v7.b((50000000 * i29) / 1000000);
            } else {
                if (i13 != 2) {
                    throw new IllegalArgumentException();
                }
                if (intValue == 5) {
                    i16 = 500000;
                } else if (intValue == 8) {
                    i16 = MediaController.VIDEO_BITRATE_480;
                } else {
                    i15 = 8;
                    i16 = 250000;
                    if (i27 == -1) {
                        RoundingMode roundingMode = RoundingMode.CEILING;
                        roundingMode.getClass();
                        int i30 = i27 / 8;
                        int i31 = i27 - (i15 * i30);
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
                                    int abs2 = abs - (Math.abs(i15) - abs);
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
                    h = v7.b((i16 * i17) / 1000000);
                }
                i15 = 8;
                if (i27 == -1) {
                }
                eVar2 = eVar;
                h = v7.b((i16 * i17) / 1000000);
            }
            i14 = i11;
        } else {
            eVar2 = eVar;
            i14 = i11;
            long j10 = i10;
            long j11 = 250000 * j10;
            long j12 = i28;
            h = e2.d0.h(minBufferSize * 4, v7.b((j11 * j12) / 1000000), v7.b(((MediaController.VIDEO_BITRATE_360 * j10) * j12) / 1000000));
        }
        this.f0 = false;
        v vVar = new v(sVar, i14, i13, i12, i10, intValue2, intValue, (((Math.max(minBufferSize, (int) (h * d11)) + i28) - 1) / i28) * i28, eVar2, z11, z10, this.c0);
        if (q()) {
            this.t = vVar;
        } else {
            this.u = vVar;
        }
    }

    public final void e(long j3) {
        int write;
        n nVar;
        boolean z10;
        z zVar = this.m;
        if (this.S == null) {
            return;
        }
        if (zVar.a != null) {
            synchronized (n0) {
                z10 = p0 > 0;
            }
            if (z10 || SystemClock.elapsedRealtime() < zVar.c) {
                return;
            }
        }
        int remaining = this.S.remaining();
        if (this.c0) {
            e2.d.g(j3 != -9223372036854775807L);
            if (j3 == Long.MIN_VALUE) {
                j3 = this.d0;
            } else {
                this.d0 = j3;
            }
            AudioTrack audioTrack = this.w;
            ByteBuffer byteBuffer = this.S;
            if (Build.VERSION.SDK_INT >= 26) {
                write = audioTrack.write(byteBuffer, remaining, 1, 1000 * j3);
            } else {
                if (this.F == null) {
                    ByteBuffer allocate = ByteBuffer.allocate(16);
                    this.F = allocate;
                    allocate.order(ByteOrder.BIG_ENDIAN);
                    this.F.putInt(1431633921);
                }
                if (this.G == 0) {
                    this.F.putInt(4, remaining);
                    this.F.putLong(8, j3 * 1000);
                    this.F.position(0);
                    this.G = remaining;
                }
                int remaining2 = this.F.remaining();
                if (remaining2 > 0) {
                    int write2 = audioTrack.write(this.F, remaining2, 1);
                    if (write2 < 0) {
                        this.G = 0;
                        write = write2;
                    } else if (write2 < remaining2) {
                        write = 0;
                    }
                }
                write = audioTrack.write(byteBuffer, remaining, 1);
                if (write < 0) {
                    this.G = 0;
                } else {
                    this.G -= write;
                }
            }
        } else {
            write = this.w.write(this.S, remaining, 1);
        }
        this.e0 = SystemClock.elapsedRealtime();
        if (write < 0) {
            if ((Build.VERSION.SDK_INT >= 24 && write == -6) || write == -32) {
                if (m() <= 0) {
                    if (r(this.w)) {
                        if (this.u.c == 1) {
                            this.f0 = true;
                        }
                    }
                }
                r2 = true;
            }
            o oVar = new o(write, this.u.a, r2);
            n nVar2 = this.s;
            if (nVar2 != null) {
                nVar2.f0(oVar);
            }
            if (!oVar.b || this.a == null) {
                zVar.a(oVar);
                return;
            }
            b bVar = b.c;
            this.x = bVar;
            this.y.a(bVar);
            throw oVar;
        }
        zVar.a = null;
        zVar.b = -9223372036854775807L;
        zVar.c = -9223372036854775807L;
        if (r(this.w)) {
            if (this.K > 0) {
                this.g0 = false;
            }
            if (this.W && (nVar = this.s) != null && write < remaining && !this.g0) {
                nVar.v();
            }
        }
        int i10 = this.u.c;
        if (i10 == 0) {
            this.J += write;
        }
        if (write == remaining) {
            if (i10 != 0) {
                e2.d.g(this.S == this.Q);
                this.K = (this.L * this.R) + this.K;
            }
            this.S = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0044 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0043 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean f() {
        ByteBuffer byteBuffer;
        if (!this.v.d()) {
            e(Long.MIN_VALUE);
            return this.S == null;
        }
        c2.e eVar = this.v;
        if (eVar.d() && !eVar.d) {
            eVar.d = true;
            ((c2.h) eVar.b.get(0)).e();
        }
        x(Long.MIN_VALUE);
        if (!this.v.c() || ((byteBuffer = this.S) != null && byteBuffer.hasRemaining())) {
        }
    }

    public final void g() {
        y yVar;
        if (q()) {
            this.H = 0L;
            this.I = 0L;
            this.J = 0L;
            this.K = 0L;
            this.g0 = false;
            this.L = 0;
            this.C = new w(this.D, 0L, 0L);
            this.O = 0L;
            this.B = null;
            this.i.clear();
            this.Q = null;
            this.R = 0;
            this.S = null;
            this.U = false;
            this.T = false;
            this.V = false;
            this.F = null;
            this.G = 0;
            this.d.o = 0L;
            c2.e eVar = this.u.i;
            this.v = eVar;
            eVar.a();
            AudioTrack audioTrack = this.h.c;
            audioTrack.getClass();
            if (audioTrack.getPlayState() == 3) {
                this.w.pause();
            }
            if (r(this.w)) {
                c0 c0Var = this.k;
                c0Var.getClass();
                c0Var.a(this.w);
            }
            k a2 = this.u.a();
            v vVar = this.t;
            if (vVar != null) {
                this.u = vVar;
                this.t = null;
            }
            s sVar = this.h;
            sVar.f();
            sVar.c = null;
            sVar.e = null;
            if (Build.VERSION.SDK_INT >= 24 && (yVar = this.z) != null) {
                yVar.b();
                this.z = null;
            }
            AudioTrack audioTrack2 = this.w;
            n nVar = this.s;
            Handler handler = new Handler(Looper.myLooper());
            synchronized (n0) {
                try {
                    if (o0 == null) {
                        String str = e2.d0.a;
                        o0 = Executors.newSingleThreadScheduledExecutor(new e2.c0(0));
                    }
                    p0++;
                    o0.schedule(new i5(audioTrack2, nVar, handler, a2, 19), 20L, TimeUnit.MILLISECONDS);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.w = null;
        }
        z zVar = this.m;
        zVar.a = null;
        zVar.b = -9223372036854775807L;
        zVar.c = -9223372036854775807L;
        z zVar2 = this.l;
        zVar2.a = null;
        zVar2.b = -9223372036854775807L;
        zVar2.c = -9223372036854775807L;
        this.i0 = 0L;
        this.j0 = 0L;
        Handler handler2 = this.k0;
        if (handler2 != null) {
            handler2.removeCallbacksAndMessages(null);
        }
    }

    public final long h() {
        if (!q()) {
            return -9223372036854775807L;
        }
        AudioTrack audioTrack = this.w;
        v vVar = this.u;
        if (vVar.c == 0) {
            return e2.d0.V(vVar.e, audioTrack.getBufferSizeInFrames());
        }
        long bufferSizeInFrames = audioTrack.getBufferSizeInFrames();
        int i10 = c3.b.i(vVar.g);
        e2.d.g(i10 != -2147483647);
        return e2.d0.X(bufferSizeInFrames, 1000000L, i10, RoundingMode.DOWN);
    }

    public final long i() {
        ArrayDeque arrayDeque;
        long j3;
        if (!q() || this.N) {
            return Long.MIN_VALUE;
        }
        long min = Math.min(this.h.a(), e2.d0.V(this.u.e, m()));
        while (true) {
            arrayDeque = this.i;
            if (arrayDeque.isEmpty() || min < ((w) arrayDeque.getFirst()).c) {
                break;
            }
            this.C = (w) arrayDeque.remove();
        }
        w wVar = this.C;
        long j10 = min - wVar.c;
        long y3 = e2.d0.y(j10, wVar.a.a);
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
                    j10 = i10 == i11 ? e2.d0.X(j10, j12, kVar.o, RoundingMode.DOWN) : e2.d0.X(j10, j12 * i10, kVar.o * i11, RoundingMode.DOWN);
                } else {
                    j10 = (long) (kVar.c * j10);
                }
            }
            w wVar2 = this.C;
            j3 = wVar2.b + j10;
            wVar2.d = j10 - y3;
        } else {
            w wVar3 = this.C;
            j3 = wVar3.b + y3 + wVar3.d;
        }
        long j13 = ((j0) aVar.c).q;
        long V = e2.d0.V(this.u.e, j13) + j3;
        long j14 = this.i0;
        if (j13 > j14) {
            long V2 = e2.d0.V(this.u.e, j13 - j14);
            this.i0 = j13;
            this.j0 += V2;
            if (this.k0 == null) {
                this.k0 = new Handler(Looper.myLooper());
            }
            this.k0.removeCallbacksAndMessages(null);
            this.k0.postDelayed(new i2.h0(this, 8), 100L);
        }
        return V;
    }

    public final e j(b2.s sVar) {
        boolean booleanValue;
        if (this.f0) {
            return e.d;
        }
        b2.e eVar = this.A;
        pf.b bVar = this.o;
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
        int r10 = e2.d0.r(sVar.J);
        if (r10 == 0) {
            return e.d;
        }
        try {
            AudioFormat build = new AudioFormat.Builder().setSampleRate(i10).setChannelMask(r10).setEncoding(c10).build();
            return i11 >= 31 ? e0.f0.a(build, (AudioAttributes) eVar.b().a, booleanValue) : b2.c.f(build, (AudioAttributes) eVar.b().a, booleanValue);
        } catch (IllegalArgumentException unused) {
            return e.d;
        }
    }

    public final int k(b2.s sVar) {
        s();
        String str = sVar.r;
        int i10 = sVar.L;
        if ("audio/raw".equals(str)) {
            if (!e2.d0.J(i10)) {
                e2.m(i10, "Invalid PCM encoding: ", "DefaultAudioSink");
                return 0;
            }
            if (i10 != 2) {
                return 1;
            }
        } else if (this.x.d(this.A, sVar) == null) {
            return 0;
        }
        return 2;
    }

    public final long l() {
        return this.u.c == 0 ? this.H / r0.b : this.I;
    }

    public final long m() {
        v vVar = this.u;
        if (vVar.c != 0) {
            return this.K;
        }
        long j3 = this.J;
        long j10 = vVar.d;
        String str = e2.d0.a;
        return ((j3 + j10) - 1) / j10;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x00b3, code lost:
    
        if (p() == false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x03b5, code lost:
    
        if (r15 == 0) goto L217;
     */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0489  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean n(long j3, int i10, ByteBuffer byteBuffer) {
        boolean z10;
        boolean z11;
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
        ByteBuffer byteBuffer2 = this.Q;
        e2.d.b(byteBuffer2 == null || byteBuffer == byteBuffer2);
        v vVar = this.t;
        s sVar = this.h;
        if (vVar != null) {
            if (f()) {
                v vVar2 = this.t;
                v vVar3 = this.u;
                vVar2.getClass();
                if (vVar3.c == vVar2.c && vVar3.g == vVar2.g && vVar3.e == vVar2.e && vVar3.f == vVar2.f && vVar3.d == vVar2.d && vVar3.j == vVar2.j && vVar3.k == vVar2.k) {
                    this.u = this.t;
                    this.t = null;
                    AudioTrack audioTrack = this.w;
                    if (audioTrack != null && r(audioTrack) && this.u.k) {
                        if (this.w.getPlayState() == 3) {
                            this.w.setOffloadEndOfStream();
                            sVar.E = true;
                            r rVar = sVar.e;
                            if (rVar != null) {
                                rVar.a.f = true;
                            }
                        }
                        AudioTrack audioTrack2 = this.w;
                        b2.s sVar2 = this.u.a;
                        audioTrack2.setOffloadDelayPadding(sVar2.M, sVar2.N);
                        this.g0 = true;
                    }
                } else {
                    v();
                    if (!o()) {
                        g();
                    }
                }
                a(j3);
            }
            return false;
        }
        boolean q6 = q();
        z zVar = this.l;
        if (!q6) {
            try {
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
        if (this.N) {
            this.O = Math.max(0L, j3);
            this.M = false;
            this.N = false;
            v vVar4 = this.u;
            if (vVar4 != null && vVar4.j) {
                B();
            }
            a(j3);
            if (this.W) {
                u();
            }
        }
        long m10 = m();
        AudioTrack audioTrack3 = sVar.c;
        audioTrack3.getClass();
        int playState = audioTrack3.getPlayState();
        if (Build.VERSION.SDK_INT >= 24) {
            AudioTrack audioTrack4 = sVar.c;
            audioTrack4.getClass();
            int underrunCount = audioTrack4.getUnderrunCount();
            z10 = underrunCount > sVar.k;
            sVar.k = underrunCount;
        } else {
            boolean z12 = sVar.p;
            long a2 = sVar.a();
            int i18 = sVar.f;
            String str = e2.d0.a;
            boolean z13 = m10 > e2.d0.X(a2, (long) i18, 1000000L, RoundingMode.UP);
            sVar.p = z13;
            z10 = (!z12 || z13 || playState == 1) ? false : true;
        }
        if (z10) {
            xa.d dVar = sVar.a;
            int i19 = sVar.d;
            long d02 = e2.d0.d0(sVar.g);
            d0 d0Var = (d0) dVar.b;
            if (d0Var.s != null) {
                d0Var.s.P(i19, d02, SystemClock.elapsedRealtime() - d0Var.e0);
            }
        }
        if (this.Q == null) {
            e2.d.b(byteBuffer.order() == ByteOrder.LITTLE_ENDIAN);
            if (byteBuffer.hasRemaining()) {
                v vVar5 = this.u;
                if (vVar5.c != 0 && this.L == 0) {
                    int i20 = vVar5.g;
                    if (i20 != 20) {
                        if (i20 != 30) {
                            switch (i20) {
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
                                    String str2 = e2.d0.a;
                                    int i21 = byteBuffer.getInt(position);
                                    if (byteBuffer.order() != ByteOrder.BIG_ENDIAN) {
                                        i21 = Integer.reverseBytes(i21);
                                    }
                                    if (((i21 & (-2097152)) == -2097152) && (i14 = (i21 >>> 19) & 3) != 1 && (i15 = (i21 >>> 17) & 3) != 0) {
                                        int i22 = (i21 >>> 12) & 15;
                                        int i23 = (i21 >>> 10) & 3;
                                        if (i22 != 0 && i22 != 15 && i23 != 3) {
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
                                    char c10 = 16;
                                    switch (i20) {
                                        case 14:
                                            int position2 = byteBuffer.position();
                                            int limit = byteBuffer.limit() - 10;
                                            int i24 = position2;
                                            while (true) {
                                                if (i24 <= limit) {
                                                    String str3 = e2.d0.a;
                                                    int i25 = byteBuffer.getInt(i24 + 4);
                                                    char c11 = c10;
                                                    if (byteBuffer.order() != ByteOrder.BIG_ENDIAN) {
                                                        i25 = Integer.reverseBytes(i25);
                                                    }
                                                    if ((i25 & (-2)) == -126718022) {
                                                        i17 = i24 - position2;
                                                    } else {
                                                        i24++;
                                                        c10 = c11;
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
                                            k10 = c3.b.m(new a4.g(bArr, 16)).c;
                                            break;
                                        case 18:
                                            break;
                                        default:
                                            throw new IllegalStateException(hg.c.h(i20, "Unexpected audio encoding: "));
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
                            int i26 = 28;
                            int i27 = 28;
                            for (int i28 = 0; i28 < b13; i28++) {
                                i27 += byteBuffer.get(i28 + 27);
                            }
                            byte b14 = byteBuffer.get(i27 + 26);
                            for (int i29 = 0; i29 < b14; i29++) {
                                i26 += byteBuffer.get(i27 + 27 + i29);
                            }
                            i11 = i27 + i26;
                        }
                        int i30 = byteBuffer.get(i11 + 26) + 27 + i11;
                        k10 = (int) ((c3.b.k(byteBuffer.get(i30), byteBuffer.limit() - i30 > 1 ? byteBuffer.get(i30 + 1) : (byte) 0) * 48000) / 1000000);
                    }
                    this.L = k10;
                }
                if (this.B != null) {
                    if (f()) {
                        a(j3);
                        this.B = null;
                    }
                    return false;
                }
                long V = e2.d0.V(this.u.a.K, l() - this.d.o) + this.O;
                if (!this.M && Math.abs(V - j3) > 200000) {
                    n nVar = this.s;
                    if (nVar != null) {
                        StringBuilder u10 = a1.g.u(V, "Unexpected audio track timestamp discontinuity: expected ", ", got ");
                        u10.append(j3);
                        nVar.f0(new cc.k(u10.toString()));
                    }
                    this.M = true;
                }
                if (this.M) {
                    if (f()) {
                        long j10 = j3 - V;
                        this.O += j10;
                        this.M = false;
                        a(j3);
                        n nVar2 = this.s;
                        if (nVar2 != null && j10 != 0) {
                            nVar2.k0();
                        }
                    }
                    return false;
                }
                if (this.u.c == 0) {
                    this.H += byteBuffer.remaining();
                } else {
                    this.I = (this.L * i10) + this.I;
                }
                this.Q = byteBuffer;
                this.R = i10;
            }
            return true;
        }
        x(j3);
        if (!this.Q.hasRemaining()) {
            this.Q = null;
            this.R = 0;
            return true;
        }
        long m11 = m();
        if (sVar.y != -9223372036854775807L && m11 > 0) {
            sVar.G.getClass();
            if (SystemClock.elapsedRealtime() - sVar.y >= 200) {
                z11 = true;
                if (z11) {
                    e2.a.n("DefaultAudioSink", "Resetting stalled audio track");
                    g();
                    return true;
                }
                return false;
            }
        }
        z11 = false;
        if (z11) {
        }
        return false;
    }

    public final boolean o() {
        if (!q()) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 29 && this.w.isOffloadedPlayback() && this.V) {
            return false;
        }
        long m10 = m();
        s sVar = this.h;
        long a2 = sVar.a();
        int i10 = sVar.f;
        String str = e2.d0.a;
        return m10 > e2.d0.X(a2, (long) i10, 1000000L, RoundingMode.UP);
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:75:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean p() {
        AudioTrack c10;
        e7 e7Var;
        j2.k kVar;
        boolean z10;
        z zVar = this.l;
        if (zVar.a != null) {
            synchronized (n0) {
                z10 = p0 > 0;
            }
            if (z10 || SystemClock.elapsedRealtime() < zVar.c) {
                return false;
            }
        }
        try {
            v vVar = this.u;
            vVar.getClass();
            c10 = c(vVar);
        } catch (m e7) {
            v vVar2 = this.u;
            if (vVar2.h > 1000000) {
                v vVar3 = new v(vVar2.a, vVar2.b, vVar2.c, vVar2.d, vVar2.e, vVar2.f, vVar2.g, MediaController.VIDEO_BITRATE_480, vVar2.i, vVar2.j, vVar2.k, vVar2.l);
                try {
                    c10 = c(vVar3);
                    this.u = vVar3;
                } catch (m e10) {
                    e7.addSuppressed(e10);
                    if (this.u.c == 1) {
                    }
                }
            }
            if (this.u.c == 1) {
                throw e7;
            }
            this.f0 = true;
            throw e7;
        }
        this.w = c10;
        if (r(c10)) {
            AudioTrack audioTrack = this.w;
            if (this.k == null) {
                this.k = new c0(this);
            }
            c0 c0Var = this.k;
            Handler handler = c0Var.a;
            Objects.requireNonNull(handler);
            audioTrack.registerStreamEventCallback(new a0(handler, 0), c0Var.b);
            v vVar4 = this.u;
            if (vVar4.k) {
                AudioTrack audioTrack2 = this.w;
                b2.s sVar = vVar4.a;
                audioTrack2.setOffloadDelayPadding(sVar.M, sVar.N);
            }
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31 && (kVar = this.r) != null) {
            e0.f0.d(this.w, kVar);
        }
        s sVar2 = this.h;
        AudioTrack audioTrack3 = this.w;
        v vVar5 = this.u;
        int i11 = vVar5.c;
        int i12 = vVar5.g;
        int i13 = vVar5.d;
        int i14 = vVar5.h;
        boolean z11 = this.m0;
        sVar2.c = audioTrack3;
        sVar2.d = i14;
        sVar2.e = new r(audioTrack3, sVar2.a);
        sVar2.f = audioTrack3.getSampleRate();
        boolean J = e2.d0.J(i12);
        sVar2.q = J;
        sVar2.g = J ? e2.d0.V(sVar2.f, i14 / i13) : -9223372036854775807L;
        sVar2.t = 0L;
        sVar2.u = 0L;
        sVar2.E = false;
        sVar2.F = 0L;
        sVar2.p = false;
        sVar2.x = -9223372036854775807L;
        sVar2.y = -9223372036854775807L;
        sVar2.r = 0L;
        sVar2.o = 0L;
        sVar2.h = 1.0f;
        sVar2.k = 0;
        sVar2.j = -9223372036854775807L;
        sVar2.B = z11;
        if (q()) {
            this.w.setVolume(this.P);
        }
        this.a0.getClass();
        a4.l lVar = this.b0;
        if (lVar != null) {
            this.w.setPreferredDevice((AudioDeviceInfo) lVar.b);
            e7 e7Var2 = this.y;
            if (e7Var2 != null) {
                e7Var2.c((AudioDeviceInfo) this.b0.b);
            }
        }
        if (i10 >= 24 && (e7Var = this.y) != null) {
            this.z = new y(this.w, e7Var);
        }
        this.N = true;
        int audioSessionId = this.w.getAudioSessionId();
        boolean z12 = audioSessionId != this.Y;
        this.Y = audioSessionId;
        n nVar = this.s;
        if (nVar != null) {
            nVar.z0(this.u.a());
            if (z12) {
                this.Z = true;
                this.s.onAudioSessionIdChanged(this.Y);
            }
        }
        return true;
    }

    public final boolean q() {
        return this.w != null;
    }

    public final void s() {
        Context context;
        b bVar;
        Looper myLooper = Looper.myLooper();
        boolean z10 = this.y == null || this.h0 == myLooper;
        StringBuilder sb2 = new StringBuilder("DefaultAudioSink accessed on multiple threads: ");
        Looper looper = this.h0;
        sb2.append(looper == null ? "null" : looper.getThread().getName());
        sb2.append(" and ");
        sb2.append(myLooper != null ? myLooper.getThread().getName() : "null");
        e2.d.f(sb2.toString(), z10);
        if (this.y == null && (context = this.a) != null) {
            this.h0 = myLooper;
            e7 e7Var = new e7(context, new c5(this, 29), this.A, this.b0);
            this.y = e7Var;
            Handler handler = (Handler) e7Var.d;
            Context context2 = (Context) e7Var.b;
            if (e7Var.a) {
                bVar = (b) e7Var.h;
                bVar.getClass();
            } else {
                e7Var.a = true;
                d dVar = (d) e7Var.g;
                if (dVar != null) {
                    dVar.a.registerContentObserver(dVar.b, false, dVar);
                }
                c cVar = (c) e7Var.e;
                if (cVar != null) {
                    c2.d.e(context2).registerAudioDeviceCallback(cVar, handler);
                }
                b b10 = b.b(context2, context2.registerReceiver((androidx.mediarouter.app.g) e7Var.f, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), null, handler), (b2.e) e7Var.j, (a4.l) e7Var.i);
                e7Var.h = b10;
                bVar = b10;
            }
            this.x = bVar;
        }
        this.x.getClass();
    }

    public final void t() {
        this.W = false;
        if (q()) {
            s sVar = this.h;
            sVar.f();
            if (sVar.x == -9223372036854775807L) {
                r rVar = sVar.e;
                rVar.getClass();
                rVar.a(0);
            }
            sVar.z = sVar.b();
            if (!this.U || r(this.w)) {
                this.w.pause();
            }
        }
    }

    public final void u() {
        this.W = true;
        if (q()) {
            s sVar = this.h;
            if (sVar.x != -9223372036854775807L) {
                sVar.G.getClass();
                sVar.x = e2.d0.P(SystemClock.elapsedRealtime());
            }
            sVar.j = e2.d0.V(sVar.f, sVar.b());
            r rVar = sVar.e;
            rVar.getClass();
            rVar.a(0);
            if (!this.U || r(this.w)) {
                this.w.play();
            }
        }
    }

    public final void v() {
        if (this.U) {
            return;
        }
        this.U = true;
        long m10 = m();
        s sVar = this.h;
        sVar.z = sVar.b();
        sVar.G.getClass();
        sVar.x = e2.d0.P(SystemClock.elapsedRealtime());
        sVar.A = m10;
        if (r(this.w)) {
            this.V = false;
        }
        this.w.stop();
        this.G = 0;
    }

    public final void w() {
        if (!this.T && q() && f()) {
            v();
            this.T = true;
        }
    }

    public final void x(long j3) {
        ByteBuffer byteBuffer;
        e(j3);
        if (this.S != null) {
            return;
        }
        if (!this.v.d()) {
            ByteBuffer byteBuffer2 = this.Q;
            if (byteBuffer2 != null) {
                E(byteBuffer2);
                e(j3);
                return;
            }
            return;
        }
        while (!this.v.c()) {
            do {
                c2.e eVar = this.v;
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
                    ByteBuffer byteBuffer4 = this.Q;
                    if (byteBuffer4 == null || !byteBuffer4.hasRemaining()) {
                        return;
                    }
                    c2.e eVar2 = this.v;
                    ByteBuffer byteBuffer5 = this.Q;
                    if (eVar2.d() && !eVar2.d) {
                        eVar2.e(byteBuffer5);
                    }
                }
            } while (this.S == null);
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
        c2.e eVar = this.v;
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
        this.W = false;
        this.f0 = false;
    }

    public final void z(b2.e eVar) {
        if (this.A.equals(eVar)) {
            return;
        }
        this.A = eVar;
        if (this.c0) {
            return;
        }
        e7 e7Var = this.y;
        if (e7Var != null) {
            e7Var.j = eVar;
            e7Var.a(b.c((Context) e7Var.b, eVar, (a4.l) e7Var.i));
        }
        g();
    }
}
