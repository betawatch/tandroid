package bi;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextPaint;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class m1 extends View {
    public final l1 a;

    public m1(Context context) {
        super(context);
        l1 l1Var = new l1();
        this.a = l1Var;
        l1Var.r = this;
        l1Var.d.H0(this);
    }

    public l1 getDrawable() {
        return this.a;
    }

    public TextPaint getTextPaint() {
        return this.a.c;
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.a.d.P();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        l1 l1Var = this.a;
        l1Var.d.R();
        org.telegram.ui.Components.y5.release((View) null, l1Var.q);
        l1Var.q = null;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int width = getWidth() - getPaddingRight();
        int height = getHeight() - getPaddingBottom();
        l1 l1Var = this.a;
        l1Var.setBounds(paddingLeft, paddingTop, width, height);
        l1Var.draw(canvas);
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        int size = (View.MeasureSpec.getSize(i7) - getPaddingLeft()) - getPaddingRight();
        l1 l1Var = this.a;
        l1Var.b(size);
        setMeasuredDimension(getPaddingRight() + getPaddingLeft() + l1Var.t, getPaddingBottom() + getPaddingTop() + l1Var.u);
    }

    public void setMessage(CharSequence charSequence) {
        l1 l1Var = this.a;
        l1Var.m = charSequence;
        l1Var.s = -1;
        requestLayout();
    }

    public void setUser(TLObject tLObject) {
        this.a.c(tLObject);
        invalidate();
    }
}
