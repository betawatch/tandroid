package androidx.media;

import l2.b;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
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
