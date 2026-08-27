package jh;

import android.content.Context;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class w4 extends org.telegram.ui.Cells.k6 {
    public final /* synthetic */ y4 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w4(int i10, Context context, b bVar, y4 y4Var) {
        super(1, i10, context, bVar, false, true);
        this.G = y4Var;
    }

    @Override // org.telegram.ui.Cells.k6
    public final void b(long j10) {
        org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
        if (R == null) {
            return;
        }
        i9 createOverlayStoryViewer = R.createOverlayStoryViewer();
        createOverlayStoryViewer.getClass();
        createOverlayStoryViewer.D(getContext(), j10, b7.a(this.G.d.r));
    }
}
