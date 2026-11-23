package androidx.media;

import b5.b;
import b5.d;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
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
