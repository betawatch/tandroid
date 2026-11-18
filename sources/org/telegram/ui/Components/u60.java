package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class u60 extends View {
    public final int[] E;
    public final int[] F;
    public final /* synthetic */ y60 G;
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
    public final Path y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u60(y60 y60Var, Context context) {
        super(context);
        float f10;
        this.G = y60Var;
        this.n = new Path();
        this.r = new RectF();
        this.y = new Path();
        this.E = new int[2];
        this.F = new int[2];
        View view = y60Var.f;
        Rect rect = y60Var.z;
        if (view == null || !(view.getParent() instanceof View)) {
            this.e = 0.0f;
            this.f = 0.0f;
        } else {
            this.e = view.getY() + ((View) view.getParent()).getY();
            if (y60Var.L) {
                f10 = Math.min(org.telegram.messenger.g0.L(68.0f), Math.max(0.0f, view.getY() + ((View) view.getParent()).getY() + view.getHeight()));
            } else {
                f10 = 0.0f;
            }
            this.f = f10;
        }
        this.h = i0.a.o(0, y60Var.s);
        if (y60Var.t && (view instanceof org.telegram.ui.Cells.ra) && (y60Var.c instanceof ProfileActivity)) {
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
        if (y60Var.u || y60Var.v) {
            this.d = new Paint(3);
            view.setAlpha(0.0f);
            ViewGroup viewGroup = y60Var.b;
            d dVar = new d(this, 18);
            if (viewGroup == null) {
                wk0.d(dVar);
            } else {
                int i7 = wk0.P;
                org.telegram.messenger.g0.l2(new ph(8, viewGroup, dVar), 15.0f);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int[] iArr;
        float f10;
        int i7;
        char c10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float width;
        int height;
        int[] iArr2;
        float f16;
        float f17;
        int[] iArr3;
        int[] iArr4;
        u60 u60Var;
        Canvas canvas2 = canvas;
        y60 y60Var = this.G;
        float[] fArr = y60Var.o;
        View view = y60Var.f;
        Rect rect = y60Var.z;
        super.onDraw(canvas);
        float f18 = 0.0f;
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
            canvas2.drawColor(org.telegram.ui.ActionBar.n6.r1(this.x, this.h));
        }
        if (y60Var.t) {
            float f19 = this.e;
            Bitmap bitmap = this.a;
            Path path = this.n;
            int i11 = 0;
            char c11 = 0;
            if (bitmap != null && (view.getParent() instanceof View)) {
                canvas2.save();
                if (f19 < 1.0f) {
                    canvas2.clipRect(-rect.left, (((-rect.top) + fArr[1]) - (f19 * (y60Var.u ? 1.0f - this.x : 1.0f))) + 1.0f, getMeasuredWidth() + rect.right, getMeasuredHeight() + rect.bottom);
                }
                if (y60Var.L) {
                    y60.B(view, y60Var.b, fArr);
                    canvas2.translate(org.telegram.messenger.g0.T1(fArr[0], this.s, this.x), org.telegram.messenger.g0.T1(fArr[1], this.w, this.x));
                } else {
                    canvas2.translate(fArr[0], fArr[1]);
                }
                Drawable drawable = y60Var.g;
                if (drawable != null) {
                    if (drawable.getIntrinsicWidth() <= 0 || y60Var.g.getIntrinsicHeight() <= 0) {
                        y60Var.g.setBounds(-rect.left, -rect.top, view.getWidth() + rect.right, view.getHeight() + rect.bottom);
                    } else {
                        y60Var.g.setBounds((((view.getWidth() + rect.right) - y60Var.g.getIntrinsicWidth()) / 2) + (-rect.left), (((view.getHeight() + rect.bottom) - y60Var.g.getIntrinsicHeight()) / 2) + (-rect.top), ((y60Var.g.getIntrinsicWidth() + (view.getWidth() + rect.right)) / 2) + (-rect.left), ((y60Var.g.getIntrinsicHeight() + (view.getHeight() + rect.bottom)) / 2) + (-rect.top));
                    }
                    y60Var.g.draw(canvas2);
                }
                if (y60Var.k > 0 || y60Var.l > 0) {
                    path.rewind();
                    RectF rectF = org.telegram.messenger.g0.P;
                    float f20 = -rect.left;
                    float f21 = y60Var.k;
                    rectF.set((this.x * f21) + f20, (getAlpha() * f21) + (-rect.top), (bitmap.getWidth() + (-rect.left)) - (getAlpha() * y60Var.k), (bitmap.getHeight() + (-rect.top)) - (getAlpha() * y60Var.k));
                    float f22 = y60Var.l * this.x;
                    path.addRoundRect(rectF, f22, f22, Path.Direction.CW);
                    canvas2.clipPath(path);
                }
                Paint paint2 = this.b;
                paint2.setAlpha(org.telegram.messenger.ks.e4);
                canvas2.drawBitmap(bitmap, -rect.left, -rect.top, paint2);
                canvas2.restore();
                return;
            }
            if (view != 0 && (view.getParent() instanceof View)) {
                canvas2.save();
                ArrayList arrayList = y60Var.P;
                int[] iArr5 = this.F;
                int[] iArr6 = this.E;
                if (arrayList != null) {
                    Path path2 = this.y;
                    path2.rewind();
                    getLocationInWindow(iArr5);
                    ArrayList arrayList2 = y60Var.P;
                    f10 = 255.0f;
                    int size = arrayList2.size();
                    c10 = 1;
                    int i12 = 0;
                    while (i12 < size) {
                        Object obj = arrayList2.get(i12);
                        i12++;
                        int i13 = i11;
                        View view2 = (View) obj;
                        if (!view2.isShown() || view2.getAlpha() <= f18) {
                            i11 = i13;
                        } else {
                            view2.getLocationInWindow(iArr6);
                            ((v60) view2).c(new t60(iArr6[i13] - iArr5[i13], iArr6[1] - iArr5[1], 0, this));
                            arrayList2 = arrayList2;
                            i11 = i13;
                            iArr5 = iArr5;
                            c11 = c11;
                            f18 = f18;
                        }
                    }
                    iArr = iArr5;
                    i7 = i11;
                    if (!path2.isEmpty()) {
                        if (Build.VERSION.SDK_INT >= 26) {
                            canvas2.clipOutPath(path2);
                        } else {
                            canvas2.clipPath(path2, Region.Op.DIFFERENCE);
                        }
                    }
                } else {
                    iArr = iArr5;
                    f10 = 255.0f;
                    i7 = 0;
                    c10 = 1;
                    float f23 = this.f;
                    if (f19 < 1.0f || f23 != 0.0f) {
                        if (y60Var.L) {
                            canvas2.clipRect(-rect.left, org.telegram.messenger.g0.T1((((-rect.top) + fArr[1]) - (f19 * (y60Var.u ? 1.0f - this.x : 1.0f))) + 1.0f, 0.0f, this.x), getMeasuredWidth() + rect.right, com.google.android.gms.internal.vision.e2.t(1.0f, this.x, f23, getMeasuredHeight() + rect.bottom));
                        } else {
                            float f24 = -rect.left;
                            float f25 = (-rect.top) + fArr[1];
                            if (y60Var.u) {
                                f11 = 1.0f;
                                f12 = 1.0f - this.x;
                            } else {
                                f11 = 1.0f;
                                f12 = 1.0f;
                            }
                            canvas2.clipRect(f24, (f25 - (f19 * f12)) + f11, getMeasuredWidth() + rect.right, getMeasuredHeight() + rect.bottom);
                        }
                    }
                }
                float f26 = this.x;
                if (y60Var.L) {
                    y60.B(view, y60Var.b, fArr);
                    f13 = org.telegram.messenger.g0.T1(fArr[i7], this.s, f26);
                    f14 = org.telegram.messenger.g0.T1(fArr[c10], this.w, f26);
                    float T1 = org.telegram.messenger.g0.T1(1.0f, y60Var.R, f26);
                    canvas2.translate(f13, f14);
                    if (T1 != 1.0f) {
                        canvas2.scale(T1, T1, view.getWidth() / 2.0f, 0.0f);
                    }
                    f15 = T1;
                } else {
                    f13 = fArr[i7];
                    f14 = fArr[c10];
                    canvas2.translate(f13, f14);
                    f15 = 1.0f;
                }
                float f27 = f14;
                float f28 = f13;
                if (y60Var.N == 0 || y60Var.O == 0) {
                    width = view.getWidth();
                    height = view.getHeight();
                } else {
                    width = org.telegram.messenger.g0.W1(f26, view.getWidth(), y60Var.N);
                    height = org.telegram.messenger.g0.W1(f26, view.getHeight(), y60Var.O);
                }
                float f29 = height;
                float f30 = width;
                Drawable drawable2 = y60Var.g;
                if (drawable2 != null) {
                    if (drawable2.getIntrinsicWidth() <= 0 || y60Var.g.getIntrinsicHeight() <= 0) {
                        iArr2 = iArr6;
                        f16 = 2.0f;
                        f17 = f15;
                        y60Var.g.setBounds(-rect.left, -rect.top, view.getWidth() + rect.right, view.getHeight() + rect.bottom);
                    } else {
                        f16 = 2.0f;
                        iArr2 = iArr6;
                        y60Var.g.setBounds((((view.getWidth() + rect.right) - y60Var.g.getIntrinsicWidth()) / 2) + (-rect.left), (((view.getHeight() + rect.bottom) - y60Var.g.getIntrinsicHeight()) / 2) + (-rect.top), ((y60Var.g.getIntrinsicWidth() + (view.getWidth() + rect.right)) / 2) + (-rect.left), ((y60Var.g.getIntrinsicHeight() + (view.getHeight() + rect.bottom)) / 2) + (-rect.top));
                        f17 = f15;
                    }
                    y60Var.g.setAlpha((int) (this.x * f10));
                    if (Build.VERSION.SDK_INT >= 29) {
                        Drawable drawable3 = y60Var.g;
                        if (drawable3 instanceof ShapeDrawable) {
                            Paint paint3 = ((ShapeDrawable) drawable3).getPaint();
                            paint3.setShadowLayer(paint3.getShadowLayerRadius(), paint3.getShadowLayerDx(), paint3.getShadowLayerDy(), org.telegram.ui.ActionBar.n6.r1(this.x, y60Var.h));
                        }
                    }
                    y60Var.g.draw(canvas2);
                } else {
                    iArr2 = iArr6;
                    f16 = 2.0f;
                    f17 = f15;
                }
                if (y60Var.k > 0 || y60Var.l > 0) {
                    path.rewind();
                    boolean z10 = view instanceof x60;
                    RectF rectF2 = this.r;
                    if (z10) {
                        ((x60) view).f(rectF2);
                    } else {
                        rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
                    }
                    RectF rectF3 = org.telegram.messenger.g0.P;
                    float f31 = -rect.left;
                    float f32 = rectF2.left + f31;
                    float f33 = y60Var.k * this.x;
                    float f34 = -rect.top;
                    rectF3.set(f32 + f33, rectF2.top + f34 + f33, (f31 + rectF2.right) - f33, (f34 + rectF2.bottom) - f33);
                    float f35 = y60Var.l * this.x;
                    path.addRoundRect(rectF3, f35, f35, Path.Direction.CW);
                    canvas2.clipPath(path);
                }
                if (!(view instanceof org.telegram.ui.Cells.p7)) {
                    iArr3 = iArr;
                    iArr4 = iArr2;
                    if (!(view instanceof bi.c3) || y60Var.N == 0 || y60Var.O == 0) {
                        u60Var = this;
                        if (y60Var.L) {
                            canvas2 = canvas;
                            canvas2.saveLayerAlpha(0.0f, 0.0f, view.getWidth(), view.getHeight(), (int) (u60Var.x * f10), 31);
                        } else {
                            canvas2 = canvas;
                            canvas2.save();
                        }
                        if (view instanceof x60) {
                            ((x60) view).h(canvas2, u60Var.x);
                        } else {
                            canvas2.translate(-view.getScrollX(), -view.getScrollY());
                            view.draw(canvas2);
                        }
                        canvas2.restore();
                    } else if (view.getAlpha() >= 1.0f) {
                        ((bi.c3) view).b(this, canvas, f30, f29, this.x);
                        canvas2 = canvas;
                        u60Var = this;
                    } else {
                        u60Var = this;
                        canvas.saveLayerAlpha(0.0f, 0.0f, f30, f29, (int) (u60Var.x * f10), 31);
                        float T12 = org.telegram.messenger.g0.T1(1.0f, 0.9f, u60Var.x);
                        canvas.scale(T12, T12, f30 / f16, f29 / f16);
                        ((bi.c3) view).b(u60Var, canvas, f30, f29, u60Var.x);
                        canvas.restore();
                        canvas2 = canvas;
                    }
                } else if (view.getAlpha() >= 1.0f) {
                    ((org.telegram.ui.Cells.p7) view).a(canvas2, f30, f29, this.x);
                    u60Var = this;
                    iArr3 = iArr;
                    iArr4 = iArr2;
                } else {
                    iArr3 = iArr;
                    iArr4 = iArr2;
                    canvas2.saveLayerAlpha(0.0f, 0.0f, f30, f29, (int) (this.x * f10), 31);
                    float T13 = org.telegram.messenger.g0.T1(1.0f, 0.9f, this.x);
                    canvas2.scale(T13, T13, f30 / f16, f29 / f16);
                    ((org.telegram.ui.Cells.p7) view).a(canvas2, f30, f29, this.x);
                    canvas2.restore();
                    u60Var = this;
                }
                float f36 = 1.0f - u60Var.x;
                ArrayList arrayList3 = y60Var.Q;
                if (arrayList3 != null && !arrayList3.isEmpty() && f36 > 0.0f) {
                    u60Var.getLocationInWindow(iArr3);
                    canvas2.save();
                    int i14 = i7;
                    canvas2.clipRect(i14, i14, view.getWidth(), view.getHeight());
                    float f37 = 1.0f / f17;
                    canvas2.scale(f37, f37, view.getWidth() / f16, 0.0f);
                    canvas2.translate(-f28, -f27);
                    ArrayList arrayList4 = y60Var.Q;
                    int size2 = arrayList4.size();
                    int i15 = 0;
                    while (i15 < size2) {
                        int i16 = i15 + 1;
                        View view3 = (View) arrayList4.get(i15);
                        if (view3.isShown() && view3.getAlpha() > 0.0f) {
                            view3.getLocationInWindow(iArr4);
                            canvas2.save();
                            canvas2.translate(iArr4[0] - iArr3[0], iArr4[c10] - iArr3[c10]);
                            canvas2.saveLayerAlpha(0.0f, 0.0f, view3.getWidth(), view3.getHeight(), (int) (view3.getAlpha() * f36 * f10));
                            view3.draw(canvas2);
                            canvas2.restore();
                            canvas2.restore();
                        }
                        i15 = i16;
                    }
                    canvas2.restore();
                }
                canvas2.restore();
            }
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        y60 y60Var = this.G;
        ih.d.c(y60Var.n, this);
        ViewGroup viewGroup = y60Var.A;
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
