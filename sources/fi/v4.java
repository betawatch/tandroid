package fi;

import android.content.Context;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes4.dex */
public final class v4 extends org.telegram.ui.Cells.n6 {
    public final /* synthetic */ x4 M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v4(int i7, Context context, b bVar, x4 x4Var) {
        super(1, i7, context, bVar, false, true);
        this.M = x4Var;
    }

    @Override // org.telegram.ui.Cells.n6
    public final void b(long j3) {
        org.telegram.ui.ActionBar.g2 Q = LaunchActivity.Q();
        if (Q == null) {
            return;
        }
        f9 createOverlayStoryViewer = Q.createOverlayStoryViewer();
        createOverlayStoryViewer.getClass();
        createOverlayStoryViewer.J(getContext(), j3, y6.a(this.M.d.r));
    }
}
