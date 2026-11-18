package fi;

import android.content.Context;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final class u4 extends org.telegram.ui.Cells.n6 {
    public final /* synthetic */ w4 M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u4(int i7, Context context, b bVar, w4 w4Var) {
        super(1, i7, context, bVar, false, true);
        this.M = w4Var;
    }

    @Override // org.telegram.ui.Cells.n6
    public final void b(long j3) {
        org.telegram.ui.ActionBar.h2 Q = LaunchActivity.Q();
        if (Q == null) {
            return;
        }
        f9 createOverlayStoryViewer = Q.createOverlayStoryViewer();
        createOverlayStoryViewer.getClass();
        createOverlayStoryViewer.J(getContext(), j3, y6.a(this.M.d.r));
    }
}
