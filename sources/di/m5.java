package di;

import android.content.Context;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
        createOverlayStoryViewer.E(getContext(), j10, q7.a(this.L.d.r));
    }
}
