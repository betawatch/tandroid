package ai;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextPaint;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class k1 extends View {
    public final j1 a;

    public k1(Context context) {
        super(context);
        j1 j1Var = new j1();
        this.a = j1Var;
        j1Var.r = this;
        j1Var.d.H0(this);
    }

    public j1 getDrawable() {
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
        j1 j1Var = this.a;
        j1Var.d.R();
        org.telegram.ui.Components.p5.release((View) null, j1Var.q);
        j1Var.q = null;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int width = getWidth() - getPaddingRight();
        int height = getHeight() - getPaddingBottom();
        j1 j1Var = this.a;
        j1Var.setBounds(paddingLeft, paddingTop, width, height);
        j1Var.draw(canvas);
    }

    @Override // android.view.View
    public final void onMeasure(int i3, int i10) {
        int size = (View.MeasureSpec.getSize(i3) - getPaddingLeft()) - getPaddingRight();
        j1 j1Var = this.a;
        j1Var.b(size);
        setMeasuredDimension(getPaddingRight() + getPaddingLeft() + j1Var.t, getPaddingBottom() + getPaddingTop() + j1Var.u);
    }

    public void setMessage(CharSequence charSequence) {
        j1 j1Var = this.a;
        j1Var.m = charSequence;
        j1Var.s = -1;
        requestLayout();
    }

    public void setUser(TLObject tLObject) {
        this.a.c(tLObject);
        invalidate();
    }
}
