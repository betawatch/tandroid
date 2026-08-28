package eh;

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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.l0;
import org.telegram.messenger.ll;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.ah0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class v extends ViewGroup {
    public final GestureDetector a;
    public final Path b;
    public final RectF c;
    public boolean d;
    public final /* synthetic */ w e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(w wVar, Context context) {
        super(context);
        this.e = wVar;
        this.a = new GestureDetector(getContext(), new u(this));
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
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        int height = getHeight();
        w wVar = this.e;
        int i13 = wVar.a;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = wVar.f;
        int i14 = wVar.b;
        int d = (height - wVar.d()) / 2;
        int width = getWidth();
        ah0 ah0Var = wVar.h;
        int measuredWidth = (width - ah0Var.getMeasuredWidth()) / 2;
        ah0Var.layout(measuredWidth, d, ah0Var.getMeasuredWidth() + measuredWidth, ah0Var.getMeasuredHeight() + d);
        s sVar = wVar.n;
        sVar.layout(ah0Var.getLeft(), ah0Var.getTop(), ah0Var.getRight(), sVar.getMeasuredHeight() + ah0Var.getTop());
        int C = l0.C(12.0f, ah0Var.getMeasuredHeight(), d);
        TextView textView = wVar.d;
        textView.layout(AndroidUtilities.dp(16.0f) + ah0Var.getLeft(), C, ah0Var.getRight() - AndroidUtilities.dp(16.0f), textView.getMeasuredHeight() + C);
        int measuredHeight = textView.getMeasuredHeight() + C;
        TextView textView2 = wVar.e;
        if (textView2.getVisibility() != 8) {
            int dp = AndroidUtilities.dp(4.0f) + measuredHeight;
            textView2.layout(textView.getLeft(), dp, textView.getRight(), textView2.getMeasuredHeight() + dp);
            measuredHeight = textView2.getMeasuredHeight() + dp;
        }
        int dp2 = AndroidUtilities.dp(12.0f) + measuredHeight;
        wVar.c.setBounds(ah0Var.getLeft() - i14, ah0Var.getTop() - i13, ah0Var.getRight() + i14, i13 + dp2);
        actionBarPopupWindow$ActionBarPopupWindowLayout.layout((ah0Var.getRight() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth()) + i14, dp2, ah0Var.getRight() + i14, actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight() + dp2);
        actionBarPopupWindow$ActionBarPopupWindowLayout.setVisibility(actionBarPopupWindow$ActionBarPopupWindowLayout.getBottom() < i12 ? 0 : 8);
        int dp3 = AndroidUtilities.dp(6.0f);
        float left = ah0Var.getLeft();
        float top = ah0Var.getTop();
        float right = ah0Var.getRight();
        float top2 = (dp3 * 2) + ah0Var.getTop();
        RectF rectF = this.c;
        rectF.set(left, top, right, top2);
        Path path = this.b;
        path.reset();
        float f10 = dp3;
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(rectF, f10, f10, direction);
        rectF.set(i9, ah0Var.getTop() + dp3, i11, i12);
        path.addRect(rectF, direction);
    }

    @Override // android.view.View
    public final void onMeasure(int i9, int i10) {
        setWillNotDraw(false);
        super.onMeasure(i9, i10);
        int A = ll.A(12.0f, 2, Math.min(Math.min(getMeasuredWidth(), getMeasuredHeight()), (int) (getMeasuredHeight() * 0.66d)));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(A, TLObject.FLAG_31);
        w wVar = this.e;
        ah0 ah0Var = wVar.h;
        ah0Var.measure(makeMeasureSpec, makeMeasureSpec);
        wVar.n.measure(makeMeasureSpec, makeMeasureSpec);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(A - (AndroidUtilities.dp(16.0f) * 2), TLObject.FLAG_30);
        wVar.d.measure(makeMeasureSpec2, View.MeasureSpec.makeMeasureSpec(0, 0));
        wVar.e.measure(makeMeasureSpec2, View.MeasureSpec.makeMeasureSpec(0, 0));
        wVar.f.measure(View.MeasureSpec.makeMeasureSpec((wVar.b * 2) + ah0Var.getMeasuredWidth(), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.View
    public final void onSizeChanged(int i9, int i10, int i11, int i12) {
        super.onSizeChanged(i9, i10, i11, i12);
        Point point = AndroidUtilities.displaySize;
        int i13 = point.x;
        int i14 = point.y;
        w wVar = this.e;
        if (i13 > i14) {
            super/*android.app.Dialog*/.dismiss();
        }
        if (i9 == i11 || i10 == i12) {
            return;
        }
        if (!this.d) {
            wVar.f();
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
