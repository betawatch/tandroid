package ei;

import android.content.Context;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class e5 extends org.telegram.ui.Cells.l6 {
    public final /* synthetic */ g5 M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e5(int i3, Context context, b bVar, g5 g5Var) {
        super(1, i3, context, bVar, false, true);
        this.M = g5Var;
    }

    @Override // org.telegram.ui.Cells.l6
    public final void b(long j10) {
        org.telegram.ui.ActionBar.d2 Q = LaunchActivity.Q();
        if (Q == null) {
            return;
        }
        r9 createOverlayStoryViewer = Q.createOverlayStoryViewer();
        createOverlayStoryViewer.getClass();
        createOverlayStoryViewer.R(getContext(), j10, i7.a(this.M.d.r));
    }
}
