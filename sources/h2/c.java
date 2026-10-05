package h2;

import android.media.MediaCodec;
import com.google.android.gms.internal.cast.k4;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes.dex */
public final class c {
    public final MediaCodec.CryptoInfo a;
    public final MediaCodec.CryptoInfo.Pattern b = k4.a();

    public c(MediaCodec.CryptoInfo cryptoInfo) {
        this.a = cryptoInfo;
    }

    public static void a(c cVar, int i10, int i11) {
        cVar.b.set(i10, i11);
        cVar.a.setPattern(cVar.b);
    }
}
