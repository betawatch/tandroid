package h2;

import android.media.MediaCodec;
import com.google.android.gms.internal.cast.i4;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes.dex */
public final class c {
    public final MediaCodec.CryptoInfo a;
    public final MediaCodec.CryptoInfo.Pattern b = i4.a();

    public c(MediaCodec.CryptoInfo cryptoInfo) {
        this.a = cryptoInfo;
    }

    public static void a(c cVar, int i10, int i11) {
        cVar.b.set(i10, i11);
        cVar.a.setPattern(cVar.b);
    }
}
