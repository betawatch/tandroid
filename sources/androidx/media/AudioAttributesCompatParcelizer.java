package androidx.media;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
