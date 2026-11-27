package androidx.media;

import android.media.AudioAttributes;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
