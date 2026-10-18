package ci;

import android.content.Context;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
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
