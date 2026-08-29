package l3;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import i7.p7;
import q8.x0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public abstract class f {
    public static final AudioAttributes a = new AudioAttributes.Builder().setUsage(1).setContentType(3).setFlags(0).build();

    public static int[] a() {
        q8.x xVar = q8.z.b;
        q8.w wVar = new q8.w();
        q8.q0 q0Var = g.e;
        q8.o0 o0Var = q0Var.b;
        if (o0Var == null) {
            q8.o0 o0Var2 = new q8.o0(q0Var, new q8.p0(0, q0Var.f, q0Var.e));
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
        return p7.e(wVar.c());
    }

    public static int b(int i10, int i11) {
        for (int i12 = 8; i12 > 0; i12--) {
            if (AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i10).setSampleRate(i11).setChannelMask(f5.d0.m(i12)).build(), a)) {
                return i12;
            }
        }
        return 0;
    }
}
