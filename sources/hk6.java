// default package

import android.media.MediaCodec;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public class hk6 extends x83 {
    public final int a;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public hk6(IllegalStateException illegalStateException, ik6 ik6Var) {
        super(r0.toString(), illegalStateException);
        int i;
        StringBuilder sb = new StringBuilder("Decoder failed: ");
        sb.append(ik6Var == null ? null : ik6Var.a);
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
