package androidx.media;

import android.media.AudioAttributes;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(zbc zbcVar) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.a = (AudioAttributes) zbcVar.g(audioAttributesImplApi21.a, 1);
        audioAttributesImplApi21.b = zbcVar.f(audioAttributesImplApi21.b, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, zbc zbcVar) {
        zbcVar.getClass();
        zbcVar.k(audioAttributesImplApi21.a, 1);
        zbcVar.j(audioAttributesImplApi21.b, 2);
    }
}
