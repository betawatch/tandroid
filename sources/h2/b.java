package h2;

import android.media.MediaCodec;
import com.google.android.gms.internal.cast.k4;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class b {
    public final MediaCodec.CryptoInfo a;
    public final MediaCodec.CryptoInfo.Pattern b = k4.a();

    public b(MediaCodec.CryptoInfo cryptoInfo) {
        this.a = cryptoInfo;
    }

    public static void a(b bVar, int i10, int i11) {
        bVar.b.set(i10, i11);
        bVar.a.setPattern(bVar.b);
    }
}
