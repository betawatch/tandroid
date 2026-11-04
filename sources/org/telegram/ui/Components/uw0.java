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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class uw0 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public int E;
    public final fh0[] F;
    public float G;
    public float H;
    public int I;
    public int J;
    public int K;
    public sp0 L;
    public int a;
    public final Paint b;
    public final Paint c;
    public final Paint d;
    public final Paint e;
    public final RectF f;
    public final tw0 h;
    public final String[] n;
    public final int[] r;
    public final ch0[] s;
    public final ch0[] w;
    public final int[] x;
    public final int[] y;

    public uw0(Context context, int i3) {
        super(context);
        Paint paint = new Paint(1);
        this.b = paint;
        this.c = new Paint(1);
        Paint paint2 = new Paint(1);
        this.d = paint2;
        Paint paint3 = new Paint(1);
        this.e = paint3;
        this.f = new RectF();
        this.n = new String[]{org.telegram.messenger.bd.M0(2131744325, null), org.telegram.messenger.bd.M0(2131744324, null), org.telegram.messenger.bd.M0(2131744329, null), org.telegram.messenger.bd.M0(2131744326, null), org.telegram.messenger.bd.M0(2131744328, null), org.telegram.messenger.bd.M0(2131744327, null)};
        this.r = new int[]{r7, r7, r7, r7, org.telegram.ui.ActionBar.k6.Y5, org.telegram.ui.ActionBar.k6.d9};
        this.s = new ch0[6];
        this.w = new ch0[6];
        this.x = new int[6];
        this.y = new int[6];
        this.F = new fh0[2];
        this.H = 1.0f;
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
        boolean isEmpty = org.telegram.messenger.hp.s1(i3).Q0.isEmpty();
        tw0Var.setMaxValue(isEmpty ? 4 : 5);
        tw0Var.setAllItemsCount(!isEmpty ? 6 : 5);
        tw0Var.setWrapSelectorWheel(true);
        tw0Var.setFormatter(new sw0(this));
        tw0Var.setOnValueChangedListener(new sw0(this));
        tw0Var.setImportantForAccessibility(2);
        tw0Var.setValue(org.telegram.messenger.az.m(i3));
        addView(tw0Var, b8.mf.d(org.telegram.messenger.hs.Q1, -1.0f, 5, 21.0f, 0.0f, 21.0f, 0.0f));
        setWillNotDraw(false);
        this.E = 0;
        for (int i11 = 0; i11 < 2; i11++) {
            this.F[i11] = new fh0(context);
            addView(this.F[i11], b8.mf.d(28, 28.0f, 21, 0.0f, 0.0f, 184.0f, 0.0f));
        }
        ch0 a10 = a(this.h.getValue());
        if (a10 != null) {
            this.F[0].setImageDrawable(a10);
            a10.M(a10.e[0] - 1);
        }
        org.telegram.messenger.g0.Z3(this.F[0], true, 0.5f, true, false);
        org.telegram.messenger.g0.Z3(this.F[1], false, 0.5f, true, false);
        this.G = this.h.getValue() != 5 ? 0.0f : 1.0f;
        this.K = this.h.getValue();
    }

    public final ch0 a(int i3) {
        ch0[] ch0VarArr = this.s;
        if (ch0VarArr[i3] == null) {
            ch0VarArr[i3] = new ch0(i3 != 1 ? i3 != 2 ? i3 != 3 ? i3 != 4 ? i3 != 5 ? R.raw.swipe_pin : R.raw.swipe_disabled : R.raw.swipe_delete : R.raw.swipe_mute : R.raw.chats_archive : R.raw.swipe_read, org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(28.0f), true, null);
            c(i3);
        }
        return ch0VarArr[i3];
    }

    public final void b() {
        int value;
        if (this.L == null && this.K != (value = this.h.getValue())) {
            this.K = value;
            int i3 = (this.E + 1) % 2;
            ch0 a10 = a(value);
            fh0[] fh0VarArr = this.F;
            if (a10 != null) {
                if (fh0VarArr[i3].getVisibility() != 0) {
                    a10.N(0, false, false);
                }
                fh0VarArr[i3].setAnimation(a10);
                fh0VarArr[i3].d();
            } else {
                fh0VarArr[i3].a();
            }
            org.telegram.messenger.g0.Z3(fh0VarArr[this.E], false, 0.5f, true, true);
            org.telegram.messenger.g0.Z3(fh0VarArr[i3], true, 0.5f, true, true);
            this.E = i3;
            sp0 sp0Var = new sp0(this, 12);
            this.L = sp0Var;
            org.telegram.messenger.g0.i3(sp0Var, 150L);
        }
    }

    public final void c(int i3) {
        ch0[] ch0VarArr = this.s;
        if (ch0VarArr[i3] != null) {
            int f10 = i0.a.f(0.9f, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.d6, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.c9, false));
            int i10 = org.telegram.ui.ActionBar.k6.e9;
            int x02 = org.telegram.ui.ActionBar.k6.x0(null, i10, false);
            ch0 ch0Var = ch0VarArr[i3];
            ch0[] ch0VarArr2 = this.w;
            ch0 ch0Var2 = ch0VarArr2[i3];
            int[] iArr = this.y;
            int[] iArr2 = this.x;
            if (ch0Var == ch0Var2 && x02 == iArr2[i3] && f10 == iArr[i3]) {
                return;
            }
            ch0VarArr2[i3] = ch0Var;
            iArr2[i3] = x02;
            iArr[i3] = f10;
            if (i3 != 2) {
                org.telegram.ui.ActionBar.r6.y(this, ch0VarArr[i3], i10, null, PorterDuff.Mode.SRC_IN);
                return;
            }
            ch0VarArr[i3].Q(f10, "Arrow");
            ch0VarArr[i3].Q(x02, "Box2");
            ch0VarArr[i3].Q(x02, "Box1");
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
        int i3;
        float f10;
        float f11;
        super.onDraw(canvas);
        tw0 tw0Var = this.h;
        boolean z10 = tw0Var.getValue() == 5;
        fh0[] fh0VarArr = this.F;
        if (z10) {
            float f12 = this.G;
            if (f12 != 1.0f) {
                float f13 = f12 + 0.053333335f;
                this.G = f13;
                if (f13 > 1.0f) {
                    this.G = 1.0f;
                } else {
                    fh0VarArr[0].invalidate();
                    fh0VarArr[1].invalidate();
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
                int y9 = org.telegram.messenger.camera.q.y(48.0f, getMeasuredHeight(), 2);
                float f14 = L;
                float f15 = y9;
                float measuredHeight = getMeasuredHeight() - y9;
                RectF rectF = this.f;
                rectF.set(f14, f15, w10, measuredHeight);
                i3 = this.J;
                int[] iArr = this.r;
                if (i3 >= 0) {
                    this.J = iArr[tw0Var.getValue()];
                    this.H = 1.0f;
                    this.I = i0.a.f(0.9f, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.d6, false), org.telegram.ui.ActionBar.k6.x0(null, this.J, false));
                    f10 = 1.0f;
                } else {
                    f10 = 1.0f;
                    if (iArr[tw0Var.getValue()] != this.J) {
                        this.I = i0.a.f(this.H, this.I, i0.a.f(0.9f, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.d6, false), org.telegram.ui.ActionBar.k6.x0(null, this.J, false)));
                        this.H = 0.0f;
                        this.J = iArr[tw0Var.getValue()];
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
                int i12 = org.telegram.ui.ActionBar.k6.d6;
                int f17 = i0.a.f(this.H, i11, i0.a.f(0.9f, org.telegram.ui.ActionBar.k6.x0(null, i12, false), org.telegram.ui.ActionBar.k6.x0(null, this.J, false)));
                Paint paint3 = this.c;
                paint3.setColor(f17);
                canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), paint3);
                paint3.setColor(org.telegram.ui.ActionBar.k6.x0(null, i12, false));
                paint3.setAlpha(org.telegram.messenger.hs.e4);
                rectF.set(f14, f15, w10 - org.telegram.messenger.g0.L(58.0f), getMeasuredHeight() - y9);
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
        if (!z10) {
            float f18 = this.G;
            if (f18 != 0.0f) {
                float f19 = f18 - 0.053333335f;
                this.G = f19;
                if (f19 < 0.0f) {
                    this.G = 0.0f;
                } else {
                    fh0VarArr[0].invalidate();
                    fh0VarArr[1].invalidate();
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
        int y92 = org.telegram.messenger.camera.q.y(48.0f, getMeasuredHeight(), 2);
        float f142 = L2;
        float f152 = y92;
        float measuredHeight2 = getMeasuredHeight() - y92;
        RectF rectF2 = this.f;
        rectF2.set(f142, f152, w102, measuredHeight2);
        i3 = this.J;
        int[] iArr2 = this.r;
        if (i3 >= 0) {
        }
        f11 = this.H;
        if (f11 != f10) {
        }
        int i112 = this.I;
        int i122 = org.telegram.ui.ActionBar.k6.d6;
        int f172 = i0.a.f(this.H, i112, i0.a.f(0.9f, org.telegram.ui.ActionBar.k6.x0(null, i122, false), org.telegram.ui.ActionBar.k6.x0(null, this.J, false)));
        Paint paint32 = this.c;
        paint32.setColor(f172);
        canvas.drawRoundRect(rectF2, org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), paint32);
        paint32.setColor(org.telegram.ui.ActionBar.k6.x0(null, i122, false));
        paint32.setAlpha(org.telegram.messenger.hs.e4);
        rectF2.set(f142, f152, w102 - org.telegram.messenger.g0.L(58.0f), getMeasuredHeight() - y92);
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
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(102.0f), TLObject.FLAG_30));
    }

    @Override // android.view.View
    public void setBackgroundColor(int i3) {
        super.setBackgroundColor(i3);
        updateColors();
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.j5, false);
        this.a = x02;
        tw0 tw0Var = this.h;
        tw0Var.setTextColor(x02);
        tw0Var.invalidate();
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        for (int i3 = 0; i3 < this.s.length; i3++) {
            c(i3);
        }
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
