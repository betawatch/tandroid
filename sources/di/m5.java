package di;

import android.content.Context;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class m5 extends org.telegram.ui.Cells.s6 {
    public final /* synthetic */ o5 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m5(int i10, Context context, b bVar, o5 o5Var) {
        super(1, i10, context, bVar, false, true);
        this.L = o5Var;
    }

    @Override // org.telegram.ui.Cells.s6
    public final void b(long j10) {
        org.telegram.ui.ActionBar.r2 R = LaunchActivity.R();
        if (R == null) {
            return;
        }
        y9 createOverlayStoryViewer = R.createOverlayStoryViewer();
        createOverlayStoryViewer.getClass();
        createOverlayStoryViewer.D(getContext(), j10, q7.a(this.L.d.r));
    }
}
