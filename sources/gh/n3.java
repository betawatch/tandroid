package gh;

import android.content.Context;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.wq0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class n3 extends k51 {
    public final /* synthetic */ wq0 b3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n3(Context context, int i10, ch.c cVar, l3 l3Var, l3 l3Var2, org.telegram.ui.ActionBar.c6 c6Var, wq0 wq0Var) {
        super(context, i10, 0, false, cVar, l3Var, l3Var2, c6Var, 3, 1);
        this.b3 = wq0Var;
    }

    @Override // org.telegram.ui.Components.zk0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.b3.o();
    }
}
