package androidx.media;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(y9c y9cVar) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        aac aacVar = audioAttributesCompat.a;
        if (y9cVar.e(1)) {
            aacVar = y9cVar.h();
        }
        audioAttributesCompat.a = (AudioAttributesImpl) aacVar;
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, y9c y9cVar) {
        y9cVar.getClass();
        AudioAttributesImpl audioAttributesImpl = audioAttributesCompat.a;
        y9cVar.i(1);
        y9cVar.l(audioAttributesImpl);
    }
}
