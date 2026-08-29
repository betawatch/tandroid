package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class ly0 extends FrameLayout {
    public int A;
    public int B;
    public fq0 C;
    public Paint a;
    public Paint b;
    public Paint c;
    public Paint d;
    public RectF e;
    public ky0 f;
    public String[] h;
    public int[] n;
    public xi0[] r;
    public int s;
    public aj0[] v;
    public float w;
    public float x;
    public int y;

    public final xi0 a(int i10) {
        xi0[] xi0VarArr = this.r;
        if (xi0VarArr[i10] == null) {
            int i11 = i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? R.raw.swipe_pin : R.raw.swipe_disabled : R.raw.swipe_delete : R.raw.swipe_mute : R.raw.chats_archive : R.raw.swipe_read;
            xi0VarArr[i10] = new xi0(i11, j7.l1.k(i11, ""), AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
            c(i10);
        }
        return xi0VarArr[i10];
    }

    public final void b() {
        int value;
        aj0[] aj0VarArr = this.v;
        if (this.C == null && this.B != (value = this.f.getValue())) {
            this.B = value;
            int i10 = (this.s + 1) % 2;
            xi0 a2 = a(value);
            if (a2 != null) {
                if (aj0VarArr[i10].getVisibility() != 0) {
                    a2.L(0, false, false);
                }
                aj0VarArr[i10].setAnimation(a2);
                aj0VarArr[i10].d();
            } else {
                aj0VarArr[i10].a();
            }
            AndroidUtilities.updateViewVisibilityAnimated(aj0VarArr[this.s], false, 0.5f, true);
            AndroidUtilities.updateViewVisibilityAnimated(aj0VarArr[i10], true, 0.5f, true);
            this.s = i10;
            fq0 fq0Var = new fq0(this, 12);
            this.C = fq0Var;
            AndroidUtilities.runOnUIThread(fq0Var, 150L);
        }
    }

    public final void c(int i10) {
        xi0[] xi0VarArr = this.r;
        if (xi0VarArr[i10] != null) {
            int d = i0.a.d(0.9f, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.d6, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.c9, false));
            int w02 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.e9, false);
            if (i10 != 2) {
                xi0VarArr[i10].setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
                return;
            }
            xi0VarArr[i10].O(d, "Arrow");
            xi0VarArr[i10].O(w02, "Box2");
            xi0VarArr[i10].O(w02, "Box1");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00d5  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDraw(Canvas canvas) {
        float f9;
        float f10;
        int[] iArr = this.n;
        Paint paint = this.a;
        Paint paint2 = this.c;
        aj0[] aj0VarArr = this.v;
        Paint paint3 = this.b;
        RectF rectF = this.e;
        super.onDraw(canvas);
        ky0 ky0Var = this.f;
        boolean z10 = ky0Var.getValue() == 5;
        if (z10) {
            float f11 = this.w;
            if (f11 != 1.0f) {
                float f12 = f11 + 0.053333335f;
                this.w = f12;
                if (f12 > 1.0f) {
                    this.w = 1.0f;
                } else {
                    aj0VarArr[0].invalidate();
                    aj0VarArr[1].invalidate();
                    invalidate();
                }
                int i10 = org.telegram.ui.ActionBar.g6.M6;
                paint.setColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false));
                paint2.setColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false));
                int u10 = org.telegram.ui.b.u(16.0f, AndroidUtilities.dp(21.0f) + AndroidUtilities.dp(132.0f), getMeasuredWidth());
                int dp = AndroidUtilities.dp(21.0f);
                float f13 = dp;
                float x4 = org.telegram.ui.b.x(48.0f, getMeasuredHeight(), 2);
                rectF.set(f13, x4, u10, getMeasuredHeight() - r9);
                if (this.A >= 0) {
                    this.A = iArr[ky0Var.getValue()];
                    this.x = 1.0f;
                    f9 = 1.0f;
                    this.y = i0.a.d(0.9f, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.d6, false), org.telegram.ui.ActionBar.g6.w0(null, this.A, false));
                } else {
                    f9 = 1.0f;
                    if (iArr[ky0Var.getValue()] != this.A) {
                        this.y = i0.a.d(this.x, this.y, i0.a.d(0.9f, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.d6, false), org.telegram.ui.ActionBar.g6.w0(null, this.A, false)));
                        this.x = 0.0f;
                        this.A = iArr[ky0Var.getValue()];
                    }
                }
                f10 = this.x;
                if (f10 != f9) {
                    float f14 = f10 + 0.16f;
                    this.x = f14;
                    if (f14 > f9) {
                        this.x = 1.0f;
                    } else {
                        invalidate();
                    }
                }
                int i11 = this.y;
                int i12 = org.telegram.ui.ActionBar.g6.d6;
                paint3.setColor(i0.a.d(this.x, i11, i0.a.d(0.9f, org.telegram.ui.ActionBar.g6.w0(null, i12, false), org.telegram.ui.ActionBar.g6.w0(null, this.A, false))));
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint3);
                paint3.setColor(org.telegram.ui.ActionBar.g6.w0(null, i12, false));
                paint3.setAlpha(255);
                rectF.set(f13, x4, u10 - AndroidUtilities.dp(58.0f), getMeasuredHeight() - r9);
                rectF.inset(-AndroidUtilities.dp(1.0f), -AndroidUtilities.dp(1.0f));
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint3);
                paint.setAlpha(31);
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint);
                canvas.save();
                canvas.clipRect(rectF);
                paint3.setColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false));
                paint3.setAlpha(60);
                canvas.drawCircle(rectF.left + 0.0f, rectF.centerY(), AndroidUtilities.dp(15.0f), paint3);
                float centerY = rectF.centerY() - AndroidUtilities.dp(6.0f);
                paint2.setAlpha(57);
                canvas.drawLine(rectF.left + AndroidUtilities.dp(23.0f) + 0.0f, centerY, rectF.right - AndroidUtilities.dp(68.0f), centerY, paint2);
                float centerY2 = rectF.centerY() + AndroidUtilities.dp(6.0f);
                canvas.drawLine(rectF.left + AndroidUtilities.dp(23.0f) + 0.0f, centerY2, rectF.right - AndroidUtilities.dp(23.0f), centerY2, paint2);
                canvas.restore();
            }
        }
        if (!z10) {
            float f15 = this.w;
            if (f15 != 0.0f) {
                float f16 = f15 - 0.053333335f;
                this.w = f16;
                if (f16 < 0.0f) {
                    this.w = 0.0f;
                } else {
                    aj0VarArr[0].invalidate();
                    aj0VarArr[1].invalidate();
                    invalidate();
                }
            }
        }
        int i102 = org.telegram.ui.ActionBar.g6.M6;
        paint.setColor(org.telegram.ui.ActionBar.g6.w0(null, i102, false));
        paint2.setColor(org.telegram.ui.ActionBar.g6.w0(null, i102, false));
        int u102 = org.telegram.ui.b.u(16.0f, AndroidUtilities.dp(21.0f) + AndroidUtilities.dp(132.0f), getMeasuredWidth());
        int dp2 = AndroidUtilities.dp(21.0f);
        float f132 = dp2;
        float x42 = org.telegram.ui.b.x(48.0f, getMeasuredHeight(), 2);
        rectF.set(f132, x42, u102, getMeasuredHeight() - r9);
        if (this.A >= 0) {
        }
        f10 = this.x;
        if (f10 != f9) {
        }
        int i112 = this.y;
        int i122 = org.telegram.ui.ActionBar.g6.d6;
        paint3.setColor(i0.a.d(this.x, i112, i0.a.d(0.9f, org.telegram.ui.ActionBar.g6.w0(null, i122, false), org.telegram.ui.ActionBar.g6.w0(null, this.A, false))));
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint3);
        paint3.setColor(org.telegram.ui.ActionBar.g6.w0(null, i122, false));
        paint3.setAlpha(255);
        rectF.set(f132, x42, u102 - AndroidUtilities.dp(58.0f), getMeasuredHeight() - r9);
        rectF.inset(-AndroidUtilities.dp(1.0f), -AndroidUtilities.dp(1.0f));
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint3);
        paint.setAlpha(31);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint);
        canvas.save();
        canvas.clipRect(rectF);
        paint3.setColor(org.telegram.ui.ActionBar.g6.w0(null, i102, false));
        paint3.setAlpha(60);
        canvas.drawCircle(rectF.left + 0.0f, rectF.centerY(), AndroidUtilities.dp(15.0f), paint3);
        float centerY3 = rectF.centerY() - AndroidUtilities.dp(6.0f);
        paint2.setAlpha(57);
        canvas.drawLine(rectF.left + AndroidUtilities.dp(23.0f) + 0.0f, centerY3, rectF.right - AndroidUtilities.dp(68.0f), centerY3, paint2);
        float centerY22 = rectF.centerY() + AndroidUtilities.dp(6.0f);
        canvas.drawLine(rectF.left + AndroidUtilities.dp(23.0f) + 0.0f, centerY22, rectF.right - AndroidUtilities.dp(23.0f), centerY22, paint2);
        canvas.restore();
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        ky0 ky0Var = this.f;
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (accessibilityEvent.getEventType() == 1) {
            int value = ky0Var.getValue() + 1;
            if (value > ky0Var.getMaxValue() || value < 0) {
                value = 0;
            }
            setContentDescription(this.h[value]);
            ky0Var.a(true);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        accessibilityNodeInfo.setContentDescription(this.h[this.f.getValue()]);
        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, null));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(102.0f), TLObject.FLAG_30));
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        ky0 ky0Var = this.f;
        super.setBackgroundColor(i10);
        for (int i11 = 0; i11 < this.r.length; i11++) {
            c(i11);
        }
        ky0Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.j5, false));
        ky0Var.invalidate();
    }
}
