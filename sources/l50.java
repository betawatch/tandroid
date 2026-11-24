// default package

import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioAttributes;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import j$.util.Objects;
import java.math.RoundingMode;
import java.util.List;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class l50 implements s10 {
    public static final sdb k = xwe.a(new k50((byte) 0));
    public final Context a;
    public final kg7 b;
    public final ya3 c;
    public final ni6 d;
    public a86 e;
    public bfb f;
    public r00 g;
    public u00 h;
    public Looper i;
    public Context j;

    public l50(xvc xvcVar) {
        Context context = (Context) xvcVar.b;
        this.a = context;
        ya3 ya3Var = (ya3) xvcVar.c;
        ya3Var.getClass();
        this.c = ya3Var;
        this.b = (kg7) xvcVar.d;
        this.g = (r00) xvcVar.e;
        this.d = context == null ? null : new ni6(this, (byte) 7);
        this.f = bfb.a;
    }

    public final j50 a(r10 r10Var) {
        Context context;
        Context context2;
        try {
            int i = r10Var.h;
            int i2 = r10Var.i;
            if (i2 == -1 || (context2 = this.a) == null || Build.VERSION.SDK_INT < 34) {
                context = null;
            } else {
                Context context3 = this.j;
                if (context3 == null || context3.getDeviceId() != i2) {
                    this.j = context2.createDeviceContext(i2);
                }
                context = this.j;
                i = 0;
            }
            AudioTrack.Builder sessionId = new AudioTrack.Builder().setAudioAttributes(r10Var.d ? new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build() : r10Var.g.b()).setAudioFormat(new AudioFormat.Builder().setSampleRate(r10Var.b).setChannelMask(r10Var.c).setEncoding(r10Var.a).build()).setTransferMode(1).setBufferSizeInBytes(r10Var.f).setSessionId(i);
            int i3 = Build.VERSION.SDK_INT;
            if (i3 >= 29) {
                sessionId.setOffloadedPlayback(r10Var.e);
            }
            if (i3 >= 34 && context != null) {
                sessionId.setContext(context);
            }
            AudioTrack build = sessionId.build();
            if (build.getState() == 1) {
                return new j50(build, r10Var, this.d, this.f);
            }
            try {
                build.release();
            } catch (Exception unused) {
            }
            throw new p10();
        } catch (IllegalArgumentException | UnsupportedOperationException e) {
            throw new p10(e);
        }
    }

    public final o10 b(n10 n10Var) {
        e(n10Var);
        go4 go4Var = (go4) n10Var.a;
        o00 o00Var = (o00) n10Var.b;
        k10 a = this.c.a(o00Var, go4Var);
        o10 o10Var = new o10();
        byte b = 0;
        o10Var.d = (byte) 0;
        String str = go4Var.t;
        int i = go4Var.Q;
        if (!Objects.equals(str, "audio/raw") ? this.g.c(o00Var, go4Var) != null : i == 2) {
            b = 2;
        }
        o10Var.d = b;
        boolean z = a.a;
        o10Var.a = z;
        boolean z2 = a.b;
        o10Var.b = z2;
        boolean z3 = a.c;
        o10Var.c = z3;
        if (!z && (z2 || z3)) {
            dq9.m("Secondary offload attribute fields are true but primary isFormatSupportedForOffload is false");
            return null;
        }
        o10 o10Var2 = new o10();
        o10Var2.a = o10Var.a;
        o10Var2.b = o10Var.b;
        o10Var2.c = o10Var.c;
        o10Var2.d = o10Var.d;
        return o10Var2;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final r10 c(n10 n10Var) {
        char c;
        int i;
        boolean z;
        boolean z2;
        int i2;
        boolean z3;
        int b;
        int i3;
        go4 go4Var = (go4) n10Var.a;
        boolean z4 = n10Var.d;
        o00 o00Var = (o00) n10Var.b;
        e(n10Var);
        String str = go4Var.t;
        int i4 = go4Var.O;
        int i5 = go4Var.N;
        int i6 = go4Var.P;
        int i7 = go4Var.Q;
        if (Objects.equals(str, "audio/raw")) {
            jte.f(hac.N(i7));
            if (i4 == -1) {
                i4 = hac.t(i5);
            }
            i = hac.u(i7) * i5;
            z = false;
            c = 0;
        } else {
            k10 a = z4 ? this.c.a(o00Var, go4Var) : k10.d;
            if (z4 && a.a) {
                str.getClass();
                int c2 = wf7.c(str, go4Var.l);
                if (i4 == -1) {
                    i4 = hac.t(i5);
                }
                if ((c2 == 11 || c2 == 12) && i6 >= 16000 && !((Boolean) k.get()).booleanValue()) {
                    if (c2 == 12 && i5 == 2) {
                        i4 = 4;
                    }
                    i6 /= 2;
                    c2 = 10;
                }
                z = a.b;
                i7 = c2;
                i = -1;
                c = 1;
                z2 = true;
                i2 = go4Var.k;
                if (Objects.equals(str, "audio/vnd.dts.hd;profile=lbr") && i2 == -1) {
                    i2 = 768000;
                }
                jte.p(AudioTrack.getMinBufferSize(i6, i4, i7) == -2);
                if (i == -1) {
                    i = 1;
                }
                double d = !z2 ? 8.0d : 1.0d;
                this.b.getClass();
                if (c != 0) {
                    z3 = true;
                    b = ine.b(((500000 * i6) * i) / 1000000);
                } else if (c == 1) {
                    z3 = true;
                    int b2 = zhe.b(i7);
                    jte.p(b2 != -2147483647);
                    b = ine.b((50000000 * b2) / 1000000);
                } else {
                    if (c != 2) {
                        i98.g();
                        return null;
                    }
                    int i8 = i7 == 5 ? 500000 : i7 == 8 ? 1000000 : 250000;
                    if (i2 != -1) {
                        RoundingMode roundingMode = RoundingMode.CEILING;
                        i3 = ene.b(i2, 8);
                    } else {
                        int b3 = zhe.b(i7);
                        jte.p(b3 != -2147483647);
                        i3 = b3;
                    }
                    z3 = true;
                    b = ine.b((i8 * i3) / 1000000);
                }
                int max = (((Math.max(r5, (int) (b * d)) + i) - 1) / i) * i;
                q10 q10Var = new q10();
                o00 o00Var2 = o00.i;
                q10Var.i = -1;
                q10Var.b = i6;
                q10Var.c = i4;
                q10Var.a = i7;
                q10Var.f = max;
                q10Var.h = n10Var.e;
                q10Var.g = o00Var;
                boolean z5 = z3;
                q10Var.e = c != z5 ? z5 : false;
                q10Var.d = n10Var.g;
                q10Var.j = z2;
                q10Var.k = z;
                q10Var.i = n10Var.f;
                return new r10(q10Var);
            }
            Pair c3 = this.g.c(o00Var, go4Var);
            if (c3 == null) {
                throw new m10("Unable to configure passthrough for: " + go4Var);
            }
            i7 = ((Integer) c3.first).intValue();
            i4 = ((Integer) c3.second).intValue();
            c = 2;
            i = -1;
            z = false;
        }
        z2 = false;
        i2 = go4Var.k;
        if (Objects.equals(str, "audio/vnd.dts.hd;profile=lbr")) {
            i2 = 768000;
        }
        jte.p(AudioTrack.getMinBufferSize(i6, i4, i7) == -2);
        if (i == -1) {
        }
        if (!z2) {
        }
        this.b.getClass();
        if (c != 0) {
        }
        int max2 = (((Math.max(r5, (int) (b * d)) + i) - 1) / i) * i;
        q10 q10Var2 = new q10();
        o00 o00Var22 = o00.i;
        q10Var2.i = -1;
        q10Var2.b = i6;
        q10Var2.c = i4;
        q10Var2.a = i7;
        q10Var2.f = max2;
        q10Var2.h = n10Var.e;
        q10Var2.g = o00Var;
        boolean z52 = z3;
        q10Var2.e = c != z52 ? z52 : false;
        q10Var2.d = n10Var.g;
        q10Var2.j = z2;
        q10Var2.k = z;
        q10Var2.i = n10Var.f;
        return new r10(q10Var2);
    }

    public final void d() {
        tma tmaVar;
        a86 a86Var = this.e;
        if (a86Var != null) {
            a86Var.d();
        }
        u00 u00Var = this.h;
        if (u00Var != null) {
            Context context = (Context) u00Var.b;
            if (u00Var.a) {
                u00Var.r = null;
                i10.e(context).unregisterAudioDeviceCallback((s00) u00Var.e);
                if (Build.VERSION.SDK_INT >= 32 && (tmaVar = (tma) u00Var.n) != null) {
                    tmaVar.e();
                    u00Var.n = null;
                }
                context.unregisterReceiver((zk) u00Var.f);
                t00 t00Var = (t00) u00Var.h;
                if (t00Var != null) {
                    t00Var.a.unregisterContentObserver(t00Var);
                }
                u00Var.a = false;
            }
        }
    }

    public final void e(n10 n10Var) {
        r00 b;
        AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) n10Var.c;
        o00 o00Var = (o00) n10Var.b;
        f();
        u00 u00Var = this.h;
        if (u00Var == null) {
            Context context = this.a;
            if (context != null) {
                u00 u00Var2 = new u00(context, new l0(this, (byte) 25), o00Var, audioDeviceInfo);
                this.h = u00Var2;
                Handler handler = (Handler) u00Var2.d;
                Context context2 = (Context) u00Var2.b;
                if (u00Var2.a) {
                    b = (r00) u00Var2.r;
                    b.getClass();
                } else {
                    u00Var2.a = true;
                    t00 t00Var = (t00) u00Var2.h;
                    if (t00Var != null) {
                        t00Var.a.registerContentObserver(t00Var.b, false, t00Var);
                    }
                    i10.e(context2).registerAudioDeviceCallback((s00) u00Var2.e, handler);
                    if (Build.VERSION.SDK_INT >= 32 && ((tma) u00Var2.n) == null) {
                        u00Var2.n = new tma(context2, new f00(u00Var2, (byte) 3), Boolean.valueOf(hac.Q(context2)));
                    }
                    b = r00.b(context2, context2.registerReceiver((zk) u00Var2.f, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), null, handler), (o00) u00Var2.w, (AudioDeviceInfo) u00Var2.s, u00Var2.j());
                    u00Var2.r = b;
                }
                this.g = b;
            }
        } else {
            if (audioDeviceInfo != null && !audioDeviceInfo.equals((AudioDeviceInfo) u00Var.s)) {
                u00Var.s = audioDeviceInfo;
                Context context3 = (Context) u00Var.b;
                o00 o00Var2 = (o00) u00Var.w;
                List j = u00Var.j();
                y79 y79Var = r00.e;
                u00Var.k(r00.b(context3, context3.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), o00Var2, audioDeviceInfo, j));
            }
            u00 u00Var3 = this.h;
            if (!Objects.equals(o00Var, (o00) u00Var3.w)) {
                u00Var3.w = o00Var;
                Context context4 = (Context) u00Var3.b;
                AudioDeviceInfo audioDeviceInfo2 = (AudioDeviceInfo) u00Var3.s;
                List j2 = u00Var3.j();
                y79 y79Var2 = r00.e;
                u00Var3.k(r00.b(context4, context4.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), o00Var, audioDeviceInfo2, j2));
            }
        }
        this.g.getClass();
    }

    public final void f() {
        if (this.a == null) {
            return;
        }
        Looper myLooper = Looper.myLooper();
        Looper looper = this.i;
        boolean z = looper == null || looper == myLooper;
        String name = looper == null ? "null" : looper.getThread().getName();
        String name2 = myLooper != null ? myLooper.getThread().getName() : "null";
        if (z) {
            this.i = myLooper;
        } else {
            dq9.m(pwe.a("AudioTrackAudioOutputProvider accessed on multiple threads: %s and %s", name, name2));
        }
    }
}
