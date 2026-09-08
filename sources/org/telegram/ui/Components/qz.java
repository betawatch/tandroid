package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class qz extends View {
    public final Paint a;
    public final Paint b;
    public final Path c;
    public int d;
    public int e;
    public f01[] f;
    public RectF[] h;
    public float n;
    public org.telegram.ui.zo0 r;
    public int s;

    public qz(Context context) {
        super(context);
        this.a = new Paint(1);
        this.b = new Paint(1);
        this.c = new Path();
        this.d = -1;
        this.e = -1;
        this.s = -1;
    }

    public final void a(float f7, int i10, int i11, Canvas canvas) {
        f01[] f01VarArr = this.f;
        int length = f01VarArr.length;
        int i12 = 0;
        float f10 = f7;
        while (i12 < length) {
            f01 f01Var = f01VarArr[i12];
            int i13 = i11;
            f01Var.c(f10, i10 / 2.0f, 1.0f, i13, canvas);
            f10 += f01Var.l() + AndroidUtilities.dp(24.0f);
            i12++;
            i11 = i13;
        }
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.f == null) {
            return;
        }
        int width = getWidth();
        int height = getHeight();
        int dp = AndroidUtilities.dp(4.0f) + org.telegram.messenger.w1.D(24.0f, this.f.length, AndroidUtilities.dp(4.0f));
        int i10 = 0;
        while (true) {
            f01[] f01VarArr = this.f;
            if (i10 >= f01VarArr.length) {
                break;
            }
            dp = (int) (f01VarArr[i10].l() + dp);
            i10++;
        }
        float dp2 = (height - AndroidUtilities.dp(36.0f)) / 2.0f;
        float dp3 = (AndroidUtilities.dp(36.0f) + height) / 2.0f;
        float f7 = (width - dp) / 2.0f;
        float dp4 = AndroidUtilities.dp(16.0f) + f7;
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(f7, dp2, dp + f7, dp3);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), this.a);
        float dp5 = f7 + AndroidUtilities.dp(16.0f);
        for (int i11 = 0; i11 < this.f.length; i11++) {
            this.h[i11].set(dp5 - AndroidUtilities.dp(16.0f), dp2, this.f[i11].l() + dp5 + AndroidUtilities.dp(16.0f), dp3);
            dp5 += this.f[i11].l() + AndroidUtilities.dp(24.0f);
        }
        AndroidUtilities.dp(4.0f);
        int clamp = Utilities.clamp((int) Math.floor(this.n), this.f.length - 1, 0);
        int clamp2 = Utilities.clamp((int) Math.ceil(this.n), this.f.length - 1, 0);
        float dp6 = this.h[clamp].left + AndroidUtilities.dp(4.0f);
        float dp7 = this.h[clamp2].left + AndroidUtilities.dp(4.0f);
        float f10 = this.n;
        float lerp = AndroidUtilities.lerp(dp6, dp7, (float) (f10 - Math.floor(f10)));
        float dp8 = this.h[clamp].right - AndroidUtilities.dp(4.0f);
        float dp9 = this.h[clamp2].right - AndroidUtilities.dp(4.0f);
        float f11 = this.n;
        float lerp2 = AndroidUtilities.lerp(dp8, dp9, (float) (f11 - Math.floor(f11)));
        RectF rectF2 = AndroidUtilities.rectTmp;
        rectF2.set(lerp, (height - AndroidUtilities.dp(28.0f)) / 2.0f, lerp2, (AndroidUtilities.dp(28.0f) + height) / 2.0f);
        Path path = this.c;
        path.rewind();
        path.addRoundRect(rectF2, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), Path.Direction.CW);
        canvas.drawRoundRect(rectF2, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), this.b);
        a(dp4, height, this.d, canvas);
        canvas.save();
        canvas.clipPath(path);
        a(dp4, height, this.e, canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i10 = 0;
        if (this.f == null || this.h == null) {
            return false;
        }
        while (true) {
            RectF[] rectFArr = this.h;
            if (i10 >= rectFArr.length) {
                i10 = -1;
                break;
            }
            if (rectFArr[i10].contains(motionEvent.getX(), motionEvent.getY())) {
                break;
            }
            i10++;
        }
        if (i10 >= 0 && i10 != this.s) {
            this.s = i10;
            org.telegram.ui.zo0 zo0Var = this.r;
            if (zo0Var != null) {
                zo0Var.run(Integer.valueOf(i10));
            }
        }
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            this.s = -1;
        }
        if (motionEvent.getAction() != 0 || i10 < 0) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        this.a.setColor(i10);
        invalidate();
    }

    public void setSelected(float f7) {
        if (Math.abs(f7 - this.n) > 0.001f) {
            invalidate();
        }
        this.n = f7;
    }

    public void setSelectedColor(int i10) {
        this.b.setColor(i10);
        invalidate();
    }

    public void setSelectedTextColor(int i10) {
        this.e = i10;
        invalidate();
    }

    public void setTabs(CharSequence... charSequenceArr) {
        this.f = new f01[charSequenceArr.length];
        this.h = new RectF[charSequenceArr.length];
        for (int i10 = 0; i10 < charSequenceArr.length; i10++) {
            this.f[i10] = new f01(charSequenceArr[i10], 14.0f, AndroidUtilities.bold());
            this.h[i10] = new RectF();
        }
        invalidate();
    }

    public void setTextColor(int i10) {
        this.d = i10;
        invalidate();
    }
}
