// default package

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class ap3 extends kg0 {
    public fp3 d;

    @Override // kg0
    public final w39 a() {
        fp3 fp3Var = new fp3(y6c.t0, this.a);
        this.d = fp3Var;
        fp3Var.r = this;
        return fp3Var;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        fp3 fp3Var = this.d;
        Context context = getContext();
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        ArrayList arrayList = fp3Var.f;
        hp3 hp3Var = new hp3(context, fp3Var.c);
        int i3 = 0;
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            hp3Var.a((gp3) arrayList.get(i4));
            hp3Var.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(measuredHeight, TLObject.FLAG_31));
            ((gp3) arrayList.get(i4)).e = i3;
            i3 += hp3Var.getMeasuredHeight();
        }
        fp3Var.n = i3;
    }
}
