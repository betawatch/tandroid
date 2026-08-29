package bh;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.u51;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class n extends u51 {
    public final /* synthetic */ int b3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(o2 o2Var, m mVar, int i10) {
        super(o2Var, mVar, null, null);
        this.b3 = i10;
    }

    @Override // org.telegram.ui.Components.jl0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i10, int i11) {
        int min = Math.min(AndroidUtilities.dp(220.0f), View.MeasureSpec.getSize(i10));
        View.MeasureSpec.getSize(i11);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(i7.w.b(this.b3, 1, 5) * 48), TLObject.FLAG_30));
    }
}
