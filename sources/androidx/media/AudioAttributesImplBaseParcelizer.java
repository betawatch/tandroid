package androidx.media;

import z4.b;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
