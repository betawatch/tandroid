package ci;

import android.content.Context;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final class n5 extends org.telegram.ui.Cells.n6 {
    public final /* synthetic */ p5 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n5(int i10, Context context, b bVar, p5 p5Var) {
        super(1, i10, context, bVar, false, true);
        this.L = p5Var;
    }

    @Override // org.telegram.ui.Cells.n6
    public final void b(long j10) {
        org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
        if (R == null) {
            return;
        }
        aa createOverlayStoryViewer = R.createOverlayStoryViewer();
        createOverlayStoryViewer.getClass();
        createOverlayStoryViewer.D(getContext(), j10, r7.a(this.L.d.r));
    }
}
