package bi;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextPaint;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class h1 extends View {
    public final g1 a;

    public h1(Context context) {
        super(context);
        g1 g1Var = new g1();
        this.a = g1Var;
        g1Var.r = this;
        g1Var.d.H0(this);
    }

    public g1 getDrawable() {
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
        g1 g1Var = this.a;
        g1Var.d.R();
        org.telegram.ui.Components.p5.release((View) null, g1Var.q);
        g1Var.q = null;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int width = getWidth() - getPaddingRight();
        int height = getHeight() - getPaddingBottom();
        g1 g1Var = this.a;
        g1Var.setBounds(paddingLeft, paddingTop, width, height);
        g1Var.draw(canvas);
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        int size = (View.MeasureSpec.getSize(i7) - getPaddingLeft()) - getPaddingRight();
        g1 g1Var = this.a;
        g1Var.b(size);
        setMeasuredDimension(getPaddingRight() + getPaddingLeft() + g1Var.t, getPaddingBottom() + getPaddingTop() + g1Var.u);
    }

    public void setMessage(CharSequence charSequence) {
        g1 g1Var = this.a;
        g1Var.m = charSequence;
        g1Var.s = -1;
        requestLayout();
    }

    public void setUser(TLObject tLObject) {
        this.a.c(tLObject);
        invalidate();
    }
}
