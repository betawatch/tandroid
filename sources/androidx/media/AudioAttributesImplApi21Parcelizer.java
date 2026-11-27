package androidx.media;

import android.media.AudioAttributes;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(ydc ydcVar) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.a = (AudioAttributes) ydcVar.g(audioAttributesImplApi21.a, 1);
        audioAttributesImplApi21.b = ydcVar.f(audioAttributesImplApi21.b, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, ydc ydcVar) {
        ydcVar.getClass();
        ydcVar.k(audioAttributesImplApi21.a, 1);
        ydcVar.j(audioAttributesImplApi21.b, 2);
    }
}
