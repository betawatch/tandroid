// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final class dw3 extends View {
    public final RectF E;
    public final RectF F;
    public float G;
    public av3 H;
    public int I;
    public final TextPaint a;
    public final Paint b;
    public StaticLayout c;
    public float d;
    public float e;
    public StaticLayout f;
    public float h;
    public float n;
    public StaticLayout r;
    public float s;
    public float w;
    public final RectF x;
    public final RectF y;

    public dw3(Context context) {
        super(context);
        this.a = new TextPaint(1);
        this.b = new Paint(1);
        this.x = new RectF();
        this.y = new RectF();
        this.E = new RectF();
        this.F = new RectF();
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.drawColor(-14737633);
        Paint paint = this.b;
        paint.setColor(-13224394);
        float f = this.G;
        int i = (int) f;
        RectF rectF = this.E;
        RectF rectF2 = this.y;
        RectF rectF3 = this.x;
        RectF rectF4 = i <= 0 ? rectF3 : i == 1 ? rectF2 : rectF;
        int ceil = (int) Math.ceil(f);
        RectF rectF5 = ceil <= 0 ? rectF3 : ceil == 1 ? rectF2 : rectF;
        float f2 = this.G;
        RectF rectF6 = this.F;
        gl.X1(rectF4, rectF5, f2 - ((int) f2), rectF6);
        canvas.drawRoundRect(rectF6, gl.L(20.0f), gl.L(20.0f), paint);
        StaticLayout staticLayout = this.c;
        TextPaint textPaint = this.a;
        if (staticLayout != null) {
            canvas.save();
            canvas.translate((rectF3.left + gl.L(12.0f)) - this.e, oo1.z(rectF3.height(), this.c.getHeight(), 2.0f, rectF3.top));
            textPaint.setColor(bm2.f(Utilities.i(1.0f - Math.abs(this.G - 0.0f), 1.0f, 0.0f), -8158333, -1));
            this.c.draw(canvas);
            canvas.restore();
        }
        if (this.f != null) {
            canvas.save();
            canvas.translate((rectF2.left + gl.L(12.0f)) - this.n, oo1.z(rectF2.height(), this.f.getHeight(), 2.0f, rectF2.top));
            textPaint.setColor(bm2.f(Utilities.i(1.0f - Math.abs(this.G - 1.0f), 1.0f, 0.0f), -8158333, -1));
            this.f.draw(canvas);
            canvas.restore();
        }
        if (this.r != null) {
            canvas.save();
            canvas.translate((rectF.left + gl.L(12.0f)) - this.w, oo1.z(rectF.height(), this.r.getHeight(), 2.0f, rectF.top));
            textPaint.setColor(bm2.f(Utilities.i(1.0f - Math.abs(this.G - 2.0f), 1.0f, 0.0f), -8158333, -1));
            this.r.draw(canvas);
            canvas.restore();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(View.MeasureSpec.getSize(i), gl.L(40.0f) + gl.n);
        if (getMeasuredWidth() != this.I || this.c == null) {
            float L = gl.L(14.0f);
            TextPaint textPaint = this.a;
            textPaint.setTextSize(L);
            textPaint.setTypeface(gl.o());
            String N0 = k96.N0("Emoji");
            int measuredWidth = getMeasuredWidth();
            Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
            StaticLayout staticLayout = new StaticLayout(N0, textPaint, measuredWidth, alignment, 1.0f, 0.0f, false);
            this.c = staticLayout;
            this.d = staticLayout.getLineCount() >= 1 ? this.c.getLineWidth(0) : 0.0f;
            this.e = this.c.getLineCount() >= 1 ? this.c.getLineLeft(0) : 0.0f;
            StaticLayout staticLayout2 = new StaticLayout(k96.N0("AccDescrStickers"), textPaint, getMeasuredWidth(), alignment, 1.0f, 0.0f, false);
            this.f = staticLayout2;
            this.h = staticLayout2.getLineCount() >= 1 ? this.f.getLineWidth(0) : 0.0f;
            this.n = this.f.getLineCount() >= 1 ? this.f.getLineLeft(0) : 0.0f;
            StaticLayout staticLayout3 = new StaticLayout(k96.M0(2131754879, null), textPaint, getMeasuredWidth(), alignment, 1.0f, 0.0f, false);
            this.r = staticLayout3;
            this.s = staticLayout3.getLineCount() >= 1 ? this.r.getLineWidth(0) : 0.0f;
            this.w = this.r.getLineCount() >= 1 ? this.r.getLineLeft(0) : 0.0f;
            float L2 = gl.L(14.0f) / 2.0f;
            float L3 = gl.L(66.0f) / 2.0f;
            float measuredWidth2 = (getMeasuredWidth() - ((((((gl.L(12.0f) + this.d) + gl.L(36.0f)) + this.h) + gl.L(36.0f)) + this.s) + gl.L(12.0f))) / 2.0f;
            this.x.set(measuredWidth2, L2, this.d + measuredWidth2 + gl.L(24.0f), L3);
            float L4 = this.d + gl.L(36.0f) + measuredWidth2;
            this.y.set(L4, L2, this.h + L4 + gl.L(24.0f), L3);
            float L5 = this.h + gl.L(36.0f) + L4;
            this.E.set(L5, L2, this.s + L5 + gl.L(24.0f), L3);
            gl.L(36.0f);
        }
        this.I = getMeasuredWidth();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0) {
            if (motionEvent.getAction() != 1 || this.H == null) {
                return super.onTouchEvent(motionEvent);
            }
            if (this.x.contains(motionEvent.getX(), motionEvent.getY())) {
                this.H.a(0);
                return true;
            }
            if (this.y.contains(motionEvent.getX(), motionEvent.getY())) {
                this.H.a(1);
                return true;
            }
            if (this.E.contains(motionEvent.getX(), motionEvent.getY())) {
                this.H.a(2);
            }
        }
        return true;
    }
}
