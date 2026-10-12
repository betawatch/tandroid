package bi;

import android.content.Context;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final class o6 extends org.telegram.ui.Cells.o6 {
    public final /* synthetic */ q6 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o6(int i10, Context context, b bVar, q6 q6Var) {
        super(1, i10, context, bVar, false, true);
        this.L = q6Var;
    }

    @Override // org.telegram.ui.Cells.o6
    public final void b(long j10) {
        org.telegram.ui.ActionBar.m2 R = LaunchActivity.R();
        if (R == null) {
            return;
        }
        sb createOverlayStoryViewer = R.createOverlayStoryViewer();
        createOverlayStoryViewer.getClass();
        createOverlayStoryViewer.D(getContext(), j10, g9.a(this.L.d.r));
    }
}
