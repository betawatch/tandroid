package gh;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextPaint;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class z0 extends View {
    public final y0 a;

    public z0(Context context) {
        super(context);
        y0 y0Var = new y0();
        this.a = y0Var;
        y0Var.r = this;
        y0Var.d.setParentView(this);
    }

    public y0 getDrawable() {
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
        y0 y0Var = this.a;
        y0Var.d.onDetachedFromWindow();
        org.telegram.ui.Components.t5.release((View) null, y0Var.q);
        y0Var.q = null;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int width = getWidth() - getPaddingRight();
        int height = getHeight() - getPaddingBottom();
        y0 y0Var = this.a;
        y0Var.setBounds(paddingLeft, paddingTop, width, height);
        y0Var.draw(canvas);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = (View.MeasureSpec.getSize(i10) - getPaddingLeft()) - getPaddingRight();
        y0 y0Var = this.a;
        y0Var.b(size);
        setMeasuredDimension(getPaddingRight() + getPaddingLeft() + y0Var.t, getPaddingBottom() + getPaddingTop() + y0Var.u);
    }

    public void setMessage(CharSequence charSequence) {
        y0 y0Var = this.a;
        y0Var.m = charSequence;
        y0Var.s = -1;
        requestLayout();
    }

    public void setUser(TLObject tLObject) {
        this.a.c(tLObject);
        invalidate();
    }
}
