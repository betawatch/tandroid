package androidx.media;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(ydc ydcVar) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.a = ydcVar.f(audioAttributesImplBase.a, 1);
        audioAttributesImplBase.b = ydcVar.f(audioAttributesImplBase.b, 2);
        audioAttributesImplBase.c = ydcVar.f(audioAttributesImplBase.c, 3);
        audioAttributesImplBase.d = ydcVar.f(audioAttributesImplBase.d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, ydc ydcVar) {
        ydcVar.getClass();
        ydcVar.j(audioAttributesImplBase.a, 1);
        ydcVar.j(audioAttributesImplBase.b, 2);
        ydcVar.j(audioAttributesImplBase.c, 3);
        ydcVar.j(audioAttributesImplBase.d, 4);
    }
}
