package mh;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import l2.w;
import org.telegram.messenger.camera.q;
import org.telegram.messenger.g0;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.voip.n2;
import te.c;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public abstract class b extends ViewGroup {
    public int a;
    public int b;
    public final LinkedHashMap c;

    public b(Context context) {
        super(context);
        this.c = new LinkedHashMap(16);
    }

    public final void a(n2 n2Var) {
        addView(n2Var);
        this.c.put(n2Var, new a(n2Var, new w(this, 10)));
    }

    public final void b(boolean z9, boolean z10) {
        int min;
        int i7;
        c cVar;
        int measuredWidth;
        int i10;
        int measuredWidth2 = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        boolean z11 = measuredWidth2 <= measuredHeight;
        if (measuredWidth2 <= 0 || measuredHeight <= 0) {
            return;
        }
        LinkedHashMap linkedHashMap = this.c;
        Iterator it = linkedHashMap.values().iterator();
        int i11 = 0;
        while (it.hasNext()) {
            if (((a) it.next()).h) {
                i11++;
            }
        }
        if (i11 == 0) {
            i11 = 1;
        }
        if (z11) {
            min = Math.min(g0.L(50.0f) + Math.max((int) (q.A(50.0f, i11, measuredHeight) / (i11 + 0.333f)), 0), measuredHeight / i11);
            i7 = (measuredHeight - (i11 * min)) / 2;
        } else {
            int min2 = Math.min(g0.L(50.0f) + Math.max((int) (q.A(50.0f, i11, measuredWidth2) / (i11 + 0.333f)), 0), measuredWidth2 / i11);
            min = g0.L(76.0f);
            i7 = (measuredWidth2 - (i11 * min2)) / 2;
            measuredWidth2 = min2;
        }
        Iterator it2 = linkedHashMap.entrySet().iterator();
        int i12 = 0;
        while (it2.hasNext()) {
            a aVar = (a) ((Map.Entry) it2.next()).getValue();
            boolean z12 = aVar.h;
            n2 n2Var = aVar.e;
            c cVar2 = aVar.b;
            te.a aVar2 = aVar.c;
            c cVar3 = aVar.a;
            if (z12) {
                if (z11) {
                    measuredWidth = ((measuredWidth2 - n2Var.getMeasuredWidth()) / 2) + (getMeasuredWidth() - measuredWidth2);
                    i10 = (min * i12) + i7;
                } else {
                    measuredWidth = ((measuredWidth2 - n2Var.getMeasuredWidth()) / 2) + (measuredWidth2 * i12) + i7;
                    i10 = getMeasuredHeight() - g0.L(76.0f);
                }
                if (z10 || !((z9 || cVar3.h) && aVar2.f)) {
                    cVar3.c(measuredWidth);
                } else {
                    cVar3.a(measuredWidth);
                }
                if (z10 || !((z9 || cVar2.h) && aVar2.f)) {
                    cVar2.c(i10);
                } else {
                    cVar2.a(i10);
                }
                i12++;
            }
            aVar2.a(aVar.h, !z10 && (z9 || ((cVar = aVar2.h) != null && cVar.h)));
        }
        invalidate();
    }

    public final void c(n2 n2Var, boolean z9, boolean z10) {
        a aVar = (a) this.c.get(n2Var);
        if (aVar == null || aVar.h == z9) {
            return;
        }
        aVar.h = z9;
        b(z10, false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            childAt.layout(0, 0, childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i10);
        setMeasuredDimension(size, size2);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(g0.L(76.0f), TLObject.FLAG_30);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(g0.L(76.0f), TLObject.FLAG_30);
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            getChildAt(i11).measure(makeMeasureSpec, makeMeasureSpec2);
        }
        if (this.a == size && this.b == size2) {
            b(true, false);
            return;
        }
        b(false, true);
        this.a = size;
        this.b = size2;
    }
}
