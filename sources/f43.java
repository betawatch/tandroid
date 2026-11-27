// default package

import android.media.MediaCodec;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class f43 {
    public final MediaCodec.CryptoInfo a;
    public final MediaCodec.CryptoInfo.Pattern b = a3.b();

    public f43(MediaCodec.CryptoInfo cryptoInfo) {
        this.a = cryptoInfo;
    }

    public final void a(int i, int i2) {
        this.b.set(i, i2);
        this.a.setPattern(this.b);
    }
}
