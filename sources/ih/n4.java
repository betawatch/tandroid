package ih;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.wk0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class n4 extends wk0 implements c7 {
    public final /* synthetic */ g5 T2;
    public final /* synthetic */ g5 U2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n4(g5 g5Var, Context context, b bVar) {
        super(context, bVar);
        this.U2 = g5Var;
        this.T2 = g5Var;
    }

    @Override // ih.c7
    public final void a(int[] iArr) {
        iArr[0] = AndroidUtilities.dp(this.T2.e);
        iArr[1] = getMeasuredHeight();
    }

    @Override // org.telegram.ui.Components.wk0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i9, int i10) {
        this.U2.n = View.MeasureSpec.getSize(i10);
        super.onMeasure(i9, i10);
    }
}
