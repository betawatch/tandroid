package lh;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.k51;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class f4 extends k51 {
    public final /* synthetic */ ka b3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f4(ka kaVar, Context context, int i10, e4 e4Var, p pVar, jh.b bVar) {
        super(context, i10, 0, false, e4Var, pVar, null, bVar, -1, 0);
        this.b3 = kaVar;
    }

    @Override // org.telegram.ui.Components.k51
    public final void H1() {
        AndroidUtilities.forEachViews((RecyclerView) this.b3.b, (d5.d) new ig.i(this, 5));
    }

    @Override // org.telegram.ui.Components.zk0
    public final Integer W0(int i10) {
        return 0;
    }
}
