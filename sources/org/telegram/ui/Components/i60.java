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
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class i60 extends View {
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
    public float w;
    public float x;
    public final /* synthetic */ k60 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i60(k60 k60Var, Context context) {
        super(context);
        float f10;
        this.y = k60Var;
        this.n = new Path();
        this.r = new RectF();
        View view = k60Var.f;
        Rect rect = k60Var.z;
        if (view == null || !(view.getParent() instanceof View)) {
            this.e = 0.0f;
            this.f = 0.0f;
        } else {
            this.e = view.getY() + ((View) view.getParent()).getY();
            if (k60Var.L) {
                f10 = Math.min(org.telegram.messenger.g0.L(68.0f), Math.max(0.0f, view.getY() + ((View) view.getParent()).getY() + view.getHeight()));
            } else {
                f10 = 0.0f;
            }
            this.f = f10;
        }
        this.h = i0.a.o(0, k60Var.s);
        int i7 = 3;
        if (k60Var.t && (view instanceof org.telegram.ui.Cells.pa) && (k60Var.c instanceof ProfileActivity)) {
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
        if (k60Var.u || k60Var.v) {
            this.d = new Paint(3);
            view.setAlpha(0.0f);
            ViewGroup viewGroup = k60Var.b;
            d dVar = new d(this, 17);
            if (viewGroup == null) {
                jk0.d(dVar);
            } else {
                int i10 = jk0.O;
                org.telegram.messenger.g0.l2(new ex(i7, viewGroup, dVar), 15.0f);
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
        k60 k60Var = this.y;
        float[] fArr = k60Var.o;
        View view = k60Var.f;
        Rect rect = k60Var.z;
        super.onDraw(canvas);
        if (this.c != null) {
            canvas2.save();
            float max = Math.max(getWidth() / this.c.getWidth(), getHeight() / this.c.getHeight());
            canvas2.scale(max, max);
            int i7 = (int) (this.x * 255.0f);
            Paint paint = this.d;
            paint.setAlpha(i7);
            canvas2.drawBitmap(this.c, 0.0f, 0.0f, paint);
            canvas2.restore();
        } else {
            canvas2.drawColor(org.telegram.ui.ActionBar.k6.r1(this.x, this.h));
        }
        if (k60Var.t) {
            float f12 = this.e;
            Bitmap bitmap = this.a;
            Path path = this.n;
            if (bitmap != null && (view.getParent() instanceof View)) {
                canvas2.save();
                if (f12 < 1.0f) {
                    canvas2.clipRect(-rect.left, (((-rect.top) + fArr[1]) - (f12 * (k60Var.u ? 1.0f - this.x : 1.0f))) + 1.0f, getMeasuredWidth() + rect.right, getMeasuredHeight() + rect.bottom);
                }
                if (k60Var.L) {
                    k60.A(view, k60Var.b, fArr);
                    canvas2.translate(org.telegram.messenger.g0.T1(fArr[0], this.s, this.x), org.telegram.messenger.g0.T1(fArr[1], this.w, this.x));
                } else {
                    canvas2.translate(fArr[0], fArr[1]);
                }
                Drawable drawable = k60Var.g;
                if (drawable != null) {
                    if (drawable.getIntrinsicWidth() <= 0 || k60Var.g.getIntrinsicHeight() <= 0) {
                        k60Var.g.setBounds(-rect.left, -rect.top, view.getWidth() + rect.right, view.getHeight() + rect.bottom);
                    } else {
                        k60Var.g.setBounds((((view.getWidth() + rect.right) - k60Var.g.getIntrinsicWidth()) / 2) + (-rect.left), (((view.getHeight() + rect.bottom) - k60Var.g.getIntrinsicHeight()) / 2) + (-rect.top), ((k60Var.g.getIntrinsicWidth() + (view.getWidth() + rect.right)) / 2) + (-rect.left), ((k60Var.g.getIntrinsicHeight() + (view.getHeight() + rect.bottom)) / 2) + (-rect.top));
                    }
                    k60Var.g.draw(canvas2);
                }
                if (k60Var.k > 0 || k60Var.l > 0) {
                    path.rewind();
                    RectF rectF = org.telegram.messenger.g0.P;
                    float f13 = -rect.left;
                    float f14 = k60Var.k;
                    rectF.set((this.x * f14) + f13, (getAlpha() * f14) + (-rect.top), (bitmap.getWidth() + (-rect.left)) - (getAlpha() * k60Var.k), (bitmap.getHeight() + (-rect.top)) - (getAlpha() * k60Var.k));
                    float f15 = k60Var.l * this.x;
                    path.addRoundRect(rectF, f15, f15, Path.Direction.CW);
                    canvas2.clipPath(path);
                }
                Paint paint2 = this.b;
                paint2.setAlpha(org.telegram.messenger.qs.e4);
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
                } else if (k60Var.L) {
                    f10 = 255.0f;
                    c10 = 0;
                    canvas2.clipRect(-rect.left, org.telegram.messenger.g0.T1((((-rect.top) + fArr[1]) - (f12 * (k60Var.u ? 1.0f - this.x : 1.0f))) + 1.0f, 0.0f, this.x), getMeasuredWidth() + rect.right, com.google.android.recaptcha.internal.a.v(1.0f, this.x, f16, getMeasuredHeight() + rect.bottom));
                } else {
                    f10 = 255.0f;
                    c10 = 0;
                    canvas2.clipRect(-rect.left, (((-rect.top) + fArr[1]) - (f12 * (k60Var.u ? 1.0f - this.x : 1.0f))) + 1.0f, getMeasuredWidth() + rect.right, getMeasuredHeight() + rect.bottom);
                }
                float f17 = this.x;
                if (k60Var.L) {
                    k60.A(view, k60Var.b, fArr);
                    canvas2.translate(org.telegram.messenger.g0.T1(fArr[c10], this.s, f17), org.telegram.messenger.g0.T1(fArr[1], this.w, f17));
                } else {
                    canvas2.translate(fArr[c10], fArr[1]);
                }
                if (k60Var.N == 0 || k60Var.O == 0) {
                    width = view.getWidth();
                    height = view.getHeight();
                } else {
                    width = org.telegram.messenger.g0.W1(f17, view.getWidth(), k60Var.N);
                    height = org.telegram.messenger.g0.W1(f17, view.getHeight(), k60Var.O);
                }
                float f18 = height;
                Drawable drawable2 = k60Var.g;
                if (drawable2 != null) {
                    if (drawable2.getIntrinsicWidth() <= 0 || k60Var.g.getIntrinsicHeight() <= 0) {
                        f11 = 1.0f;
                        k60Var.g.setBounds(-rect.left, -rect.top, view.getWidth() + rect.right, view.getHeight() + rect.bottom);
                    } else {
                        f11 = 1.0f;
                        k60Var.g.setBounds((((view.getWidth() + rect.right) - k60Var.g.getIntrinsicWidth()) / 2) + (-rect.left), (((view.getHeight() + rect.bottom) - k60Var.g.getIntrinsicHeight()) / 2) + (-rect.top), ((k60Var.g.getIntrinsicWidth() + (view.getWidth() + rect.right)) / 2) + (-rect.left), ((k60Var.g.getIntrinsicHeight() + (view.getHeight() + rect.bottom)) / 2) + (-rect.top));
                    }
                    k60Var.g.setAlpha((int) (this.x * f10));
                    if (Build.VERSION.SDK_INT >= 29) {
                        Drawable drawable3 = k60Var.g;
                        if (drawable3 instanceof ShapeDrawable) {
                            Paint paint3 = ((ShapeDrawable) drawable3).getPaint();
                            paint3.setShadowLayer(paint3.getShadowLayerRadius(), paint3.getShadowLayerDx(), paint3.getShadowLayerDy(), org.telegram.ui.ActionBar.k6.r1(this.x, k60Var.h));
                        }
                    }
                    k60Var.g.draw(canvas2);
                } else {
                    f11 = 1.0f;
                }
                if (k60Var.k > 0 || k60Var.l > 0) {
                    path.rewind();
                    boolean z9 = view instanceof j60;
                    RectF rectF2 = this.r;
                    if (z9) {
                        ((j60) view).g(rectF2);
                    } else {
                        rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
                    }
                    RectF rectF3 = org.telegram.messenger.g0.P;
                    float f19 = -rect.left;
                    float f20 = rectF2.left + f19;
                    float f21 = k60Var.k * this.x;
                    float f22 = -rect.top;
                    rectF3.set(f20 + f21, rectF2.top + f22 + f21, (f19 + rectF2.right) - f21, (f22 + rectF2.bottom) - f21);
                    float f23 = k60Var.l * this.x;
                    path.addRoundRect(rectF3, f23, f23, Path.Direction.CW);
                    canvas2.clipPath(path);
                }
                if (!(view instanceof org.telegram.ui.Cells.o7)) {
                    if (!(view instanceof zh.z0) || k60Var.N == 0 || k60Var.O == 0) {
                        if (k60Var.L) {
                            canvas.saveLayerAlpha(0.0f, 0.0f, view.getWidth(), view.getHeight(), (int) (this.x * f10), 31);
                            canvas2 = canvas;
                        } else {
                            canvas2 = canvas;
                            canvas2.save();
                        }
                        if (view instanceof j60) {
                            ((j60) view).h(canvas2, this.x);
                        } else {
                            canvas2.translate(-view.getScrollX(), -view.getScrollY());
                            view.draw(canvas2);
                        }
                        canvas2.restore();
                    } else if (view.getAlpha() >= 1.0f) {
                        ((zh.z0) view).b(this, canvas2, width, f18, this.x);
                        canvas2 = canvas;
                    } else {
                        canvas.saveLayerAlpha(0.0f, 0.0f, width, f18, (int) (this.x * f10), 31);
                        float T1 = org.telegram.messenger.g0.T1(1.0f, 0.9f, this.x);
                        canvas.scale(T1, T1, width / 2.0f, f18 / 2.0f);
                        ((zh.z0) view).b(this, canvas, width, f18, this.x);
                        canvas.restore();
                        canvas2 = canvas;
                    }
                    canvas2.restore();
                }
                if (view.getAlpha() >= f11) {
                    ((org.telegram.ui.Cells.o7) view).a(canvas2, width, f18, this.x);
                } else {
                    float f24 = width;
                    canvas2.saveLayerAlpha(0.0f, 0.0f, f24, f18, (int) (this.x * f10), 31);
                    float T12 = org.telegram.messenger.g0.T1(f11, 0.9f, this.x);
                    canvas2.scale(T12, T12, f24 / 2.0f, f18 / 2.0f);
                    ((org.telegram.ui.Cells.o7) view).a(canvas2, f24, f18, this.x);
                    canvas2.restore();
                }
                canvas2.restore();
            }
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        k60 k60Var = this.y;
        ih.d.c(k60Var.n, this);
        ViewGroup viewGroup = k60Var.A;
        if (viewGroup != null) {
            viewGroup.invalidate();
        }
    }

    public void setProgress(float f10) {
        if (this.x == f10) {
            return;
        }
        this.x = f10;
        invalidate();
    }
}
