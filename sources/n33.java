// default package

import android.media.MediaCodec;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class n33 {
    public final MediaCodec.CryptoInfo a;
    public final MediaCodec.CryptoInfo.Pattern b = z2.b();

    public n33(MediaCodec.CryptoInfo cryptoInfo) {
        this.a = cryptoInfo;
    }

    public final void a(int i, int i2) {
        this.b.set(i, i2);
        this.a.setPattern(this.b);
    }
}
