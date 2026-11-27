package androidx.media;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(ydc ydcVar) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        aec aecVar = audioAttributesCompat.a;
        if (ydcVar.e(1)) {
            aecVar = ydcVar.h();
        }
        audioAttributesCompat.a = (AudioAttributesImpl) aecVar;
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, ydc ydcVar) {
        ydcVar.getClass();
        AudioAttributesImpl audioAttributesImpl = audioAttributesCompat.a;
        ydcVar.i(1);
        ydcVar.l(audioAttributesImpl);
    }
}
