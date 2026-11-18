package bi;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextPaint;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class i1 extends View {
    public final h1 a;

    public i1(Context context) {
        super(context);
        h1 h1Var = new h1();
        this.a = h1Var;
        h1Var.r = this;
        h1Var.d.H0(this);
    }

    public h1 getDrawable() {
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
        h1 h1Var = this.a;
        h1Var.d.R();
        org.telegram.ui.Components.x5.release((View) null, h1Var.q);
        h1Var.q = null;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int width = getWidth() - getPaddingRight();
        int height = getHeight() - getPaddingBottom();
        h1 h1Var = this.a;
        h1Var.setBounds(paddingLeft, paddingTop, width, height);
        h1Var.draw(canvas);
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        int size = (View.MeasureSpec.getSize(i7) - getPaddingLeft()) - getPaddingRight();
        h1 h1Var = this.a;
        h1Var.b(size);
        setMeasuredDimension(getPaddingRight() + getPaddingLeft() + h1Var.t, getPaddingBottom() + getPaddingTop() + h1Var.u);
    }

    public void setMessage(CharSequence charSequence) {
        h1 h1Var = this.a;
        h1Var.m = charSequence;
        h1Var.s = -1;
        requestLayout();
    }

    public void setUser(TLObject tLObject) {
        this.a.c(tLObject);
        invalidate();
    }
}
