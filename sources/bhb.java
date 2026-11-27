// default package

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes3.dex */
public final class bhb extends ViewGroup {
    public final LaunchActivity a;
    public final Rect b;
    public View c;
    public int d;
    public int e;
    public boolean f;

    public bhb(LaunchActivity launchActivity) {
        super(launchActivity);
        this.b = new Rect();
        this.a = launchActivity;
        setWillNotDraw(false);
    }

    public final void a(View view, Rect rect) {
        View view2 = this.c;
        if (view2 != null && view2 != view) {
            removeView(view2);
        }
        this.c = view;
        Rect rect2 = this.b;
        if (rect != null) {
            rect2.set(rect);
        } else {
            rect2.setEmpty();
        }
        if (view != null && view.getParent() != this) {
            hl.B2(view);
            addView(view);
        }
        requestLayout();
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.c == null || !this.f) {
            return;
        }
        canvas.drawColor(-16777216);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.c == null) {
            return;
        }
        if (!this.f) {
            Rect rect = this.b;
            if (!rect.isEmpty()) {
                this.c.layout(rect.left, rect.top, rect.right, rect.bottom);
                return;
            }
        }
        this.c.layout(0, 0, i3 - i, i4 - i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002b  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i, int i2) {
        boolean z;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (!hl.F1(this.a)) {
            this.d = size;
            this.e = size2;
        } else if (size < this.d || size2 < this.e) {
            z = true;
            this.f = z;
            setMeasuredDimension(size, size2);
            if (this.c == null) {
                boolean z2 = this.f;
                Rect rect = this.b;
                boolean z3 = z2 || rect.isEmpty();
                View view = this.c;
                if (!z3) {
                    size = rect.width();
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30);
                if (!z3) {
                    size2 = rect.height();
                }
                view.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
                return;
            }
            return;
        }
        z = false;
        this.f = z;
        setMeasuredDimension(size, size2);
        if (this.c == null) {
        }
    }
}
