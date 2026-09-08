package h2;

import android.media.MediaCodec;
import com.google.android.gms.internal.cast.k4;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
