package androidx.media;

import android.media.AudioAttributes;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
