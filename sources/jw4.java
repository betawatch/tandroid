// default package

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextPaint;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class jw4 extends View {
    public final iw4 a;

    public jw4(Context context) {
        super(context);
        iw4 iw4Var = new iw4();
        this.a = iw4Var;
        iw4Var.r = this;
        iw4Var.d.p0(this);
    }

    public iw4 getDrawable() {
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
        iw4 iw4Var = this.a;
        iw4Var.d.K();
        hm.release((View) null, iw4Var.q);
        iw4Var.q = null;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int width = getWidth() - getPaddingRight();
        int height = getHeight() - getPaddingBottom();
        iw4 iw4Var = this.a;
        iw4Var.setBounds(paddingLeft, paddingTop, width, height);
        iw4Var.draw(canvas);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int size = (View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight();
        iw4 iw4Var = this.a;
        iw4Var.b(size);
        setMeasuredDimension(getPaddingRight() + getPaddingLeft() + iw4Var.t, getPaddingBottom() + getPaddingTop() + iw4Var.u);
    }

    public void setMessage(CharSequence charSequence) {
        iw4 iw4Var = this.a;
        iw4Var.m = charSequence;
        iw4Var.s = -1;
        requestLayout();
    }

    public void setUser(TLObject tLObject) {
        this.a.c(tLObject);
        invalidate();
    }
}
