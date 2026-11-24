package androidx.media;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(y9c y9cVar) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.a = y9cVar.f(audioAttributesImplBase.a, 1);
        audioAttributesImplBase.b = y9cVar.f(audioAttributesImplBase.b, 2);
        audioAttributesImplBase.c = y9cVar.f(audioAttributesImplBase.c, 3);
        audioAttributesImplBase.d = y9cVar.f(audioAttributesImplBase.d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, y9c y9cVar) {
        y9cVar.getClass();
        y9cVar.j(audioAttributesImplBase.a, 1);
        y9cVar.j(audioAttributesImplBase.b, 2);
        y9cVar.j(audioAttributesImplBase.c, 3);
        y9cVar.j(audioAttributesImplBase.d, 4);
    }
}
