// default package

import android.media.MediaFormat;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
        hl.c3(new h68(this, kfcVar, (byte) 8));
    }
}
