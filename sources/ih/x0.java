package ih;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextPaint;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class x0 extends View {
    public final w0 a;

    public x0(Context context) {
        super(context);
        w0 w0Var = new w0();
        this.a = w0Var;
        w0Var.r = this;
        w0Var.d.setParentView(this);
    }

    public w0 getDrawable() {
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
        w0 w0Var = this.a;
        w0Var.d.onDetachedFromWindow();
        org.telegram.ui.Components.y5.release((View) null, w0Var.q);
        w0Var.q = null;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int width = getWidth() - getPaddingRight();
        int height = getHeight() - getPaddingBottom();
        w0 w0Var = this.a;
        w0Var.setBounds(paddingLeft, paddingTop, width, height);
        w0Var.draw(canvas);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = (View.MeasureSpec.getSize(i10) - getPaddingLeft()) - getPaddingRight();
        w0 w0Var = this.a;
        w0Var.b(size);
        setMeasuredDimension(getPaddingRight() + getPaddingLeft() + w0Var.t, getPaddingBottom() + getPaddingTop() + w0Var.u);
    }

    public void setMessage(CharSequence charSequence) {
        w0 w0Var = this.a;
        w0Var.m = charSequence;
        w0Var.s = -1;
        requestLayout();
    }

    public void setUser(TLObject tLObject) {
        this.a.c(tLObject);
        invalidate();
    }
}
