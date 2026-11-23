package k2;

import android.media.MediaCodec;
import com.google.android.gms.internal.cast.f4;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final class c {
    public final MediaCodec.CryptoInfo a;
    public final MediaCodec.CryptoInfo.Pattern b = f4.a();

    public c(MediaCodec.CryptoInfo cryptoInfo) {
        this.a = cryptoInfo;
    }

    public static void a(c cVar, int i7, int i10) {
        cVar.b.set(i7, i10);
        cVar.a.setPattern(cVar.b);
    }
}
