package h2;

import android.media.MediaCodec;
import com.google.android.gms.internal.cast.k4;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
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
