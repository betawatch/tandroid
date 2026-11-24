// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class kc2 extends Drawable {
    public final /* synthetic */ byte a;
    public final Object b;
    public boolean c;
    public final Paint d;
    public final Object e;
    public final Object f;

    public kc2(Context context, int i, int i2) {
        this.a = (byte) 1;
        this.c = true;
        this.e = context.getResources().getDrawable(i);
        if (i2 < 0) {
            this.b = null;
            this.d = null;
            this.f = null;
            return;
        }
        this.b = new Path();
        Paint paint = new Paint(1);
        this.d = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-16777216);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        paint.setPathEffect(new CornerPathEffect(gm.L(1.0f)));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        Paint paint2 = new Paint(1);
        this.f = paint2;
        paint2.setStyle(Paint.Style.FILL);
        int[] iArr = cmb.q8;
        paint2.setColor(cmb.w0(null, iArr[i2 % iArr.length], false));
        paint2.setPathEffect(new CornerPathEffect(gm.L(1.0f)));
    }

    public final void d() {
        c47 c47Var;
        xc2 xc2Var;
        Rect bounds = getBounds();
        RectF rectF = (RectF) this.e;
        rectF.set(bounds.left, bounds.top, bounds.right, bounds.bottom);
        Path path = (Path) this.b;
        path.rewind();
        rc2 rc2Var = (rc2) this.f;
        int[] iArr = rc2Var.L2;
        boolean z = this.c;
        int i = iArr[z ? 1 : 0];
        if (i == 3 || i == 4) {
            path.addCircle(rectF.centerX(), rectF.centerY(), gm.L(iArr[z ? 1 : 0] == 3 ? 16.0f : 20.0f), Path.Direction.CW);
            return;
        }
        if (i != 2) {
            float L = i == 0 ? gm.L(6.0f) : 0.0f;
            path.addRoundRect(rectF, L, L, Path.Direction.CW);
            return;
        }
        k47 k47Var = rc2Var.Q5;
        boolean z2 = k47Var != null && k47Var.O3();
        for (int i2 = 0; i2 < 4; i2++) {
            if (!rc2Var.E2) {
                if (i2 == (z2 ? 3 : 2)) {
                    float[] fArr = rc2.Id;
                    int i3 = i2 << 1;
                    float L2 = gm.L(gda.U0);
                    fArr[i3 + 1] = L2;
                    fArr[i3] = L2;
                } else if (((rc2Var.C6 && rc2Var.M == null) || rc2Var.G) && (i2 == 2 || i2 == 3)) {
                    float[] fArr2 = rc2.Id;
                    int i4 = i2 << 1;
                    int i5 = i4 + 1;
                    float L3 = gm.L(rc2Var.G ? Math.min(5, gda.U0) : gda.U0);
                    fArr2[i5] = L3;
                    fArr2[i4] = L3;
                }
            }
            float[] fArr3 = rc2.Id;
            int i6 = i2 << 1;
            fArr3[i6 + 1] = 0.0f;
            fArr3[i6] = 0.0f;
        }
        if (z2 || rc2Var.K || (c47Var = rc2Var.M) != null || (c47Var != null && ((xc2Var = rc2Var.x2) == null || !xc2Var.b))) {
            path.addRoundRect(rectF, rc2.Id, Path.Direction.CW);
        } else {
            path.moveTo(rectF.left + gm.L(6.0f), rectF.top);
            path.lineTo(rectF.left + gm.L(6.0f), (rectF.bottom - gm.L(6.0f)) - gm.L(5.0f));
            RectF rectF2 = gm.P;
            rectF2.set(rectF.left + gm.L(-7.0f), rectF.bottom - gm.L(23.0f), rectF.left + gm.L(6.0f), rectF.bottom);
            path.arcTo(rectF2, 0.0f, 83.0f, false);
            float f = rectF.right;
            float[] fArr4 = rc2.Id;
            float f2 = f - (fArr4[4] * 2.0f);
            float f3 = rectF.bottom;
            rectF2.set(f2, f3 - (fArr4[5] * 2.0f), f, f3);
            path.arcTo(rectF2, 90.0f, -90.0f, false);
            path.lineTo(rectF.right, rectF.top);
            path.close();
        }
        path.close();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        byte b = this.a;
        Paint paint = this.d;
        Object obj = this.f;
        Object obj2 = this.e;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                d();
                canvas.drawPath((Path) obj3, paint);
                break;
            case 1:
                Drawable drawable = (Drawable) obj2;
                Path path = (Path) obj3;
                if (path == null) {
                    drawable.setBounds(getBounds());
                    drawable.draw(canvas);
                    break;
                } else {
                    canvas.saveLayerAlpha(getBounds().left, getBounds().top, getBounds().right, getBounds().bottom, nm7.d4);
                    drawable.setBounds(getBounds());
                    drawable.draw(canvas);
                    if (this.c) {
                        path.rewind();
                        path.moveTo(e(0.4871f), f(0.6025f));
                        path.lineTo(e(0.8974f), f(0.6025f));
                        path.lineTo(e(1.0f), f(0.7564f));
                        path.lineTo(e(0.8974f), f(0.9102f));
                        path.lineTo(e(0.4871f), f(0.9102f));
                        path.close();
                        this.c = false;
                        paint.setStrokeWidth(gm.L(3.0f));
                    }
                    canvas.drawPath(path, paint);
                    canvas.drawPath(path, (Paint) obj);
                    canvas.restore();
                    break;
                }
            default:
                Rect bounds = getBounds();
                canvas.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, nm7.d4, 31);
                Drawable drawable2 = (Drawable) obj2;
                drawable2.setBounds(bounds);
                drawable2.draw(canvas);
                float d = ((ln) obj).d(this.c);
                if (d > 0.0f) {
                    float N = gm.N(0.783f);
                    float centerX = (bounds.centerX() - gm.L(9.0f)) + N;
                    float centerY = (bounds.centerY() - gm.L(9.0f)) + N;
                    float L = (gm.L(9.0f) + bounds.centerX()) - N;
                    float L2 = (gm.L(9.0f) + bounds.centerY()) - N;
                    if (this.c) {
                        centerX = gm.R1(L, centerX, d);
                        centerY = gm.R1(L2, centerY, d);
                    } else {
                        L = gm.R1(centerX, L, d);
                        L2 = gm.R1(centerY, L2, d);
                    }
                    float f = centerX;
                    float f2 = centerY;
                    float f3 = L2;
                    float f4 = L;
                    canvas.drawLine(f, f2, f4, f3, (Paint) obj3);
                    int min = (int) (Math.min(1.0f, d * 10.0f) * 255.0f);
                    Paint paint2 = this.d;
                    paint2.setAlpha(min);
                    canvas.drawLine(f, f2, f4, f3, paint2);
                }
                canvas.restore();
                break;
        }
    }

    public final int e(float f) {
        return gm.U1(f, getBounds().left, getBounds().right);
    }

    public final int f(float f) {
        return gm.U1(f, getBounds().top, getBounds().bottom);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        switch (this.a) {
            case 1:
                return ((Drawable) this.e).getIntrinsicHeight();
            case 2:
                return gm.L(24.0f);
            default:
                return super.getIntrinsicHeight();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        switch (this.a) {
            case 1:
                return ((Drawable) this.e).getIntrinsicWidth();
            case 2:
                return gm.L(24.0f);
            default:
                return super.getIntrinsicWidth();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        switch (this.a) {
            case 0:
            default:
                return -2;
            case 1:
                return ((Drawable) this.e).getOpacity();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        switch (this.a) {
            case 0:
                break;
            case 1:
                ((Drawable) this.e).setAlpha(i);
                break;
            default:
                ((Drawable) this.e).setAlpha(i);
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i, int i2, int i3, int i4) {
        switch (this.a) {
            case 1:
                super.setBounds(i, i2, i3, i4);
                this.c = true;
                break;
            default:
                super.setBounds(i, i2, i3, i4);
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        switch (this.a) {
            case 1:
                ((Drawable) this.e).setColorFilter(colorFilter);
                break;
        }
    }

    private final void a(int i) {
    }

    private final void b(ColorFilter colorFilter) {
    }

    private final void c(ColorFilter colorFilter) {
    }

    public kc2(Context context) {
        this.a = (byte) 2;
        Paint paint = new Paint(1);
        this.d = paint;
        Paint paint2 = new Paint(1);
        this.b = paint2;
        this.f = new ln(new pg6(this, (byte) 28), 200L, d53.g, 0);
        this.e = b10.d(context, R.drawable.filled_sound_on);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setStrokeWidth(gm.N(1.566f));
        paint.setColor(-1);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        Paint.Join join = Paint.Join.ROUND;
        paint.setStrokeJoin(join);
        paint2.setStyle(style);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        paint2.setStrokeWidth(gm.N(4.5f));
        paint2.setColor(-65536);
        paint2.setStrokeCap(cap);
        paint2.setStrokeJoin(join);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public kc2(rc2 rc2Var, int i) {
        this.a = (byte) 0;
        this.f = rc2Var;
        this.c = i;
        Paint paint = new Paint(1);
        this.d = paint;
        paint.setColor(-1);
        this.e = new RectF();
        this.b = new Path();
    }
}
