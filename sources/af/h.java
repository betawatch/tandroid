package af;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class h extends ViewGroup {
    public final cf.e a;

    public h(LaunchActivity launchActivity, cf.e eVar) {
        super(launchActivity);
        this.a = eVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        cf.e eVar = this.a;
        Path path = eVar.m;
        float f9 = (1.0f - eVar.o) * eVar.j.e;
        boolean z10 = f9 > 1.0f;
        canvas.drawColor(i0.a.k(g6.w0(null, g6.d6, false), (int) Math.min(eVar.o * 420.0f, 255.0f)));
        eVar.d.a(canvas, 1.0f);
        if (z10) {
            RectF rectF = eVar.l;
            if (eVar.k != f9) {
                eVar.k = f9;
                rectF.set(eVar.c);
                path.reset();
                path.addRoundRect(rectF, f9, f9, Path.Direction.CW);
                path.close();
            }
            canvas.save();
            canvas.clipPath(path);
        }
        super.dispatchDraw(canvas);
        eVar.e.a(canvas, 1.0f - eVar.o);
        if (z10) {
            canvas.restore();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
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
        boolean z10 = ((a) getParent()).d;
        cf.e eVar = this.a;
        Rect rect = eVar.c;
        if (z10) {
            rect.set(0, 0, size, size2);
        } else {
            rect.set(eVar.b);
        }
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            getChildAt(i12).measure(View.MeasureSpec.makeMeasureSpec(eVar.c.width(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(eVar.c.height(), TLObject.FLAG_30));
        }
    }
}
