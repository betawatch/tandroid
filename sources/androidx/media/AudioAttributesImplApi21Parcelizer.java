package androidx.media;

import android.media.AudioAttributes;
import y4.b;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes.dex */
public class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(b bVar) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.a = (AudioAttributes) bVar.g(audioAttributesImplApi21.a, 1);
        audioAttributesImplApi21.b = bVar.f(audioAttributesImplApi21.b, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, b bVar) {
        bVar.getClass();
        bVar.k(audioAttributesImplApi21.a, 1);
        bVar.j(audioAttributesImplApi21.b, 2);
    }
}
