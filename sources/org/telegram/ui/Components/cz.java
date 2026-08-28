package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class cz extends View {
    public final Paint a;
    public final Paint b;
    public nz0[] c;
    public RectF[] d;
    public float e;
    public org.telegram.ui.w3 f;
    public int h;

    public cz(Context context) {
        super(context);
        this.a = new Paint(1);
        Paint paint = new Paint(1);
        this.b = paint;
        this.h = -1;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OUT));
        paint.setColor(-1);
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.c == null) {
            return;
        }
        int width = getWidth();
        int height = getHeight();
        int dp = AndroidUtilities.dp(2.0f) + org.telegram.messenger.l0.D(24.0f, this.c.length, AndroidUtilities.dp(2.0f));
        int i9 = 0;
        while (true) {
            nz0[] nz0VarArr = this.c;
            if (i9 >= nz0VarArr.length) {
                break;
            }
            dp = (int) (nz0VarArr[i9].l() + dp);
            i9++;
        }
        float dp2 = (height - AndroidUtilities.dp(30.0f)) / 2.0f;
        float dp3 = (AndroidUtilities.dp(30.0f) + height) / 2.0f;
        float f10 = (width - dp) / 2.0f;
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(f10, dp2, dp + f10, dp3);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), this.a);
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
        float dp4 = f10 + AndroidUtilities.dp(14.0f);
        int i10 = 0;
        while (true) {
            nz0[] nz0VarArr2 = this.c;
            if (i10 >= nz0VarArr2.length) {
                AndroidUtilities.dp(2.0f);
                float dp5 = (height - AndroidUtilities.dp(26.0f)) / 2.0f;
                float dp6 = (AndroidUtilities.dp(26.0f) + height) / 2.0f;
                int clamp = Utilities.clamp((int) Math.floor(this.e), this.c.length - 1, 0);
                int clamp2 = Utilities.clamp((int) Math.ceil(this.e), this.c.length - 1, 0);
                float dp7 = this.d[clamp].left + AndroidUtilities.dp(2.0f);
                float dp8 = this.d[clamp2].left + AndroidUtilities.dp(2.0f);
                float f11 = this.e;
                float lerp = AndroidUtilities.lerp(dp7, dp8, (float) (f11 - Math.floor(f11)));
                float dp9 = this.d[clamp].right - AndroidUtilities.dp(2.0f);
                float dp10 = this.d[clamp2].right - AndroidUtilities.dp(2.0f);
                float f12 = this.e;
                float lerp2 = AndroidUtilities.lerp(dp9, dp10, (float) (f12 - Math.floor(f12)));
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.set(lerp, dp5, lerp2, dp6);
                canvas.drawRoundRect(rectF2, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), this.b);
                canvas.restore();
                return;
            }
            nz0VarArr2[i10].c(dp4, height / 2.0f, 1.0f, -1, canvas);
            this.d[i10].set(dp4 - AndroidUtilities.dp(14.0f), dp2, this.c[i10].l() + dp4 + AndroidUtilities.dp(14.0f), dp3);
            dp4 += this.c[i10].l() + AndroidUtilities.dp(24.0f);
            i10++;
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i9 = 0;
        if (this.c == null || this.d == null) {
            return false;
        }
        while (true) {
            RectF[] rectFArr = this.d;
            if (i9 >= rectFArr.length) {
                i9 = -1;
                break;
            }
            if (rectFArr[i9].contains(motionEvent.getX(), motionEvent.getY())) {
                break;
            }
            i9++;
        }
        if (i9 >= 0 && i9 != this.h) {
            this.h = i9;
            org.telegram.ui.w3 w3Var = this.f;
            if (w3Var != null) {
                w3Var.run(Integer.valueOf(i9));
            }
        }
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            this.h = -1;
        }
        if (motionEvent.getAction() != 0 || i9 < 0) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.view.View
    public void setBackgroundColor(int i9) {
        this.a.setColor(i9);
        invalidate();
    }

    public void setSelected(float f10) {
        if (Math.abs(f10 - this.e) > 0.001f) {
            invalidate();
        }
        this.e = f10;
    }

    public void setTabs(CharSequence... charSequenceArr) {
        this.c = new nz0[charSequenceArr.length];
        this.d = new RectF[charSequenceArr.length];
        for (int i9 = 0; i9 < charSequenceArr.length; i9++) {
            this.c[i9] = new nz0(charSequenceArr[i9], 14.0f, AndroidUtilities.bold());
            this.d[i9] = new RectF();
        }
        invalidate();
    }
}
