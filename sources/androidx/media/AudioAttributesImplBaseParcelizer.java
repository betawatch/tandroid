package androidx.media;

import y4.b;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
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
