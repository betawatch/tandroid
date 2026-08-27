package jh;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.zk0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class j4 extends zk0 implements z6 {
    public final /* synthetic */ c5 T2;
    public final /* synthetic */ c5 U2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j4(c5 c5Var, Context context, b bVar) {
        super(context, bVar);
        this.U2 = c5Var;
        this.T2 = c5Var;
    }

    @Override // jh.z6
    public final void a(int[] iArr) {
        iArr[0] = AndroidUtilities.dp(this.T2.e);
        iArr[1] = getMeasuredHeight();
    }

    @Override // org.telegram.ui.Components.zk0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i10, int i11) {
        this.U2.n = View.MeasureSpec.getSize(i11);
        super.onMeasure(i10, i11);
    }
}
