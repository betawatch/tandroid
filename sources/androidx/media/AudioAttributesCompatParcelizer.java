package androidx.media;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(zbc zbcVar) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        bcc bccVar = audioAttributesCompat.a;
        if (zbcVar.e(1)) {
            bccVar = zbcVar.h();
        }
        audioAttributesCompat.a = (AudioAttributesImpl) bccVar;
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, zbc zbcVar) {
        zbcVar.getClass();
        AudioAttributesImpl audioAttributesImpl = audioAttributesCompat.a;
        zbcVar.i(1);
        zbcVar.l(audioAttributesImpl);
    }
}
