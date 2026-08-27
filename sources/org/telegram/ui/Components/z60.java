package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class z60 extends View {
    public final Bitmap a;
    public final Paint b;
    public Bitmap c;
    public final Paint d;
    public final float e;
    public final float f;
    public final int h;
    public final Path n;
    public final RectF r;
    public float s;
    public float v;
    public float w;
    public final /* synthetic */ b70 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z60(b70 b70Var, Context context) {
        super(context);
        float f10;
        this.x = b70Var;
        this.n = new Path();
        this.r = new RectF();
        View view = b70Var.f;
        Rect rect = b70Var.z;
        if (view == null || !(view.getParent() instanceof View)) {
            this.e = 0.0f;
            this.f = 0.0f;
        } else {
            this.e = view.getY() + ((View) view.getParent()).getY();
            if (b70Var.L) {
                f10 = Math.min(AndroidUtilities.dp(68.0f), Math.max(0.0f, view.getY() + ((View) view.getParent()).getY() + view.getHeight()));
            } else {
                f10 = 0.0f;
            }
            this.f = f10;
        }
        this.h = i0.b.k(0, b70Var.s);
        if (b70Var.t && (view instanceof org.telegram.ui.Cells.sa) && (b70Var.c instanceof ProfileActivity)) {
            this.b = new Paint(3);
            Bitmap createBitmap = Bitmap.createBitmap(rect.width() + view.getWidth(), rect.height() + view.getHeight(), Bitmap.Config.ARGB_8888);
            this.a = createBitmap;
            Canvas canvas = new Canvas(createBitmap);
            canvas.translate(rect.left, rect.top);
            view.draw(canvas);
        } else {
            this.b = null;
            this.a = null;
        }
        if (b70Var.u || b70Var.v) {
            this.d = new Paint(3);
            view.setAlpha(0.0f);
            ViewGroup viewGroup = b70Var.b;
            d dVar = new d(this, 17);
            if (viewGroup == null) {
                ol0.d(dVar);
            } else {
                int i10 = ol0.K;
                AndroidUtilities.makeGlobalBlurBitmap(new org.telegram.ui.df(22, viewGroup, dVar), 15.0f);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f10;
        char c10;
        float width;
        int height;
        float f11;
        Canvas canvas2 = canvas;
        b70 b70Var = this.x;
        float[] fArr = b70Var.o;
        View view = b70Var.f;
        Rect rect = b70Var.z;
        super.onDraw(canvas);
        if (this.c != null) {
            canvas2.save();
            float max = Math.max(getWidth() / this.c.getWidth(), getHeight() / this.c.getHeight());
            canvas2.scale(max, max);
            int i10 = (int) (this.w * 255.0f);
            Paint paint = this.d;
            paint.setAlpha(i10);
            canvas2.drawBitmap(this.c, 0.0f, 0.0f, paint);
            canvas2.restore();
        } else {
            canvas2.drawColor(org.telegram.ui.ActionBar.g6.l1(this.w, this.h));
        }
        if (b70Var.t) {
            float f12 = this.e;
            Bitmap bitmap = this.a;
            Path path = this.n;
            if (bitmap != null && (view.getParent() instanceof View)) {
                canvas2.save();
                if (f12 < 1.0f) {
                    canvas2.clipRect(-rect.left, (((-rect.top) + fArr[1]) - (f12 * (b70Var.u ? 1.0f - this.w : 1.0f))) + 1.0f, getMeasuredWidth() + rect.right, getMeasuredHeight() + rect.bottom);
                }
                if (b70Var.L) {
                    b70.A(view, b70Var.b, fArr);
                    canvas2.translate(AndroidUtilities.lerp(fArr[0], this.s, this.w), AndroidUtilities.lerp(fArr[1], this.v, this.w));
                } else {
                    canvas2.translate(fArr[0], fArr[1]);
                }
                Drawable drawable = b70Var.g;
                if (drawable != null) {
                    if (drawable.getIntrinsicWidth() <= 0 || b70Var.g.getIntrinsicHeight() <= 0) {
                        b70Var.g.setBounds(-rect.left, -rect.top, view.getWidth() + rect.right, view.getHeight() + rect.bottom);
                    } else {
                        b70Var.g.setBounds((((view.getWidth() + rect.right) - b70Var.g.getIntrinsicWidth()) / 2) + (-rect.left), (((view.getHeight() + rect.bottom) - b70Var.g.getIntrinsicHeight()) / 2) + (-rect.top), ((b70Var.g.getIntrinsicWidth() + (view.getWidth() + rect.right)) / 2) + (-rect.left), ((b70Var.g.getIntrinsicHeight() + (view.getHeight() + rect.bottom)) / 2) + (-rect.top));
                    }
                    b70Var.g.draw(canvas2);
                }
                if (b70Var.k > 0 || b70Var.l > 0) {
                    path.rewind();
                    RectF rectF = AndroidUtilities.rectTmp;
                    float f13 = -rect.left;
                    float f14 = b70Var.k;
                    rectF.set((this.w * f14) + f13, (getAlpha() * f14) + (-rect.top), (bitmap.getWidth() + (-rect.left)) - (getAlpha() * b70Var.k), (bitmap.getHeight() + (-rect.top)) - (getAlpha() * b70Var.k));
                    float f15 = b70Var.l * this.w;
                    path.addRoundRect(rectF, f15, f15, Path.Direction.CW);
                    canvas2.clipPath(path);
                }
                Paint paint2 = this.b;
                paint2.setAlpha(255);
                canvas2.drawBitmap(bitmap, -rect.left, -rect.top, paint2);
                canvas2.restore();
                return;
            }
            if (view != 0 && (view.getParent() instanceof View)) {
                canvas2.save();
                float f16 = this.f;
                if (f12 >= 1.0f && f16 == 0.0f) {
                    f10 = 255.0f;
                    c10 = 0;
                } else if (b70Var.L) {
                    f10 = 255.0f;
                    c10 = 0;
                    canvas2.clipRect(-rect.left, AndroidUtilities.lerp((((-rect.top) + fArr[1]) - (f12 * (b70Var.u ? 1.0f - this.w : 1.0f))) + 1.0f, 0.0f, this.w), getMeasuredWidth() + rect.right, org.telegram.ui.Cells.pa.b(1.0f, this.w, f16, getMeasuredHeight() + rect.bottom));
                } else {
                    f10 = 255.0f;
                    c10 = 0;
                    canvas2.clipRect(-rect.left, (((-rect.top) + fArr[1]) - (f12 * (b70Var.u ? 1.0f - this.w : 1.0f))) + 1.0f, getMeasuredWidth() + rect.right, getMeasuredHeight() + rect.bottom);
                }
                float f17 = this.w;
                if (b70Var.L) {
                    b70.A(view, b70Var.b, fArr);
                    canvas2.translate(AndroidUtilities.lerp(fArr[c10], this.s, f17), AndroidUtilities.lerp(fArr[1], this.v, f17));
                } else {
                    canvas2.translate(fArr[c10], fArr[1]);
                }
                if (b70Var.N == 0 || b70Var.O == 0) {
                    width = view.getWidth();
                    height = view.getHeight();
                } else {
                    width = AndroidUtilities.lerp(view.getWidth(), b70Var.N, f17);
                    height = AndroidUtilities.lerp(view.getHeight(), b70Var.O, f17);
                }
                float f18 = height;
                Drawable drawable2 = b70Var.g;
                if (drawable2 != null) {
                    if (drawable2.getIntrinsicWidth() <= 0 || b70Var.g.getIntrinsicHeight() <= 0) {
                        f11 = 1.0f;
                        b70Var.g.setBounds(-rect.left, -rect.top, view.getWidth() + rect.right, view.getHeight() + rect.bottom);
                    } else {
                        f11 = 1.0f;
                        b70Var.g.setBounds((((view.getWidth() + rect.right) - b70Var.g.getIntrinsicWidth()) / 2) + (-rect.left), (((view.getHeight() + rect.bottom) - b70Var.g.getIntrinsicHeight()) / 2) + (-rect.top), ((b70Var.g.getIntrinsicWidth() + (view.getWidth() + rect.right)) / 2) + (-rect.left), ((b70Var.g.getIntrinsicHeight() + (view.getHeight() + rect.bottom)) / 2) + (-rect.top));
                    }
                    b70Var.g.setAlpha((int) (this.w * f10));
                    if (Build.VERSION.SDK_INT >= 29) {
                        Drawable drawable3 = b70Var.g;
                        if (drawable3 instanceof ShapeDrawable) {
                            Paint paint3 = ((ShapeDrawable) drawable3).getPaint();
                            paint3.setShadowLayer(paint3.getShadowLayerRadius(), paint3.getShadowLayerDx(), paint3.getShadowLayerDy(), org.telegram.ui.ActionBar.g6.l1(this.w, b70Var.h));
                        }
                    }
                    b70Var.g.draw(canvas2);
                } else {
                    f11 = 1.0f;
                }
                if (b70Var.k > 0 || b70Var.l > 0) {
                    path.rewind();
                    boolean z10 = view instanceof a70;
                    RectF rectF2 = this.r;
                    if (z10) {
                        ((a70) view).a(rectF2);
                    } else {
                        rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
                    }
                    RectF rectF3 = AndroidUtilities.rectTmp;
                    float f19 = -rect.left;
                    float f20 = rectF2.left + f19;
                    float f21 = b70Var.k * this.w;
                    float f22 = -rect.top;
                    rectF3.set(f20 + f21, rectF2.top + f22 + f21, (f19 + rectF2.right) - f21, (f22 + rectF2.bottom) - f21);
                    float f23 = b70Var.l * this.w;
                    path.addRoundRect(rectF3, f23, f23, Path.Direction.CW);
                    canvas2.clipPath(path);
                }
                if (!(view instanceof org.telegram.ui.Cells.o7)) {
                    if (!(view instanceof gh.b2) || b70Var.N == 0 || b70Var.O == 0) {
                        if (b70Var.L) {
                            canvas.saveLayerAlpha(0.0f, 0.0f, view.getWidth(), view.getHeight(), (int) (this.w * f10), 31);
                            canvas2 = canvas;
                        } else {
                            canvas2 = canvas;
                            canvas2.save();
                        }
                        if (view instanceof a70) {
                            ((a70) view).c(canvas2, this.w);
                        } else {
                            canvas2.translate(-view.getScrollX(), -view.getScrollY());
                            view.draw(canvas2);
                        }
                        canvas2.restore();
                    } else if (view.getAlpha() >= 1.0f) {
                        ((gh.b2) view).a(this, canvas2, width, f18, this.w);
                        canvas2 = canvas;
                    } else {
                        canvas.saveLayerAlpha(0.0f, 0.0f, width, f18, (int) (this.w * f10), 31);
                        float lerp = AndroidUtilities.lerp(1.0f, 0.9f, this.w);
                        canvas.scale(lerp, lerp, width / 2.0f, f18 / 2.0f);
                        ((gh.b2) view).a(this, canvas, width, f18, this.w);
                        canvas.restore();
                        canvas2 = canvas;
                    }
                    canvas2.restore();
                }
                if (view.getAlpha() >= f11) {
                    ((org.telegram.ui.Cells.o7) view).a(canvas2, width, f18, this.w);
                } else {
                    float f24 = width;
                    canvas2.saveLayerAlpha(0.0f, 0.0f, f24, f18, (int) (this.w * f10), 31);
                    float lerp2 = AndroidUtilities.lerp(1.0f, 0.9f, this.w);
                    canvas2.scale(lerp2, lerp2, f24 / 2.0f, f18 / 2.0f);
                    ((org.telegram.ui.Cells.o7) view).a(canvas2, f24, f18, this.w);
                    canvas2.restore();
                }
                canvas2.restore();
            }
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        b70 b70Var = this.x;
        pg.c.c(b70Var.n, this);
        ViewGroup viewGroup = b70Var.A;
        if (viewGroup != null) {
            viewGroup.invalidate();
        }
    }

    public void setProgress(float f10) {
        if (this.w == f10) {
            return;
        }
        this.w = f10;
        invalidate();
    }
}
