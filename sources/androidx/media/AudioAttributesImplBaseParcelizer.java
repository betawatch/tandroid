package androidx.media;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
