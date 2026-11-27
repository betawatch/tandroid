// default package

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public abstract class l95 extends ViewGroup {
    public int a;
    public int b;
    public final LinkedHashMap c;

    public l95(LaunchActivity launchActivity) {
        super(launchActivity);
        this.c = new LinkedHashMap(16);
    }

    public final void a(kmc kmcVar) {
        addView(kmcVar);
        this.c.put(kmcVar, new k95(kmcVar, new rj4(this, (byte) 28)));
    }

    public final void b(boolean z, boolean z2) {
        int min;
        int i;
        t84 t84Var;
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
            if (((k95) it.next()).h) {
                i3++;
            }
        }
        if (i3 == 0) {
            i3 = 1;
        }
        if (z3) {
            min = Math.min(hl.L(50.0f) + Math.max((int) ((measuredHeight - (hl.L(50.0f) * i3)) / (i3 + 0.333f)), 0), measuredHeight / i3);
            i = (measuredHeight - (i3 * min)) / 2;
        } else {
            int min2 = Math.min(hl.L(50.0f) + Math.max((int) ((measuredWidth2 - (hl.L(50.0f) * i3)) / (i3 + 0.333f)), 0), measuredWidth2 / i3);
            min = hl.L(76.0f);
            i = (measuredWidth2 - (i3 * min2)) / 2;
            measuredWidth2 = min2;
        }
        Iterator it2 = linkedHashMap.entrySet().iterator();
        int i4 = 0;
        while (it2.hasNext()) {
            k95 k95Var = (k95) ((Map.Entry) it2.next()).getValue();
            boolean z4 = k95Var.h;
            kmc kmcVar = k95Var.e;
            t84 t84Var2 = k95Var.b;
            fm0 fm0Var = k95Var.c;
            t84 t84Var3 = k95Var.a;
            if (z4) {
                if (z3) {
                    measuredWidth = ((measuredWidth2 - kmcVar.getMeasuredWidth()) / 2) + (getMeasuredWidth() - measuredWidth2);
                    i2 = (min * i4) + i;
                } else {
                    measuredWidth = ((measuredWidth2 - kmcVar.getMeasuredWidth()) / 2) + (measuredWidth2 * i4) + i;
                    i2 = getMeasuredHeight() - hl.L(76.0f);
                }
                if (z2 || !((z || t84Var3.h) && fm0Var.f)) {
                    t84Var3.c(measuredWidth);
                } else {
                    t84Var3.a(measuredWidth);
                }
                if (z2 || !((z || t84Var2.h) && fm0Var.f)) {
                    t84Var2.c(i2);
                } else {
                    t84Var2.a(i2);
                }
                i4++;
            }
            fm0Var.a(k95Var.h, !z2 && (z || ((t84Var = fm0Var.h) != null && t84Var.h)));
        }
        invalidate();
    }

    public final void c(kmc kmcVar, boolean z, boolean z2) {
        k95 k95Var = (k95) this.c.get(kmcVar);
        if (k95Var == null || k95Var.h == z) {
            return;
        }
        k95Var.h = z;
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
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(hl.L(76.0f), TLObject.FLAG_30);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(hl.L(76.0f), TLObject.FLAG_30);
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
