package j2;

import android.media.MediaCodec;
import com.google.android.gms.internal.cast.g4;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class c {
    public final MediaCodec.CryptoInfo a;
    public final MediaCodec.CryptoInfo.Pattern b = g4.a();

    public c(MediaCodec.CryptoInfo cryptoInfo) {
        this.a = cryptoInfo;
    }

    public static void a(c cVar, int i3, int i10) {
        cVar.b.set(i3, i10);
        cVar.a.setPattern(cVar.b);
    }
}
