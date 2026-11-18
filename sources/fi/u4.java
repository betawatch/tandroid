package fi;

import android.content.Context;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final class u4 extends org.telegram.ui.Cells.m6 {
    public final /* synthetic */ w4 M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u4(int i7, Context context, b bVar, w4 w4Var) {
        super(1, i7, context, bVar, false, true);
        this.M = w4Var;
    }

    @Override // org.telegram.ui.Cells.m6
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
