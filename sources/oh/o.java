package oh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import org.telegram.messenger.a30;
import org.telegram.messenger.i0;
import org.telegram.messenger.m5;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.vg0;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class o extends ViewGroup {
    public final GestureDetector a;
    public final Path b;
    public final RectF c;
    public boolean d;
    public final /* synthetic */ p e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(p pVar, Context context) {
        super(context);
        this.e = pVar;
        this.a = new GestureDetector(getContext(), new lg.f(1, this));
        this.b = new Path();
        this.c = new RectF();
        this.d = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipPath(this.b);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        this.e.c.draw(canvas);
        super.onDraw(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int height = getHeight();
        p pVar = this.e;
        int i14 = pVar.a;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = pVar.f;
        int i15 = pVar.b;
        int d = (height - pVar.d()) / 2;
        int width = getWidth();
        vg0 vg0Var = pVar.h;
        int measuredWidth = (width - vg0Var.getMeasuredWidth()) / 2;
        vg0Var.layout(measuredWidth, d, vg0Var.getMeasuredWidth() + measuredWidth, vg0Var.getMeasuredHeight() + d);
        m mVar = pVar.n;
        mVar.layout(vg0Var.getLeft(), vg0Var.getTop(), vg0Var.getRight(), mVar.getMeasuredHeight() + vg0Var.getTop());
        int C = m5.C(12.0f, vg0Var.getMeasuredHeight(), d);
        TextView textView = pVar.d;
        textView.layout(i0.L(16.0f) + vg0Var.getLeft(), C, vg0Var.getRight() - i0.L(16.0f), textView.getMeasuredHeight() + C);
        int measuredHeight = textView.getMeasuredHeight() + C;
        TextView textView2 = pVar.e;
        if (textView2.getVisibility() != 8) {
            int L = i0.L(4.0f) + measuredHeight;
            textView2.layout(textView.getLeft(), L, textView.getRight(), textView2.getMeasuredHeight() + L);
            measuredHeight = textView2.getMeasuredHeight() + L;
        }
        int L2 = i0.L(12.0f) + measuredHeight;
        pVar.c.setBounds(vg0Var.getLeft() - i15, vg0Var.getTop() - i14, vg0Var.getRight() + i15, i14 + L2);
        actionBarPopupWindow$ActionBarPopupWindowLayout.layout((vg0Var.getRight() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth()) + i15, L2, vg0Var.getRight() + i15, actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight() + L2);
        actionBarPopupWindow$ActionBarPopupWindowLayout.setVisibility(actionBarPopupWindow$ActionBarPopupWindowLayout.getBottom() < i13 ? 0 : 8);
        int L3 = i0.L(6.0f);
        float left = vg0Var.getLeft();
        float top = vg0Var.getTop();
        float right = vg0Var.getRight();
        float top2 = (L3 * 2) + vg0Var.getTop();
        RectF rectF = this.c;
        rectF.set(left, top, right, top2);
        Path path = this.b;
        path.reset();
        float f7 = L3;
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(rectF, f7, f7, direction);
        rectF.set(i10, vg0Var.getTop() + L3, i12, i13);
        path.addRect(rectF, direction);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        setWillNotDraw(false);
        super.onMeasure(i10, i11);
        int A = a30.A(12.0f, 2, Math.min(Math.min(getMeasuredWidth(), getMeasuredHeight()), (int) (getMeasuredHeight() * 0.66d)));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(A, TLObject.FLAG_31);
        p pVar = this.e;
        vg0 vg0Var = pVar.h;
        vg0Var.measure(makeMeasureSpec, makeMeasureSpec);
        pVar.n.measure(makeMeasureSpec, makeMeasureSpec);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(A - (i0.L(16.0f) * 2), TLObject.FLAG_30);
        pVar.d.measure(makeMeasureSpec2, View.MeasureSpec.makeMeasureSpec(0, 0));
        pVar.e.measure(makeMeasureSpec2, View.MeasureSpec.makeMeasureSpec(0, 0));
        pVar.f.measure(View.MeasureSpec.makeMeasureSpec((pVar.b * 2) + vg0Var.getMeasuredWidth(), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        Point point = i0.q;
        int i14 = point.x;
        int i15 = point.y;
        p pVar = this.e;
        if (i14 > i15) {
            super/*android.app.Dialog*/.dismiss();
        }
        if (i10 == i12 || i11 == i13) {
            return;
        }
        if (!this.d) {
            pVar.f();
        }
        this.d = false;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.a.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.e.c || super.verifyDrawable(drawable);
    }
}
