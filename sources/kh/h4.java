package kh;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.i51;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class h4 extends i51 {
    public final /* synthetic */ na b3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h4(na naVar, Context context, int i9, f4 f4Var, p pVar, ih.b bVar) {
        super(context, i9, 0, false, f4Var, pVar, null, bVar, -1, 0);
        this.b3 = naVar;
    }

    @Override // org.telegram.ui.Components.i51
    public final void H1() {
        AndroidUtilities.forEachViews((RecyclerView) this.b3.b, (d5.d) new hg.i(this, 5));
    }

    @Override // org.telegram.ui.Components.wk0
    public final Integer W0(int i9) {
        return 0;
    }
}
