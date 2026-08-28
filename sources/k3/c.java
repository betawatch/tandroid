package k3;

import android.media.MediaCodec;
import com.google.android.gms.internal.cast.i4;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class c {
    public final MediaCodec.CryptoInfo a;
    public final MediaCodec.CryptoInfo.Pattern b = i4.a();

    public c(MediaCodec.CryptoInfo cryptoInfo) {
        this.a = cryptoInfo;
    }

    public static void a(c cVar, int i9, int i10) {
        cVar.b.set(i9, i10);
        cVar.a.setPattern(cVar.b);
    }
}
