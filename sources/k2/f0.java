package k2;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.os.Build;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class f0 implements u {
    public final AudioTrack a(k kVar, b2.e eVar, int i10, Context context) {
        int i11 = Build.VERSION.SDK_INT;
        int i12 = kVar.b;
        int i13 = kVar.c;
        int i14 = kVar.a;
        String str = e2.d0.a;
        AudioTrack.Builder sessionId = new AudioTrack.Builder().setAudioAttributes(kVar.d ? new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build() : (AudioAttributes) eVar.b().a).setAudioFormat(new AudioFormat.Builder().setSampleRate(i12).setChannelMask(i13).setEncoding(i14).build()).setTransferMode(1).setBufferSizeInBytes(kVar.f).setSessionId(i10);
        if (i11 >= 29) {
            sessionId.setOffloadedPlayback(kVar.e);
        }
        if (i11 >= 34 && context != null) {
            sessionId.setContext(context);
        }
        return sessionId.build();
    }
}
