package ci;

import android.content.Context;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes4.dex */
public final class m5 extends org.telegram.ui.Cells.o6 {
    public final /* synthetic */ o5 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m5(int i10, Context context, b bVar, o5 o5Var) {
        super(1, i10, context, bVar, false, true);
        this.L = o5Var;
    }

    @Override // org.telegram.ui.Cells.o6
    public final void b(long j10) {
        org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
        if (R == null) {
            return;
        }
        z9 createOverlayStoryViewer = R.createOverlayStoryViewer();
        createOverlayStoryViewer.getClass();
        createOverlayStoryViewer.D(getContext(), j10, q7.a(this.L.d.r));
    }
}
