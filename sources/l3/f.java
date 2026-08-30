package l3;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public abstract class f {
    public static final AudioAttributes a = new AudioAttributes.Builder().setUsage(1).setContentType(3).setFlags(0).build();

    public static s8.v a() {
        s8.t tVar = s8.v.b;
        s8.s sVar = new s8.s();
        s8.n0 n0Var = g.e;
        s8.l0 l0Var = n0Var.b;
        if (l0Var == null) {
            s8.l0 l0Var2 = new s8.l0(n0Var, new s8.m0(0, n0Var.f, n0Var.e));
            n0Var.b = l0Var2;
            l0Var = l0Var2;
        }
        s8.u0 it = l0Var.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            int intValue = num.intValue();
            if (h5.d0.a >= 34 || intValue != 30) {
                if (AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(intValue).setSampleRate(48000).build(), a)) {
                    sVar.b(num);
                }
            }
        }
        sVar.b(2);
        return sVar.i();
    }

    public static int b(int i10, int i11) {
        for (int i12 = 10; i12 > 0; i12--) {
            if (AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i10).setSampleRate(i11).setChannelMask(h5.d0.n(i12)).build(), a)) {
                return i12;
            }
        }
        return 0;
    }
}
