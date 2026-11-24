package androidx.media;

import android.media.AudioAttributes;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public class AudioAttributesImplApi26Parcelizer {
    public static AudioAttributesImplApi26 read(y9c y9cVar) {
        AudioAttributesImplApi26 audioAttributesImplApi26 = new AudioAttributesImplApi26();
        audioAttributesImplApi26.a = (AudioAttributes) y9cVar.g(audioAttributesImplApi26.a, 1);
        audioAttributesImplApi26.b = y9cVar.f(audioAttributesImplApi26.b, 2);
        return audioAttributesImplApi26;
    }

    public static void write(AudioAttributesImplApi26 audioAttributesImplApi26, y9c y9cVar) {
        y9cVar.getClass();
        y9cVar.k(audioAttributesImplApi26.a, 1);
        y9cVar.j(audioAttributesImplApi26.b, 2);
    }
}
