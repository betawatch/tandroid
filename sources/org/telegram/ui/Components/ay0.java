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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class ay0 extends FrameLayout {
    public int A;
    public int B;
    public tp0 C;
    public Paint a;
    public Paint b;
    public Paint c;
    public Paint d;
    public RectF e;
    public zx0 f;
    public String[] h;
    public int[] n;
    public mi0[] r;
    public int s;
    public pi0[] v;
    public float w;
    public float x;
    public int y;

    public final mi0 a(int i9) {
        mi0[] mi0VarArr = this.r;
        if (mi0VarArr[i9] == null) {
            int i10 = i9 != 1 ? i9 != 2 ? i9 != 3 ? i9 != 4 ? i9 != 5 ? R.raw.swipe_pin : R.raw.swipe_disabled : R.raw.swipe_delete : R.raw.swipe_mute : R.raw.chats_archive : R.raw.swipe_read;
            mi0VarArr[i9] = new mi0(i10, j3.r0.l(i10, ""), AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
            c(i9);
        }
        return mi0VarArr[i9];
    }

    public final void b() {
        int value;
        pi0[] pi0VarArr = this.v;
        if (this.C == null && this.B != (value = this.f.getValue())) {
            this.B = value;
            int i9 = (this.s + 1) % 2;
            mi0 a2 = a(value);
            if (a2 != null) {
                if (pi0VarArr[i9].getVisibility() != 0) {
                    a2.L(0, false, false);
                }
                pi0VarArr[i9].setAnimation(a2);
                pi0VarArr[i9].d();
            } else {
                pi0VarArr[i9].a();
            }
            AndroidUtilities.updateViewVisibilityAnimated(pi0VarArr[this.s], false, 0.5f, true);
            AndroidUtilities.updateViewVisibilityAnimated(pi0VarArr[i9], true, 0.5f, true);
            this.s = i9;
            tp0 tp0Var = new tp0(this, 12);
            this.C = tp0Var;
            AndroidUtilities.runOnUIThread(tp0Var, 150L);
        }
    }

    public final void c(int i9) {
        mi0[] mi0VarArr = this.r;
        if (mi0VarArr[i9] != null) {
            int d = i0.a.d(0.9f, org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.d6, false), org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.c9, false));
            int w02 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.e9, false);
            if (i9 != 2) {
                mi0VarArr[i9].setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
                return;
            }
            mi0VarArr[i9].O(d, "Arrow");
            mi0VarArr[i9].O(w02, "Box2");
            mi0VarArr[i9].O(w02, "Box1");
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
        float f10;
        float f11;
        int[] iArr = this.n;
        Paint paint = this.a;
        Paint paint2 = this.c;
        pi0[] pi0VarArr = this.v;
        Paint paint3 = this.b;
        RectF rectF = this.e;
        super.onDraw(canvas);
        zx0 zx0Var = this.f;
        boolean z10 = zx0Var.getValue() == 5;
        if (z10) {
            float f12 = this.w;
            if (f12 != 1.0f) {
                float f13 = f12 + 0.053333335f;
                this.w = f13;
                if (f13 > 1.0f) {
                    this.w = 1.0f;
                } else {
                    pi0VarArr[0].invalidate();
                    pi0VarArr[1].invalidate();
                    invalidate();
                }
                int i9 = org.telegram.ui.ActionBar.f6.M6;
                paint.setColor(org.telegram.ui.ActionBar.f6.w0(null, i9, false));
                paint2.setColor(org.telegram.ui.ActionBar.f6.w0(null, i9, false));
                int w8 = org.telegram.messenger.ll.w(16.0f, AndroidUtilities.dp(21.0f) + AndroidUtilities.dp(132.0f), getMeasuredWidth());
                int dp = AndroidUtilities.dp(21.0f);
                float f14 = dp;
                float y10 = org.telegram.messenger.ll.y(48.0f, getMeasuredHeight(), 2);
                rectF.set(f14, y10, w8, getMeasuredHeight() - r9);
                if (this.A >= 0) {
                    this.A = iArr[zx0Var.getValue()];
                    this.x = 1.0f;
                    f10 = 1.0f;
                    this.y = i0.a.d(0.9f, org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.d6, false), org.telegram.ui.ActionBar.f6.w0(null, this.A, false));
                } else {
                    f10 = 1.0f;
                    if (iArr[zx0Var.getValue()] != this.A) {
                        this.y = i0.a.d(this.x, this.y, i0.a.d(0.9f, org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.d6, false), org.telegram.ui.ActionBar.f6.w0(null, this.A, false)));
                        this.x = 0.0f;
                        this.A = iArr[zx0Var.getValue()];
                    }
                }
                f11 = this.x;
                if (f11 != f10) {
                    float f15 = f11 + 0.16f;
                    this.x = f15;
                    if (f15 > f10) {
                        this.x = 1.0f;
                    } else {
                        invalidate();
                    }
                }
                int i10 = this.y;
                int i11 = org.telegram.ui.ActionBar.f6.d6;
                paint3.setColor(i0.a.d(this.x, i10, i0.a.d(0.9f, org.telegram.ui.ActionBar.f6.w0(null, i11, false), org.telegram.ui.ActionBar.f6.w0(null, this.A, false))));
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint3);
                paint3.setColor(org.telegram.ui.ActionBar.f6.w0(null, i11, false));
                paint3.setAlpha(255);
                rectF.set(f14, y10, w8 - AndroidUtilities.dp(58.0f), getMeasuredHeight() - r9);
                rectF.inset(-AndroidUtilities.dp(1.0f), -AndroidUtilities.dp(1.0f));
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint3);
                paint.setAlpha(31);
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint);
                canvas.save();
                canvas.clipRect(rectF);
                paint3.setColor(org.telegram.ui.ActionBar.f6.w0(null, i9, false));
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
            float f16 = this.w;
            if (f16 != 0.0f) {
                float f17 = f16 - 0.053333335f;
                this.w = f17;
                if (f17 < 0.0f) {
                    this.w = 0.0f;
                } else {
                    pi0VarArr[0].invalidate();
                    pi0VarArr[1].invalidate();
                    invalidate();
                }
            }
        }
        int i92 = org.telegram.ui.ActionBar.f6.M6;
        paint.setColor(org.telegram.ui.ActionBar.f6.w0(null, i92, false));
        paint2.setColor(org.telegram.ui.ActionBar.f6.w0(null, i92, false));
        int w82 = org.telegram.messenger.ll.w(16.0f, AndroidUtilities.dp(21.0f) + AndroidUtilities.dp(132.0f), getMeasuredWidth());
        int dp2 = AndroidUtilities.dp(21.0f);
        float f142 = dp2;
        float y102 = org.telegram.messenger.ll.y(48.0f, getMeasuredHeight(), 2);
        rectF.set(f142, y102, w82, getMeasuredHeight() - r9);
        if (this.A >= 0) {
        }
        f11 = this.x;
        if (f11 != f10) {
        }
        int i102 = this.y;
        int i112 = org.telegram.ui.ActionBar.f6.d6;
        paint3.setColor(i0.a.d(this.x, i102, i0.a.d(0.9f, org.telegram.ui.ActionBar.f6.w0(null, i112, false), org.telegram.ui.ActionBar.f6.w0(null, this.A, false))));
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint3);
        paint3.setColor(org.telegram.ui.ActionBar.f6.w0(null, i112, false));
        paint3.setAlpha(255);
        rectF.set(f142, y102, w82 - AndroidUtilities.dp(58.0f), getMeasuredHeight() - r9);
        rectF.inset(-AndroidUtilities.dp(1.0f), -AndroidUtilities.dp(1.0f));
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint3);
        paint.setAlpha(31);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint);
        canvas.save();
        canvas.clipRect(rectF);
        paint3.setColor(org.telegram.ui.ActionBar.f6.w0(null, i92, false));
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
        zx0 zx0Var = this.f;
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (accessibilityEvent.getEventType() == 1) {
            int value = zx0Var.getValue() + 1;
            if (value > zx0Var.getMaxValue() || value < 0) {
                value = 0;
            }
            setContentDescription(this.h[value]);
            zx0Var.a(true);
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
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(102.0f), TLObject.FLAG_30));
    }

    @Override // android.view.View
    public void setBackgroundColor(int i9) {
        zx0 zx0Var = this.f;
        super.setBackgroundColor(i9);
        for (int i10 = 0; i10 < this.r.length; i10++) {
            c(i10);
        }
        zx0Var.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.j5, false));
        zx0Var.invalidate();
    }
}
