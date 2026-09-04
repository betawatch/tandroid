package k2;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioTrack;
import android.os.Build;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class f0 implements u {
    public static AudioAttributes b(b2.e eVar, boolean z10) {
        return z10 ? new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build() : (AudioAttributes) eVar.b().a;
    }

    public final AudioTrack a(k kVar, b2.e eVar, int i10, Context context) {
        boolean z10 = kVar.d;
        int i11 = kVar.a;
        int i12 = kVar.c;
        int i13 = kVar.b;
        int i14 = Build.VERSION.SDK_INT;
        if (i14 < 23) {
            return new AudioTrack(b(eVar, z10), e2.d0.r(i13, i12, i11), kVar.f, 1, i10);
        }
        AudioTrack.Builder sessionId = new AudioTrack.Builder().setAudioAttributes(b(eVar, z10)).setAudioFormat(e2.d0.r(i13, i12, i11)).setTransferMode(1).setBufferSizeInBytes(kVar.f).setSessionId(i10);
        if (i14 >= 29) {
            sessionId.setOffloadedPlayback(kVar.e);
        }
        if (i14 >= 34 && context != null) {
            sessionId.setContext(context);
        }
        return sessionId.build();
    }
}
