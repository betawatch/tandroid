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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class lz extends View {
    public final Paint a;
    public final Paint b;
    public zz0[] c;
    public RectF[] d;
    public float e;
    public org.telegram.ui.x3 f;
    public int h;

    public lz(Context context) {
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
        int dp = AndroidUtilities.dp(2.0f) + org.telegram.messenger.x3.D(24.0f, this.c.length, AndroidUtilities.dp(2.0f));
        int i10 = 0;
        while (true) {
            zz0[] zz0VarArr = this.c;
            if (i10 >= zz0VarArr.length) {
                break;
            }
            dp = (int) (zz0VarArr[i10].l() + dp);
            i10++;
        }
        float dp2 = (height - AndroidUtilities.dp(30.0f)) / 2.0f;
        float dp3 = (AndroidUtilities.dp(30.0f) + height) / 2.0f;
        float f9 = (width - dp) / 2.0f;
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(f9, dp2, dp + f9, dp3);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), this.a);
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
        float dp4 = f9 + AndroidUtilities.dp(14.0f);
        int i11 = 0;
        while (true) {
            zz0[] zz0VarArr2 = this.c;
            if (i11 >= zz0VarArr2.length) {
                AndroidUtilities.dp(2.0f);
                float dp5 = (height - AndroidUtilities.dp(26.0f)) / 2.0f;
                float dp6 = (AndroidUtilities.dp(26.0f) + height) / 2.0f;
                int clamp = Utilities.clamp((int) Math.floor(this.e), this.c.length - 1, 0);
                int clamp2 = Utilities.clamp((int) Math.ceil(this.e), this.c.length - 1, 0);
                float dp7 = this.d[clamp].left + AndroidUtilities.dp(2.0f);
                float dp8 = this.d[clamp2].left + AndroidUtilities.dp(2.0f);
                float f10 = this.e;
                float lerp = AndroidUtilities.lerp(dp7, dp8, (float) (f10 - Math.floor(f10)));
                float dp9 = this.d[clamp].right - AndroidUtilities.dp(2.0f);
                float dp10 = this.d[clamp2].right - AndroidUtilities.dp(2.0f);
                float f11 = this.e;
                float lerp2 = AndroidUtilities.lerp(dp9, dp10, (float) (f11 - Math.floor(f11)));
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.set(lerp, dp5, lerp2, dp6);
                canvas.drawRoundRect(rectF2, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), this.b);
                canvas.restore();
                return;
            }
            zz0VarArr2[i11].c(dp4, height / 2.0f, 1.0f, -1, canvas);
            this.d[i11].set(dp4 - AndroidUtilities.dp(14.0f), dp2, this.c[i11].l() + dp4 + AndroidUtilities.dp(14.0f), dp3);
            dp4 += this.c[i11].l() + AndroidUtilities.dp(24.0f);
            i11++;
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i10 = 0;
        if (this.c == null || this.d == null) {
            return false;
        }
        while (true) {
            RectF[] rectFArr = this.d;
            if (i10 >= rectFArr.length) {
                i10 = -1;
                break;
            }
            if (rectFArr[i10].contains(motionEvent.getX(), motionEvent.getY())) {
                break;
            }
            i10++;
        }
        if (i10 >= 0 && i10 != this.h) {
            this.h = i10;
            org.telegram.ui.x3 x3Var = this.f;
            if (x3Var != null) {
                x3Var.run(Integer.valueOf(i10));
            }
        }
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            this.h = -1;
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

    public void setSelected(float f9) {
        if (Math.abs(f9 - this.e) > 0.001f) {
            invalidate();
        }
        this.e = f9;
    }

    public void setTabs(CharSequence... charSequenceArr) {
        this.c = new zz0[charSequenceArr.length];
        this.d = new RectF[charSequenceArr.length];
        for (int i10 = 0; i10 < charSequenceArr.length; i10++) {
            this.c[i10] = new zz0(charSequenceArr[i10], 14.0f, AndroidUtilities.bold());
            this.d[i10] = new RectF();
        }
        invalidate();
    }
}
