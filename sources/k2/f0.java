package k2;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioTrack;
import android.os.Build;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
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
