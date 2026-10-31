package ih;

import android.view.View;
import org.telegram.messenger.i0;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.Components.u51;
import w7.u;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class l extends u51 {
    public final /* synthetic */ int m3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(k2 k2Var, k kVar, int i10) {
        super(k2Var, kVar, null, null);
        this.m3 = i10;
    }

    @Override // org.telegram.ui.Components.tk0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i10, int i11) {
        int min = Math.min(i0.L(220.0f), View.MeasureSpec.getSize(i10));
        View.MeasureSpec.getSize(i11);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i0.L(u.b(this.m3, 1, 5) * 48), TLObject.FLAG_30));
    }
}
