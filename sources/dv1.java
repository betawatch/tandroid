// default package

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class dv1 extends FrameLayout implements snb {
    public Path a;
    public float b;
    public int c;
    public boolean d;
    public int e;
    public int f;
    public View h;
    public ep0 n;

    @Override // snb
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(aob.Uf));
        hashSet.add(Integer.valueOf(aob.Fi));
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        canvas.save();
        float height = (getHeight() - hl.L(32.0f)) / 2.0f;
        float max = Math.max((getWidth() - this.f) - hl.L(4.0f), getHeight()) * this.b;
        float L = hl.L(16.0f) + max;
        RectF rectF = hl.P;
        rectF.set(hl.L(14.0f) - max, (hl.L(4.0f) + height) - max, hl.L(6.0f) + this.f + max, (getHeight() - hl.L(12.0f)) + max);
        Path path = this.a;
        path.rewind();
        path.addRoundRect(rectF, L, L, Path.Direction.CW);
        canvas.clipPath(path);
        canvas.drawColor(this.e);
        canvas.saveLayerAlpha(rectF, (int) ((1.0f - (Math.min(0.5f, this.b) / 0.5f)) * 255.0f), 31);
        canvas.translate(hl.L(10.0f), height);
        ep0 ep0Var = this.n;
        if (ep0Var != null) {
            ep0Var.setDrawBackgroundDrawable(false);
            this.n.draw(canvas);
            this.n.setDrawBackgroundDrawable(true);
        }
        canvas.restore();
        canvas.translate((1.0f - this.b) * (-hl.L(8.0f)), 0.0f);
        super.draw(canvas);
        canvas.restore();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i2);
        int height = getParent() instanceof View ? ((View) getParent()).getHeight() : 0;
        if (height > 0) {
            size = Math.min(size, height);
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(size, View.MeasureSpec.getMode(i2)));
    }

    public void setBotMenuButton(ep0 ep0Var) {
        this.n = ep0Var;
        invalidate();
    }

    public void setMeasuredButtonWidth(int i) {
        this.f = i;
        invalidate();
    }

    public void setProgress(float f) {
        this.b = f;
        this.e = vm2.f(f, aob.w0(null, aob.Uf, false), this.c);
        for (int i = 0; i < getChildCount(); i++) {
            getChildAt(i).setAlpha(f);
        }
        invalidate();
    }

    @Override // snb
    public final void updateColors() {
        try {
            if (this.d) {
                this.c = aob.w0(null, aob.Fi, false);
            }
            if (this.e != 0) {
                this.e = vm2.f(this.b, aob.w0(null, aob.Uf, false), this.c);
                invalidate();
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }
}
