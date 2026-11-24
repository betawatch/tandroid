// default package

import android.content.Context;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final class b0a extends qz8 {
    public final /* synthetic */ c0a M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0a(int i, f53 f53Var, c0a c0aVar, Context context) {
        super(1, i, f53Var, context, false, true);
        this.M = c0aVar;
    }

    @Override // qz8
    public final void b(long j) {
        d Q = LaunchActivity.Q();
        if (Q == null) {
            return;
        }
        m8b createOverlayStoryViewer = Q.createOverlayStoryViewer();
        createOverlayStoryViewer.getClass();
        createOverlayStoryViewer.H(getContext(), j, p2b.a(this.M.d.r));
    }
}
