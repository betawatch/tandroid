package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class xy extends View {
    public final Paint a;
    public final Paint b;
    public final Path c;
    public int d;
    public int e;
    public vy0[] f;
    public RectF[] h;
    public float n;
    public org.telegram.ui.nl0 r;
    public int s;

    public xy(Context context) {
        super(context);
        this.a = new Paint(1);
        this.b = new Paint(1);
        this.c = new Path();
        this.d = -1;
        this.e = -1;
        this.s = -1;
    }

    public final void a(float f10, int i7, int i10, Canvas canvas) {
        vy0[] vy0VarArr = this.f;
        int length = vy0VarArr.length;
        int i11 = 0;
        float f11 = f10;
        while (i11 < length) {
            vy0 vy0Var = vy0VarArr[i11];
            int i12 = i10;
            vy0Var.c(f11, i7 / 2.0f, 1.0f, i12, canvas);
            f11 += vy0Var.k() + org.telegram.messenger.g0.L(24.0f);
            i11++;
            i10 = i12;
        }
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.f == null) {
            return;
        }
        int width = getWidth();
        int height = getHeight();
        float f10 = 4.0f;
        int L = org.telegram.messenger.g0.L(4.0f) + org.telegram.messenger.f3.D(24.0f, this.f.length, org.telegram.messenger.g0.L(4.0f));
        int i7 = 0;
        while (true) {
            vy0[] vy0VarArr = this.f;
            if (i7 >= vy0VarArr.length) {
                break;
            }
            L = (int) (vy0VarArr[i7].k() + L);
            i7++;
        }
        float L2 = (height - org.telegram.messenger.g0.L(36.0f)) / 2.0f;
        float L3 = (org.telegram.messenger.g0.L(36.0f) + height) / 2.0f;
        float f11 = (width - L) / 2.0f;
        float L4 = org.telegram.messenger.g0.L(16.0f) + f11;
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(f11, L2, L + f11, L3);
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(18.0f), this.a);
        float L5 = f11 + org.telegram.messenger.g0.L(16.0f);
        int i10 = 0;
        while (i10 < this.f.length) {
            this.h[i10].set(L5 - org.telegram.messenger.g0.L(16.0f), L2, this.f[i10].k() + L5 + org.telegram.messenger.g0.L(16.0f), L3);
            L5 += this.f[i10].k() + org.telegram.messenger.g0.L(24.0f);
            i10++;
            f10 = f10;
        }
        org.telegram.messenger.g0.L(f10);
        int j3 = Utilities.j((int) Math.floor(this.n), this.f.length - 1, 0);
        int j10 = Utilities.j((int) Math.ceil(this.n), this.f.length - 1, 0);
        float L6 = this.h[j3].left + org.telegram.messenger.g0.L(r16);
        float L7 = this.h[j10].left + org.telegram.messenger.g0.L(r16);
        float f12 = this.n;
        float T1 = org.telegram.messenger.g0.T1(L6, L7, (float) (f12 - Math.floor(f12)));
        float L8 = this.h[j3].right - org.telegram.messenger.g0.L(r16);
        float L9 = this.h[j10].right - org.telegram.messenger.g0.L(r16);
        float f13 = this.n;
        float T12 = org.telegram.messenger.g0.T1(L8, L9, (float) (f13 - Math.floor(f13)));
        RectF rectF2 = org.telegram.messenger.g0.P;
        rectF2.set(T1, (height - org.telegram.messenger.g0.L(28.0f)) / 2.0f, T12, (org.telegram.messenger.g0.L(28.0f) + height) / 2.0f);
        Path path = this.c;
        path.rewind();
        path.addRoundRect(rectF2, org.telegram.messenger.g0.L(15.0f), org.telegram.messenger.g0.L(15.0f), Path.Direction.CW);
        canvas.drawRoundRect(rectF2, org.telegram.messenger.g0.L(15.0f), org.telegram.messenger.g0.L(15.0f), this.b);
        a(L4, height, this.d, canvas);
        canvas.save();
        canvas.clipPath(path);
        a(L4, height, this.e, canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i7 = 0;
        if (this.f == null || this.h == null) {
            return false;
        }
        while (true) {
            RectF[] rectFArr = this.h;
            if (i7 >= rectFArr.length) {
                i7 = -1;
                break;
            }
            if (rectFArr[i7].contains(motionEvent.getX(), motionEvent.getY())) {
                break;
            }
            i7++;
        }
        if (i7 >= 0 && i7 != this.s) {
            this.s = i7;
            org.telegram.ui.nl0 nl0Var = this.r;
            if (nl0Var != null) {
                nl0Var.a(Integer.valueOf(i7));
            }
        }
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            this.s = -1;
        }
        if (motionEvent.getAction() != 0 || i7 < 0) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.view.View
    public void setBackgroundColor(int i7) {
        this.a.setColor(i7);
        invalidate();
    }

    public void setSelected(float f10) {
        if (Math.abs(f10 - this.n) > 0.001f) {
            invalidate();
        }
        this.n = f10;
    }

    public void setSelectedColor(int i7) {
        this.b.setColor(i7);
        invalidate();
    }

    public void setSelectedTextColor(int i7) {
        this.e = i7;
        invalidate();
    }

    public void setTabs(CharSequence... charSequenceArr) {
        this.f = new vy0[charSequenceArr.length];
        this.h = new RectF[charSequenceArr.length];
        for (int i7 = 0; i7 < charSequenceArr.length; i7++) {
            this.f[i7] = new vy0(charSequenceArr[i7], 14.0f, org.telegram.messenger.g0.o());
            this.h[i7] = new RectF();
        }
        invalidate();
    }

    public void setTextColor(int i7) {
        this.d = i7;
        invalidate();
    }
}
