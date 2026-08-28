package ih;

import android.content.Context;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class a5 extends org.telegram.ui.Cells.n6 {
    public final /* synthetic */ c5 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a5(int i9, Context context, b bVar, c5 c5Var) {
        super(1, i9, context, bVar, false, true);
        this.G = c5Var;
    }

    @Override // org.telegram.ui.Cells.n6
    public final void b(long j10) {
        org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
        if (R == null) {
            return;
        }
        m9 createOverlayStoryViewer = R.createOverlayStoryViewer();
        createOverlayStoryViewer.getClass();
        createOverlayStoryViewer.D(getContext(), j10, e7.a(this.G.d.r));
    }
}
