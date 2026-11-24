// default package

import android.media.MediaCodec;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
