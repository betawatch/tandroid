package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.Random;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class b5 extends View {
    public final dc.g[] E;
    public Bitmap F;
    public SweepGradient G;
    public float H;
    public float I;
    public final Paint a;
    public final Paint b;
    public final Paint c;
    public final Paint d;
    public final Paint e;
    public final Paint f;
    public final Paint h;
    public final Paint n;
    public final Paint r;
    public final RectF s;
    public final RectF v;
    public final Matrix w;
    public Drawable x;
    public final Path y;

    public b5(Context context, int i10, int i11) {
        super(context);
        this.a = new Paint(1);
        this.b = new Paint(1);
        this.c = new Paint(3);
        this.d = new Paint(3);
        this.e = new Paint(1);
        this.f = new Paint(1);
        this.h = new Paint(1);
        this.n = new Paint(1);
        this.r = new Paint(1);
        this.s = new RectF();
        this.v = new RectF();
        this.w = new Matrix();
        this.y = new Path();
        Random random = new Random(3622097293706218323L);
        dc.g[] gVarArr = new dc.g[16];
        for (int i12 = 0; i12 < 16; i12++) {
            dc.g gVar = new dc.g();
            gVar.a = (random.nextFloat() * 300.0f) + 18.0f;
            gVar.b = (random.nextFloat() * 173.0f) + 16.0f;
            gVar.c = (random.nextFloat() * 3.5f) + 1.5f;
            float nextFloat = random.nextFloat() * 6.2831855f;
            float nextFloat2 = (random.nextFloat() * 0.48f) + 0.16f;
            double d = nextFloat;
            float cos = (float) Math.cos(d);
            float sin = (float) Math.sin(d);
            gVar.d = cos * nextFloat2;
            gVar.e = nextFloat2 * sin;
            float f7 = -sin;
            gVar.h = f7;
            gVar.i = cos;
            gVar.f = f7 * 0.08f;
            gVar.g = cos * 0.08f;
            gVarArr[i12] = gVar;
        }
        this.E = gVarArr;
        Paint paint = this.c;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        paint.setColorFilter(new PorterDuffColorFilter(-16748084, mode));
        this.d.setColorFilter(new PorterDuffColorFilter(Color.argb(15, 255, 255, 255), mode));
        this.n.setColor(-9208960);
        this.r.setColor(-1);
        this.h.setColor(687865856);
        Paint paint2 = this.h;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        this.h.setStrokeWidth(1.0f);
        this.a.setColor(603979776);
        this.a.setStyle(style);
        this.a.setStrokeWidth(AndroidUtilities.dp(1.0f));
        this.a.setMaskFilter(new BlurMaskFilter(AndroidUtilities.dp(1.0f), BlurMaskFilter.Blur.NORMAL));
        float f10 = 336.0f - i11;
        this.v.set(f10 - 50.0f, 73.0f, f10, 111.0f);
        Drawable drawable = getContext().getDrawable(i10);
        this.x = drawable;
        if (drawable != null) {
            this.x = drawable.mutate();
        }
        invalidate();
    }

    public static int b(float f7) {
        float c10 = d5.c((f7 - 0.78f) / 0.18f, 0.0f, 1.0f);
        float B = com.google.android.gms.internal.vision.e2.B(c10, 2.0f, 3.0f, c10 * c10);
        return Color.argb(Math.round(f7 * 145.0f), Math.round((120.0f * B) + 135.0f), Math.round((B * 16.0f) + 239.0f), 255);
    }

    public static float c(float f7, float f10, float f11, float f12, float f13) {
        float f14 = f7 * f7;
        float f15 = f10 * f10;
        float sqrt = (float) Math.sqrt(Math.max(0.0f, (1.0f - f14) - f15));
        return (float) Math.pow(Math.max(0.0f, ((sqrt * f13) + ((f10 * f12) + (f7 * f11))) / ((float) Math.sqrt((sqrt * sqrt) + (f14 + f15)))), 6.0d);
    }

    public final void a(Canvas canvas, int i10) {
        Drawable drawable = this.x;
        if (drawable == null) {
            return;
        }
        drawable.setTint(i10);
        Drawable drawable2 = this.x;
        RectF rectF = this.v;
        drawable2.setBounds((int) (rectF.left + 13.0f), (int) (rectF.top + 7.0f), (int) (rectF.right - 13.0f), (int) (rectF.bottom - 7.0f));
        this.x.draw(canvas);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Paint paint;
        dc.g[] gVarArr;
        int i10;
        super.onDraw(canvas);
        float width = getWidth();
        float height = getHeight();
        RectF rectF = this.s;
        rectF.set(0.0f, 0.0f, width, height);
        Path path = new Path();
        w7.g6.a(path, getWidth(), getHeight());
        int save = canvas.save();
        canvas.clipPath(path);
        RectF rectF2 = new RectF(rectF);
        rectF2.inset(AndroidUtilities.dp(0.5f), AndroidUtilities.dp(0.5f));
        int save2 = canvas.save();
        float f7 = 1.0f;
        canvas.translate(0.0f, -AndroidUtilities.dp(1.0f));
        canvas.drawRoundRect(rectF2, Math.max(0.0f, ((getWidth() * 0.15f) / 2.0f) - AndroidUtilities.dp(0.5f)), Math.max(0.0f, ((getHeight() * 0.15f) / 1.212122f) - AndroidUtilities.dp(0.5f)), this.a);
        canvas.restoreToCount(save2);
        canvas.restoreToCount(save);
        int save3 = canvas.save();
        canvas.clipPath(path);
        float sin = (((float) Math.sin(Math.toRadians(this.I))) * 0.72f) + 0.08f;
        float f10 = (-((float) Math.sin(Math.toRadians(this.H)))) * 0.72f;
        float f11 = 205.0f;
        float sqrt = 1.0f / ((float) Math.sqrt(sc.v.d(f10, f10, sin * sin, 1.0f)));
        float f12 = sin * sqrt;
        float f13 = f10 * sqrt;
        double radians = (float) Math.toRadians(((this.I * 2.0f) + 20.99f) - (this.H * 1.25f));
        float cos = (float) Math.cos(radians);
        float sin2 = (float) Math.sin(radians);
        int save4 = canvas.save();
        canvas.scale(getWidth() / 336.0f, getHeight() / 205.0f);
        dc.g[] gVarArr2 = this.E;
        int length = gVarArr2.length;
        int i11 = 0;
        while (true) {
            paint = this.b;
            if (i11 >= length) {
                break;
            }
            float f14 = f11;
            dc.g gVar = gVarArr2[i11];
            float f15 = f7;
            float f16 = gVar.a - 168.0f;
            int i12 = i11;
            float f17 = cos;
            float c10 = d5.c((Math.abs((((gVar.b - 102.5f) * sin2) + (f16 * f17)) * (f15 / Math.max(0.001f, (float) Math.sqrt((r3 * r3) + (f16 * f16))))) - 0.38f) / 0.34000003f, 0.0f, f15);
            float f18 = sin2;
            float B = com.google.android.gms.internal.vision.e2.B(c10, 2.0f, 3.0f, c10 * c10);
            float c11 = c(gVar.d + gVar.f, gVar.e + gVar.g, f12, f13, sqrt) * B;
            float c12 = c(gVar.d - gVar.f, gVar.e - gVar.g, f12, f13, sqrt) * B;
            if (Math.max(c11, c12) < 0.015f) {
                gVarArr = gVarArr2;
                i10 = length;
            } else {
                int b10 = b(c11);
                int b11 = b(c12);
                float f19 = gVar.h;
                float f20 = gVar.c;
                float f21 = f19 * f20;
                float f22 = gVar.i * f20;
                float f23 = gVar.a;
                float f24 = gVar.b;
                paint.setShader(new LinearGradient(f23 - f21, f24 - f22, f23 + f21, f24 + f22, b10, b11, Shader.TileMode.CLAMP));
                float f25 = gVar.a;
                float f26 = gVar.b;
                float f27 = gVar.c;
                float f28 = f27 * 0.15f;
                Path path2 = this.y;
                path2.rewind();
                path2.moveTo(f25 - f27, f26);
                float f29 = f25 - f28;
                gVarArr = gVarArr2;
                float f30 = f26 - f28;
                path2.lineTo(f29, f30);
                i10 = length;
                path2.lineTo(f25, f26 - f27);
                float f31 = f25 + f28;
                path2.lineTo(f31, f30);
                path2.lineTo(f25 + f27, f26);
                float f32 = f28 + f26;
                path2.lineTo(f31, f32);
                path2.lineTo(f25, f26 + f27);
                path2.lineTo(f29, f32);
                path2.close();
                canvas.drawPath(path2, paint);
            }
            i11 = i12 + 1;
            f11 = f14;
            cos = f17;
            sin2 = f18;
            gVarArr2 = gVarArr;
            length = i10;
            f7 = 1.0f;
        }
        float f33 = f11;
        paint.setShader(null);
        canvas.restoreToCount(save4);
        canvas.restoreToCount(save3);
        Bitmap bitmap = this.F;
        if (bitmap != null && !bitmap.isRecycled()) {
            int save5 = canvas.save();
            canvas.clipRect(rectF);
            canvas.translate(0.0f, AndroidUtilities.dp(1.0f));
            canvas.drawBitmap(this.F, (Rect) null, rectF, this.d);
            canvas.restoreToCount(save5);
            canvas.drawBitmap(this.F, (Rect) null, rectF, this.c);
        }
        float width2 = getWidth() / 336.0f;
        float height2 = getHeight() / f33;
        int save6 = canvas.save();
        canvas.scale(width2, height2);
        Path path3 = new Path();
        Path.Direction direction = Path.Direction.CW;
        RectF rectF3 = this.v;
        path3.addRoundRect(rectF3, 9.0f, 9.0f, direction);
        canvas.clipPath(path3);
        canvas.drawRect(rectF3, this.e);
        canvas.drawRect(rectF3, this.f);
        canvas.restoreToCount(save6);
        int save7 = canvas.save();
        canvas.scale(width2, height2);
        RectF rectF4 = new RectF(rectF3);
        rectF4.inset(-0.5f, -0.5f);
        canvas.drawRoundRect(rectF4, 9.5f, 9.5f, this.h);
        canvas.restoreToCount(save7);
        int save8 = canvas.save();
        canvas.scale(width2, height2);
        canvas.translate(0.0f, 1.0f);
        a(canvas, this.r.getColor());
        canvas.restoreToCount(save8);
        int save9 = canvas.save();
        canvas.scale(width2, height2);
        a(canvas, this.n.getColor());
        canvas.restoreToCount(save9);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        RectF rectF = this.v;
        this.e.setShader(new LinearGradient(rectF.left + 5.2f, rectF.top + 3.4f, rectF.right - 4.6f, rectF.bottom - 4.0f, new int[]{-520225025, -524567104}, new float[]{0.0799f, 0.922f}, Shader.TileMode.CLAMP));
        float centerX = rectF.centerX();
        float centerY = rectF.centerY();
        this.G = new SweepGradient(centerX, centerY, new int[]{16777215, 16777215, 1560281087, 16777215, 0, 520093696, 0, 0}, new float[]{0.0f, 0.06f, 0.25f, 0.44f, 0.56f, 0.75f, 0.94f, 1.0f});
        Matrix matrix = this.w;
        matrix.setRotate(90.0f, centerX, centerY);
        this.G.setLocalMatrix(matrix);
        this.f.setShader(this.G);
    }
}
