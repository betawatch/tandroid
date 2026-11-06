package androidx.media;

import b5.b;
import b5.d;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(b bVar) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        d dVar = audioAttributesCompat.a;
        if (bVar.e(1)) {
            dVar = bVar.h();
        }
        audioAttributesCompat.a = (AudioAttributesImpl) dVar;
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, b bVar) {
        bVar.getClass();
        AudioAttributesImpl audioAttributesImpl = audioAttributesCompat.a;
        bVar.i(1);
        bVar.l(audioAttributesImpl);
    }
}
