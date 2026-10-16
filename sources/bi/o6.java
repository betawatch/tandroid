package bi;

import android.content.Context;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
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
