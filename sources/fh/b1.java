package fh;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextPaint;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class b1 extends View {
    public final a1 a;

    public b1(Context context) {
        super(context);
        a1 a1Var = new a1();
        this.a = a1Var;
        a1Var.r = this;
        a1Var.d.setParentView(this);
    }

    public a1 getDrawable() {
        return this.a;
    }

    public TextPaint getTextPaint() {
        return this.a.c;
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.a.d.onAttachedToWindow();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a1 a1Var = this.a;
        a1Var.d.onDetachedFromWindow();
        org.telegram.ui.Components.t5.release((View) null, a1Var.q);
        a1Var.q = null;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int width = getWidth() - getPaddingRight();
        int height = getHeight() - getPaddingBottom();
        a1 a1Var = this.a;
        a1Var.setBounds(paddingLeft, paddingTop, width, height);
        a1Var.draw(canvas);
    }

    @Override // android.view.View
    public final void onMeasure(int i9, int i10) {
        int size = (View.MeasureSpec.getSize(i9) - getPaddingLeft()) - getPaddingRight();
        a1 a1Var = this.a;
        a1Var.b(size);
        setMeasuredDimension(getPaddingRight() + getPaddingLeft() + a1Var.t, getPaddingBottom() + getPaddingTop() + a1Var.u);
    }

    public void setMessage(CharSequence charSequence) {
        a1 a1Var = this.a;
        a1Var.m = charSequence;
        a1Var.s = -1;
        requestLayout();
    }

    public void setUser(TLObject tLObject) {
        this.a.c(tLObject);
        invalidate();
    }
}
