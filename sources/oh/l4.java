package oh;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.tl0;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final class l4 extends tl0 implements a7 {
    public final /* synthetic */ e5 U2;
    public final /* synthetic */ e5 V2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l4(e5 e5Var, Context context, b bVar) {
        super(context, bVar);
        this.V2 = e5Var;
        this.U2 = e5Var;
    }

    @Override // oh.a7
    public final void a(int[] iArr) {
        iArr[0] = AndroidUtilities.dp(this.U2.e);
        iArr[1] = getMeasuredHeight();
    }

    @Override // org.telegram.ui.Components.tl0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i10, int i11) {
        this.V2.n = View.MeasureSpec.getSize(i11);
        super.onMeasure(i10, i11);
    }
}
