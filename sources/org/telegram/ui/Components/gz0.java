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

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class gz0 extends FrameLayout {
    public int E;
    public int F;
    public yq0 G;
    public Paint a;
    public Paint b;
    public Paint c;
    public Paint d;
    public RectF e;
    public fz0 f;
    public String[] h;
    public int[] n;
    public kj0[] r;
    public int s;
    public nj0[] v;
    public float w;
    public float x;
    public int y;

    public final kj0 a(int i10) {
        kj0[] kj0VarArr = this.r;
        if (kj0VarArr[i10] == null) {
            kj0VarArr[i10] = new kj0(i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? R.raw.swipe_pin : R.raw.swipe_disabled : R.raw.swipe_delete : R.raw.swipe_mute : R.raw.chats_archive : R.raw.swipe_read, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
            c(i10);
        }
        return kj0VarArr[i10];
    }

    public final void b() {
        int value;
        nj0[] nj0VarArr = this.v;
        if (this.G == null && this.F != (value = this.f.getValue())) {
            this.F = value;
            int i10 = (this.s + 1) % 2;
            kj0 a2 = a(value);
            if (a2 != null) {
                if (nj0VarArr[i10].getVisibility() != 0) {
                    a2.N(0, false, false);
                }
                nj0VarArr[i10].setAnimation(a2);
                nj0VarArr[i10].d();
            } else {
                nj0VarArr[i10].a();
            }
            AndroidUtilities.updateViewVisibilityAnimated(nj0VarArr[this.s], false, 0.5f, true);
            AndroidUtilities.updateViewVisibilityAnimated(nj0VarArr[i10], true, 0.5f, true);
            this.s = i10;
            yq0 yq0Var = new yq0(this, 13);
            this.G = yq0Var;
            AndroidUtilities.runOnUIThread(yq0Var, 150L);
        }
    }

    public final void c(int i10) {
        kj0[] kj0VarArr = this.r;
        if (kj0VarArr[i10] != null) {
            int d = i0.a.d(0.9f, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.c9, false));
            int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.e9, false);
            if (i10 != 2) {
                kj0VarArr[i10].setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
                return;
            }
            kj0VarArr[i10].Q(d, "Arrow");
            kj0VarArr[i10].Q(w02, "Box2");
            kj0VarArr[i10].Q(w02, "Box1");
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
        float f7;
        float f10;
        int[] iArr = this.n;
        Paint paint = this.a;
        Paint paint2 = this.c;
        nj0[] nj0VarArr = this.v;
        Paint paint3 = this.b;
        RectF rectF = this.e;
        super.onDraw(canvas);
        fz0 fz0Var = this.f;
        boolean z10 = fz0Var.getValue() == 5;
        if (z10) {
            float f11 = this.w;
            if (f11 != 1.0f) {
                float f12 = f11 + 0.053333335f;
                this.w = f12;
                if (f12 > 1.0f) {
                    this.w = 1.0f;
                } else {
                    nj0VarArr[0].invalidate();
                    nj0VarArr[1].invalidate();
                    invalidate();
                }
                int i10 = org.telegram.ui.ActionBar.j6.M6;
                paint.setColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
                paint2.setColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
                int x10 = org.telegram.messenger.rk.x(16.0f, AndroidUtilities.dp(21.0f) + AndroidUtilities.dp(132.0f), getMeasuredWidth());
                int dp = AndroidUtilities.dp(21.0f);
                float f13 = dp;
                float z11 = org.telegram.messenger.rk.z(48.0f, getMeasuredHeight(), 2);
                rectF.set(f13, z11, x10, getMeasuredHeight() - r9);
                if (this.E >= 0) {
                    this.E = iArr[fz0Var.getValue()];
                    this.x = 1.0f;
                    f7 = 1.0f;
                    this.y = i0.a.d(0.9f, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false), org.telegram.ui.ActionBar.j6.w0(null, this.E, false));
                } else {
                    f7 = 1.0f;
                    if (iArr[fz0Var.getValue()] != this.E) {
                        this.y = i0.a.d(this.x, this.y, i0.a.d(0.9f, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false), org.telegram.ui.ActionBar.j6.w0(null, this.E, false)));
                        this.x = 0.0f;
                        this.E = iArr[fz0Var.getValue()];
                    }
                }
                f10 = this.x;
                if (f10 != f7) {
                    float f14 = f10 + 0.16f;
                    this.x = f14;
                    if (f14 > f7) {
                        this.x = 1.0f;
                    } else {
                        invalidate();
                    }
                }
                int i11 = this.y;
                int i12 = org.telegram.ui.ActionBar.j6.d6;
                paint3.setColor(i0.a.d(this.x, i11, i0.a.d(0.9f, org.telegram.ui.ActionBar.j6.w0(null, i12, false), org.telegram.ui.ActionBar.j6.w0(null, this.E, false))));
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint3);
                paint3.setColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
                paint3.setAlpha(255);
                rectF.set(f13, z11, x10 - AndroidUtilities.dp(58.0f), getMeasuredHeight() - r9);
                rectF.inset(-AndroidUtilities.dp(1.0f), -AndroidUtilities.dp(1.0f));
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint3);
                paint.setAlpha(31);
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint);
                canvas.save();
                canvas.clipRect(rectF);
                paint3.setColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
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
                    nj0VarArr[0].invalidate();
                    nj0VarArr[1].invalidate();
                    invalidate();
                }
            }
        }
        int i102 = org.telegram.ui.ActionBar.j6.M6;
        paint.setColor(org.telegram.ui.ActionBar.j6.w0(null, i102, false));
        paint2.setColor(org.telegram.ui.ActionBar.j6.w0(null, i102, false));
        int x102 = org.telegram.messenger.rk.x(16.0f, AndroidUtilities.dp(21.0f) + AndroidUtilities.dp(132.0f), getMeasuredWidth());
        int dp2 = AndroidUtilities.dp(21.0f);
        float f132 = dp2;
        float z112 = org.telegram.messenger.rk.z(48.0f, getMeasuredHeight(), 2);
        rectF.set(f132, z112, x102, getMeasuredHeight() - r9);
        if (this.E >= 0) {
        }
        f10 = this.x;
        if (f10 != f7) {
        }
        int i112 = this.y;
        int i122 = org.telegram.ui.ActionBar.j6.d6;
        paint3.setColor(i0.a.d(this.x, i112, i0.a.d(0.9f, org.telegram.ui.ActionBar.j6.w0(null, i122, false), org.telegram.ui.ActionBar.j6.w0(null, this.E, false))));
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint3);
        paint3.setColor(org.telegram.ui.ActionBar.j6.w0(null, i122, false));
        paint3.setAlpha(255);
        rectF.set(f132, z112, x102 - AndroidUtilities.dp(58.0f), getMeasuredHeight() - r9);
        rectF.inset(-AndroidUtilities.dp(1.0f), -AndroidUtilities.dp(1.0f));
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint3);
        paint.setAlpha(31);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint);
        canvas.save();
        canvas.clipRect(rectF);
        paint3.setColor(org.telegram.ui.ActionBar.j6.w0(null, i102, false));
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
        fz0 fz0Var = this.f;
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (accessibilityEvent.getEventType() == 1) {
            int value = fz0Var.getValue() + 1;
            if (value > fz0Var.getMaxValue() || value < 0) {
                value = 0;
            }
            setContentDescription(this.h[value]);
            fz0Var.a(true);
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
        fz0 fz0Var = this.f;
        super.setBackgroundColor(i10);
        for (int i11 = 0; i11 < this.r.length; i11++) {
            c(i11);
        }
        fz0Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.j5, false));
        fz0Var.invalidate();
    }
}
