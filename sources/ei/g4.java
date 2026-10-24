package ei;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.j71;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public final class g4 extends j71 {
    public final /* synthetic */ ma g3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g4(ma maVar, Context context, int i10, f4 f4Var, e1.c cVar, ci.b bVar) {
        super(context, i10, 0, false, f4Var, cVar, null, bVar, -1, 0);
        this.g3 = maVar;
    }

    @Override // org.telegram.ui.Components.j71
    public final void N1() {
        AndroidUtilities.forEachViews((RecyclerView) this.g3.b, (Utilities.Callback<View>) new ai.r0(this, 17));
    }

    @Override // org.telegram.ui.Components.mm0
    public final Integer X0(int i10) {
        return 0;
    }
}
