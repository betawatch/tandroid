// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.a;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class dj3 extends View implements tjb {
    public final fm0 a;
    public final Paint b;
    public final RectF c;
    public final RectF d;
    public final RectF e;
    public final li3 f;

    public dj3(Context context) {
        super(context);
        this.a = new fm0(380L, this, s33.h);
        this.b = new Paint(1);
        this.c = new RectF();
        this.d = new RectF();
        this.e = new RectF();
        this.f = new li3(this, (byte) 3);
        updateColors();
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        gl.e3(this.f, 3000L);
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        gl.r(this.f);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f = this.a.e;
        RectF rectF = this.d;
        RectF rectF2 = this.c;
        RectF rectF3 = this.e;
        gl.X1(rectF, rectF2, f, rectF3);
        float U1 = gl.U1(f, gl.L(15.0f), 0);
        canvas.drawRoundRect(rectF3, U1, U1, this.b);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int currentActionBarHeight = a.getCurrentActionBarHeight();
        int paddingTop = getPaddingTop();
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(paddingTop + currentActionBarHeight, TLObject.FLAG_30));
        this.c.set(0.0f, 0.0f, getMeasuredWidth(), paddingTop);
        this.d.set(gl.L(12.0f), ((currentActionBarHeight / 2) + paddingTop) - gl.L(15.0f), gl.L(30.0f) + gl.L(12.0f), gl.L(30.0f) + r6);
    }

    @Override // tjb
    public final void updateColors() {
        this.b.setColor(bkb.w0(null, bkb.Xl, false));
        invalidate();
    }

    @Override // tjb
    public final void addColorKeys(HashSet hashSet) {
    }
}
