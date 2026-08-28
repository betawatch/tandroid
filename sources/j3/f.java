package j3;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import g7.r6;
import o8.x0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class f {
    public static final AudioAttributes a = new AudioAttributes.Builder().setUsage(1).setContentType(3).setFlags(0).build();

    public static int[] a() {
        o8.x xVar = o8.z.b;
        o8.w wVar = new o8.w();
        o8.q0 q0Var = g.e;
        o8.o0 o0Var = q0Var.b;
        if (o0Var == null) {
            o8.o0 o0Var2 = new o8.o0(q0Var, new o8.p0(0, q0Var.f, q0Var.e));
            q0Var.b = o0Var2;
            o0Var = o0Var2;
        }
        x0 it = o0Var.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            if (AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(num.intValue()).setSampleRate(48000).build(), a)) {
                wVar.a(num);
            }
        }
        wVar.a(2);
        return r6.e(wVar.c());
    }

    public static int b(int i9, int i10) {
        for (int i11 = 8; i11 > 0; i11--) {
            if (AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i9).setSampleRate(i10).setChannelMask(d5.f0.m(i11)).build(), a)) {
                return i11;
            }
        }
        return 0;
    }
}
