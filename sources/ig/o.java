package ig;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.zs;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class o extends View {
    public final Paint a;
    public final Paint b;
    public int c;
    public int d;
    public final /* synthetic */ u e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(u uVar, Context context) {
        super(context);
        this.e = uVar;
        this.a = new Paint(1);
        Paint paint = new Paint(1);
        this.b = paint;
        paint.setColor(-1);
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setStrokeWidth(org.telegram.messenger.i0.L(3.0f));
    }

    public final void a() {
        int argb;
        int argb2;
        int i10 = this.c;
        u uVar = this.e;
        if (i10 == 1) {
            argb = Color.argb(zs.e4, Color.red(uVar.m1), 0, Color.blue(uVar.m1));
            argb2 = Color.argb(zs.e4, Color.red(uVar.m1), zs.e4, Color.blue(uVar.m1));
        } else if (i10 != 2) {
            argb = Color.argb(zs.e4, 0, Color.green(uVar.m1), Color.blue(uVar.m1));
            argb2 = Color.argb(zs.e4, zs.e4, Color.green(uVar.m1), Color.blue(uVar.m1));
        } else {
            argb = Color.argb(zs.e4, Color.red(uVar.m1), Color.green(uVar.m1), 0);
            argb2 = Color.argb(zs.e4, Color.red(uVar.m1), Color.green(uVar.m1), zs.e4);
        }
        this.a.setShader(new LinearGradient(0.0f, 0.0f, getWidth(), 0.0f, new int[]{argb, argb2}, (float[]) null, Shader.TileMode.CLAMP));
    }

    public final void b(float f7) {
        float L = org.telegram.messenger.i0.L(6.0f);
        float a2 = w7.u.a(((f7 - L) + (org.telegram.messenger.i0.L(13.0f) - (this.b.getStrokeWidth() / 2.0f))) / (getWidth() - (L * 2.0f)), 0.0f, 1.0f);
        int i10 = this.c;
        u uVar = this.e;
        uVar.I0(i0.b.o(i10 != 1 ? i10 != 2 ? Color.argb(zs.e4, (int) (a2 * 255.0f), Color.green(uVar.m1), Color.blue(uVar.m1)) : Color.argb(zs.e4, Color.red(uVar.m1), Color.green(uVar.m1), (int) (a2 * 255.0f)) : Color.argb(zs.e4, Color.red(uVar.m1), (int) (a2 * 255.0f), Color.blue(uVar.m1)), Color.alpha(uVar.m1)), 4);
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float height = getHeight() / 2.0f;
        float L = org.telegram.messenger.i0.L(6.0f);
        RectF rectF = org.telegram.messenger.i0.P;
        rectF.set(L, height - L, getWidth() - L, height + L);
        canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(16.0f), this.a);
        int i10 = this.c;
        u uVar = this.e;
        float red = (i10 != 1 ? i10 != 2 ? Color.red(uVar.m1) : Color.blue(uVar.m1) : Color.green(uVar.m1)) / 255.0f;
        float L2 = org.telegram.messenger.i0.L(13.0f);
        Paint paint = this.b;
        float strokeWidth = L2 - (paint.getStrokeWidth() / 2.0f);
        float max = Math.max(L + strokeWidth, (((getWidth() - (2.0f * L)) * red) + L) - strokeWidth);
        canvas.drawCircle(max, height, L2, paint);
        jg.n1.A1(max, height, strokeWidth, this.d, canvas);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        a();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                b(motionEvent.getX());
                getParent().requestDisallowInterceptTouchEvent(false);
            } else if (actionMasked != 2) {
                if (actionMasked == 3) {
                    getParent().requestDisallowInterceptTouchEvent(false);
                }
            }
            return true;
        }
        getParent().requestDisallowInterceptTouchEvent(true);
        b(motionEvent.getX());
        return true;
    }
}
