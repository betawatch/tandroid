// default package

import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioAttributes;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import j$.util.Objects;
import java.math.RoundingMode;
import java.util.List;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class l40 implements s00 {
    public static final qbb k = vue.a(new k40((byte) 0));
    public final Context a;
    public final ie7 b;
    public final m93 c;
    public final l69 d;
    public a66 e;
    public adb f;
    public rz g;
    public uz h;
    public Looper i;
    public Context j;

    public l40(wtc wtcVar) {
        Context context = (Context) wtcVar.a;
        this.a = context;
        m93 m93Var = (m93) wtcVar.b;
        m93Var.getClass();
        this.c = m93Var;
        this.b = (ie7) wtcVar.c;
        this.g = (rz) wtcVar.d;
        this.d = context == null ? null : new l69(this, (byte) 8);
        this.f = adb.a;
    }

    public final j40 a(r00 r00Var) {
        Context context;
        Context context2;
        try {
            int i = r00Var.h;
            int i2 = r00Var.i;
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
            AudioTrack.Builder sessionId = new AudioTrack.Builder().setAudioAttributes(r00Var.d ? new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build() : r00Var.g.b()).setAudioFormat(new AudioFormat.Builder().setSampleRate(r00Var.b).setChannelMask(r00Var.c).setEncoding(r00Var.a).build()).setTransferMode(1).setBufferSizeInBytes(r00Var.f).setSessionId(i);
            int i3 = Build.VERSION.SDK_INT;
            if (i3 >= 29) {
                sessionId.setOffloadedPlayback(r00Var.e);
            }
            if (i3 >= 34 && context != null) {
                sessionId.setContext(context);
            }
            AudioTrack build = sessionId.build();
            if (build.getState() == 1) {
                return new j40(build, r00Var, this.d, this.f);
            }
            try {
                build.release();
            } catch (Exception unused) {
            }
            throw new p00();
        } catch (IllegalArgumentException | UnsupportedOperationException e) {
            throw new p00(e);
        }
    }

    public final o00 b(n00 n00Var) {
        e(n00Var);
        fm4 fm4Var = (fm4) n00Var.a;
        nz nzVar = (nz) n00Var.b;
        k00 a = this.c.a(nzVar, fm4Var);
        o00 o00Var = new o00();
        byte b = 0;
        o00Var.d = (byte) 0;
        String str = fm4Var.t;
        int i = fm4Var.Q;
        if (!Objects.equals(str, "audio/raw") ? this.g.c(nzVar, fm4Var) != null : i == 2) {
            b = 2;
        }
        o00Var.d = b;
        boolean z = a.a;
        o00Var.a = z;
        boolean z2 = a.b;
        o00Var.b = z2;
        boolean z3 = a.c;
        o00Var.c = z3;
        if (!z && (z2 || z3)) {
            sc8.j("Secondary offload attribute fields are true but primary isFormatSupportedForOffload is false");
            return null;
        }
        o00 o00Var2 = new o00();
        o00Var2.a = o00Var.a;
        o00Var2.b = o00Var.b;
        o00Var2.c = o00Var.c;
        o00Var2.d = o00Var.d;
        return o00Var2;
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
    public final r00 c(n00 n00Var) {
        char c;
        int i;
        boolean z;
        boolean z2;
        int i2;
        boolean z3;
        int b;
        int i3;
        fm4 fm4Var = (fm4) n00Var.a;
        boolean z4 = n00Var.d;
        nz nzVar = (nz) n00Var.b;
        e(n00Var);
        String str = fm4Var.t;
        int i4 = fm4Var.O;
        int i5 = fm4Var.N;
        int i6 = fm4Var.P;
        int i7 = fm4Var.Q;
        if (Objects.equals(str, "audio/raw")) {
            gre.f(g8c.N(i7));
            if (i4 == -1) {
                i4 = g8c.t(i5);
            }
            i = g8c.u(i7) * i5;
            z = false;
            c = 0;
        } else {
            k00 a = z4 ? this.c.a(nzVar, fm4Var) : k00.d;
            if (z4 && a.a) {
                str.getClass();
                int c2 = ud7.c(str, fm4Var.l);
                if (i4 == -1) {
                    i4 = g8c.t(i5);
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
                i2 = fm4Var.k;
                if (Objects.equals(str, "audio/vnd.dts.hd;profile=lbr") && i2 == -1) {
                    i2 = 768000;
                }
                gre.p(AudioTrack.getMinBufferSize(i6, i4, i7) == -2);
                if (i == -1) {
                    i = 1;
                }
                double d = !z2 ? 8.0d : 1.0d;
                this.b.getClass();
                if (c != 0) {
                    z3 = true;
                    b = gle.b(((500000 * i6) * i) / 1000000);
                } else if (c == 1) {
                    z3 = true;
                    int b2 = yfe.b(i7);
                    gre.p(b2 != -2147483647);
                    b = gle.b((50000000 * b2) / 1000000);
                } else {
                    if (c != 2) {
                        sc8.e();
                        return null;
                    }
                    int i8 = i7 == 5 ? 500000 : i7 == 8 ? 1000000 : 250000;
                    if (i2 != -1) {
                        RoundingMode roundingMode = RoundingMode.CEILING;
                        i3 = cle.b(i2, 8);
                    } else {
                        int b3 = yfe.b(i7);
                        gre.p(b3 != -2147483647);
                        i3 = b3;
                    }
                    z3 = true;
                    b = gle.b((i8 * i3) / 1000000);
                }
                int max = (((Math.max(r5, (int) (b * d)) + i) - 1) / i) * i;
                q00 q00Var = new q00();
                nz nzVar2 = nz.i;
                q00Var.i = -1;
                q00Var.b = i6;
                q00Var.c = i4;
                q00Var.a = i7;
                q00Var.f = max;
                q00Var.h = n00Var.e;
                q00Var.g = nzVar;
                boolean z5 = z3;
                q00Var.e = c != z5 ? z5 : false;
                q00Var.d = n00Var.g;
                q00Var.j = z2;
                q00Var.k = z;
                q00Var.i = n00Var.f;
                return new r00(q00Var);
            }
            Pair c3 = this.g.c(nzVar, fm4Var);
            if (c3 == null) {
                throw new m00("Unable to configure passthrough for: " + fm4Var);
            }
            i7 = ((Integer) c3.first).intValue();
            i4 = ((Integer) c3.second).intValue();
            c = 2;
            i = -1;
            z = false;
        }
        z2 = false;
        i2 = fm4Var.k;
        if (Objects.equals(str, "audio/vnd.dts.hd;profile=lbr")) {
            i2 = 768000;
        }
        gre.p(AudioTrack.getMinBufferSize(i6, i4, i7) == -2);
        if (i == -1) {
        }
        if (!z2) {
        }
        this.b.getClass();
        if (c != 0) {
        }
        int max2 = (((Math.max(r5, (int) (b * d)) + i) - 1) / i) * i;
        q00 q00Var2 = new q00();
        nz nzVar22 = nz.i;
        q00Var2.i = -1;
        q00Var2.b = i6;
        q00Var2.c = i4;
        q00Var2.a = i7;
        q00Var2.f = max2;
        q00Var2.h = n00Var.e;
        q00Var2.g = nzVar;
        boolean z52 = z3;
        q00Var2.e = c != z52 ? z52 : false;
        q00Var2.d = n00Var.g;
        q00Var2.j = z2;
        q00Var2.k = z;
        q00Var2.i = n00Var.f;
        return new r00(q00Var2);
    }

    public final void d() {
        ska skaVar;
        a66 a66Var = this.e;
        if (a66Var != null) {
            a66Var.d();
        }
        uz uzVar = this.h;
        if (uzVar != null) {
            Context context = uzVar.a;
            if (uzVar.k) {
                uzVar.h = null;
                i00.e(context).unregisterAudioDeviceCallback(uzVar.d);
                if (Build.VERSION.SDK_INT >= 32 && (skaVar = uzVar.g) != null) {
                    skaVar.e();
                    uzVar.g = null;
                }
                context.unregisterReceiver(uzVar.e);
                tz tzVar = uzVar.f;
                if (tzVar != null) {
                    tzVar.a.unregisterContentObserver(tzVar);
                }
                uzVar.k = false;
            }
        }
    }

    public final void e(n00 n00Var) {
        rz b;
        AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) n00Var.c;
        nz nzVar = (nz) n00Var.b;
        f();
        uz uzVar = this.h;
        if (uzVar == null) {
            Context context = this.a;
            if (context != null) {
                uz uzVar2 = new uz(context, new l0(this, (byte) 23), nzVar, audioDeviceInfo);
                this.h = uzVar2;
                if (uzVar2.k) {
                    b = uzVar2.h;
                    b.getClass();
                } else {
                    byte b2 = 1;
                    uzVar2.k = true;
                    tz tzVar = uzVar2.f;
                    if (tzVar != null) {
                        tzVar.a.registerContentObserver(tzVar.b, false, tzVar);
                    }
                    Context context2 = uzVar2.a;
                    AudioManager e = i00.e(context2);
                    sz szVar = uzVar2.d;
                    Handler handler = uzVar2.c;
                    e.registerAudioDeviceCallback(szVar, handler);
                    if (Build.VERSION.SDK_INT >= 32 && uzVar2.g == null) {
                        uzVar2.g = new ska(context2, new oz(uzVar2, b2), Boolean.valueOf(g8c.Q(context2)));
                    }
                    b = rz.b(context2, context2.registerReceiver(uzVar2.e, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), null, handler), uzVar2.j, uzVar2.i, uzVar2.a());
                    uzVar2.h = b;
                }
                this.g = b;
            }
        } else {
            if (audioDeviceInfo != null && !audioDeviceInfo.equals(uzVar.i)) {
                uzVar.i = audioDeviceInfo;
                Context context3 = uzVar.a;
                nz nzVar2 = uzVar.j;
                List a = uzVar.a();
                w59 w59Var = rz.e;
                uzVar.b(rz.b(context3, context3.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), nzVar2, audioDeviceInfo, a));
            }
            uz uzVar3 = this.h;
            if (!Objects.equals(nzVar, uzVar3.j)) {
                uzVar3.j = nzVar;
                Context context4 = uzVar3.a;
                AudioDeviceInfo audioDeviceInfo2 = uzVar3.i;
                List a2 = uzVar3.a();
                w59 w59Var2 = rz.e;
                uzVar3.b(rz.b(context4, context4.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), nzVar, audioDeviceInfo2, a2));
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
            sc8.j(nue.a("AudioTrackAudioOutputProvider accessed on multiple threads: %s and %s", name, name2));
        }
    }
}
