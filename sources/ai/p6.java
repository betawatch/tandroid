package ai;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.vl0;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes4.dex */
public final class p6 extends vl0 implements s9 {
    public final /* synthetic */ j7 X2;
    public final /* synthetic */ j7 Y2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p6(j7 j7Var, Context context, d dVar) {
        super(context, dVar);
        this.Y2 = j7Var;
        this.X2 = j7Var;
    }

    @Override // ai.s9
    public final void a(int[] iArr) {
        iArr[0] = AndroidUtilities.dp(this.X2.e);
        iArr[1] = getMeasuredHeight();
    }

    @Override // org.telegram.ui.Components.vl0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i10, int i11) {
        this.Y2.n = View.MeasureSpec.getSize(i11);
        super.onMeasure(i10, i11);
    }
}
