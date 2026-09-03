package d4;

import android.media.MediaCodec;
import h5.d0;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public class l extends n3.g {
    public final String a;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public l(IllegalStateException illegalStateException, n nVar) {
        super(r0.toString(), illegalStateException);
        StringBuilder sb = new StringBuilder("Decoder failed: ");
        String str = null;
        sb.append(nVar == null ? null : nVar.a);
        if (d0.a >= 21 && (illegalStateException instanceof MediaCodec.CodecException)) {
            str = ((MediaCodec.CodecException) illegalStateException).getDiagnosticInfo();
        }
        this.a = str;
    }
}
