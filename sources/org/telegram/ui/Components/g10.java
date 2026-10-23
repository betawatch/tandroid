package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class g10 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public boolean E;
    public ValueAnimator F;
    public eq G;
    public int H;
    public boolean I;
    public Paint a;
    public p6 b;
    public p6 c;
    public float d;
    public f6 e;
    public View f;
    public ShapeDrawable h;
    public float n;
    public boolean r;
    public ValueAnimator s;
    public float v;
    public ValueAnimator w;
    public int x;
    public float y;

    public final void a(boolean z10) {
        if (this.r != z10) {
            ValueAnimator valueAnimator = this.s;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.s = null;
            }
            float f7 = this.n;
            this.r = z10;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, z10 ? 1.0f : 0.0f);
            this.s = ofFloat;
            ofFloat.addUpdateListener(new f10(this, 2));
            this.s.addListener(new org.telegram.ui.ho(10, this, z10));
            this.s.setDuration(320L);
            this.s.setInterpolator(bs.h);
            this.s.start();
        }
    }

    public final void b(CharSequence charSequence, boolean z10) {
        p6 p6Var = this.b;
        if (z10) {
            p6Var.a();
        }
        p6Var.t(charSequence, z10, true);
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
        p6 p6Var = this.c;
        p6 p6Var2 = this.b;
        this.f.draw(canvas);
        if (this.n > 0.0f) {
            if (this.G == null) {
                this.G = new eq(p6Var2.a.getColor());
            }
            int dp = (int) ((1.0f - this.n) * AndroidUtilities.dp(24.0f));
            this.G.setBounds(0, dp, getWidth(), getHeight() + dp);
            this.G.setAlpha((int) (this.n * 255.0f));
            this.G.draw(canvas);
            invalidate();
        }
        float f7 = this.n;
        if (f7 < 1.0f) {
            if (f7 != 0.0f) {
                canvas.save();
                canvas.translate(0.0f, (int) (this.n * AndroidUtilities.dp(-24.0f)));
                canvas.scale(1.0f, 1.0f - (this.n * 0.4f));
                z10 = true;
            } else {
                z10 = false;
            }
            float c10 = p6Var2.c();
            float d = this.e.d(this.d, false);
            float c11 = ((p6Var.c() + AndroidUtilities.dp(15.66f)) * d) + c10;
            Rect rect = AndroidUtilities.rectTmp2;
            rect.set((int) (((getMeasuredWidth() - c11) - getWidth()) / 2.0f), (int) (((getMeasuredHeight() - p6Var2.e) / 2.0f) - AndroidUtilities.dp(1.0f)), (int) org.telegram.messenger.v0.a(getMeasuredWidth() - c11, getWidth(), 2.0f, c10), (int) (((getMeasuredHeight() + p6Var2.e) / 2.0f) - AndroidUtilities.dp(1.0f)));
            p6Var2.B = (int) (AndroidUtilities.lerp(0.5f, 1.0f, this.y) * (1.0f - this.n) * 255.0f);
            p6Var2.setBounds(rect);
            p6Var2.draw(canvas);
            rect.set((int) (com.google.android.gms.internal.play_billing.k3.z(getMeasuredWidth(), c11, 2.0f, c10) + AndroidUtilities.dp(5.0f)), (int) ((getMeasuredHeight() - AndroidUtilities.dp(18.0f)) / 2.0f), (int) (Math.max(AndroidUtilities.dp(9.0f), p6Var.c()) + com.google.android.gms.internal.play_billing.k3.z(getMeasuredWidth(), c11, 2.0f, c10) + AndroidUtilities.dp(13.0f)), (int) ((AndroidUtilities.dp(18.0f) + getMeasuredHeight()) / 2.0f));
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(rect);
            if (this.v != 1.0f) {
                canvas.save();
                float f10 = this.v;
                canvas.scale(f10, f10, rect.centerX(), rect.centerY());
            }
            paint.setAlpha((int) ((1.0f - this.n) * 255.0f * d * d));
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), paint);
            rect.offset(-AndroidUtilities.dp(0.3f), -AndroidUtilities.dp(0.4f));
            p6Var.B = (int) org.telegram.messenger.v0.A(1.0f, this.n, 255.0f, d);
            p6Var.setBounds(rect);
            p6Var.draw(canvas);
            if (this.v != 1.0f) {
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
        sb2.append((Object) this.b.i);
        if (this.x > 0) {
            str = ", " + LocaleController.formatPluralString("Chats", this.x, new Object[0]);
        } else {
            str = "";
        }
        sb2.append(str);
        accessibilityNodeInfo.setContentDescription(sb2.toString());
    }

    @Override // android.view.View
    public final void setEnabled(boolean z10) {
        if (this.E != z10) {
            ValueAnimator valueAnimator = this.F;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.F = null;
            }
            float f7 = this.y;
            this.E = z10;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, z10 ? 1.0f : 0.0f);
            this.F = ofFloat;
            ofFloat.addUpdateListener(new f10(this, 0));
            this.F.addListener(new ah.z(2));
            this.F.start();
        }
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        ShapeDrawable shapeDrawable = this.h;
        p6 p6Var = this.b;
        Paint paint = this.a;
        if (paint == null || p6Var == null) {
            return;
        }
        int i10 = org.telegram.ui.ActionBar.k6.Oh;
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, i10, false);
        if (x02 != this.H || this.I != org.telegram.ui.ActionBar.k6.I.q()) {
            this.H = x02;
            this.I = org.telegram.ui.ActionBar.k6.I.q();
            View view = this.f;
            if (view != null) {
                view.setBackground(org.telegram.ui.ActionBar.a6.d(new float[]{8.0f}, 0, org.telegram.ui.ActionBar.a6.b(x02)));
            }
            if (shapeDrawable != null) {
                shapeDrawable.getPaint().setColor(x02);
                shapeDrawable.invalidateSelf();
            }
        }
        int i11 = org.telegram.ui.ActionBar.k6.Sh;
        paint.setColor(org.telegram.ui.ActionBar.k6.x0(null, i11, false));
        p6Var.u(org.telegram.ui.ActionBar.k6.x0(null, i11, false));
        try {
            p6 p6Var2 = this.c;
            if (p6Var2 != null) {
                p6Var2.u(org.telegram.ui.ActionBar.k6.x0(null, i10, false));
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        invalidate();
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return this.b == drawable || this.c == drawable || super.verifyDrawable(drawable);
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
