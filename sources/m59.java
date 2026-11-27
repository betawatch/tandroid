// default package

import android.view.View;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class m59 extends q9c {
    public final /* synthetic */ int n3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m59(e eVar, l59 l59Var, int i) {
        super(eVar, l59Var, null, null);
        this.n3 = i;
    }

    @Override // d79, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i, int i2) {
        int min = Math.min(hl.L(220.0f), View.MeasureSpec.getSize(i));
        View.MeasureSpec.getSize(i2);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(hl.L(ete.b(this.n3, 1, 5) * 48), TLObject.FLAG_30));
    }
}
