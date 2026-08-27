package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class m00 extends FrameLayout {
    public ValueAnimator A;
    public hp B;
    public Paint a;
    public i6 b;
    public i6 c;
    public float d;
    public y5 e;
    public View f;
    public float h;
    public boolean n;
    public ValueAnimator r;
    public float s;
    public ValueAnimator v;
    public int w;
    public float x;
    public boolean y;

    public final void a(boolean z10) {
        if (this.n != z10) {
            ValueAnimator valueAnimator = this.r;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.r = null;
            }
            float f10 = this.h;
            this.n = z10;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, z10 ? 1.0f : 0.0f);
            this.r = ofFloat;
            ofFloat.addUpdateListener(new l00(this, 2));
            this.r.addListener(new org.telegram.ui.go(10, this, z10));
            this.r.setDuration(320L);
            this.r.setInterpolator(er.h);
            this.r.start();
        }
    }

    public final void b(CharSequence charSequence, boolean z10) {
        i6 i6Var = this.b;
        if (z10) {
            i6Var.b();
        }
        i6Var.q(charSequence, z10, true);
        invalidate();
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        return false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        boolean z10;
        Paint paint = this.a;
        i6 i6Var = this.c;
        i6 i6Var2 = this.b;
        this.f.draw(canvas);
        if (this.h > 0.0f) {
            if (this.B == null) {
                this.B = new hp(i6Var2.a.getColor());
            }
            int dp = (int) ((1.0f - this.h) * AndroidUtilities.dp(24.0f));
            this.B.setBounds(0, dp, getWidth(), getHeight() + dp);
            this.B.setAlpha((int) (this.h * 255.0f));
            this.B.draw(canvas);
            invalidate();
        }
        float f10 = this.h;
        if (f10 < 1.0f) {
            if (f10 != 0.0f) {
                canvas.save();
                canvas.translate(0.0f, (int) (this.h * AndroidUtilities.dp(-24.0f)));
                canvas.scale(1.0f, 1.0f - (this.h * 0.4f));
                z10 = true;
            } else {
                z10 = false;
            }
            float d = i6Var2.d();
            float d10 = this.e.d(this.d, false);
            float d11 = ((i6Var.d() + AndroidUtilities.dp(15.66f)) * d10) + d;
            Rect rect = AndroidUtilities.rectTmp2;
            rect.set((int) (((getMeasuredWidth() - d11) - getWidth()) / 2.0f), (int) (((getMeasuredHeight() - i6Var2.e) / 2.0f) - AndroidUtilities.dp(1.0f)), (int) i0.a.c(getMeasuredWidth() - d11, getWidth(), 2.0f, d), (int) (((getMeasuredHeight() + i6Var2.e) / 2.0f) - AndroidUtilities.dp(1.0f)));
            i6Var2.w = (int) (AndroidUtilities.lerp(0.5f, 1.0f, this.x) * (1.0f - this.h) * 255.0f);
            i6Var2.setBounds(rect);
            i6Var2.draw(canvas);
            rect.set((int) (com.google.android.recaptcha.internal.a.A(getMeasuredWidth(), d11, 2.0f, d) + AndroidUtilities.dp(5.0f)), (int) ((getMeasuredHeight() - AndroidUtilities.dp(18.0f)) / 2.0f), (int) (Math.max(AndroidUtilities.dp(9.0f), i6Var.d()) + com.google.android.recaptcha.internal.a.A(getMeasuredWidth(), d11, 2.0f, d) + AndroidUtilities.dp(13.0f)), (int) ((AndroidUtilities.dp(18.0f) + getMeasuredHeight()) / 2.0f));
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(rect);
            if (this.s != 1.0f) {
                canvas.save();
                float f11 = this.s;
                canvas.scale(f11, f11, rect.centerX(), rect.centerY());
            }
            paint.setAlpha((int) ((1.0f - this.h) * 255.0f * d10 * d10));
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), paint);
            rect.offset(-AndroidUtilities.dp(0.3f), -AndroidUtilities.dp(0.4f));
            i6Var.w = (int) org.telegram.messenger.y1.z(1.0f, this.h, 255.0f, d10);
            i6Var.setBounds(rect);
            i6Var.draw(canvas);
            if (this.s != 1.0f) {
                canvas.restore();
            }
            if (z10) {
                canvas.restore();
            }
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        String str;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Button");
        StringBuilder sb2 = new StringBuilder();
        sb2.append((Object) this.b.g);
        if (this.w > 0) {
            str = ", " + LocaleController.formatPluralString("Chats", this.w, new Object[0]);
        } else {
            str = "";
        }
        sb2.append(str);
        accessibilityNodeInfo.setContentDescription(sb2.toString());
    }

    @Override // android.view.View
    public final void setEnabled(boolean z10) {
        if (this.y != z10) {
            ValueAnimator valueAnimator = this.A;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.A = null;
            }
            float f10 = this.x;
            this.y = z10;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, z10 ? 1.0f : 0.0f);
            this.A = ofFloat;
            ofFloat.addUpdateListener(new l00(this, 0));
            this.A.addListener(new ig.r(2));
            this.A.start();
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return this.b == drawable || this.c == drawable || super.verifyDrawable(drawable);
    }
}
