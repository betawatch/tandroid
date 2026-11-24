// default package

import android.media.MediaFormat;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
        if (!photoViewer.J4 || (lbcVar = photoViewer.G2) == null) {
            return;
        }
        gl.d3(new h18(this, lbcVar, (byte) 10));
    }
}
