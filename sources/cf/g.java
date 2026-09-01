package cf;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class g extends ViewGroup {
    public final ef.e a;

    public g(LaunchActivity launchActivity, ef.e eVar) {
        super(launchActivity);
        this.a = eVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        ef.e eVar = this.a;
        Path path = eVar.m;
        float f10 = (1.0f - eVar.o) * eVar.j.e;
        boolean z4 = f10 > 1.0f;
        canvas.drawColor(i0.a.k(k6.w0(null, k6.d6, false), (int) Math.min(eVar.o * 420.0f, 255.0f)));
        eVar.d.a(canvas, 1.0f);
        if (z4) {
            RectF rectF = eVar.l;
            if (eVar.k != f10) {
                eVar.k = f10;
                rectF.set(eVar.c);
                path.reset();
                path.addRoundRect(rectF, f10, f10, Path.Direction.CW);
                path.close();
            }
            canvas.save();
            canvas.clipPath(path);
        }
        super.dispatchDraw(canvas);
        eVar.e.a(canvas, 1.0f - eVar.o);
        if (z4) {
            canvas.restore();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        for (int i14 = 0; i14 < getChildCount(); i14++) {
            View childAt = getChildAt(i14);
            Rect rect = this.a.c;
            childAt.layout(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        setMeasuredDimension(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        boolean z4 = ((a) getParent()).d;
        ef.e eVar = this.a;
        Rect rect = eVar.c;
        if (z4) {
            rect.set(0, 0, size, size2);
        } else {
            rect.set(eVar.b);
        }
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            getChildAt(i12).measure(View.MeasureSpec.makeMeasureSpec(eVar.c.width(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(eVar.c.height(), TLObject.FLAG_30));
        }
    }
}
