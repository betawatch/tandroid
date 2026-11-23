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

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class w60 extends View {
    public final int[] E;
    public final int[] F;
    public final /* synthetic */ a70 G;
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
    public w60(a70 a70Var, Context context) {
        super(context);
        float f10;
        this.G = a70Var;
        this.n = new Path();
        this.r = new RectF();
        this.y = new Path();
        this.E = new int[2];
        this.F = new int[2];
        View view = a70Var.f;
        Rect rect = a70Var.z;
        if (view == null || !(view.getParent() instanceof View)) {
            this.e = 0.0f;
            this.f = 0.0f;
        } else {
            this.e = view.getY() + ((View) view.getParent()).getY();
            if (a70Var.L) {
                f10 = Math.min(org.telegram.messenger.g0.L(68.0f), Math.max(0.0f, view.getY() + ((View) view.getParent()).getY() + view.getHeight()));
            } else {
                f10 = 0.0f;
            }
            this.f = f10;
        }
        this.h = i0.a.o(0, a70Var.s);
        if (a70Var.t && (view instanceof org.telegram.ui.Cells.ra) && (a70Var.c instanceof ProfileActivity)) {
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
        if (a70Var.u || a70Var.v) {
            this.d = new Paint(3);
            view.setAlpha(0.0f);
            ViewGroup viewGroup = a70Var.b;
            d dVar = new d(this, 18);
            if (viewGroup == null) {
                yk0.d(dVar);
            } else {
                int i7 = yk0.P;
                org.telegram.messenger.g0.l2(new rh(8, viewGroup, dVar), 15.0f);
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
        w60 w60Var;
        Canvas canvas2 = canvas;
        a70 a70Var = this.G;
        float[] fArr = a70Var.o;
        View view = a70Var.f;
        Rect rect = a70Var.z;
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
            canvas2.drawColor(org.telegram.ui.ActionBar.m6.r1(this.x, this.h));
        }
        if (a70Var.t) {
            float f19 = this.e;
            Bitmap bitmap = this.a;
            Path path = this.n;
            int i11 = 0;
            char c11 = 0;
            if (bitmap != null && (view.getParent() instanceof View)) {
                canvas2.save();
                if (f19 < 1.0f) {
                    canvas2.clipRect(-rect.left, (((-rect.top) + fArr[1]) - (f19 * (a70Var.u ? 1.0f - this.x : 1.0f))) + 1.0f, getMeasuredWidth() + rect.right, getMeasuredHeight() + rect.bottom);
                }
                if (a70Var.L) {
                    a70.B(view, a70Var.b, fArr);
                    canvas2.translate(org.telegram.messenger.g0.T1(fArr[0], this.s, this.x), org.telegram.messenger.g0.T1(fArr[1], this.w, this.x));
                } else {
                    canvas2.translate(fArr[0], fArr[1]);
                }
                Drawable drawable = a70Var.g;
                if (drawable != null) {
                    if (drawable.getIntrinsicWidth() <= 0 || a70Var.g.getIntrinsicHeight() <= 0) {
                        a70Var.g.setBounds(-rect.left, -rect.top, view.getWidth() + rect.right, view.getHeight() + rect.bottom);
                    } else {
                        a70Var.g.setBounds((((view.getWidth() + rect.right) - a70Var.g.getIntrinsicWidth()) / 2) + (-rect.left), (((view.getHeight() + rect.bottom) - a70Var.g.getIntrinsicHeight()) / 2) + (-rect.top), ((a70Var.g.getIntrinsicWidth() + (view.getWidth() + rect.right)) / 2) + (-rect.left), ((a70Var.g.getIntrinsicHeight() + (view.getHeight() + rect.bottom)) / 2) + (-rect.top));
                    }
                    a70Var.g.draw(canvas2);
                }
                if (a70Var.k > 0 || a70Var.l > 0) {
                    path.rewind();
                    RectF rectF = org.telegram.messenger.g0.P;
                    float f20 = -rect.left;
                    float f21 = a70Var.k;
                    rectF.set((this.x * f21) + f20, (getAlpha() * f21) + (-rect.top), (bitmap.getWidth() + (-rect.left)) - (getAlpha() * a70Var.k), (bitmap.getHeight() + (-rect.top)) - (getAlpha() * a70Var.k));
                    float f22 = a70Var.l * this.x;
                    path.addRoundRect(rectF, f22, f22, Path.Direction.CW);
                    canvas2.clipPath(path);
                }
                Paint paint2 = this.b;
                paint2.setAlpha(org.telegram.messenger.ls.e4);
                canvas2.drawBitmap(bitmap, -rect.left, -rect.top, paint2);
                canvas2.restore();
                return;
            }
            if (view != 0 && (view.getParent() instanceof View)) {
                canvas2.save();
                ArrayList arrayList = a70Var.P;
                int[] iArr5 = this.F;
                int[] iArr6 = this.E;
                if (arrayList != null) {
                    Path path2 = this.y;
                    path2.rewind();
                    getLocationInWindow(iArr5);
                    ArrayList arrayList2 = a70Var.P;
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
                            ((x60) view2).c(new v60(iArr6[i13] - iArr5[i13], iArr6[1] - iArr5[1], 0, this));
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
                        if (a70Var.L) {
                            canvas2.clipRect(-rect.left, org.telegram.messenger.g0.T1((((-rect.top) + fArr[1]) - (f19 * (a70Var.u ? 1.0f - this.x : 1.0f))) + 1.0f, 0.0f, this.x), getMeasuredWidth() + rect.right, com.google.android.gms.internal.vision.e2.t(1.0f, this.x, f23, getMeasuredHeight() + rect.bottom));
                        } else {
                            float f24 = -rect.left;
                            float f25 = (-rect.top) + fArr[1];
                            if (a70Var.u) {
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
                if (a70Var.L) {
                    a70.B(view, a70Var.b, fArr);
                    f13 = org.telegram.messenger.g0.T1(fArr[i7], this.s, f26);
                    f14 = org.telegram.messenger.g0.T1(fArr[c10], this.w, f26);
                    float T1 = org.telegram.messenger.g0.T1(1.0f, a70Var.R, f26);
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
                if (a70Var.N == 0 || a70Var.O == 0) {
                    width = view.getWidth();
                    height = view.getHeight();
                } else {
                    width = org.telegram.messenger.g0.W1(f26, view.getWidth(), a70Var.N);
                    height = org.telegram.messenger.g0.W1(f26, view.getHeight(), a70Var.O);
                }
                float f29 = height;
                float f30 = width;
                Drawable drawable2 = a70Var.g;
                if (drawable2 != null) {
                    if (drawable2.getIntrinsicWidth() <= 0 || a70Var.g.getIntrinsicHeight() <= 0) {
                        iArr2 = iArr6;
                        f16 = 2.0f;
                        f17 = f15;
                        a70Var.g.setBounds(-rect.left, -rect.top, view.getWidth() + rect.right, view.getHeight() + rect.bottom);
                    } else {
                        f16 = 2.0f;
                        iArr2 = iArr6;
                        a70Var.g.setBounds((((view.getWidth() + rect.right) - a70Var.g.getIntrinsicWidth()) / 2) + (-rect.left), (((view.getHeight() + rect.bottom) - a70Var.g.getIntrinsicHeight()) / 2) + (-rect.top), ((a70Var.g.getIntrinsicWidth() + (view.getWidth() + rect.right)) / 2) + (-rect.left), ((a70Var.g.getIntrinsicHeight() + (view.getHeight() + rect.bottom)) / 2) + (-rect.top));
                        f17 = f15;
                    }
                    a70Var.g.setAlpha((int) (this.x * f10));
                    if (Build.VERSION.SDK_INT >= 29) {
                        Drawable drawable3 = a70Var.g;
                        if (drawable3 instanceof ShapeDrawable) {
                            Paint paint3 = ((ShapeDrawable) drawable3).getPaint();
                            paint3.setShadowLayer(paint3.getShadowLayerRadius(), paint3.getShadowLayerDx(), paint3.getShadowLayerDy(), org.telegram.ui.ActionBar.m6.r1(this.x, a70Var.h));
                        }
                    }
                    a70Var.g.draw(canvas2);
                } else {
                    iArr2 = iArr6;
                    f16 = 2.0f;
                    f17 = f15;
                }
                if (a70Var.k > 0 || a70Var.l > 0) {
                    path.rewind();
                    boolean z10 = view instanceof z60;
                    RectF rectF2 = this.r;
                    if (z10) {
                        ((z60) view).f(rectF2);
                    } else {
                        rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
                    }
                    RectF rectF3 = org.telegram.messenger.g0.P;
                    float f31 = -rect.left;
                    float f32 = rectF2.left + f31;
                    float f33 = a70Var.k * this.x;
                    float f34 = -rect.top;
                    rectF3.set(f32 + f33, rectF2.top + f34 + f33, (f31 + rectF2.right) - f33, (f34 + rectF2.bottom) - f33);
                    float f35 = a70Var.l * this.x;
                    path.addRoundRect(rectF3, f35, f35, Path.Direction.CW);
                    canvas2.clipPath(path);
                }
                if (!(view instanceof org.telegram.ui.Cells.p7)) {
                    iArr3 = iArr;
                    iArr4 = iArr2;
                    if (!(view instanceof bi.g3) || a70Var.N == 0 || a70Var.O == 0) {
                        w60Var = this;
                        if (a70Var.L) {
                            canvas2 = canvas;
                            canvas2.saveLayerAlpha(0.0f, 0.0f, view.getWidth(), view.getHeight(), (int) (w60Var.x * f10), 31);
                        } else {
                            canvas2 = canvas;
                            canvas2.save();
                        }
                        if (view instanceof z60) {
                            ((z60) view).h(canvas2, w60Var.x);
                        } else {
                            canvas2.translate(-view.getScrollX(), -view.getScrollY());
                            view.draw(canvas2);
                        }
                        canvas2.restore();
                    } else if (view.getAlpha() >= 1.0f) {
                        ((bi.g3) view).b(this, canvas, f30, f29, this.x);
                        canvas2 = canvas;
                        w60Var = this;
                    } else {
                        w60Var = this;
                        canvas.saveLayerAlpha(0.0f, 0.0f, f30, f29, (int) (w60Var.x * f10), 31);
                        float T12 = org.telegram.messenger.g0.T1(1.0f, 0.9f, w60Var.x);
                        canvas.scale(T12, T12, f30 / f16, f29 / f16);
                        ((bi.g3) view).b(w60Var, canvas, f30, f29, w60Var.x);
                        canvas.restore();
                        canvas2 = canvas;
                    }
                } else if (view.getAlpha() >= 1.0f) {
                    ((org.telegram.ui.Cells.p7) view).a(canvas2, f30, f29, this.x);
                    w60Var = this;
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
                    w60Var = this;
                }
                float f36 = 1.0f - w60Var.x;
                ArrayList arrayList3 = a70Var.Q;
                if (arrayList3 != null && !arrayList3.isEmpty() && f36 > 0.0f) {
                    w60Var.getLocationInWindow(iArr3);
                    canvas2.save();
                    int i14 = i7;
                    canvas2.clipRect(i14, i14, view.getWidth(), view.getHeight());
                    float f37 = 1.0f / f17;
                    canvas2.scale(f37, f37, view.getWidth() / f16, 0.0f);
                    canvas2.translate(-f28, -f27);
                    ArrayList arrayList4 = a70Var.Q;
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
        a70 a70Var = this.G;
        ih.d.c(a70Var.n, this);
        ViewGroup viewGroup = a70Var.A;
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
