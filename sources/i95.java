// default package

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public abstract class i95 extends ViewGroup {
    public int a;
    public int b;
    public final LinkedHashMap c;

    public i95(LaunchActivity launchActivity) {
        super(launchActivity);
        this.c = new LinkedHashMap(16);
    }

    public final void a(dkc dkcVar) {
        addView(dkcVar);
        this.c.put(dkcVar, new h95(dkcVar, new qn4(this, (byte) 21)));
    }

    public final void b(boolean z, boolean z2) {
        int min;
        int i;
        h94 h94Var;
        int measuredWidth;
        int i2;
        int measuredWidth2 = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        boolean z3 = measuredWidth2 <= measuredHeight;
        if (measuredWidth2 <= 0 || measuredHeight <= 0) {
            return;
        }
        LinkedHashMap linkedHashMap = this.c;
        Iterator it = linkedHashMap.values().iterator();
        int i3 = 0;
        while (it.hasNext()) {
            if (((h95) it.next()).h) {
                i3++;
            }
        }
        if (i3 == 0) {
            i3 = 1;
        }
        if (z3) {
            min = Math.min(gm.L(50.0f) + Math.max((int) ((measuredHeight - (gm.L(50.0f) * i3)) / (i3 + 0.333f)), 0), measuredHeight / i3);
            i = (measuredHeight - (i3 * min)) / 2;
        } else {
            int min2 = Math.min(gm.L(50.0f) + Math.max((int) ((measuredWidth2 - (gm.L(50.0f) * i3)) / (i3 + 0.333f)), 0), measuredWidth2 / i3);
            min = gm.L(76.0f);
            i = (measuredWidth2 - (i3 * min2)) / 2;
            measuredWidth2 = min2;
        }
        Iterator it2 = linkedHashMap.entrySet().iterator();
        int i4 = 0;
        while (it2.hasNext()) {
            h95 h95Var = (h95) ((Map.Entry) it2.next()).getValue();
            boolean z4 = h95Var.h;
            dkc dkcVar = h95Var.e;
            h94 h94Var2 = h95Var.b;
            fn0 fn0Var = h95Var.c;
            h94 h94Var3 = h95Var.a;
            if (z4) {
                if (z3) {
                    measuredWidth = ((measuredWidth2 - dkcVar.getMeasuredWidth()) / 2) + (getMeasuredWidth() - measuredWidth2);
                    i2 = (min * i4) + i;
                } else {
                    measuredWidth = ((measuredWidth2 - dkcVar.getMeasuredWidth()) / 2) + (measuredWidth2 * i4) + i;
                    i2 = getMeasuredHeight() - gm.L(76.0f);
                }
                if (z2 || !((z || h94Var3.h) && fn0Var.f)) {
                    h94Var3.c(measuredWidth);
                } else {
                    h94Var3.a(measuredWidth);
                }
                if (z2 || !((z || h94Var2.h) && fn0Var.f)) {
                    h94Var2.c(i2);
                } else {
                    h94Var2.a(i2);
                }
                i4++;
            }
            fn0Var.a(h95Var.h, !z2 && (z || ((h94Var = fn0Var.h) != null && h94Var.h)));
        }
        invalidate();
    }

    public final void c(dkc dkcVar, boolean z, boolean z2) {
        h95 h95Var = (h95) this.c.get(dkcVar);
        if (h95Var == null || h95Var.h == z) {
            return;
        }
        h95Var.h = z;
        b(z2, false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            childAt.layout(0, 0, childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        setMeasuredDimension(size, size2);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(gm.L(76.0f), TLObject.FLAG_30);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(gm.L(76.0f), TLObject.FLAG_30);
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            getChildAt(i3).measure(makeMeasureSpec, makeMeasureSpec2);
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
