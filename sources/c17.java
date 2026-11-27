// default package

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
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class c17 extends ViewGroup {
    public final GestureDetector a;
    public final Path b;
    public final RectF c;
    public boolean d;
    public final /* synthetic */ d17 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c17(d17 d17Var, Context context) {
        super(context);
        this.e = d17Var;
        this.a = new GestureDetector(getContext(), new yl3(this, (byte) 1));
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
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int height = getHeight();
        d17 d17Var = this.e;
        int i5 = d17Var.a;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = d17Var.f;
        int i6 = d17Var.b;
        int c = (height - d17Var.c()) / 2;
        int width = getWidth();
        et8 et8Var = d17Var.h;
        int measuredWidth = (width - et8Var.getMeasuredWidth()) / 2;
        et8Var.layout(measuredWidth, c, et8Var.getMeasuredWidth() + measuredWidth, et8Var.getMeasuredHeight() + c);
        a17 a17Var = d17Var.n;
        a17Var.layout(et8Var.getLeft(), et8Var.getTop(), et8Var.getRight(), a17Var.getMeasuredHeight() + et8Var.getTop());
        int w = uh9.w(12.0f, et8Var.getMeasuredHeight(), c);
        TextView textView = d17Var.d;
        textView.layout(hl.L(16.0f) + et8Var.getLeft(), w, et8Var.getRight() - hl.L(16.0f), textView.getMeasuredHeight() + w);
        int measuredHeight = textView.getMeasuredHeight() + w;
        TextView textView2 = d17Var.e;
        if (textView2.getVisibility() != 8) {
            int L = hl.L(4.0f) + measuredHeight;
            textView2.layout(textView.getLeft(), L, textView.getRight(), textView2.getMeasuredHeight() + L);
            measuredHeight = textView2.getMeasuredHeight() + L;
        }
        int L2 = hl.L(12.0f) + measuredHeight;
        d17Var.c.setBounds(et8Var.getLeft() - i6, et8Var.getTop() - i5, et8Var.getRight() + i6, i5 + L2);
        actionBarPopupWindow$ActionBarPopupWindowLayout.layout((et8Var.getRight() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth()) + i6, L2, et8Var.getRight() + i6, actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight() + L2);
        actionBarPopupWindow$ActionBarPopupWindowLayout.setVisibility(actionBarPopupWindow$ActionBarPopupWindowLayout.getBottom() < i4 ? 0 : 8);
        int L3 = hl.L(6.0f);
        float left = et8Var.getLeft();
        float top = et8Var.getTop();
        float right = et8Var.getRight();
        float top2 = et8Var.getTop() + (L3 << 1);
        RectF rectF = this.c;
        rectF.set(left, top, right, top2);
        Path path = this.b;
        path.reset();
        float f = L3;
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(rectF, f, f, direction);
        rectF.set(i, et8Var.getTop() + L3, i3, i4);
        path.addRect(rectF, direction);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setWillNotDraw(false);
        super.onMeasure(i, i2);
        int min = Math.min(Math.min(getMeasuredWidth(), getMeasuredHeight()), (int) (getMeasuredHeight() * 0.66d)) - (hl.L(12.0f) << 1);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(min, TLObject.FLAG_31);
        d17 d17Var = this.e;
        et8 et8Var = d17Var.h;
        et8Var.measure(makeMeasureSpec, makeMeasureSpec);
        d17Var.n.measure(makeMeasureSpec, makeMeasureSpec);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(min - (hl.L(16.0f) << 1), TLObject.FLAG_30);
        d17Var.d.measure(makeMeasureSpec2, 0);
        d17Var.e.measure(makeMeasureSpec2, 0);
        d17Var.f.measure(View.MeasureSpec.makeMeasureSpec(et8Var.getMeasuredWidth() + (d17Var.b << 1), TLObject.FLAG_31), 0);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        Point point = hl.q;
        int i5 = point.x;
        int i6 = point.y;
        d17 d17Var = this.e;
        if (i5 > i6) {
            super/*android.app.Dialog*/.dismiss();
        }
        if (i == i3 || i2 == i4) {
            return;
        }
        if (!this.d) {
            d17Var.f();
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
