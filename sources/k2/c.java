package k2;

import android.media.MediaCodec;
import com.google.android.gms.internal.cast.f4;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
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
