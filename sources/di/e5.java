package di;

import android.content.Context;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class e5 extends org.telegram.ui.Cells.m6 {
    public final /* synthetic */ g5 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e5(int i7, Context context, b bVar, g5 g5Var) {
        super(1, i7, context, bVar, false, true);
        this.L = g5Var;
    }

    @Override // org.telegram.ui.Cells.m6
    public final void b(long j3) {
        org.telegram.ui.ActionBar.f2 Q = LaunchActivity.Q();
        if (Q == null) {
            return;
        }
        p9 createOverlayStoryViewer = Q.createOverlayStoryViewer();
        createOverlayStoryViewer.getClass();
        createOverlayStoryViewer.J(getContext(), j3, h7.a(this.L.d.r));
    }
}
