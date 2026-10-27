package fi;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.s71;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class f4 extends s71 {
    public final /* synthetic */ ia n3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f4(ia iaVar, Context context, int i10, d4 d4Var, e1.c cVar, di.b bVar) {
        super(context, i10, 0, false, d4Var, cVar, null, bVar, -1, 0);
        this.n3 = iaVar;
    }

    @Override // org.telegram.ui.Components.s71
    public final void N1() {
        AndroidUtilities.forEachViews((RecyclerView) this.n3.b, (Utilities.Callback<View>) new ai.i(this, 21));
    }

    @Override // org.telegram.ui.Components.nm0
    public final Integer W0(int i10) {
        return 0;
    }
}
