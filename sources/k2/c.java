package k2;

import android.media.MediaCodec;
import com.google.android.gms.internal.cast.f4;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
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
