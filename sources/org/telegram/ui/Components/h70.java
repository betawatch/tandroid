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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class h70 extends View {
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
    public final /* synthetic */ j70 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h70(j70 j70Var, Context context) {
        super(context);
        float f9;
        this.x = j70Var;
        this.n = new Path();
        this.r = new RectF();
        View view = j70Var.f;
        Rect rect = j70Var.z;
        if (view == null || !(view.getParent() instanceof View)) {
            this.e = 0.0f;
            this.f = 0.0f;
        } else {
            this.e = view.getY() + ((View) view.getParent()).getY();
            if (j70Var.L) {
                f9 = Math.min(AndroidUtilities.dp(68.0f), Math.max(0.0f, view.getY() + ((View) view.getParent()).getY() + view.getHeight()));
            } else {
                f9 = 0.0f;
            }
            this.f = f9;
        }
        this.h = i0.a.k(0, j70Var.s);
        if (j70Var.t && (view instanceof org.telegram.ui.Cells.sa) && (j70Var.c instanceof ProfileActivity)) {
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
        if (j70Var.u || j70Var.v) {
            this.d = new Paint(3);
            view.setAlpha(0.0f);
            ViewGroup viewGroup = j70Var.b;
            d dVar = new d(this, 17);
            if (viewGroup == null) {
                yl0.d(dVar);
            } else {
                int i10 = yl0.K;
                AndroidUtilities.makeGlobalBlurBitmap(new org.telegram.ui.tm(15, viewGroup, dVar), 15.0f);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f9;
        char c3;
        float width;
        int height;
        float f10;
        Canvas canvas2 = canvas;
        j70 j70Var = this.x;
        float[] fArr = j70Var.o;
        View view = j70Var.f;
        Rect rect = j70Var.z;
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
        if (j70Var.t) {
            float f11 = this.e;
            Bitmap bitmap = this.a;
            Path path = this.n;
            if (bitmap != null && (view.getParent() instanceof View)) {
                canvas2.save();
                if (f11 < 1.0f) {
                    canvas2.clipRect(-rect.left, (((-rect.top) + fArr[1]) - (f11 * (j70Var.u ? 1.0f - this.w : 1.0f))) + 1.0f, getMeasuredWidth() + rect.right, getMeasuredHeight() + rect.bottom);
                }
                if (j70Var.L) {
                    j70.A(view, j70Var.b, fArr);
                    canvas2.translate(AndroidUtilities.lerp(fArr[0], this.s, this.w), AndroidUtilities.lerp(fArr[1], this.v, this.w));
                } else {
                    canvas2.translate(fArr[0], fArr[1]);
                }
                Drawable drawable = j70Var.g;
                if (drawable != null) {
                    if (drawable.getIntrinsicWidth() <= 0 || j70Var.g.getIntrinsicHeight() <= 0) {
                        j70Var.g.setBounds(-rect.left, -rect.top, view.getWidth() + rect.right, view.getHeight() + rect.bottom);
                    } else {
                        j70Var.g.setBounds((((view.getWidth() + rect.right) - j70Var.g.getIntrinsicWidth()) / 2) + (-rect.left), (((view.getHeight() + rect.bottom) - j70Var.g.getIntrinsicHeight()) / 2) + (-rect.top), ((j70Var.g.getIntrinsicWidth() + (view.getWidth() + rect.right)) / 2) + (-rect.left), ((j70Var.g.getIntrinsicHeight() + (view.getHeight() + rect.bottom)) / 2) + (-rect.top));
                    }
                    j70Var.g.draw(canvas2);
                }
                if (j70Var.k > 0 || j70Var.l > 0) {
                    path.rewind();
                    RectF rectF = AndroidUtilities.rectTmp;
                    float f12 = -rect.left;
                    float f13 = j70Var.k;
                    rectF.set((this.w * f13) + f12, (getAlpha() * f13) + (-rect.top), (bitmap.getWidth() + (-rect.left)) - (getAlpha() * j70Var.k), (bitmap.getHeight() + (-rect.top)) - (getAlpha() * j70Var.k));
                    float f14 = j70Var.l * this.w;
                    path.addRoundRect(rectF, f14, f14, Path.Direction.CW);
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
                float f15 = this.f;
                if (f11 >= 1.0f && f15 == 0.0f) {
                    f9 = 255.0f;
                    c3 = 0;
                } else if (j70Var.L) {
                    f9 = 255.0f;
                    c3 = 0;
                    canvas2.clipRect(-rect.left, AndroidUtilities.lerp((((-rect.top) + fArr[1]) - (f11 * (j70Var.u ? 1.0f - this.w : 1.0f))) + 1.0f, 0.0f, this.w), getMeasuredWidth() + rect.right, org.telegram.ui.th.b(1.0f, this.w, f15, getMeasuredHeight() + rect.bottom));
                } else {
                    f9 = 255.0f;
                    c3 = 0;
                    canvas2.clipRect(-rect.left, (((-rect.top) + fArr[1]) - (f11 * (j70Var.u ? 1.0f - this.w : 1.0f))) + 1.0f, getMeasuredWidth() + rect.right, getMeasuredHeight() + rect.bottom);
                }
                float f16 = this.w;
                if (j70Var.L) {
                    j70.A(view, j70Var.b, fArr);
                    canvas2.translate(AndroidUtilities.lerp(fArr[c3], this.s, f16), AndroidUtilities.lerp(fArr[1], this.v, f16));
                } else {
                    canvas2.translate(fArr[c3], fArr[1]);
                }
                if (j70Var.N == 0 || j70Var.O == 0) {
                    width = view.getWidth();
                    height = view.getHeight();
                } else {
                    width = AndroidUtilities.lerp(view.getWidth(), j70Var.N, f16);
                    height = AndroidUtilities.lerp(view.getHeight(), j70Var.O, f16);
                }
                float f17 = height;
                Drawable drawable2 = j70Var.g;
                if (drawable2 != null) {
                    if (drawable2.getIntrinsicWidth() <= 0 || j70Var.g.getIntrinsicHeight() <= 0) {
                        f10 = 1.0f;
                        j70Var.g.setBounds(-rect.left, -rect.top, view.getWidth() + rect.right, view.getHeight() + rect.bottom);
                    } else {
                        f10 = 1.0f;
                        j70Var.g.setBounds((((view.getWidth() + rect.right) - j70Var.g.getIntrinsicWidth()) / 2) + (-rect.left), (((view.getHeight() + rect.bottom) - j70Var.g.getIntrinsicHeight()) / 2) + (-rect.top), ((j70Var.g.getIntrinsicWidth() + (view.getWidth() + rect.right)) / 2) + (-rect.left), ((j70Var.g.getIntrinsicHeight() + (view.getHeight() + rect.bottom)) / 2) + (-rect.top));
                    }
                    j70Var.g.setAlpha((int) (this.w * f9));
                    if (Build.VERSION.SDK_INT >= 29) {
                        Drawable drawable3 = j70Var.g;
                        if (drawable3 instanceof ShapeDrawable) {
                            Paint paint3 = ((ShapeDrawable) drawable3).getPaint();
                            paint3.setShadowLayer(paint3.getShadowLayerRadius(), paint3.getShadowLayerDx(), paint3.getShadowLayerDy(), org.telegram.ui.ActionBar.g6.l1(this.w, j70Var.h));
                        }
                    }
                    j70Var.g.draw(canvas2);
                } else {
                    f10 = 1.0f;
                }
                if (j70Var.k > 0 || j70Var.l > 0) {
                    path.rewind();
                    boolean z10 = view instanceof i70;
                    RectF rectF2 = this.r;
                    if (z10) {
                        ((i70) view).a(rectF2);
                    } else {
                        rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
                    }
                    RectF rectF3 = AndroidUtilities.rectTmp;
                    float f18 = -rect.left;
                    float f19 = rectF2.left + f18;
                    float f20 = j70Var.k * this.w;
                    float f21 = -rect.top;
                    rectF3.set(f19 + f20, rectF2.top + f21 + f20, (f18 + rectF2.right) - f20, (f21 + rectF2.bottom) - f20);
                    float f22 = j70Var.l * this.w;
                    path.addRoundRect(rectF3, f22, f22, Path.Direction.CW);
                    canvas2.clipPath(path);
                }
                if (!(view instanceof org.telegram.ui.Cells.p7)) {
                    if (!(view instanceof ih.y1) || j70Var.N == 0 || j70Var.O == 0) {
                        if (j70Var.L) {
                            canvas.saveLayerAlpha(0.0f, 0.0f, view.getWidth(), view.getHeight(), (int) (this.w * f9), 31);
                            canvas2 = canvas;
                        } else {
                            canvas2 = canvas;
                            canvas2.save();
                        }
                        if (view instanceof i70) {
                            ((i70) view).b(canvas2, this.w);
                        } else {
                            canvas2.translate(-view.getScrollX(), -view.getScrollY());
                            view.draw(canvas2);
                        }
                        canvas2.restore();
                    } else if (view.getAlpha() >= 1.0f) {
                        ((ih.y1) view).a(this, canvas2, width, f17, this.w);
                        canvas2 = canvas;
                    } else {
                        canvas.saveLayerAlpha(0.0f, 0.0f, width, f17, (int) (this.w * f9), 31);
                        float lerp = AndroidUtilities.lerp(1.0f, 0.9f, this.w);
                        canvas.scale(lerp, lerp, width / 2.0f, f17 / 2.0f);
                        ((ih.y1) view).a(this, canvas, width, f17, this.w);
                        canvas.restore();
                        canvas2 = canvas;
                    }
                    canvas2.restore();
                }
                if (view.getAlpha() >= f10) {
                    ((org.telegram.ui.Cells.p7) view).a(canvas2, width, f17, this.w);
                } else {
                    float f23 = width;
                    canvas2.saveLayerAlpha(0.0f, 0.0f, f23, f17, (int) (this.w * f9), 31);
                    float lerp2 = AndroidUtilities.lerp(1.0f, 0.9f, this.w);
                    canvas2.scale(lerp2, lerp2, f23 / 2.0f, f17 / 2.0f);
                    ((org.telegram.ui.Cells.p7) view).a(canvas2, f23, f17, this.w);
                    canvas2.restore();
                }
                canvas2.restore();
            }
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        j70 j70Var = this.x;
        rg.c.c(j70Var.n, this);
        ViewGroup viewGroup = j70Var.A;
        if (viewGroup != null) {
            viewGroup.invalidate();
        }
    }

    public void setProgress(float f9) {
        if (this.w == f9) {
            return;
        }
        this.w = f9;
        invalidate();
    }
}
