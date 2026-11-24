// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class cbb extends View {
    public static final /* synthetic */ int h = 0;
    public String a;
    public Drawable b;
    public boolean c;
    public int d;
    public final lm e;
    public final /* synthetic */ dbb f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cbb(dbb dbbVar, Context context) {
        super(context);
        this.f = dbbVar;
        this.d = 0;
        this.e = new lm(350L, this, new OvershootInterpolator(5.0f));
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float e = ((1.0f - this.e.e(false, isPressed() ? 1.0f : 0.0f)) * 0.2f) + 0.8f;
        if (this.b != null) {
            int width = getWidth() / 2;
            int paddingTop = (getPaddingTop() + (getHeight() - getPaddingBottom())) / 2;
            this.b.setBounds(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
            canvas.scale(e, e, width, paddingTop);
            Drawable drawable = this.b;
            if (drawable instanceof vl) {
                ((vl) drawable).p(System.currentTimeMillis());
            }
            this.b.draw(canvas);
        }
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable drawable = this.b;
        if (drawable instanceof vl) {
            ((vl) drawable).b(this);
        }
        this.c = true;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Drawable drawable = this.b;
        if (drawable instanceof vl) {
            ((vl) drawable).o(this);
        }
        this.c = false;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setPadding(gl.L(3.0f), gl.L((this.d == 0 ? 0.0f : 6.66f) + 3.0f), gl.L(3.0f), gl.L((this.d != 0 ? 0.0f : 6.66f) + 3.0f));
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(gl.L(44.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gl.L(52.0f), TLObject.FLAG_30));
    }

    public void setDirection(int i) {
        this.d = i;
        invalidate();
    }

    public void setImageDrawable(Drawable drawable) {
        Drawable drawable2 = this.b;
        if (drawable2 instanceof vl) {
            ((vl) drawable2).o(this);
        }
        this.b = drawable;
        if ((drawable instanceof vl) && this.c) {
            ((vl) drawable).b(this);
        }
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        super.setPressed(z);
        invalidate();
    }
}
