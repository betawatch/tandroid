// default package

import android.view.View;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class b49 extends q7c {
    public final /* synthetic */ int n3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b49(d dVar, a49 a49Var, int i) {
        super(dVar, a49Var, null, null);
        this.n3 = i;
    }

    @Override // r59, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i, int i2) {
        int min = Math.min(gm.L(220.0f), View.MeasureSpec.getSize(i));
        View.MeasureSpec.getSize(i2);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gm.L(pqe.b(this.n3, 1, 5) * 48), TLObject.FLAG_30));
    }
}
