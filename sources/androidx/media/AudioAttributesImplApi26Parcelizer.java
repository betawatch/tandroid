package androidx.media;

import android.media.AudioAttributes;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
