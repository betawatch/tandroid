package nh;

import android.content.Context;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final class x4 extends org.telegram.ui.Cells.m6 {
    public final /* synthetic */ z4 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x4(int i10, Context context, b bVar, z4 z4Var) {
        super(1, i10, context, bVar, false, true);
        this.H = z4Var;
    }

    @Override // org.telegram.ui.Cells.m6
    public final void b(long j10) {
        org.telegram.ui.ActionBar.p2 R = LaunchActivity.R();
        if (R == null) {
            return;
        }
        i9 createOverlayStoryViewer = R.createOverlayStoryViewer();
        createOverlayStoryViewer.getClass();
        createOverlayStoryViewer.D(getContext(), j10, c7.a(this.H.d.r));
    }
}
