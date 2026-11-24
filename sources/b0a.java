// default package

import android.content.Context;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final class b0a extends qz8 {
    public final /* synthetic */ c0a M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0a(int i, f53 f53Var, c0a c0aVar, Context context) {
        super(1, i, f53Var, context, false, true);
        this.M = c0aVar;
    }

    @Override // qz8
    public final void b(long j) {
        d Q = LaunchActivity.Q();
        if (Q == null) {
            return;
        }
        m8b createOverlayStoryViewer = Q.createOverlayStoryViewer();
        createOverlayStoryViewer.getClass();
        createOverlayStoryViewer.H(getContext(), j, p2b.a(this.M.d.r));
    }
}
