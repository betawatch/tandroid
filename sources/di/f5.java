package di;

import android.content.Context;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class f5 extends org.telegram.ui.Cells.m6 {
    public final /* synthetic */ h5 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f5(int i7, Context context, b bVar, h5 h5Var) {
        super(1, i7, context, bVar, false, true);
        this.L = h5Var;
    }

    @Override // org.telegram.ui.Cells.m6
    public final void b(long j3) {
        org.telegram.ui.ActionBar.f2 Q = LaunchActivity.Q();
        if (Q == null) {
            return;
        }
        q9 createOverlayStoryViewer = Q.createOverlayStoryViewer();
        createOverlayStoryViewer.getClass();
        createOverlayStoryViewer.J(getContext(), j3, i7.a(this.L.d.r));
    }
}
