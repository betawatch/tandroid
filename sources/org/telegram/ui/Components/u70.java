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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class u70 extends View {
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
    public final /* synthetic */ w70 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u70(w70 w70Var, Context context) {
        super(context);
        float f7;
        this.x = w70Var;
        this.n = new Path();
        this.r = new RectF();
        View view = w70Var.f;
        Rect rect = w70Var.z;
        if (view == null || !(view.getParent() instanceof View)) {
            this.e = 0.0f;
            this.f = 0.0f;
        } else {
            this.e = view.getY() + ((View) view.getParent()).getY();
            if (w70Var.L) {
                f7 = Math.min(AndroidUtilities.dp(68.0f), Math.max(0.0f, view.getY() + ((View) view.getParent()).getY() + view.getHeight()));
            } else {
                f7 = 0.0f;
            }
            this.f = f7;
        }
        this.h = i0.a.k(0, w70Var.s);
        if (w70Var.t && (view instanceof org.telegram.ui.Cells.bb) && (w70Var.c instanceof ProfileActivity)) {
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
        if (w70Var.u || w70Var.v) {
            this.d = new Paint(3);
            view.setAlpha(0.0f);
            ViewGroup viewGroup = w70Var.b;
            e eVar = new e(this, 17);
            if (viewGroup == null) {
                km0.d(eVar);
            } else {
                int i10 = km0.O;
                AndroidUtilities.makeGlobalBlurBitmap(new org.telegram.ui.pf(20, viewGroup, eVar), 15.0f);
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
        w70 w70Var = this.x;
        float[] fArr = w70Var.o;
        View view = w70Var.f;
        Rect rect = w70Var.z;
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
            canvas2.drawColor(org.telegram.ui.ActionBar.j6.l1(this.w, this.h));
        }
        if (w70Var.t) {
            float f11 = this.e;
            Bitmap bitmap = this.a;
            Path path = this.n;
            if (bitmap != null && (view.getParent() instanceof View)) {
                canvas2.save();
                if (f11 < 1.0f) {
                    canvas2.clipRect(-rect.left, (((-rect.top) + fArr[1]) - (f11 * (w70Var.u ? 1.0f - this.w : 1.0f))) + 1.0f, getMeasuredWidth() + rect.right, getMeasuredHeight() + rect.bottom);
                }
                if (w70Var.L) {
                    w70.A(view, w70Var.b, fArr);
                    canvas2.translate(AndroidUtilities.lerp(fArr[0], this.s, this.w), AndroidUtilities.lerp(fArr[1], this.v, this.w));
                } else {
                    canvas2.translate(fArr[0], fArr[1]);
                }
                Drawable drawable = w70Var.g;
                if (drawable != null) {
                    if (drawable.getIntrinsicWidth() <= 0 || w70Var.g.getIntrinsicHeight() <= 0) {
                        w70Var.g.setBounds(-rect.left, -rect.top, view.getWidth() + rect.right, view.getHeight() + rect.bottom);
                    } else {
                        w70Var.g.setBounds((((view.getWidth() + rect.right) - w70Var.g.getIntrinsicWidth()) / 2) + (-rect.left), (((view.getHeight() + rect.bottom) - w70Var.g.getIntrinsicHeight()) / 2) + (-rect.top), ((w70Var.g.getIntrinsicWidth() + (view.getWidth() + rect.right)) / 2) + (-rect.left), ((w70Var.g.getIntrinsicHeight() + (view.getHeight() + rect.bottom)) / 2) + (-rect.top));
                    }
                    w70Var.g.draw(canvas2);
                }
                if (w70Var.k > 0 || w70Var.l > 0) {
                    path.rewind();
                    RectF rectF = AndroidUtilities.rectTmp;
                    float f12 = -rect.left;
                    float f13 = w70Var.k;
                    rectF.set((this.w * f13) + f12, (getAlpha() * f13) + (-rect.top), (bitmap.getWidth() + (-rect.left)) - (getAlpha() * w70Var.k), (bitmap.getHeight() + (-rect.top)) - (getAlpha() * w70Var.k));
                    float f14 = w70Var.l * this.w;
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
                    f7 = 255.0f;
                    c10 = 0;
                } else if (w70Var.L) {
                    f7 = 255.0f;
                    c10 = 0;
                    canvas2.clipRect(-rect.left, AndroidUtilities.lerp((((-rect.top) + fArr[1]) - (f11 * (w70Var.u ? 1.0f - this.w : 1.0f))) + 1.0f, 0.0f, this.w), getMeasuredWidth() + rect.right, com.google.android.gms.internal.vision.e2.a(1.0f, this.w, f15, getMeasuredHeight() + rect.bottom));
                } else {
                    f7 = 255.0f;
                    c10 = 0;
                    canvas2.clipRect(-rect.left, (((-rect.top) + fArr[1]) - (f11 * (w70Var.u ? 1.0f - this.w : 1.0f))) + 1.0f, getMeasuredWidth() + rect.right, getMeasuredHeight() + rect.bottom);
                }
                float f16 = this.w;
                if (w70Var.L) {
                    w70.A(view, w70Var.b, fArr);
                    canvas2.translate(AndroidUtilities.lerp(fArr[c10], this.s, f16), AndroidUtilities.lerp(fArr[1], this.v, f16));
                } else {
                    canvas2.translate(fArr[c10], fArr[1]);
                }
                if (w70Var.N == 0 || w70Var.O == 0) {
                    width = view.getWidth();
                    height = view.getHeight();
                } else {
                    width = AndroidUtilities.lerp(view.getWidth(), w70Var.N, f16);
                    height = AndroidUtilities.lerp(view.getHeight(), w70Var.O, f16);
                }
                float f17 = height;
                Drawable drawable2 = w70Var.g;
                if (drawable2 != null) {
                    if (drawable2.getIntrinsicWidth() <= 0 || w70Var.g.getIntrinsicHeight() <= 0) {
                        f10 = 1.0f;
                        w70Var.g.setBounds(-rect.left, -rect.top, view.getWidth() + rect.right, view.getHeight() + rect.bottom);
                    } else {
                        f10 = 1.0f;
                        w70Var.g.setBounds((((view.getWidth() + rect.right) - w70Var.g.getIntrinsicWidth()) / 2) + (-rect.left), (((view.getHeight() + rect.bottom) - w70Var.g.getIntrinsicHeight()) / 2) + (-rect.top), ((w70Var.g.getIntrinsicWidth() + (view.getWidth() + rect.right)) / 2) + (-rect.left), ((w70Var.g.getIntrinsicHeight() + (view.getHeight() + rect.bottom)) / 2) + (-rect.top));
                    }
                    w70Var.g.setAlpha((int) (this.w * f7));
                    if (Build.VERSION.SDK_INT >= 29) {
                        Drawable drawable3 = w70Var.g;
                        if (drawable3 instanceof ShapeDrawable) {
                            Paint paint3 = ((ShapeDrawable) drawable3).getPaint();
                            paint3.setShadowLayer(paint3.getShadowLayerRadius(), paint3.getShadowLayerDx(), paint3.getShadowLayerDy(), org.telegram.ui.ActionBar.j6.l1(this.w, w70Var.h));
                        }
                    }
                    w70Var.g.draw(canvas2);
                } else {
                    f10 = 1.0f;
                }
                if (w70Var.k > 0 || w70Var.l > 0) {
                    path.rewind();
                    boolean z10 = view instanceof v70;
                    RectF rectF2 = this.r;
                    if (z10) {
                        ((v70) view).a(rectF2);
                    } else {
                        rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
                    }
                    RectF rectF3 = AndroidUtilities.rectTmp;
                    float f18 = -rect.left;
                    float f19 = rectF2.left + f18;
                    float f20 = w70Var.k * this.w;
                    float f21 = -rect.top;
                    rectF3.set(f19 + f20, rectF2.top + f21 + f20, (f18 + rectF2.right) - f20, (f21 + rectF2.bottom) - f20);
                    float f22 = w70Var.l * this.w;
                    path.addRoundRect(rectF3, f22, f22, Path.Direction.CW);
                    canvas2.clipPath(path);
                }
                if (!(view instanceof org.telegram.ui.Cells.u7)) {
                    if (!(view instanceof wh.h1) || w70Var.N == 0 || w70Var.O == 0) {
                        if (w70Var.L) {
                            canvas.saveLayerAlpha(0.0f, 0.0f, view.getWidth(), view.getHeight(), (int) (this.w * f7), 31);
                            canvas2 = canvas;
                        } else {
                            canvas2 = canvas;
                            canvas2.save();
                        }
                        if (view instanceof v70) {
                            ((v70) view).c(canvas2, this.w);
                        } else {
                            canvas2.translate(-view.getScrollX(), -view.getScrollY());
                            view.draw(canvas2);
                        }
                        canvas2.restore();
                    } else if (view.getAlpha() >= 1.0f) {
                        ((wh.h1) view).a(this, canvas2, width, f17, this.w);
                        canvas2 = canvas;
                    } else {
                        canvas.saveLayerAlpha(0.0f, 0.0f, width, f17, (int) (this.w * f7), 31);
                        float lerp = AndroidUtilities.lerp(1.0f, 0.9f, this.w);
                        canvas.scale(lerp, lerp, width / 2.0f, f17 / 2.0f);
                        ((wh.h1) view).a(this, canvas, width, f17, this.w);
                        canvas.restore();
                        canvas2 = canvas;
                    }
                    canvas2.restore();
                }
                if (view.getAlpha() >= f10) {
                    ((org.telegram.ui.Cells.u7) view).a(canvas2, width, f17, this.w);
                } else {
                    float f23 = width;
                    canvas2.saveLayerAlpha(0.0f, 0.0f, f23, f17, (int) (this.w * f7), 31);
                    float lerp2 = AndroidUtilities.lerp(1.0f, 0.9f, this.w);
                    canvas2.scale(lerp2, lerp2, f23 / 2.0f, f17 / 2.0f);
                    ((org.telegram.ui.Cells.u7) view).a(canvas2, f23, f17, this.w);
                    canvas2.restore();
                }
                canvas2.restore();
            }
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        w70 w70Var = this.x;
        fh.d.c(w70Var.n, this);
        ViewGroup viewGroup = w70Var.A;
        if (viewGroup != null) {
            viewGroup.invalidate();
        }
    }

    public void setProgress(float f7) {
        if (this.w == f7) {
            return;
        }
        this.w = f7;
        invalidate();
    }
}
