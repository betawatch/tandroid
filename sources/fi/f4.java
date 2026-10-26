package fi;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.r71;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class f4 extends r71 {
    public final /* synthetic */ ia n3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f4(ia iaVar, Context context, int i10, d4 d4Var, e1.c cVar, di.b bVar) {
        super(context, i10, 0, false, d4Var, cVar, null, bVar, -1, 0);
        this.n3 = iaVar;
    }

    @Override // org.telegram.ui.Components.r71
    public final void N1() {
        AndroidUtilities.forEachViews((RecyclerView) this.n3.b, (Utilities.Callback<View>) new ai.i(this, 21));
    }

    @Override // org.telegram.ui.Components.mm0
    public final Integer W0(int i10) {
        return 0;
    }
}
