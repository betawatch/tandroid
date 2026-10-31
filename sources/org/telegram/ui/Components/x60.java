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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class x60 extends View {
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
    public final /* synthetic */ z60 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x60(z60 z60Var, Context context) {
        super(context);
        float f7;
        this.y = z60Var;
        this.n = new Path();
        this.r = new RectF();
        View view = z60Var.f;
        Rect rect = z60Var.z;
        if (view == null || !(view.getParent() instanceof View)) {
            this.e = 0.0f;
            this.f = 0.0f;
        } else {
            this.e = view.getY() + ((View) view.getParent()).getY();
            if (z60Var.L) {
                f7 = Math.min(org.telegram.messenger.i0.L(68.0f), Math.max(0.0f, view.getY() + ((View) view.getParent()).getY() + view.getHeight()));
            } else {
                f7 = 0.0f;
            }
            this.f = f7;
        }
        this.h = i0.b.o(0, z60Var.s);
        if (z60Var.t && (view instanceof org.telegram.ui.Cells.pa) && (z60Var.c instanceof ProfileActivity)) {
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
        if (z60Var.u || z60Var.v) {
            this.d = new Paint(3);
            view.setAlpha(0.0f);
            ViewGroup viewGroup = z60Var.b;
            d dVar = new d(this, 17);
            if (viewGroup == null) {
                nl0.d(dVar);
            } else {
                int i10 = nl0.O;
                org.telegram.messenger.i0.l2(new vg(11, viewGroup, dVar), 15.0f);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f7;
        char c10;
        float width;
        int height;
        float f10;
        Canvas canvas2 = canvas;
        z60 z60Var = this.y;
        float[] fArr = z60Var.o;
        View view = z60Var.f;
        Rect rect = z60Var.z;
        super.onDraw(canvas);
        if (this.c != null) {
            canvas2.save();
            float max = Math.max(getWidth() / this.c.getWidth(), getHeight() / this.c.getHeight());
            canvas2.scale(max, max);
            int i10 = (int) (this.x * 255.0f);
            Paint paint = this.d;
            paint.setAlpha(i10);
            canvas2.drawBitmap(this.c, 0.0f, 0.0f, paint);
            canvas2.restore();
        } else {
            canvas2.drawColor(org.telegram.ui.ActionBar.t6.r1(this.x, this.h));
        }
        if (z60Var.t) {
            float f11 = this.e;
            Bitmap bitmap = this.a;
            Path path = this.n;
            if (bitmap != null && (view.getParent() instanceof View)) {
                canvas2.save();
                if (f11 < 1.0f) {
                    canvas2.clipRect(-rect.left, (((-rect.top) + fArr[1]) - (f11 * (z60Var.u ? 1.0f - this.x : 1.0f))) + 1.0f, getMeasuredWidth() + rect.right, getMeasuredHeight() + rect.bottom);
                }
                if (z60Var.L) {
                    z60.A(view, z60Var.b, fArr);
                    canvas2.translate(org.telegram.messenger.i0.T1(fArr[0], this.s, this.x), org.telegram.messenger.i0.T1(fArr[1], this.w, this.x));
                } else {
                    canvas2.translate(fArr[0], fArr[1]);
                }
                Drawable drawable = z60Var.g;
                if (drawable != null) {
                    if (drawable.getIntrinsicWidth() <= 0 || z60Var.g.getIntrinsicHeight() <= 0) {
                        z60Var.g.setBounds(-rect.left, -rect.top, view.getWidth() + rect.right, view.getHeight() + rect.bottom);
                    } else {
                        z60Var.g.setBounds((((view.getWidth() + rect.right) - z60Var.g.getIntrinsicWidth()) / 2) + (-rect.left), (((view.getHeight() + rect.bottom) - z60Var.g.getIntrinsicHeight()) / 2) + (-rect.top), ((z60Var.g.getIntrinsicWidth() + (view.getWidth() + rect.right)) / 2) + (-rect.left), ((z60Var.g.getIntrinsicHeight() + (view.getHeight() + rect.bottom)) / 2) + (-rect.top));
                    }
                    z60Var.g.draw(canvas2);
                }
                if (z60Var.k > 0 || z60Var.l > 0) {
                    path.rewind();
                    RectF rectF = org.telegram.messenger.i0.P;
                    float f12 = -rect.left;
                    float f13 = z60Var.k;
                    rectF.set((this.x * f13) + f12, (getAlpha() * f13) + (-rect.top), (bitmap.getWidth() + (-rect.left)) - (getAlpha() * z60Var.k), (bitmap.getHeight() + (-rect.top)) - (getAlpha() * z60Var.k));
                    float f14 = z60Var.l * this.x;
                    path.addRoundRect(rectF, f14, f14, Path.Direction.CW);
                    canvas2.clipPath(path);
                }
                Paint paint2 = this.b;
                paint2.setAlpha(org.telegram.messenger.zs.e4);
                canvas2.drawBitmap(bitmap, -rect.left, -rect.top, paint2);
                canvas2.restore();
                return;
            }
            if (view != 0 && (view.getParent() instanceof View)) {
                canvas2.save();
                float f15 = this.f;
                if (f11 >= 1.0f && f15 == 0.0f) {
                    f7 = 255.0f;
                    c10 = 0;
                } else if (z60Var.L) {
                    f7 = 255.0f;
                    c10 = 0;
                    canvas2.clipRect(-rect.left, org.telegram.messenger.i0.T1((((-rect.top) + fArr[1]) - (f11 * (z60Var.u ? 1.0f - this.x : 1.0f))) + 1.0f, 0.0f, this.x), getMeasuredWidth() + rect.right, sc.e.z(1.0f, this.x, f15, getMeasuredHeight() + rect.bottom));
                } else {
                    f7 = 255.0f;
                    c10 = 0;
                    canvas2.clipRect(-rect.left, (((-rect.top) + fArr[1]) - (f11 * (z60Var.u ? 1.0f - this.x : 1.0f))) + 1.0f, getMeasuredWidth() + rect.right, getMeasuredHeight() + rect.bottom);
                }
                float f16 = this.x;
                if (z60Var.L) {
                    z60.A(view, z60Var.b, fArr);
                    canvas2.translate(org.telegram.messenger.i0.T1(fArr[c10], this.s, f16), org.telegram.messenger.i0.T1(fArr[1], this.w, f16));
                } else {
                    canvas2.translate(fArr[c10], fArr[1]);
                }
                if (z60Var.N == 0 || z60Var.O == 0) {
                    width = view.getWidth();
                    height = view.getHeight();
                } else {
                    width = org.telegram.messenger.i0.W1(f16, view.getWidth(), z60Var.N);
                    height = org.telegram.messenger.i0.W1(f16, view.getHeight(), z60Var.O);
                }
                float f17 = height;
                Drawable drawable2 = z60Var.g;
                if (drawable2 != null) {
                    if (drawable2.getIntrinsicWidth() <= 0 || z60Var.g.getIntrinsicHeight() <= 0) {
                        f10 = 1.0f;
                        z60Var.g.setBounds(-rect.left, -rect.top, view.getWidth() + rect.right, view.getHeight() + rect.bottom);
                    } else {
                        f10 = 1.0f;
                        z60Var.g.setBounds((((view.getWidth() + rect.right) - z60Var.g.getIntrinsicWidth()) / 2) + (-rect.left), (((view.getHeight() + rect.bottom) - z60Var.g.getIntrinsicHeight()) / 2) + (-rect.top), ((z60Var.g.getIntrinsicWidth() + (view.getWidth() + rect.right)) / 2) + (-rect.left), ((z60Var.g.getIntrinsicHeight() + (view.getHeight() + rect.bottom)) / 2) + (-rect.top));
                    }
                    z60Var.g.setAlpha((int) (this.x * f7));
                    if (Build.VERSION.SDK_INT >= 29) {
                        Drawable drawable3 = z60Var.g;
                        if (drawable3 instanceof ShapeDrawable) {
                            Paint paint3 = ((ShapeDrawable) drawable3).getPaint();
                            paint3.setShadowLayer(paint3.getShadowLayerRadius(), paint3.getShadowLayerDx(), paint3.getShadowLayerDy(), org.telegram.ui.ActionBar.t6.r1(this.x, z60Var.h));
                        }
                    }
                    z60Var.g.draw(canvas2);
                } else {
                    f10 = 1.0f;
                }
                if (z60Var.k > 0 || z60Var.l > 0) {
                    path.rewind();
                    boolean z10 = view instanceof y60;
                    RectF rectF2 = this.r;
                    if (z10) {
                        ((y60) view).a(rectF2);
                    } else {
                        rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
                    }
                    RectF rectF3 = org.telegram.messenger.i0.P;
                    float f18 = -rect.left;
                    float f19 = rectF2.left + f18;
                    float f20 = z60Var.k * this.x;
                    float f21 = -rect.top;
                    rectF3.set(f19 + f20, rectF2.top + f21 + f20, (f18 + rectF2.right) - f20, (f21 + rectF2.bottom) - f20);
                    float f22 = z60Var.l * this.x;
                    path.addRoundRect(rectF3, f22, f22, Path.Direction.CW);
                    canvas2.clipPath(path);
                }
                if (!(view instanceof org.telegram.ui.Cells.s7)) {
                    if (!(view instanceof ph.c1) || z60Var.N == 0 || z60Var.O == 0) {
                        if (z60Var.L) {
                            canvas.saveLayerAlpha(0.0f, 0.0f, view.getWidth(), view.getHeight(), (int) (this.x * f7), 31);
                            canvas2 = canvas;
                        } else {
                            canvas2 = canvas;
                            canvas2.save();
                        }
                        if (view instanceof y60) {
                            ((y60) view).b(canvas2, this.x);
                        } else {
                            canvas2.translate(-view.getScrollX(), -view.getScrollY());
                            view.draw(canvas2);
                        }
                        canvas2.restore();
                    } else if (view.getAlpha() >= 1.0f) {
                        ((ph.c1) view).b(this, canvas2, width, f17, this.x);
                        canvas2 = canvas;
                    } else {
                        canvas.saveLayerAlpha(0.0f, 0.0f, width, f17, (int) (this.x * f7), 31);
                        float T1 = org.telegram.messenger.i0.T1(1.0f, 0.9f, this.x);
                        canvas.scale(T1, T1, width / 2.0f, f17 / 2.0f);
                        ((ph.c1) view).b(this, canvas, width, f17, this.x);
                        canvas.restore();
                        canvas2 = canvas;
                    }
                    canvas2.restore();
                }
                if (view.getAlpha() >= f10) {
                    ((org.telegram.ui.Cells.s7) view).a(canvas2, width, f17, this.x);
                } else {
                    float f23 = width;
                    canvas2.saveLayerAlpha(0.0f, 0.0f, f23, f17, (int) (this.x * f7), 31);
                    float T12 = org.telegram.messenger.i0.T1(f10, 0.9f, this.x);
                    canvas2.scale(T12, T12, f23 / 2.0f, f17 / 2.0f);
                    ((org.telegram.ui.Cells.s7) view).a(canvas2, f23, f17, this.x);
                    canvas2.restore();
                }
                canvas2.restore();
            }
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        z60 z60Var = this.y;
        yg.d.c(z60Var.n, this);
        ViewGroup viewGroup = z60Var.A;
        if (viewGroup != null) {
            viewGroup.invalidate();
        }
    }

    public void setProgress(float f7) {
        if (this.x == f7) {
            return;
        }
        this.x = f7;
        invalidate();
    }
}
