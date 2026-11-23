package k2;

import android.media.MediaCodec;
import com.google.android.gms.internal.cast.f4;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
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
