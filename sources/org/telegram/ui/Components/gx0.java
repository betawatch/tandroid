package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class gx0 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public int E;
    public final rh0[] F;
    public float G;
    public float H;
    public int I;
    public int J;
    public int K;
    public cp0 L;
    public int a;
    public final Paint b;
    public final Paint c;
    public final Paint d;
    public final Paint e;
    public final RectF f;
    public final fx0 h;
    public final String[] n;
    public final int[] r;
    public final oh0[] s;
    public final oh0[] w;
    public final int[] x;
    public final int[] y;

    public gx0(Context context, int i7) {
        super(context);
        Paint paint = new Paint(1);
        this.b = paint;
        this.c = new Paint(1);
        Paint paint2 = new Paint(1);
        this.d = paint2;
        Paint paint3 = new Paint(1);
        this.e = paint3;
        this.f = new RectF();
        this.n = new String[]{org.telegram.messenger.gd.N0(2131744074, null), org.telegram.messenger.gd.N0(2131744073, null), org.telegram.messenger.gd.N0(2131744078, null), org.telegram.messenger.gd.N0(2131744075, null), org.telegram.messenger.gd.N0(2131744077, null), org.telegram.messenger.gd.N0(2131744076, null)};
        this.r = new int[]{r7, r7, r7, r7, org.telegram.ui.ActionBar.m6.Y5, org.telegram.ui.ActionBar.m6.d9};
        this.s = new oh0[6];
        this.w = new oh0[6];
        this.x = new int[6];
        this.y = new int[6];
        this.F = new rh0[2];
        this.H = 1.0f;
        int i10 = org.telegram.ui.ActionBar.m6.c9;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(1.0f));
        paint2.setStyle(style);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint2.setStrokeCap(cap);
        paint2.setStrokeWidth(org.telegram.messenger.g0.L(5.0f));
        paint3.setStyle(style);
        paint3.setStrokeCap(cap);
        paint3.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        fx0 fx0Var = new fx0(this, context);
        this.h = fx0Var;
        this.a = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.j5, false);
        fx0Var.setMinValue(0);
        fx0Var.setDrawDividers(false);
        boolean isEmpty = org.telegram.messenger.mp.u1(i7).Q0.isEmpty();
        fx0Var.setMaxValue(isEmpty ? 4 : 5);
        fx0Var.setAllItemsCount(!isEmpty ? 6 : 5);
        fx0Var.setWrapSelectorWheel(true);
        fx0Var.setFormatter(new ex0(this));
        fx0Var.setOnValueChangedListener(new ex0(this));
        fx0Var.setImportantForAccessibility(2);
        fx0Var.setValue(org.telegram.messenger.bz.m(i7));
        addView(fx0Var, c8.ma.d(org.telegram.messenger.ks.Q1, -1.0f, 5, 21.0f, 0.0f, 21.0f, 0.0f));
        setWillNotDraw(false);
        this.E = 0;
        for (int i11 = 0; i11 < 2; i11++) {
            this.F[i11] = new rh0(context);
            addView(this.F[i11], c8.ma.d(28, 28.0f, 21, 0.0f, 0.0f, 184.0f, 0.0f));
        }
        oh0 a10 = a(this.h.getValue());
        if (a10 != null) {
            this.F[0].setImageDrawable(a10);
            a10.M(a10.e[0] - 1);
        }
        org.telegram.messenger.g0.X3(this.F[0], true, 0.5f, true, false);
        org.telegram.messenger.g0.X3(this.F[1], false, 0.5f, true, false);
        this.G = this.h.getValue() != 5 ? 0.0f : 1.0f;
        this.K = this.h.getValue();
    }

    public final oh0 a(int i7) {
        oh0[] oh0VarArr = this.s;
        if (oh0VarArr[i7] == null) {
            oh0VarArr[i7] = new oh0(i7 != 1 ? i7 != 2 ? i7 != 3 ? i7 != 4 ? i7 != 5 ? R.raw.swipe_pin : R.raw.swipe_disabled : R.raw.swipe_delete : R.raw.swipe_mute : R.raw.chats_archive : R.raw.swipe_read, org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(28.0f), true, null);
            c(i7);
        }
        return oh0VarArr[i7];
    }

    public final void b() {
        int value;
        if (this.L == null && this.K != (value = this.h.getValue())) {
            this.K = value;
            int i7 = (this.E + 1) % 2;
            oh0 a10 = a(value);
            rh0[] rh0VarArr = this.F;
            if (a10 != null) {
                if (rh0VarArr[i7].getVisibility() != 0) {
                    a10.N(0, false, false);
                }
                rh0VarArr[i7].setAnimation(a10);
                rh0VarArr[i7].d();
            } else {
                rh0VarArr[i7].a();
            }
            org.telegram.messenger.g0.X3(rh0VarArr[this.E], false, 0.5f, true, true);
            org.telegram.messenger.g0.X3(rh0VarArr[i7], true, 0.5f, true, true);
            this.E = i7;
            cp0 cp0Var = new cp0(this, 13);
            this.L = cp0Var;
            org.telegram.messenger.g0.h3(cp0Var, 150L);
        }
    }

    public final void c(int i7) {
        oh0[] oh0VarArr = this.s;
        if (oh0VarArr[i7] != null) {
            int f10 = i0.a.f(0.9f, org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.d6, false), org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.c9, false));
            int i10 = org.telegram.ui.ActionBar.m6.e9;
            int x02 = org.telegram.ui.ActionBar.m6.x0(null, i10, false);
            oh0 oh0Var = oh0VarArr[i7];
            oh0[] oh0VarArr2 = this.w;
            oh0 oh0Var2 = oh0VarArr2[i7];
            int[] iArr = this.y;
            int[] iArr2 = this.x;
            if (oh0Var == oh0Var2 && x02 == iArr2[i7] && f10 == iArr[i7]) {
                return;
            }
            oh0VarArr2[i7] = oh0Var;
            iArr2[i7] = x02;
            iArr[i7] = f10;
            if (i7 != 2) {
                org.telegram.ui.ActionBar.t6.x(this, oh0VarArr[i7], i10, null, PorterDuff.Mode.SRC_IN);
                return;
            }
            oh0VarArr[i7].Q(f10, "Arrow");
            oh0VarArr[i7].Q(x02, "Box2");
            oh0VarArr[i7].Q(x02, "Box1");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00cd  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDraw(Canvas canvas) {
        int i7;
        float f10;
        float f11;
        super.onDraw(canvas);
        fx0 fx0Var = this.h;
        boolean z10 = fx0Var.getValue() == 5;
        rh0[] rh0VarArr = this.F;
        if (z10) {
            float f12 = this.G;
            if (f12 != 1.0f) {
                float f13 = f12 + 0.053333335f;
                this.G = f13;
                if (f13 > 1.0f) {
                    this.G = 1.0f;
                } else {
                    rh0VarArr[0].invalidate();
                    rh0VarArr[1].invalidate();
                    invalidate();
                }
                int i10 = org.telegram.ui.ActionBar.m6.M6;
                int x02 = org.telegram.ui.ActionBar.m6.x0(null, i10, false);
                Paint paint = this.b;
                paint.setColor(x02);
                int x03 = org.telegram.ui.ActionBar.m6.x0(null, i10, false);
                Paint paint2 = this.d;
                paint2.setColor(x03);
                int x10 = org.telegram.messenger.n10.x(16.0f, org.telegram.messenger.g0.L(21.0f) + org.telegram.messenger.g0.L(132.0f), getMeasuredWidth());
                int L = org.telegram.messenger.g0.L(21.0f);
                int z11 = org.telegram.messenger.n10.z(48.0f, getMeasuredHeight(), 2);
                float f14 = L;
                float f15 = z11;
                float measuredHeight = getMeasuredHeight() - z11;
                RectF rectF = this.f;
                rectF.set(f14, f15, x10, measuredHeight);
                i7 = this.J;
                int[] iArr = this.r;
                if (i7 >= 0) {
                    this.J = iArr[fx0Var.getValue()];
                    this.H = 1.0f;
                    this.I = i0.a.f(0.9f, org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.d6, false), org.telegram.ui.ActionBar.m6.x0(null, this.J, false));
                    f10 = 1.0f;
                } else {
                    f10 = 1.0f;
                    if (iArr[fx0Var.getValue()] != this.J) {
                        this.I = i0.a.f(this.H, this.I, i0.a.f(0.9f, org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.d6, false), org.telegram.ui.ActionBar.m6.x0(null, this.J, false)));
                        this.H = 0.0f;
                        this.J = iArr[fx0Var.getValue()];
                    }
                }
                f11 = this.H;
                if (f11 != f10) {
                    float f16 = f11 + 0.16f;
                    this.H = f16;
                    if (f16 > f10) {
                        this.H = f10;
                    } else {
                        invalidate();
                    }
                }
                int i11 = this.I;
                int i12 = org.telegram.ui.ActionBar.m6.d6;
                int f17 = i0.a.f(this.H, i11, i0.a.f(0.9f, org.telegram.ui.ActionBar.m6.x0(null, i12, false), org.telegram.ui.ActionBar.m6.x0(null, this.J, false)));
                Paint paint3 = this.c;
                paint3.setColor(f17);
                canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), paint3);
                paint3.setColor(org.telegram.ui.ActionBar.m6.x0(null, i12, false));
                paint3.setAlpha(org.telegram.messenger.ks.e4);
                rectF.set(f14, f15, x10 - org.telegram.messenger.g0.L(58.0f), getMeasuredHeight() - z11);
                rectF.inset(-org.telegram.messenger.g0.L(1.0f), -org.telegram.messenger.g0.L(1.0f));
                canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), paint3);
                paint.setAlpha(31);
                canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), paint);
                canvas.save();
                canvas.clipRect(rectF);
                paint3.setColor(org.telegram.ui.ActionBar.m6.x0(null, i10, false));
                paint3.setAlpha(60);
                canvas.drawCircle(rectF.left + 0.0f, rectF.centerY(), org.telegram.messenger.g0.L(15.0f), paint3);
                float centerY = rectF.centerY() - org.telegram.messenger.g0.L(6.0f);
                paint2.setAlpha(57);
                canvas.drawLine(rectF.left + org.telegram.messenger.g0.L(23.0f) + 0.0f, centerY, rectF.right - org.telegram.messenger.g0.L(68.0f), centerY, paint2);
                float centerY2 = rectF.centerY() + org.telegram.messenger.g0.L(6.0f);
                canvas.drawLine(rectF.left + org.telegram.messenger.g0.L(23.0f) + 0.0f, centerY2, rectF.right - org.telegram.messenger.g0.L(23.0f), centerY2, paint2);
                canvas.restore();
            }
        }
        if (!z10) {
            float f18 = this.G;
            if (f18 != 0.0f) {
                float f19 = f18 - 0.053333335f;
                this.G = f19;
                if (f19 < 0.0f) {
                    this.G = 0.0f;
                } else {
                    rh0VarArr[0].invalidate();
                    rh0VarArr[1].invalidate();
                    invalidate();
                }
            }
        }
        int i102 = org.telegram.ui.ActionBar.m6.M6;
        int x022 = org.telegram.ui.ActionBar.m6.x0(null, i102, false);
        Paint paint4 = this.b;
        paint4.setColor(x022);
        int x032 = org.telegram.ui.ActionBar.m6.x0(null, i102, false);
        Paint paint22 = this.d;
        paint22.setColor(x032);
        int x102 = org.telegram.messenger.n10.x(16.0f, org.telegram.messenger.g0.L(21.0f) + org.telegram.messenger.g0.L(132.0f), getMeasuredWidth());
        int L2 = org.telegram.messenger.g0.L(21.0f);
        int z112 = org.telegram.messenger.n10.z(48.0f, getMeasuredHeight(), 2);
        float f142 = L2;
        float f152 = z112;
        float measuredHeight2 = getMeasuredHeight() - z112;
        RectF rectF2 = this.f;
        rectF2.set(f142, f152, x102, measuredHeight2);
        i7 = this.J;
        int[] iArr2 = this.r;
        if (i7 >= 0) {
        }
        f11 = this.H;
        if (f11 != f10) {
        }
        int i112 = this.I;
        int i122 = org.telegram.ui.ActionBar.m6.d6;
        int f172 = i0.a.f(this.H, i112, i0.a.f(0.9f, org.telegram.ui.ActionBar.m6.x0(null, i122, false), org.telegram.ui.ActionBar.m6.x0(null, this.J, false)));
        Paint paint32 = this.c;
        paint32.setColor(f172);
        canvas.drawRoundRect(rectF2, org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), paint32);
        paint32.setColor(org.telegram.ui.ActionBar.m6.x0(null, i122, false));
        paint32.setAlpha(org.telegram.messenger.ks.e4);
        rectF2.set(f142, f152, x102 - org.telegram.messenger.g0.L(58.0f), getMeasuredHeight() - z112);
        rectF2.inset(-org.telegram.messenger.g0.L(1.0f), -org.telegram.messenger.g0.L(1.0f));
        canvas.drawRoundRect(rectF2, org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), paint32);
        paint4.setAlpha(31);
        canvas.drawRoundRect(rectF2, org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), paint4);
        canvas.save();
        canvas.clipRect(rectF2);
        paint32.setColor(org.telegram.ui.ActionBar.m6.x0(null, i102, false));
        paint32.setAlpha(60);
        canvas.drawCircle(rectF2.left + 0.0f, rectF2.centerY(), org.telegram.messenger.g0.L(15.0f), paint32);
        float centerY3 = rectF2.centerY() - org.telegram.messenger.g0.L(6.0f);
        paint22.setAlpha(57);
        canvas.drawLine(rectF2.left + org.telegram.messenger.g0.L(23.0f) + 0.0f, centerY3, rectF2.right - org.telegram.messenger.g0.L(68.0f), centerY3, paint22);
        float centerY22 = rectF2.centerY() + org.telegram.messenger.g0.L(6.0f);
        canvas.drawLine(rectF2.left + org.telegram.messenger.g0.L(23.0f) + 0.0f, centerY22, rectF2.right - org.telegram.messenger.g0.L(23.0f), centerY22, paint22);
        canvas.restore();
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (accessibilityEvent.getEventType() == 1) {
            fx0 fx0Var = this.h;
            int value = fx0Var.getValue() + 1;
            if (value > fx0Var.getMaxValue() || value < 0) {
                value = 0;
            }
            setContentDescription(this.n[value]);
            fx0Var.a(true);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        accessibilityNodeInfo.setContentDescription(this.n[this.h.getValue()]);
        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, null));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(102.0f), TLObject.FLAG_30));
    }

    @Override // android.view.View
    public void setBackgroundColor(int i7) {
        super.setBackgroundColor(i7);
        updateColors();
        int x02 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.j5, false);
        this.a = x02;
        fx0 fx0Var = this.h;
        fx0Var.setTextColor(x02);
        fx0Var.invalidate();
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        for (int i7 = 0; i7 < this.s.length; i7++) {
            c(i7);
        }
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
