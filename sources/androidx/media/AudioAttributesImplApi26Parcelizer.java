package androidx.media;

import android.media.AudioAttributes;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public class AudioAttributesImplApi26Parcelizer {
    public static AudioAttributesImplApi26 read(zbc zbcVar) {
        AudioAttributesImplApi26 audioAttributesImplApi26 = new AudioAttributesImplApi26();
        audioAttributesImplApi26.a = (AudioAttributes) zbcVar.g(audioAttributesImplApi26.a, 1);
        audioAttributesImplApi26.b = zbcVar.f(audioAttributesImplApi26.b, 2);
        return audioAttributesImplApi26;
    }

    public static void write(AudioAttributesImplApi26 audioAttributesImplApi26, zbc zbcVar) {
        zbcVar.getClass();
        zbcVar.k(audioAttributesImplApi26.a, 1);
        zbcVar.j(audioAttributesImplApi26.b, 2);
    }
}
