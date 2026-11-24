package androidx.media;

import android.media.AudioAttributes;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(y9c y9cVar) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.a = (AudioAttributes) y9cVar.g(audioAttributesImplApi21.a, 1);
        audioAttributesImplApi21.b = y9cVar.f(audioAttributesImplApi21.b, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, y9c y9cVar) {
        y9cVar.getClass();
        y9cVar.k(audioAttributesImplApi21.a, 1);
        y9cVar.j(audioAttributesImplApi21.b, 2);
    }
}
