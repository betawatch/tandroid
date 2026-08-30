package nh;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.sl0;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final class j4 extends sl0 implements a7 {
    public final /* synthetic */ d5 U2;
    public final /* synthetic */ d5 V2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j4(d5 d5Var, Context context, b bVar) {
        super(context, bVar);
        this.V2 = d5Var;
        this.U2 = d5Var;
    }

    @Override // nh.a7
    public final void a(int[] iArr) {
        iArr[0] = AndroidUtilities.dp(this.U2.e);
        iArr[1] = getMeasuredHeight();
    }

    @Override // org.telegram.ui.Components.sl0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i10, int i11) {
        this.V2.n = View.MeasureSpec.getSize(i11);
        super.onMeasure(i10, i11);
    }
}
