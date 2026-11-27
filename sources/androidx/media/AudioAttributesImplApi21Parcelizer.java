package androidx.media;

import android.media.AudioAttributes;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
