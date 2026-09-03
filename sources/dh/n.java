package dh;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.g61;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class n extends g61 {
    public final /* synthetic */ int c3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(p2 p2Var, m mVar, int i10) {
        super(p2Var, mVar, null, null);
        this.c3 = i10;
    }

    @Override // org.telegram.ui.Components.rl0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i10, int i11) {
        int min = Math.min(AndroidUtilities.dp(220.0f), View.MeasureSpec.getSize(i10));
        View.MeasureSpec.getSize(i11);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(k7.n.b(this.c3, 1, 5) * 48), TLObject.FLAG_30));
    }
}
