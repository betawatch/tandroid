// default package

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class apb {
    public final Paint a;
    public final Paint b;
    public final Paint c;
    public Drawable d;
    public Drawable e;
    public final /* synthetic */ bpb f;

    public apb(bpb bpbVar) {
        this.f = bpbVar;
        Paint paint = new Paint(1);
        this.a = paint;
        this.b = new Paint(1);
        this.c = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(gm.L(2.0f));
    }

    public final void a(Canvas canvas, float f) {
        float f2;
        float f3;
        float f4;
        StaticLayout noThemeStaticLayout;
        float f5;
        float f6;
        float f7;
        byte b;
        bpb bpbVar = this.f;
        ImageReceiver imageReceiver = bpbVar.Q;
        float f8 = bpbVar.e;
        m37 m37Var = bpbVar.T;
        m37 m37Var2 = bpbVar.S;
        float f9 = bpbVar.d;
        float f10 = bpbVar.c;
        byte b2 = bpbVar.L;
        RectF rectF = bpbVar.w;
        if (bpbVar.a0 || bpbVar.E != null) {
            hf2 hf2Var = bpbVar.H;
            f2 = 255.0f;
            int v0 = bpbVar.H.a.l() ? cmb.v0(cmb.Ei, bpbVar.y) : ((sz3) hf2Var.a.f.get(hf2Var.c)).j;
            Paint paint = this.a;
            paint.setColor(v0);
            paint.setAlpha((int) (bpbVar.N * f * 255.0f));
            f3 = 4.0f;
            f4 = 0.5f;
            float A = td4.A(1.0f, bpbVar.N, gm.L(4.0f), paint.getStrokeWidth() * 0.5f);
            rectF.set(A, A, bpbVar.getWidth() - A, bpbVar.getHeight() - A);
            float f11 = bpbVar.a;
            canvas.drawRoundRect(rectF, f11, f11, paint);
        } else {
            f4 = 0.5f;
            f2 = 255.0f;
            f3 = 4.0f;
        }
        int i = (int) (f * f2);
        Paint paint2 = this.b;
        paint2.setAlpha(i);
        Paint paint3 = this.c;
        paint3.setAlpha(i);
        rectF.set(f10, f10, bpbVar.getWidth() - f10, bpbVar.getHeight() - f10);
        tz3 tz3Var = bpbVar.H.a;
        if (tz3Var != null) {
            if (!tz3Var.l()) {
                if (b2 != 4) {
                    if (b2 == 2) {
                        bpbVar.H.getClass();
                        return;
                    }
                    float L = gm.L(8.0f) + f10;
                    float L2 = gm.L(b2 == 3 ? 5.0f : 22.0f) + f10;
                    if (b2 == 0 || b2 == 3) {
                        f5 = f8;
                        rectF.set(L2, L, ((b2 == 3 ? 1.2f : 1.0f) * f5) + L2, L + f9);
                    } else {
                        L = 0.12f * bpbVar.getMeasuredHeight();
                        f5 = f8;
                        rectF.set(bpbVar.getMeasuredWidth() - (bpbVar.getMeasuredWidth() * 0.65f), L, bpbVar.getMeasuredWidth() - (bpbVar.getMeasuredWidth() * 0.1f), bpbVar.getMeasuredHeight() * 0.32f);
                    }
                    if (b2 == 3) {
                        paint2 = paint3;
                    }
                    if (b2 == 0 || b2 == 3) {
                        f6 = f9;
                        f7 = 2.0f;
                        canvas.drawRoundRect(rectF, rectF.height() * f4, rectF.height() * f4, paint2);
                    } else {
                        f7 = 2.0f;
                        f6 = f9;
                        m37Var2.setBounds((int) rectF.left, ((int) rectF.top) - gm.L(2.0f), gm.L(f3) + ((int) rectF.right), gm.L(2.0f) + ((int) rectF.bottom));
                        m37Var2.Q = (int) (rectF.height() * f4);
                        m37Var2.c(canvas, paint2);
                    }
                    if (b2 == 0 || b2 == 3) {
                        float L3 = f10 + gm.L(5.0f);
                        float L4 = f6 + gm.L(f3) + L;
                        b = 3;
                        rectF.set(L3, L4, (f5 * (b2 == 3 ? 0.8f : 1.0f)) + L3, L4 + f6);
                    } else {
                        rectF.set(bpbVar.getMeasuredWidth() * 0.1f, bpbVar.getMeasuredHeight() * 0.35f, bpbVar.getMeasuredWidth() * 0.65f, bpbVar.getMeasuredHeight() * 0.55f);
                        b = 3;
                    }
                    if (b2 != 0 && b2 != b) {
                        m37Var.setBounds(((int) rectF.left) - gm.L(f3), ((int) rectF.top) - gm.L(f7), (int) rectF.right, gm.L(f7) + ((int) rectF.bottom));
                        m37Var.Q = (int) (rectF.height() * f4);
                        m37Var.c(canvas, paint3);
                        return;
                    }
                    canvas.drawRoundRect(rectF, rectF.height() * f4, rectF.height() * f4, paint3);
                    if (bpbVar.V != 0) {
                        float centerY = rectF.centerY();
                        float height = (rectF.height() / f7) + rectF.left;
                        float height2 = rectF.right - (rectF.height() / f7);
                        rectF.set(height - gm.L(8.0f), centerY - gm.L(8.0f), height + gm.L(8.0f), gm.L(8.0f) + centerY);
                        imageReceiver.k0(rectF);
                        imageReceiver.h(canvas, null);
                        Drawable drawable = this.e;
                        if (drawable == null) {
                            drawable = bpbVar.getContext().getDrawable(R.drawable.mini_replace_16).mutate();
                            this.e = drawable;
                        }
                        int i2 = (int) height2;
                        int i3 = (int) centerY;
                        drawable.setBounds(i2 - gm.L(8.0f), i3 - gm.L(8.0f), gm.L(8.0f) + i2, gm.L(8.0f) + i3);
                        this.e.draw(canvas);
                        return;
                    }
                    return;
                }
                return;
            }
            bpbVar.H.a.getClass();
        }
        if (bpbVar.U == null) {
            float f12 = bpbVar.b;
            canvas.drawRoundRect(rectF, f12, f12, bpbVar.s);
            canvas.save();
            noThemeStaticLayout = bpbVar.getNoThemeStaticLayout();
            canvas.translate((bpbVar.getWidth() - noThemeStaticLayout.getWidth()) * f4, gm.L(18.0f));
            noThemeStaticLayout.draw(canvas);
            canvas.restore();
        }
    }

    public final void b(Canvas canvas, float f) {
        tz3 tz3Var;
        int[] iArr;
        int i;
        bpb bpbVar = this.f;
        float f2 = bpbVar.b;
        Paint paint = bpbVar.r;
        if (this.d == null) {
            hf2 hf2Var = bpbVar.H;
            if (hf2Var == null || (tz3Var = hf2Var.a) == null || !tz3Var.l() || bpbVar.O == null) {
                canvas.drawRoundRect(bpbVar.w, f2, f2, bpbVar.s);
                return;
            }
            return;
        }
        canvas.save();
        canvas.clipPath(bpbVar.x);
        Drawable drawable = this.d;
        if (drawable instanceof BitmapDrawable) {
            float intrinsicWidth = drawable.getIntrinsicWidth();
            float intrinsicHeight = this.d.getIntrinsicHeight();
            if (intrinsicWidth / intrinsicHeight > bpbVar.getWidth() / bpbVar.getHeight()) {
                int width = (int) ((bpbVar.getWidth() * intrinsicHeight) / intrinsicWidth);
                int width2 = (width - bpbVar.getWidth()) / 2;
                this.d.setBounds(width2, 0, width + width2, bpbVar.getHeight());
            } else {
                int height = (int) ((bpbVar.getHeight() * intrinsicHeight) / intrinsicWidth);
                int height2 = (bpbVar.getHeight() - height) / 2;
                this.d.setBounds(0, height2, bpbVar.getWidth(), height + height2);
            }
        } else {
            drawable.setBounds(0, 0, bpbVar.getWidth(), bpbVar.getHeight());
        }
        this.d.setAlpha((int) (255.0f * f));
        this.d.draw(canvas);
        Drawable drawable2 = this.d;
        if ((drawable2 instanceof ColorDrawable) || ((drawable2 instanceof ah7) && (i = (iArr = ((ah7) drawable2).a)[0]) == iArr[1] && i == iArr[2] && i == iArr[3])) {
            int alpha = paint.getAlpha();
            paint.setAlpha((int) (alpha * f));
            float f3 = bpbVar.c;
            RectF rectF = gm.P;
            rectF.set(f3, f3, bpbVar.getWidth() - f3, bpbVar.getHeight() - f3);
            canvas.drawRoundRect(rectF, f2, f2, paint);
            paint.setAlpha(alpha);
        }
        canvas.restore();
    }
}
