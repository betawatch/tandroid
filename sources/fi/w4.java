package fi;

import android.content.Context;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class w4 extends org.telegram.ui.Cells.l6 {
    public final /* synthetic */ y4 M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w4(int i7, Context context, b bVar, y4 y4Var) {
        super(1, i7, context, bVar, false, true);
        this.M = y4Var;
    }

    @Override // org.telegram.ui.Cells.l6
    public final void b(long j3) {
        org.telegram.ui.ActionBar.e2 Q = LaunchActivity.Q();
        if (Q == null) {
            return;
        }
        i9 createOverlayStoryViewer = Q.createOverlayStoryViewer();
        createOverlayStoryViewer.getClass();
        createOverlayStoryViewer.J(getContext(), j3, b7.a(this.M.d.r));
    }
}
