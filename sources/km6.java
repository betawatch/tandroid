// default package

import android.media.MediaCodec;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public class km6 extends ja3 {
    public final int a;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public km6(IllegalStateException illegalStateException, lm6 lm6Var) {
        super(r0.toString(), illegalStateException);
        int i;
        StringBuilder sb = new StringBuilder("Decoder failed: ");
        sb.append(lm6Var == null ? null : lm6Var.a);
        if (illegalStateException instanceof MediaCodec.CodecException) {
            MediaCodec.CodecException codecException = (MediaCodec.CodecException) illegalStateException;
            codecException.getDiagnosticInfo();
            i = codecException.getErrorCode();
        } else {
            i = 0;
        }
        this.a = i;
    }
}
