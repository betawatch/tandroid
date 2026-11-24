// default package

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public abstract class j75 extends ViewGroup {
    public int a;
    public int b;
    public final LinkedHashMap c;

    public j75(LaunchActivity launchActivity) {
        super(launchActivity);
        this.c = new LinkedHashMap(16);
    }

    public final void a(dic dicVar) {
        addView(dicVar);
        this.c.put(dicVar, new i75(dicVar, new iu4(this, (byte) 14)));
    }

    public final void b(boolean z, boolean z2) {
        int min;
        int i;
        y74 y74Var;
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
            if (((i75) it.next()).h) {
                i3++;
            }
        }
        if (i3 == 0) {
            i3 = 1;
        }
        if (z3) {
            min = Math.min(gl.L(50.0f) + Math.max((int) ((measuredHeight - (gl.L(50.0f) * i3)) / (i3 + 0.333f)), 0), measuredHeight / i3);
            i = (measuredHeight - (i3 * min)) / 2;
        } else {
            int min2 = Math.min(gl.L(50.0f) + Math.max((int) ((measuredWidth2 - (gl.L(50.0f) * i3)) / (i3 + 0.333f)), 0), measuredWidth2 / i3);
            min = gl.L(76.0f);
            i = (measuredWidth2 - (i3 * min2)) / 2;
            measuredWidth2 = min2;
        }
        Iterator it2 = linkedHashMap.entrySet().iterator();
        int i4 = 0;
        while (it2.hasNext()) {
            i75 i75Var = (i75) ((Map.Entry) it2.next()).getValue();
            boolean z4 = i75Var.h;
            dic dicVar = i75Var.e;
            y74 y74Var2 = i75Var.b;
            fm0 fm0Var = i75Var.c;
            y74 y74Var3 = i75Var.a;
            if (z4) {
                if (z3) {
                    measuredWidth = ((measuredWidth2 - dicVar.getMeasuredWidth()) / 2) + (getMeasuredWidth() - measuredWidth2);
                    i2 = (min * i4) + i;
                } else {
                    measuredWidth = ((measuredWidth2 - dicVar.getMeasuredWidth()) / 2) + (measuredWidth2 * i4) + i;
                    i2 = getMeasuredHeight() - gl.L(76.0f);
                }
                if (z2 || !((z || y74Var3.h) && fm0Var.f)) {
                    y74Var3.c(measuredWidth);
                } else {
                    y74Var3.a(measuredWidth);
                }
                if (z2 || !((z || y74Var2.h) && fm0Var.f)) {
                    y74Var2.c(i2);
                } else {
                    y74Var2.a(i2);
                }
                i4++;
            }
            fm0Var.a(i75Var.h, !z2 && (z || ((y74Var = fm0Var.h) != null && y74Var.h)));
        }
        invalidate();
    }

    public final void c(dic dicVar, boolean z, boolean z2) {
        i75 i75Var = (i75) this.c.get(dicVar);
        if (i75Var == null || i75Var.h == z) {
            return;
        }
        i75Var.h = z;
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
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(gl.L(76.0f), TLObject.FLAG_30);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(gl.L(76.0f), TLObject.FLAG_30);
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
