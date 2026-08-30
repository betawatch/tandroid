package cf;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class g extends ViewGroup {
    public final ef.f a;

    public g(LaunchActivity launchActivity, ef.f fVar) {
        super(launchActivity);
        this.a = fVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        ef.f fVar = this.a;
        Path path = fVar.m;
        float f10 = (1.0f - fVar.o) * fVar.j.e;
        boolean z4 = f10 > 1.0f;
        canvas.drawColor(i0.a.k(j6.w0(null, j6.d6, false), (int) Math.min(fVar.o * 420.0f, 255.0f)));
        fVar.d.a(canvas, 1.0f);
        if (z4) {
            RectF rectF = fVar.l;
            if (fVar.k != f10) {
                fVar.k = f10;
                rectF.set(fVar.c);
                path.reset();
                path.addRoundRect(rectF, f10, f10, Path.Direction.CW);
                path.close();
            }
            canvas.save();
            canvas.clipPath(path);
        }
        super.dispatchDraw(canvas);
        fVar.e.a(canvas, 1.0f - fVar.o);
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
        ef.f fVar = this.a;
        Rect rect = fVar.c;
        if (z4) {
            rect.set(0, 0, size, size2);
        } else {
            rect.set(fVar.b);
        }
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            getChildAt(i12).measure(View.MeasureSpec.makeMeasureSpec(fVar.c.width(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(fVar.c.height(), TLObject.FLAG_30));
        }
    }
}
