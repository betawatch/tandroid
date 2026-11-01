package kg;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.e20;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class b extends a {
    public c d;

    @Override // kg.a
    public final s4.g0 a() {
        c cVar = new c(e20.s0, this.a);
        this.d = cVar;
        cVar.r = this;
        return cVar;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        c cVar = this.d;
        Context context = getContext();
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        ArrayList arrayList = cVar.f;
        e eVar = new e(context, cVar.c);
        int i12 = 0;
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            eVar.a((d) arrayList.get(i13));
            eVar.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(measuredHeight, TLObject.FLAG_31));
            ((d) arrayList.get(i13)).e = i12;
            i12 += eVar.getMeasuredHeight();
        }
        cVar.n = i12;
    }
}
