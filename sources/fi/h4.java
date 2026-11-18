package fi;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.ck0;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final class h4 extends ck0 implements w6 {
    public final /* synthetic */ a5 f3;
    public final /* synthetic */ a5 g3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h4(a5 a5Var, Context context, b bVar) {
        super(context, bVar);
        this.g3 = a5Var;
        this.f3 = a5Var;
    }

    @Override // fi.w6
    public final void a(int[] iArr) {
        iArr[0] = org.telegram.messenger.g0.L(this.f3.e);
        iArr[1] = getMeasuredHeight();
    }

    @Override // org.telegram.ui.Components.ck0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i7, int i10) {
        this.g3.n = View.MeasureSpec.getSize(i10);
        super.onMeasure(i7, i10);
    }
}
