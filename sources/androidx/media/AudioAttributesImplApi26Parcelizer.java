package androidx.media;

import android.media.AudioAttributes;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public class AudioAttributesImplApi26Parcelizer {
    public static AudioAttributesImplApi26 read(ydc ydcVar) {
        AudioAttributesImplApi26 audioAttributesImplApi26 = new AudioAttributesImplApi26();
        audioAttributesImplApi26.a = (AudioAttributes) ydcVar.g(audioAttributesImplApi26.a, 1);
        audioAttributesImplApi26.b = ydcVar.f(audioAttributesImplApi26.b, 2);
        return audioAttributesImplApi26;
    }

    public static void write(AudioAttributesImplApi26 audioAttributesImplApi26, ydc ydcVar) {
        ydcVar.getClass();
        ydcVar.k(audioAttributesImplApi26.a, 1);
        ydcVar.j(audioAttributesImplApi26.b, 2);
    }
}
