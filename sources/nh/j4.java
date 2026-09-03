package nh;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.rl0;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final class j4 extends rl0 implements a7 {
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

    @Override // org.telegram.ui.Components.rl0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i10, int i11) {
        this.V2.n = View.MeasureSpec.getSize(i11);
        super.onMeasure(i10, i11);
    }
}
