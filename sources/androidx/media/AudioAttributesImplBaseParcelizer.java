package androidx.media;

import b5.b;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(b bVar) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.a = bVar.f(audioAttributesImplBase.a, 1);
        audioAttributesImplBase.b = bVar.f(audioAttributesImplBase.b, 2);
        audioAttributesImplBase.c = bVar.f(audioAttributesImplBase.c, 3);
        audioAttributesImplBase.d = bVar.f(audioAttributesImplBase.d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, b bVar) {
        bVar.getClass();
        bVar.j(audioAttributesImplBase.a, 1);
        bVar.j(audioAttributesImplBase.b, 2);
        bVar.j(audioAttributesImplBase.c, 3);
        bVar.j(audioAttributesImplBase.d, 4);
    }
}
