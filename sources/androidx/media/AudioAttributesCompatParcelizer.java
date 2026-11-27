package androidx.media;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
