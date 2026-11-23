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

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class im0 extends View implements org.telegram.ui.ActionBar.b6 {
    public final org.telegram.ui.ActionBar.h6 a;
    public final Paint b;
    public final int c;
    public final int d;
    public boolean e;
    public hm0[] f;
    public final int[] h;
    public final Paint n;
    public boolean r;
    public int s;
    public org.telegram.messenger.y10 w;
    public hm0 x;

    public im0(int i7, int i10, Context context, org.telegram.ui.ActionBar.h6 h6Var) {
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
        this.a = h6Var;
    }

    public final void a(int i7, boolean z10) {
        this.s = i7;
        if (this.f == null) {
            return;
        }
        int i10 = 0;
        while (true) {
            hm0[] hm0VarArr = this.f;
            if (i10 >= hm0VarArr.length) {
                return;
            }
            hm0 hm0Var = hm0VarArr[i10];
            boolean z11 = hm0Var.o == i7;
            hm0Var.m = z11;
            if (!z10) {
                hm0Var.n.f(z11, true);
            }
            hm0Var.r.invalidate();
            i10++;
        }
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.f != null) {
            int i7 = 0;
            while (true) {
                hm0[] hm0VarArr = this.f;
                if (i7 >= hm0VarArr.length) {
                    break;
                }
                hm0 hm0Var = hm0VarArr[i7];
                im0 im0Var = hm0Var.r;
                Path path = hm0Var.e;
                canvas.save();
                float a10 = hm0Var.l.a(0.05f);
                RectF rectF = hm0Var.p;
                canvas.scale(a10, a10, rectF.centerX(), rectF.centerY());
                canvas.save();
                Path path2 = hm0Var.d;
                path2.rewind();
                path2.addCircle(rectF.centerX(), rectF.centerY(), Math.min(rectF.height() / 2.0f, rectF.width() / 2.0f), Path.Direction.CW);
                canvas.clipPath(path2);
                canvas.drawPaint(hm0Var.a);
                if (hm0Var.f) {
                    path.rewind();
                    path.moveTo(rectF.right, rectF.top);
                    path.lineTo(rectF.right, rectF.bottom);
                    path.lineTo(rectF.left, rectF.bottom);
                    path.close();
                    canvas.drawPath(path, hm0Var.b);
                }
                canvas.restore();
                if (hm0Var.g) {
                    canvas.save();
                    float width = rectF.width() * 0.315f;
                    RectF rectF2 = org.telegram.messenger.g0.P;
                    float f10 = width / 2.0f;
                    rectF2.set(rectF.centerX() - f10, rectF.centerY() - f10, rectF.centerX() + f10, rectF.centerY() + f10);
                    canvas.rotate(45.0f, rectF.centerX(), rectF.centerY());
                    canvas.drawRoundRect(rectF2, org.telegram.messenger.g0.L(2.33f), org.telegram.messenger.g0.L(2.33f), hm0Var.c);
                    canvas.restore();
                }
                float d = hm0Var.n.d(hm0Var.m);
                if (d > 0.0f) {
                    Paint paint = im0Var.b;
                    Paint paint2 = im0Var.b;
                    paint.setStrokeWidth(org.telegram.messenger.g0.N(2.0f));
                    paint2.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.d6, im0Var.a));
                    canvas.drawCircle(rectF.centerX(), rectF.centerY(), (org.telegram.messenger.g0.T1(0.5f, -2.0f, d) * paint2.getStrokeWidth()) + Math.min(rectF.height() / 2.0f, rectF.width() / 2.0f), paint2);
                }
                if (hm0Var.h) {
                    if (im0Var.e) {
                        if (hm0Var.k == null) {
                            Drawable drawable = im0Var.getContext().getResources().getDrawable(R.drawable.msg_mini_lock3);
                            hm0Var.k = drawable;
                            drawable.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                        }
                        hm0Var.k.setBounds((int) org.telegram.messenger.o10.w(hm0Var.k.getIntrinsicWidth(), 2.0f, 1.2f, rectF.centerX()), (int) org.telegram.messenger.o10.w(hm0Var.k.getIntrinsicHeight(), 2.0f, 1.2f, rectF.centerY()), (int) com.google.android.gms.internal.vision.e2.c(hm0Var.k.getIntrinsicWidth(), 2.0f, 1.2f, rectF.centerX()), (int) com.google.android.gms.internal.vision.e2.c(hm0Var.k.getIntrinsicHeight(), 2.0f, 1.2f, rectF.centerY()));
                        hm0Var.k.draw(canvas);
                    } else {
                        if (hm0Var.i == null) {
                            hm0Var.i = new Path();
                        }
                        if (hm0Var.j == null) {
                            Paint paint3 = new Paint(1);
                            hm0Var.j = paint3;
                            paint3.setColor(-1);
                            hm0Var.j.setStyle(Paint.Style.STROKE);
                            hm0Var.j.setStrokeCap(Paint.Cap.ROUND);
                        }
                        hm0Var.j.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
                        hm0Var.i.rewind();
                        float W1 = org.telegram.messenger.g0.W1(d, org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(4.0f));
                        hm0Var.i.moveTo(rectF.centerX() - W1, rectF.centerY() - W1);
                        hm0Var.i.lineTo(rectF.centerX() + W1, rectF.centerY() + W1);
                        hm0Var.i.moveTo(rectF.centerX() + W1, rectF.centerY() - W1);
                        hm0Var.i.lineTo(rectF.centerX() - W1, rectF.centerY() + W1);
                        canvas.drawPath(hm0Var.i, hm0Var.j);
                    }
                }
                canvas.restore();
                i7++;
            }
        }
        if (this.r) {
            int w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.d7, this.a);
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
        hm0 hm0Var;
        hm0 hm0Var2;
        org.telegram.messenger.y10 y10Var;
        org.telegram.messenger.y10 y10Var2;
        if (this.f != null) {
            int i7 = 0;
            while (true) {
                hm0[] hm0VarArr = this.f;
                if (i7 >= hm0VarArr.length) {
                    break;
                }
                if (hm0VarArr[i7].q.contains(motionEvent.getX(), motionEvent.getY())) {
                    hm0Var = this.f[i7];
                    break;
                }
                i7++;
            }
            if (motionEvent.getAction() != 0) {
                this.x = hm0Var;
                if (hm0Var != null) {
                    hm0Var.l.c(true);
                }
                if (getParent() != null) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                    return true;
                }
            } else if (motionEvent.getAction() == 2) {
                hm0 hm0Var3 = this.x;
                if (hm0Var3 != hm0Var) {
                    if (hm0Var3 != null) {
                        hm0Var3.l.c(false);
                    }
                    if (hm0Var != null) {
                        hm0Var.l.c(true);
                    }
                    if (this.x != null && hm0Var != null && (y10Var2 = this.w) != null) {
                        y10Var2.a(Integer.valueOf(hm0Var.o));
                    }
                    this.x = hm0Var;
                    return true;
                }
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                if (motionEvent.getAction() == 1 && (hm0Var2 = this.x) != null && (y10Var = this.w) != null) {
                    y10Var.a(Integer.valueOf(hm0Var2.o));
                }
                if (this.f != null) {
                    int i10 = 0;
                    while (true) {
                        hm0[] hm0VarArr2 = this.f;
                        if (i10 >= hm0VarArr2.length) {
                            break;
                        }
                        hm0VarArr2[i10].l.c(false);
                        i10++;
                    }
                }
                this.x = null;
                return true;
            }
            return true;
        }
        hm0Var = null;
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
        org.telegram.messenger.np u12 = org.telegram.messenger.np.u1(this.d);
        int i12 = this.c;
        org.telegram.messenger.dp dpVar = i12 == 1 ? u12.t4 : u12.u4;
        int size2 = dpVar == null ? 0 : dpVar.c.size();
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
        boolean z10 = true;
        setMeasuredDimension(size, (int) (((r15 + 1) * min3) + ((size2 / i13) * min)));
        hm0[] hm0VarArr = this.f;
        if (hm0VarArr == null || hm0VarArr.length != size2) {
            this.f = new hm0[size2];
            int i15 = 0;
            while (i15 < size2) {
                this.f[i15] = new hm0(this);
                if (i12 == i14) {
                    hm0 hm0Var = this.f[i15];
                    int i16 = this.h[i15];
                    hm0Var.o = i16;
                    hm0Var.h = i16 < 0;
                    if (i16 < 0) {
                        i11 = org.telegram.ui.ActionBar.m6.c8;
                    } else {
                        int[] iArr = org.telegram.ui.ActionBar.m6.r8;
                        i11 = iArr[i16 % iArr.length];
                    }
                    int w02 = org.telegram.ui.ActionBar.m6.w0(i11, this.a);
                    hm0Var.g = false;
                    hm0Var.f = false;
                    hm0Var.a.setColor(w02);
                } else if (dpVar != null) {
                    ArrayList arrayList = dpVar.c;
                    if (i15 >= 0 && i15 < arrayList.size()) {
                        this.f[i15].o = ((org.telegram.messenger.cp) arrayList.get(i15)).c;
                        this.f[i15].a((org.telegram.messenger.cp) arrayList.get(i15));
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
                hm0 hm0Var2 = this.f[i17];
                boolean z11 = hm0Var2.o == this.s ? z10 : false;
                hm0Var2.m = z11;
                boolean z12 = z10;
                hm0Var2.n.f(z11, z12);
                hm0Var2.r.invalidate();
                if (i17 % i13 == i13 - 1) {
                    f15 += min + min3;
                    f14 = f13;
                } else {
                    f14 = min + min2 + f14;
                }
                i17++;
                z10 = z12;
            }
        }
    }

    public void setCloseAsLock(boolean z10) {
        this.e = z10;
    }

    public void setDivider(boolean z10) {
        this.r = z10;
        invalidate();
    }

    public void setOnColorClick(org.telegram.messenger.y10 y10Var) {
        this.w = y10Var;
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        int i7;
        if (this.f == null) {
            return;
        }
        org.telegram.messenger.np u12 = org.telegram.messenger.np.u1(this.d);
        int i10 = this.c;
        org.telegram.messenger.dp dpVar = i10 == 1 ? u12.t4 : u12.u4;
        int i11 = 0;
        while (true) {
            hm0[] hm0VarArr = this.f;
            if (i11 >= hm0VarArr.length) {
                invalidate();
                return;
            }
            org.telegram.ui.ActionBar.h6 h6Var = this.a;
            int[] iArr = this.h;
            if (i10 == 2) {
                hm0 hm0Var = hm0VarArr[i11];
                int i12 = iArr[i11];
                hm0Var.o = i12;
                hm0Var.h = i12 < 0;
                if (i12 < 0) {
                    i7 = org.telegram.ui.ActionBar.m6.c8;
                } else {
                    int[] iArr2 = org.telegram.ui.ActionBar.m6.r8;
                    i7 = iArr2[i12 % iArr2.length];
                }
                int w02 = org.telegram.ui.ActionBar.m6.w0(i7, h6Var);
                hm0Var.g = false;
                hm0Var.f = false;
                hm0Var.a.setColor(w02);
            } else if (i11 < 7 && i10 == 1) {
                hm0 hm0Var2 = hm0VarArr[i11];
                int i13 = iArr[i11];
                hm0Var2.o = i13;
                int w03 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.r8[i13], h6Var);
                hm0Var2.g = false;
                hm0Var2.f = false;
                hm0Var2.a.setColor(w03);
            } else if (dpVar != null) {
                ArrayList arrayList = dpVar.c;
                if (i11 >= 0 && i11 < arrayList.size()) {
                    this.f[i11].o = ((org.telegram.messenger.cp) arrayList.get(i11)).c;
                    this.f[i11].a((org.telegram.messenger.cp) arrayList.get(i11));
                }
            }
            i11++;
        }
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
