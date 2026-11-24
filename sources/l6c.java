// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.view.ViewGroup;
import java.util.WeakHashMap;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class l6c extends ViewGroup {
    public final Paint a;
    public View b;
    public boolean c;

    public l6c(Context context) {
        super(context);
        this.a = new Paint(1);
        setClipToPadding(false);
    }

    public final boolean a() {
        View view = this.b;
        return view != null && view.getVisibility() == 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float R1 = gl.R1(0.1f, 0.75f, gl.Q0(getPaddingBottom()));
        int w0 = bkb.w0(null, bkb.Ei, false);
        int k = bm2.k(bkb.p1(R1, bkb.w0(null, bkb.c6, false)), w0);
        Paint paint = this.a;
        paint.setColor(w0);
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - r0, paint);
        paint.setColor(k);
        canvas.drawRect(0.0f, getMeasuredHeight() - r0, getMeasuredWidth(), getMeasuredHeight(), paint);
        super.dispatchDraw(canvas);
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
        boolean a = a();
        int size = View.MeasureSpec.getSize(i);
        int paddingBottom = a ? getPaddingBottom() + gl.L(44.0f) : 0;
        setMeasuredDimension(size, paddingBottom);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(paddingBottom, TLObject.FLAG_30);
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            getChildAt(i3).measure(makeMeasureSpec, makeMeasureSpec2);
        }
        if (this.c != a) {
            this.c = a;
            WeakHashMap weakHashMap = jdc.a;
            zcc.c(this);
        }
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        this.b = view;
    }

    @Override // android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(i, i2, i3, i4);
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            getChildAt(i5).setPadding(i, i2, i3, i4);
        }
    }
}
