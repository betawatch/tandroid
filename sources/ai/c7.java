package ai;

import android.content.Context;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes4.dex */
public final class c7 extends org.telegram.ui.Cells.o6 {
    public final /* synthetic */ e7 K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c7(int i10, d dVar, e7 e7Var, Context context) {
        super(1, i10, context, dVar, false, true);
        this.K = e7Var;
    }

    @Override // org.telegram.ui.Cells.o6
    public final void b(long j3) {
        org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
        if (R == null) {
            return;
        }
        jc createOverlayStoryViewer = R.createOverlayStoryViewer();
        createOverlayStoryViewer.getClass();
        createOverlayStoryViewer.D(getContext(), j3, u9.a(this.K.d.r));
    }
}
