package androidx.media;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(zbc zbcVar) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.a = zbcVar.f(audioAttributesImplBase.a, 1);
        audioAttributesImplBase.b = zbcVar.f(audioAttributesImplBase.b, 2);
        audioAttributesImplBase.c = zbcVar.f(audioAttributesImplBase.c, 3);
        audioAttributesImplBase.d = zbcVar.f(audioAttributesImplBase.d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, zbc zbcVar) {
        zbcVar.getClass();
        zbcVar.j(audioAttributesImplBase.a, 1);
        zbcVar.j(audioAttributesImplBase.b, 2);
        zbcVar.j(audioAttributesImplBase.c, 3);
        zbcVar.j(audioAttributesImplBase.d, 4);
    }
}
