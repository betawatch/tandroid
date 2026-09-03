package kh;

import android.content.Context;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.or0;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class g3 extends g61 {
    public final /* synthetic */ or0 c3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g3(Context context, int i10, dg.r1 r1Var, e3 e3Var, e3 e3Var2, f6 f6Var, or0 or0Var) {
        super(context, i10, 0, false, r1Var, e3Var, e3Var2, f6Var, 3, 1);
        this.c3 = or0Var;
    }

    @Override // org.telegram.ui.Components.rl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        this.c3.o();
    }
}
