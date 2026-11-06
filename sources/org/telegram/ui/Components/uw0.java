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

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class uw0 extends FrameLayout implements org.telegram.ui.ActionBar.a6 {
    public int D;
    public final ch0[] E;
    public float F;
    public float G;
    public int H;
    public int I;
    public int J;
    public ir0 K;
    public int a;
    public final Paint b;
    public final Paint c;
    public final Paint d;
    public final Paint e;
    public final RectF f;
    public final tw0 h;
    public final String[] n;
    public final int[] r;
    public final zg0[] s;
    public final zg0[] w;
    public final int[] x;
    public final int[] y;

    public uw0(Context context, int i7) {
        super(context);
        Paint paint = new Paint(1);
        this.b = paint;
        this.c = new Paint(1);
        Paint paint2 = new Paint(1);
        this.d = paint2;
        Paint paint3 = new Paint(1);
        this.e = paint3;
        this.f = new RectF();
        this.n = new String[]{org.telegram.messenger.hd.M0(2131744316, null), org.telegram.messenger.hd.M0(2131744315, null), org.telegram.messenger.hd.M0(2131744320, null), org.telegram.messenger.hd.M0(2131744317, null), org.telegram.messenger.hd.M0(2131744319, null), org.telegram.messenger.hd.M0(2131744318, null)};
        this.r = new int[]{r7, r7, r7, r7, org.telegram.ui.ActionBar.k6.Y5, org.telegram.ui.ActionBar.k6.d9};
        this.s = new zg0[6];
        this.w = new zg0[6];
        this.x = new int[6];
        this.y = new int[6];
        this.E = new ch0[2];
        this.G = 1.0f;
        int i10 = org.telegram.ui.ActionBar.k6.c9;
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
        tw0 tw0Var = new tw0(this, context);
        this.h = tw0Var;
        this.a = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.j5, false);
        tw0Var.setMinValue(0);
        tw0Var.setDrawDividers(false);
        boolean isEmpty = org.telegram.messenger.qp.s1(i7).P0.isEmpty();
        tw0Var.setMaxValue(isEmpty ? 4 : 5);
        tw0Var.setAllItemsCount(!isEmpty ? 6 : 5);
        tw0Var.setWrapSelectorWheel(true);
        tw0Var.setFormatter(new sw0(this));
        tw0Var.setOnValueChangedListener(new sw0(this));
        tw0Var.setImportantForAccessibility(2);
        tw0Var.setValue(org.telegram.messenger.iz.m(i7));
        addView(tw0Var, c8.ha.d(org.telegram.messenger.qs.Q1, -1.0f, 5, 21.0f, 0.0f, 21.0f, 0.0f));
        setWillNotDraw(false);
        this.D = 0;
        for (int i11 = 0; i11 < 2; i11++) {
            this.E[i11] = new ch0(context);
            addView(this.E[i11], c8.ha.d(28, 28.0f, 21, 0.0f, 0.0f, 184.0f, 0.0f));
        }
        zg0 a10 = a(this.h.getValue());
        if (a10 != null) {
            this.E[0].setImageDrawable(a10);
            a10.M(a10.e[0] - 1);
        }
        org.telegram.messenger.g0.Z3(this.E[0], true, 0.5f, true, false);
        org.telegram.messenger.g0.Z3(this.E[1], false, 0.5f, true, false);
        this.F = this.h.getValue() != 5 ? 0.0f : 1.0f;
        this.J = this.h.getValue();
    }

    public final zg0 a(int i7) {
        zg0[] zg0VarArr = this.s;
        if (zg0VarArr[i7] == null) {
            zg0VarArr[i7] = new zg0(i7 != 1 ? i7 != 2 ? i7 != 3 ? i7 != 4 ? i7 != 5 ? R.raw.swipe_pin : R.raw.swipe_disabled : R.raw.swipe_delete : R.raw.swipe_mute : R.raw.chats_archive : R.raw.swipe_read, org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(28.0f), true, null);
            c(i7);
        }
        return zg0VarArr[i7];
    }

    public final void b() {
        int value;
        if (this.K == null && this.J != (value = this.h.getValue())) {
            this.J = value;
            int i7 = (this.D + 1) % 2;
            zg0 a10 = a(value);
            ch0[] ch0VarArr = this.E;
            if (a10 != null) {
                if (ch0VarArr[i7].getVisibility() != 0) {
                    a10.N(0, false, false);
                }
                ch0VarArr[i7].setAnimation(a10);
                ch0VarArr[i7].d();
            } else {
                ch0VarArr[i7].a();
            }
            org.telegram.messenger.g0.Z3(ch0VarArr[this.D], false, 0.5f, true, true);
            org.telegram.messenger.g0.Z3(ch0VarArr[i7], true, 0.5f, true, true);
            this.D = i7;
            ir0 ir0Var = new ir0(this, 10);
            this.K = ir0Var;
            org.telegram.messenger.g0.i3(ir0Var, 150L);
        }
    }

    public final void c(int i7) {
        zg0[] zg0VarArr = this.s;
        if (zg0VarArr[i7] != null) {
            int f10 = i0.a.f(0.9f, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.d6, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.c9, false));
            int i10 = org.telegram.ui.ActionBar.k6.e9;
            int x02 = org.telegram.ui.ActionBar.k6.x0(null, i10, false);
            zg0 zg0Var = zg0VarArr[i7];
            zg0[] zg0VarArr2 = this.w;
            zg0 zg0Var2 = zg0VarArr2[i7];
            int[] iArr = this.y;
            int[] iArr2 = this.x;
            if (zg0Var == zg0Var2 && x02 == iArr2[i7] && f10 == iArr[i7]) {
                return;
            }
            zg0VarArr2[i7] = zg0Var;
            iArr2[i7] = x02;
            iArr[i7] = f10;
            if (i7 != 2) {
                org.telegram.ui.ActionBar.r6.y(this, zg0VarArr[i7], i10, null, PorterDuff.Mode.SRC_IN);
                return;
            }
            zg0VarArr[i7].Q(f10, "Arrow");
            zg0VarArr[i7].Q(x02, "Box2");
            zg0VarArr[i7].Q(x02, "Box1");
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
        tw0 tw0Var = this.h;
        boolean z9 = tw0Var.getValue() == 5;
        ch0[] ch0VarArr = this.E;
        if (z9) {
            float f12 = this.F;
            if (f12 != 1.0f) {
                float f13 = f12 + 0.053333335f;
                this.F = f13;
                if (f13 > 1.0f) {
                    this.F = 1.0f;
                } else {
                    ch0VarArr[0].invalidate();
                    ch0VarArr[1].invalidate();
                    invalidate();
                }
                int i10 = org.telegram.ui.ActionBar.k6.M6;
                int x02 = org.telegram.ui.ActionBar.k6.x0(null, i10, false);
                Paint paint = this.b;
                paint.setColor(x02);
                int x03 = org.telegram.ui.ActionBar.k6.x0(null, i10, false);
                Paint paint2 = this.d;
                paint2.setColor(x03);
                int w10 = org.telegram.messenger.camera.q.w(16.0f, org.telegram.messenger.g0.L(21.0f) + org.telegram.messenger.g0.L(132.0f), getMeasuredWidth());
                int L = org.telegram.messenger.g0.L(21.0f);
                int y10 = org.telegram.messenger.camera.q.y(48.0f, getMeasuredHeight(), 2);
                float f14 = L;
                float f15 = y10;
                float measuredHeight = getMeasuredHeight() - y10;
                RectF rectF = this.f;
                rectF.set(f14, f15, w10, measuredHeight);
                i7 = this.I;
                int[] iArr = this.r;
                if (i7 >= 0) {
                    this.I = iArr[tw0Var.getValue()];
                    this.G = 1.0f;
                    this.H = i0.a.f(0.9f, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.d6, false), org.telegram.ui.ActionBar.k6.x0(null, this.I, false));
                    f10 = 1.0f;
                } else {
                    f10 = 1.0f;
                    if (iArr[tw0Var.getValue()] != this.I) {
                        this.H = i0.a.f(this.G, this.H, i0.a.f(0.9f, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.d6, false), org.telegram.ui.ActionBar.k6.x0(null, this.I, false)));
                        this.G = 0.0f;
                        this.I = iArr[tw0Var.getValue()];
                    }
                }
                f11 = this.G;
                if (f11 != f10) {
                    float f16 = f11 + 0.16f;
                    this.G = f16;
                    if (f16 > f10) {
                        this.G = f10;
                    } else {
                        invalidate();
                    }
                }
                int i11 = this.H;
                int i12 = org.telegram.ui.ActionBar.k6.d6;
                int f17 = i0.a.f(this.G, i11, i0.a.f(0.9f, org.telegram.ui.ActionBar.k6.x0(null, i12, false), org.telegram.ui.ActionBar.k6.x0(null, this.I, false)));
                Paint paint3 = this.c;
                paint3.setColor(f17);
                canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), paint3);
                paint3.setColor(org.telegram.ui.ActionBar.k6.x0(null, i12, false));
                paint3.setAlpha(org.telegram.messenger.qs.e4);
                rectF.set(f14, f15, w10 - org.telegram.messenger.g0.L(58.0f), getMeasuredHeight() - y10);
                rectF.inset(-org.telegram.messenger.g0.L(1.0f), -org.telegram.messenger.g0.L(1.0f));
                canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), paint3);
                paint.setAlpha(31);
                canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), paint);
                canvas.save();
                canvas.clipRect(rectF);
                paint3.setColor(org.telegram.ui.ActionBar.k6.x0(null, i10, false));
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
        if (!z9) {
            float f18 = this.F;
            if (f18 != 0.0f) {
                float f19 = f18 - 0.053333335f;
                this.F = f19;
                if (f19 < 0.0f) {
                    this.F = 0.0f;
                } else {
                    ch0VarArr[0].invalidate();
                    ch0VarArr[1].invalidate();
                    invalidate();
                }
            }
        }
        int i102 = org.telegram.ui.ActionBar.k6.M6;
        int x022 = org.telegram.ui.ActionBar.k6.x0(null, i102, false);
        Paint paint4 = this.b;
        paint4.setColor(x022);
        int x032 = org.telegram.ui.ActionBar.k6.x0(null, i102, false);
        Paint paint22 = this.d;
        paint22.setColor(x032);
        int w102 = org.telegram.messenger.camera.q.w(16.0f, org.telegram.messenger.g0.L(21.0f) + org.telegram.messenger.g0.L(132.0f), getMeasuredWidth());
        int L2 = org.telegram.messenger.g0.L(21.0f);
        int y102 = org.telegram.messenger.camera.q.y(48.0f, getMeasuredHeight(), 2);
        float f142 = L2;
        float f152 = y102;
        float measuredHeight2 = getMeasuredHeight() - y102;
        RectF rectF2 = this.f;
        rectF2.set(f142, f152, w102, measuredHeight2);
        i7 = this.I;
        int[] iArr2 = this.r;
        if (i7 >= 0) {
        }
        f11 = this.G;
        if (f11 != f10) {
        }
        int i112 = this.H;
        int i122 = org.telegram.ui.ActionBar.k6.d6;
        int f172 = i0.a.f(this.G, i112, i0.a.f(0.9f, org.telegram.ui.ActionBar.k6.x0(null, i122, false), org.telegram.ui.ActionBar.k6.x0(null, this.I, false)));
        Paint paint32 = this.c;
        paint32.setColor(f172);
        canvas.drawRoundRect(rectF2, org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), paint32);
        paint32.setColor(org.telegram.ui.ActionBar.k6.x0(null, i122, false));
        paint32.setAlpha(org.telegram.messenger.qs.e4);
        rectF2.set(f142, f152, w102 - org.telegram.messenger.g0.L(58.0f), getMeasuredHeight() - y102);
        rectF2.inset(-org.telegram.messenger.g0.L(1.0f), -org.telegram.messenger.g0.L(1.0f));
        canvas.drawRoundRect(rectF2, org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), paint32);
        paint4.setAlpha(31);
        canvas.drawRoundRect(rectF2, org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), paint4);
        canvas.save();
        canvas.clipRect(rectF2);
        paint32.setColor(org.telegram.ui.ActionBar.k6.x0(null, i102, false));
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
            tw0 tw0Var = this.h;
            int value = tw0Var.getValue() + 1;
            if (value > tw0Var.getMaxValue() || value < 0) {
                value = 0;
            }
            setContentDescription(this.n[value]);
            tw0Var.a(true);
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
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.j5, false);
        this.a = x02;
        tw0 tw0Var = this.h;
        tw0Var.setTextColor(x02);
        tw0Var.invalidate();
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final void updateColors() {
        for (int i7 = 0; i7 < this.s.length; i7++) {
            c(i7);
        }
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
