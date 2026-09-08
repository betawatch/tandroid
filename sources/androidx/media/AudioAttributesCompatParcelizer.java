package androidx.media;

import y4.b;
import y4.d;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
