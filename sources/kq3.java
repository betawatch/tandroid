// default package

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class kq3 extends lh0 {
    public pq3 d;

    @Override // lh0
    public final y59 a() {
        pq3 pq3Var = new pq3(z8c.t0, this.a);
        this.d = pq3Var;
        pq3Var.r = this;
        return pq3Var;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        pq3 pq3Var = this.d;
        Context context = getContext();
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        ArrayList arrayList = pq3Var.f;
        rq3 rq3Var = new rq3(context, pq3Var.c);
        int i3 = 0;
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            rq3Var.a((qq3) arrayList.get(i4));
            rq3Var.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(measuredHeight, TLObject.FLAG_31));
            ((qq3) arrayList.get(i4)).e = i3;
            i3 += rq3Var.getMeasuredHeight();
        }
        pq3Var.n = i3;
    }
}
