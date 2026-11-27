// default package

import android.media.MediaFormat;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class cc8 implements sec {
    public final /* synthetic */ PhotoViewer a;

    public cc8(PhotoViewer photoViewer) {
        this.a = photoViewer;
    }

    @Override // sec
    public final void b(long j, long j2, ko4 ko4Var, MediaFormat mediaFormat) {
        kfc kfcVar;
        PhotoViewer photoViewer = this.a;
        if (!photoViewer.I4 || (kfcVar = photoViewer.G2) == null) {
            return;
        }
        hl.c3(new a58(this, kfcVar, (byte) 9));
    }
}
