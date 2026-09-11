package bi;

import android.content.Context;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes4.dex */
public final class l6 extends org.telegram.ui.Cells.n6 {
    public final /* synthetic */ n6 K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l6(int i10, Context context, b bVar, n6 n6Var) {
        super(1, i10, context, bVar, false, true);
        this.K = n6Var;
    }

    @Override // org.telegram.ui.Cells.n6
    public final void b(long j3) {
        org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
        if (R == null) {
            return;
        }
        pb createOverlayStoryViewer = R.createOverlayStoryViewer();
        createOverlayStoryViewer.getClass();
        createOverlayStoryViewer.D(getContext(), j3, d9.a(this.K.d.r));
    }
}
