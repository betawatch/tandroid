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

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class n40 implements t00 {
    public static final mfb k = nze.a(new m40((byte) 0));
    public final Context a;
    public final rg7 b;
    public final fa3 c;
    public final ri6 d;
    public e86 e;
    public vgb f;
    public sz g;
    public vz h;
    public Looper i;
    public Context j;

    public n40(lyc lycVar) {
        Context context = (Context) lycVar.b;
        this.a = context;
        fa3 fa3Var = (fa3) lycVar.c;
        fa3Var.getClass();
        this.c = fa3Var;
        this.b = (rg7) lycVar.d;
        this.g = (sz) lycVar.e;
        this.d = context == null ? null : new ri6(this, (byte) 7);
        this.f = vgb.a;
    }

    public final l40 a(s00 s00Var) {
        Context context;
        Context context2;
        try {
            int i = s00Var.h;
            int i2 = s00Var.i;
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
            AudioTrack.Builder sessionId = new AudioTrack.Builder().setAudioAttributes(s00Var.d ? new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build() : s00Var.g.b()).setAudioFormat(new AudioFormat.Builder().setSampleRate(s00Var.b).setChannelMask(s00Var.c).setEncoding(s00Var.a).build()).setTransferMode(1).setBufferSizeInBytes(s00Var.f).setSessionId(i);
            int i3 = Build.VERSION.SDK_INT;
            if (i3 >= 29) {
                sessionId.setOffloadedPlayback(s00Var.e);
            }
            if (i3 >= 34 && context != null) {
                sessionId.setContext(context);
            }
            AudioTrack build = sessionId.build();
            if (build.getState() == 1) {
                return new l40(build, s00Var, this.d, this.f);
            }
            try {
                build.release();
            } catch (Exception unused) {
            }
            throw new q00();
        } catch (IllegalArgumentException | UnsupportedOperationException e) {
            throw new q00(e);
        }
    }

    public final p00 b(o00 o00Var) {
        e(o00Var);
        ko4 ko4Var = (ko4) o00Var.a;
        oz ozVar = (oz) o00Var.b;
        l00 a = this.c.a(ozVar, ko4Var);
        p00 p00Var = new p00();
        byte b = 0;
        p00Var.d = (byte) 0;
        String str = ko4Var.t;
        int i = ko4Var.Q;
        if (!Objects.equals(str, "audio/raw") ? this.g.c(ozVar, ko4Var) != null : i == 2) {
            b = 2;
        }
        p00Var.d = b;
        boolean z = a.a;
        p00Var.a = z;
        boolean z2 = a.b;
        p00Var.b = z2;
        boolean z3 = a.c;
        p00Var.c = z3;
        if (!z && (z2 || z3)) {
            grb.i("Secondary offload attribute fields are true but primary isFormatSupportedForOffload is false");
            return null;
        }
        p00 p00Var2 = new p00();
        p00Var2.a = p00Var.a;
        p00Var2.b = p00Var.b;
        p00Var2.c = p00Var.c;
        p00Var2.d = p00Var.d;
        return p00Var2;
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
    public final s00 c(o00 o00Var) {
        char c;
        int i;
        boolean z;
        boolean z2;
        int i2;
        boolean z3;
        int b;
        int i3;
        ko4 ko4Var = (ko4) o00Var.a;
        boolean z4 = o00Var.d;
        oz ozVar = (oz) o00Var.b;
        e(o00Var);
        String str = ko4Var.t;
        int i4 = ko4Var.O;
        int i5 = ko4Var.N;
        int i6 = ko4Var.P;
        int i7 = ko4Var.Q;
        if (Objects.equals(str, "audio/raw")) {
            yve.f(gcc.N(i7));
            if (i4 == -1) {
                i4 = gcc.t(i5);
            }
            i = gcc.u(i7) * i5;
            z = false;
            c = 0;
        } else {
            l00 a = z4 ? this.c.a(ozVar, ko4Var) : l00.d;
            if (z4 && a.a) {
                str.getClass();
                int c2 = dg7.c(str, ko4Var.l);
                if (i4 == -1) {
                    i4 = gcc.t(i5);
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
                i2 = ko4Var.k;
                if (Objects.equals(str, "audio/vnd.dts.hd;profile=lbr") && i2 == -1) {
                    i2 = 768000;
                }
                yve.p(AudioTrack.getMinBufferSize(i6, i4, i7) == -2);
                if (i == -1) {
                    i = 1;
                }
                double d = !z2 ? 8.0d : 1.0d;
                this.b.getClass();
                if (c != 0) {
                    z3 = true;
                    b = ype.b(((500000 * i6) * i) / 1000000);
                } else if (c == 1) {
                    z3 = true;
                    int b2 = pke.b(i7);
                    yve.p(b2 != -2147483647);
                    b = ype.b((50000000 * b2) / 1000000);
                } else {
                    if (c != 2) {
                        iy8.d();
                        return null;
                    }
                    int i8 = i7 == 5 ? 500000 : i7 == 8 ? 1000000 : 250000;
                    if (i2 != -1) {
                        RoundingMode roundingMode = RoundingMode.CEILING;
                        i3 = upe.b(i2, 8);
                    } else {
                        int b3 = pke.b(i7);
                        yve.p(b3 != -2147483647);
                        i3 = b3;
                    }
                    z3 = true;
                    b = ype.b((i8 * i3) / 1000000);
                }
                int max = (((Math.max(r5, (int) (b * d)) + i) - 1) / i) * i;
                r00 r00Var = new r00();
                oz ozVar2 = oz.i;
                r00Var.i = -1;
                r00Var.b = i6;
                r00Var.c = i4;
                r00Var.a = i7;
                r00Var.f = max;
                r00Var.h = o00Var.e;
                r00Var.g = ozVar;
                boolean z5 = z3;
                r00Var.e = c != z5 ? z5 : false;
                r00Var.d = o00Var.g;
                r00Var.j = z2;
                r00Var.k = z;
                r00Var.i = o00Var.f;
                return new s00(r00Var);
            }
            Pair c3 = this.g.c(ozVar, ko4Var);
            if (c3 == null) {
                throw new n00("Unable to configure passthrough for: " + ko4Var);
            }
            i7 = ((Integer) c3.first).intValue();
            i4 = ((Integer) c3.second).intValue();
            c = 2;
            i = -1;
            z = false;
        }
        z2 = false;
        i2 = ko4Var.k;
        if (Objects.equals(str, "audio/vnd.dts.hd;profile=lbr")) {
            i2 = 768000;
        }
        yve.p(AudioTrack.getMinBufferSize(i6, i4, i7) == -2);
        if (i == -1) {
        }
        if (!z2) {
        }
        this.b.getClass();
        if (c != 0) {
        }
        int max2 = (((Math.max(r5, (int) (b * d)) + i) - 1) / i) * i;
        r00 r00Var2 = new r00();
        oz ozVar22 = oz.i;
        r00Var2.i = -1;
        r00Var2.b = i6;
        r00Var2.c = i4;
        r00Var2.a = i7;
        r00Var2.f = max2;
        r00Var2.h = o00Var.e;
        r00Var2.g = ozVar;
        boolean z52 = z3;
        r00Var2.e = c != z52 ? z52 : false;
        r00Var2.d = o00Var.g;
        r00Var2.j = z2;
        r00Var2.k = z;
        r00Var2.i = o00Var.f;
        return new s00(r00Var2);
    }

    public final void d() {
        moa moaVar;
        e86 e86Var = this.e;
        if (e86Var != null) {
            e86Var.d();
        }
        vz vzVar = this.h;
        if (vzVar != null) {
            Context context = (Context) vzVar.b;
            if (vzVar.a) {
                vzVar.r = null;
                j00.e(context).unregisterAudioDeviceCallback((tz) vzVar.e);
                if (Build.VERSION.SDK_INT >= 32 && (moaVar = (moa) vzVar.n) != null) {
                    moaVar.e();
                    vzVar.n = null;
                }
                context.unregisterReceiver((ak) vzVar.f);
                uz uzVar = (uz) vzVar.h;
                if (uzVar != null) {
                    uzVar.a.unregisterContentObserver(uzVar);
                }
                vzVar.a = false;
            }
        }
    }

    public final void e(o00 o00Var) {
        sz b;
        AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) o00Var.c;
        oz ozVar = (oz) o00Var.b;
        f();
        vz vzVar = this.h;
        if (vzVar == null) {
            Context context = this.a;
            if (context != null) {
                vz vzVar2 = new vz(context, new m0(this, (byte) 23), ozVar, audioDeviceInfo);
                this.h = vzVar2;
                Handler handler = (Handler) vzVar2.d;
                Context context2 = (Context) vzVar2.b;
                if (vzVar2.a) {
                    b = (sz) vzVar2.r;
                    b.getClass();
                } else {
                    byte b2 = 1;
                    vzVar2.a = true;
                    uz uzVar = (uz) vzVar2.h;
                    if (uzVar != null) {
                        uzVar.a.registerContentObserver(uzVar.b, false, uzVar);
                    }
                    j00.e(context2).registerAudioDeviceCallback((tz) vzVar2.e, handler);
                    if (Build.VERSION.SDK_INT >= 32 && ((moa) vzVar2.n) == null) {
                        vzVar2.n = new moa(context2, new pz(vzVar2, b2), Boolean.valueOf(gcc.Q(context2)));
                    }
                    b = sz.b(context2, context2.registerReceiver((ak) vzVar2.f, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), null, handler), (oz) vzVar2.w, (AudioDeviceInfo) vzVar2.s, vzVar2.j());
                    vzVar2.r = b;
                }
                this.g = b;
            }
        } else {
            if (audioDeviceInfo != null && !audioDeviceInfo.equals((AudioDeviceInfo) vzVar.s)) {
                vzVar.s = audioDeviceInfo;
                Context context3 = (Context) vzVar.b;
                oz ozVar2 = (oz) vzVar.w;
                List j = vzVar.j();
                j99 j99Var = sz.e;
                vzVar.k(sz.b(context3, context3.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), ozVar2, audioDeviceInfo, j));
            }
            vz vzVar3 = this.h;
            if (!Objects.equals(ozVar, (oz) vzVar3.w)) {
                vzVar3.w = ozVar;
                Context context4 = (Context) vzVar3.b;
                AudioDeviceInfo audioDeviceInfo2 = (AudioDeviceInfo) vzVar3.s;
                List j2 = vzVar3.j();
                j99 j99Var2 = sz.e;
                vzVar3.k(sz.b(context4, context4.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), ozVar, audioDeviceInfo2, j2));
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
            grb.i(fze.a("AudioTrackAudioOutputProvider accessed on multiple threads: %s and %s", name, name2));
        }
    }
}
