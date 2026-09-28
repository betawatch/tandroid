package ci;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.t61;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes4.dex */
public final class o4 extends t61 {
    public final /* synthetic */ cb f3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o4(cb cbVar, Context context, int i10, m4 m4Var, a1.c cVar, ai.d dVar) {
        super(context, i10, 0, false, m4Var, cVar, null, dVar, -1, 0);
        this.f3 = cbVar;
    }

    @Override // org.telegram.ui.Components.t61
    public final void H1() {
        AndroidUtilities.forEachViews((RecyclerView) this.f3.b, (Utilities.Callback<View>) new ai.y1(this, 11));
    }

    @Override // org.telegram.ui.Components.yl0
    public final Integer W0(int i10) {
        return 0;
    }
}
