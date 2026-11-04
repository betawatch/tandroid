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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class d60 extends View {
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
    public final /* synthetic */ f60 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d60(f60 f60Var, Context context) {
        super(context);
        float f10;
        this.y = f60Var;
        this.n = new Path();
        this.r = new RectF();
        View view = f60Var.f;
        Rect rect = f60Var.z;
        if (view == null || !(view.getParent() instanceof View)) {
            this.e = 0.0f;
            this.f = 0.0f;
        } else {
            this.e = view.getY() + ((View) view.getParent()).getY();
            if (f60Var.L) {
                f10 = Math.min(org.telegram.messenger.g0.L(68.0f), Math.max(0.0f, view.getY() + ((View) view.getParent()).getY() + view.getHeight()));
            } else {
                f10 = 0.0f;
            }
            this.f = f10;
        }
        this.h = i0.a.o(0, f60Var.s);
        if (f60Var.t && (view instanceof org.telegram.ui.Cells.pa) && (f60Var.c instanceof ProfileActivity)) {
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
        if (f60Var.u || f60Var.v) {
            this.d = new Paint(3);
            view.setAlpha(0.0f);
            ViewGroup viewGroup = f60Var.b;
            e eVar = new e(this, 17);
            if (viewGroup == null) {
                nk0.d(eVar);
            } else {
                int i3 = nk0.P;
                org.telegram.messenger.g0.l2(new ei(7, viewGroup, eVar), 15.0f);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f10;
        char c2;
        float width;
        int height;
        float f11;
        Canvas canvas2 = canvas;
        f60 f60Var = this.y;
        float[] fArr = f60Var.o;
        View view = f60Var.f;
        Rect rect = f60Var.z;
        super.onDraw(canvas);
        if (this.c != null) {
            canvas2.save();
            float max = Math.max(getWidth() / this.c.getWidth(), getHeight() / this.c.getHeight());
            canvas2.scale(max, max);
            int i3 = (int) (this.x * 255.0f);
            Paint paint = this.d;
            paint.setAlpha(i3);
            canvas2.drawBitmap(this.c, 0.0f, 0.0f, paint);
            canvas2.restore();
        } else {
            canvas2.drawColor(org.telegram.ui.ActionBar.k6.r1(this.x, this.h));
        }
        if (f60Var.t) {
            float f12 = this.e;
            Bitmap bitmap = this.a;
            Path path = this.n;
            if (bitmap != null && (view.getParent() instanceof View)) {
                canvas2.save();
                if (f12 < 1.0f) {
                    canvas2.clipRect(-rect.left, (((-rect.top) + fArr[1]) - (f12 * (f60Var.u ? 1.0f - this.x : 1.0f))) + 1.0f, getMeasuredWidth() + rect.right, getMeasuredHeight() + rect.bottom);
                }
                if (f60Var.L) {
                    f60.A(view, f60Var.b, fArr);
                    canvas2.translate(org.telegram.messenger.g0.T1(fArr[0], this.s, this.x), org.telegram.messenger.g0.T1(fArr[1], this.w, this.x));
                } else {
                    canvas2.translate(fArr[0], fArr[1]);
                }
                Drawable drawable = f60Var.g;
                if (drawable != null) {
                    if (drawable.getIntrinsicWidth() <= 0 || f60Var.g.getIntrinsicHeight() <= 0) {
                        f60Var.g.setBounds(-rect.left, -rect.top, view.getWidth() + rect.right, view.getHeight() + rect.bottom);
                    } else {
                        f60Var.g.setBounds((((view.getWidth() + rect.right) - f60Var.g.getIntrinsicWidth()) / 2) + (-rect.left), (((view.getHeight() + rect.bottom) - f60Var.g.getIntrinsicHeight()) / 2) + (-rect.top), ((f60Var.g.getIntrinsicWidth() + (view.getWidth() + rect.right)) / 2) + (-rect.left), ((f60Var.g.getIntrinsicHeight() + (view.getHeight() + rect.bottom)) / 2) + (-rect.top));
                    }
                    f60Var.g.draw(canvas2);
                }
                if (f60Var.k > 0 || f60Var.l > 0) {
                    path.rewind();
                    RectF rectF = org.telegram.messenger.g0.P;
                    float f13 = -rect.left;
                    float f14 = f60Var.k;
                    rectF.set((this.x * f14) + f13, (getAlpha() * f14) + (-rect.top), (bitmap.getWidth() + (-rect.left)) - (getAlpha() * f60Var.k), (bitmap.getHeight() + (-rect.top)) - (getAlpha() * f60Var.k));
                    float f15 = f60Var.l * this.x;
                    path.addRoundRect(rectF, f15, f15, Path.Direction.CW);
                    canvas2.clipPath(path);
                }
                Paint paint2 = this.b;
                paint2.setAlpha(org.telegram.messenger.hs.e4);
                canvas2.drawBitmap(bitmap, -rect.left, -rect.top, paint2);
                canvas2.restore();
                return;
            }
            if (view != 0 && (view.getParent() instanceof View)) {
                canvas2.save();
                float f16 = this.f;
                if (f12 >= 1.0f && f16 == 0.0f) {
                    f10 = 255.0f;
                    c2 = 0;
                } else if (f60Var.L) {
                    f10 = 255.0f;
                    c2 = 0;
                    canvas2.clipRect(-rect.left, org.telegram.messenger.g0.T1((((-rect.top) + fArr[1]) - (f12 * (f60Var.u ? 1.0f - this.x : 1.0f))) + 1.0f, 0.0f, this.x), getMeasuredWidth() + rect.right, a1.g.D(1.0f, this.x, f16, getMeasuredHeight() + rect.bottom));
                } else {
                    f10 = 255.0f;
                    c2 = 0;
                    canvas2.clipRect(-rect.left, (((-rect.top) + fArr[1]) - (f12 * (f60Var.u ? 1.0f - this.x : 1.0f))) + 1.0f, getMeasuredWidth() + rect.right, getMeasuredHeight() + rect.bottom);
                }
                float f17 = this.x;
                if (f60Var.L) {
                    f60.A(view, f60Var.b, fArr);
                    canvas2.translate(org.telegram.messenger.g0.T1(fArr[c2], this.s, f17), org.telegram.messenger.g0.T1(fArr[1], this.w, f17));
                } else {
                    canvas2.translate(fArr[c2], fArr[1]);
                }
                if (f60Var.N == 0 || f60Var.O == 0) {
                    width = view.getWidth();
                    height = view.getHeight();
                } else {
                    width = org.telegram.messenger.g0.W1(f17, view.getWidth(), f60Var.N);
                    height = org.telegram.messenger.g0.W1(f17, view.getHeight(), f60Var.O);
                }
                float f18 = height;
                Drawable drawable2 = f60Var.g;
                if (drawable2 != null) {
                    if (drawable2.getIntrinsicWidth() <= 0 || f60Var.g.getIntrinsicHeight() <= 0) {
                        f11 = 1.0f;
                        f60Var.g.setBounds(-rect.left, -rect.top, view.getWidth() + rect.right, view.getHeight() + rect.bottom);
                    } else {
                        f11 = 1.0f;
                        f60Var.g.setBounds((((view.getWidth() + rect.right) - f60Var.g.getIntrinsicWidth()) / 2) + (-rect.left), (((view.getHeight() + rect.bottom) - f60Var.g.getIntrinsicHeight()) / 2) + (-rect.top), ((f60Var.g.getIntrinsicWidth() + (view.getWidth() + rect.right)) / 2) + (-rect.left), ((f60Var.g.getIntrinsicHeight() + (view.getHeight() + rect.bottom)) / 2) + (-rect.top));
                    }
                    f60Var.g.setAlpha((int) (this.x * f10));
                    if (Build.VERSION.SDK_INT >= 29) {
                        Drawable drawable3 = f60Var.g;
                        if (drawable3 instanceof ShapeDrawable) {
                            Paint paint3 = ((ShapeDrawable) drawable3).getPaint();
                            paint3.setShadowLayer(paint3.getShadowLayerRadius(), paint3.getShadowLayerDx(), paint3.getShadowLayerDy(), org.telegram.ui.ActionBar.k6.r1(this.x, f60Var.h));
                        }
                    }
                    f60Var.g.draw(canvas2);
                } else {
                    f11 = 1.0f;
                }
                if (f60Var.k > 0 || f60Var.l > 0) {
                    path.rewind();
                    boolean z10 = view instanceof e60;
                    RectF rectF2 = this.r;
                    if (z10) {
                        ((e60) view).g(rectF2);
                    } else {
                        rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
                    }
                    RectF rectF3 = org.telegram.messenger.g0.P;
                    float f19 = -rect.left;
                    float f20 = rectF2.left + f19;
                    float f21 = f60Var.k * this.x;
                    float f22 = -rect.top;
                    rectF3.set(f20 + f21, rectF2.top + f22 + f21, (f19 + rectF2.right) - f21, (f22 + rectF2.bottom) - f21);
                    float f23 = f60Var.l * this.x;
                    path.addRoundRect(rectF3, f23, f23, Path.Direction.CW);
                    canvas2.clipPath(path);
                }
                if (!(view instanceof org.telegram.ui.Cells.n7)) {
                    if (!(view instanceof ai.q2) || f60Var.N == 0 || f60Var.O == 0) {
                        if (f60Var.L) {
                            canvas.saveLayerAlpha(0.0f, 0.0f, view.getWidth(), view.getHeight(), (int) (this.x * f10), 31);
                            canvas2 = canvas;
                        } else {
                            canvas2 = canvas;
                            canvas2.save();
                        }
                        if (view instanceof e60) {
                            ((e60) view).h(canvas2, this.x);
                        } else {
                            canvas2.translate(-view.getScrollX(), -view.getScrollY());
                            view.draw(canvas2);
                        }
                        canvas2.restore();
                    } else if (view.getAlpha() >= 1.0f) {
                        ((ai.q2) view).b(this, canvas2, width, f18, this.x);
                        canvas2 = canvas;
                    } else {
                        canvas.saveLayerAlpha(0.0f, 0.0f, width, f18, (int) (this.x * f10), 31);
                        float T1 = org.telegram.messenger.g0.T1(1.0f, 0.9f, this.x);
                        canvas.scale(T1, T1, width / 2.0f, f18 / 2.0f);
                        ((ai.q2) view).b(this, canvas, width, f18, this.x);
                        canvas.restore();
                        canvas2 = canvas;
                    }
                    canvas2.restore();
                }
                if (view.getAlpha() >= f11) {
                    ((org.telegram.ui.Cells.n7) view).a(canvas2, width, f18, this.x);
                } else {
                    float f24 = width;
                    canvas2.saveLayerAlpha(0.0f, 0.0f, f24, f18, (int) (this.x * f10), 31);
                    float T12 = org.telegram.messenger.g0.T1(f11, 0.9f, this.x);
                    canvas2.scale(T12, T12, f24 / 2.0f, f18 / 2.0f);
                    ((org.telegram.ui.Cells.n7) view).a(canvas2, f24, f18, this.x);
                    canvas2.restore();
                }
                canvas2.restore();
            }
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i3, int i10, int i11, int i12) {
        super.onSizeChanged(i3, i10, i11, i12);
        f60 f60Var = this.y;
        jh.d.c(f60Var.n, this);
        ViewGroup viewGroup = f60Var.A;
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
