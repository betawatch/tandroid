package androidx.media;

import y4.b;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(b bVar) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.a = bVar.f(audioAttributesImplBase.a, 1);
        audioAttributesImplBase.b = bVar.f(audioAttributesImplBase.b, 2);
        audioAttributesImplBase.c = bVar.f(audioAttributesImplBase.c, 3);
        audioAttributesImplBase.d = bVar.f(audioAttributesImplBase.d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, b bVar) {
        bVar.getClass();
        bVar.j(audioAttributesImplBase.a, 1);
        bVar.j(audioAttributesImplBase.b, 2);
        bVar.j(audioAttributesImplBase.c, 3);
        bVar.j(audioAttributesImplBase.d, 4);
    }
}
