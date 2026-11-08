package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class em0 extends View implements org.telegram.ui.ActionBar.a6 {
    public final org.telegram.ui.ActionBar.f6 a;
    public final Paint b;
    public final int c;
    public final int d;
    public boolean e;
    public dm0[] f;
    public final int[] h;
    public final Paint n;
    public boolean r;
    public int s;
    public org.telegram.messenger.c20 w;
    public dm0 x;

    public em0(int i7, int i10, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        Paint paint = new Paint(1);
        this.b = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.h = new int[]{5, 3, 1, 0, 2, 4, 6, -1};
        this.n = new Paint(1);
        this.r = true;
        this.s = 0;
        this.c = i7;
        this.d = i10;
        this.a = f6Var;
    }

    public final void a(int i7, boolean z9) {
        this.s = i7;
        if (this.f == null) {
            return;
        }
        int i10 = 0;
        while (true) {
            dm0[] dm0VarArr = this.f;
            if (i10 >= dm0VarArr.length) {
                return;
            }
            dm0 dm0Var = dm0VarArr[i10];
            boolean z10 = dm0Var.o == i7;
            dm0Var.m = z10;
            if (!z9) {
                dm0Var.n.f(z10, true);
            }
            dm0Var.r.invalidate();
            i10++;
        }
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.f != null) {
            int i7 = 0;
            while (true) {
                dm0[] dm0VarArr = this.f;
                if (i7 >= dm0VarArr.length) {
                    break;
                }
                dm0 dm0Var = dm0VarArr[i7];
                em0 em0Var = dm0Var.r;
                Path path = dm0Var.e;
                canvas.save();
                float a10 = dm0Var.l.a(0.05f);
                RectF rectF = dm0Var.p;
                canvas.scale(a10, a10, rectF.centerX(), rectF.centerY());
                canvas.save();
                Path path2 = dm0Var.d;
                path2.rewind();
                path2.addCircle(rectF.centerX(), rectF.centerY(), Math.min(rectF.height() / 2.0f, rectF.width() / 2.0f), Path.Direction.CW);
                canvas.clipPath(path2);
                canvas.drawPaint(dm0Var.a);
                if (dm0Var.f) {
                    path.rewind();
                    path.moveTo(rectF.right, rectF.top);
                    path.lineTo(rectF.right, rectF.bottom);
                    path.lineTo(rectF.left, rectF.bottom);
                    path.close();
                    canvas.drawPath(path, dm0Var.b);
                }
                canvas.restore();
                if (dm0Var.g) {
                    canvas.save();
                    float width = rectF.width() * 0.315f;
                    RectF rectF2 = org.telegram.messenger.g0.P;
                    float f10 = width / 2.0f;
                    rectF2.set(rectF.centerX() - f10, rectF.centerY() - f10, rectF.centerX() + f10, rectF.centerY() + f10);
                    canvas.rotate(45.0f, rectF.centerX(), rectF.centerY());
                    canvas.drawRoundRect(rectF2, org.telegram.messenger.g0.L(2.33f), org.telegram.messenger.g0.L(2.33f), dm0Var.c);
                    canvas.restore();
                }
                float d = dm0Var.n.d(dm0Var.m);
                if (d > 0.0f) {
                    Paint paint = em0Var.b;
                    Paint paint2 = em0Var.b;
                    paint.setStrokeWidth(org.telegram.messenger.g0.N(2.0f));
                    paint2.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.d6, em0Var.a));
                    canvas.drawCircle(rectF.centerX(), rectF.centerY(), (org.telegram.messenger.g0.T1(0.5f, -2.0f, d) * paint2.getStrokeWidth()) + Math.min(rectF.height() / 2.0f, rectF.width() / 2.0f), paint2);
                }
                if (dm0Var.h) {
                    if (em0Var.e) {
                        if (dm0Var.k == null) {
                            Drawable drawable = em0Var.getContext().getResources().getDrawable(R.drawable.msg_mini_lock3);
                            dm0Var.k = drawable;
                            drawable.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                        }
                        dm0Var.k.setBounds((int) org.telegram.messenger.camera.q.v(dm0Var.k.getIntrinsicWidth(), 2.0f, 1.2f, rectF.centerX()), (int) org.telegram.messenger.camera.q.v(dm0Var.k.getIntrinsicHeight(), 2.0f, 1.2f, rectF.centerY()), (int) com.google.android.recaptcha.internal.a.c(dm0Var.k.getIntrinsicWidth(), 2.0f, 1.2f, rectF.centerX()), (int) com.google.android.recaptcha.internal.a.c(dm0Var.k.getIntrinsicHeight(), 2.0f, 1.2f, rectF.centerY()));
                        dm0Var.k.draw(canvas);
                    } else {
                        if (dm0Var.i == null) {
                            dm0Var.i = new Path();
                        }
                        if (dm0Var.j == null) {
                            Paint paint3 = new Paint(1);
                            dm0Var.j = paint3;
                            paint3.setColor(-1);
                            dm0Var.j.setStyle(Paint.Style.STROKE);
                            dm0Var.j.setStrokeCap(Paint.Cap.ROUND);
                        }
                        dm0Var.j.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
                        dm0Var.i.rewind();
                        float W1 = org.telegram.messenger.g0.W1(d, org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(4.0f));
                        dm0Var.i.moveTo(rectF.centerX() - W1, rectF.centerY() - W1);
                        dm0Var.i.lineTo(rectF.centerX() + W1, rectF.centerY() + W1);
                        dm0Var.i.moveTo(rectF.centerX() + W1, rectF.centerY() - W1);
                        dm0Var.i.lineTo(rectF.centerX() - W1, rectF.centerY() + W1);
                        canvas.drawPath(dm0Var.i, dm0Var.j);
                    }
                }
                canvas.restore();
                i7++;
            }
        }
        if (this.r) {
            int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.d7, this.a);
            Paint paint4 = this.n;
            paint4.setColor(w02);
            canvas.drawRect(org.telegram.messenger.g0.L(21.0f), getMeasuredHeight() - 1, getMeasuredWidth() - org.telegram.messenger.g0.L(21.0f), getMeasuredHeight(), paint4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0045  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        dm0 dm0Var;
        dm0 dm0Var2;
        org.telegram.messenger.c20 c20Var;
        org.telegram.messenger.c20 c20Var2;
        if (this.f != null) {
            int i7 = 0;
            while (true) {
                dm0[] dm0VarArr = this.f;
                if (i7 >= dm0VarArr.length) {
                    break;
                }
                if (dm0VarArr[i7].q.contains(motionEvent.getX(), motionEvent.getY())) {
                    dm0Var = this.f[i7];
                    break;
                }
                i7++;
            }
            if (motionEvent.getAction() != 0) {
                this.x = dm0Var;
                if (dm0Var != null) {
                    dm0Var.l.c(true);
                }
                if (getParent() != null) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                    return true;
                }
            } else if (motionEvent.getAction() == 2) {
                dm0 dm0Var3 = this.x;
                if (dm0Var3 != dm0Var) {
                    if (dm0Var3 != null) {
                        dm0Var3.l.c(false);
                    }
                    if (dm0Var != null) {
                        dm0Var.l.c(true);
                    }
                    if (this.x != null && dm0Var != null && (c20Var2 = this.w) != null) {
                        c20Var2.a(Integer.valueOf(dm0Var.o));
                    }
                    this.x = dm0Var;
                    return true;
                }
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                if (motionEvent.getAction() == 1 && (dm0Var2 = this.x) != null && (c20Var = this.w) != null) {
                    c20Var.a(Integer.valueOf(dm0Var2.o));
                }
                if (this.f != null) {
                    int i10 = 0;
                    while (true) {
                        dm0[] dm0VarArr2 = this.f;
                        if (i10 >= dm0VarArr2.length) {
                            break;
                        }
                        dm0VarArr2[i10].l.c(false);
                        i10++;
                    }
                }
                this.x = null;
                return true;
            }
            return true;
        }
        dm0Var = null;
        if (motionEvent.getAction() != 0) {
        }
        return true;
    }

    public int getColorId() {
        return this.s;
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        int i11;
        int size = View.MeasureSpec.getSize(i7);
        org.telegram.messenger.qp s12 = org.telegram.messenger.qp.s1(this.d);
        int i12 = this.c;
        org.telegram.messenger.gp gpVar = i12 == 1 ? s12.q4 : s12.r4;
        int size2 = gpVar == null ? 0 : gpVar.c.size();
        int i13 = 8;
        int i14 = 2;
        if (i12 == 2) {
            size2 = 8;
        }
        if (i12 != 2 && i12 == 1) {
            i13 = 7;
        }
        float f10 = size;
        float f11 = i13;
        float f12 = i13 + 1;
        float min = Math.min(org.telegram.messenger.g0.L(54.0f), f10 / ((f12 * 0.28947f) + f11));
        float min2 = Math.min(0.28947f * min, org.telegram.messenger.g0.L(8.0f));
        float min3 = Math.min(0.31578946f * min, org.telegram.messenger.g0.L(11.33f));
        boolean z9 = true;
        setMeasuredDimension(size, (int) (((r15 + 1) * min3) + ((size2 / i13) * min)));
        dm0[] dm0VarArr = this.f;
        if (dm0VarArr == null || dm0VarArr.length != size2) {
            this.f = new dm0[size2];
            int i15 = 0;
            while (i15 < size2) {
                this.f[i15] = new dm0(this);
                if (i12 == i14) {
                    dm0 dm0Var = this.f[i15];
                    int i16 = this.h[i15];
                    dm0Var.o = i16;
                    dm0Var.h = i16 < 0;
                    if (i16 < 0) {
                        i11 = org.telegram.ui.ActionBar.k6.c8;
                    } else {
                        int[] iArr = org.telegram.ui.ActionBar.k6.r8;
                        i11 = iArr[i16 % iArr.length];
                    }
                    int w02 = org.telegram.ui.ActionBar.k6.w0(i11, this.a);
                    dm0Var.g = false;
                    dm0Var.f = false;
                    dm0Var.a.setColor(w02);
                } else if (gpVar != null) {
                    ArrayList arrayList = gpVar.c;
                    if (i15 >= 0 && i15 < arrayList.size()) {
                        this.f[i15].o = ((org.telegram.messenger.fp) arrayList.get(i15)).c;
                        this.f[i15].a((org.telegram.messenger.fp) arrayList.get(i15));
                    }
                }
                i15++;
                i14 = 2;
            }
        }
        float f13 = ((f10 - ((f12 * min2) + (f11 * min))) / 2.0f) + min2;
        if (this.f != null) {
            int i17 = 0;
            float f14 = f13;
            float f15 = min3;
            while (i17 < this.f.length) {
                RectF rectF = org.telegram.messenger.g0.P;
                rectF.set(f14, f15, f14 + min, f15 + min);
                this.f[i17].p.set(rectF);
                rectF.inset((-min2) / 2.0f, (-min3) / 2.0f);
                this.f[i17].q.set(rectF);
                dm0 dm0Var2 = this.f[i17];
                boolean z10 = dm0Var2.o == this.s ? z9 : false;
                dm0Var2.m = z10;
                boolean z11 = z9;
                dm0Var2.n.f(z10, z11);
                dm0Var2.r.invalidate();
                if (i17 % i13 == i13 - 1) {
                    f15 += min + min3;
                    f14 = f13;
                } else {
                    f14 = min + min2 + f14;
                }
                i17++;
                z9 = z11;
            }
        }
    }

    public void setCloseAsLock(boolean z9) {
        this.e = z9;
    }

    public void setDivider(boolean z9) {
        this.r = z9;
        invalidate();
    }

    public void setOnColorClick(org.telegram.messenger.c20 c20Var) {
        this.w = c20Var;
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final void updateColors() {
        int i7;
        if (this.f == null) {
            return;
        }
        org.telegram.messenger.qp s12 = org.telegram.messenger.qp.s1(this.d);
        int i10 = this.c;
        org.telegram.messenger.gp gpVar = i10 == 1 ? s12.q4 : s12.r4;
        int i11 = 0;
        while (true) {
            dm0[] dm0VarArr = this.f;
            if (i11 >= dm0VarArr.length) {
                invalidate();
                return;
            }
            org.telegram.ui.ActionBar.f6 f6Var = this.a;
            int[] iArr = this.h;
            if (i10 == 2) {
                dm0 dm0Var = dm0VarArr[i11];
                int i12 = iArr[i11];
                dm0Var.o = i12;
                dm0Var.h = i12 < 0;
                if (i12 < 0) {
                    i7 = org.telegram.ui.ActionBar.k6.c8;
                } else {
                    int[] iArr2 = org.telegram.ui.ActionBar.k6.r8;
                    i7 = iArr2[i12 % iArr2.length];
                }
                int w02 = org.telegram.ui.ActionBar.k6.w0(i7, f6Var);
                dm0Var.g = false;
                dm0Var.f = false;
                dm0Var.a.setColor(w02);
            } else if (i11 < 7 && i10 == 1) {
                dm0 dm0Var2 = dm0VarArr[i11];
                int i13 = iArr[i11];
                dm0Var2.o = i13;
                int w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.r8[i13], f6Var);
                dm0Var2.g = false;
                dm0Var2.f = false;
                dm0Var2.a.setColor(w03);
            } else if (gpVar != null) {
                ArrayList arrayList = gpVar.c;
                if (i11 >= 0 && i11 < arrayList.size()) {
                    this.f[i11].o = ((org.telegram.messenger.fp) arrayList.get(i11)).c;
                    this.f[i11].a((org.telegram.messenger.fp) arrayList.get(i11));
                }
            }
            i11++;
        }
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
