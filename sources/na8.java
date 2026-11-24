// default package

import android.media.MediaFormat;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class na8 implements vcc {
    public final /* synthetic */ PhotoViewer a;

    public na8(PhotoViewer photoViewer) {
        this.a = photoViewer;
    }

    @Override // vcc
    public final void c(long j, long j2, go4 go4Var, MediaFormat mediaFormat) {
        ndc ndcVar;
        PhotoViewer photoViewer = this.a;
        if (!photoViewer.I4 || (ndcVar = photoViewer.G2) == null) {
            return;
        }
        gm.c3(new a18(this, ndcVar, (byte) 11));
    }
}
