package bi;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ll0;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes4.dex */
public final class y5 extends ll0 implements b9 {
    public final /* synthetic */ s6 X2;
    public final /* synthetic */ s6 Y2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y5(s6 s6Var, Context context, b bVar) {
        super(context, bVar);
        this.Y2 = s6Var;
        this.X2 = s6Var;
    }

    @Override // bi.b9
    public final void a(int[] iArr) {
        iArr[0] = AndroidUtilities.dp(this.X2.e);
        iArr[1] = getMeasuredHeight();
    }

    @Override // org.telegram.ui.Components.ll0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i10, int i11) {
        this.Y2.n = View.MeasureSpec.getSize(i11);
        super.onMeasure(i10, i11);
    }
}
