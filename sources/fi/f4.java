package fi;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.j6;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final class f4 extends FrameLayout {
    public Path a;
    public float b;
    public int c;
    public int d;
    public int e;
    public c0 f;

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        canvas.save();
        float height = (getHeight() - AndroidUtilities.dp(32.0f)) / 2.0f;
        float max = Math.max((getWidth() - this.e) - AndroidUtilities.dp(4.0f), getHeight()) * this.b;
        float dp = AndroidUtilities.dp(16.0f) + max;
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(AndroidUtilities.dp(14.0f) - max, (AndroidUtilities.dp(4.0f) + height) - max, AndroidUtilities.dp(6.0f) + this.e + max, (getHeight() - AndroidUtilities.dp(12.0f)) + max);
        Path path = this.a;
        path.rewind();
        path.addRoundRect(rectF, dp, dp, Path.Direction.CW);
        canvas.clipPath(path);
        canvas.drawColor(this.d);
        canvas.saveLayerAlpha(rectF, (int) ((1.0f - (Math.min(0.5f, this.b) / 0.5f)) * 255.0f), 31);
        canvas.translate(AndroidUtilities.dp(10.0f), height);
        c0 c0Var = this.f;
        if (c0Var != null) {
            c0Var.setDrawBackgroundDrawable(false);
            this.f.draw(canvas);
            this.f.setDrawBackgroundDrawable(true);
        }
        canvas.restore();
        canvas.translate((1.0f - this.b) * (-AndroidUtilities.dp(8.0f)), 0.0f);
        super.draw(canvas);
        canvas.restore();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i11);
        int height = getParent() instanceof View ? ((View) getParent()).getHeight() : 0;
        if (height > 0) {
            size = Math.min(size, height);
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(size, View.MeasureSpec.getMode(i11)));
    }

    public void setBotMenuButton(c0 c0Var) {
        this.f = c0Var;
        invalidate();
    }

    public void setMeasuredButtonWidth(int i10) {
        this.e = i10;
        invalidate();
    }

    public void setProgress(float f7) {
        this.b = f7;
        this.d = i0.a.d(f7, j6.w0(null, j6.cf, false), this.c);
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            getChildAt(i10).setAlpha(f7);
        }
        invalidate();
    }
}
