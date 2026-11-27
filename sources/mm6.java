// default package

import android.media.MediaCodec;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public class mm6 extends q93 {
    public final int a;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public mm6(IllegalStateException illegalStateException, nm6 nm6Var) {
        super(r0.toString(), illegalStateException);
        int i;
        StringBuilder sb = new StringBuilder("Decoder failed: ");
        sb.append(nm6Var == null ? null : nm6Var.a);
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
