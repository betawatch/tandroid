package h2;

import android.media.MediaCodec;
import com.google.android.gms.internal.cast.k4;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
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
