// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.a;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ok3 extends View implements vlb {
    public final fn0 a;
    public final Paint b;
    public final RectF c;
    public final RectF d;
    public final RectF e;
    public final bi3 f;

    public ok3(Context context) {
        super(context);
        this.a = new fn0(380L, this, d53.h);
        this.b = new Paint(1);
        this.c = new RectF();
        this.d = new RectF();
        this.e = new RectF();
        this.f = new bi3(this, (byte) 8);
        updateColors();
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        gm.d3(this.f, 3000L);
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        gm.r(this.f);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f = this.a.e;
        RectF rectF = this.d;
        RectF rectF2 = this.c;
        RectF rectF3 = this.e;
        gm.X1(rectF, rectF2, f, rectF3);
        float U1 = gm.U1(f, gm.L(15.0f), 0);
        canvas.drawRoundRect(rectF3, U1, U1, this.b);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int currentActionBarHeight = a.getCurrentActionBarHeight();
        int paddingTop = getPaddingTop();
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(paddingTop + currentActionBarHeight, TLObject.FLAG_30));
        this.c.set(0.0f, 0.0f, getMeasuredWidth(), paddingTop);
        this.d.set(gm.L(12.0f), ((currentActionBarHeight / 2) + paddingTop) - gm.L(15.0f), gm.L(30.0f) + gm.L(12.0f), gm.L(30.0f) + r6);
    }

    @Override // vlb
    public final void updateColors() {
        this.b.setColor(cmb.w0(null, cmb.Xl, false));
        invalidate();
    }

    @Override // vlb
    public final void addColorKeys(HashSet hashSet) {
    }
}
