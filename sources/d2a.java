// default package

import android.content.Context;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class d2a extends r19 {
    public final /* synthetic */ e2a M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2a(int i, r63 r63Var, e2a e2aVar, Context context) {
        super(1, i, r63Var, context, false, true);
        this.M = e2aVar;
    }

    @Override // r19
    public final void b(long j) {
        d Q = LaunchActivity.Q();
        if (Q == null) {
            return;
        }
        oab createOverlayStoryViewer = Q.createOverlayStoryViewer();
        createOverlayStoryViewer.getClass();
        createOverlayStoryViewer.H(getContext(), j, q4b.a(this.M.d.r));
    }
}
