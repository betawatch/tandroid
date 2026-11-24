package androidx.media;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(y9c y9cVar) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        aac aacVar = audioAttributesCompat.a;
        if (y9cVar.e(1)) {
            aacVar = y9cVar.h();
        }
        audioAttributesCompat.a = (AudioAttributesImpl) aacVar;
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, y9c y9cVar) {
        y9cVar.getClass();
        AudioAttributesImpl audioAttributesImpl = audioAttributesCompat.a;
        y9cVar.i(1);
        y9cVar.l(audioAttributesImpl);
    }
}
