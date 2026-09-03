package oh;

import android.content.Context;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class y4 extends org.telegram.ui.Cells.n6 {
    public final /* synthetic */ a5 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y4(int i10, Context context, b bVar, a5 a5Var) {
        super(1, i10, context, bVar, false, true);
        this.H = a5Var;
    }

    @Override // org.telegram.ui.Cells.n6
    public final void b(long j10) {
        org.telegram.ui.ActionBar.p2 R = LaunchActivity.R();
        if (R == null) {
            return;
        }
        i9 createOverlayStoryViewer = R.createOverlayStoryViewer();
        createOverlayStoryViewer.getClass();
        createOverlayStoryViewer.D(getContext(), j10, c7.a(this.H.d.r));
    }
}
