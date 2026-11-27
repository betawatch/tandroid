package androidx.media;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
