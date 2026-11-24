// default package

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextPaint;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class fu4 extends View {
    public final eu4 a;

    public fu4(Context context) {
        super(context);
        eu4 eu4Var = new eu4();
        this.a = eu4Var;
        eu4Var.r = this;
        eu4Var.d.p0(this);
    }

    public eu4 getDrawable() {
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
        eu4 eu4Var = this.a;
        eu4Var.d.K();
        gm.release((View) null, eu4Var.q);
        eu4Var.q = null;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int width = getWidth() - getPaddingRight();
        int height = getHeight() - getPaddingBottom();
        eu4 eu4Var = this.a;
        eu4Var.setBounds(paddingLeft, paddingTop, width, height);
        eu4Var.draw(canvas);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int size = (View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight();
        eu4 eu4Var = this.a;
        eu4Var.b(size);
        setMeasuredDimension(getPaddingRight() + getPaddingLeft() + eu4Var.t, getPaddingBottom() + getPaddingTop() + eu4Var.u);
    }

    public void setMessage(CharSequence charSequence) {
        eu4 eu4Var = this.a;
        eu4Var.m = charSequence;
        eu4Var.s = -1;
        requestLayout();
    }

    public void setUser(TLObject tLObject) {
        this.a.c(tLObject);
        invalidate();
    }
}
