// default package

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextPaint;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class hw4 extends View {
    public final gw4 a;

    public hw4(Context context) {
        super(context);
        gw4 gw4Var = new gw4();
        this.a = gw4Var;
        gw4Var.r = this;
        gw4Var.d.p0(this);
    }

    public gw4 getDrawable() {
        return this.a;
    }

    public TextPaint getTextPaint() {
        return this.a.c;
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.a.d.I();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        gw4 gw4Var = this.a;
        gw4Var.d.K();
        gn.release((View) null, gw4Var.q);
        gw4Var.q = null;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int width = getWidth() - getPaddingRight();
        int height = getHeight() - getPaddingBottom();
        gw4 gw4Var = this.a;
        gw4Var.setBounds(paddingLeft, paddingTop, width, height);
        gw4Var.draw(canvas);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int size = (View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight();
        gw4 gw4Var = this.a;
        gw4Var.b(size);
        setMeasuredDimension(getPaddingRight() + getPaddingLeft() + gw4Var.t, getPaddingBottom() + getPaddingTop() + gw4Var.u);
    }

    public void setMessage(CharSequence charSequence) {
        gw4 gw4Var = this.a;
        gw4Var.m = charSequence;
        gw4Var.s = -1;
        requestLayout();
    }

    public void setUser(TLObject tLObject) {
        this.a.c(tLObject);
        invalidate();
    }
}
