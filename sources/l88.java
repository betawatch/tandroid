// default package

import android.media.MediaFormat;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class l88 implements sac {
    public final /* synthetic */ PhotoViewer a;

    public l88(PhotoViewer photoViewer) {
        this.a = photoViewer;
    }

    @Override // sac
    public final void c(long j, long j2, fm4 fm4Var, MediaFormat mediaFormat) {
        lbc lbcVar;
        PhotoViewer photoViewer = this.a;
        if (!photoViewer.I4 || (lbcVar = photoViewer.G2) == null) {
            return;
        }
        gl.c3(new h18(this, lbcVar, (byte) 10));
    }
}
