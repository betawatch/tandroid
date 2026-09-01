package eh;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.i61;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class o extends i61 {
    public final /* synthetic */ int c3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(p2 p2Var, n nVar, int i10) {
        super(p2Var, nVar, null, null);
        this.c3 = i10;
    }

    @Override // org.telegram.ui.Components.tl0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i10, int i11) {
        int min = Math.min(AndroidUtilities.dp(220.0f), View.MeasureSpec.getSize(i10));
        View.MeasureSpec.getSize(i11);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(k7.o.b(this.c3, 1, 5) * 48), TLObject.FLAG_30));
    }
}
