package lh;

import android.content.Context;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class w4 extends org.telegram.ui.Cells.l6 {
    public final /* synthetic */ y4 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w4(int i10, Context context, b bVar, y4 y4Var) {
        super(1, i10, context, bVar, false, true);
        this.G = y4Var;
    }

    @Override // org.telegram.ui.Cells.l6
    public final void b(long j10) {
        org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
        if (R == null) {
            return;
        }
        i9 createOverlayStoryViewer = R.createOverlayStoryViewer();
        createOverlayStoryViewer.getClass();
        createOverlayStoryViewer.D(getContext(), j10, b7.a(this.G.d.r));
    }
}
